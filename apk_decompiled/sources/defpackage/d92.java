package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class d92 {
    public final ww7 a;
    public final sxb b;

    static {
        ww7.j(ygg.f);
    }

    public d92(ww7 ww7Var, sxb sxbVar) {
        ww7Var.getClass();
        this.a = ww7Var;
        this.b = sxbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d92)) {
            return false;
        }
        d92 d92Var = (d92) obj;
        return x44.r(this.a, d92Var.a) && this.b.equals(d92Var.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.a.hashCode() * 961)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String strReplace = this.a.b().replace('.', '/');
        strReplace.getClass();
        sb.append(strReplace);
        sb.append("/");
        sb.append(this.b);
        return sb.toString();
    }
}
