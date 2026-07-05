package defpackage;

import android.media.AudioManager;

/* JADX INFO: loaded from: classes2.dex */
public final class ki1 {
    public final pi1 a;
    public final dkb b;
    public final y31 c;
    public final p41 d;
    public final d7 e;
    public final int f;
    public final y49 g;
    public final h86 h;
    public volatile boolean i;
    public final jxb j = new jxb();
    public volatile s51 k;
    public volatile m6b l;
    public volatile m6b m;
    public final zy1 n;
    public final ih2 o;
    public final zy1 p;
    public final ih2 q;
    public final zy1 r;
    public final ih2 s;
    public final lsc t;
    public final lsc u;
    public final lsc v;
    public volatile w0j w;
    public final lsc x;
    public final s41 y;
    public final mh2 z;

    public ki1(pi1 pi1Var, dkb dkbVar, y31 y31Var, p41 p41Var, d7 d7Var, int i, y49 y49Var, h86 h86Var) {
        this.a = pi1Var;
        this.b = dkbVar;
        this.c = y31Var;
        this.d = p41Var;
        this.e = d7Var;
        this.f = i;
        this.g = y49Var;
        this.h = h86Var;
        zy1 zy1VarP = wd6.P(Integer.MAX_VALUE, 6, null);
        this.n = zy1VarP;
        this.o = j8.b0(zy1VarP);
        zy1 zy1VarP2 = wd6.P(Integer.MAX_VALUE, 6, null);
        this.p = zy1VarP2;
        this.q = j8.b0(zy1VarP2);
        zy1 zy1VarP3 = wd6.P(Integer.MAX_VALUE, 6, null);
        this.r = zy1VarP3;
        this.s = j8.b0(zy1VarP3);
        Boolean bool = Boolean.FALSE;
        this.t = mpk.P(bool);
        this.u = mpk.P(bool);
        this.v = mpk.P(null);
        this.w = w0j.c;
        this.x = mpk.P(lm6.E);
        this.y = y31.b;
        this.z = new mh2(new g9(this, (tp4) null, 15), im6.E, -2, py1.E);
    }

    public final cpc a() {
        AudioManager audioManager = this.a.a;
        if (audioManager != null) {
            return new cpc(gwk.k(audioManager), gwk.l(audioManager));
        }
        lm6 lm6Var = lm6.E;
        return new cpc(lm6Var, lm6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.vp4 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.hi1
            if (r0 == 0) goto L13
            r0 = r9
            hi1 r0 = (defpackage.hi1) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            hi1 r0 = new hi1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.F
            m45 r1 = defpackage.m45.E
            int r2 = r0.H
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            s51 r0 = r0.E
            defpackage.sf5.h0(r9)
            goto L63
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r8)
            return r3
        L33:
            defpackage.sf5.h0(r9)
            return r9
        L37:
            defpackage.sf5.h0(r9)
            s51 r9 = r8.k
            if (r9 != 0) goto L4c
            dkb r8 = r8.b
            r0.E = r3
            r0.H = r5
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L4b
            goto L5f
        L4b:
            return r8
        L4c:
            r0.E = r9
            r0.H = r4
            p41 r2 = r8.d
            long r4 = defpackage.p41.c
            uh6 r6 = new uh6
            r6.<init>(r4)
            java.lang.Object r0 = r2.i(r9, r6, r0)
            if (r0 != r1) goto L60
        L5f:
            return r1
        L60:
            r7 = r0
            r0 = r9
            r9 = r7
        L63:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L75
            s51 r9 = r8.k
            boolean r9 = defpackage.x44.r(r9, r0)
            if (r9 == 0) goto L75
            r8.k = r3
        L75:
            iei r8 = defpackage.iei.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ki1.b(vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.s51 r8, defpackage.vp4 r9) {
        /*
            r7 = this;
            iei r0 = defpackage.iei.a
            boolean r1 = r9 instanceof defpackage.ii1
            if (r1 == 0) goto L15
            r1 = r9
            ii1 r1 = (defpackage.ii1) r1
            int r2 = r1.H
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.H = r2
            goto L1a
        L15:
            ii1 r1 = new ii1
            r1.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r1.F
            m45 r2 = defpackage.m45.E
            int r3 = r1.H
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L32
            if (r3 != r5) goto L2c
            s51 r8 = r1.E
            defpackage.sf5.h0(r9)
            goto L59
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r4
        L32:
            defpackage.sf5.h0(r9)
            lsc r9 = r7.v
            r9.setValue(r8)
            r7.k = r8
            pi1 r9 = r7.a
            boolean r9 = r9.d()
            if (r9 == 0) goto L45
            goto L6b
        L45:
            r1.E = r8
            r1.H = r5
            p41 r9 = r7.d
            long r5 = defpackage.p41.c
            uh6 r3 = new uh6
            r3.<init>(r5)
            java.lang.Object r9 = r9.i(r8, r3, r1)
            if (r9 != r2) goto L59
            return r2
        L59:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L6b
            s51 r9 = r7.k
            boolean r8 = defpackage.x44.r(r9, r8)
            if (r8 == 0) goto L6b
            r7.k = r4
        L6b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ki1.c(s51, vp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (defpackage.gb9.c0(r2, r5, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.vp4 r13) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r13 instanceof defpackage.ji1
            if (r0 == 0) goto L13
            r0 = r13
            ji1 r0 = (defpackage.ji1) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            ji1 r0 = new ji1
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.F
            m45 r1 = defpackage.m45.E
            int r2 = r0.H
            r3 = 2
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L37
            if (r2 != r3) goto L30
            hxb r12 = r0.E
            defpackage.sf5.h0(r13)     // Catch: java.lang.Throwable -> L2d
            goto L78
        L2d:
            r0 = move-exception
            r13 = r0
            goto L7e
        L30:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r12)
            r12 = 0
            return r12
        L37:
            hxb r2 = r0.E
            defpackage.sf5.h0(r13)
            r13 = r2
            goto L4e
        L3e:
            defpackage.sf5.h0(r13)
            jxb r13 = r12.j
            r0.E = r13
            r0.H = r4
            java.lang.Object r2 = r13.c(r0)
            if (r2 != r1) goto L4e
            goto L70
        L4e:
            boolean r2 = r12.i     // Catch: java.lang.Throwable -> L71
            if (r2 != 0) goto L77
            r12.i = r4     // Catch: java.lang.Throwable -> L71
            m6b r7 = r12.l     // Catch: java.lang.Throwable -> L71
            r12.l = r9     // Catch: java.lang.Throwable -> L71
            m6b r8 = r12.m     // Catch: java.lang.Throwable -> L71
            r12.m = r9     // Catch: java.lang.Throwable -> L71
            b6c r2 = defpackage.b6c.F     // Catch: java.lang.Throwable -> L71
            o0 r5 = new o0     // Catch: java.lang.Throwable -> L71
            r10 = 22
            r6 = r12
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L71
            r0.E = r13     // Catch: java.lang.Throwable -> L71
            r0.H = r3     // Catch: java.lang.Throwable -> L71
            java.lang.Object r12 = defpackage.gb9.c0(r2, r5, r0)     // Catch: java.lang.Throwable -> L71
            if (r12 != r1) goto L77
        L70:
            return r1
        L71:
            r0 = move-exception
            r12 = r0
            r11 = r13
            r13 = r12
            r12 = r11
            goto L7e
        L77:
            r12 = r13
        L78:
            iei r13 = defpackage.iei.a     // Catch: java.lang.Throwable -> L2d
            r12.d(r9)
            return r13
        L7e:
            r12.d(r9)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ki1.d(vp4):java.lang.Object");
    }
}
