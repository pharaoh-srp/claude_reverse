package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class y23 extends xzg implements pz7 {
    public int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ x0a G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y23(boolean z, x0a x0aVar, int i, int i2, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = z;
        this.G = x0aVar;
        this.H = i;
        this.I = i2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new y23(this.F, this.G, this.H, this.I, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((y23) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r4.f(r5.H, 0, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r4.f(r5.I, 0, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        return r0;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.E
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L16
            if (r0 == r2) goto L12
            if (r0 != r1) goto Lb
            goto L12
        Lb:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            r5 = 0
            return r5
        L12:
            defpackage.sf5.h0(r6)
            goto L3c
        L16:
            defpackage.sf5.h0(r6)
            r6 = 0
            m45 r0 = defpackage.m45.E
            boolean r3 = r5.F
            x0a r4 = r5.G
            if (r3 == 0) goto L2f
            r5.E = r2
            y5f r1 = defpackage.x0a.y
            int r1 = r5.H
            java.lang.Object r5 = r4.f(r1, r6, r5)
            if (r5 != r0) goto L3c
            goto L3b
        L2f:
            r5.E = r1
            y5f r1 = defpackage.x0a.y
            int r1 = r5.I
            java.lang.Object r5 = r4.f(r1, r6, r5)
            if (r5 != r0) goto L3c
        L3b:
            return r0
        L3c:
            iei r5 = defpackage.iei.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y23.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
