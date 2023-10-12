package flower.flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter @AllArgsConstructor
public class Flower {

    public Flower(){
        
    }

    public Flower(Flower flower) {
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
        this.color = flower.color;
        this.flowerType = flower.flowerType;
    }

    @Getter
    private double price;

    @Getter
    private double sepalLength;

    private FlowerColor color;

    @Getter
    private FlowerType flowerType;

    public String getColor() {
        return color.toString();
    }

}
