package org.uniyaz.ui.components;

import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import org.uniyaz.MyUI;
import org.uniyaz.ui.view.SidebarPage;

/**
 * @author HAKAN DERELİ
 * @since 5.xxx.x
 */
public class Sidebar extends VerticalLayout {
    private SidebarPage sidebarPage;

    public Sidebar() {
        setSizeFull();

        MyUI myUI = ( MyUI) UI.getCurrent();
        myUI.setSidebar(this);

        sidebarPage = new SidebarPage();

        addComponent(sidebarPage);
    }

    public SidebarPage getSidebarPage() {
        return sidebarPage;
    }
}
