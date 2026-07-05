package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l5h extends iwe {
    public final kah b;

    public l5h(kah kahVar, h86 h86Var) {
        super(h86Var);
        this.b = kahVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        if (((defpackage.uah) r6).f(r7, r0) == r5) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O(java.lang.String r7, java.lang.String r8, defpackage.vp4 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.k5h
            if (r0 == 0) goto L13
            r0 = r9
            k5h r0 = (defpackage.k5h) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            k5h r0 = new k5h
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.F
            int r1 = r0.H
            kah r6 = r6.b
            r2 = 2
            r3 = 0
            r4 = 1
            m45 r5 = defpackage.m45.E
            if (r1 == 0) goto L39
            if (r1 == r4) goto L33
            if (r1 != r2) goto L2d
            defpackage.sf5.h0(r9)
            goto L68
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r3
        L33:
            java.lang.String r7 = r0.E
            defpackage.sf5.h0(r9)
            goto L4a
        L39:
            defpackage.sf5.h0(r9)
            r0.E = r7
            r0.H = r4
            r9 = r6
            uah r9 = (defpackage.uah) r9
            java.lang.Object r9 = r9.k(r7, r8, r0)
            if (r9 != r5) goto L4a
            goto L66
        L4a:
            com.anthropic.claude.api.result.ApiResult r9 = (com.anthropic.claude.api.result.ApiResult) r9
            java.lang.Object r8 = defpackage.hsk.g(r9)
            com.anthropic.claude.api.tasks.SendTaskMessageResponse r8 = (com.anthropic.claude.api.tasks.SendTaskMessageResponse) r8
            if (r8 == 0) goto L67
            boolean r8 = r8.getOk()
            if (r8 != r4) goto L67
            r0.E = r3
            r0.H = r2
            uah r6 = (defpackage.uah) r6
            java.lang.Object r6 = r6.f(r7, r0)
            if (r6 != r5) goto L68
        L66:
            return r5
        L67:
            r4 = 0
        L68:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l5h.O(java.lang.String, java.lang.String, vp4):java.lang.Object");
    }
}
