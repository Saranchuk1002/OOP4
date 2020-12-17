package com.company;

import java.util.ArrayList;

public class Workwithdata {
    private ArrayList<Form> info = new ArrayList();
    public void add(Form form){
        this.info.add(form);

    }
    public void print(){
        for (Form form : info) {
            form.show();
        }
    }


    public void printMonarchy() {
        for (Form form : info) {
            if(form instanceof Monarchy) {
                form.show();

            }
        }
    }
    public void printFederation() {
        for (Form form : info) {
            if(form instanceof Federation) {
                form.show();

            }
        }
    }
    public void printRepublic() {
        for (Form form : info) {
            if(form instanceof Republic) {
                form.show();

            }
        }
    }

    public void delete(int id){
        boolean bool = false;
        for (Form form : info) {
            if (id == form.getId()){
                bool = true;
            }
        }
        if (bool == false){
            System.out.println("Такого id нет в базе данных.");
        }else {
            info.removeIf(form -> form.id == id);
        }
    }
}



