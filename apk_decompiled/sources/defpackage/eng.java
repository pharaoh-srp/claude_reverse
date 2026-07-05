package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eng {
    public final ud0 a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final int f;

    public eng(ud0 ud0Var, long j, long j2, long j3, boolean z, int i) {
        this.a = ud0Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = z;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eng) {
            eng engVar = (eng) obj;
            if (this.a == engVar.a && d54.c(this.b, engVar.b) && d54.c(this.c, engVar.c) && d54.c(this.d, engVar.d) && this.e == engVar.e && this.f == engVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = d54.i;
        return Integer.hashCode(this.f) + fsh.p(vb7.e(vb7.e(vb7.e(iHashCode, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        String strI = d54.i(this.b);
        String strI2 = d54.i(this.c);
        String strI3 = d54.i(this.d);
        StringBuilder sb = new StringBuilder("StatusVisuals(icon=");
        sb.append(this.a);
        sb.append(", iconTint=");
        sb.append(strI);
        sb.append(", tileBg=");
        kgh.u(sb, strI2, ", tileBorder=", strI3, ", loading=");
        sb.append(this.e);
        sb.append(", descriptionRes=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
