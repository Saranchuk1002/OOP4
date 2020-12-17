package com.company;
public abstract class Form {
    private static int count = 0;
    protected int id;
    protected int population;
    protected String name;
    protected int year;
    protected String formPr;
    public Form(int population, String name,int year,String formPr ) {
        this.id = count + 1;
        count++;
        this.name = name;
        this.population = population;
        this.year = year;
        this.formPr = formPr;
    }
    public int getId(){
        return id;
    }
    public int getPopulation(){
        return population;
    }
    public String getName() {
        return name;
    }
    public int getYear(){
        return year;
    }
    public String getFormPr(){
        return formPr;
    }

    public abstract void show(); //абстрактный метод
}