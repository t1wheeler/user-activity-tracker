package com.mtnhub.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by tlwheele on 2/16/2017.
 */
@Embeddable
public class ActionPK implements Serializable {
    @Column(name = "action_id")
    private Integer actionId;


    public Integer getActionId() {
        return actionId;
    }

}
