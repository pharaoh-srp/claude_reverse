package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ix8 {
    public final c45 a;
    public final c45 b;
    public final c45 c;
    public final bz7 d;
    public final bz7 e;
    public final bz7 f;
    public final x8g g;
    public final k6f h;
    public final tad i;

    public ix8(c45 c45Var, c45 c45Var2, c45 c45Var3, bz7 bz7Var, bz7 bz7Var2, bz7 bz7Var3, x8g x8gVar, k6f k6fVar, tad tadVar) {
        this.a = c45Var;
        this.b = c45Var2;
        this.c = c45Var3;
        this.d = bz7Var;
        this.e = bz7Var2;
        this.f = bz7Var3;
        this.g = x8gVar;
        this.h = k6fVar;
        this.i = tadVar;
    }

    public final tad a() {
        return this.i;
    }

    public final k6f b() {
        return this.h;
    }

    public final x8g c() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ix8)) {
            return false;
        }
        ix8 ix8Var = (ix8) obj;
        return x44.r(this.a, ix8Var.a) && x44.r(this.b, ix8Var.b) && x44.r(this.c, ix8Var.c) && x44.r(this.d, ix8Var.d) && x44.r(this.e, ix8Var.e) && x44.r(this.f, ix8Var.f) && x44.r(this.g, ix8Var.g) && this.h == ix8Var.h && this.i == ix8Var.i;
    }

    public final int hashCode() {
        c45 c45Var = this.a;
        int iHashCode = (c45Var == null ? 0 : c45Var.hashCode()) * 31;
        c45 c45Var2 = this.b;
        int iHashCode2 = (iHashCode + (c45Var2 == null ? 0 : c45Var2.hashCode())) * 31;
        c45 c45Var3 = this.c;
        int iHashCode3 = (iHashCode2 + (c45Var3 == null ? 0 : c45Var3.hashCode())) * 923521;
        bz7 bz7Var = this.d;
        int iHashCode4 = (iHashCode3 + (bz7Var == null ? 0 : bz7Var.hashCode())) * 31;
        bz7 bz7Var2 = this.e;
        int iHashCode5 = (iHashCode4 + (bz7Var2 == null ? 0 : bz7Var2.hashCode())) * 31;
        bz7 bz7Var3 = this.f;
        int iHashCode6 = (iHashCode5 + (bz7Var3 == null ? 0 : bz7Var3.hashCode())) * 31;
        x8g x8gVar = this.g;
        int iHashCode7 = (iHashCode6 + (x8gVar == null ? 0 : x8gVar.hashCode())) * 31;
        k6f k6fVar = this.h;
        int iHashCode8 = (iHashCode7 + (k6fVar == null ? 0 : k6fVar.hashCode())) * 31;
        tad tadVar = this.i;
        return iHashCode8 + (tadVar != null ? tadVar.hashCode() : 0);
    }

    public final String toString() {
        return "Defined(fileSystem=null, interceptorCoroutineContext=" + this.a + ", fetcherCoroutineContext=" + this.b + ", decoderCoroutineContext=" + this.c + ", memoryCachePolicy=null, diskCachePolicy=null, networkCachePolicy=null, placeholderFactory=" + this.d + ", errorFactory=" + this.e + ", fallbackFactory=" + this.f + ", sizeResolver=" + this.g + ", scale=" + this.h + ", precision=" + this.i + ")";
    }
}
