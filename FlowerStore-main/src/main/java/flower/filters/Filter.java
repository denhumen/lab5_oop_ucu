package flower.filters;

import flower.flowers.Item;

public interface Filter {
    public boolean match(Item item);
}
