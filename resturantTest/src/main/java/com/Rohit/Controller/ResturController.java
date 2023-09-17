package com.Rohit.Controller;

import com.Rohit.Entity.Resturant;
import com.Rohit.Service.ResturService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

@RestController
public class ResturController {

    @Autowired
    ResturService resturService;

    //get resturant by id
    @GetMapping("resturant/id/{id}")
    public List<Resturant> getResturant(@PathVariable Integer id){
        return resturService.getResturant(id);
    }
    //adding one resturant
    @PostMapping("resturant")
    public String addRestur(@RequestBody Resturant resto){
        return resturService.addRestu(resto);
    }
    //updating details like speciality
    @PutMapping("resturant/id/{id}")
    public String updateRestu(@PathVariable Integer id,@RequestParam String specl){
        return resturService.updateResto(id,specl);
    }
    //getting all resturants ..
    @GetMapping("resturants")
    public List<Resturant> getAllResto(){
        return resturService.getAllRestur();
    }
    //adding all resturants
    @PostMapping("resturants/id")
    public String addRestos(@RequestBody List<Resturant> mylist) {
        return resturService.addAllRestu(mylist);

    }

    //Deleting resturant by id
    @DeleteMapping("resturant/id")
    public List<Resturant> deleteRestu(@RequestParam Integer id){
        return resturService.deleteRest(id);
    }

}
