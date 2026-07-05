package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mf4 extends gre implements pz7 {
    public final /* synthetic */ int F;
    public int G;
    public /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf4() {
        super(2, null);
        this.F = 1;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.F) {
            case 0:
                mf4 mf4Var = new mf4(2, tp4Var, 0);
                mf4Var.H = obj;
                return mf4Var;
            default:
                mf4 mf4Var2 = new mf4(2, tp4Var, 1);
                mf4Var2.H = obj;
                return mf4Var2;
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
                return ((mf4) create(d0hVar, tp4Var)).invokeSuspend(ieiVar);
            default:
                ((mf4) create(d0hVar, tp4Var)).invokeSuspend(ieiVar);
                return m45.E;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043 A[LOOP:0: B:14:0x003d->B:16:0x0043, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0030 -> B:13:0x0033). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.F
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            m45 r2 = defpackage.m45.E
            r3 = 1
            r4 = 0
            switch(r0) {
                case 0: goto L4d;
                default: goto Lb;
            }
        Lb:
            int r0 = r6.G
            if (r0 == 0) goto L1e
            if (r0 != r3) goto L19
            java.lang.Object r0 = r6.H
            d0h r0 = (defpackage.d0h) r0
            defpackage.sf5.h0(r7)
            goto L33
        L19:
            defpackage.sz6.j(r1)
            r2 = r4
            goto L32
        L1e:
            defpackage.sf5.h0(r7)
            java.lang.Object r7 = r6.H
            d0h r7 = (defpackage.d0h) r7
            r0 = r7
        L26:
            r6.H = r0
            r6.G = r3
            u7d r7 = defpackage.u7d.F
            java.lang.Object r7 = r0.a(r7, r6)
            if (r7 != r2) goto L33
        L32:
            return r2
        L33:
            t7d r7 = (defpackage.t7d) r7
            java.util.List r7 = r7.a
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L3d:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r7.next()
            z7d r1 = (defpackage.z7d) r1
            r1.a()
            goto L3d
        L4d:
            java.lang.Object r0 = r6.H
            d0h r0 = (defpackage.d0h) r0
            int r5 = r6.G
            if (r5 == 0) goto L60
            if (r5 != r3) goto L5b
            defpackage.sf5.h0(r7)
            goto L6e
        L5b:
            defpackage.sz6.j(r1)
            r7 = r4
            goto L6e
        L60:
            defpackage.sf5.h0(r7)
            r6.H = r4
            r6.G = r3
            java.lang.Object r7 = defpackage.pf4.b(r0, r6)
            if (r7 != r2) goto L6e
            r7 = r2
        L6e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mf4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mf4(int i, tp4 tp4Var, int i2) {
        super(i, tp4Var);
        this.F = i2;
    }
}
