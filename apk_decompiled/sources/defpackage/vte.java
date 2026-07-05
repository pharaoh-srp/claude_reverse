package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vte extends gre implements pz7 {
    public final /* synthetic */ int F;
    public int G;
    public /* synthetic */ Object H;
    public final /* synthetic */ bz7 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vte(int i, tp4 tp4Var, bz7 bz7Var) {
        super(2, tp4Var);
        this.F = i;
        this.I = bz7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.F;
        bz7 bz7Var = this.I;
        switch (i) {
            case 0:
                vte vteVar = new vte(0, tp4Var, bz7Var);
                vteVar.H = obj;
                return vteVar;
            default:
                vte vteVar2 = new vte(1, tp4Var, bz7Var);
                vteVar2.H = obj;
                return vteVar2;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.F;
        iei ieiVar = iei.a;
        d0h d0hVar = (d0h) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
            case 0:
                return ((vte) create(d0hVar, tp4Var)).invokeSuspend(ieiVar);
            default:
                ((vte) create(d0hVar, tp4Var)).invokeSuspend(ieiVar);
                return m45.E;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0032 -> B:13:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.F
            bz7 r1 = r9.I
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            m45 r3 = defpackage.m45.E
            r4 = 1
            r5 = 0
            switch(r0) {
                case 0: goto L44;
                default: goto Ld;
            }
        Ld:
            int r0 = r9.G
            if (r0 == 0) goto L20
            if (r0 != r4) goto L1b
            java.lang.Object r0 = r9.H
            d0h r0 = (defpackage.d0h) r0
            defpackage.sf5.h0(r10)
            goto L35
        L1b:
            defpackage.sz6.j(r2)
            r3 = r5
            goto L34
        L20:
            defpackage.sf5.h0(r10)
            java.lang.Object r10 = r9.H
            d0h r10 = (defpackage.d0h) r10
            r0 = r10
        L28:
            r9.H = r0
            r9.G = r4
            u7d r10 = defpackage.u7d.E
            java.lang.Object r10 = r0.a(r10, r9)
            if (r10 != r3) goto L35
        L34:
            return r3
        L35:
            t7d r10 = (defpackage.t7d) r10
            boolean r10 = defpackage.eif.b(r10)
            r10 = r10 ^ r4
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r1.invoke(r10)
            goto L28
        L44:
            int r0 = r9.G
            r6 = 2
            if (r0 == 0) goto L5e
            if (r0 == r4) goto L56
            if (r0 != r6) goto L51
            defpackage.sf5.h0(r10)
            goto L8d
        L51:
            defpackage.sz6.j(r2)
            r3 = r5
            goto L96
        L56:
            java.lang.Object r0 = r9.H
            d0h r0 = (defpackage.d0h) r0
            defpackage.sf5.h0(r10)
            goto L71
        L5e:
            defpackage.sf5.h0(r10)
            java.lang.Object r10 = r9.H
            r0 = r10
            d0h r0 = (defpackage.d0h) r0
            r9.H = r0
            r9.G = r4
            java.lang.Object r10 = defpackage.osk.m(r0, r9)
            if (r10 != r3) goto L71
            goto L96
        L71:
            z7d r10 = (defpackage.z7d) r10
            r10.a()
            long r7 = r10.c
            fcc r10 = new fcc
            r10.<init>(r7)
            r1.invoke(r10)
            r9.H = r5
            r9.G = r6
            u7d r10 = defpackage.u7d.F
            java.lang.Object r10 = defpackage.x4h.l(r0, r10, r9)
            if (r10 != r3) goto L8d
            goto L96
        L8d:
            z7d r10 = (defpackage.z7d) r10
            if (r10 == 0) goto L94
            r10.a()
        L94:
            iei r3 = defpackage.iei.a
        L96:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vte.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
