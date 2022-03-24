package by.itland.itjava.timshina.lesson18.creational.abstraactFactory;

import by.itland.itjava.timshina.lesson18.creational.abstraactFactory.banking.BankingTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager manager = projectTeamFactory.getProjectManager();

        System.out.println("Bank System");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
