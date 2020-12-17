package com.company;

public class Monarchy extends Form {
    protected int citys;

    public Monarchy(String name, int population, int year, String formPr, int citys){
        super(population, name, year, formPr);
        this.citys = citys;
    }

    @Override
    public void show() {
        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append("Номер в базе данных: "+this.id + "\n");
        stringBuilder.append("Название страны: " + getName() + "\n");
        stringBuilder.append("Население (человек): " +getPopulation() + "\n");
        stringBuilder.append("Год создания страны: " +getYear() + "\n");
        stringBuilder.append("Форма правления: " + getFormPr() + "\n");
        stringBuilder.append("Кол-во городов в стране: "+ getCitys() + "\n");
        System.out.println(stringBuilder.toString());
    }

    public int getCitys() {
        return citys;
    }
}