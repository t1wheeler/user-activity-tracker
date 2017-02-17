package com.mtnhub.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by tlwheele on 2/17/2017.
 */
public class PhotoPk  implements Serializable {
    @Id
    @Column(name = "photo_id")
    private Integer photoId;


    public Integer getPhotoId() {
        return photoId;
    }
}
