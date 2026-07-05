package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kd2 extends xzg implements pz7 {
    public id2 E;
    public hxb F;
    public od2 G;
    public Object H;
    public int I;
    public int J;
    public final /* synthetic */ od2 K;
    public final /* synthetic */ bz7 L;
    public final /* synthetic */ bz7 M;
    public final /* synthetic */ rz7 N;
    public final /* synthetic */ uub O;
    public final /* synthetic */ rz7 P;
    public final /* synthetic */ rz7 Q;
    public final /* synthetic */ bz7 R;
    public final /* synthetic */ Object S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd2(od2 od2Var, bz7 bz7Var, bz7 bz7Var2, rz7 rz7Var, uub uubVar, rz7 rz7Var2, rz7 rz7Var3, bz7 bz7Var3, Object obj, tp4 tp4Var) {
        super(2, tp4Var);
        this.K = od2Var;
        this.L = bz7Var;
        this.M = bz7Var2;
        this.N = rz7Var;
        this.O = uubVar;
        this.P = rz7Var2;
        this.Q = rz7Var3;
        this.R = bz7Var3;
        this.S = obj;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new kd2(this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((kd2) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
    
        if (r9.a(r3, r6, r18) == r5) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [hxb] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v5, types: [hxb] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.J
            r2 = 2
            r3 = 1
            r4 = 0
            m45 r5 = defpackage.m45.E
            if (r1 == 0) goto L30
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L19
            hxb r1 = r0.F
            defpackage.sf5.h0(r19)     // Catch: java.lang.Throwable -> L16
            goto L83
        L16:
            r0 = move-exception
            goto L89
        L19:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r0)
            return r4
        L1f:
            int r1 = r0.I
            java.lang.Object r3 = r0.H
            od2 r6 = r0.G
            hxb r7 = r0.F
            id2 r8 = r0.E
            defpackage.sf5.h0(r19)
            r9 = r8
            r8 = r1
            r1 = r7
            goto L67
        L30:
            defpackage.sf5.h0(r19)
            id2 r9 = new id2
            rz7 r1 = r0.Q
            bz7 r6 = r0.R
            od2 r10 = r0.K
            bz7 r11 = r0.L
            bz7 r12 = r0.M
            rz7 r13 = r0.N
            uub r14 = r0.O
            rz7 r15 = r0.P
            r16 = r1
            r17 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            od2 r6 = r0.K
            jxb r1 = r6.e
            r0.E = r9
            r0.F = r1
            r0.G = r6
            java.lang.Object r7 = r0.S
            r0.H = r7
            r8 = 0
            r0.I = r8
            r0.J = r3
            java.lang.Object r3 = r1.c(r0)
            if (r3 != r5) goto L66
            goto L82
        L66:
            r3 = r7
        L67:
            java.util.concurrent.ConcurrentHashMap r7 = r6.f     // Catch: java.lang.Throwable -> L16
            r7.put(r3, r9)     // Catch: java.lang.Throwable -> L16
            java.util.List r3 = r6.a     // Catch: java.lang.Throwable -> L16
            uub r6 = r6.b     // Catch: java.lang.Throwable -> L16
            r0.E = r4     // Catch: java.lang.Throwable -> L16
            r0.F = r1     // Catch: java.lang.Throwable -> L16
            r0.G = r4     // Catch: java.lang.Throwable -> L16
            r0.H = r4     // Catch: java.lang.Throwable -> L16
            r0.I = r8     // Catch: java.lang.Throwable -> L16
            r0.J = r2     // Catch: java.lang.Throwable -> L16
            java.lang.Object r0 = r9.a(r3, r6, r0)     // Catch: java.lang.Throwable -> L16
            if (r0 != r5) goto L83
        L82:
            return r5
        L83:
            r1.d(r4)
            iei r0 = defpackage.iei.a
            return r0
        L89:
            r1.d(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kd2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
