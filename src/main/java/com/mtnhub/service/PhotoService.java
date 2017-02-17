package com.mtnhub.service;

import com.mtnhub.model.Photo;
import com.mtnhub.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tlwheele on 2/17/2017.
 */
@Service
public class PhotoService {

    @Autowired
    private PhotoRepository photoRepository;


    public List<Photo> retrievePhotos(){
        List<Photo> actionNameList = photoRepository.findAll();
        return actionNameList;
    }
}
