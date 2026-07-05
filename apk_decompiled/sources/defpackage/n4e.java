package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class n4e {
    public final Context a;
    public final hx8 b;
    public final kw9 c;
    public final kw9 d;
    public final kw9 e;
    public final sz6 f;
    public final na4 g;

    public n4e(Context context, hx8 hx8Var, kw9 kw9Var, kw9 kw9Var2, kw9 kw9Var3, sz6 sz6Var, na4 na4Var) {
        this.a = context;
        this.b = hx8Var;
        this.c = kw9Var;
        this.d = kw9Var2;
        this.e = kw9Var3;
        this.f = sz6Var;
        this.g = na4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n4e) {
            n4e n4eVar = (n4e) obj;
            return x44.r(this.a, n4eVar.a) && this.b.equals(n4eVar.b) && this.c.equals(n4eVar.c) && this.d.equals(n4eVar.d) && this.e.equals(n4eVar.e) && this.f.equals(n4eVar.f) && this.g == n4eVar.g;
        }
        return false;
    }

    public final int hashCode() {
        return (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
    }

    public final String toString() {
        return "Options(application=" + this.a + ", defaults=" + this.b + ", mainCoroutineContextLazy=" + this.c + ", memoryCacheLazy=" + this.d + ", diskCacheLazy=" + this.e + ", eventListenerFactory=" + this.f + ", componentRegistry=" + this.g + ", logger=null)";
    }
}
