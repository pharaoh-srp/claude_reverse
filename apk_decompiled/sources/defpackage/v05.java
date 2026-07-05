package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class v05 {
    public final String a;
    public final long b;
    public final long c;
    public final xt7 d;
    public final ew4 e;
    public final zb0 f;

    public v05(String str, long j, long j2, xt7 xt7Var, ew4 ew4Var, zb0 zb0Var) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = xt7Var;
        this.e = ew4Var;
        this.f = zb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v05)) {
            return false;
        }
        v05 v05Var = (v05) obj;
        return this.a.equals(v05Var.a) && d54.c(this.b, v05Var.b) && d54.c(this.c, v05Var.c) && this.d.equals(v05Var.d) && this.e.equals(v05Var.e) && this.f.equals(v05Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = d54.i;
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + vb7.e(vb7.e(iHashCode, 31, this.b), 31, this.c)) * 31)) * 31);
    }

    public final String toString() {
        String strI = d54.i(this.b);
        String strI2 = d54.i(this.c);
        StringBuilder sbR = kgh.r("Entry(sourceHtml=", this.a, ", linkColor=", strI, ", blockquoteColor=");
        sbR.append(strI2);
        sbR.append(", codeFontFamily=");
        sbR.append(this.d);
        sbR.append(", headings=");
        sbR.append(this.e);
        sbR.append(", parsed=");
        sbR.append((Object) this.f);
        sbR.append(")");
        return sbR.toString();
    }
}
