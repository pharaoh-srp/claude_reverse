package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gq7 implements kp7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ kp7 F;
    public final /* synthetic */ pz7 G;

    public /* synthetic */ gq7(kp7 kp7Var, pz7 pz7Var, int i) {
        this.E = i;
        this.F = kp7Var;
        this.G = pz7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // defpackage.kp7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.lp7 r10, defpackage.tp4 r11) {
        /*
            r9 = this;
            int r0 = r9.E
            iei r1 = defpackage.iei.a
            m45 r2 = defpackage.m45.E
            pz7 r3 = r9.G
            kp7 r4 = r9.F
            switch(r0) {
                case 0: goto L6f;
                case 1: goto L1a;
                default: goto Ld;
            }
        Ld:
            pq7 r9 = new pq7
            r9.<init>(r10, r3)
            java.lang.Object r9 = r4.a(r9, r11)
            if (r9 != r2) goto L19
            r1 = r9
        L19:
            return r1
        L1a:
            boolean r0 = r11 instanceof defpackage.nq7
            if (r0 == 0) goto L2d
            r0 = r11
            nq7 r0 = (defpackage.nq7) r0
            int r5 = r0.F
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L2d
            int r5 = r5 - r6
            r0.F = r5
            goto L32
        L2d:
            nq7 r0 = new nq7
            r0.<init>(r9, r11)
        L32:
            java.lang.Object r9 = r0.E
            int r11 = r0.F
            r5 = 1
            if (r11 == 0) goto L4a
            if (r11 != r5) goto L43
            pq7 r10 = r0.H
            defpackage.sf5.h0(r9)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L41
            goto L6d
        L41:
            r9 = move-exception
            goto L62
        L43:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r9)
            r1 = 0
            goto L6d
        L4a:
            defpackage.sf5.h0(r9)
            pq7 r9 = new pq7
            r9.<init>(r3, r10)
            r0.H = r9     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5e
            r0.F = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5e
            java.lang.Object r9 = r4.a(r9, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5e
            if (r9 != r2) goto L6d
            r1 = r2
            goto L6d
        L5e:
            r10 = move-exception
            r8 = r10
            r10 = r9
            r9 = r8
        L62:
            java.lang.Object r11 = r9.E
            if (r11 != r10) goto L6e
            c45 r9 = r0.getContext()
            defpackage.knk.u(r9)
        L6d:
            return r1
        L6e:
            throw r9
        L6f:
            z9e r9 = new z9e
            r9.<init>()
            ba0 r0 = new ba0
            r5 = 3
            r0.<init>(r9, r10, r3, r5)
            java.lang.Object r9 = r4.a(r0, r11)
            if (r9 != r2) goto L81
            r1 = r9
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gq7.a(lp7, tp4):java.lang.Object");
    }
}
