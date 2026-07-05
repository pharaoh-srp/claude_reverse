package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class m3e {
    public final pl9 a;
    public final bqh b;
    public final Set c;
    public final boolean d;
    public final int e;
    public final String f;

    /* JADX WARN: Illegal instructions before constructor call */
    public m3e(pl9 pl9Var, bqh bqhVar, Set set, int i, String str, int i2) {
        Set set2 = (i2 & 4) != 0 ? um6.E : set;
        int i3 = (i2 & 16) != 0 ? 1000 : i;
        str = (i2 & 32) != 0 ? null : str;
        pl9Var.getClass();
        bqhVar.getClass();
        set2.getClass();
        this(pl9Var, bqhVar, set2, true, i3, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m3e.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        m3e m3eVar = (m3e) obj;
        return x44.r(this.a, m3eVar.a) && x44.r(this.b, m3eVar.b) && x44.r(this.c, m3eVar.c) && this.d == m3eVar.d && this.e == m3eVar.e && x44.r(this.f, m3eVar.f);
    }

    public final int hashCode() {
        int iP = (fsh.p((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d) + this.e) * 31;
        String str = this.f;
        return Integer.hashCode(0) + ((iP + (str != null ? str.hashCode() : 0)) * 31);
    }

    public m3e(pl9 pl9Var, bqh bqhVar, Set set, boolean z, int i, String str) {
        pl9Var.getClass();
        bqhVar.getClass();
        set.getClass();
        this.a = pl9Var;
        this.b = bqhVar;
        this.c = set;
        this.d = z;
        this.e = i;
        this.f = str;
        if (i > 0) {
            return;
        }
        sz6.p("pageSize must be positive.");
        throw null;
    }
}
