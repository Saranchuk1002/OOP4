package com.company;

public class Federation extends Form {
    protected String capital;

    public Federation(String name, int population, int year, String formPr, String capital) {
        super(population, name, year, formPr);
        this.capital = capital;
    }

    @Override
    public void show()
    {
        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append("Номер в базе данных: " + this.id + "\n");
        stringBuilder.append("Название страны: " + getName() + "\n");
        stringBuilder.append("Население (человек): " + getPopulation() + "\n");
        stringBuilder.append("Год создания страны: " + getYear() + "\n");
        stringBuilder.append("Форма правления: " + getFormPr() + "\n");
        stringBuilder.append("Столица: " + getCapital() + "\n");
        System.out.println(stringBuilder.toString());

    }

    public String getCapital()
    {
        return capital;
    }
}


