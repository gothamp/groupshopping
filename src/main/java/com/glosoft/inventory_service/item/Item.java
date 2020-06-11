package com.glosoft.inventory_service.item;

import java.util.concurrent.atomic.AtomicLong;

public class Item {

    private final long id;
    private final long categoryId;
    private final String name;
    private final String description;
    private final String imageURL;

    public long getId() {
        return id;
    }

    public long getCategoryId() {
        return categoryId;
    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImageURL() {
        return imageURL;
    }

    private static final AtomicLong nextId = new AtomicLong();

    public Item(long categoryId, String name, String description, String imageURL) {
        this.id = nextId.incrementAndGet();
        this.categoryId = categoryId;
        this.name = name;
        this.description = description;
        this.imageURL = imageURL;
    }


   // public String getContent() {return content;}
}