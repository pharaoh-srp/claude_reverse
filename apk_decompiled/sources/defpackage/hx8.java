package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import okio.FileSystem;
import okio.JvmSystemFileSystem;

/* JADX INFO: loaded from: classes.dex */
public final class hx8 {
    public static final hx8 o;
    public final FileSystem a;
    public final c45 b;
    public final c45 c;
    public final c45 d;
    public final e52 e;
    public final e52 f;
    public final e52 g;
    public final bz7 h;
    public final bz7 i;
    public final bz7 j;
    public final x8g k;
    public final k6f l;
    public final tad m;
    public final be7 n;

    static {
        wl0 wl0Var = wl0.Q;
        JvmSystemFileSystem jvmSystemFileSystem = FileSystem.E;
        ft5 ft5Var = g86.a;
        vr5 vr5Var = vr5.G;
        a5e a5eVar = x8g.m;
        tad tadVar = tad.E;
        be7 be7Var = be7.b;
        im6 im6Var = im6.E;
        e52 e52Var = e52.ENABLED;
        o = new hx8(jvmSystemFileSystem, im6Var, vr5Var, vr5Var, e52Var, e52Var, e52Var, wl0Var, wl0Var, wl0Var, a5eVar, k6f.F, tadVar, be7Var);
    }

    public hx8(FileSystem fileSystem, c45 c45Var, c45 c45Var2, c45 c45Var3, e52 e52Var, e52 e52Var2, e52 e52Var3, bz7 bz7Var, bz7 bz7Var2, bz7 bz7Var3, x8g x8gVar, k6f k6fVar, tad tadVar, be7 be7Var) {
        this.a = fileSystem;
        this.b = c45Var;
        this.c = c45Var2;
        this.d = c45Var3;
        this.e = e52Var;
        this.f = e52Var2;
        this.g = e52Var3;
        this.h = bz7Var;
        this.i = bz7Var2;
        this.j = bz7Var3;
        this.k = x8gVar;
        this.l = k6fVar;
        this.m = tadVar;
        this.n = be7Var;
    }

    public static hx8 a(hx8 hx8Var, e45 e45Var, e45 e45Var2, e45 e45Var3, be7 be7Var, int i) {
        FileSystem fileSystem = hx8Var.a;
        c45 c45Var = (i & 2) != 0 ? hx8Var.b : e45Var;
        c45 c45Var2 = (i & 4) != 0 ? hx8Var.c : e45Var2;
        c45 c45Var3 = (i & 8) != 0 ? hx8Var.d : e45Var3;
        e52 e52Var = hx8Var.e;
        e52 e52Var2 = (i & 32) != 0 ? hx8Var.f : e52.DISABLED;
        e52 e52Var3 = hx8Var.g;
        c45 c45Var4 = c45Var;
        c45 c45Var5 = c45Var2;
        c45 c45Var6 = c45Var3;
        e52 e52Var4 = e52Var2;
        bz7 bz7Var = hx8Var.h;
        bz7 bz7Var2 = hx8Var.i;
        bz7 bz7Var3 = hx8Var.j;
        x8g x8gVar = hx8Var.k;
        k6f k6fVar = hx8Var.l;
        tad tadVar = hx8Var.m;
        be7 be7Var2 = (i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? hx8Var.n : be7Var;
        hx8Var.getClass();
        return new hx8(fileSystem, c45Var4, c45Var5, c45Var6, e52Var, e52Var4, e52Var3, bz7Var, bz7Var2, bz7Var3, x8gVar, k6fVar, tadVar, be7Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx8)) {
            return false;
        }
        hx8 hx8Var = (hx8) obj;
        return x44.r(this.a, hx8Var.a) && x44.r(this.b, hx8Var.b) && x44.r(this.c, hx8Var.c) && x44.r(this.d, hx8Var.d) && this.e == hx8Var.e && this.f == hx8Var.f && this.g == hx8Var.g && x44.r(this.h, hx8Var.h) && x44.r(this.i, hx8Var.i) && x44.r(this.j, hx8Var.j) && x44.r(this.k, hx8Var.k) && this.l == hx8Var.l && this.m == hx8Var.m && x44.r(this.n, hx8Var.n);
    }

    public final int hashCode() {
        return this.n.a.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + qy1.e(this.j, qy1.e(this.i, qy1.e(this.h, (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31), 31), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Defaults(fileSystem=" + this.a + ", interceptorCoroutineContext=" + this.b + ", fetcherCoroutineContext=" + this.c + ", decoderCoroutineContext=" + this.d + ", memoryCachePolicy=" + this.e + ", diskCachePolicy=" + this.f + ", networkCachePolicy=" + this.g + ", placeholderFactory=" + this.h + ", errorFactory=" + this.i + ", fallbackFactory=" + this.j + ", sizeResolver=" + this.k + ", scale=" + this.l + ", precision=" + this.m + ", extras=" + this.n + ")";
    }
}
