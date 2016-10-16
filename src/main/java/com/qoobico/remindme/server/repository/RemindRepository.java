package com.qoobico.remindme.server.repository;

import com.qoobico.remindme.server.entity.Remind;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by DemaFayz on 16.10.2016.
 */
public interface RemindRepository extends JpaRepository<Remind, Long> {

}