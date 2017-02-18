package com.mtnhub.service;

import com.mtnhub.model.Activity;
import com.mtnhub.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Created by tlwheele on 2/17/2017.
 */
@Service
public class ActivityService {

    @Autowired
    private ActivityRepository activityRepository;


   //methods for Photo
    public List<Activity> retrieveActivitiesForPhoto(){

        List<Activity> activityList = activityRepository.findByTrackIdIsNull();

        return activityList;
    }

    public List<Activity> retrieveActivitiesForPhotoByActionType(Integer actionId, Integer photoId){
        List<Activity> activityList =  activityRepository.findByActionIdAndPhotoId(actionId, photoId);
        return  activityList;
    }

    public List<Activity> retrieveActivitiesForPhotoById(Integer photoId) {
        List<Activity> activityList =  activityRepository.findByPhotoId(photoId);
        return  activityList;
    }

    public List<Activity> retrieveActivitiesForPhotoByActionTypeSinceDate(Integer actionId, Integer photoId, String date){
        //convert string to sql date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);
        Date actionDate = Date.valueOf(localDate);
        List<Activity> activityList = activityRepository.findAllByActionIdAndPhotoIdAndActionDateAfter(actionId,photoId,actionDate);
        return activityList;
    }



    //methods for Track
    public List<Activity> retrieveActivitiesForTrack() {
        List<Activity> activityList = activityRepository.findByPhotoIdIsNull();

        return activityList;
    }


    public List<Activity> retrieveActivitiesForTrackByActionType(Integer actionId, Integer trackId) {
        List<Activity> activityList =  activityRepository.findByActionIdAndTrackId(actionId, trackId);
        return  activityList;
    }

    public List<Activity> retrieveActivitiesForTrackById(Integer trackId) {
        List<Activity> activityList =  activityRepository.findByTrackId(trackId);
        return  activityList;
    }

    public List<Activity> retrieveActivitiesForTrackByActionTypeSinceDate(Integer actionId, Integer trackId, String date) {
        //convert string to sql date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);
        Date actionDate = Date.valueOf(localDate);
        List<Activity> activityList = activityRepository.findAllByActionIdAndTrackIdAndActionDateAfter(actionId,trackId,actionDate);
        return activityList;
    }


    // after the software was release and not in the future.
    public static final boolean validTimestamp(String dateToValidate)  {
        if(dateToValidate == null){
            return false;
        }
        //TODO: add logic to validate passed in date is an actual unix timestamp date and check for timezone.
        return true;
    }
}
