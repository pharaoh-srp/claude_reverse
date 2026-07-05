package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zv1 {
    public final gw9 a;
    public final int b;
    public final int c;

    public zv1(gw9 gw9Var, int i, int i2) {
        this.a = gw9Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv1)) {
            return false;
        }
        zv1 zv1Var = (zv1) obj;
        return this.a == zv1Var.a && this.b == zv1Var.b && this.c == zv1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + vb7.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "BoxChildSelector(type=" + this.a + ", horizontalAlignment=" + ((Object) pt.b(this.b)) + ", verticalAlignment=" + ((Object) rt.b(this.c)) + ')';
    }
}
