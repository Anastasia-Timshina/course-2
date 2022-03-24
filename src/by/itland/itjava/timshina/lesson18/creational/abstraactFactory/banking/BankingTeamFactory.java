package by.itland.itjava.timshina.lesson18.creational.abstraactFactory.banking;

import by.itland.itjava.timshina.lesson18.creational.abstraactFactory.Developer;
import by.itland.itjava.timshina.lesson18.creational.abstraactFactory.ProjectManager;
import by.itland.itjava.timshina.lesson18.creational.abstraactFactory.ProjectTeamFactory;
import by.itland.itjava.timshina.lesson18.creational.abstraactFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new KotlinDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new ProjectManagment();
    }
}
