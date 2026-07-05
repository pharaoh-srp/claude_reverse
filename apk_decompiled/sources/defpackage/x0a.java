package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x0a implements aaf {
    public static final y5f y = dgj.K(new fg7(26), new gg7(20));
    public final zr5 a;
    public boolean b;
    public p0a c;
    public boolean d;
    public final y50 e;
    public final lsc f;
    public final zub g;
    public float h;
    public boolean i;
    public final it5 j;
    public final boolean k;
    public av9 l;
    public final v0a m;
    public final ia1 n;
    public final hz9 o;
    public final n78 p;
    public final xz9 q;
    public final efe r;
    public final uz9 s;
    public final nwb t;
    public final lsc u;
    public final lsc v;
    public final nwb w;
    public final q28 x;

    public x0a(int i, int i2) {
        zr5 zr5Var = new zr5();
        zr5Var.a = -1;
        zr5Var.d = -1;
        this.a = zr5Var;
        y50 y50Var = new y50();
        y50Var.b = new isc(i);
        y50Var.c = new isc(i2);
        y50Var.e = new pz9(i, 30, 100);
        this.e = y50Var;
        this.f = new lsc(a1a.a, ql8.J);
        this.g = new zub();
        this.j = new it5(new tz9(3, this));
        this.k = true;
        this.m = new v0a(this);
        this.n = new ia1();
        this.o = new hz9();
        this.p = new n78(17);
        this.q = new xz9(new t63(this, i, 1));
        this.r = new efe(19, this);
        this.s = new uz9();
        this.t = mwa.v();
        Boolean bool = Boolean.FALSE;
        this.u = mpk.P(bool);
        this.v = mpk.P(bool);
        this.w = mwa.v();
        this.x = new q28(8);
    }

    public static Object k(x0a x0aVar, int i, tp4 tp4Var) {
        x0aVar.getClass();
        Object objC = x0aVar.c(zwb.E, new nt4(x0aVar, i, (tp4) null), tp4Var);
        return objC == m45.E ? objC : iei.a;
    }

    @Override // defpackage.aaf
    public final boolean a() {
        return this.j.a();
    }

    @Override // defpackage.aaf
    public final boolean b() {
        return ((Boolean) this.v.getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r6.j.c(r7, r8, r0) == r5) goto L23;
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
            boolean r0 = r9 instanceof defpackage.w0a
            if (r0 == 0) goto L13
            r0 = r9
            w0a r0 = (defpackage.w0a) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            w0a r0 = new w0a
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
            lsc r9 = r6.f
            java.lang.Object r9 = r9.getValue()
            p0a r1 = defpackage.a1a.a
            if (r9 != r1) goto L5b
            r0.E = r7
            r9 = r8
            xzg r9 = (defpackage.xzg) r9
            r0.F = r9
            r0.I = r4
            ia1 r9 = r6.n
            java.lang.Object r9 = r9.c(r0)
            if (r9 != r5) goto L5b
            goto L69
        L5b:
            r0.E = r2
            r0.F = r2
            r0.I = r3
            it5 r6 = r6.j
            java.lang.Object r6 = r6.c(r7, r8, r0)
            if (r6 != r5) goto L6a
        L69:
            return r5
        L6a:
            iei r6 = defpackage.iei.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x0a.c(zwb, pz7, tp4):java.lang.Object");
    }

    @Override // defpackage.aaf
    public final boolean d() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    @Override // defpackage.aaf
    public final float e(float f) {
        return this.j.e(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v2, types: [iei, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r6, int r7, defpackage.vp4 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.u0a
            if (r0 == 0) goto L13
            r0 = r8
            u0a r0 = (defpackage.u0a) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            u0a r0 = new u0a
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L2f
            if (r1 != r4) goto L29
            defpackage.sf5.h0(r8)     // Catch: java.lang.Throwable -> L27
            goto L46
        L27:
            r6 = move-exception
            goto L4b
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            return r2
        L2f:
            defpackage.sf5.h0(r8)
            r5.i = r4     // Catch: java.lang.Throwable -> L27
            bn5 r8 = new bn5     // Catch: java.lang.Throwable -> L27
            r8.<init>(r6, r7, r2, r5)     // Catch: java.lang.Throwable -> L27
            r0.G = r4     // Catch: java.lang.Throwable -> L27
            zwb r6 = defpackage.zwb.E     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = r5.c(r6, r8, r0)     // Catch: java.lang.Throwable -> L27
            m45 r7 = defpackage.m45.E
            if (r6 != r7) goto L46
            return r7
        L46:
            r5.i = r3
            iei r5 = defpackage.iei.a
            return r5
        L4b:
            r5.i = r3
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x0a.f(int, int, vp4):java.lang.Object");
    }

    public final void g(p0a p0aVar, boolean z, boolean z2) {
        float f;
        long j;
        List list = p0aVar.k;
        int i = p0aVar.n;
        int i2 = p0aVar.b;
        q0a q0aVar = p0aVar.a;
        this.q.e = list.size();
        q28 q28Var = this.x;
        y50 y50Var = this.e;
        if (!z && this.b) {
            this.c = p0aVar;
            rcg rcgVarZ = fd9.Z();
            bz7 bz7VarE = rcgVarZ != null ? rcgVarZ.e() : null;
            rcg rcgVarK0 = fd9.k0(rcgVarZ);
            try {
                if (!(((Number) ((nb0) q28Var.G).F.getValue()).floatValue() == MTTypesetterKt.kLineSkipLimitMultiplier) && q0aVar != null && q0aVar.a == ((isc) y50Var.b).h() && i2 == ((isc) y50Var.c).h()) {
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
        this.v.setValue(Boolean.valueOf(((q0aVar != null ? q0aVar.a : 0) == 0 && i2 == 0) ? false : true));
        this.u.setValue(Boolean.valueOf(p0aVar.c));
        this.h -= p0aVar.d;
        this.f.setValue(p0aVar);
        if (z2) {
            y50Var.getClass();
            if (i2 < MTTypesetterKt.kLineSkipLimitMultiplier) {
                e39.c("scrollOffset should be non-negative");
            }
            ((isc) y50Var.c).i(i2);
        } else {
            q0a q0aVar2 = (q0a) w44.N0(list);
            q0a q0aVar3 = (q0a) w44.V0(list);
            if (q0aVar2 != null) {
                f = 0.0f;
                j = q0aVar2.a;
            } else {
                f = 0.0f;
                j = -1;
            }
            dgj.U(j, "firstVisibleItem:index");
            dgj.U(q0aVar3 != null ? q0aVar3.a : -1L, "lastVisibleItem:index");
            y50Var.getClass();
            y50Var.d = q0aVar != null ? q0aVar.l : null;
            if (y50Var.a || i > 0) {
                y50Var.a = true;
                if (i2 < f) {
                    e39.c("scrollOffset should be non-negative");
                }
                y50Var.e(q0aVar != null ? q0aVar.a : 0, i2);
            }
            if (this.k) {
                zr5 zr5Var = this.a;
                int i3 = zr5Var.a;
                boolean z3 = zr5Var.c;
                if (i3 != -1 && !list.isEmpty() && i3 != zr5.a(p0aVar, z3)) {
                    zr5Var.a = -1;
                    wz9 wz9Var = zr5Var.b;
                    if (wz9Var != null) {
                        wz9Var.cancel();
                    }
                    zr5Var.b = null;
                }
                int i4 = zr5Var.d;
                if (i4 != -1 && zr5Var.e != f && i4 != i && !list.isEmpty()) {
                    int iA = zr5.a(p0aVar, zr5Var.e < f);
                    if (iA >= 0 && iA < i) {
                        zr5Var.a = iA;
                        zr5Var.b = efe.D(this.r, iA);
                    }
                }
                zr5Var.d = i;
            }
        }
        if (z) {
            q28Var.H(p0aVar.f, p0aVar.i, p0aVar.h);
        }
    }

    public final p0a h() {
        return (p0a) this.f.getValue();
    }

    public final void i(float f, p0a p0aVar) {
        wz9 wz9Var;
        wz9 wz9Var2;
        if (this.k) {
            zr5 zr5Var = this.a;
            zr5Var.getClass();
            if (!p0aVar.k.isEmpty()) {
                boolean z = f < MTTypesetterKt.kLineSkipLimitMultiplier;
                int iA = zr5.a(p0aVar, z);
                if (iA >= 0 && iA < p0aVar.n) {
                    if (iA != zr5Var.a) {
                        if (zr5Var.c != z) {
                            zr5Var.a = -1;
                            wz9 wz9Var3 = zr5Var.b;
                            if (wz9Var3 != null) {
                                wz9Var3.cancel();
                            }
                            zr5Var.b = null;
                        }
                        zr5Var.c = z;
                        zr5Var.a = iA;
                        zr5Var.b = efe.D(this.r, iA);
                    }
                    List list = p0aVar.k;
                    if (z) {
                        q0a q0aVar = (q0a) w44.U0(list);
                        if (((q0aVar.p + q0aVar.q) + p0aVar.r) - p0aVar.m < (-f) && (wz9Var2 = zr5Var.b) != null) {
                            wz9Var2.a();
                        }
                    } else if (p0aVar.l - ((q0a) w44.L0(list)).p < f && (wz9Var = zr5Var.b) != null) {
                        wz9Var.a();
                    }
                }
            }
            zr5Var.e = f;
        }
    }

    public final void j(int i, int i2) {
        if (this.j.a()) {
            gb9.D(((p0a) this.f.getValue()).h, null, null, new nt4(this, (tp4) null, 3), 3);
        }
        l(i, i2, false);
    }

    public final void l(int i, int i2, boolean z) {
        y50 y50Var = this.e;
        if (((isc) y50Var.b).h() != i || ((isc) y50Var.c).h() != i2) {
            hz9 hz9Var = this.o;
            hz9Var.e();
            hz9Var.b = null;
            hz9Var.c = -1;
        }
        y50Var.e(i, i2);
        y50Var.d = null;
        if (!z) {
            this.t.setValue(iei.a);
            return;
        }
        av9 av9Var = this.l;
        if (av9Var != null) {
            av9Var.m();
        }
    }

    public /* synthetic */ x0a() {
        this(Integer.MAX_VALUE, 0);
    }
}
