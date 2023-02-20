package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheese;
    private int extraTopping;


    boolean isExtraCheeseAdded;
    boolean isExtraToppingAdded;
    boolean isTakeAway;

    boolean isBillCreated;


    public Pizza(Boolean isVeg){

        this.isVeg = isVeg;
        this.isBillCreated = false;
        this.isExtraCheeseAdded = false;
        this.isExtraToppingAdded = false;
        this.isTakeAway = false;
        this.bill = "";

        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
            this.extraTopping= 70;

        }else{
            this.price = 400;
            this.extraTopping= 120;
        }

        this.cheese = 80;
        this.bill += "Base Price Of The Pizza: "+this.price+"\n";

    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded){
            this.price += cheese;
            isExtraCheeseAdded=true;
        }

    }

    public void addExtraToppings(){
        // your code goes here

        if(!isExtraToppingAdded){
            this.price += extraTopping;
            isExtraToppingAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway){
            this.price += 20;
            isTakeAway=true;
        }

    }

    public String getBill(){
        // your code goes here
        if(!isBillCreated){

        if(isExtraCheeseAdded){
            this.bill+= "Extra Cheese Added: 80" +"\n";
        }
        if(isExtraToppingAdded){
            this.bill += "Extra Toppings Added: " + extraTopping +"\n";
        }
        if(isTakeAway){
            this.bill+= "Paperbag Added: 20" + "\n";
        }
        this.bill += "Total Price: " + this.price;
        isBillCreated= true;
        return this.bill;
        }
//        return "";
        return "";
    }
}
