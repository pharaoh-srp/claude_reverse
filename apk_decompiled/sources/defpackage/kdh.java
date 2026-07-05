package defpackage;

import android.os.Trace;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class kdh extends hqb implements pu9, vd6, ujf {
    public zb0 S;
    public tkh T;
    public wt7 U;
    public bz7 V;
    public int W;
    public boolean X;
    public int Y;
    public int Z;
    public List a0;
    public bz7 b0;
    public yhf c0;
    public k54 d0;
    public bz7 e0;
    public Map f0;
    public stb g0;
    public idh h0;
    public jdh i0;

    public kdh(zb0 zb0Var, tkh tkhVar, wt7 wt7Var, bz7 bz7Var, int i, boolean z, int i2, int i3, List list, bz7 bz7Var2, yhf yhfVar, k54 k54Var, bz7 bz7Var3) {
        this.S = zb0Var;
        this.T = tkhVar;
        this.U = wt7Var;
        this.V = bz7Var;
        this.W = i;
        this.X = z;
        this.Y = i2;
        this.Z = i3;
        this.a0 = list;
        this.b0 = bz7Var2;
        this.c0 = yhfVar;
        this.d0 = k54Var;
        this.e0 = bz7Var3;
    }

    @Override // defpackage.pu9
    public final int A0(fma fmaVar, h5b h5bVar, int i) {
        return r1(fmaVar).a(i, fmaVar.getLayoutDirection());
    }

    @Override // defpackage.vd6
    public final void I0(cv9 cv9Var) {
        List list;
        if (!this.R) {
            return;
        }
        yhf yhfVar = this.c0;
        if (yhfVar != null) {
            yhfVar.c(cv9Var);
        }
        fb2 fb2VarP = cv9Var.E.F.p();
        stb stbVarR1 = r1(cv9Var);
        yjh yjhVar = stbVarR1.n;
        if (yjhVar == null) {
            xh6.m("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: ", stbVarR1);
            return;
        }
        qtb qtbVar = yjhVar.b;
        boolean zC = false;
        boolean z = yjhVar.d() && this.W != 3;
        if (z) {
            long j = yjhVar.c;
            l9e l9eVarX = d4c.x(0L, (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L));
            fb2VarP.g();
            fb2.q(fb2VarP, l9eVarX);
        }
        try {
            tkh tkhVar = this.T;
            egg eggVar = tkhVar.a;
            qeh qehVar = eggVar.m;
            if (qehVar == null) {
                qehVar = qeh.b;
            }
            qeh qehVar2 = qehVar;
            uzf uzfVar = eggVar.n;
            if (uzfVar == null) {
                uzfVar = uzf.d;
            }
            uzf uzfVar2 = uzfVar;
            yd6 yd6Var = eggVar.p;
            if (yd6Var == null) {
                yd6Var = qk7.a;
            }
            yd6 yd6Var2 = yd6Var;
            jy1 jy1VarC = tkhVar.c();
            if (jy1VarC != null) {
                cqk.e(qtbVar, fb2VarP, jy1VarC, this.T.a.a.a(), uzfVar2, qehVar2, yd6Var2);
            } else {
                k54 k54Var = this.d0;
                long jA = k54Var != null ? k54Var.a() : d54.h;
                if (jA == 16) {
                    jA = this.T.d() != 16 ? this.T.d() : d54.b;
                }
                qtbVar.i(fb2VarP, jA, uzfVar2, qehVar2, yd6Var2);
            }
            if (z) {
                fb2VarP.p();
            }
            jdh jdhVar = this.i0;
            if (jdhVar == null || !jdhVar.d()) {
                zb0 zb0Var = this.S;
                zC = zb0Var.c(zb0Var.F.length());
            }
            if (zC || !((list = this.a0) == null || list.isEmpty())) {
                cv9Var.a();
            }
        } finally {
        }
    }

    @Override // defpackage.pu9
    public final int N0(fma fmaVar, h5b h5bVar, int i) {
        return sf5.m(r1(fmaVar).e(fmaVar.getLayoutDirection()).f());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [bz7] */
    /* JADX WARN: Type inference failed for: r0v2, types: [idh] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // defpackage.ujf
    public final void X0(ekf ekfVar) {
        idh idhVar = this.h0;
        ?? r0 = idhVar;
        if (idhVar == null) {
            final int i = 0;
            ?? r02 = new bz7(this) { // from class: idh
                public final /* synthetic */ kdh F;

                {
                    this.F = this;
                }

                @Override // defpackage.bz7
                public final Object invoke(Object obj) {
                    yjh yjhVar;
                    boolean z;
                    int i2 = i;
                    kdh kdhVar = this.F;
                    switch (i2) {
                        case 0:
                            List list = (List) obj;
                            yjh yjhVar2 = kdhVar.q1().n;
                            if (yjhVar2 != null) {
                                xjh xjhVar = yjhVar2.a;
                                zb0 zb0Var = xjhVar.a;
                                tkh tkhVar = kdhVar.T;
                                k54 k54Var = kdhVar.d0;
                                yjhVar = new yjh(new xjh(zb0Var, tkh.g(tkhVar, k54Var != null ? k54Var.a() : d54.h, 0L, null, null, null, 0L, null, 0, 0L, 16777214), xjhVar.c, xjhVar.d, xjhVar.e, xjhVar.f, xjhVar.g, xjhVar.h, xjhVar.i, xjhVar.j), yjhVar2.b, yjhVar2.c);
                                list.add(yjhVar);
                            } else {
                                yjhVar = null;
                            }
                            return Boolean.valueOf(yjhVar != null);
                        case 1:
                            zb0 zb0Var2 = (zb0) obj;
                            jdh jdhVar = kdhVar.i0;
                            lm6 lm6Var = lm6.E;
                            if (jdhVar == null) {
                                jdh jdhVar2 = new jdh(kdhVar.S, zb0Var2);
                                stb stbVar = new stb(zb0Var2, kdhVar.T, kdhVar.U, kdhVar.W, kdhVar.X, kdhVar.Y, kdhVar.Z, lm6Var);
                                stbVar.d(kdhVar.q1().j);
                                jdhVar2.e(stbVar);
                                kdhVar.i0 = jdhVar2;
                            } else if (!x44.r(zb0Var2, jdhVar.c())) {
                                jdhVar.g(zb0Var2);
                                stb stbVarA = jdhVar.a();
                                if (stbVarA != null) {
                                    stbVarA.g(zb0Var2, kdhVar.T, kdhVar.U, kdhVar.W, kdhVar.X, kdhVar.Y, kdhVar.Z, lm6Var);
                                }
                            }
                            yfd.W(kdhVar).V();
                            yfd.W(kdhVar).T();
                            wd6.t0(kdhVar);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            jdh jdhVar3 = kdhVar.i0;
                            if (jdhVar3 == null) {
                                z = false;
                            } else {
                                bz7 bz7Var = kdhVar.e0;
                                if (bz7Var != null) {
                                    bz7Var.invoke(jdhVar3);
                                }
                                jdh jdhVar4 = kdhVar.i0;
                                if (jdhVar4 != null) {
                                    jdhVar4.f(zBooleanValue);
                                }
                                yfd.W(kdhVar).V();
                                yfd.W(kdhVar).T();
                                wd6.t0(kdhVar);
                                z = true;
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.h0 = r02;
            r0 = r02;
        }
        ckf.w(ekfVar, this.S);
        jdh jdhVar = this.i0;
        if (jdhVar != null) {
            zb0 zb0VarC = jdhVar.c();
            dkf dkfVar = akf.D;
            wn9[] wn9VarArr = ckf.a;
            wn9 wn9Var = wn9VarArr[16];
            ekfVar.a(dkfVar, zb0VarC);
            boolean zD = jdhVar.d();
            dkf dkfVar2 = akf.E;
            wn9 wn9Var2 = wn9VarArr[17];
            ekfVar.a(dkfVar2, Boolean.valueOf(zD));
        }
        final int i2 = 1;
        ekfVar.a(ojf.l, new e5(null, new bz7(this) { // from class: idh
            public final /* synthetic */ kdh F;

            {
                this.F = this;
            }

            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                yjh yjhVar;
                boolean z;
                int i22 = i2;
                kdh kdhVar = this.F;
                switch (i22) {
                    case 0:
                        List list = (List) obj;
                        yjh yjhVar2 = kdhVar.q1().n;
                        if (yjhVar2 != null) {
                            xjh xjhVar = yjhVar2.a;
                            zb0 zb0Var = xjhVar.a;
                            tkh tkhVar = kdhVar.T;
                            k54 k54Var = kdhVar.d0;
                            yjhVar = new yjh(new xjh(zb0Var, tkh.g(tkhVar, k54Var != null ? k54Var.a() : d54.h, 0L, null, null, null, 0L, null, 0, 0L, 16777214), xjhVar.c, xjhVar.d, xjhVar.e, xjhVar.f, xjhVar.g, xjhVar.h, xjhVar.i, xjhVar.j), yjhVar2.b, yjhVar2.c);
                            list.add(yjhVar);
                        } else {
                            yjhVar = null;
                        }
                        return Boolean.valueOf(yjhVar != null);
                    case 1:
                        zb0 zb0Var2 = (zb0) obj;
                        jdh jdhVar2 = kdhVar.i0;
                        lm6 lm6Var = lm6.E;
                        if (jdhVar2 == null) {
                            jdh jdhVar22 = new jdh(kdhVar.S, zb0Var2);
                            stb stbVar = new stb(zb0Var2, kdhVar.T, kdhVar.U, kdhVar.W, kdhVar.X, kdhVar.Y, kdhVar.Z, lm6Var);
                            stbVar.d(kdhVar.q1().j);
                            jdhVar22.e(stbVar);
                            kdhVar.i0 = jdhVar22;
                        } else if (!x44.r(zb0Var2, jdhVar2.c())) {
                            jdhVar2.g(zb0Var2);
                            stb stbVarA = jdhVar2.a();
                            if (stbVarA != null) {
                                stbVarA.g(zb0Var2, kdhVar.T, kdhVar.U, kdhVar.W, kdhVar.X, kdhVar.Y, kdhVar.Z, lm6Var);
                            }
                        }
                        yfd.W(kdhVar).V();
                        yfd.W(kdhVar).T();
                        wd6.t0(kdhVar);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        jdh jdhVar3 = kdhVar.i0;
                        if (jdhVar3 == null) {
                            z = false;
                        } else {
                            bz7 bz7Var = kdhVar.e0;
                            if (bz7Var != null) {
                                bz7Var.invoke(jdhVar3);
                            }
                            jdh jdhVar4 = kdhVar.i0;
                            if (jdhVar4 != null) {
                                jdhVar4.f(zBooleanValue);
                            }
                            yfd.W(kdhVar).V();
                            yfd.W(kdhVar).T();
                            wd6.t0(kdhVar);
                            z = true;
                        }
                        return Boolean.valueOf(z);
                }
            }
        }));
        final int i3 = 2;
        ekfVar.a(ojf.m, new e5(null, new bz7(this) { // from class: idh
            public final /* synthetic */ kdh F;

            {
                this.F = this;
            }

            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                yjh yjhVar;
                boolean z;
                int i22 = i3;
                kdh kdhVar = this.F;
                switch (i22) {
                    case 0:
                        List list = (List) obj;
                        yjh yjhVar2 = kdhVar.q1().n;
                        if (yjhVar2 != null) {
                            xjh xjhVar = yjhVar2.a;
                            zb0 zb0Var = xjhVar.a;
                            tkh tkhVar = kdhVar.T;
                            k54 k54Var = kdhVar.d0;
                            yjhVar = new yjh(new xjh(zb0Var, tkh.g(tkhVar, k54Var != null ? k54Var.a() : d54.h, 0L, null, null, null, 0L, null, 0, 0L, 16777214), xjhVar.c, xjhVar.d, xjhVar.e, xjhVar.f, xjhVar.g, xjhVar.h, xjhVar.i, xjhVar.j), yjhVar2.b, yjhVar2.c);
                            list.add(yjhVar);
                        } else {
                            yjhVar = null;
                        }
                        return Boolean.valueOf(yjhVar != null);
                    case 1:
                        zb0 zb0Var2 = (zb0) obj;
                        jdh jdhVar2 = kdhVar.i0;
                        lm6 lm6Var = lm6.E;
                        if (jdhVar2 == null) {
                            jdh jdhVar22 = new jdh(kdhVar.S, zb0Var2);
                            stb stbVar = new stb(zb0Var2, kdhVar.T, kdhVar.U, kdhVar.W, kdhVar.X, kdhVar.Y, kdhVar.Z, lm6Var);
                            stbVar.d(kdhVar.q1().j);
                            jdhVar22.e(stbVar);
                            kdhVar.i0 = jdhVar22;
                        } else if (!x44.r(zb0Var2, jdhVar2.c())) {
                            jdhVar2.g(zb0Var2);
                            stb stbVarA = jdhVar2.a();
                            if (stbVarA != null) {
                                stbVarA.g(zb0Var2, kdhVar.T, kdhVar.U, kdhVar.W, kdhVar.X, kdhVar.Y, kdhVar.Z, lm6Var);
                            }
                        }
                        yfd.W(kdhVar).V();
                        yfd.W(kdhVar).T();
                        wd6.t0(kdhVar);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        jdh jdhVar3 = kdhVar.i0;
                        if (jdhVar3 == null) {
                            z = false;
                        } else {
                            bz7 bz7Var = kdhVar.e0;
                            if (bz7Var != null) {
                                bz7Var.invoke(jdhVar3);
                            }
                            jdh jdhVar4 = kdhVar.i0;
                            if (jdhVar4 != null) {
                                jdhVar4.f(zBooleanValue);
                            }
                            yfd.W(kdhVar).V();
                            yfd.W(kdhVar).T();
                            wd6.t0(kdhVar);
                            z = true;
                        }
                        return Boolean.valueOf(z);
                }
            }
        }));
        ekfVar.a(ojf.n, new e5(null, new p3f(12, this)));
        ckf.d(ekfVar, r0);
    }

    @Override // defpackage.pu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            stb stbVarR1 = r1(q5bVar);
            boolean zC = stbVarR1.c(j, q5bVar.getLayoutDirection());
            yjh yjhVar = stbVarR1.n;
            if (yjhVar == null) {
                throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + stbVarR1);
            }
            long j2 = yjhVar.c;
            yjhVar.b.a.c();
            if (zC) {
                yfd.U(this, 2).o1();
                bz7 bz7Var = this.V;
                if (bz7Var != null) {
                    bz7Var.invoke(yjhVar);
                }
                yhf yhfVar = this.c0;
                if (yhfVar != null) {
                    yhfVar.e(yjhVar);
                }
                Map linkedHashMap = this.f0;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap(2);
                }
                linkedHashMap.put(xt.a, Integer.valueOf(Math.round(yjhVar.d)));
                linkedHashMap.put(xt.b, Integer.valueOf(Math.round(yjhVar.e)));
                this.f0 = linkedHashMap;
            }
            bz7 bz7Var2 = this.b0;
            if (bz7Var2 != null) {
                bz7Var2.invoke(yjhVar.f);
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            c3d c3dVarU = h5bVar.u(sf5.G(i, i, i2, i2));
            Map map = this.f0;
            map.getClass();
            return q5bVar.U(i, i2, map, new mf1(c3dVarU, 6));
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.hqb
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.pu9
    public final int h(fma fmaVar, h5b h5bVar, int i) {
        return sf5.m(r1(fmaVar).e(fmaVar.getLayoutDirection()).j());
    }

    @Override // defpackage.pu9
    public final int l0(fma fmaVar, h5b h5bVar, int i) {
        return r1(fmaVar).a(i, fmaVar.getLayoutDirection());
    }

    public final void p1(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            q1().g(this.S, this.T, this.U, this.W, this.X, this.Y, this.Z, this.a0);
        }
        if (this.R) {
            if (z2 || (z && this.h0 != null)) {
                yfd.W(this).V();
            }
            if (z2 || z3 || z4) {
                yfd.W(this).T();
                wd6.t0(this);
            }
            if (z) {
                wd6.t0(this);
            }
        }
    }

    public final stb q1() {
        if (this.g0 == null) {
            this.g0 = new stb(this.S, this.T, this.U, this.W, this.X, this.Y, this.Z, this.a0);
        }
        stb stbVar = this.g0;
        stbVar.getClass();
        return stbVar;
    }

    public final stb r1(cz5 cz5Var) {
        stb stbVarA;
        jdh jdhVar = this.i0;
        if (jdhVar != null && jdhVar.d() && (stbVarA = jdhVar.a()) != null) {
            stbVarA.d(cz5Var);
            return stbVarA;
        }
        stb stbVarQ1 = q1();
        stbVarQ1.d(cz5Var);
        return stbVarQ1;
    }

    public final boolean s1(bz7 bz7Var, bz7 bz7Var2, yhf yhfVar, bz7 bz7Var3) {
        boolean z;
        if (this.V != bz7Var) {
            this.V = bz7Var;
            z = true;
        } else {
            z = false;
        }
        if (this.b0 != bz7Var2) {
            this.b0 = bz7Var2;
            z = true;
        }
        if (!x44.r(this.c0, yhfVar)) {
            this.c0 = yhfVar;
            z = true;
        }
        if (this.e0 == bz7Var3) {
            return z;
        }
        this.e0 = bz7Var3;
        return true;
    }

    public final boolean t1(tkh tkhVar, List list, int i, int i2, boolean z, wt7 wt7Var, int i3) {
        boolean z2 = !this.T.e(tkhVar);
        this.T = tkhVar;
        if (!x44.r(this.a0, list)) {
            this.a0 = list;
            z2 = true;
        }
        if (this.Z != i) {
            this.Z = i;
            z2 = true;
        }
        if (this.Y != i2) {
            this.Y = i2;
            z2 = true;
        }
        if (this.X != z) {
            this.X = z;
            z2 = true;
        }
        if (!x44.r(this.U, wt7Var)) {
            this.U = wt7Var;
            z2 = true;
        }
        if (this.W == i3) {
            return z2;
        }
        this.W = i3;
        return true;
    }

    public final boolean u1(zb0 zb0Var) {
        boolean zR = x44.r(this.S.F, zb0Var.F);
        boolean z = (zR && x44.r(this.S.E, zb0Var.E)) ? false : true;
        if (z) {
            this.S = zb0Var;
        }
        if (!zR) {
            this.i0 = null;
        }
        return z;
    }
}
