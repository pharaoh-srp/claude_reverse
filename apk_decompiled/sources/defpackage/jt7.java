package defpackage;

import android.os.Trace;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class jt7 extends hqb implements oe4, yt9, lbc, mqb, nw5 {
    public final boolean S;
    public final pz7 T;
    public boolean U;
    public boolean V;
    public final int W;

    public jt7(int i, int i2, pz7 pz7Var) {
        i = (i2 & 1) != 0 ? 1 : i;
        boolean z = (i2 & 2) == 0;
        pz7Var = (i2 & 4) != 0 ? null : pz7Var;
        this.S = z;
        this.T = pz7Var;
        this.W = i;
    }

    @Override // defpackage.lbc
    public final void F0() {
        v1();
    }

    @Override // defpackage.hqb
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.hqb
    public final void i1() {
        int iOrdinal = u1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                rs7 focusOwner = yfd.X(this).getFocusOwner();
                jt7 jt7VarL = cok.l(this);
                if (jt7VarL == null || !jt7VarL.S) {
                    return;
                }
                ts7 ts7Var = (ts7) focusOwner;
                ts7Var.a.E();
                ts7Var.d.a();
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                mr9.b();
                return;
            }
        }
        ts7 ts7Var2 = (ts7) yfd.X(this).getFocusOwner();
        ts7Var2.d(8, true, false);
        if (this.S) {
            ts7Var2.a.E();
        }
        ts7Var2.d.a();
    }

    @Override // defpackage.hqb
    public final void j1() {
        if (u1().b()) {
            ((ts7) yfd.X(this).getFocusOwner()).d(8, true, true);
        }
    }

    @Override // defpackage.yt9
    public final void n(cu9 cu9Var) {
    }

    public final boolean p1(int i) {
        int iOrdinal = sf5.R(this, i).ordinal();
        if (iOrdinal == 0) {
            return sf5.S(this);
        }
        if (iOrdinal == 1) {
            return false;
        }
        if (iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        mr9.b();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [hqb] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [hqb] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [wwb] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [wwb] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void q1(ft7 ft7Var, ft7 ft7Var2) {
        g5c g5cVar;
        pz7 pz7Var;
        ts7 ts7Var = (ts7) yfd.X(this).getFocusOwner();
        jt7 jt7VarH = ts7Var.h();
        if (!ft7Var.equals(ft7Var2) && (pz7Var = this.T) != null) {
            pz7Var.invoke(ft7Var, ft7Var2);
        }
        hqb hqbVar = this.E;
        if (!hqbVar.R) {
            b39.c("visitAncestors called on an unattached node");
        }
        hqb hqbVar2 = this.E;
        av9 av9VarW = yfd.W(this);
        while (av9VarW != null) {
            if ((((hqb) av9VarW.k0.K).H & 5120) != 0) {
                while (hqbVar2 != null) {
                    int i = hqbVar2.G;
                    if ((i & 5120) != 0) {
                        if (hqbVar2 != hqbVar && (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
                            return;
                        }
                        if ((i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0) {
                            ?? J = hqbVar2;
                            ?? wwbVar = 0;
                            while (J != 0) {
                                if (J instanceof ds7) {
                                    ds7 ds7Var = (ds7) J;
                                    if (jt7VarH == ts7Var.h()) {
                                        ds7Var.N(ft7Var2);
                                    }
                                } else if ((J.G & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 && (J instanceof qw5)) {
                                    hqb hqbVar3 = ((qw5) J).T;
                                    int i2 = 0;
                                    J = J;
                                    wwbVar = wwbVar;
                                    while (hqbVar3 != null) {
                                        if ((hqbVar3.G & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0) {
                                            i2++;
                                            wwbVar = wwbVar;
                                            if (i2 == 1) {
                                                J = hqbVar3;
                                            } else {
                                                if (wwbVar == 0) {
                                                    wwbVar = new wwb(0, new hqb[16]);
                                                }
                                                if (J != 0) {
                                                    wwbVar.b(J);
                                                    J = 0;
                                                }
                                                wwbVar.b(hqbVar3);
                                            }
                                        }
                                        hqbVar3 = hqbVar3.J;
                                        J = J;
                                        wwbVar = wwbVar;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                J = yfd.j(wwbVar);
                            }
                        }
                    }
                    hqbVar2 = hqbVar2.I;
                }
            }
            av9VarW = av9VarW.G();
            hqbVar2 = (av9VarW == null || (g5cVar = av9VarW.k0) == null) ? null : (j4h) g5cVar.J;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [hqb] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [hqb] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [wwb] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [wwb] */
    /* JADX WARN: Type inference failed for: r8v4 */
    public final ws7 r1() {
        boolean z;
        g5c g5cVar;
        ws7 ws7Var = new ws7();
        ws7Var.a = true;
        bt7 bt7Var = bt7.b;
        ws7Var.b = bt7Var;
        ws7Var.c = bt7Var;
        ws7Var.d = bt7Var;
        ws7Var.e = bt7Var;
        ws7Var.f = bt7Var;
        ws7Var.g = bt7Var;
        ws7Var.h = bt7Var;
        ws7Var.i = bt7Var;
        ws7Var.j = j06.Q;
        ws7Var.k = j06.R;
        ws7Var.l = lja.X;
        int i = this.W;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((l49) ((n49) ((m49) yb5.o(this, ve4.m))).a.getValue()).a == 1);
        } else {
            if (i != 2) {
                sz6.j("Unknown Focusability");
                return null;
            }
            z = false;
        }
        ws7Var.a = z;
        hqb hqbVar = this.E;
        if (!hqbVar.R) {
            b39.c("visitAncestors called on an unattached node");
        }
        hqb hqbVar2 = this.E;
        av9 av9VarW = yfd.W(this);
        loop0: while (av9VarW != null) {
            if ((((hqb) av9VarW.k0.K).H & 3072) != 0) {
                while (hqbVar2 != null) {
                    int i2 = hqbVar2.G;
                    if ((i2 & 3072) != 0) {
                        if (hqbVar2 != hqbVar && (i2 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
                            break loop0;
                        }
                        if ((i2 & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0) {
                            ?? wwbVar = 0;
                            ?? J = hqbVar2;
                            while (J != 0) {
                                if (J instanceof ys7) {
                                    ((ys7) J).K(ws7Var);
                                } else if ((J.G & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 && (J instanceof qw5)) {
                                    hqb hqbVar3 = ((qw5) J).T;
                                    int i3 = 0;
                                    J = J;
                                    wwbVar = wwbVar;
                                    while (hqbVar3 != null) {
                                        if ((hqbVar3.G & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0) {
                                            i3++;
                                            wwbVar = wwbVar;
                                            if (i3 == 1) {
                                                J = hqbVar3;
                                            } else {
                                                if (wwbVar == 0) {
                                                    wwbVar = new wwb(0, new hqb[16]);
                                                }
                                                if (J != 0) {
                                                    wwbVar.b(J);
                                                    J = 0;
                                                }
                                                wwbVar.b(hqbVar3);
                                            }
                                        }
                                        hqbVar3 = hqbVar3.J;
                                        J = J;
                                        wwbVar = wwbVar;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                J = yfd.j(wwbVar);
                            }
                        }
                    }
                    hqbVar2 = hqbVar2.I;
                }
            }
            av9VarW = av9VarW.G();
            hqbVar2 = (av9VarW == null || (g5cVar = av9VarW.k0) == null) ? null : (j4h) g5cVar.J;
        }
        return ws7Var;
    }

    public final l9e s1(cu9 cu9Var) {
        l9e l9eVar = r1().l;
        return l9eVar != lja.X ? cu9Var == null ? l9eVar : l9eVar.m(cu9Var.L(yfd.V(this), 0L, (6 & 4) != 0)) : cu9Var != null ? cu9Var.J(yfd.V(this), false) : d4c.x(0L, csg.T(yfd.V(this).G));
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a5, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.wy9 t1() {
        /*
            r6 = this;
            hqb r0 = r6.E
            boolean r0 = r0.R
            if (r0 != 0) goto Lb
            java.lang.String r0 = "visitAncestors called on an unattached node"
            defpackage.b39.c(r0)
        Lb:
            hqb r0 = r6.E
            hqb r0 = r0.I
            av9 r6 = defpackage.yfd.W(r6)
        L13:
            r1 = 0
            if (r6 == 0) goto La5
            g5c r2 = r6.k0
            java.lang.Object r2 = r2.K
            hqb r2 = (defpackage.hqb) r2
            int r2 = r2.H
            r3 = 8388640(0x800020, float:1.1754988E-38)
            r2 = r2 & r3
            if (r2 == 0) goto L92
        L24:
            if (r0 == 0) goto L92
            int r2 = r0.G
            r4 = r2 & r3
            if (r4 == 0) goto L8f
            r4 = 8388608(0x800000, float:1.1754944E-38)
            r4 = r4 & r2
            if (r4 == 0) goto L4f
            boolean r6 = r0 instanceof defpackage.wy9
            if (r6 == 0) goto L36
            goto L4a
        L36:
            boolean r6 = r0 instanceof defpackage.qw5
            if (r6 == 0) goto L49
            qw5 r0 = (defpackage.qw5) r0
            hqb r6 = r0.T
            r0 = r1
        L3f:
            if (r6 == 0) goto L4a
            boolean r2 = r6 instanceof defpackage.wy9
            if (r2 == 0) goto L46
            r0 = r6
        L46:
            hqb r6 = r6.J
            goto L3f
        L49:
            r0 = r1
        L4a:
            wy9 r0 = (defpackage.wy9) r0
            if (r0 == 0) goto La5
            return r0
        L4f:
            r2 = r2 & 32
            if (r2 == 0) goto L8f
            boolean r2 = r0 instanceof defpackage.mqb
            if (r2 == 0) goto L59
            r4 = r0
            goto L6e
        L59:
            boolean r2 = r0 instanceof defpackage.qw5
            if (r2 == 0) goto L6d
            r2 = r0
            qw5 r2 = (defpackage.qw5) r2
            hqb r2 = r2.T
            r4 = r1
        L63:
            if (r2 == 0) goto L6e
            boolean r5 = r2 instanceof defpackage.mqb
            if (r5 == 0) goto L6a
            r4 = r2
        L6a:
            hqb r2 = r2.J
            goto L63
        L6d:
            r4 = r1
        L6e:
            mqb r4 = (defpackage.mqb) r4
            if (r4 == 0) goto L8f
            kxk r2 = r4.j0()
            tk5 r5 = defpackage.so1.a()
            boolean r2 = r2.q(r5)
            if (r2 == 0) goto L8f
            kxk r6 = r4.j0()
            tk5 r0 = defpackage.so1.a()
            java.lang.Object r6 = r6.x(r0)
            wy9 r6 = (defpackage.wy9) r6
            return r6
        L8f:
            hqb r0 = r0.I
            goto L24
        L92:
            av9 r6 = r6.G()
            if (r6 == 0) goto La2
            g5c r0 = r6.k0
            if (r0 == 0) goto La2
            java.lang.Object r0 = r0.J
            j4h r0 = (defpackage.j4h) r0
            goto L13
        La2:
            r0 = r1
            goto L13
        La5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jt7.t1():wy9");
    }

    public final ft7 u1() {
        jt7 jt7VarH;
        g5c g5cVar;
        boolean z = this.R;
        ft7 ft7Var = ft7.G;
        if (!z || (jt7VarH = ((ts7) yfd.X(this).getFocusOwner()).h()) == null) {
            return ft7Var;
        }
        if (this == jt7VarH) {
            return ft7.E;
        }
        if (jt7VarH.R) {
            if (!jt7VarH.E.R) {
                b39.c("visitAncestors called on an unattached node");
            }
            hqb hqbVar = jt7VarH.E.I;
            av9 av9VarW = yfd.W(jt7VarH);
            while (av9VarW != null) {
                if ((((hqb) av9VarW.k0.K).H & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
                    while (hqbVar != null) {
                        if ((hqbVar.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
                            hqb hqbVarJ = hqbVar;
                            wwb wwbVar = null;
                            while (hqbVarJ != null) {
                                if (hqbVarJ instanceof jt7) {
                                    if (this == ((jt7) hqbVarJ)) {
                                        return ft7.F;
                                    }
                                } else if ((hqbVarJ.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 && (hqbVarJ instanceof qw5)) {
                                    int i = 0;
                                    for (hqb hqbVar2 = ((qw5) hqbVarJ).T; hqbVar2 != null; hqbVar2 = hqbVar2.J) {
                                        if ((hqbVar2.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
                                            i++;
                                            if (i == 1) {
                                                hqbVarJ = hqbVar2;
                                            } else {
                                                if (wwbVar == null) {
                                                    wwbVar = new wwb(0, new hqb[16]);
                                                }
                                                if (hqbVarJ != null) {
                                                    wwbVar.b(hqbVarJ);
                                                    hqbVarJ = null;
                                                }
                                                wwbVar.b(hqbVar2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                hqbVarJ = yfd.j(wwbVar);
                            }
                        }
                        hqbVar = hqbVar.I;
                    }
                }
                av9VarW = av9VarW.G();
                hqbVar = (av9VarW == null || (g5cVar = av9VarW.k0) == null) ? null : (j4h) g5cVar.J;
            }
        }
        return ft7Var;
    }

    public final void v1() {
        int iOrdinal = u1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                mr9.b();
                return;
            }
        }
        dae daeVar = new dae();
        d4c.a0(this, new xz(daeVar, 10, this));
        Object obj = daeVar.E;
        if (obj == null) {
            x44.o0("focusProperties");
            throw null;
        }
        if (((us7) obj).a()) {
            return;
        }
        ((ts7) yfd.X(this).getFocusOwner()).b(true);
    }

    public final boolean w1(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return r1().a ? p1(i) : nvk.n(this, i, new c00(i, 4));
        } finally {
            Trace.endSection();
        }
    }
}
