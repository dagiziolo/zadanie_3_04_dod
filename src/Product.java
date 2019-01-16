class Product {
    String name;
    double price;
    String description;
    Category category;

    Product(String n, double p, String d, Category cat) {
        name = n;
        price = p;
       description = d;
        category = cat;
    }

    void showProduct() {
        System.out.println(name + " w cenie " + price + " Opis produktu: " + description);
    }
}
