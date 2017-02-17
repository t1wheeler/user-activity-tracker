package com.mtnhub.controller;

import com.mtnhub.model.Activity;
import com.mtnhub.model.Photo;
import com.mtnhub.service.ActivityService;
import com.mtnhub.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by tlwheele on 2/16/2017.
 */
@RestController
@RequestMapping(value = "user-activity-tracker/photo/")
public class PhotoActivityController {

    @Autowired
    private PhotoService photoService;

    @Autowired
    private ActivityService activityService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Photo> retrievePhotos(){
        return photoService.retrievePhotos();
    }

    @RequestMapping(value = "/activity", method = RequestMethod.GET)
    public List<Activity> retrieveAllPhotoActivity(){
        return activityService.retrieveActivitiesForPhoto();
    }

    @RequestMapping(value = "/activity/photo", method = RequestMethod.GET)
    public List<Activity> retrieveAllPhotoActivityByActionType(@RequestParam Integer photoId){
        return activityService.retrieveActivitiesForPhotoById(photoId);
    }

    @RequestMapping(value = "/activity/type", method = RequestMethod.GET)
    public List<Activity> retrieveAllActivityForPhotoByActionType(@RequestParam String photo, @RequestParam String action){

        Integer photoId = Integer.valueOf(photo);
        Integer actionId = Integer.valueOf(action);

        return activityService.retrieveActivitiesForPhotoByActionType(actionId, photoId);
    }

    @RequestMapping(value = "/activity/type/since", method = RequestMethod.GET)
        public List<Activity> retrieveAllActivityForPhotoByActionSinceDate(@RequestParam Integer photoId,
                                                                           @RequestParam Integer actionId,
                                                                           @RequestParam String date){
        return activityService.retrieveActivitiesForPhotoByActionTypeSinceDate(actionId, photoId,date);

        }

}
