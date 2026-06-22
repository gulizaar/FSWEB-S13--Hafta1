package org.example;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;
    private  String[] developerNames;

    public Company (int id,String name,double giro,String[] developerNames){
        this.id=id;
        this.name=name;
        this.giro = (giro < 0) ? 0 : giro;
        this.developerNames=developerNames;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setGiro(double giro){
        if (giro < 0) {
            System.out.println("Giro negatif olamaz");
            this.giro=0;
        }else{
        this.giro=giro;}
    }
    public void setDeveloperNames(String[] developerNames){
        this.developerNames=developerNames;
    }


    public String  getName(){
        return name;

    }
    public int getId(){
        return  id;

    }
    public double getGiro(){
        return  giro;

    }
    public String[]  getDeveloperNames(){
        return developerNames;

    }
    public void addEmployee(int index,String name){
        if (index <0 || index>=developerNames.length) {
            System.out.println("Hata: " + index + " indexi dizi sınırları dışında.");
            return;
        }
        if(developerNames[index] ==null){
            developerNames[index]=name;

        }else{
            System.out.println(index+ " index dolu");
        }
    }
    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employees=" + Arrays.toString(developerNames) +
                '}';
    }

}
