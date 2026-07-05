package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class b84 extends AbstractSet {
    public final /* synthetic */ int E;
    public final /* synthetic */ d84 F;

    public /* synthetic */ b84(d84 d84Var, int i) {
        this.E = i;
        this.F = d84Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.E;
        d84 d84Var = this.F;
        switch (i) {
            case 0:
                d84Var.clear();
                break;
            default:
                d84Var.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.E;
        d84 d84Var = this.F;
        switch (i) {
            case 0:
                Map mapC = d84Var.c();
                if (mapC != null) {
                    return mapC.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iE = d84Var.e(entry.getKey());
                    if (iE != -1 && cvk.l(d84Var.k()[iE], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return d84Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.E;
        d84 d84Var = this.F;
        switch (i) {
            case 0:
                Map mapC = d84Var.c();
                return mapC != null ? mapC.entrySet().iterator() : new a84(d84Var, 1);
            default:
                Map mapC2 = d84Var.c();
                return mapC2 != null ? mapC2.keySet().iterator() : new a84(d84Var, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.E;
        d84 d84Var = this.F;
        switch (i) {
            case 0:
                Map mapC = d84Var.c();
                if (mapC != null) {
                    break;
                } else if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!d84Var.g()) {
                        int iD = d84Var.d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = d84Var.E;
                        Objects.requireNonNull(obj2);
                        int i2 = yok.i(key, value, iD, obj2, d84Var.i(), d84Var.j(), d84Var.k());
                        if (i2 != -1) {
                            d84Var.f(i2, iD);
                            d84Var.J--;
                            d84Var.I += 32;
                            break;
                        }
                    }
                }
                break;
            default:
                Map mapC2 = d84Var.c();
                if (mapC2 == null) {
                    if (d84Var.h(obj) != d84.N) {
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.E;
        d84 d84Var = this.F;
        switch (i) {
        }
        return d84Var.size();
    }
}
