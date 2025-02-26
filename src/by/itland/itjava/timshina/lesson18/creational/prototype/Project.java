package by.itland.itjava.timshina.lesson18.creational.prototype;

public class Project implements Copyable {

    private int id;
    private String name;
    private String sourceCode;

    public Project(int id, String name, String sourseCode) {
        this.id = id;
        this.name = name;
        this.sourceCode = sourseCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    @Override
    public Object copy() {
        Project copy = new Project(id, name, sourceCode);
        return copy;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sourceCode='" + sourceCode + '\'' +
                '}';
    }
}
