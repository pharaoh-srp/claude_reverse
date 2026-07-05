package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class b74 implements q68 {
    public final q68 a;
    public final q68 b;

    public b74(q68 q68Var, q68 q68Var2) {
        this.a = q68Var;
        this.b = q68Var2;
    }

    @Override // defpackage.q68
    public final Object a(pz7 pz7Var, Object obj) {
        return this.b.a(pz7Var, this.a.a(pz7Var, obj));
    }

    @Override // defpackage.q68
    public final boolean b(bz7 bz7Var) {
        return this.a.b(bz7Var) || this.b.b(bz7Var);
    }

    @Override // defpackage.q68
    public final boolean c(e69 e69Var) {
        return this.a.c(e69Var) && this.b.c(e69Var);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b74)) {
            return false;
        }
        b74 b74Var = (b74) obj;
        return this.a.equals(b74Var.a) && x44.r(this.b, b74Var.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return vb7.s(new StringBuilder("["), (String) a(new m14(5), ""), ']');
    }
}
