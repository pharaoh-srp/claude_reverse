package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class rjc {
    public final Context a;
    public final Bitmap.Config b;
    public final i8g c;
    public final j6f d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final wg8 h;
    public final h4h i;
    public final asc j;
    public final f52 k;
    public final f52 l;
    public final f52 m;

    public rjc(Context context, Bitmap.Config config, i8g i8gVar, j6f j6fVar, boolean z, boolean z2, boolean z3, wg8 wg8Var, h4h h4hVar, asc ascVar, f52 f52Var, f52 f52Var2, f52 f52Var3) {
        this.a = context;
        this.b = config;
        this.c = i8gVar;
        this.d = j6fVar;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = wg8Var;
        this.i = h4hVar;
        this.j = ascVar;
        this.k = f52Var;
        this.l = f52Var2;
        this.m = f52Var3;
    }

    public static rjc a(rjc rjcVar) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Context context = rjcVar.a;
        rjcVar.getClass();
        i8g i8gVar = rjcVar.c;
        j6f j6fVar = rjcVar.d;
        boolean z = rjcVar.e;
        boolean z2 = rjcVar.f;
        boolean z3 = rjcVar.g;
        rjcVar.getClass();
        wg8 wg8Var = rjcVar.h;
        h4h h4hVar = rjcVar.i;
        asc ascVar = rjcVar.j;
        f52 f52Var = rjcVar.k;
        f52 f52Var2 = rjcVar.l;
        f52 f52Var3 = rjcVar.m;
        rjcVar.getClass();
        return new rjc(context, config, i8gVar, j6fVar, z, z2, z3, wg8Var, h4hVar, ascVar, f52Var, f52Var2, f52Var3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rjc)) {
            return false;
        }
        rjc rjcVar = (rjc) obj;
        return x44.r(this.a, rjcVar.a) && this.b == rjcVar.b && x44.r(this.c, rjcVar.c) && this.d == rjcVar.d && this.e == rjcVar.e && this.f == rjcVar.f && this.g == rjcVar.g && x44.r(this.h, rjcVar.h) && this.i.equals(rjcVar.i) && this.j.equals(rjcVar.j) && this.k == rjcVar.k && this.l == rjcVar.l && this.m == rjcVar.m;
    }

    public final int hashCode() {
        return this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ebh.g(ebh.g((fsh.p(fsh.p(fsh.p((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 961)) * 31)) * 31, 31, this.e), 31, this.f), 961, this.g) + Arrays.hashCode(this.h.E)) * 31, 31, this.i.a), 31, this.j.E)) * 31)) * 31);
    }
}
