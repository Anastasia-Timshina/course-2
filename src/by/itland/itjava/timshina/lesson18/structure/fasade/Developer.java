package by.itland.itjava.timshina.lesson18.structure.fasade;

public class Developer {

    public void doJobBeForeDeathLine(BugTracker bugTracker){
        if (bugTracker.isActiveSprint()){
            System.out.println("разраюлтчик решает проблему");
        }else {
            System.out.println("Разработчик курит бамбук");
        }
    }
}
