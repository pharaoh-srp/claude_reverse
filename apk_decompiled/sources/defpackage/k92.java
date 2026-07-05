package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k92 extends mh2 {
    public final pz7 I;

    public k92(pz7 pz7Var, c45 c45Var, int i, py1 py1Var) {
        super(pz7Var, c45Var, i, py1Var);
        this.I = pz7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.mh2, defpackage.lh2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.aid r5, defpackage.tp4 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.j92
            if (r0 == 0) goto L13
            r0 = r6
            j92 r0 = (defpackage.j92) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L1a
        L13:
            j92 r0 = new j92
            vp4 r6 = (defpackage.vp4) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.F
            int r1 = r0.H
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            aid r5 = r0.E
            defpackage.sf5.h0(r6)
            goto L40
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L30:
            defpackage.sf5.h0(r6)
            r0.E = r5
            r0.H = r3
            java.lang.Object r4 = super.g(r5, r0)
            m45 r6 = defpackage.m45.E
            if (r4 != r6) goto L40
            return r6
        L40:
            zy1 r4 = r5.J
            boolean r4 = r4.E()
            if (r4 == 0) goto L4b
            iei r4 = defpackage.iei.a
            return r4
        L4b:
            java.lang.String r4 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            defpackage.sz6.j(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k92.g(aid, tp4):java.lang.Object");
    }

    @Override // defpackage.mh2, defpackage.lh2
    public final lh2 h(c45 c45Var, int i, py1 py1Var) {
        return new k92(this.I, c45Var, i, py1Var);
    }
}
