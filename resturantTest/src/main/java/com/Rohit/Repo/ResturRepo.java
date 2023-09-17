package com.Rohit.Repo;

import com.Rohit.Entity.Resturant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ResturRepo {

    @Autowired
    private List<Resturant> arrList;

    public List<Resturant> getArrList() {
        return arrList;
    }

    public void setArrList(List<Resturant> arrList) {
        this.arrList = arrList;
    }
}
