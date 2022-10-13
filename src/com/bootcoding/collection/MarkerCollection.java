package com.bootcoding.collection;

import com.bootcoding.oops.Markers;

import java.util.HashMap;
import java.util.Map;

public class MarkerCollection {
    Map<Long, Markers> markerStore=new HashMap<>();
    public void addMarker(Markers m){
        markerStore.put(m.getId(),m);
    }
    public void printMarkers(){

        for(Markers m: markerStore.values()){
            System.out.println("Id: "+m.getId());
            System.out.println("company: "+m.getCompary());
            System.out.println("color: "+m.getColor());
            System.out.println("Type: "+m.getTypr());
            System.out.println("Price: "+m.getPrice());
        }
    }

    public static void main(String[] args) {
        MarkerCollection mcs=new MarkerCollection();
        for(int i=0;i<=10;i++){
            Markers m=new Markers();
            m.setTypr("white"+i);
            m.setPrice((i+100)*25);
            m.setId(i);
            m.setCompary("camblin"+i);
            mcs.addMarker(m);
        }
        mcs.printMarkers();
    }
}
