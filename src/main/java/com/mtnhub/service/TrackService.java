package com.mtnhub.service;

import com.mtnhub.model.Track;
import com.mtnhub.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tlwheele on 2/17/2017.
 */

@Service
public class TrackService {

    @Autowired
    private TrackRepository trackRepository;


    public List<Track> retrieveTracks(){
        List<Track> trackList = trackRepository.findAll();
        return trackList;
    }
}
