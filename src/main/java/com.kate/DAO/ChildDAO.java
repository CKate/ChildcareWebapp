package com.kate.DAO;

import com.kate.Entity.Child;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by pochi_000 on 19/10/2016.
 */

@Repository
@Transactional
public class ChildDAO {

    private static Map<Integer, Child> children;


    static {
        children = new HashMap<Integer, Child>(){
            {
                put(1, new Child("Kate", "Samson"));
                put(2, new Child("Jr", "Samson"));
                put(3, new Child("Justin", "Samson"));
            }
        };
    }

    public Collection<Child> getAllChildren(){
        return this.children.values();
    }

    public Child getChildById(int id)
    {
        return children.get(id);
    }

    public Child addChild(String fname, String lastName)
    {
        Child child = new Child( fname, lastName);
        return child;
    }
}
