package com.mtnhub.repository;

import com.mtnhub.model.Activity;
import com.mtnhub.model.ActivityPk;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.util.List;

/**
 * Created by tlwheele on 2/16/2017.
 */
public interface ActivityRepository extends JpaRepository<Activity, ActivityPk> {
    //Photo retrieves
    List<Activity> findByTrackIdIsNull();
    List<Activity> findByActionIdAndPhotoId(Integer actionId, Integer photoId);
    List<Activity> findByPhotoId(Integer photoId);
    List<Activity> findAllByActionIdAndPhotoIdAndActionDateAfter(Integer actionID, Integer photoId, Date actionDate);

    //Track retrieves
    List<Activity> findByPhotoIdIsNull();
    List<Activity> findByActionIdAndTrackId(Integer actionId, Integer trackId);
    List<Activity> findByTrackId(Integer trackId);
    List<Activity> findAllByActionIdAndTrackIdAndActionDateAfter(Integer actionId, Integer trackId, Date actionDate);

}
