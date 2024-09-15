package ar.utn.bda.util.menu;

import java.util.Scanner;

public abstract class MenuItem implements MenuCall{

    String key;

    String title;

    @Override
    public abstract void ejecutar();

    public MenuItem(String key, String title) {
        this.key = key;
        this.title = title;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
