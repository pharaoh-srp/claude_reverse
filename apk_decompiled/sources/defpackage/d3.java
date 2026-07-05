package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d3 {
    public transient Set E;
    public transient Collection F;
    public transient Map G;

    public Map a() {
        Map map = this.G;
        if (map != null) {
            return map;
        }
        Map mapB = b();
        this.G = mapB;
        return mapB;
    }

    public abstract Map b();

    public abstract Set c();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d3) {
            return a().equals(((d3) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
