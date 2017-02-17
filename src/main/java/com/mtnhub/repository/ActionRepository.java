package com.mtnhub.repository;

import com.mtnhub.model.Action;
import com.mtnhub.model.ActionPK;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by tlwheele on 2/16/2017.
 */
public interface ActionRepository extends JpaRepository<Action, ActionPK> {
}
