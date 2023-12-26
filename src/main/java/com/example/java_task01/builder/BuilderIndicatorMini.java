package com.example.java_task01.builder;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class BuilderIndicatorMini implements Builder {
    Indicator indicator = new Indicator();
    Pane pane = new Pane();

    @Override
    public void addText(String argText) {
        Text text = new Text("Имт = " + argText);
        pane.getChildren().add(text);
    }

    @Override
    public void lineBounds(int width, int height, Color color) {
        Rectangle rect = new Rectangle();
        rect.setWidth(width);
        rect.setHeight(height);
        rect.setFill(color);
        rect.setStroke(Color.BLACK);
        rect.setY(23);
        pane.getChildren().add(rect);
    }
    @Override
    public Indicator Build() {
        indicator.add(pane);
        return indicator;
    }
    public void remove() {
        indicator.remove(pane);
    }
}
