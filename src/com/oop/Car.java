package com.oop;

public class Car {

    /**
     * Note that the fields defined below are all private to this class.
     */
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    /**
     * Creating a public method, we can allow access to the fields above.
     * This is an example of encapsulation.
     */

    public void setModel(String model){
        /**
         * To access the fields in this class, we use 'this'
         */
        String validateModel = model.toLowerCase();
        if(validateModel.equals("civic") || validateModel.equals("durango")){
            this.model = model; // this.model is the field and model is the param
        }else{
            this.model = "Unknown";
        }

    }

    public String getModel(){
        return this.model;
    }
}
