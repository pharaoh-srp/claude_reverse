package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gl3 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ isc H;
    public final /* synthetic */ isc I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gl3(isc iscVar, isc iscVar2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = iscVar;
        this.I = iscVar2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                gl3 gl3Var = new gl3(this.H, this.I, tp4Var, 0);
                gl3Var.G = obj;
                return gl3Var;
            default:
                gl3 gl3Var2 = new gl3(this.H, this.I, tp4Var, 1);
                gl3Var2.G = obj;
                return gl3Var2;
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
        return ((gl3) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0038 -> B:15:0x003c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0091 -> B:36:0x0095). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.E
            iei r1 = defpackage.iei.a
            r2 = 0
            isc r3 = r11.I
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            m45 r5 = defpackage.m45.E
            r6 = 1
            isc r7 = r11.H
            r8 = 0
            switch(r0) {
                case 0: goto L56;
                default: goto L12;
            }
        L12:
            java.lang.Object r0 = r11.G
            l45 r0 = (defpackage.l45) r0
            int r9 = r11.F
            if (r9 == 0) goto L25
            if (r9 != r6) goto L20
            defpackage.sf5.h0(r12)
            goto L3c
        L20:
            defpackage.sz6.j(r4)
            r1 = r8
            goto L55
        L25:
            defpackage.sf5.h0(r12)
        L28:
            boolean r12 = defpackage.fd9.d0(r0)
            if (r12 == 0) goto L55
            r11.G = r0
            r11.F = r6
            r8 = 250(0xfa, double:1.235E-321)
            java.lang.Object r12 = defpackage.d4c.K(r8, r11)
            if (r12 != r5) goto L3c
            r1 = r5
            goto L55
        L3c:
            int r12 = r7.h()
            int r12 = r12 + r6
            r7.i(r12)
            int r12 = r3.h()
            r4 = 120(0x78, float:1.68E-43)
            m3 r8 = defpackage.h1e.F
            int r4 = r8.h(r2, r4)
            int r4 = r4 + r12
            r3.i(r4)
            goto L28
        L55:
            return r1
        L56:
            java.lang.Object r0 = r11.G
            l45 r0 = (defpackage.l45) r0
            int r9 = r11.F
            if (r9 == 0) goto L69
            if (r9 != r6) goto L64
            defpackage.sf5.h0(r12)
            goto L95
        L64:
            defpackage.sz6.j(r4)
        L67:
            r1 = r8
            goto Lbd
        L69:
            defpackage.sf5.h0(r12)
        L6c:
            boolean r12 = defpackage.fd9.d0(r0)
            if (r12 == 0) goto Lbd
            java.util.List r12 = defpackage.hl3.a
            int r12 = r7.h()
            if (r12 >= r6) goto L7d
            r9 = 3000(0xbb8, double:1.482E-320)
            goto L89
        L7d:
            int r12 = r7.h()
            r4 = 2
            if (r12 >= r4) goto L87
            r9 = 4000(0xfa0, double:1.9763E-320)
            goto L89
        L87:
            r9 = 6000(0x1770, double:2.9644E-320)
        L89:
            r11.G = r0
            r11.F = r6
            java.lang.Object r12 = defpackage.d4c.K(r9, r11)
            if (r12 != r5) goto L95
            r1 = r5
            goto Lbd
        L95:
            java.util.List r12 = defpackage.hl3.a
            int r12 = r12.size()
            b79 r12 = defpackage.wd6.H0(r2, r12)
            g1e r4 = defpackage.h1e.E
            r12.getClass()
            int r12 = defpackage.wjk.q(r12)     // Catch: java.lang.IllegalArgumentException -> Lb4
            r3.i(r12)
            int r12 = r7.h()
            int r12 = r12 + r6
            r7.i(r12)
            goto L6c
        Lb4:
            r11 = move-exception
            java.lang.String r11 = r11.getMessage()
            defpackage.pmf.h(r11)
            goto L67
        Lbd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gl3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
