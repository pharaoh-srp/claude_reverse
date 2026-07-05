package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rwf implements ij6 {
    public final zb0 a;
    public final int b;

    public rwf(String str, int i) {
        this.a = new zb0(str);
        this.b = i;
    }

    @Override // defpackage.ij6
    public final void a(lj6 lj6Var) {
        int i = lj6Var.d;
        zb0 zb0Var = this.a;
        if (i != -1) {
            int i2 = lj6Var.e;
            String str = zb0Var.F;
            String str2 = zb0Var.F;
            lj6Var.d(i, i2, str);
            if (str2.length() > 0) {
                lj6Var.e(i, str2.length() + i);
            }
        } else {
            int i3 = lj6Var.b;
            int i4 = lj6Var.c;
            String str3 = zb0Var.F;
            String str4 = zb0Var.F;
            lj6Var.d(i3, i4, str3);
            if (str4.length() > 0) {
                lj6Var.e(i3, str4.length() + i3);
            }
        }
        int i5 = lj6Var.b;
        int i6 = lj6Var.c;
        int i7 = i5 == i6 ? i6 : -1;
        int i8 = this.b;
        int iE0 = wd6.e0(i8 > 0 ? (i7 + i8) - 1 : (i7 + i8) - zb0Var.F.length(), 0, lj6Var.a.s());
        lj6Var.f(iE0, iE0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rwf)) {
            return false;
        }
        rwf rwfVar = (rwf) obj;
        return x44.r(this.a.F, rwfVar.a.F) && this.b == rwfVar.b;
    }

    public final int hashCode() {
        return (this.a.F.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.a.F);
        sb.append("', newCursorPosition=");
        return vb7.r(sb, this.b, ')');
    }
}
