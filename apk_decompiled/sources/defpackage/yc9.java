package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yc9 extends gre implements pz7 {
    public z7d F;
    public dae G;
    public int H;
    public /* synthetic */ Object I;
    public final /* synthetic */ nwb J;
    public final /* synthetic */ nwb K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc9(nwb nwbVar, nwb nwbVar2, tp4 tp4Var) {
        super(2, tp4Var);
        this.J = nwbVar;
        this.K = nwbVar2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        yc9 yc9Var = new yc9(this.J, this.K, tp4Var);
        yc9Var.I = obj;
        return yc9Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((yc9) create((d0h) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        if (defpackage.nc6.f(r0, r7, r13, r12) == r6) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.I
            d0h r0 = (defpackage.d0h) r0
            int r1 = r12.H
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            m45 r6 = defpackage.m45.E
            if (r1 == 0) goto L2b
            if (r1 == r4) goto L27
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L19
            defpackage.sf5.h0(r13)
            goto Lae
        L19:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r12)
            return r5
        L1f:
            dae r1 = r12.G
            z7d r3 = r12.F
            defpackage.sf5.h0(r13)
            goto L5b
        L27:
            defpackage.sf5.h0(r13)
            goto L39
        L2b:
            defpackage.sf5.h0(r13)
            r12.I = r0
            r12.H = r4
            java.lang.Object r13 = defpackage.x4h.b(r0, r12, r3)
            if (r13 != r6) goto L39
            goto L93
        L39:
            z7d r13 = (defpackage.z7d) r13
            dae r1 = new dae
            r1.<init>()
            long r7 = r13.a
            mk4 r9 = new mk4
            r10 = 28
            r9.<init>(r10, r1)
            r12.I = r0
            r12.F = r13
            r12.G = r1
            r12.H = r3
            java.lang.Object r3 = defpackage.nc6.d(r0, r7, r9, r12)
            if (r3 != r6) goto L58
            goto L93
        L58:
            r11 = r3
            r3 = r13
            r13 = r11
        L5b:
            z7d r13 = (defpackage.z7d) r13
            if (r13 == 0) goto L94
            java.lang.Object r1 = r1.E
            fcc r1 = (defpackage.fcc) r1
            nwb r3 = r12.J
            if (r1 == 0) goto L7d
            long r7 = r1.a
            java.lang.Object r1 = r3.getValue()
            fcc r1 = (defpackage.fcc) r1
            long r9 = r1.a
            long r7 = defpackage.fcc.i(r9, r7)
            fcc r1 = new fcc
            r1.<init>(r7)
            r3.setValue(r1)
        L7d:
            long r7 = r13.a
            ol5 r13 = new ol5
            r1 = 7
            r13.<init>(r1, r3)
            r12.I = r5
            r12.F = r5
            r12.G = r5
            r12.H = r2
            java.lang.Object r12 = defpackage.nc6.f(r0, r7, r13, r12)
            if (r12 != r6) goto Lae
        L93:
            return r6
        L94:
            boolean r13 = r3.l()
            if (r13 != 0) goto Lae
            nwb r12 = r12.K
            java.lang.Object r13 = r12.getValue()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            r13 = r13 ^ r4
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r12.setValue(r13)
        Lae:
            iei r12 = defpackage.iei.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yc9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
