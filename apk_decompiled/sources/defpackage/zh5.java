package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zh5 extends xzg implements bz7 {
    public bae E;
    public int F;
    public final /* synthetic */ bae G;
    public final /* synthetic */ bi5 H;
    public final /* synthetic */ lk7 I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ boolean K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh5(bae baeVar, bi5 bi5Var, lk7 lk7Var, Object obj, boolean z, tp4 tp4Var) {
        super(1, tp4Var);
        this.G = baeVar;
        this.H = bi5Var;
        this.I = lk7Var;
        this.J = obj;
        this.K = z;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        return new zh5(this.G, this.H, this.I, this.J, this.K, tp4Var);
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        return ((zh5) create((tp4) obj)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        if (r10 == r8) goto L21;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.io.IOException {
        /*
            r9 = this;
            int r0 = r9.F
            iei r1 = defpackage.iei.a
            r2 = 0
            java.lang.Object r3 = r9.J
            bi5 r4 = r9.H
            bae r5 = r9.G
            r6 = 2
            r7 = 1
            m45 r8 = defpackage.m45.E
            if (r0 == 0) goto L25
            if (r0 == r7) goto L1f
            if (r0 != r6) goto L19
            defpackage.sf5.h0(r10)
            goto L6c
        L19:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r9)
            return r2
        L1f:
            bae r0 = r9.E
            defpackage.sf5.h0(r10)
            goto L44
        L25:
            defpackage.sf5.h0(r10)
            z7g r10 = r4.f()
            r9.E = r5
            r9.F = r7
            tk5 r10 = r10.b
            java.lang.Object r10 = r10.F
            java.util.concurrent.atomic.AtomicInteger r10 = (java.util.concurrent.atomic.AtomicInteger) r10
            int r10 = r10.incrementAndGet()
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r10)
            if (r0 != r8) goto L42
            goto L6b
        L42:
            r10 = r0
            r0 = r5
        L44:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r0.E = r10
            r9.E = r2
            r9.F = r6
            lk7 r10 = r9.I
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.c
            boolean r0 = r0.get()
            if (r0 != 0) goto L85
            java.io.File r0 = r10.a
            kk7 r6 = new kk7
            r6.<init>(r10, r3, r2)
            java.lang.Object r10 = defpackage.knk.m(r0, r6, r9)
            if (r10 != r8) goto L68
            goto L69
        L68:
            r10 = r1
        L69:
            if (r10 != r8) goto L6c
        L6b:
            return r8
        L6c:
            boolean r9 = r9.K
            if (r9 == 0) goto L84
            gmf r9 = r4.g
            qf5 r10 = new qf5
            if (r3 == 0) goto L7b
            int r0 = r3.hashCode()
            goto L7c
        L7b:
            r0 = 0
        L7c:
            int r2 = r5.E
            r10.<init>(r3, r0, r2)
            r9.M(r10)
        L84:
            return r1
        L85:
            java.lang.String r9 = "This scope has already been closed."
            defpackage.sz6.j(r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zh5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
