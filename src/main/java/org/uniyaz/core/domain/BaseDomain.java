package org.uniyaz.core.domain;

import java.io.Serializable;

/**
 * @author HAKAN DERELİ
 * @since 5.xxx.x
 */
public abstract class BaseDomain implements Serializable {
    public abstract Integer getId();

    @Override
    public int hashCode() {
        if (getId() == null) return -1;
        return getId().intValue();
    }

    @Override
    public boolean equals(Object o) {
        BaseDomain baseDomain = (BaseDomain) o;
        if (baseDomain == null || baseDomain.getId() == null) return false;
        return baseDomain.getId().equals(getId());
    }
}
