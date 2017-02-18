package com.mtnhub.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by tlwheele on 2/17/2017.
 */
@Embeddable
public class UserPk implements Serializable {
    @Id
    @Column(name = "user_id")
    private Integer userId;


    public Integer getUserId() {
        return userId;
    }
}
