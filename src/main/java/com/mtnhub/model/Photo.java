package com.mtnhub.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by tlwheele on 2/17/2017.
 */
@Entity
@Table(name="photo",  schema = "activity_manager")
@IdClass(PhotoPk.class)
public class Photo implements Serializable {
    @Id
    @Column(name = "photo_id")
    private Integer photoId;

    @Column(name = "post_id")
    private Integer postId;

    @Column(name = "image")
    private String image;


    public Integer getPhotoId() {
        return photoId;
    }

    public Integer getPostId() {
        return postId;
    }

    public String getImage() {
        return image;
    }
}
