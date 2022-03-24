package by.itland.itjava.timshina.lesson18.creational.abstraactFactory;

public interface ProjectTeamFactory {

    Developer getDeveloper();

    Tester getTester();

    ProjectManager getProjectManager();
}
