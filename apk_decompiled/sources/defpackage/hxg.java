package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hxg implements sx8 {
    public final wv8 a;
    public final jx8 b;
    public final sg5 c;
    public final mab d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public hxg(wv8 wv8Var, jx8 jx8Var, sg5 sg5Var, mab mabVar, String str, boolean z, boolean z2) {
        this.a = wv8Var;
        this.b = jx8Var;
        this.c = sg5Var;
        this.d = mabVar;
        this.e = str;
        this.f = z;
        this.g = z2;
    }

    @Override // defpackage.sx8
    public final jx8 a() {
        return this.b;
    }

    @Override // defpackage.sx8
    public final wv8 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxg)) {
            return false;
        }
        hxg hxgVar = (hxg) obj;
        return x44.r(this.a, hxgVar.a) && x44.r(this.b, hxgVar.b) && this.c == hxgVar.c && x44.r(this.d, hxgVar.d) && x44.r(this.e, hxgVar.e) && this.f == hxgVar.f && this.g == hxgVar.g;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        mab mabVar = this.d;
        int iHashCode2 = (iHashCode + (mabVar == null ? 0 : mabVar.hashCode())) * 31;
        String str = this.e;
        return Boolean.hashCode(this.g) + fsh.p((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessResult(image=");
        sb.append(this.a);
        sb.append(", request=");
        sb.append(this.b);
        sb.append(", dataSource=");
        sb.append(this.c);
        sb.append(", memoryCacheKey=");
        sb.append(this.d);
        sb.append(", diskCacheKey=");
        gid.t(sb, this.e, ", isSampled=", this.f, ", isPlaceholderCached=");
        return sq6.v(")", sb, this.g);
    }

    public /* synthetic */ hxg(gr1 gr1Var, jx8 jx8Var) {
        this(gr1Var, jx8Var, sg5.G, null, null, false, false);
    }
}
