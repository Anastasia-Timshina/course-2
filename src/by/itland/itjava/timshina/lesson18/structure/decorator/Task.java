package by.itland.itjava.timshina.lesson18.structure.decorator;

public class Task {
    public static void main(String[] args) {
        Developer developer =new JavaTeamLead( new SeniorJavaDeveloper(new JavaDeveloper()));

        System.out.println(developer.makeJob());
    }
}
