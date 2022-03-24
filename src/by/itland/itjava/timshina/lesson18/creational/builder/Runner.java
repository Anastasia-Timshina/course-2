package by.itland.itjava.timshina.lesson18.creational.builder;

public class Runner {
    public static void main(String[] args) {

        WebSite visitCardSite = new VisitCardWebSite()
                .name("Visit Card")
                .cms(Cms.WORDPRES)
                .price(500)
                .build();
        WebSite enterpriseWebSite = new EnterpriseWebSite()
                .name("Enterprise")
                .cms(Cms.ALIFRESCO)
                .price(10000)
                .build();

        System.out.println(visitCardSite);
        System.out.println("==========================");
        System.out.println(enterpriseWebSite);
    }
}
