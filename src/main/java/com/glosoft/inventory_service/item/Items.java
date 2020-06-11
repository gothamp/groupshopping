package com.glosoft.inventory_service.item;

//import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public class Items {
    private ItemTestDao item;

    public Items() {
        item = new ItemTestDao();
    }

    public List<Item> getItemList() {
        return item.getAll();
    }

    public Optional<Item> getItem(long id) {
        return item.get(id);
    }

}
