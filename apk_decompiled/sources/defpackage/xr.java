package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class xr {
    public final Set a;
    public final bqh b;
    public final Set c;

    public xr(Set set, bqh bqhVar, Set set2) {
        bqhVar.getClass();
        set2.getClass();
        this.a = set;
        this.b = bqhVar;
        this.c = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!xr.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        xr xrVar = (xr) obj;
        return x44.r(this.a, xrVar.a) && x44.r(this.b, xrVar.b) && x44.r(this.c, xrVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public /* synthetic */ xr(Set set, bqh bqhVar) {
        this(set, bqhVar, um6.E);
    }
}
