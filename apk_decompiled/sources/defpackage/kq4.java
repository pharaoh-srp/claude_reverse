package defpackage;

import com.anthropic.claude.db.ClaudeDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class kq4 {
    public final ClaudeDatabase a;
    public final xz8 b;

    public kq4(el5 el5Var) {
        this.a = (ClaudeDatabase) el5Var.E;
        this.b = (xz8) el5Var.F;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.zy7 r6, defpackage.bz7 r7, defpackage.vp4 r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.iq4
            if (r0 == 0) goto L13
            r0 = r8
            iq4 r0 = (defpackage.iq4) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            iq4 r0 = new iq4
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.G
            int r1 = r0.I
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2c
            z9e r5 = r0.F
            zy7 r6 = r0.E
            defpackage.sf5.h0(r8)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L71
            goto L52
        L2a:
            r7 = move-exception
            goto L57
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            return r2
        L32:
            defpackage.sf5.h0(r8)
            z9e r8 = new z9e
            r8.<init>()
            com.anthropic.claude.db.ClaudeDatabase r5 = r5.a     // Catch: java.lang.Exception -> L55 java.util.concurrent.CancellationException -> L71
            jq4 r1 = new jq4     // Catch: java.lang.Exception -> L55 java.util.concurrent.CancellationException -> L71
            r4 = 0
            r1.<init>(r4, r2, r7)     // Catch: java.lang.Exception -> L55 java.util.concurrent.CancellationException -> L71
            r0.E = r6     // Catch: java.lang.Exception -> L55 java.util.concurrent.CancellationException -> L71
            r0.F = r8     // Catch: java.lang.Exception -> L55 java.util.concurrent.CancellationException -> L71
            r0.I = r3     // Catch: java.lang.Exception -> L55 java.util.concurrent.CancellationException -> L71
            java.lang.Object r5 = defpackage.oq5.V(r5, r1, r0)     // Catch: java.lang.Exception -> L55 java.util.concurrent.CancellationException -> L71
            m45 r7 = defpackage.m45.E
            if (r5 != r7) goto L51
            return r7
        L51:
            r5 = r8
        L52:
            r5.E = r3     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L71
            goto L6a
        L55:
            r7 = move-exception
            r5 = r8
        L57:
            java.util.List r8 = defpackage.xah.a
            java.lang.Object r6 = r6.a()
            java.lang.String r8 = "Failed to "
            java.lang.String r6 = defpackage.ij0.h(r8, r6)
            ozf r8 = defpackage.ozf.F
            r0 = 24
            defpackage.xah.f(r7, r6, r8, r2, r0)
        L6a:
            boolean r5 = r5.E
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L71:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq4.a(zy7, bz7, vp4):java.lang.Object");
    }
}
