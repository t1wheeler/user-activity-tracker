package com.mtnhub.repository;

import com.mtnhub.model.Activity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by tlwheele on 2/16/2017.
 */
@RepositoryRestResource
public interface ActivityRepository extends CrudRepository<Activity, Long> {
}
