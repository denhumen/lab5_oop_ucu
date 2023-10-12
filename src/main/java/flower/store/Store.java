package flower.store;

import java.util.ArrayList;
import java.util.List;

import flower.filters.Filter;
import flower.flowers.Item;

public class Store {
    private List<Item> items;

    public List<Item> getItems() {
        return items;
    }

    public List<Item> search(Filter filter) {
        List<Item> foundItems = new ArrayList<>();
        for (Item item : items) {
            if (filter.match(item)) {
                foundItems.add(item);
            }
        }
        return foundItems;
    }
}
