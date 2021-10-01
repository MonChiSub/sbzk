package com.softwareinstitute.filmLibrary.controller;

import com.google.gson.Gson;
import com.softwareinstitute.filmLibrary.zookeeper.Penguin;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/penguin")
public class PenguinController {
    private List<Penguin> penguinList = new ArrayList<>();

    public PenguinController() {
        this.penguinList.add(new Penguin("Bert","Fairy Penguin", 4));
        this.penguinList.add(new Penguin());
    }

    public List<Penguin> getPenguinList() {
        return this.penguinList;
    }

    @RequestMapping(path="/", method=RequestMethod.POST)
    public String toString() {
        String json = new Gson().toJson(penguinList);
        return json;
    }

    @RequestMapping(path="/get/{string}", method= RequestMethod.GET)
    public String getPenguin(@PathVariable String pName) {
        String json = new Gson().toJson(penguinList);
        return json;
    }
}
