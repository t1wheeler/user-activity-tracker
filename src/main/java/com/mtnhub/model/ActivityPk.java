package com.mtnhub.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by tlwheele on 2/17/2017.
 */

public class ActivityPk implements Serializable {
    @Id
    @Column(name = "activity_id")
    private Integer activityId;


    public Integer getActivityId() {
        return activityId;
    }
}
