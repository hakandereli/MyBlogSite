package org.uniyaz.ui.components;

import com.vaadin.ui.VerticalLayout;

/**
 * @author HAKAN DERELİ
 * @since 5.xxx.x
 */
public class Main extends VerticalLayout {

    public Main() {
        setSizeFull();
        setHeight(null);
        buildMainLayout();
    }

    private void buildMainLayout() {
        Header header=new Header();
        addComponent(header);

        Body body=new Body();

        TopMenu topMenu = new TopMenu();
        addComponent(topMenu);

        addComponent(body);

        Footer footer=new Footer();
        addComponent(footer);

        setExpandRatio(header, 1f);
        setExpandRatio(topMenu, 1f);
        setExpandRatio(body, 7.4f);
        setExpandRatio(footer, 0.4f);

    }
}
