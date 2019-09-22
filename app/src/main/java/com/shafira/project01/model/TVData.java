package com.shafira.project01.model;

import java.util.ArrayList;

public class TVData {
    public static String[] judul = {
            "The Puppet Show",
            "Inca Mummy Girl"
    };

    public static int[] id = {
        10,17
    };
    
    public static int[] airedseason = {
        1,2
    };

    public static String[] firstaired = {
            "1997-05-05",
            "1997-10-06"
    };

    public static String[] director = {
            "Ellen S. Pressman",
            "Ellen S. Pressman"
    };

    public static double[] rating = {
            7.4,
            7.4
    };

    public static ArrayList<TV> getListData() {
        ArrayList<TV> list = new ArrayList<>();
        for (int position = 0; position < judul.length; position++) {
            TV tv = new TV();
            tv.setJudul(judul[position]);
            tv.setId(id[position]);
            tv.setAiredseason(airedseason[position]);
            tv.setFirstaired(firstaired[position]);
            tv.setDirector(director[position]);
            tv.setRating(rating[position]);
            list.add(tv);
        }
        return list;
    }
}
