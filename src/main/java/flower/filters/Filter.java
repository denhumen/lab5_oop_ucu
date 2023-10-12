package flower.filters;

import flower.flowers.Item;

public interface Filter {
    boolean match(Item item);
}
