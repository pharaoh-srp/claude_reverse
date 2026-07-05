package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c74 implements iqb {
    public final iqb E;
    public final iqb F;

    public c74(iqb iqbVar, iqb iqbVar2) {
        this.E = iqbVar;
        this.F = iqbVar2;
    }

    @Override // defpackage.iqb
    public final Object a(pz7 pz7Var, Object obj) {
        return this.F.a(pz7Var, this.E.a(pz7Var, obj));
    }

    @Override // defpackage.iqb
    public final boolean e(bz7 bz7Var) {
        return this.E.e(bz7Var) && this.F.e(bz7Var);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c74)) {
            return false;
        }
        c74 c74Var = (c74) obj;
        return this.E.equals(c74Var.E) && x44.r(this.F, c74Var.F);
    }

    public final int hashCode() {
        return (this.F.hashCode() * 31) + this.E.hashCode();
    }

    public final String toString() {
        return vb7.s(new StringBuilder("["), (String) a(c0.S, ""), ']');
    }
}
