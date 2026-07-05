package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pr7 implements lp7 {
    public final /* synthetic */ lp7 E;
    public final /* synthetic */ cve F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ bz7 H;

    public pr7(lp7 lp7Var, cve cveVar, boolean z, bz7 bz7Var) {
        this.E = lp7Var;
        this.F = cveVar;
        this.G = z;
        this.H = bz7Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r6.g(r8, r0) == r5) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.lp7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.Object r7, defpackage.tp4 r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.or7
            if (r0 == 0) goto L13
            r0 = r8
            or7 r0 = (defpackage.or7) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.F = r1
            goto L18
        L13:
            or7 r0 = new or7
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.E
            int r1 = r0.F
            r2 = 0
            r3 = 2
            r4 = 1
            m45 r5 = defpackage.m45.E
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.sf5.h0(r8)
            goto L5b
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r2
        L31:
            lp7 r6 = r0.G
            defpackage.sf5.h0(r8)
            goto L50
        L37:
            defpackage.sf5.h0(r8)
            java.util.Set r7 = (java.util.Set) r7
            lp7 r7 = r6.E
            r0.G = r7
            r0.F = r4
            cve r8 = r6.F
            boolean r1 = r6.G
            bz7 r6 = r6.H
            java.lang.Object r8 = defpackage.u00.G(r0, r8, r4, r1, r6)
            if (r8 != r5) goto L4f
            goto L5a
        L4f:
            r6 = r7
        L50:
            r0.G = r2
            r0.F = r3
            java.lang.Object r6 = r6.g(r8, r0)
            if (r6 != r5) goto L5b
        L5a:
            return r5
        L5b:
            iei r6 = defpackage.iei.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pr7.g(java.lang.Object, tp4):java.lang.Object");
    }
}
