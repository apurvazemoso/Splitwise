package demosplitwise.demo.controllers;

import demosplitwise.demo.domain.Group;
import demosplitwise.demo.repositories.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GroupController {

    @Autowired
    GroupRepository groupRepo;

    @RequestMapping(value = "/group/save", method = RequestMethod.POST)
    public void register(@RequestBody Group group){
        groupRepo.save(group);
    }

    @RequestMapping(value="/group/update",method = RequestMethod.PUT)
    public void update(@RequestBody Group group){
        groupRepo.save(group);
    }

    @RequestMapping(value = "/group/findall", method = RequestMethod.GET)
    public String findAll(){
        String result = "<html>";

        for(Group group : groupRepo.findAll()){
            result += "<div>" + group.toString() + "</div>";
        }

        return result + "</html>";
    }

    @RequestMapping(value="/group/findbyid")
    public String findById(@RequestParam("id")long id){
        String result = " ";
        result = groupRepo.findOne(id).toString();
        return result;
    }

    @RequestMapping(value="/group/findbygroupname")
    public String findByGroupName(@RequestParam("name")String groupName){
        String result = "<html>";

        for(Group group: groupRepo.findByGroupName(groupName)){
            result += "<div>" + group.toString() + "</div>";
        }

        return result + "</html>";
    }

    @RequestMapping(value="/group/findbycreatorname")
    public String findByCreatorName(@RequestParam("name")String creatorName){
        String result = "<html>";

        for(Group group: groupRepo.findByCreatedBy(creatorName)){
            result += "<div>" + group.toString() + "</div>";
        }

        return result + "</html>";
    }
}
