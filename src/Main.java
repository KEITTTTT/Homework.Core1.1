public class Main {
    public static void main(String[] args) {
        Human maxim = new Human(1988, "Максим", "Минск", "бренд-менеджер");
        Human anya = new Human(-1993, "Аня", "", "методист образовательных программ");
        Human katya = new Human(1992, "Катя", "Калининград", "продакт-менеджер");
        Human artem = new Human(1995, "Артём", "Москва", "директор по развитию бизнеса");
        Human vladimir = new Human(2001, "Владимир ", "Казань", " безработный");

        maxim.introduce();
        anya.introduce();
        katya.introduce();
        artem.introduce();
        vladimir.introduce();

        Flower rose = new Flower("Роза", "Голландия",35.59,0);
        Flower chrysanthemum = new Flower("Хризантема", "", 15,1);
        Flower peony = new Flower("Пион", "Англия", 69.9, 1);
        Flower gypsophila = new Flower("Гипсофила", "Турция", 19.5, 10);

        rose.info();
        chrysanthemum.info();
        peony.info();
        gypsophila.info();

        Bouqet bouqet = new Bouqet(new Flower[]{rose,rose,rose,gypsophila,gypsophila});
        System.out.println("Bouqet cost " + bouqet.getCost());
        System.out.println("Bouqet LifeSpain " + bouqet.getLifeSpain());







    }
}