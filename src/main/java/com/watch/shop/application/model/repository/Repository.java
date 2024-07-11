package com.watch.shop.application.model.repository;

import com.watch.shop.application.model.entity.Watch;

import java.util.List;

public interface Repository {
    public List<Watch> getData();

    public void save(Watch watch);
}
