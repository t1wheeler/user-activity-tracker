package com.mtnhub.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by tlwheele on 2/17/2017.
 */

@Entity
@Table(name = "track", schema = "activity_manager")
@IdClass(TrackPK.class)
public class Track implements Serializable {

    @Id
    @Column(name = "track_id")
    private Integer trackId;

    @Column(name = "post_id")
    private Integer postId;

    @Column(name = "track_image")
    private String trackImage;


    public Integer getTrackId() {
        return trackId;
    }

    public Integer getPostId() {
        return postId;
    }

    public String getTrackImage() {
        return trackImage;
    }
}


