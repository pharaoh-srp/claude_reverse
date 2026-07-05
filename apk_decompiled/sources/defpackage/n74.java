package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class n74 implements ij6 {
    public final zb0 a;
    public final int b;

    public n74(String str, int i) {
        this(new zb0(str), i);
    }

    @Override // defpackage.ij6
    public final void a(lj6 lj6Var) {
        int i = lj6Var.d;
        zb0 zb0Var = this.a;
        if (i != -1) {
            lj6Var.d(i, lj6Var.e, zb0Var.F);
        } else {
            lj6Var.d(lj6Var.b, lj6Var.c, zb0Var.F);
        }
        int i2 = lj6Var.b;
        int i3 = lj6Var.c;
        int i4 = i2 == i3 ? i3 : -1;
        int i5 = this.b;
        int iE0 = wd6.e0(i5 > 0 ? (i4 + i5) - 1 : (i4 + i5) - zb0Var.F.length(), 0, lj6Var.a.s());
        lj6Var.f(iE0, iE0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n74)) {
            return false;
        }
        n74 n74Var = (n74) obj;
        return x44.r(this.a.F, n74Var.a.F) && this.b == n74Var.b;
    }

    public final int hashCode() {
        return (this.a.F.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.a.F);
        sb.append("', newCursorPosition=");
        return vb7.r(sb, this.b, ')');
    }

    public n74(zb0 zb0Var, int i) {
        this.a = zb0Var;
        this.b = i;
    }
}
