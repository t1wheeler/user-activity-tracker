package com.mtnhub.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by tlwheele on 2/17/2017.
 */
@Entity
@Table(name="user", schema="activity_manager")
@IdClass(UserPk.class)
public class User implements Serializable {
    @Id
    @Column(name = "user_id")
    private Integer userId;


}
