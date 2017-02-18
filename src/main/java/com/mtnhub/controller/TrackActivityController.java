package com.mtnhub.controller;

import com.mtnhub.controller.exception.BadRequestException;
import com.mtnhub.model.Activity;
import com.mtnhub.model.Track;
import com.mtnhub.service.ActivityService;
import com.mtnhub.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by tlwheele on 2/16/2017.
 * This is the controller to get the action activities for tracks.
 */

@RestController
@RequestMapping(value = "user-activity-tracker/track/")
public class TrackActivityController {

    @Autowired
    private ActivityService activityService;

    @Autowired
    private TrackService trackService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity retrievePhotos(){
        List<Track> tracks = trackService.retrieveTracks();
        return ResponseEntity.ok(tracks);
    }

    @RequestMapping(value = "/activity", method = RequestMethod.GET)
    public ResponseEntity retrieveAllTrackActivity(){
        List<Activity> activities =  activityService.retrieveActivitiesForTrack();
        return ResponseEntity.ok(activities);
    }

    @RequestMapping(value = "/activity/track", method = RequestMethod.GET)
    public ResponseEntity retrieveAllTrackActivityByActionType(@RequestParam Integer trackId){
        List<Activity> activities = activityService.retrieveActivitiesForTrackById(trackId);
        return ResponseEntity.ok(activities);
    }

    @RequestMapping(value = "/activity/type", method = RequestMethod.GET)
    public ResponseEntity retrieveAllActivityForTrackByActionType(@RequestParam Integer trackId, @RequestParam Integer actionId){
        List<Activity> activities = activityService.retrieveActivitiesForTrackByActionType(actionId, trackId);
        return ResponseEntity.ok(activities);
    }

    @RequestMapping(value = "/activity/type/since", method = RequestMethod.GET)
    public ResponseEntity retrieveAllActivityForTrackByActionSinceDate(@RequestParam Integer trackId,
                                                                       @RequestParam Integer actionId,
                                                                       @RequestParam Long unixDate ){
        //validate that unixDate is a valid UnixTimestamp
        if (activityService.validTimestamp(String.valueOf(unixDate))) {
            String date = new SimpleDateFormat("MM/dd/yyyy").format(new java.util.Date(unixDate * 1000L));
            List<Activity> activities = activityService.retrieveActivitiesForTrackByActionTypeSinceDate(actionId, trackId, date);
            return ResponseEntity.ok(activities);
        }else{
            throw new BadRequestException("Invalid Date format");
        }
    }
}
