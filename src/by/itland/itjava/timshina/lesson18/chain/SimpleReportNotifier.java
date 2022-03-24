package by.itland.itjava.timshina.lesson18.chain;

public class SimpleReportNotifier extends Notifier {
    public SimpleReportNotifier(Priority priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Отравляем простой отчет: "+message);
    }
}
