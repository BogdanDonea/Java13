package com.bobo.exercises;



public class Exercise4 {
    public static void main(String[] args) {
        DataObject[] dataObjects = new DataObject[3];

        DataObject dataObject = new DataObject();
        dataObject.value = 5;
        dataObjects[0] = dataObject;

        dataObject = new DataObject();
        dataObject.value = 7;
        dataObjects[1] = dataObject;

        dataObject = new DataObject();
        dataObject.value = 9;
        dataObjects[2] = dataObject;


        int sum = 0;
        for (int i = 0; i < dataObjects.length; i++) {
            sum += dataObjects[i].value;
        }



        System.out.println("Sum: " + sum);
    }
}
