package flower.flowers;

import lombok.Getter;

@Getter
public class FlowerPack {

    public FlowerPack(Flower flower, int quantity){
        this.flower = new Flower(flower);
        this.quantity = quantity;
    }

    public FlowerPack(Flower flower) {
        this(flower, 1);
    }

    private Flower flower;

    private int quantity;

    public double getPrice(){
        return quantity * flower.getPrice();
    }

    public void setQuantity(int quantity){
        this.quantity = quantity < 1 ? 1 : quantity;
    }
}
