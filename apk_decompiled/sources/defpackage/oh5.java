package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oh5 extends xzg implements bz7 {
    public int E;
    public int F;
    public final /* synthetic */ bi5 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh5(bi5 bi5Var, tp4 tp4Var) {
        super(1, tp4Var);
        this.G = bi5Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        return new oh5(this.G, tp4Var);
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        return ((oh5) create((tp4) obj)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r10 == r7) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        if (r10 != r7) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        if (r0.I(r9) != r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        return r7;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            int r0 = r9.F
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            bi5 r6 = r9.G
            m45 r7 = defpackage.m45.E
            if (r0 == 0) goto L2f
            if (r0 == r4) goto L2b
            if (r0 == r3) goto L27
            if (r0 == r2) goto L23
            if (r0 != r1) goto L1d
            int r9 = r9.E
            defpackage.sf5.h0(r10)     // Catch: java.lang.Throwable -> L1b
            goto L78
        L1b:
            r10 = move-exception
            goto L7f
        L1d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r9)
            return r5
        L23:
            defpackage.sf5.h0(r10)
            goto L65
        L27:
            defpackage.sf5.h0(r10)
            goto L51
        L2b:
            defpackage.sf5.h0(r10)
            goto L47
        L2f:
            defpackage.sf5.h0(r10)
            u0h r10 = r6.j
            boolean r10 = r10.b()
            if (r10 == 0) goto L4e
            z7g r10 = r6.f()
            r9.F = r4
            java.lang.Integer r10 = r10.a()
            if (r10 != r7) goto L47
            goto L77
        L47:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            goto L6b
        L4e:
            r9.F = r3
            r10 = r5
        L51:
            crd r10 = (defpackage.crd) r10
            mp4 r0 = r6.b
            c45 r0 = r0.E
            eh5 r3 = new eh5
            r3.<init>(r6, r10, r5)
            r9.F = r2
            java.lang.Object r10 = defpackage.gb9.c0(r0, r3, r9)
            if (r10 != r7) goto L65
            goto L77
        L65:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
        L6b:
            el5 r0 = r6.h     // Catch: java.lang.Throwable -> L7b
            r9.E = r10     // Catch: java.lang.Throwable -> L7b
            r9.F = r1     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r9 = r0.I(r9)     // Catch: java.lang.Throwable -> L7b
            if (r9 != r7) goto L78
        L77:
            return r7
        L78:
            iei r9 = defpackage.iei.a
            return r9
        L7b:
            r9 = move-exception
            r8 = r10
            r10 = r9
            r9 = r8
        L7f:
            gmf r0 = r6.g
            e3e r1 = new e3e
            r1.<init>(r10, r9)
            r0.M(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oh5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
