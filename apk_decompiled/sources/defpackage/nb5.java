package defpackage;

import android.content.Context;
import org.chromium.net.CronetEngine;

/* JADX INFO: loaded from: classes.dex */
public final class nb5 {
    public final Context a;
    public final fk0 b;
    public final pb5 c;
    public final h86 d;
    public final jxb e = new jxb();
    public volatile CronetEngine f;
    public volatile hfh g;

    public nb5(Context context, fk0 fk0Var, pb5 pb5Var, h86 h86Var) {
        this.a = context;
        this.b = fk0Var;
        this.c = pb5Var;
        this.d = h86Var;
    }

    public static final CronetEngine.Builder a(nb5 nb5Var, CronetEngine.Builder builder) {
        CronetEngine.Builder builderEnableHttpCache = builder.enableQuic(true).enableBrotli(true).enableHttpCache(1, 10485760L);
        builderEnableHttpCache.getClass();
        CronetEngine.Builder builderAddQuicHint = builderEnableHttpCache.addQuicHint("claude.ai", 443, 443).addQuicHint("www.claude.ai", 443, 443).addQuicHint("api.anthropic.com", 443, 443);
        builderAddQuicHint.getClass();
        return builderAddQuicHint;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.nb5 r5, defpackage.vp4 r6) throws java.lang.Exception {
        /*
            boolean r0 = r6 instanceof defpackage.lb5
            if (r0 == 0) goto L13
            r0 = r6
            lb5 r0 = (defpackage.lb5) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            lb5 r0 = new lb5
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L2f
            if (r1 != r4) goto L29
            defpackage.sf5.h0(r6)     // Catch: java.lang.Exception -> L27
            goto L55
        L27:
            r5 = move-exception
            goto L57
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            return r3
        L2f:
            defpackage.sf5.h0(r6)
            boolean r6 = com.google.android.gms.net.a.b()
            if (r6 == 0) goto L41
            java.lang.String r5 = "Cronet provider already installed"
            r6 = 3
            defpackage.ij0.y(r5, r3, r2, r6)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L41:
            android.content.Context r5 = r5.a     // Catch: java.lang.Exception -> L27
            r5l r5 = com.google.android.gms.net.a.a(r5)     // Catch: java.lang.Exception -> L27
            r5.getClass()     // Catch: java.lang.Exception -> L27
            r0.G = r4     // Catch: java.lang.Exception -> L27
            java.lang.Object r5 = defpackage.zh4.k(r5, r0)     // Catch: java.lang.Exception -> L27
            m45 r6 = defpackage.m45.E
            if (r5 != r6) goto L55
            return r6
        L55:
            r2 = r4
            goto L61
        L57:
            boolean r6 = r5 instanceof com.google.android.gms.common.GooglePlayServicesNotAvailableException
            if (r6 != 0) goto L61
            boolean r6 = r5 instanceof com.google.android.gms.common.GooglePlayServicesRepairableException
            if (r6 == 0) goto L60
            goto L61
        L60:
            throw r5
        L61:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nb5.b(nb5, vp4):java.lang.Object");
    }
}
