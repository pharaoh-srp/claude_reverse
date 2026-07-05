package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dk extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ sl G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dk(sl slVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = slVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new dk(this.G, tp4Var, 0);
            default:
                return new dk(this.G, tp4Var, 1);
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
        return ((dk) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004a -> B:12:0x0025). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.E
            iei r1 = defpackage.iei.a
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            m45 r4 = defpackage.m45.E
            sl r5 = r8.G
            r6 = 1
            switch(r0) {
                case 0: goto L4e;
                default: goto Lf;
            }
        Lf:
            int r0 = r8.F
            r7 = 2
            if (r0 == 0) goto L22
            if (r0 == r6) goto L1e
            if (r0 != r7) goto L19
            goto L22
        L19:
            defpackage.sz6.j(r3)
            r1 = r2
            goto L4d
        L1e:
            defpackage.sf5.h0(r9)
            goto L39
        L22:
            defpackage.sf5.h0(r9)
        L25:
            r9 = r5
            vm r9 = (defpackage.vm) r9
            boolean r0 = r9.e()
            if (r0 != 0) goto L4d
            r8.F = r6
            wk r9 = r9.w
            java.lang.Object r9 = r9.h(r8)
            if (r9 != r4) goto L39
            goto L4c
        L39:
            r9 = r5
            vm r9 = (defpackage.vm) r9
            boolean r9 = r9.e()
            if (r9 != 0) goto L4d
            long r2 = defpackage.il.b
            r8.F = r7
            java.lang.Object r9 = defpackage.d4c.L(r2, r8)
            if (r9 != r4) goto L25
        L4c:
            r1 = r4
        L4d:
            return r1
        L4e:
            int r0 = r8.F
            if (r0 == 0) goto L5d
            if (r0 != r6) goto L58
            defpackage.sf5.h0(r9)
            goto L6b
        L58:
            defpackage.sz6.j(r3)
            r1 = r2
            goto L6b
        L5d:
            defpackage.sf5.h0(r9)
            r8.F = r6
            vm r5 = (defpackage.vm) r5
            java.lang.Object r8 = r5.i(r8)
            if (r8 != r4) goto L6b
            r1 = r4
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
