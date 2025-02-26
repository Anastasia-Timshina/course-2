package by.itland.itjava.timshina.lesson18.creational.abstraactFactory;

import by.itland.itjava.timshina.lesson18.creational.abstraactFactory.banking.KotlinDeveloper;
import by.itland.itjava.timshina.lesson18.creational.abstraactFactory.banking.ManualTester;
import by.itland.itjava.timshina.lesson18.creational.abstraactFactory.banking.ProjectManagment;

public class WebSite {

    public static void main(String[] args) {
        KotlinDeveloper kotlinDelveloper = new KotlinDeveloper();
        ManualTester manualTester  = new ManualTester();
        ProjectManagment projectManagment = new ProjectManagment();

        System.out.println("Creating project...");
        kotlinDelveloper.writeCode();
        manualTester.testCode();
        projectManagment.manageProject();
    }
}
