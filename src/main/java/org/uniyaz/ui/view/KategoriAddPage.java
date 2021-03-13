package org.uniyaz.ui.view;

import com.vaadin.ui.*;
import org.uniyaz.MyUI;
import org.uniyaz.core.domain.Kategori;
import org.uniyaz.core.service.KategoriService;
import org.uniyaz.ui.components.Sidebar;

/**
 * @author HAKAN DERELİ
 * @since 5.xxx.x
 */
public class KategoriAddPage extends VerticalLayout {
    TextField kategoriTextField;
    Button kategoriEkleButton;
    Kategori kategori;
    Sidebar sidebar;
    public KategoriAddPage() {
        this.sidebar = ((MyUI) UI.getCurrent()).getSidebar();
        buildKategoriAddView();
    }

    private void buildKategoriAddView() {
        kategoriTextField = new TextField("Kategori Adı");
        addComponent(kategoriTextField);

        kategoriEkleButton = new Button("Ekle");
        kategoriEkleButton.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                if (kategoriTextField.getValue() != null) {
                    try {
                        kategori = new Kategori(kategoriTextField.getValue());
                        KategoriService kategoriService = new KategoriService();
                        kategoriService.addKategori(kategori);
                        Notification.show(kategoriTextField.getValue() + " Eklendi");
                        kategoriTextField.setValue("");

                        sidebar.getSidebarPage().fillSidebar();

                    }catch (Exception hata){
                        Notification.show("Eklenemedi ! ");
                    }
                }
            }
        });
        addComponent(kategoriEkleButton);
    }
}
