package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class upc extends xzg implements bz7 {
    public int E;
    public final /* synthetic */ vpc F;
    public final /* synthetic */ float G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public upc(vpc vpcVar, float f, tp4 tp4Var) {
        super(1, tp4Var);
        this.F = vpcVar;
        this.G = f;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        return new upc(this.F, this.G, tp4Var);
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        return ((upc) create((tp4) obj)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r5.c((int) (r0 >> 32), r10, r9) == r6) goto L22;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.E
            r1 = 0
            r2 = 0
            r3 = 2
            r4 = 1
            vpc r5 = r9.F
            m45 r6 = defpackage.m45.E
            if (r0 == 0) goto L20
            if (r0 == r4) goto L1c
            if (r0 != r3) goto L16
            defpackage.sf5.h0(r10)     // Catch: java.lang.Throwable -> L14
            goto L6c
        L14:
            r9 = move-exception
            goto L78
        L16:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r9)
            return r1
        L1c:
            defpackage.sf5.h0(r10)     // Catch: java.lang.Throwable -> L14
            goto L37
        L20:
            defpackage.sf5.h0(r10)
            r5.j(r4)     // Catch: java.lang.Throwable -> L14
            eo7 r10 = r5.j     // Catch: java.lang.Throwable -> L14
            if (r10 == 0) goto L72
            float r0 = r9.G     // Catch: java.lang.Throwable -> L14
            rpc r1 = r5.l     // Catch: java.lang.Throwable -> L14
            r9.E = r4     // Catch: java.lang.Throwable -> L14
            java.lang.Object r10 = r10.a(r1, r0, r9)     // Catch: java.lang.Throwable -> L14
            if (r10 != r6) goto L37
            goto L6b
        L37:
            java.lang.Number r10 = (java.lang.Number) r10     // Catch: java.lang.Throwable -> L14
            float r10 = r10.floatValue()     // Catch: java.lang.Throwable -> L14
            dvb r0 = r5.h     // Catch: java.lang.Throwable -> L14
            int r1 = r5.f     // Catch: java.lang.Throwable -> L14
            long r0 = defpackage.vpc.a(r5, r0, r1, r10)     // Catch: java.lang.Throwable -> L14
            java.util.List r4 = r5.d()     // Catch: java.lang.Throwable -> L14
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r0
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L14
            java.lang.Object r4 = r4.get(r7)     // Catch: java.lang.Throwable -> L14
            mpc r4 = (defpackage.mpc) r4     // Catch: java.lang.Throwable -> L14
            wpc r7 = r5.f()     // Catch: java.lang.Throwable -> L14
            lsc r7 = r7.d     // Catch: java.lang.Throwable -> L14
            r7.setValue(r4)     // Catch: java.lang.Throwable -> L14
            r4 = 32
            long r0 = r0 >> r4
            int r0 = (int) r0     // Catch: java.lang.Throwable -> L14
            r9.E = r3     // Catch: java.lang.Throwable -> L14
            java.lang.Object r9 = r5.c(r0, r10, r9)     // Catch: java.lang.Throwable -> L14
            if (r9 != r6) goto L6c
        L6b:
            return r6
        L6c:
            r5.j(r2)
            iei r9 = defpackage.iei.a
            return r9
        L72:
            java.lang.String r9 = "flingBehavior"
            defpackage.x44.o0(r9)     // Catch: java.lang.Throwable -> L14
            throw r1     // Catch: java.lang.Throwable -> L14
        L78:
            r5.j(r2)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.upc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
