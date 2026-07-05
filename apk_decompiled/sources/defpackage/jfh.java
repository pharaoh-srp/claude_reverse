package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jfh extends xzg implements pz7 {
    public int E;
    public final /* synthetic */ kfh F;
    public final /* synthetic */ float G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ l9e I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jfh(kfh kfhVar, float f, boolean z, l9e l9eVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = kfhVar;
        this.G = f;
        this.H = z;
        this.I = l9eVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new jfh(this.F, this.G, this.H, this.I, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((jfh) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (r8.a(r7.I, r7) == r4) goto L27;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.E
            kfh r1 = r7.F
            r2 = 2
            r3 = 1
            m45 r4 = defpackage.m45.E
            if (r0 == 0) goto L1d
            if (r0 == r3) goto L19
            if (r0 != r2) goto L12
            defpackage.sf5.h0(r8)
            goto L5f
        L12:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            r7 = 0
            return r7
        L19:
            defpackage.sf5.h0(r8)
            goto L4c
        L1d:
            defpackage.sf5.h0(r8)
            j9f r8 = r1.b0
            float r0 = r7.G
            boolean r5 = java.lang.Float.isNaN(r0)
            if (r5 != 0) goto L43
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 == 0) goto L31
            goto L43
        L31:
            r5 = 0
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 <= 0) goto L3d
            double r5 = (double) r0
            double r5 = java.lang.Math.ceil(r5)
        L3b:
            float r0 = (float) r5
            goto L43
        L3d:
            double r5 = (double) r0
            double r5 = java.lang.Math.floor(r5)
            goto L3b
        L43:
            r7.E = r3
            java.lang.Object r8 = defpackage.eve.S(r8, r0, r7)
            if (r8 != r4) goto L4c
            goto L5e
        L4c:
            boolean r8 = r7.H
            if (r8 == 0) goto L5f
            akh r8 = r1.W
            qx1 r8 = r8.g
            r7.E = r2
            l9e r0 = r7.I
            java.lang.Object r7 = r8.a(r0, r7)
            if (r7 != r4) goto L5f
        L5e:
            return r4
        L5f:
            iei r7 = defpackage.iei.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jfh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
