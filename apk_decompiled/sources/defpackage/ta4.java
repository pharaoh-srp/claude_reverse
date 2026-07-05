package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ta4 implements pz7, rz7, sz7, tz7, uz7, vz7, wz7, xz7, az7, cz7, ez7, fz7, gz7, hz7, iz7, jz7, kz7, mz7, nz7 {
    public final int E;
    public final boolean F;
    public qz7 G;
    public r7e H;
    public ArrayList I;

    public ta4(int i, boolean z, qz7 qz7Var) {
        this.E = i;
        this.F = z;
        this.G = qz7Var;
    }

    public final Object d(int i, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(this.E);
        o(e18Var);
        int iV = i | (e18Var.f(this) ? fd9.v(2, 0) : fd9.v(1, 0));
        qz7 qz7Var = this.G;
        nai.n(2, qz7Var);
        Object objInvoke = ((pz7) qz7Var).invoke(e18Var, Integer.valueOf(iV));
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new sa4(2, 8, ta4.class, this, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;");
        }
        return objInvoke;
    }

    public final Object e(Object obj, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(this.E);
        o(e18Var);
        int i2 = 1;
        int iV = e18Var.f(this) ? fd9.v(2, 1) : fd9.v(1, 1);
        qz7 qz7Var = this.G;
        nai.n(3, qz7Var);
        Object objInvoke = ((rz7) qz7Var).invoke(obj, e18Var, Integer.valueOf(iV | i));
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new kb2(this, obj, i, i2);
        }
        return objInvoke;
    }

    public final Object f(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(this.E);
        o(e18Var);
        int iV = e18Var.f(this) ? fd9.v(2, 6) : fd9.v(1, 6);
        qz7 qz7Var = this.G;
        nai.n(8, qz7Var);
        Object objJ = ((wz7) qz7Var).j(obj, bool, obj2, obj3, obj4, e18Var, Integer.valueOf(i | iV));
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new hl(this, obj, bool, obj2, obj3, obj4, i);
        }
        return objJ;
    }

    public final Object g(Object obj, Object obj2, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(this.E);
        o(e18Var);
        int iV = e18Var.f(this) ? fd9.v(2, 2) : fd9.v(1, 2);
        qz7 qz7Var = this.G;
        nai.n(4, qz7Var);
        Object objI = ((sz7) qz7Var).i(obj, obj2, e18Var, Integer.valueOf(iV | i));
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fb0(this, i, obj, obj2, 1);
        }
        return objI;
    }

    public final Object h(Object obj, Object obj2, Object obj3, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(this.E);
        o(e18Var);
        int iV = e18Var.f(this) ? fd9.v(2, 3) : fd9.v(1, 3);
        qz7 qz7Var = this.G;
        nai.n(5, qz7Var);
        Object objM = ((tz7) qz7Var).m(obj, obj2, obj3, e18Var, Integer.valueOf(iV | i));
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xd(this, obj, obj2, obj3, i, 18);
        }
        return objM;
    }

    @Override // defpackage.sz7
    public final /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        return g(obj, obj2, (ld4) obj3, ((Number) obj4).intValue());
    }

    @Override // defpackage.pz7
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return d(((Number) obj2).intValue(), (ld4) obj);
    }

    @Override // defpackage.wz7
    public final /* bridge */ /* synthetic */ Object j(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, e18 e18Var, Integer num) {
        return f(obj, bool, obj2, obj3, obj4, e18Var, num.intValue());
    }

    @Override // defpackage.uz7
    public final /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return n(obj, obj2, obj3, obj4, (ld4) obj5, ((Number) obj6).intValue());
    }

    @Override // defpackage.tz7
    public final /* bridge */ /* synthetic */ Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return h(obj, obj2, obj3, (ld4) obj4, ((Number) obj5).intValue());
    }

    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(this.E);
        o(e18Var);
        int iV = e18Var.f(this) ? fd9.v(2, 4) : fd9.v(1, 4);
        qz7 qz7Var = this.G;
        nai.n(6, qz7Var);
        Object objL = ((uz7) qz7Var).l(obj, obj2, obj3, obj4, e18Var, Integer.valueOf(i | iV));
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pk(this, obj, obj2, obj3, obj4, i, 6);
        }
        return objL;
    }

    public final void o(ld4 ld4Var) {
        r7e r7eVarZ;
        if (!this.F || (r7eVarZ = ((e18) ld4Var).z()) == null) {
            return;
        }
        r7eVarZ.b |= 1;
        r7e r7eVar = this.H;
        if (r7eVar == null || !r7eVar.a() || r7eVar == r7eVarZ || x44.r(r7eVar.c, r7eVarZ.c)) {
            this.H = r7eVarZ;
            return;
        }
        ArrayList arrayList = this.I;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.I = arrayList2;
            arrayList2.add(r7eVarZ);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            r7e r7eVar2 = (r7e) arrayList.get(i);
            if (r7eVar2 == null || !r7eVar2.a() || r7eVar2 == r7eVarZ || x44.r(r7eVar2.c, r7eVarZ.c)) {
                arrayList.set(i, r7eVarZ);
                return;
            }
        }
        arrayList.add(r7eVarZ);
    }

    @Override // defpackage.rz7
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return e(obj, (ld4) obj2, ((Number) obj3).intValue());
    }
}
