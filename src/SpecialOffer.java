class SpecialOffer {
    Product product;
    String descriptionOffer;
    String timeStart;
    String timeEnd;
    double discount;

    SpecialOffer(Product p, String d, String ts, String te, double dis) {
        product = p;
        descriptionOffer = d;
        timeStart = ts;
        timeEnd = te;
        discount = dis;
    }

    void showOffer() {
        System.out.println(descriptionOffer);
        System.out.println("Teraz " + product.name + " w cenie jedynie " + (1-discount)*product.price +
                ". Promocja trawa od " + timeStart + " do " + timeEnd);
    }
}
