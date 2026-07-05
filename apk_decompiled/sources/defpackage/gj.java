package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gj extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public hj F;
    public int G;
    public int H;
    public final /* synthetic */ hj I;
    public final /* synthetic */ int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gj(hj hjVar, int i, tp4 tp4Var, int i2) {
        super(2, tp4Var);
        this.E = i2;
        this.I = hjVar;
        this.J = i;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new gj(this.I, this.J, tp4Var, 0);
            default:
                return new gj(this.I, this.J, tp4Var, 1);
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
        return ((gj) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        if (r10 == r3) goto L21;
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
            r1 = 0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            m45 r3 = defpackage.m45.E
            hj r4 = r9.I
            int r5 = r9.J
            iei r6 = defpackage.iei.a
            r7 = 1
            switch(r0) {
                case 0: goto L72;
                default: goto L11;
            }
        L11:
            int r0 = r9.H
            r8 = 2
            if (r0 == 0) goto L2a
            if (r0 == r7) goto L26
            if (r0 != r8) goto L22
            int r5 = r9.G
            hj r4 = r9.F
            defpackage.sf5.h0(r10)
            goto L6b
        L22:
            defpackage.sz6.j(r2)
            goto L71
        L26:
            defpackage.sf5.h0(r10)
            goto L38
        L2a:
            defpackage.sf5.h0(r10)
            g78 r10 = r4.c
            r9.H = r7
            java.lang.Object r10 = r10.b(r9)
            if (r10 != r3) goto L38
            goto L69
        L38:
            amg r10 = r4.g
            java.lang.Object r10 = r10.getValue()
            yi r10 = (defpackage.yi) r10
            int r10 = r10.a
            if (r10 == r5) goto L46
        L44:
            r1 = r6
            goto L71
        L46:
            amg r10 = r4.g
            java.lang.Object r10 = r10.getValue()
            yi r10 = (defpackage.yi) r10
            jj r10 = r10.b
            r10.getClass()
            jj r0 = defpackage.jj.L
            if (r10 != r0) goto L44
            jj r10 = defpackage.jj.E
            r4.g(r5, r10)
            r9.F = r4
            r9.G = r5
            r9.H = r8
            r10 = 0
            java.lang.Enum r10 = defpackage.hj.a(r4, r10, r9)
            if (r10 != r3) goto L6b
        L69:
            r1 = r3
            goto L71
        L6b:
            jj r10 = (defpackage.jj) r10
            r4.g(r5, r10)
            goto L44
        L71:
            return r1
        L72:
            int r0 = r9.H
            if (r0 == 0) goto L84
            if (r0 != r7) goto L80
            int r5 = r9.G
            hj r4 = r9.F
            defpackage.sf5.h0(r10)
            goto La3
        L80:
            defpackage.sz6.j(r2)
            goto La9
        L84:
            defpackage.sf5.h0(r10)
            amg r10 = r4.g
            java.lang.Object r10 = r10.getValue()
            yi r10 = (defpackage.yi) r10
            int r10 = r10.a
            if (r10 == r5) goto L95
        L93:
            r1 = r6
            goto La9
        L95:
            r9.F = r4
            r9.G = r5
            r9.H = r7
            java.lang.Enum r10 = defpackage.hj.a(r4, r7, r9)
            if (r10 != r3) goto La3
            r1 = r3
            goto La9
        La3:
            jj r10 = (defpackage.jj) r10
            r4.g(r5, r10)
            goto L93
        La9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
