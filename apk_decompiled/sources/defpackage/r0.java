package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class r0 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ zub G;
    public final /* synthetic */ odd H;
    public final /* synthetic */ u0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(zub zubVar, odd oddVar, u0 u0Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = zubVar;
        this.H = oddVar;
        this.I = u0Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new r0(this.G, this.H, this.I, tp4Var, 0);
            default:
                return new r0(this.G, this.H, this.I, tp4Var, 1);
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
        return ((r0) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r3.b(r9, r10) == r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        if (r3.b(r9, r10) == r6) goto L31;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.E
            iei r1 = defpackage.iei.a
            u0 r2 = r10.I
            zub r3 = r10.G
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            m45 r6 = defpackage.m45.E
            r7 = 1
            r8 = 2
            odd r9 = r10.H
            switch(r0) {
                case 0: goto L44;
                default: goto L14;
            }
        L14:
            int r0 = r10.F
            if (r0 == 0) goto L29
            if (r0 == r7) goto L25
            if (r0 != r8) goto L20
            defpackage.sf5.h0(r11)
            goto L41
        L20:
            defpackage.sz6.j(r5)
            r1 = r4
            goto L43
        L25:
            defpackage.sf5.h0(r11)
            goto L37
        L29:
            defpackage.sf5.h0(r11)
            long r4 = defpackage.oo3.a
            r10.F = r7
            java.lang.Object r11 = defpackage.d4c.K(r4, r10)
            if (r11 != r6) goto L37
            goto L3f
        L37:
            r10.F = r8
            java.lang.Object r10 = r3.b(r9, r10)
            if (r10 != r6) goto L41
        L3f:
            r1 = r6
            goto L43
        L41:
            r2.f0 = r9
        L43:
            return r1
        L44:
            int r0 = r10.F
            if (r0 == 0) goto L59
            if (r0 == r7) goto L55
            if (r0 != r8) goto L50
            defpackage.sf5.h0(r11)
            goto L71
        L50:
            defpackage.sz6.j(r5)
            r1 = r4
            goto L73
        L55:
            defpackage.sf5.h0(r11)
            goto L67
        L59:
            defpackage.sf5.h0(r11)
            long r4 = defpackage.oo3.a
            r10.F = r7
            java.lang.Object r11 = defpackage.d4c.K(r4, r10)
            if (r11 != r6) goto L67
            goto L6f
        L67:
            r10.F = r8
            java.lang.Object r10 = r3.b(r9, r10)
            if (r10 != r6) goto L71
        L6f:
            r1 = r6
            goto L73
        L71:
            r2.j0 = r9
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
