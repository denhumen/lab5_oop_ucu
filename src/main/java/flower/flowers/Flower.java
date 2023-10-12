package flower.flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Flower {

    @Getter
    private double price;
    
    @Getter
    private double sepalLength;

    @Getter
    private FlowerType flowerType;

    private FlowerColor color;

    public Flower(Flower flower) {
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
        this.color = flower.color;
        this.flowerType = flower.flowerType;
    }

    public String getColor() {
        return color.toString();
    }
}
