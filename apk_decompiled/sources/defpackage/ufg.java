package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ufg {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final long g;
    public final long h;
    public final long i;
    public final mfg j;
    public final lfg k;

    public ufg(String str, String str2, String str3, String str4, String str5, String str6, long j, long j2, long j3, mfg mfgVar, lfg lfgVar) {
        grc.B(str4, str5, str6);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = mfgVar;
        this.k = lfgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufg)) {
            return false;
        }
        ufg ufgVar = (ufg) obj;
        return this.a.equals(ufgVar.a) && this.b.equals(ufgVar.b) && this.c.equals(ufgVar.c) && x44.r(this.d, ufgVar.d) && x44.r(this.e, ufgVar.e) && x44.r(this.f, ufgVar.f) && this.g == ufgVar.g && this.h == ufgVar.h && this.i == ufgVar.i && this.j.equals(ufgVar.j) && this.k.equals(ufgVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + ((this.j.hashCode() + vb7.e(vb7.e(vb7.e(kgh.l(kgh.l(kgh.l(kgh.l(kgh.l(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("SpanEvent(traceId=", this.a, ", spanId=", this.b, ", parentId=");
        kgh.u(sbR, this.c, ", resource=", this.d, ", name=");
        kgh.u(sbR, this.e, ", service=", this.f, ", duration=");
        sbR.append(this.g);
        ij0.u(this.h, ", start=", ", error=", sbR);
        sbR.append(this.i);
        sbR.append(", metrics=");
        sbR.append(this.j);
        sbR.append(", meta=");
        sbR.append(this.k);
        sbR.append(")");
        return sbR.toString();
    }
}
