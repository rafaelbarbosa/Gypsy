package com.gypsy.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: NB18058
 * Date: 21-07-2012
 * Time: 14:56
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Parent {

    @Id
    private Long id;

    private String name;

    @OneToMany(mappedBy = "parent")
    List<Child> children = new LinkedList<Child>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }
}
