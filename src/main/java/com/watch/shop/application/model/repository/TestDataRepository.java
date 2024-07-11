package com.watch.shop.application.model.repository;

import com.watch.shop.application.model.entity.Color;
import com.watch.shop.application.model.entity.MechanicalWatch;
import com.watch.shop.application.model.entity.QuartzWatch;
import com.watch.shop.application.model.entity.SolarWatch;
import com.watch.shop.application.model.entity.Watch;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestDataRepository implements Repository {
    private final List<Watch> data;

    public TestDataRepository() {
        data = new ArrayList<>();
        data.add(new SolarWatch(BigDecimal.valueOf(352.5), LocalDate.now(), Color.SILVER, "Apple", "350mAh"));
        data.add(new SolarWatch(BigDecimal.valueOf(380.0), LocalDate.now(), Color.RED, "Apple", "330mAh"));
        data.add(new QuartzWatch(BigDecimal.valueOf(800.0), LocalDate.now(), Color.BLACK, "Casio", "2 years"));
        data.add(new MechanicalWatch(BigDecimal.valueOf(250.0), LocalDate.now(), Color.GOLD, "Rolex", "96 hour"));
    }

    public List<Watch> getData() {
        List<Watch> deepCloneData = new ArrayList<>();
        data.forEach(item -> deepCloneData.add(item.clone()));
        return deepCloneData;
    }

    public void save(Watch watch) {
        data.add(watch);
    }
}
