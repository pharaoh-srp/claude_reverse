package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class g7b {
    public final Uri a;
    public final String b;
    public final List c;
    public final nz8 d;
    public final long e;

    static {
        ebh.w(0, 1, 2, 3, 4);
        tpi.w(5);
        tpi.w(6);
        tpi.w(7);
    }

    public g7b(Uri uri, String str, xpk xpkVar, List list, nz8 nz8Var, long j) {
        this.a = uri;
        this.b = gkb.k(str);
        this.c = list;
        this.d = nz8Var;
        hz8 hz8VarO = nz8.o();
        for (int i = 0; i < nz8Var.size(); i++) {
            ((i7b) nz8Var.get(i)).getClass();
            hz8VarO.b(new i7b());
        }
        hz8VarO.g();
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7b)) {
            return false;
        }
        g7b g7bVar = (g7b) obj;
        return this.a.equals(g7bVar.a) && Objects.equals(this.b, g7bVar.b) && Objects.equals(null, null) && this.c.equals(g7bVar.c) && this.d.equals(g7bVar.d) && this.e == g7bVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return (int) ((((long) ((this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 29791)) * 961)) * 31)) * 31) + this.e);
    }
}
