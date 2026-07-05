package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class exb extends xzg implements pz7 {
    public hxb E;
    public Object F;
    public Object G;
    public fxb H;
    public int I;
    public /* synthetic */ Object J;
    public final /* synthetic */ zwb K;
    public final /* synthetic */ fxb L;
    public final /* synthetic */ pz7 M;
    public final /* synthetic */ Object N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exb(zwb zwbVar, fxb fxbVar, pz7 pz7Var, Object obj, tp4 tp4Var) {
        super(2, tp4Var);
        this.K = zwbVar;
        this.L = fxbVar;
        this.M = pz7Var;
        this.N = obj;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        exb exbVar = new exb(this.K, this.L, this.M, this.N, tp4Var);
        exbVar.J = obj;
        return exbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((exb) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // defpackage.vd1
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.I
            r1 = 2
            r2 = 1
            r3 = 0
            m45 r4 = defpackage.m45.E
            if (r0 == 0) goto L3c
            if (r0 == r2) goto L25
            if (r0 != r1) goto L1f
            java.lang.Object r0 = r8.F
            fxb r0 = (defpackage.fxb) r0
            hxb r1 = r8.E
            java.lang.Object r8 = r8.J
            bxb r8 = (defpackage.bxb) r8
            defpackage.sf5.h0(r9)     // Catch: java.lang.Throwable -> L1c
            goto L90
        L1c:
            r9 = move-exception
            goto Lab
        L1f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r8)
            return r3
        L25:
            fxb r0 = r8.H
            java.lang.Object r2 = r8.G
            java.lang.Object r5 = r8.F
            pz7 r5 = (defpackage.pz7) r5
            hxb r6 = r8.E
            java.lang.Object r7 = r8.J
            bxb r7 = (defpackage.bxb) r7
            defpackage.sf5.h0(r9)
            r9 = r6
            r6 = r5
            r5 = r9
            r9 = r0
            r0 = r7
            goto L78
        L3c:
            defpackage.sf5.h0(r9)
            java.lang.Object r9 = r8.J
            l45 r9 = (defpackage.l45) r9
            bxb r0 = new bxb
            c45 r9 = r9.getCoroutineContext()
            dd8 r5 = defpackage.dd8.J
            a45 r9 = r9.x0(r5)
            r9.getClass()
            lf9 r9 = (defpackage.lf9) r9
            zwb r5 = r8.K
            r0.<init>(r5, r9)
            fxb r9 = r8.L
            defpackage.fxb.a(r9, r0)
            jxb r5 = r9.b
            r8.J = r0
            r8.E = r5
            pz7 r6 = r8.M
            r8.F = r6
            java.lang.Object r7 = r8.N
            r8.G = r7
            r8.H = r9
            r8.I = r2
            java.lang.Object r2 = r5.c(r8)
            if (r2 != r4) goto L77
            goto L8a
        L77:
            r2 = r7
        L78:
            r8.J = r0     // Catch: java.lang.Throwable -> La5
            r8.E = r5     // Catch: java.lang.Throwable -> La5
            r8.F = r9     // Catch: java.lang.Throwable -> La5
            r8.G = r3     // Catch: java.lang.Throwable -> La5
            r8.H = r3     // Catch: java.lang.Throwable -> La5
            r8.I = r1     // Catch: java.lang.Throwable -> La5
            java.lang.Object r8 = r6.invoke(r2, r8)     // Catch: java.lang.Throwable -> La5
            if (r8 != r4) goto L8b
        L8a:
            return r4
        L8b:
            r1 = r9
            r9 = r8
            r8 = r0
            r0 = r1
            r1 = r5
        L90:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> La3
        L92:
            boolean r2 = r0.compareAndSet(r8, r3)     // Catch: java.lang.Throwable -> La3
            if (r2 == 0) goto L99
            goto L9f
        L99:
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> La3
            if (r2 == r8) goto L92
        L9f:
            r1.d(r3)
            return r9
        La3:
            r8 = move-exception
            goto Lbb
        La5:
            r8 = move-exception
            r1 = r9
            r9 = r8
            r8 = r0
            r0 = r1
            r1 = r5
        Lab:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> La3
        Lad:
            boolean r2 = r0.compareAndSet(r8, r3)     // Catch: java.lang.Throwable -> La3
            if (r2 != 0) goto Lba
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> La3
            if (r2 != r8) goto Lba
            goto Lad
        Lba:
            throw r9     // Catch: java.lang.Throwable -> La3
        Lbb:
            r1.d(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.exb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
