package org.example.model;

import org.example.model.entity.MechanicalWatch;
import org.example.model.entity.QuartzWatch;
import org.example.model.entity.SolarWatch;
import org.example.model.entity.Watch;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class ShopRepository {
    private ArrayList<Watch> data;

    public ShopRepository(){
        data = new ArrayList<>();
        data.add(new SolarWatch(352.5, new Date(), Color.SILVER, "Apple", "350mAh"));
        data.add(new SolarWatch(380.0, new Date(), Color.RED, "Apple", "330mAh"));
        data.add(new QuartzWatch(800.0, new Date(), Color.BLACK, "Casio", "2 years"));
        data.add(new MechanicalWatch(250.0, new Date(), Color.GOLD, "Rolex", "96 hour"));
    }

    public List<Watch> getWatchesSortedByPrice(Boolean sortASC){
        List<Watch> sortedList = new ArrayList<>(data);
        sortedList.sort(Comparator.comparing(Watch::getPrice));

        if (!sortASC){
             sortedList.sort(Comparator.comparing(Watch::getPrice).reversed());
        }

        return sortedList;
    }
    public List<Watch> getWatchesSortedByPrice(){
        return getWatchesSortedByPrice(true);
    }

    public List<Watch> getWatchesSortedByColor(){
        List<Watch> sortedList = new ArrayList<>(data);
        sortedList.sort(Comparator.comparing(Watch::getColor));

        return sortedList;
    }

    public List<Watch> getWatchesSortedByDate(){
        List<Watch> sortedList = new ArrayList<>(data);
        sortedList.sort(Comparator.comparing(Watch::getReceivedDate));

        return sortedList;
    }


    public List<Watch> getAllWatches() {
        return data;
    }

    public void save(Watch watch){
        data.add(watch);
    }

    public Double getTotalPrice() {
        return data.stream().mapToDouble(Watch::getPrice).sum();
    }
}
