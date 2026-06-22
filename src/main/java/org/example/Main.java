package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {


        Healthplan basicPlan = new Healthplan(1, "Basic Saglik Plani", Plan.BASIC);
        Healthplan premiumPlan = new Healthplan(2, "Premium Saglik Plani", Plan.PREMIUM);

        System.out.println("----- Healthplan Testleri -----");
        System.out.println(basicPlan);
        System.out.println(premiumPlan);


        String[] healthplans = new String[3];
        Employee employee = new Employee(101, "Ahmet Yilmaz", "ahmet@example.com", "12345", healthplans);

        System.out.println("\n----- Employee Testleri -----");
        employee.addHealthPlan(0, "Basic Saglik Plani");
        employee.addHealthPlan(1, "Premium Saglik Plani");
        employee.addHealthPlan(0, "Standard Saglik Plani"); // dolu mesaji bekleniyor
        employee.addHealthPlan(5, "Hatali Index"); // sinir disi mesaji bekleniyor

        System.out.println(employee);


        String[] developerNames = new String[3];
        Company company = new Company(1, "Tech A.S.", 50000.0, developerNames);

        System.out.println("\n----- Company Testleri -----");
        company.addEmployee(0, "Ahmet Yilmaz");
        company.addEmployee(1, "Mehmet Demir");
        company.addEmployee(0, "Ayse Kaya"); // dolu mesaji bekleniyor
        company.addEmployee(10, "Hatali Index"); // sinir disi mesaji bekleniyor

        System.out.println(company);


        System.out.println("\n----- Encapsulation (Giro) Testi -----");
        System.out.println("Baslangic giro degeri: " + company.getGiro());

        company.setGiro(-5000.0); // negatif deger denemesi
        System.out.println("Negatif deger atama sonrasi giro: " + company.getGiro());

        company.setGiro(75000.0); // gecerli deger
        System.out.println("Gecerli deger atama sonrasi giro: " + company.getGiro());


        Company company2 = new Company(2, "Negatif Test A.S.", -100.0, new String[2]);
        System.out.println("Constructor ile negatif giro denenen company2: " + company2);
    }
}