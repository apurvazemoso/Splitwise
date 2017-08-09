package demosplitwise.demo.controllers;

import demosplitwise.demo.domain.User;
import demosplitwise.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepo;

    @RequestMapping(value="/save",method = RequestMethod.POST)
    public void process(@RequestBody User user){
        userRepo.save(user);
    }


}
