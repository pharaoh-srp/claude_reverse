package com.anthropic.claude.connector.auth;

import android.content.Context;
import com.anthropic.claude.analytics.events.McpEvents$McpAuthCompleted;
import com.anthropic.claude.analytics.events.McpEvents$McpAuthFailureType;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.connector.auth.McpAuthException;
import defpackage.a4e;
import defpackage.amg;
import defpackage.bmg;
import defpackage.j8;
import defpackage.jxb;
import defpackage.koi;
import defpackage.mq5;
import defpackage.mr9;
import defpackage.npk;
import defpackage.pz7;
import defpackage.q0i;
import defpackage.qi3;
import defpackage.si4;
import defpackage.swa;
import defpackage.vp4;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final qi3 a;
    public final swa b;
    public final q0i c;
    public final koi d;
    public final jxb e = new jxb();
    public final amg f;
    public final a4e g;
    public String h;
    public pz7 i;

    public b(qi3 qi3Var, swa swaVar, q0i q0iVar, koi koiVar) {
        this.a = qi3Var;
        this.b = swaVar;
        this.c = q0iVar;
        this.d = koiVar;
        amg amgVarA = bmg.a(null);
        this.f = amgVarA;
        this.g = j8.k(amgVarA);
    }

    public static McpEvents$McpAuthFailureType g(McpAuthException mcpAuthException) {
        if (mcpAuthException instanceof McpAuthException.Cancelled) {
            return null;
        }
        if (mcpAuthException instanceof McpAuthException.StartFailed) {
            return McpEvents$McpAuthFailureType.START_AUTH;
        }
        if (mcpAuthException instanceof McpAuthException.Denied) {
            return McpEvents$McpAuthFailureType.CALLBACK_ERROR;
        }
        if (mcpAuthException instanceof McpAuthException.MissingCallbackParameters) {
            return McpEvents$McpAuthFailureType.CALLBACK_MISSING_CODE;
        }
        if (mcpAuthException instanceof McpAuthException.ExchangeFailed) {
            return McpEvents$McpAuthFailureType.TOKEN_EXCHANGE;
        }
        mr9.b();
        return null;
    }

    public static String h(McpAuthException mcpAuthException) {
        if (mcpAuthException instanceof McpAuthException.Cancelled) {
            return "cancelled";
        }
        if (mcpAuthException instanceof McpAuthException.StartFailed) {
            return "start_error";
        }
        if ((mcpAuthException instanceof McpAuthException.Denied) || (mcpAuthException instanceof McpAuthException.MissingCallbackParameters) || (mcpAuthException instanceof McpAuthException.ExchangeFailed)) {
            return "end_error";
        }
        mr9.b();
        return null;
    }

    public static /* synthetic */ Object k(b bVar, String str, Context context, String str2, si4 si4Var, String str3, String str4, vp4 vp4Var, int i) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        return bVar.j(str, context, str2, si4Var, str3, str4, vp4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r15, android.content.Context r16, defpackage.c4a r17, defpackage.si4 r18, java.lang.String r19, java.lang.String r20, defpackage.vp4 r21) throws java.lang.Throwable {
        /*
            r14 = this;
            r0 = r21
            boolean r2 = r0 instanceof defpackage.ji4
            if (r2 == 0) goto L16
            r2 = r0
            ji4 r2 = (defpackage.ji4) r2
            int r3 = r2.N
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.N = r3
        L14:
            r9 = r2
            goto L1c
        L16:
            ji4 r2 = new ji4
            r2.<init>(r14, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r9.L
            int r2 = r9.N
            r10 = 2
            r3 = 1
            r11 = 0
            m45 r12 = defpackage.m45.E
            if (r2 == 0) goto L56
            if (r2 == r3) goto L3b
            if (r2 != r10) goto L35
            hxb r1 = r9.K
            defpackage.sf5.h0(r0)     // Catch: java.lang.Throwable -> L32
            goto La3
        L32:
            r0 = move-exception
            goto Lab
        L35:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r0)
            return r11
        L3b:
            hxb r2 = r9.K
            java.lang.String r3 = r9.J
            java.lang.String r4 = r9.I
            si4 r5 = r9.H
            c4a r6 = r9.G
            android.content.Context r7 = r9.F
            java.lang.String r8 = r9.E
            defpackage.sf5.h0(r0)
            r13 = r6
            r6 = r3
            r3 = r7
            r7 = r13
            r13 = r5
            r5 = r4
            r4 = r13
            r13 = r2
            r2 = r8
            goto L84
        L56:
            defpackage.sf5.h0(r0)
            r9.E = r15
            r2 = r16
            r9.F = r2
            r4 = r17
            r9.G = r4
            r5 = r18
            r9.H = r5
            r6 = r19
            r9.I = r6
            r7 = r20
            r9.J = r7
            jxb r8 = r14.e
            r9.K = r8
            r9.N = r3
            java.lang.Object r3 = r8.c(r9)
            if (r3 != r12) goto L7c
            goto La1
        L7c:
            r3 = r7
            r7 = r4
            r4 = r5
            r5 = r6
            r6 = r3
            r3 = r2
            r13 = r8
            r2 = r15
        L84:
            com.anthropic.claude.connector.auth.a r0 = new com.anthropic.claude.connector.auth.a     // Catch: java.lang.Throwable -> La9
            r8 = 0
            r1 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> La9
            r9.E = r11     // Catch: java.lang.Throwable -> La9
            r9.F = r11     // Catch: java.lang.Throwable -> La9
            r9.G = r11     // Catch: java.lang.Throwable -> La9
            r9.H = r11     // Catch: java.lang.Throwable -> La9
            r9.I = r11     // Catch: java.lang.Throwable -> La9
            r9.J = r11     // Catch: java.lang.Throwable -> La9
            r9.K = r13     // Catch: java.lang.Throwable -> La9
            r9.N = r10     // Catch: java.lang.Throwable -> La9
            java.lang.Object r0 = defpackage.fd9.N(r0, r9)     // Catch: java.lang.Throwable -> La9
            if (r0 != r12) goto La2
        La1:
            return r12
        La2:
            r1 = r13
        La3:
            iei r0 = defpackage.iei.a     // Catch: java.lang.Throwable -> L32
            r1.d(r11)
            return r0
        La9:
            r0 = move-exception
            r1 = r13
        Lab:
            r1.d(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.connector.auth.b.a(java.lang.String, android.content.Context, c4a, si4, java.lang.String, java.lang.String, vp4):java.lang.Object");
    }

    public final void b() {
        this.f.m(null);
        this.h = null;
        this.i = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        if (r12.c().equals(r11.h) == false) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [hxb] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [li4, tp4, vp4] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.anthropic.claude.connector.auth.b] */
    /* JADX WARN: Type inference failed for: r13v10, types: [hxb] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [hxb] */
    /* JADX WARN: Type inference failed for: r13v4, types: [hxb, jxb] */
    /* JADX WARN: Type inference failed for: r13v5, types: [hxb] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ri4 r12, defpackage.vp4 r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.connector.auth.b.c(ri4, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0087 A[PHI: r10 r11
      0x0087: PHI (r10v5 pz7) = (r10v4 pz7), (r10v8 pz7) binds: [B:34:0x0084, B:21:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x0087: PHI (r11v3 java.lang.String) = (r11v2 java.lang.String), (r11v7 java.lang.String) binds: [B:34:0x0084, B:21:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r11, java.lang.String r12, java.lang.String r13, defpackage.vp4 r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.mi4
            if (r0 == 0) goto L13
            r0 = r14
            mi4 r0 = (defpackage.mi4) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            mi4 r0 = new mi4
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.G
            int r1 = r0.I
            iei r2 = defpackage.iei.a
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            m45 r9 = defpackage.m45.E
            if (r1 == 0) goto L56
            if (r1 == r7) goto L50
            if (r1 == r6) goto L48
            if (r1 == r5) goto L40
            if (r1 == r4) goto L3c
            if (r1 != r3) goto L36
            defpackage.sf5.h0(r14)
            return r2
        L36:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r10)
            return r8
        L3c:
            defpackage.sf5.h0(r14)
            return r2
        L40:
            pz7 r10 = r0.F
            java.lang.String r11 = r0.E
            defpackage.sf5.h0(r14)
            goto L87
        L48:
            pz7 r10 = r0.F
            java.lang.String r11 = r0.E
            defpackage.sf5.h0(r14)
            goto L78
        L50:
            java.lang.String r11 = r0.E
            defpackage.sf5.h0(r14)
            goto L64
        L56:
            defpackage.sf5.h0(r14)
            r0.E = r11
            r0.I = r7
            java.lang.Object r12 = r10.f(r11, r12, r13, r0)
            if (r12 != r9) goto L64
            goto La4
        L64:
            pz7 r12 = r10.i
            q0i r10 = r10.c
            if (r12 == 0) goto L98
            r0.E = r11
            r0.F = r12
            r0.I = r6
            java.lang.Object r14 = r10.f(r0)
            if (r14 != r9) goto L77
            goto La4
        L77:
            r10 = r12
        L78:
            lf9 r14 = (defpackage.lf9) r14
            r0.E = r11
            r0.F = r10
            r0.I = r5
            java.lang.Object r12 = r14.n(r0)
            if (r12 != r9) goto L87
            goto La4
        L87:
            com.anthropic.claude.types.strings.McpServerId r11 = com.anthropic.claude.types.strings.McpServerId.m1029boximpl(r11)
            r0.E = r8
            r0.F = r8
            r0.I = r4
            java.lang.Object r10 = r10.invoke(r11, r0)
            if (r10 != r9) goto La5
            goto La4
        L98:
            r0.E = r8
            r0.F = r8
            r0.I = r3
            java.lang.Object r10 = r10.f(r0)
            if (r10 != r9) goto La5
        La4:
            return r9
        La5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.connector.auth.b.d(java.lang.String, java.lang.String, java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x01cd, code lost:
    
        if (r5.invoke(r1, r7) == r11) goto L93;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df A[Catch: all -> 0x008e, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x008e, blocks: (B:36:0x0085, B:47:0x00df), top: B:113:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb A[Catch: all -> 0x0267, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0267, blocks: (B:45:0x00d7, B:49:0x00eb), top: B:115:0x00d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0127 A[Catch: all -> 0x01e3, TryCatch #2 {all -> 0x01e3, blocks: (B:52:0x0121, B:54:0x0127, B:56:0x0164, B:80:0x01e6, B:98:0x0253, B:100:0x0257, B:105:0x0261, B:106:0x0266), top: B:114:0x0121 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x021a A[Catch: all -> 0x01e1, TryCatch #1 {all -> 0x01e1, blocks: (B:84:0x0214, B:86:0x021a, B:91:0x022e, B:88:0x0229, B:96:0x024d, B:97:0x0252, B:60:0x0183), top: B:113:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0229 A[Catch: all -> 0x01e1, TryCatch #1 {all -> 0x01e1, blocks: (B:84:0x0214, B:86:0x021a, B:91:0x022e, B:88:0x0229, B:96:0x024d, B:97:0x0252, B:60:0x0183), top: B:113:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0253 A[Catch: all -> 0x01e3, TRY_ENTER, TryCatch #2 {all -> 0x01e3, blocks: (B:52:0x0121, B:54:0x0127, B:56:0x0164, B:80:0x01e6, B:98:0x0253, B:100:0x0257, B:105:0x0261, B:106:0x0266), top: B:114:0x0121 }] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38, types: [hxb] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [hxb] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24, types: [hxb] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r23, java.lang.String r24, android.content.Context r25, defpackage.si4 r26, boolean r27, defpackage.pz7 r28, defpackage.vp4 r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.connector.auth.b.e(java.lang.String, java.lang.String, android.content.Context, si4, boolean, pz7, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r5, java.lang.String r6, java.lang.String r7, defpackage.vp4 r8) throws com.anthropic.claude.connector.auth.McpAuthException.ExchangeFailed {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.oi4
            if (r0 == 0) goto L13
            r0 = r8
            oi4 r0 = (defpackage.oi4) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            oi4 r0 = new oi4
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.F
            int r1 = r0.H
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            java.lang.String r5 = r0.E
            defpackage.sf5.h0(r8)
            goto L42
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r3
        L2e:
            defpackage.sf5.h0(r8)
            r0.E = r5
            r0.H = r2
            java.lang.String r8 = "json"
            swa r1 = r4.b
            java.lang.Object r8 = r1.i(r6, r7, r8, r0)
            m45 r6 = defpackage.m45.E
            if (r8 != r6) goto L42
            return r6
        L42:
            com.anthropic.claude.api.result.ApiResult r8 = (com.anthropic.claude.api.result.ApiResult) r8
            boolean r6 = r8 instanceof defpackage.of0
            if (r6 == 0) goto L6c
            of0 r8 = (defpackage.of0) r8
            java.lang.Object r6 = r8.b
            com.anthropic.claude.api.mcp.CompleteMcpAuthResponse r6 = (com.anthropic.claude.api.mcp.CompleteMcpAuthResponse) r6
            java.lang.Boolean r7 = r6.getSuccess()
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            boolean r7 = defpackage.x44.r(r7, r8)
            if (r7 == 0) goto L62
            java.lang.String r6 = "success"
            r4.l(r5, r6, r3)
            iei r4 = defpackage.iei.a
            return r4
        L62:
            com.anthropic.claude.connector.auth.McpAuthException$ExchangeFailed r4 = new com.anthropic.claude.connector.auth.McpAuthException$ExchangeFailed
            java.lang.String r5 = r6.getError()
            r4.<init>(r5)
            throw r4
        L6c:
            boolean r4 = r8 instanceof defpackage.nf0
            if (r4 == 0) goto L8f
            com.anthropic.claude.connector.auth.McpAuthException$ExchangeFailed r4 = new com.anthropic.claude.connector.auth.McpAuthException$ExchangeFailed
            boolean r5 = r8 instanceof defpackage.lf0
            if (r5 == 0) goto L7a
            r5 = r8
            lf0 r5 = (defpackage.lf0) r5
            goto L7b
        L7a:
            r5 = r3
        L7b:
            if (r5 == 0) goto L85
            bj3 r5 = r5.b()
            java.lang.String r3 = r5.getF()
        L85:
            nf0 r8 = (defpackage.nf0) r8
            java.lang.Throwable r5 = defpackage.hsk.h(r8)
            r4.<init>(r3, r5)
            throw r4
        L8f:
            defpackage.mr9.b()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.connector.auth.b.f(java.lang.String, java.lang.String, java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f2 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:17:0x0038, B:62:0x0146, B:64:0x014c, B:65:0x015a, B:70:0x0163, B:71:0x0168, B:24:0x0048, B:54:0x0111, B:51:0x00f2, B:46:0x00d8), top: B:77:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014c A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:17:0x0038, B:62:0x0146, B:64:0x014c, B:65:0x015a, B:70:0x0163, B:71:0x0168, B:24:0x0048, B:54:0x0111, B:51:0x00f2, B:46:0x00d8), top: B:77:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015a A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #1 {all -> 0x003d, blocks: (B:17:0x0038, B:62:0x0146, B:64:0x014c, B:65:0x015a, B:70:0x0163, B:71:0x0168, B:24:0x0048, B:54:0x0111, B:51:0x00f2, B:46:0x00d8), top: B:77:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [hxb] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.bi4 r17, android.content.Context r18, defpackage.si4 r19, boolean r20, defpackage.pz7 r21, defpackage.vp4 r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.connector.auth.b.i(bi4, android.content.Context, si4, boolean, pz7, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r23, android.content.Context r24, java.lang.String r25, defpackage.si4 r26, java.lang.String r27, java.lang.String r28, defpackage.vp4 r29) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.connector.auth.b.j(java.lang.String, android.content.Context, java.lang.String, si4, java.lang.String, java.lang.String, vp4):java.lang.Object");
    }

    public final void l(String str, String str2, McpEvents$McpAuthFailureType mcpEvents$McpAuthFailureType) {
        String url;
        koi koiVar = this.d;
        String str3 = koiVar.e;
        McpServer mcpServerL = koiVar.l(str);
        this.a.e(new McpEvents$McpAuthCompleted(str3, str2, str, (String) null, (mcpServerL == null || (url = mcpServerL.getUrl()) == null) ? null : npk.b(url), mcpEvents$McpAuthFailureType, 8, (mq5) null), McpEvents$McpAuthCompleted.Companion.serializer());
    }
}
