package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rm extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ vm H;
    public final /* synthetic */ String I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rm(vm vmVar, String str, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = vmVar;
        this.I = str;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        String str = this.I;
        vm vmVar = this.H;
        switch (i) {
            case 0:
                rm rmVar = new rm(vmVar, str, tp4Var, 0);
                rmVar.G = obj;
                return rmVar;
            default:
                rm rmVar2 = new rm(vmVar, str, tp4Var, 1);
                rmVar2.G = obj;
                return rmVar2;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((rm) create((String) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((rm) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0044 -> B:12:0x0029). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.E
            java.lang.String r1 = r9.I
            vm r2 = r9.H
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            m45 r4 = defpackage.m45.E
            r5 = 1
            r6 = 0
            switch(r0) {
                case 0: goto L4a;
                default: goto Lf;
            }
        Lf:
            java.lang.Object r0 = r9.G
            l45 r0 = (defpackage.l45) r0
            int r7 = r9.F
            r8 = 2
            if (r7 == 0) goto L26
            if (r7 == r5) goto L22
            if (r7 != r8) goto L1d
            goto L26
        L1d:
            defpackage.sz6.j(r3)
            r4 = r6
            goto L49
        L22:
            defpackage.sf5.h0(r10)
            goto L3a
        L26:
            defpackage.sf5.h0(r10)
        L29:
            boolean r10 = defpackage.fd9.d0(r0)
            if (r10 == 0) goto L47
            r9.G = r0
            r9.F = r5
            java.lang.Object r10 = defpackage.vm.b(r2, r1, r9)
            if (r10 != r4) goto L3a
            goto L49
        L3a:
            r9.G = r0
            r9.F = r8
            r6 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r10 = defpackage.d4c.K(r6, r9)
            if (r10 != r4) goto L29
            goto L49
        L47:
            iei r4 = defpackage.iei.a
        L49:
            return r4
        L4a:
            java.lang.Object r0 = r9.G
            java.lang.String r0 = (java.lang.String) r0
            int r7 = r9.F
            if (r7 == 0) goto L5d
            if (r7 != r5) goto L58
            defpackage.sf5.h0(r10)
            goto L6d
        L58:
            defpackage.sz6.j(r3)
            r10 = r6
            goto L6d
        L5d:
            defpackage.sf5.h0(r10)
            com.anthropic.claude.sessions.api.b r10 = r2.b
            r9.G = r6
            r9.F = r5
            java.lang.Object r10 = r10.r(r1, r0, r9)
            if (r10 != r4) goto L6d
            r10 = r4
        L6d:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rm.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
