package by.itland.itjava.timshina.lesson18.creational.factoryMethod;

public class CppDevrloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDevaloper();
    }
}
