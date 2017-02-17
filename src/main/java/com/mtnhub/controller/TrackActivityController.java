package com.mtnhub.controller;

import com.mtnhub.model.Activity;
import com.mtnhub.model.Track;
import com.mtnhub.service.ActivityService;
import com.mtnhub.service.TrackService;
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
@RequestMapping(value = "user-activity-tracker/track/")
public class TrackActivityController {

    @Autowired
    private ActivityService activityService;

    @Autowired
    private TrackService trackService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Track> retrievePhotos(){
        return trackService.retrieveTracks();
    }

    @RequestMapping(value = "/activity", method = RequestMethod.GET)
    public List<Activity> retrieveAllTrackActivity(){
        return activityService.retrieveActivitiesForTrack();
    }

    @RequestMapping(value = "/activity/track", method = RequestMethod.GET)
    public List<Activity> retrieveAllTrackActivityByActionType(@RequestParam Integer trackId){
        return activityService.retrieveActivitiesForTrackById(trackId);
    }

    @RequestMapping(value = "/activity/type", method = RequestMethod.GET)
    public List<Activity> retrieveAllActivityForTrackByActionType(@RequestParam Integer trackId, @RequestParam Integer actionId){
           return activityService.retrieveActivitiesForTrackByActionType(actionId, trackId);
    }

    @RequestMapping(value = "/activity/type/since", method = RequestMethod.GET)
    public List<Activity> retrieveAllActivityForTrackByActionSinceDate(@RequestParam Integer trackId,
                                                                       @RequestParam Integer actionId,
                                                                       @RequestParam String date){
        return activityService.retrieveActivitiesForTrackByActionTypeSinceDate(actionId,trackId,date);

    }

}
