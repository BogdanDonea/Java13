package com.bobo.exercises;


import java.util.HashMap;

public class Exercise6 extends Function {
    public static void main(String[] args) {
        var dataObjects = new DataObject[5];

        var dataObject = new DataObject();
        dataObject.value = 5;
        dataObject.code = "Friday";
        dataObjects[0] = dataObject;

        dataObject = new DataObject();
        dataObject.value = 7;
        dataObject.code = "Saturday";
        dataObjects[1] = dataObject;

        dataObject = new DataObject();
        dataObject.value = 9;
        dataObject.code = "Friday";
        dataObjects[2] = dataObject;

        dataObject = new DataObject();
        dataObject.value = 11;
        dataObject.code = "Saturday";
        dataObjects[3] = dataObject;

        dataObject = new DataObject();
        dataObject.value = 13;
        dataObject.code = "Saturday";
        dataObjects[4] = dataObject;


        var map = new HashMap<String, Integer>();

        for (int i = 0; i < dataObjects.length; i++) {
            //read sum for code
            var sumForCode = map.get(dataObjects[i].code);

            //if no sum is in the map for that code yet start with sum of 0
            if(sumForCode == null){
                sumForCode = 0;
            }

            //add count to sum
            sumForCode += dataObjects[i].value;

            //store new sum in map
            map.put(dataObjects[i].code, sumForCode);

        }

        //iterate all keys (codes) in map
        for(String code : map.keySet()){
            //print out the sum for that key (code).
            System.out.println(code + " " + map.get(code));

        }

        var exercise6 = new Exercise6();
        System.out.println(exercise6.add(11));
        System.out.println(exercise6.add(22));

        System.out.println(exercise6.add(33));
    }





}
