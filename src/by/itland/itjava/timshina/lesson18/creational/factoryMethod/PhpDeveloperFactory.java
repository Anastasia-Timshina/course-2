package by.itland.itjava.timshina.lesson18.creational.factoryMethod;

public class PhpDeveloperFactory  implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
