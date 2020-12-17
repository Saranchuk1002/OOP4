package com.company;

public class Republic extends Form {

    public Republic(String name, int population, int year, String formPr){
        super(population, name, year, formPr);
    }

    @Override
    public void show() {
        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append("Номер в базе данных: "+this.id + "\n");
        stringBuilder.append("Название страны: " + this.name + "\n");
        stringBuilder.append("Население (человек): " +this.population + "\n");
        stringBuilder.append("Год создания страны: " +this.year + "\n");
        stringBuilder.append("Форма правления: " + this.formPr + "\n");
        System.out.println(stringBuilder.toString());
    }
}

