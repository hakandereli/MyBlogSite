package org.uniyaz.ui.components;

import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.UI;
import org.uniyaz.MyUI;

/**
 * @author HAKAN DERELİ
 * @since 5.xxx.x
 */
public class Body extends HorizontalLayout {
    private MyContent myContent;
    private Sidebar sidebar;

    public Body() {
        setSizeFull();
        buildBodyLayout();
    }

    private void buildBodyLayout() {
        myContent = new MyContent();


        sidebar = new Sidebar();


        addComponent(sidebar);
        addComponent(myContent);

        setExpandRatio(sidebar, 1.8f);
        setExpandRatio(myContent, 8f);
    }

}
