package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f0c extends hqb implements p6i, yzb {
    public yzb S;
    public b0c T;
    public f0c U;
    public final String V;

    public f0c(yzb yzbVar, b0c b0cVar) {
        this.S = yzbVar;
        this.T = b0cVar == null ? new b0c() : b0cVar;
        this.V = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // defpackage.yzb
    public final long F(long j, int i, long j2) {
        long jF = this.S.F(j, i, j2);
        f0c f0cVarQ1 = this.R ? q1() : null;
        return fcc.i(jF, f0cVarQ1 != null ? f0cVarQ1.F(fcc.i(j, jF), i, fcc.h(j2, jF)) : 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // defpackage.yzb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(long r13, long r15, defpackage.tp4 r17) {
        /*
            r12 = this;
            r1 = r17
            boolean r2 = r1 instanceof defpackage.d0c
            if (r2 == 0) goto L16
            r2 = r1
            d0c r2 = (defpackage.d0c) r2
            int r3 = r2.I
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.I = r3
        L14:
            r8 = r2
            goto L1e
        L16:
            d0c r2 = new d0c
            vp4 r1 = (defpackage.vp4) r1
            r2.<init>(r12, r1)
            goto L14
        L1e:
            java.lang.Object r1 = r8.G
            int r2 = r8.I
            r9 = 0
            r10 = 2
            r3 = 1
            m45 r11 = defpackage.m45.E
            if (r2 == 0) goto L41
            if (r2 == r3) goto L39
            if (r2 != r10) goto L33
            long r2 = r8.E
            defpackage.sf5.h0(r1)
            goto L86
        L33:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r0)
            return r9
        L39:
            long r2 = r8.F
            long r4 = r8.E
            defpackage.sf5.h0(r1)
            goto L58
        L41:
            defpackage.sf5.h0(r1)
            yzb r1 = r12.S
            r8.E = r13
            r6 = r15
            r8.F = r6
            r8.I = r3
            r4 = r13
            r3 = r1
            java.lang.Object r1 = r3.G(r4, r6, r8)
            if (r1 != r11) goto L56
            goto L84
        L56:
            r4 = r13
            r2 = r15
        L58:
            qsi r1 = (defpackage.qsi) r1
            long r6 = r1.j()
            boolean r1 = r12.R
            if (r1 == 0) goto L69
            if (r1 == 0) goto L6b
            f0c r9 = r12.q1()
            goto L6b
        L69:
            f0c r9 = r12.U
        L6b:
            if (r9 == 0) goto L8e
            long r0 = defpackage.qsi.g(r4, r6)
            long r2 = defpackage.qsi.f(r2, r6)
            r8.E = r6
            r8.I = r10
            r13 = r0
            r15 = r2
            r17 = r8
            r12 = r9
            java.lang.Object r1 = r12.G(r13, r15, r17)
            if (r1 != r11) goto L85
        L84:
            return r11
        L85:
            r2 = r6
        L86:
            qsi r1 = (defpackage.qsi) r1
            long r0 = r1.j()
            r6 = r2
            goto L90
        L8e:
            r0 = 0
        L90:
            long r0 = defpackage.qsi.g(r6, r0)
            qsi r0 = defpackage.qsi.a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f0c.G(long, long, tp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r9 == r5) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.yzb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O0(long r7, defpackage.tp4 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.e0c
            if (r0 == 0) goto L13
            r0 = r9
            e0c r0 = (defpackage.e0c) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L1a
        L13:
            e0c r0 = new e0c
            vp4 r9 = (defpackage.vp4) r9
            r0.<init>(r6, r9)
        L1a:
            java.lang.Object r9 = r0.F
            int r1 = r0.H
            r2 = 0
            r3 = 2
            r4 = 1
            m45 r5 = defpackage.m45.E
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2f
            long r6 = r0.E
            defpackage.sf5.h0(r9)
            goto L6e
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r2
        L35:
            long r7 = r0.E
            defpackage.sf5.h0(r9)
            goto L53
        L3b:
            defpackage.sf5.h0(r9)
            boolean r9 = r6.R
            if (r9 == 0) goto L46
            f0c r2 = r6.q1()
        L46:
            if (r2 == 0) goto L5a
            r0.E = r7
            r0.H = r4
            java.lang.Object r9 = r2.O0(r7, r0)
            if (r9 != r5) goto L53
            goto L6c
        L53:
            qsi r9 = (defpackage.qsi) r9
            long r1 = r9.j()
            goto L5c
        L5a:
            r1 = 0
        L5c:
            yzb r6 = r6.S
            long r7 = defpackage.qsi.f(r7, r1)
            r0.E = r1
            r0.H = r3
            java.lang.Object r9 = r6.O0(r7, r0)
            if (r9 != r5) goto L6d
        L6c:
            return r5
        L6d:
            r6 = r1
        L6e:
            qsi r9 = (defpackage.qsi) r9
            long r8 = r9.j()
            long r6 = defpackage.qsi.g(r6, r8)
            qsi r6 = defpackage.qsi.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f0c.O0(long, tp4):java.lang.Object");
    }

    @Override // defpackage.yzb
    public final long X(int i, long j) {
        f0c f0cVarQ1 = this.R ? q1() : null;
        long jX = f0cVarQ1 != null ? f0cVarQ1.X(i, j) : 0L;
        return fcc.i(jX, this.S.X(i, fcc.h(j, jX)));
    }

    @Override // defpackage.hqb
    public final void h1() {
        b0c b0cVar = this.T;
        b0cVar.a = this;
        b0cVar.b = null;
        this.U = null;
        b0cVar.c = new l4(26, this);
        b0cVar.d = d1();
    }

    @Override // defpackage.hqb
    public final void i1() {
        dae daeVar = new dae();
        j8.n0(this, new zz(2, daeVar));
        f0c f0cVar = (f0c) ((p6i) daeVar.E);
        this.U = f0cVar;
        b0c b0cVar = this.T;
        b0cVar.b = f0cVar;
        if (b0cVar.a == this) {
            b0cVar.a = null;
        }
    }

    @Override // defpackage.p6i
    public final Object o() {
        return this.V;
    }

    public final l45 p1() {
        f0c f0cVarQ1 = q1();
        l45 l45VarP1 = f0cVarQ1 != null ? f0cVarQ1.p1() : null;
        if (l45VarP1 != null && fd9.d0(l45VarP1)) {
            return l45VarP1;
        }
        l45 l45Var = this.T.d;
        if (l45Var != null) {
            return l45Var;
        }
        sz6.j("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public final f0c q1() {
        g5c g5cVar;
        p6i p6iVar = null;
        if (!this.R) {
            return null;
        }
        if (!this.E.R) {
            b39.c("visitAncestors called on an unattached node");
        }
        hqb hqbVar = this.E.I;
        av9 av9VarW = yfd.W(this);
        loop0: while (true) {
            if (av9VarW == null) {
                break;
            }
            if ((((hqb) av9VarW.k0.K).H & 262144) != 0) {
                while (hqbVar != null) {
                    if ((hqbVar.G & 262144) != 0) {
                        hqb hqbVarJ = hqbVar;
                        wwb wwbVar = null;
                        while (hqbVarJ != null) {
                            if (hqbVarJ instanceof p6i) {
                                p6i p6iVar2 = (p6i) hqbVarJ;
                                if (x44.r(this.V, p6iVar2.o()) && f0c.class == p6iVar2.getClass()) {
                                    p6iVar = p6iVar2;
                                    break loop0;
                                }
                            }
                            if ((hqbVarJ.G & 262144) != 0 && (hqbVarJ instanceof qw5)) {
                                int i = 0;
                                for (hqb hqbVar2 = ((qw5) hqbVarJ).T; hqbVar2 != null; hqbVar2 = hqbVar2.J) {
                                    if ((hqbVar2.G & 262144) != 0) {
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
        return (f0c) p6iVar;
    }
}
