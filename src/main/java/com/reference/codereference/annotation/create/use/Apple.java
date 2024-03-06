package com.reference.codereference.annotation.create.use;

import com.reference.codereference.annotation.create.FruitColor;
import com.reference.codereference.annotation.create.FruitName;
import com.reference.codereference.annotation.create.FruitProvider;

public class Apple {

    @FruitName("Apple")
    private String appleName;

    @FruitColor(fruitColor = FruitColor.Color.RED)
    private String appleColor;

    @FruitProvider(id = 1, name = "HomePlus", address = "Seoul")
    private String appleProvider;

}
