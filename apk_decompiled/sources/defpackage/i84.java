package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class i84 extends xzg implements pz7 {
    public int E;
    public final /* synthetic */ k84 F;
    public final /* synthetic */ a80 G;
    public final /* synthetic */ hsc H;
    public final /* synthetic */ nwb I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i84(k84 k84Var, a80 a80Var, hsc hscVar, nwb nwbVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = k84Var;
        this.G = a80Var;
        this.H = hscVar;
        this.I = nwbVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new i84(this.F, this.G, this.H, this.I, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((i84) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        if (defpackage.d4c.K(700, r10) == r5) goto L20;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.E
            nwb r1 = r12.I
            r2 = 0
            r3 = 1
            r4 = 2
            m45 r5 = defpackage.m45.E
            if (r0 == 0) goto L1e
            if (r0 == r3) goto L19
            if (r0 != r4) goto L13
            defpackage.sf5.h0(r13)
            goto L5a
        L13:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r12)
            return r2
        L19:
            defpackage.sf5.h0(r13)
            r10 = r12
            goto L4f
        L1e:
            defpackage.sf5.h0(r13)
            k84 r13 = r12.F
            if (r13 == 0) goto L27
            com.anthropic.claude.api.chat.messages.CompactionStatus$Status r2 = r13.a
        L27:
            com.anthropic.claude.api.chat.messages.CompactionStatus$Status r0 = com.anthropic.claude.api.chat.messages.CompactionStatus.Status.COMPLETE
            if (r2 != r0) goto L64
            hsc r13 = r12.H
            r0 = 1065353216(0x3f800000, float:1.0)
            r13.i(r0)
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r0)
            r13 = 0
            xh6 r0 = defpackage.wi6.d
            r2 = 300(0x12c, float:4.2E-43)
            z8i r8 = defpackage.kxk.N(r2, r13, r0, r4)
            r12.E = r3
            a80 r6 = r12.G
            r9 = 0
            r11 = 12
            r10 = r12
            java.lang.Object r12 = defpackage.a80.c(r6, r7, r8, r9, r10, r11)
            if (r12 != r5) goto L4f
            goto L59
        L4f:
            r10.E = r4
            r12 = 700(0x2bc, double:3.46E-321)
            java.lang.Object r12 = defpackage.d4c.K(r12, r10)
            if (r12 != r5) goto L5a
        L59:
            return r5
        L5a:
            java.lang.Object r12 = r1.getValue()
            zy7 r12 = (defpackage.zy7) r12
            r12.a()
            goto L6f
        L64:
            if (r13 != 0) goto L6f
            java.lang.Object r12 = r1.getValue()
            zy7 r12 = (defpackage.zy7) r12
            r12.a()
        L6f:
            iei r12 = defpackage.iei.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i84.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
