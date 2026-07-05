package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r02 extends xzg implements pz7 {
    public int E;
    public final /* synthetic */ a80 F;
    public final /* synthetic */ float G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ s02 I;
    public final /* synthetic */ v79 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r02(a80 a80Var, float f, boolean z, s02 s02Var, v79 v79Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = a80Var;
        this.G = f;
        this.H = z;
        this.I = s02Var;
        this.J = v79Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new r02(this.F, this.G, this.H, this.I, this.J, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((r02) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (r9.g(r8, r0) == r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
    
        if (defpackage.lk6.a(r9, r4, r1, r8.J, r8) == r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        return r5;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.E
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L16
            if (r0 == r3) goto L12
            if (r0 != r2) goto Lc
            goto L12
        Lc:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r8)
            return r1
        L12:
            defpackage.sf5.h0(r9)
            goto L82
        L16:
            defpackage.sf5.h0(r9)
            a80 r9 = r8.F
            lsc r0 = r9.e
            java.lang.Object r0 = r0.getValue()
            va6 r0 = (defpackage.va6) r0
            float r0 = r0.E
            float r4 = r8.G
            boolean r0 = defpackage.va6.b(r0, r4)
            if (r0 != 0) goto L82
            boolean r0 = r8.H
            m45 r5 = defpackage.m45.E
            if (r0 != 0) goto L41
            va6 r0 = new va6
            r0.<init>(r4)
            r8.E = r3
            java.lang.Object r8 = r9.g(r8, r0)
            if (r8 != r5) goto L82
            goto L81
        L41:
            lsc r0 = r9.e
            java.lang.Object r0 = r0.getValue()
            va6 r0 = (defpackage.va6) r0
            float r0 = r0.E
            s02 r3 = r8.I
            float r6 = r3.b
            boolean r6 = defpackage.va6.b(r0, r6)
            if (r6 == 0) goto L5d
            odd r1 = new odd
            r6 = 0
            r1.<init>(r6)
            goto L77
        L5d:
            float r3 = r3.c
            boolean r3 = defpackage.va6.b(r0, r3)
            if (r3 == 0) goto L6b
            lp8 r1 = new lp8
            r1.<init>()
            goto L77
        L6b:
            r3 = 0
            boolean r0 = defpackage.va6.b(r0, r3)
            if (r0 == 0) goto L77
            ks7 r1 = new ks7
            r1.<init>()
        L77:
            r8.E = r2
            v79 r0 = r8.J
            java.lang.Object r8 = defpackage.lk6.a(r9, r4, r1, r0, r8)
            if (r8 != r5) goto L82
        L81:
            return r5
        L82:
            iei r8 = defpackage.iei.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r02.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
