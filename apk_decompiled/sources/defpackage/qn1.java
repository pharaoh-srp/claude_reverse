package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qn1 extends xzg implements pz7 {
    public final /* synthetic */ int E = 1;
    public int F;
    public final /* synthetic */ tn1 G;
    public final /* synthetic */ zv5 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn1(tn1 tn1Var, zv5 zv5Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = tn1Var;
        this.H = zv5Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        zv5 zv5Var = this.H;
        tn1 tn1Var = this.G;
        switch (i) {
            case 0:
                return new qn1(zv5Var, tn1Var, tp4Var);
            default:
                return new qn1(tn1Var, zv5Var, tp4Var);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((qn1) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
    
        if (r8.a(r1, r7) == r4) goto L32;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            int r0 = r7.E
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r2 = 1
            r3 = 0
            switch(r0) {
                case 0: goto L36;
                default: goto L9;
            }
        L9:
            m45 r0 = defpackage.m45.E
            int r4 = r7.F
            if (r4 == 0) goto L19
            if (r4 != r2) goto L15
            defpackage.sf5.h0(r8)
            goto L33
        L15:
            defpackage.sz6.j(r1)
            goto L35
        L19:
            defpackage.sf5.h0(r8)
            tn1 r8 = r7.G
            ej1 r1 = r8.s
            ih2 r1 = r1.k
            sn1 r3 = new sn1
            zv5 r4 = r7.H
            r3.<init>(r4, r8)
            r7.F = r2
            java.lang.Object r7 = r1.a(r3, r7)
            if (r7 != r0) goto L33
            r3 = r0
            goto L35
        L33:
            iei r3 = defpackage.iei.a
        L35:
            return r3
        L36:
            iei r0 = defpackage.iei.a
            m45 r4 = defpackage.m45.E
            int r5 = r7.F
            r6 = 2
            if (r5 == 0) goto L50
            if (r5 == r2) goto L4c
            if (r5 != r6) goto L48
            defpackage.sf5.h0(r8)
        L46:
            r3 = r0
            goto L8c
        L48:
            defpackage.sz6.j(r1)
            goto L8c
        L4c:
            defpackage.sf5.h0(r8)
            goto L5e
        L50:
            defpackage.sf5.h0(r8)
            zv5 r8 = r7.H
            r7.F = r2
            java.lang.Object r8 = r8.w(r7)
            if (r8 != r4) goto L5e
            goto L85
        L5e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L67
            goto L46
        L67:
            tn1 r8 = r7.G
            ki1 r8 = r8.r
            m6b r8 = r8.m
            if (r8 == 0) goto L87
            zy1 r8 = r8.N
            ih2 r8 = defpackage.j8.b0(r8)
            pn1 r1 = new pn1
            tn1 r2 = r7.G
            r3 = 0
            r1.<init>(r2, r3)
            r7.F = r6
            java.lang.Object r7 = r8.a(r1, r7)
            if (r7 != r4) goto L46
        L85:
            r3 = r4
            goto L8c
        L87:
            java.lang.String r7 = "decodedPcm read before acquire() / after stop()"
            defpackage.sz6.j(r7)
        L8c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qn1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn1(zv5 zv5Var, tn1 tn1Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.H = zv5Var;
        this.G = tn1Var;
    }
}
