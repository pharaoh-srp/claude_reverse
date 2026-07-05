package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vpc {
    public static final yig o = new yig(0.8f, 380.0f, Float.valueOf(1.0f));
    public static final f9c p = new f9c(9);
    public final bz7 a;
    public final lsc b;
    public final lsc c;
    public final lsc d;
    public final isc e;
    public int f;
    public final lsc g;
    public dvb h;
    public kl7 i;
    public eo7 j;
    public cz5 k;
    public final rpc l;
    public final fxb m;
    public final spc n;

    public vpc(wpc wpcVar, bz7 bz7Var) {
        this.a = bz7Var;
        this.b = mpk.P(wpcVar);
        Boolean bool = Boolean.FALSE;
        this.c = mpk.P(bool);
        this.d = mpk.P(bool);
        this.e = new isc(-1);
        this.f = -1;
        this.g = mpk.P(lm6.E);
        this.h = new dvb(0);
        this.l = new rpc(this);
        this.m = new fxb();
        this.n = new spc(this);
    }

    public static final long a(final vpc vpcVar, dvb dvbVar, final int i, float f) {
        vpcVar.getClass();
        final int i2 = 1;
        final int i3 = 0;
        bz7 sm5Var = f >= 200.0f ? new bz7() { // from class: opc
            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                int i4 = i3;
                vpc vpcVar2 = vpcVar;
                int i5 = i;
                int iIntValue = ((Integer) obj).intValue();
                switch (i4) {
                    case 0:
                        int iH = iIntValue - i5;
                        if (iH < 0) {
                            iH = vpcVar2.e.h() - iH;
                        }
                        return Integer.valueOf(iH);
                    default:
                        int iH2 = i5 - iIntValue;
                        if (iH2 < 0) {
                            iH2 = vpcVar2.e.h() - iH2;
                        }
                        return Integer.valueOf(iH2);
                }
            }
        } : f <= -200.0f ? new bz7() { // from class: opc
            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                int i4 = i2;
                vpc vpcVar2 = vpcVar;
                int i5 = i;
                int iIntValue = ((Integer) obj).intValue();
                switch (i4) {
                    case 0:
                        int iH = iIntValue - i5;
                        if (iH < 0) {
                            iH = vpcVar2.e.h() - iH;
                        }
                        return Integer.valueOf(iH);
                    default:
                        int iH2 = i5 - iIntValue;
                        if (iH2 < 0) {
                            iH2 = vpcVar2.e.h() - iH2;
                        }
                        return Integer.valueOf(iH2);
                }
            }
        } : new sm5(i, 2);
        if (dvbVar.b == 0) {
            pmf.d();
            return 0L;
        }
        long jB = dvbVar.b(0);
        Comparable comparable = (Comparable) sm5Var.invoke(Integer.valueOf(cvk.n(jB)));
        int i4 = dvbVar.b;
        while (i2 < i4) {
            long jB2 = dvbVar.b(i2);
            Comparable comparable2 = (Comparable) sm5Var.invoke(Integer.valueOf(cvk.n(jB2)));
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
                jB = jB2;
            }
            i2++;
        }
        return jB;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.mpc r5, defpackage.vp4 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ppc
            if (r0 == 0) goto L13
            r0 = r6
            ppc r0 = (defpackage.ppc) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            ppc r0 = new ppc
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.sf5.h0(r6)
            goto L5c
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L2c:
            defpackage.sf5.h0(r6)
            java.util.List r6 = r4.d()
            boolean r6 = r6.contains(r5)
            if (r6 == 0) goto L5f
            wpc r6 = r4.f()
            lsc r6 = r6.d
            r6.setValue(r5)
            cz5 r6 = r4.k
            if (r6 == 0) goto L5c
            isc r1 = r4.e
            int r1 = r1.h()
            int r5 = r5.c(r1, r6)
            r0.G = r3
            r6 = 0
            java.lang.Object r4 = r4.c(r5, r6, r0)
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L5c
            return r5
        L5c:
            iei r4 = defpackage.iei.a
            return r4
        L5f:
            java.lang.String r4 = "The provided "
            java.lang.String r6 = " is not in the anchor list!"
            defpackage.xh6.l(r5, r6, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vpc.b(mpc, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(int r9, float r10, defpackage.vp4 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.qpc
            if (r0 == 0) goto L14
            r0 = r11
            qpc r0 = (defpackage.qpc) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.H = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            qpc r0 = new qpc
            r0.<init>(r8, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.F
            int r0 = r6.H
            r1 = 0
            r7 = 0
            r2 = 1
            if (r0 == 0) goto L34
            if (r0 != r2) goto L2e
            int r9 = r6.E
            defpackage.sf5.h0(r11)     // Catch: java.lang.Throwable -> L2b
            goto L59
        L2b:
            r0 = move-exception
            r10 = r0
            goto L68
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r8)
            return r1
        L34:
            defpackage.sf5.h0(r11)
            r8.j(r2)     // Catch: java.lang.Throwable -> L2b
            int r11 = r8.f     // Catch: java.lang.Throwable -> L2b
            float r11 = (float) r11     // Catch: java.lang.Throwable -> L2b
            r0 = r2
            float r2 = (float) r9     // Catch: java.lang.Throwable -> L2b
            kl7 r4 = r8.i     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L62
            ska r5 = new ska     // Catch: java.lang.Throwable -> L2b
            r1 = 12
            r5.<init>(r1, r8)     // Catch: java.lang.Throwable -> L2b
            r6.E = r9     // Catch: java.lang.Throwable -> L2b
            r6.H = r0     // Catch: java.lang.Throwable -> L2b
            r3 = r10
            r1 = r11
            java.lang.Object r10 = defpackage.mpk.k(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2b
            m45 r11 = defpackage.m45.E
            if (r10 != r11) goto L59
            return r11
        L59:
            r8.i(r9)
            r8.j(r7)
            iei r8 = defpackage.iei.a
            return r8
        L62:
            java.lang.String r10 = "anchoringAnimationSpec"
            defpackage.x44.o0(r10)     // Catch: java.lang.Throwable -> L2b
            throw r1     // Catch: java.lang.Throwable -> L2b
        L68:
            r8.i(r9)
            r8.j(r7)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vpc.c(int, float, vp4):java.lang.Object");
    }

    public final List d() {
        return (List) this.g.getValue();
    }

    public final int e() {
        return f().c.h();
    }

    public final wpc f() {
        return (wpc) this.b.getValue();
    }

    public final int g() {
        isc iscVar = this.e;
        if (iscVar.h() == -1 || f().a.h() == -1) {
            return -1;
        }
        return wd6.e0(f().a.h(), 0, iscVar.h());
    }

    public final boolean h() {
        return ((Boolean) this.c.getValue()).booleanValue() || ((Boolean) this.d.getValue()).booleanValue();
    }

    public final void i(int i) {
        int iE0 = wd6.e0(i, 0, this.e.h());
        if (iE0 == f().c.h()) {
            return;
        }
        f().c.i(iE0);
        this.f = iE0;
    }

    public final void j(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }
}
