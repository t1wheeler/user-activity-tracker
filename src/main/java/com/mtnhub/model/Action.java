package com.mtnhub.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by tlwheele on 2/16/2017.
 */
@Entity
@Table(name = "action", schema = "activity_manager")
@IdClass(ActionPK.class)
public class Action implements Serializable {
    @Id
    @Column(name = "action_id")
    private Integer actionId;

    @Basic
    @Column(name = "action_name")
    private String actionName;



    public String getActionName() {
        return actionName;
    }

    public Integer getActionId() {
        return actionId;
    }
}
