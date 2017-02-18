package com.mtnhub.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

/**
 * Created by tlwheele on 2/16/2017.
 */
@Entity
@Table(name="activity",  schema = "activity_manager")
@IdClass(ActivityPk.class)
public class Activity implements Serializable {
    @Id
    @Column(name = "activity_id")
    private Integer activityId;

    @Basic
    @Column(name = "photo_id")
    private Integer photoId;

    @Basic
    @Column(name = "track_id")
    private Integer trackId;

    @Basic
    @Column(name = "action_id")
    private Integer actionId;

    @Basic
    @Column(name = "action_name")
    private String actionName;

    @Basic
    @Column(name = "action_date")
    private Date actionDate;

    @Id
    @Column(name = "user_id")
    private Integer userId;

    @Basic
    @Column(name = "user_name")
    private String userName;


    public Integer getActivityId() {
        return activityId;
    }


    public Integer getPhotoId() {
        return photoId;
    }


    public Integer getTrackId() {
        return trackId;
    }


    public Integer getActionId() {
        return actionId;
    }

    public String getActionName() {
        return actionName;
    }

    public Date getActionDate() {
        return actionDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }
}
