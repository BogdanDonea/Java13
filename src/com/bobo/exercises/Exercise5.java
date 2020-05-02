package com.bobo.exercises;



public class Exercise5 {
    public static void main(String[] args) {
        DataObject[] dataObjects = new DataObject[5];

        DataObject dataObject = new DataObject();
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




        int sum = 0;
        for (int i = 0; i < dataObjects.length; i++) {
            if ("friday".equals(dataObjects[i].code.toLowerCase())) {
                sum += dataObjects[i].value;
                System.out.println("Sum friday: " + sum);
            } else if ("saturday".equals(dataObjects[i].code.toLowerCase())) {
                sum += dataObjects[i].value;
                System.out.println("Sum saturday: " + sum);
            }
        }



        System.out.println("Sum: " + sum);


    }
}
