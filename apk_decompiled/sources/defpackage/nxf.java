package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nxf {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public nxf(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final long a(boolean z) {
        return z ? this.a : this.d;
    }

    public final long b(boolean z) {
        return z ? this.c : this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxf)) {
            return false;
        }
        nxf nxfVar = (nxf) obj;
        return d54.c(this.a, nxfVar.a) && d54.c(this.b, nxfVar.b) && d54.c(this.c, nxfVar.c) && d54.c(this.d, nxfVar.d) && d54.c(this.e, nxfVar.e) && d54.c(this.f, nxfVar.f);
    }

    public final int hashCode() {
        int i = d54.i;
        return Long.hashCode(this.f) + vb7.e(vb7.e(vb7.e(vb7.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        String strI = d54.i(this.a);
        String strI2 = d54.i(this.b);
        String strI3 = d54.i(this.c);
        String strI4 = d54.i(this.d);
        String strI5 = d54.i(this.e);
        String strI6 = d54.i(this.f);
        StringBuilder sbR = kgh.r("SettingRowColors(contentColor=", strI, ", primaryIconColor=", strI2, ", secondaryTextColor=");
        kgh.u(sbR, strI3, ", disabledContentColor=", strI4, ", disabledPrimaryIconColor=");
        return vb7.t(sbR, strI5, ", disabledSecondaryTextColor=", strI6, ")");
    }
}
