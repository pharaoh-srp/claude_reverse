package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e11 {
    public final Object a;
    public final p01 b;
    public final yw8 c;

    public e11(Object obj, p01 p01Var, yw8 yw8Var) {
        this.a = obj;
        this.b = p01Var;
        this.c = yw8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e11)) {
            return false;
        }
        e11 e11Var = (e11) obj;
        p01 p01Var = e11Var.b;
        p01 p01Var2 = this.b;
        return x44.r(p01Var2, p01Var) && p01Var2.a(this.a, e11Var.a) && x44.r(this.c, e11Var.c);
    }

    public final int hashCode() {
        p01 p01Var = this.b;
        return this.c.hashCode() + ((p01Var.b(this.a) + (p01Var.hashCode() * 31)) * 31);
    }
}
