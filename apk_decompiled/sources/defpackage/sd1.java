package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sd1 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ nwb G;
    public final /* synthetic */ nwb H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sd1(nwb nwbVar, nwb nwbVar2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = nwbVar;
        this.H = nwbVar2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        nwb nwbVar = this.H;
        nwb nwbVar2 = this.G;
        switch (i) {
            case 0:
                return new sd1(nwbVar2, nwbVar, tp4Var, 0);
            default:
                return new sd1(nwbVar2, nwbVar, tp4Var, 1);
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
        return ((sd1) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (defpackage.d4c.L(r3, r9) == r6) goto L22;
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
            iei r1 = defpackage.iei.a
            nwb r2 = r9.H
            nwb r3 = r9.G
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            m45 r6 = defpackage.m45.E
            r7 = 1
            r8 = 2
            switch(r0) {
                case 0: goto L60;
                default: goto L12;
            }
        L12:
            int r0 = r9.F
            if (r0 == 0) goto L27
            if (r0 == r7) goto L23
            if (r0 != r8) goto L1e
            defpackage.sf5.h0(r10)
            goto L58
        L1e:
            defpackage.sz6.j(r5)
            r1 = r4
            goto L5f
        L23:
            defpackage.sf5.h0(r10)
            goto L35
        L27:
            defpackage.sf5.h0(r10)
            long r4 = defpackage.bj7.a
            r9.F = r7
            java.lang.Object r10 = defpackage.d4c.L(r4, r9)
            if (r10 != r6) goto L35
            goto L56
        L35:
            int r10 = defpackage.bj7.c
            java.lang.Object r10 = r3.getValue()
            java.lang.Float r10 = (java.lang.Float) r10
            if (r10 == 0) goto L44
            float r10 = r10.floatValue()
            goto L46
        L44:
            r10 = 1065353216(0x3f800000, float:1.0)
        L46:
            r0 = 1056964608(0x3f000000, float:0.5)
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L58
            long r3 = defpackage.bj7.b
            r9.F = r8
            java.lang.Object r9 = defpackage.d4c.L(r3, r9)
            if (r9 != r6) goto L58
        L56:
            r1 = r6
            goto L5f
        L58:
            int r9 = defpackage.bj7.c
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r2.setValue(r9)
        L5f:
            return r1
        L60:
            int r0 = r9.F
            if (r0 == 0) goto L94
            if (r0 == r7) goto L71
            if (r0 != r8) goto L6c
            defpackage.sf5.h0(r10)
            goto L85
        L6c:
            defpackage.sz6.j(r5)
            r1 = r4
            goto L97
        L71:
            defpackage.sf5.h0(r10)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r2.setValue(r10)
            r9.F = r8
            r4 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r9 = defpackage.d4c.K(r4, r9)
            if (r9 != r6) goto L85
            r1 = r6
            goto L97
        L85:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r2.setValue(r9)
            java.lang.Object r9 = r3.getValue()
            zy7 r9 = (defpackage.zy7) r9
            r9.a()
            goto L97
        L94:
            defpackage.sf5.h0(r10)
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sd1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
