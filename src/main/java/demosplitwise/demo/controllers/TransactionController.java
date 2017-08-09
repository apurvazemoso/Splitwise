package demosplitwise.demo.controllers;

import demosplitwise.demo.domain.UserTransaction;
import demosplitwise.demo.repositories.UserTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demosplitwise.demo.domain.Transactions;
import demosplitwise.demo.repositories.TransRepository;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class TransactionController {
    @Autowired
    TransRepository transRepository;

   @Autowired
   UserTransactionRepository userTransactionRepository;

    @RequestMapping("/transactions/save")
    public void process(@RequestBody Transactions transactions ){
        transRepository.save(transactions);
        List<Long> newList = transactions.lender;
        newList.addAll(transactions.borrower);
        for(long id:transactions.borrower){
            userTransactionRepository.save(new UserTransaction(transactions.getTransID(),id,
                    transactions.getAmount()/newList.size()));
        }

        for(long id:transactions.lender){
            userTransactionRepository.save(new UserTransaction(transactions.getTransID(),id,
                    (transactions.getAmount()/(transactions.lender.size()+newList.size()))-
                            (transactions.getAmount()/newList.size())));
        }
    }


    @RequestMapping("/transactions/findall")
    public String findAll(){
        String result = "<html>";

        for(Transactions trans : transRepository.findAll()){
            result += "<div>" + trans.toString() + "</div>";
        }

        return result + "</html>";
    }

    @RequestMapping("/findbyid")
    public String findById(@RequestParam("id") long id){
        String result = "";
        result = transRepository.findOne(id).toString();
        return result;
    }

    @RequestMapping("/findbydate")
    public String fetchDataByLastName(@RequestParam("dot") Date dot){
        String result = "<html>";

        for(Transactions trans: transRepository.findByDot(dot)){
            result += "<div>" + trans.toString() + "</div>";
        }

        return result + "</html>";
    }

}
