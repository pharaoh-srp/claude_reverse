package com.anthropic.claude.tool.mcp;

import defpackage.aid;
import defpackage.cpc;
import defpackage.gb9;
import defpackage.l0b;
import defpackage.m4e;

/* JADX INFO: loaded from: classes.dex */
public final class a extends gb9 {
    public final /* synthetic */ aid c;
    public final /* synthetic */ l0b d;

    public a(aid aidVar, l0b l0bVar) {
        this.c = aidVar;
        this.d = l0bVar;
    }

    @Override // defpackage.gb9
    public final void E(m4e m4eVar) {
        this.c.m(null);
    }

    @Override // defpackage.gb9
    public final void F(m4e m4eVar, String str, String str2) {
        this.c.r(new cpc(str, str2));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    @Override // defpackage.gb9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(defpackage.m4e r5, java.lang.Exception r6, defpackage.pqe r7) {
        /*
            r4 = this;
            r0 = 0
            if (r7 == 0) goto L1e
            boolean r1 = r7.U
            r2 = 1
            if (r1 != r2) goto L1e
            boolean r1 = r6 instanceof java.lang.IllegalStateException
            if (r1 == 0) goto L1e
            r1 = r6
            java.lang.IllegalStateException r1 = (java.lang.IllegalStateException) r1
            java.lang.String r1 = r1.getMessage()
            if (r1 == 0) goto L1e
            java.lang.String r3 = "Invalid content-type"
            boolean r1 = defpackage.isg.q0(r1, r3, r0)
            if (r1 != r2) goto L1e
            r0 = r2
        L1e:
            if (r7 == 0) goto L48
            int r1 = r7.H
            boolean r2 = r7.U
            if (r2 == 0) goto L28
            if (r0 == 0) goto L48
        L28:
            l0b r6 = r4.d     // Catch: java.lang.Exception -> L41
            cj3 r6 = r6.e     // Catch: java.lang.Exception -> L41
            r6.getClass()     // Catch: java.lang.Exception -> L41
            bg9 r6 = r6.a     // Catch: java.lang.Exception -> L41
            rqe r7 = r7.K     // Catch: java.lang.Exception -> L41
            java.lang.String r7 = r7.f()     // Catch: java.lang.Exception -> L41
            bj3 r6 = defpackage.dj3.a(r6, r1, r7)     // Catch: java.lang.Exception -> L41
            lf0 r7 = new lf0     // Catch: java.lang.Exception -> L41
            r7.<init>(r1, r6)     // Catch: java.lang.Exception -> L41
            goto L56
        L41:
            r6 = move-exception
            mf0 r7 = new mf0
            r7.<init>(r6)
            goto L56
        L48:
            mf0 r7 = new mf0
            if (r6 != 0) goto L53
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r0 = "SSE onFailure with null throwable"
            r6.<init>(r0)
        L53:
            r7.<init>(r6)
        L56:
            java.lang.Object r5 = r5.F
            kie r5 = (defpackage.kie) r5
            defpackage.knk.H(r7, r5)
            com.anthropic.claude.tool.mcp.BootstrapSseFailure r5 = new com.anthropic.claude.tool.mcp.BootstrapSseFailure
            r5.<init>(r7)
            aid r4 = r4.c
            r4.m(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.tool.mcp.a.G(m4e, java.lang.Exception, pqe):void");
    }
}
