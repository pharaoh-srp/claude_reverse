package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class uh5 extends xzg implements bz7 {
    public Serializable E;
    public bae F;
    public int G;
    public final /* synthetic */ dae H;
    public final /* synthetic */ bi5 I;
    public final /* synthetic */ bae J;
    public final /* synthetic */ pz7 K;
    public final /* synthetic */ boolean L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh5(dae daeVar, bi5 bi5Var, bae baeVar, pz7 pz7Var, boolean z, tp4 tp4Var) {
        super(1, tp4Var);
        this.H = daeVar;
        this.I = bi5Var;
        this.J = baeVar;
        this.K = pz7Var;
        this.L = z;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        return new uh5(this.H, this.I, this.J, this.K, this.L, tp4Var);
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        return ((uh5) create((tp4) obj)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (r10 != r8) goto L30;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.G
            r1 = 0
            bae r2 = r9.J
            bi5 r3 = r9.I
            dae r4 = r9.H
            r5 = 3
            r6 = 2
            r7 = 1
            m45 r8 = defpackage.m45.E
            if (r0 == 0) goto L36
            if (r0 == r7) goto L2e
            if (r0 == r6) goto L26
            if (r0 != r5) goto L20
            bae r2 = r9.F
            java.io.Serializable r9 = r9.E
            androidx.datastore.core.CorruptionException r9 = (androidx.datastore.core.CorruptionException) r9
            defpackage.sf5.h0(r10)
            goto L78
        L20:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r9)
            return r1
        L26:
            java.io.Serializable r0 = r9.E
            bae r0 = (defpackage.bae) r0
            defpackage.sf5.h0(r10)     // Catch: androidx.datastore.core.CorruptionException -> L69
            goto L60
        L2e:
            java.io.Serializable r0 = r9.E
            dae r0 = (defpackage.dae) r0
            defpackage.sf5.h0(r10)     // Catch: androidx.datastore.core.CorruptionException -> L69
            goto L4a
        L36:
            defpackage.sf5.h0(r10)
            r9.E = r4     // Catch: androidx.datastore.core.CorruptionException -> L69
            r9.G = r7     // Catch: androidx.datastore.core.CorruptionException -> L69
            nh5 r10 = new nh5     // Catch: androidx.datastore.core.CorruptionException -> L69
            r10.<init>(r7, r1, r3)     // Catch: androidx.datastore.core.CorruptionException -> L69
            java.lang.Object r10 = defpackage.zh4.y(r9, r10)     // Catch: androidx.datastore.core.CorruptionException -> L69
            if (r10 != r8) goto L49
            goto L77
        L49:
            r0 = r4
        L4a:
            r0.E = r10     // Catch: androidx.datastore.core.CorruptionException -> L69
            pz7 r10 = r9.K     // Catch: androidx.datastore.core.CorruptionException -> L69
            boolean r0 = r9.L     // Catch: androidx.datastore.core.CorruptionException -> L69
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: androidx.datastore.core.CorruptionException -> L69
            r9.E = r2     // Catch: androidx.datastore.core.CorruptionException -> L69
            r9.G = r6     // Catch: androidx.datastore.core.CorruptionException -> L69
            java.lang.Object r10 = r10.invoke(r0, r9)     // Catch: androidx.datastore.core.CorruptionException -> L69
            if (r10 != r8) goto L5f
            goto L77
        L5f:
            r0 = r2
        L60:
            java.lang.Number r10 = (java.lang.Number) r10     // Catch: androidx.datastore.core.CorruptionException -> L69
            int r10 = r10.intValue()     // Catch: androidx.datastore.core.CorruptionException -> L69
            r0.E = r10     // Catch: androidx.datastore.core.CorruptionException -> L69
            goto L80
        L69:
            java.lang.Object r10 = r4.E
            r9.E = r1
            r9.F = r2
            r9.G = r5
            java.lang.Object r10 = r3.h(r10, r7, r9)
            if (r10 != r8) goto L78
        L77:
            return r8
        L78:
            java.lang.Number r10 = (java.lang.Number) r10
            int r9 = r10.intValue()
            r2.E = r9
        L80:
            iei r9 = defpackage.iei.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uh5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
