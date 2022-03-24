package by.itland.itjava.timshina.lesson18.creational.builder;

public interface Builder {

    Builder name(String name);

    Builder cms(Cms cms);

    Builder price(int price);

    WebSite build();
}
