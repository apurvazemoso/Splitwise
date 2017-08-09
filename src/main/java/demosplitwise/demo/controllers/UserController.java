package demosplitwise.demo.controllers;

import demosplitwise.demo.domain.User;
import demosplitwise.demo.repositories.UserGroupRepository;
import demosplitwise.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class UserController {
    @Autowired
    UserRepository repository;

    @Autowired
    UserGroupRepository userGroupRepository;

    @ResponseBody
    @RequestMapping(value ="/save", method= RequestMethod.POST)
    public String process( @RequestBody User user){
        repository.save(user);
        return "done" ;
    }

    @ResponseBody
    @RequestMapping(value = "/update", method= RequestMethod.POST)
    public String update(@RequestBody User user){
        repository.save(user);
        return "done";
    }

    @RequestMapping(value = "/findall", method= RequestMethod.GET)
    public List<String> findAll(){
        List<String> results = new ArrayList<>();

        for(User user : repository.findAll()){
            results.add(user.toString());
        }

        return results ;
    }

    @RequestMapping(value = "/findbyid", method= RequestMethod.GET)
    public String findById(@RequestParam("id") long id){
        String result = "";
        result = repository.findOne(id).toString();
        return result;
    }

    @RequestMapping(value="/deleteall", method = RequestMethod.DELETE)
    public String deleteall(){
        repository.deleteAll();
        return "Deleted all";
    }

}
