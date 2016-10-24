package com.kate.Service;

import com.kate.DAO.ChildDAO;
import com.kate.Entity.Child;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by pochi_000 on 19/10/2016.
 */

@Service
public class ChildrenService {

    @Autowired
    private ChildDAO childDAO;

    public Collection<Child> getAllChildren(){
        return this.childDAO.getAllChildren();
    }

    public Child getChildById(int id)
    {
        return childDAO.getChildById(id);
    }

    public Child addChild(String fname, String lastName)
    {
       return childDAO.addChild(fname, lastName);
    }
}
