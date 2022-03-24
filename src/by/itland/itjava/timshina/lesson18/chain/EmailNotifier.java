package by.itland.itjava.timshina.lesson18.chain;

public class EmailNotifier extends Notifier {
    public EmailNotifier(Priority priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Высылаю Email "+message);
    }
}
