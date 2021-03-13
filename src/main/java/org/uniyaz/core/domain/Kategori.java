package org.uniyaz.core.domain;

/**
 * @author HAKAN DERELİ
 * @since 5.xxx.x
 */
public class Kategori extends BaseDomain{
    private Integer id;
    private String adi;

    public Kategori(String adi) {
        this.adi = adi;
    }

    public Kategori(int id, String adi) {
        this.id = id;
        this.adi= adi;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    @Override
    public String toString() {
        return adi;
    }
}
