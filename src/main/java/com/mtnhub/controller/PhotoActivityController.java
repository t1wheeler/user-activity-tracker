package com.mtnhub.controller;

import com.mtnhub.model.Action;
import com.mtnhub.service.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by tlwheele on 2/16/2017.
 */
@RestController
@RequestMapping("/photos")
public class PhotoActivityController {

    @Autowired
    private ActionService actionService;

    @RequestMapping(value = "/actions", method = RequestMethod.GET)
    public List<Action> retrieveActions(){
        return actionService.retrieveActionNames();
    }
}
