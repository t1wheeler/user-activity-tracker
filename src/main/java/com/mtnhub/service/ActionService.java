package com.mtnhub.service;

import com.mtnhub.model.Action;
import com.mtnhub.repository.ActionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tlwheele on 2/16/2017.
 */
@Service
public class ActionService {

    @Autowired
    private ActionRepository actionRepository;


    public List<Action> retrieveActionNames(){
        List<Action> actionNameList = actionRepository.findAll();
        return actionNameList;
    }
}
