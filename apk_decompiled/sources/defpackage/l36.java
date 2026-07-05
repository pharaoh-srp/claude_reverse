package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class l36 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final List f;

    public l36(int i, int i2, int i3, int i4, String str, List list) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = str;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l36)) {
            return false;
        }
        l36 l36Var = (l36) obj;
        return this.a == l36Var.a && this.b == l36Var.b && this.c == l36Var.c && this.d == l36Var.d && x44.r(this.e, l36Var.e) && this.f.equals(l36Var.f);
    }

    public final int hashCode() {
        int iC = vb7.c(this.d, vb7.c(this.c, vb7.c(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
        String str = this.e;
        return this.f.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbV = vb7.v("DiffHunk(oldStart=", ", oldCount=", this.a, this.b, ", newStart=");
        qy1.k(this.c, this.d, ", newCount=", ", context=", sbV);
        sbV.append(this.e);
        sbV.append(", lines=");
        sbV.append(this.f);
        sbV.append(")");
        return sbV.toString();
    }
}
