package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kwi {
    public final long a;
    public final long b;
    public final String c;

    public kwi(long j, long j2, String str) {
        this.a = j;
        this.b = j2;
        this.c = str;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        qh9Var.p(Long.valueOf(this.a), "duration");
        qh9Var.p(Long.valueOf(this.b), "timestamp");
        String str = this.c;
        if (str != null) {
            qh9Var.r("target_selector", str);
        }
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwi)) {
            return false;
        }
        kwi kwiVar = (kwi) obj;
        return this.a == kwiVar.a && this.b == kwiVar.b && x44.r(this.c, kwiVar.c);
    }

    public final int hashCode() {
        int iE = vb7.e(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbW = grc.w(this.a, "Fid(duration=", ", timestamp=");
        qy1.m(this.b, ", targetSelector=", this.c, sbW);
        sbW.append(")");
        return sbW.toString();
    }
}
