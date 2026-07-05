package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dzb extends xzg implements pz7 {
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ nf6 G;
    public final /* synthetic */ l45 H;
    public final /* synthetic */ of6 I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ aae K;
    public final /* synthetic */ aae L;
    public final /* synthetic */ aae M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzb(nf6 nf6Var, l45 l45Var, of6 of6Var, boolean z, aae aaeVar, aae aaeVar2, aae aaeVar3, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = nf6Var;
        this.H = l45Var;
        this.I = of6Var;
        this.J = z;
        this.K = aaeVar;
        this.L = aaeVar2;
        this.M = aaeVar3;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        dzb dzbVar = new dzb(this.G, this.H, this.I, this.J, this.K, this.L, this.M, tp4Var);
        dzbVar.F = obj;
        return dzbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((dzb) create((kp7) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        if (r8.a(r18) == r11) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
    
        if (r8.a(r18) != r11) goto L33;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            r18 = this;
            r1 = r18
            int r0 = r1.E
            r2 = 18
            l45 r3 = r1.H
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            of6 r8 = r1.I
            r9 = 0
            nf6 r10 = r1.G
            m45 r11 = defpackage.m45.E
            if (r0 == 0) goto L36
            if (r0 == r7) goto L30
            if (r0 == r6) goto L2c
            if (r0 == r5) goto L2c
            if (r0 == r4) goto L23
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r0)
            return r9
        L23:
            java.lang.Object r0 = r1.F
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            defpackage.sf5.h0(r19)
            goto Lb7
        L2c:
            defpackage.sf5.h0(r19)
            goto L9a
        L30:
            defpackage.sf5.h0(r19)     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L71
            goto L59
        L34:
            r0 = move-exception
            goto L9d
        L36:
            defpackage.sf5.h0(r19)
            java.lang.Object r0 = r1.F
            kp7 r0 = (defpackage.kp7) r0
            czb r12 = new czb     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L71
            nf6 r13 = r1.G     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L71
            boolean r14 = r1.J     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L71
            aae r15 = r1.K     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L71
            aae r4 = r1.L     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L71
            aae r6 = r1.M     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L71
            r16 = r4
            r17 = r6
            r12.<init>(r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L71
            r1.E = r7     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L71
            java.lang.Object r0 = r0.a(r12, r1)     // Catch: java.lang.Throwable -> L34 java.util.concurrent.CancellationException -> L71
            if (r0 != r11) goto L59
            goto Lb6
        L59:
            boolean r0 = r10.a()
            if (r0 == 0) goto L67
            al8 r0 = new al8
            r0.<init>(r10, r9, r2)
            defpackage.gb9.D(r3, r9, r9, r0, r5)
        L67:
            r0 = 2
            r1.E = r0
            java.lang.Object r0 = r8.a(r1)
            if (r0 != r11) goto L9a
            goto Lb6
        L71:
            lsc r0 = r10.a     // Catch: java.lang.Throwable -> L34
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L34
            r0.setValue(r4)     // Catch: java.lang.Throwable -> L34
            hsc r0 = r10.b     // Catch: java.lang.Throwable -> L34
            r4 = 0
            r0.i(r4)     // Catch: java.lang.Throwable -> L34
            hsc r0 = r10.c     // Catch: java.lang.Throwable -> L34
            r0.i(r4)     // Catch: java.lang.Throwable -> L34
            boolean r0 = r10.a()
            if (r0 == 0) goto L91
            al8 r0 = new al8
            r0.<init>(r10, r9, r2)
            defpackage.gb9.D(r3, r9, r9, r0, r5)
        L91:
            r1.E = r5
            java.lang.Object r0 = r8.a(r1)
            if (r0 != r11) goto L9a
            goto Lb6
        L9a:
            iei r0 = defpackage.iei.a
            return r0
        L9d:
            boolean r4 = r10.a()
            if (r4 == 0) goto Lab
            al8 r4 = new al8
            r4.<init>(r10, r9, r2)
            defpackage.gb9.D(r3, r9, r9, r4, r5)
        Lab:
            r1.F = r0
            r2 = 4
            r1.E = r2
            java.lang.Object r1 = r8.a(r1)
            if (r1 != r11) goto Lb7
        Lb6:
            return r11
        Lb7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
