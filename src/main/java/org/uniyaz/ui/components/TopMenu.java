package org.uniyaz.ui.components;

import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.UI;
import org.uniyaz.MyUI;
import org.uniyaz.ui.view.KategoriAddPage;
import org.uniyaz.ui.view.KategoriDeletePage;
import org.uniyaz.ui.view.MakaleAddPage;
import org.uniyaz.ui.view.MakaleListingPage;

/**
 * @author HAKAN DERELİ
 * @since 5.xxx.x
 */
public class TopMenu extends HorizontalLayout {

    private MyContent myContent;
    private Sidebar sidebar;

    public TopMenu() {
        setSizeFull();
        buildMenuLayout();
        this.myContent = ((MyUI) UI.getCurrent()).getMyContent();
        this.sidebar = ((MyUI) UI.getCurrent()).getSidebar();
    }

    private void buildMenuLayout() {
        buildMenuButtons();
    }

    private void buildMenuButtons() {
        MenuBar menuBar = new MenuBar();
        menuBar.setWidth(100.0f, Unit.PERCENTAGE);

        MenuBar.MenuItem categoryButton = menuBar.addItem("Kategori", null, null);
        kategoriEkle(categoryButton);
        kategoriSil(categoryButton);

        MenuBar.MenuItem articleButton = menuBar.addItem("Makale", null, null);
        makaleEkle(articleButton);
        makaleListele(articleButton);

        addComponent(menuBar);
    }


    //Makaleleri LİSTELE
    private void makaleListele(MenuBar.MenuItem articleButton) {
        MenuBar.MenuItem listMakaleButton = articleButton.addItem("Makaleleri Listele", FontAwesome.LIST, new MenuBar.Command() {
            @Override
            public void menuSelected(MenuBar.MenuItem menuItem) {
                MakaleListingPage makaleListingPage = new MakaleListingPage();
                myContent.setContent(makaleListingPage);
            }
        });
    }

    //Makale Ekle
    private void makaleEkle(MenuBar.MenuItem articleButton) {
        MenuBar.MenuItem addArticleButton = articleButton.addItem("Makale Ekle", FontAwesome.PLUS, new MenuBar.Command() {
            @Override
            public void menuSelected(MenuBar.MenuItem menuItem) {
                MakaleAddPage makaleAddPage = new MakaleAddPage();
                myContent.setContent(makaleAddPage);
            }
        });
    }

    //Kategori Ekle
    private void kategoriEkle(MenuBar.MenuItem categoryButton) {
        MenuBar.MenuItem addCategoryButton = categoryButton.addItem("Kategori Ekle", FontAwesome.PLUS, new MenuBar.Command() {
            @Override
            public void menuSelected(MenuBar.MenuItem menuItem) {
                KategoriAddPage kategoriAddPage = new KategoriAddPage();
                myContent.setContent(kategoriAddPage);
            }
        });
    }

    //Kategori Sil
    private void kategoriSil(MenuBar.MenuItem categoryButton) {
        MenuBar.MenuItem deleteCategoryButton = categoryButton.addItem("Kategori Sil", FontAwesome.TRASH, new MenuBar.Command() {
            @Override
            public void menuSelected(MenuBar.MenuItem menuItem) {
                KategoriDeletePage kategoriDeletePage = new KategoriDeletePage();
                myContent.setContent(kategoriDeletePage);
            }
        });
    }
}
