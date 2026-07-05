package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class lxd extends qw5 implements yzb {
    public boolean U;
    public zy7 V;
    public boolean W;
    public mxd X;
    public float Y;
    public final f0c Z = new f0c(this, null);
    public final hsc a0 = new hsc(MTTypesetterKt.kLineSkipLimitMultiplier);
    public final hsc b0 = new hsc(MTTypesetterKt.kLineSkipLimitMultiplier);

    public lxd(boolean z, zy7 zy7Var, boolean z2, mxd mxdVar, float f) {
        this.U = z;
        this.V = zy7Var;
        this.W = z2;
        this.X = mxdVar;
        this.Y = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s1(defpackage.lxd r8, defpackage.vp4 r9) {
        /*
            r8.getClass()
            boolean r0 = r9 instanceof defpackage.hxd
            if (r0 == 0) goto L17
            r0 = r9
            hxd r0 = (defpackage.hxd) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.G = r1
        L15:
            r5 = r0
            goto L1d
        L17:
            hxd r0 = new hxd
            r0.<init>(r8, r9)
            goto L15
        L1d:
            java.lang.Object r9 = r5.E
            int r0 = r5.G
            iei r7 = defpackage.iei.a
            r1 = 1
            if (r0 == 0) goto L36
            if (r0 != r1) goto L2f
            defpackage.sf5.h0(r9)     // Catch: java.lang.Throwable -> L2c
            goto L57
        L2c:
            r0 = move-exception
            r9 = r0
            goto L6c
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r8)
            r8 = 0
            return r8
        L36:
            defpackage.sf5.h0(r9)
            mxd r9 = r8.X     // Catch: java.lang.Throwable -> L2c
            r5.G = r1     // Catch: java.lang.Throwable -> L2c
            a80 r1 = r9.a     // Catch: java.lang.Throwable -> L2c
            java.lang.Float r2 = new java.lang.Float     // Catch: java.lang.Throwable -> L2c
            r9 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L2c
            r4 = 0
            r6 = 14
            r3 = 0
            java.lang.Object r9 = defpackage.a80.c(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2c
            m45 r0 = defpackage.m45.E
            if (r9 != r0) goto L53
            goto L54
        L53:
            r9 = r7
        L54:
            if (r9 != r0) goto L57
            return r0
        L57:
            boolean r9 = r8.R
            if (r9 == 0) goto L6b
            int r9 = r8.v1()
            float r9 = (float) r9
            r8.x1(r9)
            int r9 = r8.v1()
            float r9 = (float) r9
            r8.y1(r9)
        L6b:
            return r7
        L6c:
            boolean r0 = r8.R
            if (r0 == 0) goto L80
            int r0 = r8.v1()
            float r0 = (float) r0
            r8.x1(r0)
            int r0 = r8.v1()
            float r0 = (float) r0
            r8.y1(r0)
        L80:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lxd.s1(lxd, vp4):java.lang.Object");
    }

    @Override // defpackage.yzb
    public final long F(long j, int i, long j2) {
        if (this.X.a.f() || !this.W || i != 1) {
            return 0L;
        }
        long jU1 = u1(j2);
        gb9.D(d1(), null, null, new al8(this, (tp4) null, 24), 3);
        return jU1;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.yzb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O0(long r5, defpackage.tp4 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.jxd
            if (r0 == 0) goto L13
            r0 = r7
            jxd r0 = (defpackage.jxd) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L1a
        L13:
            jxd r0 = new jxd
            vp4 r7 = (defpackage.vp4) r7
            r0.<init>(r4, r7)
        L1a:
            java.lang.Object r7 = r0.E
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            defpackage.sf5.h0(r7)
            goto L40
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.sf5.h0(r7)
            float r5 = defpackage.qsi.e(r5)
            r0.G = r2
            java.lang.Object r7 = r4.w1(r5, r0)
            m45 r4 = defpackage.m45.E
            if (r7 != r4) goto L40
            return r4
        L40:
            java.lang.Number r7 = (java.lang.Number) r7
            float r4 = r7.floatValue()
            r5 = 0
            long r4 = defpackage.lvj.e(r5, r4)
            qsi r4 = defpackage.qsi.a(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lxd.O0(long, tp4):java.lang.Object");
    }

    @Override // defpackage.yzb
    public final long X(int i, long j) {
        if (!this.X.a.f() && this.W && i == 1 && Float.intBitsToFloat((int) (4294967295L & j)) < MTTypesetterKt.kLineSkipLimitMultiplier) {
            return u1(j);
        }
        return 0L;
    }

    @Override // defpackage.hqb
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.hqb
    public final void h1() {
        p1(this.Z);
        gb9.D(d1(), null, null, new ixd(this, null, 0), 3);
        y1(this.U ? v1() : MTTypesetterKt.kLineSkipLimitMultiplier);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t1(defpackage.vp4 r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.gxd
            if (r0 == 0) goto L14
            r0 = r10
            gxd r0 = (defpackage.gxd) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.G = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            gxd r0 = new gxd
            r0.<init>(r9, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r5.E
            int r0 = r5.G
            iei r7 = defpackage.iei.a
            r1 = 1
            r8 = 0
            if (r0 == 0) goto L34
            if (r0 != r1) goto L2d
            defpackage.sf5.h0(r10)     // Catch: java.lang.Throwable -> L2a
            goto L53
        L2a:
            r0 = move-exception
            r10 = r0
            goto L5a
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r9)
            r9 = 0
            return r9
        L34:
            defpackage.sf5.h0(r10)
            mxd r10 = r9.X     // Catch: java.lang.Throwable -> L2a
            r5.G = r1     // Catch: java.lang.Throwable -> L2a
            a80 r1 = r10.a     // Catch: java.lang.Throwable -> L2a
            java.lang.Float r2 = new java.lang.Float     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L2a
            r4 = 0
            r6 = 14
            r3 = 0
            java.lang.Object r10 = defpackage.a80.c(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2a
            m45 r0 = defpackage.m45.E
            if (r10 != r0) goto L4f
            goto L50
        L4f:
            r10 = r7
        L50:
            if (r10 != r0) goto L53
            return r0
        L53:
            r9.x1(r8)
            r9.y1(r8)
            return r7
        L5a:
            r9.x1(r8)
            r9.y1(r8)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lxd.t1(vp4):java.lang.Object");
    }

    public final long u1(long j) {
        float fH;
        float fV1;
        if (this.U) {
            fH = 0.0f;
        } else {
            hsc hscVar = this.b0;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L)) + hscVar.h();
            if (fIntBitsToFloat < MTTypesetterKt.kLineSkipLimitMultiplier) {
                fIntBitsToFloat = 0.0f;
            }
            fH = fIntBitsToFloat - hscVar.h();
            x1(fIntBitsToFloat);
            if (hscVar.h() * 0.5f <= v1()) {
                fV1 = hscVar.h() * 0.5f;
            } else {
                float fD0 = wd6.d0(Math.abs((hscVar.h() * 0.5f) / v1()) - 1.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2.0f);
                fV1 = v1() + (v1() * (fD0 - (((float) Math.pow(fD0, 2.0d)) / 4.0f)));
            }
            y1(fV1);
        }
        return (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) << 32) | (((long) Float.floatToRawIntBits(fH)) & 4294967295L);
    }

    public final int v1() {
        return yfd.W(this).d0.M0(this.Y);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w1(float r6, defpackage.vp4 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.kxd
            if (r0 == 0) goto L13
            r0 = r7
            kxd r0 = (defpackage.kxd) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            kxd r0 = new kxd
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.F
            int r1 = r0.H
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L28
            float r6 = r0.E
            defpackage.sf5.h0(r7)
            goto L6f
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            r5 = 0
            return r5
        L2f:
            defpackage.sf5.h0(r7)
            boolean r7 = r5.U
            if (r7 == 0) goto L3c
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r3)
            return r5
        L3c:
            hsc r7 = r5.b0
            float r1 = r7.h()
            r4 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r4
            int r4 = r5.v1()
            float r4 = (float) r4
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto L53
            zy7 r1 = r5.V
            r1.a()
        L53:
            float r7 = r7.h()
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 != 0) goto L5d
        L5b:
            r6 = r3
            goto L62
        L5d:
            int r7 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r7 >= 0) goto L62
            goto L5b
        L62:
            r0.E = r6
            r0.H = r2
            java.lang.Object r7 = r5.t1(r0)
            m45 r0 = defpackage.m45.E
            if (r7 != r0) goto L6f
            return r0
        L6f:
            r5.x1(r3)
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lxd.w1(float, vp4):java.lang.Object");
    }

    public final void x1(float f) {
        this.b0.i(f);
    }

    public final void y1(float f) {
        this.a0.i(f);
    }
}
