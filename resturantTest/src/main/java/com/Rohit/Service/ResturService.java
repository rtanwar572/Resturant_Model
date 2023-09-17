package com.Rohit.Service;

import com.Rohit.Entity.Resturant;
import com.Rohit.Repo.ResturRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Component
public class ResturService {
    @Autowired
    ResturRepo resturRepo;

    public String addRestu(Resturant resto) {
        resturRepo.getArrList().add(resto);
        return "Added";
    }


    public List<Resturant> deleteRest(Integer id) {
            for (int i = 0; i < resturRepo.getArrList().size(); i++) {
                if (id.equals(resturRepo.getArrList().get(i).getResId())){
                    resturRepo.getArrList().remove(resturRepo.getArrList().get(i));
                    break;
                }
            }
        return resturRepo.getArrList();

    }

    public String addAllRestu(List<Resturant> mylist) {
        resturRepo.getArrList().addAll(mylist);
        return mylist.size()+" Were Added !!";
    }

    public List<Resturant> getAllRestur() {
        return resturRepo.getArrList();
    }

    public List<Resturant> getResturant(Integer id) {
        List<Resturant> result=new ArrayList<>();
        for (Resturant rest:resturRepo.getArrList()) {
            if (id.equals(rest.getResId())){
                result.add(rest);
            }
        }
        return result;
    }

    public String updateResto(Integer id, String specl) {
        for (Resturant rest:resturRepo.getArrList()) {
            if(id.equals(rest.getResId())){
                rest.setResSpecial(specl);
                return "Updated Successfully !!";
            }
        }
        return "Invalid Id";
    }
}
