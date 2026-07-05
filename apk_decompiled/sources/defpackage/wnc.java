package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wnc implements xx1 {
    public final koc b;
    public final xx1 c;
    public final fu9 d;

    public wnc(koc kocVar, xx1 xx1Var, fu9 fu9Var) {
        this.b = kocVar;
        this.c = xx1Var;
        this.d = fu9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
    @Override // defpackage.xx1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(float r11, float r12, float r13) {
        /*
            r10 = this;
            xx1 r0 = r10.c
            float r0 = r0.a(r11, r12, r13)
            r1 = 0
            int r2 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 <= 0) goto L14
            float r11 = r11 + r12
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 <= 0) goto L1e
        L12:
            r3 = r4
            goto L1e
        L14:
            float r11 = r11 + r12
            l9e r12 = defpackage.nzi.a
            r12 = 1065353216(0x3f800000, float:1.0)
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 > 0) goto L1e
            goto L12
        L1e:
            float r11 = java.lang.Math.abs(r0)
            int r11 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            fu9 r12 = defpackage.fu9.F
            ukc r2 = defpackage.ukc.F
            fu9 r4 = r10.d
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            koc r10 = r10.b
            if (r11 != 0) goto L31
            goto L69
        L31:
            if (r3 == 0) goto L69
            if (r4 != r12) goto L46
            coc r11 = r10.k()
            ukc r11 = r11.e
            if (r11 != r2) goto L46
            int r11 = r10.f
            int r11 = -r11
            int r12 = r10.n()
            int r12 = r12 + r11
            goto L48
        L46:
            int r12 = r10.f
        L48:
            float r11 = (float) r12
            float r11 = r11 * r5
        L4a:
            int r12 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r12 <= 0) goto L59
            int r12 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r12 >= 0) goto L59
            int r12 = r10.n()
            float r12 = (float) r12
            float r11 = r11 + r12
            goto L4a
        L59:
            int r12 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r12 >= 0) goto L68
            int r12 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r12 <= 0) goto L68
            int r12 = r10.n()
            float r12 = (float) r12
            float r11 = r11 - r12
            goto L59
        L68:
            return r11
        L69:
            int r11 = r10.f
            lsc r0 = r10.F
            int r11 = java.lang.Math.abs(r11)
            double r6 = (double) r11
            r8 = 4517329193108106637(0x3eb0c6f7a0b5ed8d, double:1.0E-6)
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 >= 0) goto L7c
            return r1
        L7c:
            if (r4 != r12) goto L8f
            coc r11 = r10.k()
            ukc r11 = r11.e
            if (r11 != r2) goto L8f
            int r11 = r10.f
            int r11 = -r11
            int r1 = r10.n()
            int r1 = r1 + r11
            goto L91
        L8f:
            int r1 = r10.f
        L91:
            float r11 = (float) r1
            float r11 = r11 * r5
            if (r4 != r12) goto Lb1
            coc r12 = r10.k()
            ukc r12 = r12.e
            if (r12 != r2) goto Lb1
            java.lang.Object r12 = r0.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto Laa
            goto Lc2
        Laa:
            int r10 = r10.n()
        Lae:
            float r10 = (float) r10
            float r11 = r11 + r10
            goto Lc2
        Lb1:
            java.lang.Object r12 = r0.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto Lc2
            int r10 = r10.n()
            goto Lae
        Lc2:
            float r10 = -r13
            float r10 = defpackage.wd6.d0(r11, r10, r13)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wnc.a(float, float, float):float");
    }
}
