package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kx8 {
    public final Context a;
    public final Object b;
    public final z4h c;
    public final Bitmap.Config d;
    public final uad e;
    public final List f;
    public final s5i g;
    public final wg8 h;
    public final h4h i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final f52 n;
    public final f52 o;
    public final f52 p;
    public final e45 q;
    public final e45 r;
    public final e45 s;
    public final e45 t;
    public final c4a u;
    public final y8g v;
    public final j6f w;
    public final asc x;
    public final ew5 y;
    public final ct5 z;

    public kx8(Context context, Object obj, z4h z4hVar, Bitmap.Config config, uad uadVar, List list, s5i s5iVar, wg8 wg8Var, h4h h4hVar, boolean z, boolean z2, boolean z3, boolean z4, f52 f52Var, f52 f52Var2, f52 f52Var3, e45 e45Var, e45 e45Var2, e45 e45Var3, e45 e45Var4, c4a c4aVar, y8g y8gVar, j6f j6fVar, asc ascVar, ew5 ew5Var, ct5 ct5Var) {
        this.a = context;
        this.b = obj;
        this.c = z4hVar;
        this.d = config;
        this.e = uadVar;
        this.f = list;
        this.g = s5iVar;
        this.h = wg8Var;
        this.i = h4hVar;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = f52Var;
        this.o = f52Var2;
        this.p = f52Var3;
        this.q = e45Var;
        this.r = e45Var2;
        this.s = e45Var3;
        this.t = e45Var4;
        this.u = c4aVar;
        this.v = y8gVar;
        this.w = j6fVar;
        this.x = ascVar;
        this.y = ew5Var;
        this.z = ct5Var;
    }

    public static gx8 a(kx8 kx8Var) {
        Context context = kx8Var.a;
        kx8Var.getClass();
        return new gx8(kx8Var, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx8)) {
            return false;
        }
        kx8 kx8Var = (kx8) obj;
        return x44.r(this.a, kx8Var.a) && this.b.equals(kx8Var.b) && x44.r(this.c, kx8Var.c) && this.d == kx8Var.d && this.e == kx8Var.e && x44.r(this.f, kx8Var.f) && x44.r(this.g, kx8Var.g) && x44.r(this.h, kx8Var.h) && this.i.equals(kx8Var.i) && this.j == kx8Var.j && this.k == kx8Var.k && this.l == kx8Var.l && this.m == kx8Var.m && this.n == kx8Var.n && this.o == kx8Var.o && this.p == kx8Var.p && x44.r(this.q, kx8Var.q) && x44.r(this.r, kx8Var.r) && x44.r(this.s, kx8Var.s) && x44.r(this.t, kx8Var.t) && x44.r(this.u, kx8Var.u) && this.v.equals(kx8Var.v) && this.w == kx8Var.w && this.x.equals(kx8Var.x) && this.y.equals(kx8Var.y) && x44.r(this.z, kx8Var.z);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        z4h z4hVar = this.c;
        return this.z.hashCode() + ((this.y.hashCode() + ebh.g((this.w.hashCode() + ((this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + ((this.s.hashCode() + ((this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + fsh.p(fsh.p(fsh.p(fsh.p(ebh.g((((this.g.hashCode() + kgh.m((this.e.hashCode() + ((this.d.hashCode() + ((iHashCode + (z4hVar != null ? z4hVar.hashCode() : 0)) * 923521)) * 961)) * 29791, 31, this.f)) * 31) + Arrays.hashCode(this.h.E)) * 31, 31, this.i.a), 31, this.j), 31, this.k), 31, this.l), 31, this.m)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, -1807454463, this.x.E)) * 31);
    }
}
