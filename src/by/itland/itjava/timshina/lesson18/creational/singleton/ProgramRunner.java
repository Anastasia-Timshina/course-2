package by.itland.itjava.timshina.lesson18.creational.singleton;

public class ProgramRunner {
    public static void main(String[] args) {

        ProgramLogger.getProgramLogger().addLogInfo("first log");
        ProgramLogger.getProgramLogger().addLogInfo("second log");
        ProgramLogger.getProgramLogger().addLogInfo("Third log");
        ProgramLogger.getProgramLogger().showLogFile();
    }
}
