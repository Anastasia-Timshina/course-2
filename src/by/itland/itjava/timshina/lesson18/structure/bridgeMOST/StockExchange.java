package by.itland.itjava.timshina.lesson18.structure.bridgeMOST;

public class StockExchange extends Program {

    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("биржа в программие");
        developer.writeCode();
    }
}
