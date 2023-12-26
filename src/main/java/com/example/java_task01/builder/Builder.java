package com.example.java_task01.builder;

import com.example.java_task01.builder.Indicator;
import javafx.scene.paint.Color;

public interface Builder {
    public void addText(String text);
    public void lineBounds(int width, int height, Color color);
    public Indicator Build();
}
