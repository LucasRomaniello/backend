package ar.utn.bda.semana03.menuItems;

import ar.utn.bda.semana02.Figuras;
import ar.utn.bda.util.menu.MenuItem;

public class MenuItemFiguras extends MenuItem {

    public MenuItemFiguras(String key, String title) {
        super(key, title);
    }

    @Override
    public void ejecutar(){
        Figuras.run();
    }
}
