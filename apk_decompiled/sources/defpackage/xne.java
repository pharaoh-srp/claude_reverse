package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xne {
    public final at9 a;
    public final mde b;
    public final plh c;
    public final gz5 d;

    public xne(at9 at9Var, mde mdeVar, plh plhVar, gz5 gz5Var) {
        this.a = at9Var;
        this.b = mdeVar;
        this.c = plhVar;
        this.d = gz5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xne.class != obj.getClass()) {
            return false;
        }
        xne xneVar = (xne) obj;
        return this.a.equals(xneVar.a) && this.b.equals(xneVar.b) && this.c == xneVar.c && this.d == xneVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + kgh.l(this.a.E.hashCode() * 31, 31, this.b.E)) * 31);
    }
}
