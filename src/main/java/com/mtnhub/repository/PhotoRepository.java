package com.mtnhub.repository;

import com.mtnhub.model.Photo;
import com.mtnhub.model.PhotoPk;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by tlwheele on 2/17/2017.
 */
public interface PhotoRepository extends JpaRepository<Photo, PhotoPk> {
}
