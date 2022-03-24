package by.itland.itjava.timshina.lesson18.creational.prototype;

public class ProjectFactory {

    private Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public Project cloneProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
