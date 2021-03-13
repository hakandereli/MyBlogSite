package org.uniyaz.core.service;

import org.uniyaz.core.data.KategoriDao;
import org.uniyaz.core.domain.Kategori;

import java.util.ArrayList;
import java.util.List;

/**
 * @author HAKAN DERELİ
 * @since 5.xxx.x
 */
public class KategoriService {
    KategoriDao kategoriDao=new KategoriDao();

    public void addKategori(Kategori kategori){
        kategoriDao.addKategori(kategori);
    }

    public List<Kategori> kategoriListing(){
        return kategoriDao.kategoriListing();
    }

    public void deleteKategori(Kategori kategori){
        kategoriDao.deleteKategori(kategori);
    }
}
