package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bwg implements dwg {
    public final fid a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final iid h;

    public bwg(fid fidVar, String str, long j, String str2, String str3, String str4, boolean z) {
        this.a = fidVar;
        this.b = str;
        this.c = j;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = z;
        this.h = z ? iid.E : iid.G;
    }

    @Override // defpackage.hwg
    public final fid a() {
        return this.a;
    }

    @Override // defpackage.hwg
    public final String b() {
        return this.b;
    }

    @Override // defpackage.hwg
    public final String c() {
        return this.d;
    }

    @Override // defpackage.hwg
    public final iid d() {
        return this.h;
    }

    @Override // defpackage.hwg
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwg)) {
            return false;
        }
        bwg bwgVar = (bwg) obj;
        return this.a.equals(bwgVar.a) && this.b.equals(bwgVar.b) && this.c == bwgVar.c && this.d.equals(bwgVar.d) && this.e.equals(bwgVar.e) && this.f.equals(bwgVar.f) && this.g == bwgVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + kgh.l(kgh.l(kgh.l(vb7.e(kgh.l(this.a.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaxMonthly20xLimit(productDetails=");
        sb.append(this.a);
        sb.append(", formattedPrice=");
        sb.append(this.b);
        sb.append(", priceMicros=");
        qy1.m(this.c, ", basePlanId=", this.d, sb);
        kgh.u(sb, ", offerToken=", this.e, ", priceCurrencyCode=", this.f);
        sb.append(", isRecurring=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
