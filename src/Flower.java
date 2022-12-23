import java.text.DecimalFormat;

public class Flower {
    final String flowerName;
    final String country;
    final double cost;
    int lifeSpan;

    Flower (String flowerName, String country, double cost, int lifeSpan){
        if (flowerName!=null&&!flowerName.isEmpty()&&!flowerName.isBlank()) {
            this.flowerName = flowerName;
        }else{
            this.flowerName = "Тип цветка не указан";
        }
        if (country!=null&&!country.isEmpty()&&!country.isBlank()) {
            this.country = country;
        }else{
            this.country = "Россия";
        }
        if (cost>0) {
            this.cost = cost;
        }else{
            this.cost = 1;
        }
        if (lifeSpan>0) {
            this.lifeSpan = lifeSpan;
        }else{
            this.lifeSpan = 3;
        }
    }
    void info(){
        System.out.println("Цветок " + getFlowerName() +". Страна " + getCountry() + ". Стоимость " + getCost() + ". Срок стояния " + lifeSpan);
    }

    public String getFlowerName() {
        return flowerName;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }
}
