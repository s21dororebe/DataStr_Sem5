package services;

import model.City;

import java.util.HashMap;
import java.util.Hashtable;

public class MainService {
    public static void main(String[] args) {
        City city1 = new City("Ventspils", "Latvija", 1230.25f, 32000);
        City city2 = new City("Kuldiga", "Latvija", 5632.32f, 25000);
        City city3 = new City("Riga", "Latvija", 1236.023f, 40000);
        City city4 = new City("Talsi", "Latvija", 9852.02f, 15000);

        HashMap<String, City> myHashMap = new HashMap<>();
        myHashMap.put(city1.getTitle(), city1);
        myHashMap.put(city2.getTitle(), city2);
        myHashMap.put(city3.getTitle(), city3);
        myHashMap.put(city4.getTitle(), city4);
        myHashMap.put(null, null);

        if(myHashMap.containsKey("Ventspils"))
            System.out.println(myHashMap.get("Ventspils"));

        myHashMap.put(null, new City("Liepaja", "Latvija", 25000.63f, 35000));
        System.out.println(myHashMap.entrySet());

        Hashtable<String, City> myHashTable = new Hashtable<>();
        myHashTable.put(null, null);


    }

}
