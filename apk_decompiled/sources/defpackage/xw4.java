package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xw4 {
    public final bx4 a;
    public final ny4 b;

    public xw4(bx4 bx4Var, ny4 ny4Var) {
        bx4Var.getClass();
        this.a = bx4Var;
        this.b = ny4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xw4) {
            xw4 xw4Var = (xw4) obj;
            return x44.r(this.a, xw4Var.a) && this.b == xw4Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ConwayPermissionRequest(tool=" + this.a + ", resolve=" + this.b + ")";
    }
}
