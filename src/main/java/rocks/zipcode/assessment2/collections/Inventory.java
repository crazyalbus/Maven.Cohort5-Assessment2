package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    Map<String, Integer> inventory;

    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        inventory = new HashMap<>();
        bulkAdd(strings);
    }

    private void bulkAdd(List<String> strings){
        for (String item: strings
        ) {
            inventory.put(item, null);
        }
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        inventory = new HashMap<>();
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        if(inventory.get(item) == null) {
            inventory.put(item, 1);
        } else {
            inventory.put(item, inventory.get(item) + 1);
        }
    }


    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {

        if((inventory.get(item) == null) || (inventory.get(item) == 0)){
            inventory.put(item, -1);
        } else {
            inventory.put(item, inventory.get(item) - 1);
        }
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {

        Integer qty = 0;

        if(inventory.get(item) != null) {
            qty = inventory.get(item);
        }

        return qty;
    }
}
