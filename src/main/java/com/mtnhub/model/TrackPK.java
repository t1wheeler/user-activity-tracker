package com.mtnhub.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by tlwheele on 2/17/2017.
 */
public class TrackPK implements Serializable {
    @Id
    @Column(name = "track_id")
    private Integer trackId;


    public Integer getTrackId() {
        return trackId;
    }
}
