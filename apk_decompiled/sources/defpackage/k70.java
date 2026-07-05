package defpackage;

import com.anthropic.claude.bell.BellModeService;

/* JADX INFO: loaded from: classes2.dex */
public final class k70 extends xzg implements pz7 {
    public final /* synthetic */ int E = 1;
    public int F;
    public final /* synthetic */ long G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k70(long j, BellModeService bellModeService, boolean z, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = j;
        this.I = bellModeService;
        this.H = z;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.I;
        switch (i) {
            case 0:
                long j = this.G;
                return new k70(this.H, (n70) obj2, j, tp4Var);
            default:
                boolean z = this.H;
                return new k70(this.G, (BellModeService) obj2, z, tp4Var);
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
        return ((k70) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0083, code lost:
    
        if (r13 == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0097, code lost:
    
        if (r13 == r0) goto L40;
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
            r1 = 0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            switch(r0) {
                case 0: goto L54;
                default: goto L9;
            }
        L9:
            m45 r0 = defpackage.m45.E
            int r4 = r12.F
            if (r4 == 0) goto L19
            if (r4 != r3) goto L15
            defpackage.sf5.h0(r13)
            goto L28
        L15:
            defpackage.sz6.j(r2)
            goto L53
        L19:
            defpackage.sf5.h0(r13)
            long r1 = r12.G
            r12.F = r3
            java.lang.Object r13 = defpackage.d4c.L(r1, r12)
            if (r13 != r0) goto L28
            r1 = r0
            goto L53
        L28:
            java.lang.Object r13 = r12.I
            com.anthropic.claude.bell.BellModeService r13 = (com.anthropic.claude.bell.BellModeService) r13
            tn1 r13 = r13.E
            r0 = 0
            if (r13 == 0) goto L38
            boolean r13 = r13.l()
            if (r13 != r3) goto L38
            goto L39
        L38:
            r3 = r0
        L39:
            java.lang.Object r13 = r12.I
            com.anthropic.claude.bell.BellModeService r13 = (com.anthropic.claude.bell.BellModeService) r13
            r13.c()
            boolean r12 = r12.H
            if (r12 == 0) goto L51
            bz7 r12 = com.anthropic.claude.bell.BellModeService.T
            bz7 r12 = com.anthropic.claude.bell.BellModeService.T
            if (r12 == 0) goto L51
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r3)
            r12.invoke(r13)
        L51:
            iei r1 = defpackage.iei.a
        L53:
            return r1
        L54:
            m45 r0 = defpackage.m45.E
            int r4 = r12.F
            r5 = 2
            if (r4 == 0) goto L6b
            if (r4 == r3) goto L67
            if (r4 != r5) goto L63
            defpackage.sf5.h0(r13)
            goto L9b
        L63:
            defpackage.sz6.j(r2)
            goto La2
        L67:
            defpackage.sf5.h0(r13)
            goto L86
        L6b:
            defpackage.sf5.h0(r13)
            boolean r13 = r12.H
            java.lang.Object r1 = r12.I
            n70 r1 = (defpackage.n70) r1
            b0c r6 = r1.E
            if (r13 != 0) goto L8c
            long r9 = r12.G
            r12.F = r3
            r7 = 0
            r11 = r12
            java.lang.Object r13 = r6.a(r7, r9, r11)
            if (r13 != r0) goto L86
            goto L99
        L86:
            qsi r13 = (defpackage.qsi) r13
            r13.getClass()
            goto La0
        L8c:
            r11 = r12
            long r7 = r11.G
            r11.F = r5
            r9 = 0
            java.lang.Object r13 = r6.a(r7, r9, r11)
            if (r13 != r0) goto L9b
        L99:
            r1 = r0
            goto La2
        L9b:
            qsi r13 = (defpackage.qsi) r13
            r13.getClass()
        La0:
            iei r1 = defpackage.iei.a
        La2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k70.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k70(boolean z, n70 n70Var, long j, tp4 tp4Var) {
        super(2, tp4Var);
        this.H = z;
        this.I = n70Var;
        this.G = j;
    }
}
