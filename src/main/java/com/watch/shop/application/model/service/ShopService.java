package com.watch.shop.application.model.service;

import com.watch.shop.application.model.entity.Watch;
import com.watch.shop.application.model.repository.Repository;
import com.watch.shop.application.model.repository.TestDataRepository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ShopService {
    private final Repository repository;

    public ShopService() {
        this.repository = new TestDataRepository();
    }

    public List<Watch> getWatchesSortedByPriceDSC() {
        Comparator<Watch> comparator = Comparator.comparing(Watch::getPrice).reversed();

        return sortWatches(comparator);
    }

    public List<Watch> getWatchesSortedByPriceASC() {
        Comparator<Watch> comparator = Comparator.comparing(Watch::getPrice);

        return sortWatches(comparator);
    }

    private List<Watch> sortWatches(Comparator<Watch> comparator) {
        List<Watch> sortedList = new ArrayList<>(repository.getData());
        sortedList.sort(comparator);
        return sortedList;
    }

    public List<Watch> getWatchesSortedByColor() {
        List<Watch> sortedList = new ArrayList<>(repository.getData());
        sortedList.sort(Comparator.comparing(Watch::getColor));

        return sortedList;
    }

    public List<Watch> getWatchesSortedByDate() {
        List<Watch> sortedList = new ArrayList<>(repository.getData());
        sortedList.sort(Comparator.comparing(Watch::getReceivedDate));

        return sortedList;
    }

    public List<Watch> getAllWatches() {
        return repository.getData();
    }

    public void save(Watch watch) {
        repository.save(watch);
    }

    public BigDecimal getTotalPrice() {
        return repository.getData().stream()
                .map(Watch::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
