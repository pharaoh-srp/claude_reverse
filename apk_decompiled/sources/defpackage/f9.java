package defpackage;

import com.anthropic.claude.api.account.Account;
import com.anthropic.claude.api.account.AccountSettings;
import com.anthropic.claude.types.strings.McpToolKey;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f9 {
    public final o7 a;
    public final kab b;
    public final q7 c;
    public final wbb d;
    public final String e;
    public final n8 f;
    public long g;

    public f9(o7 o7Var, kab kabVar, q7 q7Var, wbb wbbVar, String str, n8 n8Var) {
        str.getClass();
        this.a = o7Var;
        this.b = kabVar;
        this.c = q7Var;
        this.d = wbbVar;
        this.e = str;
        this.f = n8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.f9 r16, com.anthropic.claude.api.result.ApiResult r17, defpackage.hcb r18, com.anthropic.claude.api.account.MemoryMode r19, java.lang.Boolean r20, java.lang.Boolean r21, defpackage.vp4 r22) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f9.a(f9, com.anthropic.claude.api.result.ApiResult, hcb, com.anthropic.claude.api.account.MemoryMode, java.lang.Boolean, java.lang.Boolean, vp4):java.lang.Object");
    }

    public final Object b(vp4 vp4Var) {
        n8 n8Var;
        AccountSettings settings = this.c.a().getSettings();
        if (settings == null || (n8Var = this.f) == null) {
            return iei.a;
        }
        jk0 jk0Var = (jk0) n8Var;
        return jk0Var.b.a.c(jk0Var.a.e).m(new v0(11, settings), vp4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.bz7 r8, defpackage.bz7 r9, defpackage.tp4 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.y8
            if (r0 == 0) goto L13
            r0 = r10
            y8 r0 = (defpackage.y8) r0
            int r1 = r0.J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.J = r1
            goto L18
        L13:
            y8 r0 = new y8
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.H
            int r1 = r0.J
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            m45 r6 = defpackage.m45.E
            if (r1 == 0) goto L44
            if (r1 == r4) goto L3c
            if (r1 == r3) goto L36
            if (r1 != r2) goto L30
            nf0 r7 = r0.G
            defpackage.sf5.h0(r10)
            return r7
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r5
        L36:
            bz7 r8 = r0.F
            defpackage.sf5.h0(r10)
            goto L76
        L3c:
            bz7 r9 = r0.F
            bz7 r8 = r0.E
            defpackage.sf5.h0(r10)
            goto L57
        L44:
            defpackage.sf5.h0(r10)
            r7.d(r8)
            r0.E = r8
            r0.F = r9
            r0.J = r4
            java.lang.Object r10 = r7.b(r0)
            if (r10 != r6) goto L57
            goto L94
        L57:
            m8 r10 = com.anthropic.claude.api.account.AccountSettings.Companion
            r10.getClass()
            com.anthropic.claude.api.account.AccountSettings r10 = com.anthropic.claude.api.account.AccountSettings.access$getDEFAULT$cp()
            java.lang.Object r8 = r8.invoke(r10)
            com.anthropic.claude.api.account.AccountSettings r8 = (com.anthropic.claude.api.account.AccountSettings) r8
            r0.E = r5
            r0.F = r9
            r0.J = r3
            o7 r10 = r7.a
            java.lang.Object r10 = r10.f(r8, r0)
            if (r10 != r6) goto L75
            goto L94
        L75:
            r8 = r9
        L76:
            com.anthropic.claude.api.result.ApiResult r10 = (com.anthropic.claude.api.result.ApiResult) r10
            boolean r9 = r10 instanceof defpackage.of0
            if (r9 != 0) goto L9a
            boolean r9 = r10 instanceof defpackage.nf0
            if (r9 == 0) goto L96
            r7.d(r8)
            r0.E = r5
            r0.F = r5
            r8 = r10
            nf0 r8 = (defpackage.nf0) r8
            r0.G = r8
            r0.J = r2
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r6) goto L95
        L94:
            return r6
        L95:
            return r10
        L96:
            defpackage.mr9.b()
            return r5
        L9a:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f9.c(bz7, bz7, tp4):java.lang.Object");
    }

    public final void d(bz7 bz7Var) {
        q7 q7Var = this.c;
        Account accountA = q7Var.a();
        AccountSettings settings = q7Var.a().getSettings();
        if (settings == null) {
            AccountSettings.Companion.getClass();
            settings = AccountSettings.DEFAULT;
        }
        q7Var.c(Account.m101copyl0kCUe4$default(accountA, null, null, null, null, null, null, null, (AccountSettings) bz7Var.invoke(settings), false, 383, null));
    }

    public final Object e(boolean z, vp4 vp4Var) {
        AccountSettings settings = this.c.a().getSettings();
        return c(new q8(z, 15), new r8(settings != null ? settings.getEnabled_connector_suggestions() : null, 7), vp4Var);
    }

    public final Object f(Map map, vp4 vp4Var) {
        AccountSettings settings = this.c.a().getSettings();
        Map<McpToolKey, Boolean> enabled_mcp_tools = settings != null ? settings.getEnabled_mcp_tools() : null;
        return c(new u8(enabled_mcp_tools, map, 0), new t8(1, enabled_mcp_tools), vp4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(boolean r9, defpackage.vp4 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.z8
            if (r0 == 0) goto L13
            r0 = r10
            z8 r0 = (defpackage.z8) r0
            int r1 = r0.J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.J = r1
            goto L18
        L13:
            z8 r0 = new z8
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.H
            int r1 = r0.J
            r2 = 2
            r3 = 1
            r4 = 0
            m45 r5 = defpackage.m45.E
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L34
            if (r1 == r2) goto L2d
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r8)
            return r4
        L2d:
            java.util.concurrent.CancellationException r8 = r0.G
            defpackage.sf5.h0(r10)
            goto L99
        L34:
            boolean r9 = r0.E
            p8 r1 = r0.F
            defpackage.sf5.h0(r10)     // Catch: java.util.concurrent.CancellationException -> L3c
            goto L7c
        L3c:
            r10 = move-exception
            goto L81
        L3e:
            defpackage.sf5.h0(r10)
            q7 r10 = r8.c
            com.anthropic.claude.api.account.Account r1 = r10.a()
            com.anthropic.claude.api.account.AccountSettings r1 = r1.getSettings()
            if (r1 == 0) goto L52
            java.lang.Boolean r1 = r1.getEnabled_saffron()
            goto L53
        L52:
            r1 = r4
        L53:
            com.anthropic.claude.api.account.Account r10 = r10.a()
            com.anthropic.claude.api.account.AccountSettings r10 = r10.getSettings()
            if (r10 == 0) goto L62
            java.lang.Boolean r10 = r10.getEnabled_melange()
            goto L63
        L62:
            r10 = r4
        L63:
            p8 r6 = new p8
            r7 = 0
            r6.<init>(r1, r10, r7)
            q8 r10 = new q8     // Catch: java.util.concurrent.CancellationException -> L7f
            r10.<init>(r9, r7)     // Catch: java.util.concurrent.CancellationException -> L7f
            r0.F = r6     // Catch: java.util.concurrent.CancellationException -> L7f
            r0.E = r9     // Catch: java.util.concurrent.CancellationException -> L7f
            r0.J = r3     // Catch: java.util.concurrent.CancellationException -> L7f
            java.lang.Object r10 = r8.c(r10, r6, r0)     // Catch: java.util.concurrent.CancellationException -> L7f
            if (r10 != r5) goto L7b
            goto L97
        L7b:
            r1 = r6
        L7c:
            com.anthropic.claude.api.result.ApiResult r10 = (com.anthropic.claude.api.result.ApiResult) r10     // Catch: java.util.concurrent.CancellationException -> L3c
            return r10
        L7f:
            r10 = move-exception
            r1 = r6
        L81:
            b6c r3 = defpackage.b6c.F
            m0 r6 = new m0
            r7 = 4
            r6.<init>(r8, r1, r4, r7)
            r0.F = r4
            r0.G = r10
            r0.E = r9
            r0.J = r2
            java.lang.Object r8 = defpackage.gb9.c0(r3, r6, r0)
            if (r8 != r5) goto L98
        L97:
            return r5
        L98:
            r8 = r10
        L99:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f9.g(boolean, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.hcb r18, defpackage.vp4 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f9.h(hcb, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0107 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r43, defpackage.vp4 r44) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f9.i(java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x010d A[Catch: CancellationException -> 0x005f, TryCatch #0 {CancellationException -> 0x005f, blocks: (B:24:0x005a, B:49:0x0107, B:51:0x010d, B:53:0x0111, B:55:0x0121, B:56:0x012e, B:60:0x0134, B:61:0x0139), top: B:72:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(com.anthropic.claude.api.account.VillageWeaverConsentState r45, defpackage.vp4 r46) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f9.j(com.anthropic.claude.api.account.VillageWeaverConsentState, vp4):java.lang.Object");
    }

    public final Object k(String str, xzg xzgVar) {
        AccountSettings settings = this.c.a().getSettings();
        return c(new o8(str, 0), new o8(settings != null ? settings.getVoice_language_code() : null, 3), xzgVar);
    }

    public final Object l(String str, xzg xzgVar) {
        AccountSettings settings = this.c.a().getSettings();
        return c(new o8(str, 6), new o8(settings != null ? settings.getVoice_preference() : null, 7), xzgVar);
    }

    public final Object m(final double d, xzg xzgVar) {
        AccountSettings settings = this.c.a().getSettings();
        return c(new bz7() { // from class: v8
            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                AccountSettings accountSettings = (AccountSettings) obj;
                accountSettings.getClass();
                return AccountSettings.m107copyNcesMF4$default(accountSettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Double.valueOf(d), null, null, 234881023, null);
            }
        }, new v0(3, settings != null ? settings.getVoice_speed() : null), xzgVar);
    }
}
