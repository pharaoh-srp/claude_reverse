package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xqh {
    public final long a;
    public final long b;
    public final long c;
    public final poc d;

    public xqh() {
        lz1 lz1Var = uh6.F;
        zh6 zh6Var = zh6.SECONDS;
        long jQ = v40.Q(45, zh6Var);
        long jQ2 = v40.Q(5, zh6Var);
        long jQ3 = v40.Q(5, zh6Var);
        poc pocVar = tqh.V;
        this.a = jQ;
        this.b = jQ2;
        this.c = jQ3;
        this.d = pocVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqh)) {
            return false;
        }
        xqh xqhVar = (xqh) obj;
        return uh6.e(this.a, xqhVar.a) && uh6.e(this.b, xqhVar.b) && uh6.e(this.c, xqhVar.c) && x44.r(this.d, xqhVar.d);
    }

    public final int hashCode() {
        lz1 lz1Var = uh6.F;
        return this.d.hashCode() + vb7.e(vb7.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "TimeoutOptions(initialTimeout=" + ((Object) uh6.p(this.a)) + ", additionalTime=" + ((Object) uh6.p(this.b)) + ", idleTimeout=" + ((Object) uh6.p(this.c)) + ", timeSource=" + this.d + ')';
    }
}
