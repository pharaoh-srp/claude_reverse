package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xh5 extends xzg implements bz7 {
    public qf5 E;
    public Object F;
    public int G;
    public final /* synthetic */ bi5 H;
    public final /* synthetic */ c45 I;
    public final /* synthetic */ pz7 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh5(bi5 bi5Var, c45 c45Var, pz7 pz7Var, tp4 tp4Var) {
        super(1, tp4Var);
        this.H = bi5Var;
        this.I = c45Var;
        this.J = pz7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        return new xh5(this.H, this.I, this.J, tp4Var);
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        return ((xh5) create((tp4) obj)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r14 == r12) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            int r0 = r13.G
            r1 = 4
            r2 = 3
            r3 = 2
            bi5 r5 = r13.H
            r10 = 1
            r11 = 0
            m45 r12 = defpackage.m45.E
            if (r0 == 0) goto L32
            if (r0 == r10) goto L2e
            if (r0 == r3) goto L27
            if (r0 == r2) goto L21
            if (r0 != r1) goto L1b
            java.lang.Object r13 = r13.F
            defpackage.sf5.h0(r14)
            return r13
        L1b:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r13)
            return r11
        L21:
            qf5 r0 = r13.E
            defpackage.sf5.h0(r14)
            goto L65
        L27:
            qf5 r0 = r13.E
            defpackage.sf5.h0(r14)
        L2c:
            r8 = r0
            goto L4c
        L2e:
            defpackage.sf5.h0(r14)
            goto L43
        L32:
            defpackage.sf5.h0(r14)
            eh5 r14 = new eh5
            r14.<init>(r1, r11, r5)
            r13.G = r10
            java.lang.Object r14 = defpackage.bi5.d(r5, r10, r14, r13)
            if (r14 != r12) goto L43
            goto L87
        L43:
            r0 = r14
            qf5 r0 = (defpackage.qf5) r0
            r13.E = r0
            r13.G = r3
            r14 = r11
            goto L2c
        L4c:
            r6 = r14
            crd r6 = (defpackage.crd) r6
            cx r4 = new cx
            pz7 r7 = r13.J
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r13.E = r8
            r13.G = r2
            c45 r14 = r13.I
            java.lang.Object r14 = defpackage.gb9.c0(r14, r4, r13)
            if (r14 != r12) goto L64
            goto L87
        L64:
            r0 = r8
        L65:
            java.lang.Object r2 = r0.b
            if (r2 == 0) goto L6e
            int r2 = r2.hashCode()
            goto L6f
        L6e:
            r2 = 0
        L6f:
            int r3 = r0.c
            if (r2 != r3) goto L89
            java.lang.Object r0 = r0.b
            boolean r0 = defpackage.x44.r(r0, r14)
            if (r0 != 0) goto L88
            r13.E = r11
            r13.F = r14
            r13.G = r1
            java.lang.Object r13 = r5.h(r14, r10, r13)
            if (r13 != r12) goto L88
        L87:
            return r12
        L88:
            return r14
        L89:
            java.lang.String r13 = "Data in DataStore was mutated but DataStore is only compatible with Immutable types."
            defpackage.sz6.j(r13)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xh5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
