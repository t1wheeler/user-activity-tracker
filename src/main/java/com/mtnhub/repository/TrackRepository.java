package com.mtnhub.repository;

import com.mtnhub.model.Track;
import com.mtnhub.model.TrackPK;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by tlwheele on 2/17/2017.
 */
public interface TrackRepository extends JpaRepository<Track, TrackPK> {
}
