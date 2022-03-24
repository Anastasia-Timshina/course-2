package by.itland.itjava.timshina.lesson18.structure.bridgeMOST;


public class RunnerBridge {
    public static void main(String[] args) {
        Program[] programs = {
                new BankSystem(new CppDeveloper()),
                new StockExchange(new JavaDeveloper())
        };

        for (Program program : programs) {
            program.developProgram();
        }
    }
}
