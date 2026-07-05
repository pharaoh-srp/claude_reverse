package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class d0h implements cz5, tp4 {
    public final /* synthetic */ e0h E;
    public final ua2 F;
    public ua2 G;
    public u7d H = u7d.F;
    public final im6 I = im6.E;
    public final /* synthetic */ e0h J;

    public d0h(e0h e0hVar, ua2 ua2Var) {
        this.J = e0hVar;
        this.E = e0hVar;
        this.F = ua2Var;
    }

    @Override // defpackage.cz5
    public final float D(long j) {
        return this.E.D(j);
    }

    @Override // defpackage.cz5
    public final int E0(long j) {
        return this.E.E0(j);
    }

    @Override // defpackage.cz5
    public final int M0(float f) {
        return this.E.M0(f);
    }

    @Override // defpackage.cz5
    public final long T(int i) {
        return this.E.T(i);
    }

    @Override // defpackage.cz5
    public final long U0(long j) {
        return this.E.U0(j);
    }

    @Override // defpackage.cz5
    public final long W(float f) {
        return this.E.W(f);
    }

    @Override // defpackage.cz5
    public final float W0(long j) {
        return this.E.W0(j);
    }

    public final Object a(u7d u7dVar, vd1 vd1Var) {
        ua2 ua2Var = new ua2(1, zni.I(vd1Var));
        ua2Var.t();
        this.H = u7dVar;
        this.G = ua2Var;
        return ua2Var.r();
    }

    public final long b() {
        e0h e0hVar = this.J;
        long jU0 = e0hVar.U0(yfd.W(e0hVar).f0.d());
        long j = e0hVar.d0;
        return (((long) Float.floatToRawIntBits(Math.max(MTTypesetterKt.kLineSkipLimitMultiplier, Float.intBitsToFloat((int) (jU0 >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(MTTypesetterKt.kLineSkipLimitMultiplier, Float.intBitsToFloat((int) (jU0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    public final ovi c() {
        return yfd.W(this.J).f0;
    }

    @Override // defpackage.cz5
    public final float c0(int i) {
        return this.E.c0(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r8, defpackage.pz7 r10, defpackage.vd1 r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.b0h
            if (r0 == 0) goto L13
            r0 = r11
            b0h r0 = (defpackage.b0h) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            b0h r0 = new b0h
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.F
            int r1 = r0.H
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            fkg r7 = r0.E
            defpackage.sf5.h0(r11)     // Catch: java.lang.Throwable -> L28
            goto L68
        L28:
            r8 = move-exception
            goto L72
        L2a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r2
        L30:
            defpackage.sf5.h0(r11)
            r4 = 0
            int r11 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r11 > 0) goto L4a
            ua2 r11 = r7.G
            if (r11 == 0) goto L4a
            androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r1 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
            r1.<init>(r8)
            hre r4 = new hre
            r4.<init>(r1)
            r11.resumeWith(r4)
        L4a:
            e0h r11 = r7.J
            l45 r11 = r11.d1()
            l70 r1 = new l70
            r1.<init>(r8, r7, r2)
            r8 = 3
            fkg r8 = defpackage.gb9.D(r11, r2, r2, r1, r8)
            r0.E = r8     // Catch: java.lang.Throwable -> L6e
            r0.H = r3     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r11 = r10.invoke(r7, r0)     // Catch: java.lang.Throwable -> L6e
            m45 r7 = defpackage.m45.E
            if (r11 != r7) goto L67
            return r7
        L67:
            r7 = r8
        L68:
            androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r8 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.E
            r7.d(r8)
            return r11
        L6e:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L72:
            androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r9 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.E
            r7.d(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d0h.d(long, pz7, vd1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(long r5, defpackage.pz7 r7, defpackage.vd1 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.c0h
            if (r0 == 0) goto L13
            r0 = r8
            c0h r0 = (defpackage.c0h) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            c0h r0 = new c0h
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.sf5.h0(r8)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3b
            return r8
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L2c:
            defpackage.sf5.h0(r8)
            r0.G = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3b
            java.lang.Object r4 = r4.d(r5, r7, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3b
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L3a
            return r5
        L3a:
            return r4
        L3b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d0h.e(long, pz7, vd1):java.lang.Object");
    }

    @Override // defpackage.cz5
    public final float g0(float f) {
        return f / this.E.getDensity();
    }

    @Override // defpackage.tp4
    public final c45 getContext() {
        return this.I;
    }

    @Override // defpackage.cz5
    public final float getDensity() {
        return this.E.getDensity();
    }

    @Override // defpackage.cz5
    public final float k0() {
        return this.E.k0();
    }

    @Override // defpackage.cz5
    public final float q0(float f) {
        return this.E.getDensity() * f;
    }

    @Override // defpackage.cz5
    public final long r(float f) {
        return this.E.r(f);
    }

    @Override // defpackage.tp4
    public final void resumeWith(Object obj) {
        e0h e0hVar = this.J;
        synchronized (e0hVar.a0) {
            e0hVar.Z.l(this);
        }
        this.F.resumeWith(obj);
    }

    @Override // defpackage.cz5
    public final long s(long j) {
        return this.E.s(j);
    }
}
