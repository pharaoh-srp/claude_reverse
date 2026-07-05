package defpackage;

import io.sentry.e0;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class yo0 implements Iterator, Map.Entry {
    public int E;
    public int F = -1;
    public boolean G;
    public final /* synthetic */ bp0 H;

    public yo0(bp0 bp0Var) {
        this.H = bp0Var;
        this.E = bp0Var.G - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.G) {
            sz6.j("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.F;
            bp0 bp0Var = this.H;
            if (x44.r(key, bp0Var.f(i)) && x44.r(entry.getValue(), bp0Var.i(this.F))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.G) {
            return this.H.f(this.F);
        }
        sz6.j("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.G) {
            return this.H.i(this.F);
        }
        sz6.j("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.F < this.E;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.G) {
            sz6.j("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.F;
        bp0 bp0Var = this.H;
        Object objF = bp0Var.f(i);
        Object objI = bp0Var.i(this.F);
        return (objF == null ? 0 : objF.hashCode()) ^ (objI != null ? objI.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            pmf.d();
            return null;
        }
        this.F++;
        this.G = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.G) {
            e0.b();
            return;
        }
        this.H.g(this.F);
        this.F--;
        this.E--;
        this.G = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.G) {
            return this.H.h(this.F, obj);
        }
        sz6.j("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
