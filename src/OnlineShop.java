public class OnlineShop {
    public static void main(String[] args) {
        Category category1 = new Category("napoje", "coś dla spragnionych");
        Product product1 = new Product("Pepsi", 5.5, "napój gazowany 2l", category1);
        Product product2 = new Product("Frugo", 1.7, "napój niegazowany 0.3l", category1);
        //Pytanie: czy lepiej odwołąć się do jednego category1 czy dać category2 = category1 i odwoływać się do 2?

        Category category3 = new Category("słodycze", "coś słodkiego");
        Product product3 = new Product("Mars", 1.2, "baton czekoladowy bez orzechów", category3);

        Product product4 = new Product("Torba papierowa", 0.30, "Torba do pakowania zakupów", null);

        SpecialOffer offer1 = new SpecialOffer(product3, "Kosmiczny tydzień - kosmiczne produkty w promocji.", "14.01.2019",
                "20.01.2019", 0.2);

        System.out.println("Oferta sklepu");
        System.out.println(category1.description);
        product1.showProduct();
        product2.showProduct();
        System.out.println(category3.description);
        product3.showProduct();
        System.out.println("---");
        product4.showProduct();

        System.out.println();
        offer1.showOffer();


    }
}
