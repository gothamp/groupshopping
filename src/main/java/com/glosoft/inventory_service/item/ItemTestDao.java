package com.glosoft.inventory_service.item;

import com.glosoft.inventory_service.IDao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;





public class ItemTestDao implements IDao<Item> {
    
    private List<Item> items = new ArrayList<>();

    public ItemTestDao() {
        items.add(new Item(1, "Tetly Tea",  "240 Tetly tea bags", "https://savingtowardabetterlife.com/2019/09/walmart-tetley-tea-24ct-box-68-after-coupon-2/"));
        items.add(new Item(1, "PG Tips Tea",  "100 PG Tips", "https://savingtowardabetterlife.com/2019/09/walmart-tetley-tea-24ct-box-68-after-coupon-2/"));
        items.add(new Item(1, "Harrogate Tea",  "80 Harrogate", "https://savingtowardabetterlife.com/2019/09/walmart-tetley-tea-24ct-box-68-after-coupon-2/"));

    }

    @Override
    public Optional<Item> get(long id) {
      return Optional.ofNullable(items.stream().filter(itm -> id == itm.getId()).findAny().orElse(null));
    }

    @Override
    public List<Item> getAll() {
        return items;
    }

    @Override
    public void save(Item Item) {
        items.add(Item);
    }

 /*   //TODO
 @Override
    public void update(Item Item, String[] params) {
        Item.setName(Objects.requireNonNull(
                params[0], "Name cannot be null"));
        Item.setEmail(Objects.requireNonNull(
                params[1], "Email cannot be null"));

        Items.add(Item);
    }

    @Override
    public void delete(Item Item) {
        Items.remove(Item);
    }

  */
}
