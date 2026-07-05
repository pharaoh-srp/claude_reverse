package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kq7 implements kp7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ kp7 G;

    public /* synthetic */ kq7(kp7 kp7Var, int i, int i2) {
        this.E = i2;
        this.G = kp7Var;
        this.F = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // defpackage.kp7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.lp7 r13, defpackage.tp4 r14) {
        /*
            r12 = this;
            int r0 = r12.E
            iei r1 = defpackage.iei.a
            int r2 = r12.F
            kp7 r3 = r12.G
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            m45 r6 = defpackage.m45.E
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 1
            switch(r0) {
                case 0: goto L4e;
                default: goto L13;
            }
        L13:
            boolean r0 = r14 instanceof defpackage.uoa
            if (r0 == 0) goto L24
            r0 = r14
            uoa r0 = (defpackage.uoa) r0
            int r9 = r0.F
            r10 = r9 & r7
            if (r10 == 0) goto L24
            int r9 = r9 - r7
            r0.F = r9
            goto L29
        L24:
            uoa r0 = new uoa
            r0.<init>(r12, r14)
        L29:
            java.lang.Object r12 = r0.E
            int r14 = r0.F
            if (r14 == 0) goto L3a
            if (r14 != r8) goto L35
            defpackage.sf5.h0(r12)
            goto L4d
        L35:
            defpackage.sz6.j(r5)
            r1 = r4
            goto L4d
        L3a:
            defpackage.sf5.h0(r12)
            b3f r3 = (defpackage.b3f) r3
            woa r12 = new woa
            r12.<init>(r13, r2)
            r0.F = r8
            java.lang.Object r12 = r3.a(r12, r0)
            if (r12 != r6) goto L4d
            r1 = r6
        L4d:
            return r1
        L4e:
            boolean r0 = r14 instanceof defpackage.jq7
            if (r0 == 0) goto L5f
            r0 = r14
            jq7 r0 = (defpackage.jq7) r0
            int r9 = r0.F
            r10 = r9 & r7
            if (r10 == 0) goto L5f
            int r9 = r9 - r7
            r0.F = r9
            goto L64
        L5f:
            jq7 r0 = new jq7
            r0.<init>(r12, r14)
        L64:
            java.lang.Object r12 = r0.E
            int r14 = r0.F
            if (r14 == 0) goto L79
            if (r14 != r8) goto L74
            java.lang.Object r13 = r0.H
            defpackage.sf5.h0(r12)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L72
            goto L9f
        L72:
            r12 = move-exception
            goto L9b
        L74:
            defpackage.sz6.j(r5)
            r1 = r4
            goto L9f
        L79:
            defpackage.sf5.h0(r12)
            java.lang.Object r12 = new java.lang.Object
            r12.<init>()
            bae r14 = new bae
            r14.<init>()
            mq7 r4 = new mq7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L97
            r4.<init>(r14, r2, r13, r12)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L97
            r0.H = r12     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L97
            r0.F = r8     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L97
            java.lang.Object r12 = r3.a(r4, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L97
            if (r12 != r6) goto L9f
            r1 = r6
            goto L9f
        L97:
            r13 = move-exception
            r11 = r13
            r13 = r12
            r12 = r11
        L9b:
            java.lang.Object r14 = r12.E
            if (r14 != r13) goto La0
        L9f:
            return r1
        La0:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq7.a(lp7, tp4):java.lang.Object");
    }
}
