package com.qoobico.remindme.server.service;

import com.qoobico.remindme.server.entity.Remind;

import java.util.List;

/**
 * Created by DemaFayz on 16.10.2016.
 */
public interface ReminderService {

    List<Remind> getAll();
    Remind getById(long id);
    Remind save(Remind remind);
    void remove(long id);
}
