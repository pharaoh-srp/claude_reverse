package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class c20 {
    public final Context a;
    public final cz5 b;
    public final long c;
    public final mnc d;

    public c20(Context context, cz5 cz5Var, long j, mnc mncVar) {
        this.a = context;
        this.b = cz5Var;
        this.c = j;
        this.d = mncVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c20.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        c20 c20Var = (c20) obj;
        return x44.r(this.a, c20Var.a) && x44.r(this.b, c20Var.b) && d54.c(this.c, c20Var.c) && x44.r(this.d, c20Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = d54.i;
        return this.d.hashCode() + vb7.e(iHashCode, 31, this.c);
    }
}
