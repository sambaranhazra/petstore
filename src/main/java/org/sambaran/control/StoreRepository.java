package org.sambaran.control;

import org.sambaran.entity.Item;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StoreRepository {
    public List<Item> getAllItems() {
        List<Item> items = new ArrayList<Item>();
        Item first = new Item("1", "Royal Canin", new BigDecimal(1700.00));
        items.add(first);
        items.add(new Item("2", "Pedigree", new BigDecimal(500.00)));
        return items;
    }
}
