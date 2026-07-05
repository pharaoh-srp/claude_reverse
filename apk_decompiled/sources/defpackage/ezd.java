package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ezd {
    public final prb a;
    public final mga b;

    public ezd(prb prbVar, mga mgaVar) {
        this.a = prbVar;
        this.b = mgaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.czd r5, defpackage.vp4 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.dzd
            if (r0 == 0) goto L13
            r0 = r6
            dzd r0 = (defpackage.dzd) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            dzd r0 = new dzd
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            defpackage.sf5.h0(r6)     // Catch: java.lang.Exception -> L26
            goto L4d
        L26:
            r4 = move-exception
            goto L46
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L2e:
            defpackage.sf5.h0(r6)
            mga r4 = r4.b     // Catch: java.lang.Exception -> L26
            ujb r6 = r5.a()     // Catch: java.lang.Exception -> L26
            com.squareup.wire.AnyMessage r5 = r5.b()     // Catch: java.lang.Exception -> L26
            r0.G = r3     // Catch: java.lang.Exception -> L26
            java.lang.Object r4 = com.anthropic.claude.protos.push.OperationsClaudeRpcKt.inlineDispatchRequest(r4, r6, r5, r0)     // Catch: java.lang.Exception -> L26
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L4d
            return r5
        L46:
            java.util.List r5 = defpackage.xah.a
            r5 = 30
            defpackage.xah.f(r4, r2, r2, r2, r5)
        L4d:
            iei r4 = defpackage.iei.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ezd.a(czd, vp4):java.lang.Object");
    }
}
