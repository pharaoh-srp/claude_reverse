package defpackage;

import android.content.Context;
import java.util.Map;
import okio.FileSystem;

/* JADX INFO: loaded from: classes2.dex */
public final class jx8 {
    public final Context a;
    public final Object b;
    public final y4h c;
    public final String d;
    public final Map e;
    public final FileSystem f;
    public final c45 g;
    public final c45 h;
    public final c45 i;
    public final e52 j;
    public final e52 k;
    public final e52 l;
    public final mab m;
    public final bz7 n;
    public final bz7 o;
    public final bz7 p;
    public final x8g q;
    public final k6f r;
    public final tad s;
    public final be7 t;
    public final ix8 u;
    public final hx8 v;

    public jx8(Context context, Object obj, y4h y4hVar, String str, Map map, FileSystem fileSystem, c45 c45Var, c45 c45Var2, c45 c45Var3, e52 e52Var, e52 e52Var2, e52 e52Var3, mab mabVar, bz7 bz7Var, bz7 bz7Var2, bz7 bz7Var3, x8g x8gVar, k6f k6fVar, tad tadVar, be7 be7Var, ix8 ix8Var, hx8 hx8Var) {
        this.a = context;
        this.b = obj;
        this.c = y4hVar;
        this.d = str;
        this.e = map;
        this.f = fileSystem;
        this.g = c45Var;
        this.h = c45Var2;
        this.i = c45Var3;
        this.j = e52Var;
        this.k = e52Var2;
        this.l = e52Var3;
        this.m = mabVar;
        this.n = bz7Var;
        this.o = bz7Var2;
        this.p = bz7Var3;
        this.q = x8gVar;
        this.r = k6fVar;
        this.s = tadVar;
        this.t = be7Var;
        this.u = ix8Var;
        this.v = hx8Var;
    }

    public static fx8 v(jx8 jx8Var) {
        Context context = jx8Var.a;
        jx8Var.getClass();
        return new fx8(jx8Var, context);
    }

    public final wv8 a() {
        wv8 wv8Var = (wv8) this.o.invoke(this);
        return wv8Var == null ? (wv8) this.v.i.invoke(this) : wv8Var;
    }

    public final wv8 b() {
        wv8 wv8Var = (wv8) this.p.invoke(this);
        return wv8Var == null ? (wv8) this.v.j.invoke(this) : wv8Var;
    }

    public final Context c() {
        return this.a;
    }

    public final Object d() {
        return this.b;
    }

    public final c45 e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jx8)) {
            return false;
        }
        jx8 jx8Var = (jx8) obj;
        return x44.r(this.a, jx8Var.a) && this.b.equals(jx8Var.b) && x44.r(this.c, jx8Var.c) && x44.r(this.d, jx8Var.d) && this.e.equals(jx8Var.e) && x44.r(this.f, jx8Var.f) && x44.r(this.g, jx8Var.g) && x44.r(this.h, jx8Var.h) && x44.r(this.i, jx8Var.i) && this.j == jx8Var.j && this.k == jx8Var.k && this.l == jx8Var.l && x44.r(this.m, jx8Var.m) && x44.r(this.n, jx8Var.n) && x44.r(this.o, jx8Var.o) && x44.r(this.p, jx8Var.p) && x44.r(this.q, jx8Var.q) && this.r == jx8Var.r && this.s == jx8Var.s && this.t.equals(jx8Var.t) && this.u.equals(jx8Var.u) && x44.r(this.v, jx8Var.v);
    }

    public final hx8 f() {
        return this.v;
    }

    public final ix8 g() {
        return this.u;
    }

    public final e52 h() {
        return this.k;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        y4h y4hVar = this.c;
        int iHashCode2 = (iHashCode + (y4hVar == null ? 0 : y4hVar.hashCode())) * 961;
        String str = this.d;
        int iHashCode3 = (this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ebh.g((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 961, this.e)) * 29791)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        mab mabVar = this.m;
        return this.v.hashCode() + ((this.u.hashCode() + ebh.g((this.s.hashCode() + ((this.r.hashCode() + ((this.q.hashCode() + qy1.e(this.p, qy1.e(this.o, qy1.e(this.n, (iHashCode3 + (mabVar != null ? mabVar.hashCode() : 0)) * 31, 31), 31), 31)) * 31)) * 31)) * 31, 31, this.t.a)) * 31);
    }

    public final be7 i() {
        return this.t;
    }

    public final c45 j() {
        return this.h;
    }

    public final FileSystem k() {
        return this.f;
    }

    public final c45 l() {
        return this.g;
    }

    public final String m() {
        return this.d;
    }

    public final Map n() {
        return this.e;
    }

    public final e52 o() {
        return this.j;
    }

    public final e52 p() {
        return this.l;
    }

    public final mab q() {
        return this.m;
    }

    public final tad r() {
        return this.s;
    }

    public final k6f s() {
        return this.r;
    }

    public final x8g t() {
        return this.q;
    }

    public final String toString() {
        return "ImageRequest(context=" + this.a + ", data=" + this.b + ", target=" + this.c + ", listener=null, memoryCacheKey=" + this.d + ", memoryCacheKeyExtras=" + this.e + ", diskCacheKey=null, fileSystem=" + this.f + ", fetcherFactory=null, decoderFactory=null, interceptorCoroutineContext=" + this.g + ", fetcherCoroutineContext=" + this.h + ", decoderCoroutineContext=" + this.i + ", memoryCachePolicy=" + this.j + ", diskCachePolicy=" + this.k + ", networkCachePolicy=" + this.l + ", placeholderMemoryCacheKey=" + this.m + ", placeholderFactory=" + this.n + ", errorFactory=" + this.o + ", fallbackFactory=" + this.p + ", sizeResolver=" + this.q + ", scale=" + this.r + ", precision=" + this.s + ", extras=" + this.t + ", defined=" + this.u + ", defaults=" + this.v + ")";
    }

    public final y4h u() {
        return this.c;
    }

    public final wv8 w() {
        wv8 wv8Var = (wv8) this.n.invoke(this);
        return wv8Var == null ? (wv8) this.v.h.invoke(this) : wv8Var;
    }
}
