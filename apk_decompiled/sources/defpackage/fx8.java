package defpackage;

import android.content.Context;
import java.util.Map;
import okio.FileSystem;

/* JADX INFO: loaded from: classes2.dex */
public final class fx8 {
    public final Context a;
    public hx8 b;
    public Object c;
    public y4h d;
    public String e;
    public final Map f;
    public c45 g;
    public c45 h;
    public c45 i;
    public mab j;
    public final bz7 k;
    public final bz7 l;
    public final bz7 m;
    public x8g n;
    public k6f o;
    public tad p;
    public Object q;

    public fx8(jx8 jx8Var, Context context) {
        this.a = context;
        this.b = jx8Var.v;
        this.c = jx8Var.b;
        this.d = jx8Var.c;
        this.e = jx8Var.d;
        this.f = jx8Var.e;
        ix8 ix8Var = jx8Var.u;
        this.g = ix8Var.a;
        this.h = ix8Var.b;
        this.i = ix8Var.c;
        this.j = jx8Var.m;
        this.k = ix8Var.d;
        this.l = ix8Var.e;
        this.m = ix8Var.f;
        this.n = ix8Var.g;
        this.o = ix8Var.h;
        this.p = ix8Var.i;
        this.q = jx8Var.t;
    }

    public final jx8 a() {
        Map mapV;
        be7 be7Var;
        Object obj = this.c;
        if (obj == null) {
            obj = j9c.a;
        }
        Object obj2 = obj;
        y4h y4hVar = this.d;
        String str = this.e;
        Boolean bool = Boolean.FALSE;
        Map map = this.f;
        if (x44.r(map, bool)) {
            map.getClass();
            mapV = mwa.V(nai.l(map));
        } else {
            if (!(map instanceof Map)) {
                mr9.u();
                return null;
            }
            mapV = map;
        }
        Map map2 = mapV;
        map2.getClass();
        hx8 hx8Var = this.b;
        FileSystem fileSystem = hx8Var.a;
        e52 e52Var = hx8Var.e;
        e52 e52Var2 = hx8Var.f;
        e52 e52Var3 = hx8Var.g;
        c45 c45Var = this.g;
        if (c45Var == null) {
            c45Var = hx8Var.b;
        }
        c45 c45Var2 = c45Var;
        c45 c45Var3 = this.h;
        if (c45Var3 == null) {
            c45Var3 = hx8Var.c;
        }
        c45 c45Var4 = c45Var3;
        c45 c45Var5 = this.i;
        if (c45Var5 == null) {
            c45Var5 = hx8Var.d;
        }
        c45 c45Var6 = c45Var5;
        mab mabVar = this.j;
        bz7 bz7Var = this.k;
        if (bz7Var == null) {
            bz7Var = hx8Var.h;
        }
        bz7 bz7Var2 = bz7Var;
        bz7 bz7Var3 = this.l;
        if (bz7Var3 == null) {
            bz7Var3 = hx8Var.i;
        }
        bz7 bz7Var4 = bz7Var3;
        bz7 bz7Var5 = this.m;
        if (bz7Var5 == null) {
            bz7Var5 = hx8Var.j;
        }
        bz7 bz7Var6 = bz7Var5;
        x8g x8gVar = this.n;
        if (x8gVar == null) {
            x8gVar = hx8Var.k;
        }
        x8g x8gVar2 = x8gVar;
        k6f k6fVar = this.o;
        if (k6fVar == null) {
            k6fVar = hx8Var.l;
        }
        k6f k6fVar2 = k6fVar;
        tad tadVar = this.p;
        if (tadVar == null) {
            tadVar = hx8Var.m;
        }
        tad tadVar2 = tadVar;
        Object obj3 = this.q;
        if (obj3 instanceof ae7) {
            be7Var = new be7(mwa.V(((ae7) obj3).a));
        } else {
            if (!(obj3 instanceof be7)) {
                mr9.u();
                return null;
            }
            be7Var = (be7) obj3;
        }
        return new jx8(this.a, obj2, y4hVar, str, map2, fileSystem, c45Var2, c45Var4, c45Var6, e52Var, e52Var2, e52Var3, mabVar, bz7Var2, bz7Var4, bz7Var6, x8gVar2, k6fVar2, tadVar2, be7Var, new ix8(this.g, this.h, this.i, this.k, this.l, this.m, this.n, this.o, this.p), this.b);
    }

    public final void b(String str) {
        this.c = str;
    }

    public final void c(hx8 hx8Var) {
        this.b = hx8Var;
    }

    public final ae7 d() {
        Object obj = this.q;
        if (obj instanceof ae7) {
            return (ae7) obj;
        }
        if (!(obj instanceof be7)) {
            mr9.u();
            return null;
        }
        ae7 ae7Var = new ae7((be7) obj);
        this.q = ae7Var;
        return ae7Var;
    }

    public final void e(String str) {
        this.j = str != null ? new mab(str, nm6.E) : null;
    }

    public final void f(tad tadVar) {
        this.p = tadVar;
    }

    public final void g(k6f k6fVar) {
        this.o = k6fVar;
    }

    public final void h(x8g x8gVar) {
        this.n = x8gVar;
    }

    public fx8(Context context) {
        this.a = context;
        this.b = hx8.o;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = nm6.E;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        wl0 wl0Var = wl0.Q;
        this.k = wl0Var;
        this.l = wl0Var;
        this.m = wl0Var;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = be7.b;
    }
}
