package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mv0 extends gre implements pz7 {
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ int H;
    public final /* synthetic */ nwb I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv0(int i, tp4 tp4Var, nwb nwbVar) {
        super(2, tp4Var);
        this.H = i;
        this.I = nwbVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        mv0 mv0Var = new mv0(this.H, tp4Var, this.I);
        mv0Var.G = obj;
        return mv0Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((mv0) create((d0h) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (defpackage.x4h.l(r0, defpackage.u7d.F, r7) == r6) goto L15;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.G
            d0h r0 = (defpackage.d0h) r0
            int r1 = r7.F
            nwb r2 = r7.I
            r3 = 2
            r4 = 1
            r5 = 0
            m45 r6 = defpackage.m45.E
            if (r1 == 0) goto L21
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L17
            defpackage.sf5.h0(r8)
            goto L46
        L17:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r5
        L1d:
            defpackage.sf5.h0(r8)
            goto L2f
        L21:
            defpackage.sf5.h0(r8)
            r7.G = r0
            r7.F = r4
            java.lang.Object r8 = defpackage.x4h.b(r0, r7, r3)
            if (r8 != r6) goto L2f
            goto L45
        L2f:
            java.lang.Integer r8 = new java.lang.Integer
            int r1 = r7.H
            r8.<init>(r1)
            r2.setValue(r8)
            r7.G = r5
            r7.F = r3
            u7d r8 = defpackage.u7d.F
            java.lang.Object r7 = defpackage.x4h.l(r0, r8, r7)
            if (r7 != r6) goto L46
        L45:
            return r6
        L46:
            r2.setValue(r5)
            iei r7 = defpackage.iei.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mv0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
