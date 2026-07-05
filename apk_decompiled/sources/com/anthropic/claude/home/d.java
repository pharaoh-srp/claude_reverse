package com.anthropic.claude.home;

import defpackage.lp7;

/* JADX INFO: loaded from: classes.dex */
public final class d implements lp7 {
    public final /* synthetic */ lp7 E;

    public d(lp7 lp7Var) {
        this.E = lp7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.lp7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.Object r6, defpackage.tp4 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.yf6
            if (r0 == 0) goto L13
            r0 = r7
            yf6 r0 = (defpackage.yf6) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.F = r1
            goto L18
        L13:
            yf6 r0 = new yf6
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.E
            int r1 = r0.F
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2d
            if (r1 != r3) goto L27
            defpackage.sf5.h0(r7)
            goto La6
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            return r2
        L2d:
            defpackage.sf5.h0(r7)
            yvb r6 = (defpackage.yvb) r6
            xbd r7 = defpackage.zf6.d
            java.lang.Object r6 = r6.c(r7)
            java.lang.String r6 = (java.lang.String) r6
            r7 = 7
            if (r6 == 0) goto L94
            ih9 r1 = defpackage.uf6.d
            int r1 = r6.length()
            if (r1 != 0) goto L4b
            uf6 r6 = new uf6
            r6.<init>(r2, r2, r7)
            goto L99
        L4b:
            ih9 r1 = defpackage.uf6.d     // Catch: java.lang.IllegalArgumentException -> L88 kotlinx.serialization.SerializationException -> L8e
            tf6 r4 = com.anthropic.claude.home.DrawerTabPreferences$Persisted.Companion     // Catch: java.lang.IllegalArgumentException -> L88 kotlinx.serialization.SerializationException -> L8e
            kotlinx.serialization.KSerializer r4 = r4.serializer()     // Catch: java.lang.IllegalArgumentException -> L88 kotlinx.serialization.SerializationException -> L8e
            s06 r4 = (defpackage.s06) r4     // Catch: java.lang.IllegalArgumentException -> L88 kotlinx.serialization.SerializationException -> L8e
            java.lang.Object r6 = r1.b(r6, r4)     // Catch: java.lang.IllegalArgumentException -> L88 kotlinx.serialization.SerializationException -> L8e
            com.anthropic.claude.home.DrawerTabPreferences$Persisted r6 = (com.anthropic.claude.home.DrawerTabPreferences$Persisted) r6     // Catch: java.lang.IllegalArgumentException -> L88 kotlinx.serialization.SerializationException -> L8e
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            uf6 r1 = new uf6
            java.util.List r2 = r6.getVisible()
            java.util.ArrayList r2 = defpackage.u00.l(r7, r2)
            java.util.List r4 = r6.getHidden()
            java.util.ArrayList r7 = defpackage.u00.l(r7, r4)
            efk r4 = defpackage.pf6.G
            java.lang.String r6 = r6.getLaunchTab()
            r4.getClass()
            pf6 r6 = defpackage.efk.u(r6)
            if (r6 != 0) goto L83
            pf6 r6 = defpackage.pf6.I
        L83:
            r1.<init>(r2, r7, r6)
            r6 = r1
            goto L99
        L88:
            uf6 r6 = new uf6
            r6.<init>(r2, r2, r7)
            goto L99
        L8e:
            uf6 r6 = new uf6
            r6.<init>(r2, r2, r7)
            goto L99
        L94:
            uf6 r6 = new uf6
            r6.<init>(r2, r2, r7)
        L99:
            r0.F = r3
            lp7 r5 = r5.E
            java.lang.Object r5 = r5.g(r6, r0)
            m45 r6 = defpackage.m45.E
            if (r5 != r6) goto La6
            return r6
        La6:
            iei r5 = defpackage.iei.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.home.d.g(java.lang.Object, tp4):java.lang.Object");
    }
}
