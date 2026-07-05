package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a80 {
    public final c9i a;
    public final Object b;
    public final nb0 c;
    public final lsc d;
    public final lsc e;
    public Object f;
    public Object g;
    public final gxb h;
    public final yig i;
    public final sb0 j;
    public final sb0 k;
    public sb0 l;
    public sb0 m;

    public a80(Object obj, c9i c9iVar, Object obj2) {
        this.a = c9iVar;
        this.b = obj2;
        nb0 nb0Var = new nb0(c9iVar, obj, null, 60);
        this.c = nb0Var;
        this.d = mpk.P(Boolean.FALSE);
        this.e = mpk.P(obj);
        this.h = new gxb();
        this.i = new yig(3, obj2);
        sb0 sb0Var = nb0Var.G;
        boolean z = sb0Var instanceof ob0;
        sb0 sb0Var2 = z ? zh4.e : sb0Var instanceof pb0 ? zh4.f : sb0Var instanceof qb0 ? zh4.g : zh4.h;
        this.j = sb0Var2;
        sb0 sb0Var3 = z ? zh4.a : sb0Var instanceof pb0 ? zh4.b : sb0Var instanceof qb0 ? zh4.c : zh4.d;
        this.k = sb0Var3;
        this.l = sb0Var2;
        this.m = sb0Var3;
    }

    public static final void a(a80 a80Var) {
        nb0 nb0Var = a80Var.c;
        nb0Var.G.d();
        nb0Var.H = Long.MIN_VALUE;
        a80Var.d.setValue(Boolean.FALSE);
    }

    public static Object b(a80 a80Var, Float f, zn5 zn5Var, xzg xzgVar) {
        Object objE = a80Var.e();
        c9i c9iVar = a80Var.a;
        return gxb.a(a80Var.h, new y70(a80Var, f, new yn5(zn5Var, c9iVar, objE, (sb0) c9iVar.a().invoke(f)), a80Var.c.H, null, null), xzgVar);
    }

    public static Object c(a80 a80Var, Object obj, mb0 mb0Var, bz7 bz7Var, tp4 tp4Var, int i) {
        if ((i & 2) != 0) {
            mb0Var = a80Var.i;
        }
        mb0 mb0Var2 = mb0Var;
        Object objInvoke = a80Var.a.b().invoke(a80Var.c.G);
        if ((i & 8) != 0) {
            bz7Var = null;
        }
        bz7 bz7Var2 = bz7Var;
        Object objE = a80Var.e();
        c9i c9iVar = a80Var.a;
        return gxb.a(a80Var.h, new y70(a80Var, objInvoke, new a5h(mb0Var2, c9iVar, objE, obj, (sb0) c9iVar.a().invoke(objInvoke)), a80Var.c.H, bz7Var2, null), tp4Var);
    }

    public final Object d(Object obj) {
        if (!x44.r(this.l, this.j) || !x44.r(this.m, this.k)) {
            c9i c9iVar = this.a;
            sb0 sb0Var = (sb0) c9iVar.a().invoke(obj);
            int iB = sb0Var.b();
            boolean z = false;
            for (int i = 0; i < iB; i++) {
                if (sb0Var.a(i) < this.l.a(i) || sb0Var.a(i) > this.m.a(i)) {
                    sb0Var.e(i, wd6.d0(sb0Var.a(i), this.l.a(i), this.m.a(i)));
                    z = true;
                }
            }
            if (z) {
                return c9iVar.b().invoke(sb0Var);
            }
        }
        return obj;
    }

    public final Object e() {
        return this.c.F.getValue();
    }

    public final boolean f() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    public final Object g(tp4 tp4Var, Object obj) {
        Object objA = gxb.a(this.h, new f30(this, obj, null, 2), tp4Var);
        return objA == m45.E ? objA : iei.a;
    }

    public final Object h(xzg xzgVar) {
        Object objA = gxb.a(this.h, new jp(this, null, 1), xzgVar);
        return objA == m45.E ? objA : iei.a;
    }

    public final void i(Float f, Float f2) {
        sb0 sb0Var;
        sb0 sb0Var2;
        c9i c9iVar = this.a;
        if (f == null || (sb0Var = (sb0) c9iVar.a().invoke(f)) == null) {
            sb0Var = this.j;
        }
        if (f2 == null || (sb0Var2 = (sb0) c9iVar.a().invoke(f2)) == null) {
            sb0Var2 = this.k;
        }
        int iB = sb0Var.b();
        for (int i = 0; i < iB; i++) {
            if (sb0Var.a(i) > sb0Var2.a(i)) {
                bbd.b("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + sb0Var + " is greater than upper bound " + sb0Var2 + " on index " + i);
            }
        }
        this.l = sb0Var;
        this.m = sb0Var2;
        this.g = f2;
        this.f = f;
        if (f()) {
            return;
        }
        Object objD = d(e());
        if (x44.r(objD, e())) {
            return;
        }
        this.c.F.setValue(objD);
    }

    public /* synthetic */ a80(Object obj, d9i d9iVar, Object obj2, int i) {
        this(obj, d9iVar, (i & 4) != 0 ? null : obj2);
    }
}
