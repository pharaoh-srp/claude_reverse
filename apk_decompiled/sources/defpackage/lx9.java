package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lx9 implements aaf {
    public static final y5f w = dgj.K(new e69(7), new uw8(7));
    public final xr5 a = new xr5();
    public boolean b;
    public dx9 c;
    public final cp1 d;
    public final lsc e;
    public final zub f;
    public float g;
    public final it5 h;
    public final boolean i;
    public av9 j;
    public final jx9 k;
    public final ia1 l;
    public final hz9 m;
    public final n78 n;
    public final xz9 o;
    public final ax5 p;
    public final uz9 q;
    public final nwb r;
    public final nwb s;
    public final lsc t;
    public final lsc u;
    public final q28 v;

    public lx9(int i, int i2) {
        cp1 cp1Var = new cp1();
        cp1Var.b = new isc(i);
        cp1Var.c = new isc(i2);
        cp1Var.e = new pz9(i, 90, 200);
        this.d = cp1Var;
        this.e = new lsc(ox9.a, ql8.J);
        this.f = new zub();
        this.h = new it5(new tl8(8, this));
        this.i = true;
        this.k = new jx9(this, 0);
        this.l = new ia1();
        this.m = new hz9();
        this.n = new n78(17);
        this.o = new xz9(new jv0(this, i, 1));
        this.p = new ax5(18, this);
        this.q = new uz9();
        this.r = mwa.v();
        this.s = mwa.v();
        Boolean bool = Boolean.FALSE;
        this.t = mpk.P(bool);
        this.u = mpk.P(bool);
        this.v = new q28(8);
    }

    @Override // defpackage.aaf
    public final boolean a() {
        return this.h.a();
    }

    @Override // defpackage.aaf
    public final boolean b() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r6.h.c(r7, r8, r0) == r5) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.aaf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.zwb r7, defpackage.pz7 r8, defpackage.tp4 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.kx9
            if (r0 == 0) goto L13
            r0 = r9
            kx9 r0 = (defpackage.kx9) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            kx9 r0 = new kx9
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.G
            int r1 = r0.I
            r2 = 0
            r3 = 2
            r4 = 1
            m45 r5 = defpackage.m45.E
            if (r1 == 0) goto L3c
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.sf5.h0(r9)
            goto L6a
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r2
        L31:
            xzg r7 = r0.F
            r8 = r7
            pz7 r8 = (defpackage.pz7) r8
            zwb r7 = r0.E
            defpackage.sf5.h0(r9)
            goto L5b
        L3c:
            defpackage.sf5.h0(r9)
            lsc r9 = r6.e
            java.lang.Object r9 = r9.getValue()
            dx9 r1 = defpackage.ox9.a
            if (r9 != r1) goto L5b
            r0.E = r7
            r9 = r8
            xzg r9 = (defpackage.xzg) r9
            r0.F = r9
            r0.I = r4
            ia1 r9 = r6.l
            java.lang.Object r9 = r9.c(r0)
            if (r9 != r5) goto L5b
            goto L69
        L5b:
            r0.E = r2
            r0.F = r2
            r0.I = r3
            it5 r6 = r6.h
            java.lang.Object r6 = r6.c(r7, r8, r0)
            if (r6 != r5) goto L6a
        L69:
            return r5
        L6a:
            iei r6 = defpackage.iei.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lx9.c(zwb, pz7, tp4):java.lang.Object");
    }

    @Override // defpackage.aaf
    public final boolean d() {
        return ((Boolean) this.t.getValue()).booleanValue();
    }

    @Override // defpackage.aaf
    public final float e(float f) {
        return this.h.e(f);
    }

    public final void f(dx9 dx9Var, boolean z, boolean z2) {
        ex9 ex9Var;
        ex9 ex9Var2;
        ex9 ex9Var3;
        List list = dx9Var.m;
        int i = dx9Var.p;
        fx9 fx9Var = dx9Var.a;
        int i2 = dx9Var.b;
        this.o.e = list.size();
        Object obj = null;
        obj = null;
        cp1 cp1Var = this.d;
        q28 q28Var = this.v;
        if (!z && this.b) {
            this.c = dx9Var;
            rcg rcgVarZ = fd9.Z();
            bz7 bz7VarE = rcgVarZ != null ? rcgVarZ.e() : null;
            rcg rcgVarK0 = fd9.k0(rcgVarZ);
            try {
                if (!(((Number) ((nb0) q28Var.G).F.getValue()).floatValue() == MTTypesetterKt.kLineSkipLimitMultiplier) && i2 == ((isc) cp1Var.c).h() && fx9Var != null && (ex9Var3 = (ex9) mp0.E0(fx9Var.b)) != null && ex9Var3.a == ((isc) cp1Var.b).h()) {
                    q28Var.F();
                }
                return;
            } finally {
                fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
            }
        }
        if (z) {
            this.b = true;
        }
        this.g -= dx9Var.d;
        this.e.setValue(dx9Var);
        this.u.setValue(Boolean.valueOf(((fx9Var != null ? fx9Var.a : 0) == 0 && i2 == 0) ? false : true));
        this.t.setValue(Boolean.valueOf(dx9Var.c));
        if (z2) {
            cp1Var.getClass();
            if (i2 < MTTypesetterKt.kLineSkipLimitMultiplier) {
                e39.c("scrollOffset should be non-negative");
            }
            ((isc) cp1Var.c).i(i2);
        } else {
            cp1Var.getClass();
            if (fx9Var != null && (ex9Var2 = (ex9) mp0.E0(fx9Var.b)) != null) {
                obj = ex9Var2.b;
            }
            cp1Var.d = obj;
            if (cp1Var.a || i > 0) {
                cp1Var.a = true;
                if (i2 < MTTypesetterKt.kLineSkipLimitMultiplier) {
                    e39.c("scrollOffset should be non-negative (" + i2 + ')');
                }
                cp1Var.i((fx9Var == null || (ex9Var = (ex9) mp0.E0(fx9Var.b)) == null) ? 0 : ex9Var.a, i2);
            }
            if (this.i) {
                xr5 xr5Var = this.a;
                wwb wwbVar = xr5Var.b;
                int i3 = xr5Var.a;
                boolean z3 = xr5Var.c;
                if (i3 != -1 && !list.isEmpty() && i3 != xr5.a(dx9Var, z3)) {
                    xr5Var.a = -1;
                    Object[] objArr = wwbVar.E;
                    int i4 = wwbVar.G;
                    for (int i5 = 0; i5 < i4; i5++) {
                        ((wz9) objArr[i5]).cancel();
                    }
                    wwbVar.h();
                }
                int i6 = xr5Var.d;
                if (i6 != -1 && xr5Var.e != MTTypesetterKt.kLineSkipLimitMultiplier && i6 != i && !list.isEmpty()) {
                    int iA = xr5.a(dx9Var, xr5Var.e < MTTypesetterKt.kLineSkipLimitMultiplier);
                    int i7 = xr5Var.e < MTTypesetterKt.kLineSkipLimitMultiplier ? ((ex9) w44.U0(list)).a + 1 : ((ex9) w44.L0(list)).a - 1;
                    if (i7 >= 0 && i7 < i && iA != xr5Var.a && iA >= 0) {
                        xr5Var.a = iA;
                        wwbVar.h();
                        wwbVar.e(wwbVar.G, this.p.F(iA));
                    }
                }
                xr5Var.d = i;
            }
        }
        if (z) {
            q28Var.H(dx9Var.f, dx9Var.i, dx9Var.h);
        }
    }

    public final dx9 g() {
        return (dx9) this.e.getValue();
    }

    public final void h(float f, dx9 dx9Var) {
        if (this.i) {
            xr5 xr5Var = this.a;
            wwb wwbVar = xr5Var.b;
            List list = dx9Var.m;
            List list2 = dx9Var.m;
            ukc ukcVar = dx9Var.q;
            if (!list.isEmpty()) {
                int i = 0;
                boolean z = f < MTTypesetterKt.kLineSkipLimitMultiplier;
                int iA = xr5.a(dx9Var, z);
                int i2 = z ? ((ex9) w44.U0(list2)).a + 1 : ((ex9) w44.L0(list2)).a - 1;
                if (i2 >= 0 && i2 < dx9Var.p) {
                    if (iA != xr5Var.a && iA >= 0) {
                        if (xr5Var.c != z) {
                            Object[] objArr = wwbVar.E;
                            int i3 = wwbVar.G;
                            for (int i4 = 0; i4 < i3; i4++) {
                                ((wz9) objArr[i4]).cancel();
                            }
                        }
                        xr5Var.c = z;
                        xr5Var.a = iA;
                        wwbVar.h();
                        wwbVar.e(wwbVar.G, this.p.F(iA));
                    }
                    if (z) {
                        ex9 ex9Var = (ex9) w44.U0(list2);
                        if (((dvj.g(ex9Var, ukcVar) + ((int) (ukcVar == ukc.E ? ex9Var.s & 4294967295L : ex9Var.s >> 32))) + dx9Var.s) - dx9Var.o < (-f)) {
                            Object[] objArr2 = wwbVar.E;
                            int i5 = wwbVar.G;
                            while (i < i5) {
                                ((wz9) objArr2[i]).a();
                                i++;
                            }
                        }
                    } else if (dx9Var.n - dvj.g((ex9) w44.L0(list2), ukcVar) < f) {
                        Object[] objArr3 = wwbVar.E;
                        int i6 = wwbVar.G;
                        while (i < i6) {
                            ((wz9) objArr3[i]).a();
                            i++;
                        }
                    }
                }
            }
            xr5Var.e = f;
        }
    }
}
