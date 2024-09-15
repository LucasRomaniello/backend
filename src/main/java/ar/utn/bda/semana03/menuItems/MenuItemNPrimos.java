package ar.utn.bda.semana03.menuItems;

import ar.utn.bda.semana02.NPrimos;
import ar.utn.bda.util.menu.MenuCall;
import ar.utn.bda.util.menu.MenuItem;

public class MenuItemNPrimos extends MenuItem {

    public MenuItemNPrimos(String key, String title) {
        super(key, title);
    }

    @Override
    public void ejecutar() {
        System.out.println("NPrimos");
        // NPrimos.run();
    }
}
