package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class h0e {
    public static final Set f = mp0.Z0(new Integer[]{502, 503, 504, 529});
    public final dl2 a;
    public final qs2 b;
    public final vd3 c;
    public final fb6 d;
    public final mn5 e;

    public h0e(dl2 dl2Var, qs2 qs2Var, vd3 vd3Var, fb6 fb6Var, mn5 mn5Var) {
        this.a = dl2Var;
        this.b = qs2Var;
        this.c = vd3Var;
        this.d = fb6Var;
        this.e = mn5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.anthropic.claude.chat.input.draft.DraftMessage r18, defpackage.vp4 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof defpackage.e0e
            if (r2 == 0) goto L17
            r2 = r1
            e0e r2 = (defpackage.e0e) r2
            int r3 = r2.G
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.G = r3
            goto L1c
        L17:
            e0e r2 = new e0e
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.E
            int r3 = r2.G
            r4 = 1
            if (r3 == 0) goto L30
            if (r3 != r4) goto L29
            defpackage.sf5.h0(r1)
            goto L53
        L29:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r0)
            r0 = 0
            return r0
        L30:
            defpackage.sf5.h0(r1)
            r15 = 255(0xff, float:3.57E-43)
            r16 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r5 = r18
            com.anthropic.claude.chat.input.draft.DraftMessage r1 = com.anthropic.claude.chat.input.draft.DraftMessage.m652copyUKUR3NQ$default(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r2.G = r4
            fb6 r0 = r0.d
            java.lang.Object r0 = r0.e(r1, r2)
            m45 r1 = defpackage.m45.E
            if (r0 != r1) goto L53
            return r1
        L53:
            iei r0 = defpackage.iei.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h0e.a(com.anthropic.claude.chat.input.draft.DraftMessage, vp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        if (defpackage.h0e.f.contains(new java.lang.Integer(r6)) != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, int r6, defpackage.bj3 r7, com.anthropic.claude.chat.input.draft.DraftMessage r8, defpackage.vp4 r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof defpackage.f0e
            if (r0 == 0) goto L13
            r0 = r9
            f0e r0 = (defpackage.f0e) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            f0e r0 = new f0e
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.sf5.h0(r9)
            goto L6b
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L2c:
            defpackage.sf5.h0(r9)
            boolean r9 = r7 instanceof com.anthropic.claude.api.errors.ClaudeApiError$OverloadedApiError
            if (r9 == 0) goto L34
            goto L4f
        L34:
            boolean r9 = r7 instanceof com.anthropic.claude.api.errors.ClaudeApiError$RateLimitApiError
            if (r9 == 0) goto L39
            goto L4f
        L39:
            boolean r9 = r7 instanceof com.anthropic.claude.api.errors.ClaudeApiError$CloudflareWaitingRoomError
            if (r9 == 0) goto L3e
            goto L4f
        L3e:
            boolean r7 = r7 instanceof com.anthropic.claude.api.errors.ClaudeApiError$ServerError
            if (r7 == 0) goto L52
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r6)
            java.util.Set r9 = defpackage.h0e.f
            boolean r7 = r9.contains(r7)
            if (r7 == 0) goto L52
        L4f:
            c0e r4 = defpackage.c0e.a
            return r4
        L52:
            java.util.List r7 = defpackage.xah.a
            java.lang.String r7 = "MessageQueue: non-retryable HTTP "
            java.lang.String r9 = ", demoting chat="
            java.lang.String r5 = defpackage.vb7.k(r6, r7, r9, r5)
            r6 = 6
            defpackage.xah.e(r6, r5, r2, r2)
            r0.G = r3
            java.lang.Object r4 = r4.a(r8, r0)
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L6b
            return r5
        L6b:
            b0e r4 = defpackage.b0e.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h0e.b(java.lang.String, int, bj3, com.anthropic.claude.chat.input.draft.DraftMessage, vp4):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r19v1, types: [tp4] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.anthropic.claude.chat.input.draft.DraftMessage, com.anthropic.claude.chat.input.draft.QueuedSendRequest, java.lang.String, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.String, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.anthropic.claude.chat.input.draft.DraftMessage, com.anthropic.claude.chat.input.draft.QueuedSendRequest, java.lang.String, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r23v0, types: [h0e] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r24, defpackage.vp4 r25) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h0e.c(java.lang.String, vp4):java.lang.Object");
    }
}
