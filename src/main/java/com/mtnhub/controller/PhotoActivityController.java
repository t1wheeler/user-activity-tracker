package com.mtnhub.controller;

import com.mtnhub.controller.exception.BadRequestException;
import com.mtnhub.model.Activity;
import com.mtnhub.model.Photo;
import com.mtnhub.service.ActivityService;
import com.mtnhub.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by tlwheele on 2/16/2017.
 * This is the controller to get the action activities for photos.
 */
@RestController
@RequestMapping(value = "user-activity-tracker/photo/")
public class PhotoActivityController {

    @Autowired
    private PhotoService photoService;

    @Autowired
    private ActivityService activityService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity retrievePhotos() {
        List<Photo> photos = photoService.retrievePhotos();
        return ResponseEntity.ok(photos);
    }

    @RequestMapping(value = "/activity", method = RequestMethod.GET)
    public ResponseEntity retrieveAllPhotoActivity() {
        List<Activity> activities = activityService.retrieveActivitiesForPhoto();
        return ResponseEntity.ok(activities);
    }

    @RequestMapping(value = "/activity/photo", method = RequestMethod.GET)
    public ResponseEntity retrieveAllPhotoActivityByActionType(@RequestParam Integer photoId) {
        List<Activity> activities = activityService.retrieveActivitiesForPhotoById(photoId);
        return ResponseEntity.ok(activities);
    }

    @RequestMapping(value = "/activity/type", method = RequestMethod.GET)
    public ResponseEntity retrieveAllActivityForPhotoByActionType(@RequestParam Integer photoId, @RequestParam Integer actionId) {
        List<Activity> activities =  activityService.retrieveActivitiesForPhotoByActionType(actionId, photoId);
        return ResponseEntity.ok(activities);
    }

    @RequestMapping(value = "/activity/type/since", method = RequestMethod.GET)
    public ResponseEntity retrieveAllActivityForPhotoByActionSinceDate(@RequestParam Integer photoId,
                                                                       @RequestParam Integer actionId,
                                                                       @RequestParam Long unixDate) {

        //validate that unixDate is a valid UnixTimestamp
        if (activityService.validTimestamp(String.valueOf(unixDate))) {

            String date = new SimpleDateFormat("MM/dd/yyyy").format(new Date(unixDate * 1000L));

            List<Activity> activities = activityService.retrieveActivitiesForPhotoByActionTypeSinceDate(actionId, photoId, date);
            return ResponseEntity.ok(activities);
        }else{
            throw new BadRequestException("Invalid Date format");
        }
    }
}
