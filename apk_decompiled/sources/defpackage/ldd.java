package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ldd implements hdd, cz5 {
    public final /* synthetic */ cz5 E;
    public boolean F;
    public boolean G;
    public final jxb H;

    public ldd(cz5 cz5Var) {
        cz5Var.getClass();
        this.E = cz5Var;
        this.H = new jxb();
    }

    @Override // defpackage.cz5
    public final float D(long j) {
        return this.E.D(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.hdd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(defpackage.vp4 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.jdd
            if (r0 == 0) goto L13
            r0 = r5
            jdd r0 = (defpackage.jdd) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            jdd r0 = new jdd
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.E
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.sf5.h0(r5)
            goto L44
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.sf5.h0(r5)
            boolean r5 = r4.F
            if (r5 != 0) goto L44
            boolean r5 = r4.G
            if (r5 != 0) goto L44
            r0.G = r2
            jxb r5 = r4.H
            java.lang.Object r5 = r5.c(r0)
            m45 r0 = defpackage.m45.E
            if (r5 != r0) goto L44
            return r0
        L44:
            boolean r4 = r4.F
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ldd.E(vp4):java.lang.Object");
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

    @Override // defpackage.cz5
    public final float c0(int i) {
        return this.E.c0(i);
    }

    @Override // defpackage.cz5
    public final float g0(float f) {
        return this.E.g0(f);
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
        return this.E.q0(f);
    }

    @Override // defpackage.cz5
    public final long r(float f) {
        return this.E.r(f);
    }

    @Override // defpackage.cz5
    public final long s(long j) {
        return this.E.s(j);
    }
}
