package by.itland.itjava.timshina.lesson18.creational.abstraactFactory.website;

import by.itland.itjava.timshina.lesson18.creational.abstraactFactory.ProjectManager;

public class WebSitePM implements ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("Pm work webSite");
    }

}
