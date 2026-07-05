package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class klg extends xzg implements rz7 {
    public int E;
    public /* synthetic */ lp7 F;
    public /* synthetic */ int G;
    public final /* synthetic */ llg H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klg(llg llgVar, tp4 tp4Var) {
        super(3, tp4Var);
        this.H = llgVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        klg klgVar = new klg(this.H, (tp4) obj3);
        klgVar.F = (lp7) obj;
        klgVar.G = iIntValue;
        return klgVar.invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r4.g(defpackage.t3g.E, r16) == r13) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        if (r4.g(defpackage.t3g.G, r16) != r13) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            llg r1 = r0.H
            long r2 = r1.F
            lp7 r4 = r0.F
            int r5 = r0.G
            int r6 = r0.E
            r7 = 0
            r8 = 5
            r9 = 4
            r10 = 3
            r11 = 2
            r12 = 1
            m45 r13 = defpackage.m45.E
            if (r6 == 0) goto L37
            if (r6 == r12) goto L33
            if (r6 == r11) goto L2f
            if (r6 == r10) goto L2b
            if (r6 == r9) goto L27
            if (r6 != r8) goto L21
            goto L33
        L21:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r0)
            return r7
        L27:
            defpackage.sf5.h0(r17)
            goto L7c
        L2b:
            defpackage.sf5.h0(r17)
            goto L6f
        L2f:
            defpackage.sf5.h0(r17)
            goto L5a
        L33:
            defpackage.sf5.h0(r17)
            goto L8b
        L37:
            defpackage.sf5.h0(r17)
            if (r5 <= 0) goto L4b
            r0.F = r7
            r0.G = r5
            r0.E = r12
            t3g r1 = defpackage.t3g.E
            java.lang.Object r0 = r4.g(r1, r0)
            if (r0 != r13) goto L8b
            goto L8a
        L4b:
            long r14 = r1.E
            r0.F = r4
            r0.G = r5
            r0.E = r11
            java.lang.Object r1 = defpackage.d4c.K(r14, r0)
            if (r1 != r13) goto L5a
            goto L8a
        L5a:
            r11 = 0
            int r1 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r1 <= 0) goto L7c
            r0.F = r4
            r0.G = r5
            r0.E = r10
            t3g r1 = defpackage.t3g.F
            java.lang.Object r1 = r4.g(r1, r0)
            if (r1 != r13) goto L6f
            goto L8a
        L6f:
            r0.F = r4
            r0.G = r5
            r0.E = r9
            java.lang.Object r1 = defpackage.d4c.K(r2, r0)
            if (r1 != r13) goto L7c
            goto L8a
        L7c:
            r0.F = r7
            r0.G = r5
            r0.E = r8
            t3g r1 = defpackage.t3g.G
            java.lang.Object r0 = r4.g(r1, r0)
            if (r0 != r13) goto L8b
        L8a:
            return r13
        L8b:
            iei r0 = defpackage.iei.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.klg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
