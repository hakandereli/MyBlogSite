package org.uniyaz.ui.components;

import com.vaadin.ui.Component;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import org.uniyaz.MyUI;

/**
 * @author HAKAN DERELİ
 * @since 5.xxx.x
 */
public class MyContent extends VerticalLayout {

    public MyContent() {
        MyUI myUI= (MyUI) UI.getCurrent();
        myUI.setMyContent(this);

        setSizeFull();
        buildContentLayout();
    }

    private void buildContentLayout() {
        Label lbl = new Label("Content");
        addComponent(lbl);
    }

    public void setContent(Component component) {
        this.removeAllComponents();
        addComponent(component);
    }
}
