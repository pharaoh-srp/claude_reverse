package defpackage;

import com.anthropic.claude.api.chat.ChatConversationSettings;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.api.errors.ClaudeApiErrorException;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.configs.flags.UploadConfig;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ck7 {
    public final dl2 a;
    public final haj b;
    public final ok7 c;
    public final String d;
    public final qi3 e;
    public final b1i f;
    public final abj g;
    public final vd3 h;
    public final f1c i;
    public final rc8 j;
    public final bg9 k;
    public final bj0 l;

    public ck7(dl2 dl2Var, haj hajVar, ok7 ok7Var, String str, qi3 qi3Var, b1i b1iVar, abj abjVar, vd3 vd3Var, f1c f1cVar, rc8 rc8Var, bg9 bg9Var, bj0 bj0Var) {
        str.getClass();
        this.a = dl2Var;
        this.b = hajVar;
        this.c = ok7Var;
        this.d = str;
        this.e = qi3Var;
        this.f = b1iVar;
        this.g = abjVar;
        this.h = vd3Var;
        this.i = f1cVar;
        this.j = rc8Var;
        this.k = bg9Var;
        this.l = bj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.ck7 r13, com.anthropic.claude.api.wiggle.PrepareUploadResult r14, defpackage.dk7 r15, defpackage.gub r16, defpackage.vp4 r17) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck7.a(ck7, com.anthropic.claude.api.wiggle.PrepareUploadResult, dk7, gub, vp4):java.lang.Object");
    }

    public static void b(ApiResult apiResult, dk7 dk7Var, String str) {
        if (apiResult instanceof of0) {
            return;
        }
        if (!(apiResult instanceof nf0)) {
            mr9.b();
            return;
        }
        nf0 nf0Var = (nf0) apiResult;
        if (!(nf0Var instanceof lf0)) {
            if (nf0Var instanceof mf0) {
                return;
            }
            mr9.b();
            return;
        }
        p8b p8bVarC = dk7Var.c();
        long jD = dk7Var.d();
        StringBuilder sb = new StringBuilder("Failed to ");
        sb.append(str);
        sb.append(". Media type: ");
        sb.append(p8bVarC);
        sb.append(", size: ");
        String strR = grc.r(jD, " bytes", sb);
        List list = xah.a;
        xah.f(new ClaudeApiErrorException(((lf0) apiResult).b(), strR), strR, null, null, 28);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r5, java.lang.String r6, defpackage.vp4 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.xj7
            if (r0 == 0) goto L13
            r0 = r7
            xj7 r0 = (defpackage.xj7) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            xj7 r0 = new xj7
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.F
            int r1 = r0.H
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            java.lang.String r6 = r0.E
            defpackage.sf5.h0(r7)
            goto L47
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L2e:
            defpackage.sf5.h0(r7)
            com.anthropic.claude.api.wiggle.WiggleDeleteFileRequest r7 = new com.anthropic.claude.api.wiggle.WiggleDeleteFileRequest
            r7.<init>(r6)
            r0.E = r6
            r0.H = r3
            haj r1 = r4.b
            java.lang.String r4 = r4.d
            java.lang.Object r7 = r1.a(r4, r5, r7, r0)
            m45 r4 = defpackage.m45.E
            if (r7 != r4) goto L47
            return r4
        L47:
            com.anthropic.claude.api.result.ApiResult r7 = (com.anthropic.claude.api.result.ApiResult) r7
            boolean r4 = r7 instanceof defpackage.of0
            if (r4 != 0) goto L83
            boolean r4 = r7 instanceof defpackage.nf0
            if (r4 == 0) goto L7f
            r4 = r7
            nf0 r4 = (defpackage.nf0) r4
            boolean r5 = r4 instanceof defpackage.lf0
            if (r5 == 0) goto L76
            r4 = r7
            lf0 r4 = (defpackage.lf0) r4
            java.util.List r5 = defpackage.xah.a
            com.anthropic.claude.api.errors.ClaudeApiErrorException r5 = new com.anthropic.claude.api.errors.ClaudeApiErrorException
            bj3 r4 = r4.b()
            java.lang.String r0 = "Failed to delete file: "
            java.lang.String r1 = defpackage.ij0.i(r0, r6)
            r5.<init>(r4, r1)
            java.lang.String r4 = defpackage.ij0.i(r0, r6)
            r6 = 28
            defpackage.xah.f(r5, r4, r2, r2, r6)
            return r7
        L76:
            boolean r4 = r4 instanceof defpackage.mf0
            if (r4 == 0) goto L7b
            goto L83
        L7b:
            defpackage.mr9.b()
            return r2
        L7f:
            defpackage.mr9.b()
            return r2
        L83:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck7.c(java.lang.String, java.lang.String, vp4):java.lang.Object");
    }

    public final UploadConfig d() {
        UploadConfig uploadConfig = (UploadConfig) this.j.l(UploadConfig.FEATURE_KEY, UploadConfig.Companion.serializer());
        return uploadConfig == null ? new UploadConfig(0, 0L, 0.0d, 0L, 0L, 0L, 63, (mq5) null) : uploadConfig;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r8, defpackage.dk7 r9, defpackage.vp4 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.yj7
            if (r0 == 0) goto L13
            r0 = r10
            yj7 r0 = (defpackage.yj7) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            yj7 r0 = new yj7
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.sf5.h0(r10)
            goto L74
        L26:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r2
        L2c:
            defpackage.sf5.h0(r10)
            java.util.List r10 = defpackage.xah.a
            long r4 = r9.d()
            p8b r10 = r9.c()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r6 = "FileUploadHandler: direct-filestore upload, size="
            r1.<init>(r6)
            r1.append(r4)
            java.lang.String r4 = ", type="
            r1.append(r4)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r1 = 6
            defpackage.xah.e(r1, r10, r2, r2)
            com.anthropic.claude.api.wiggle.PrepareUploadRequest r10 = new com.anthropic.claude.api.wiggle.PrepareUploadRequest
            com.anthropic.claude.api.wiggle.PrepareUploadFileSpec r1 = new com.anthropic.claude.api.wiggle.PrepareUploadFileSpec
            java.lang.String r9 = r9.b()
            r1.<init>(r9)
            java.util.List r9 = defpackage.x44.W(r1)
            r10.<init>(r9)
            r0.G = r3
            ok7 r9 = r7.c
            java.lang.String r7 = r7.d
            java.lang.Object r10 = r9.a(r7, r8, r10, r0)
            m45 r7 = defpackage.m45.E
            if (r10 != r7) goto L74
            return r7
        L74:
            com.anthropic.claude.api.result.ApiResult r10 = (com.anthropic.claude.api.result.ApiResult) r10
            boolean r7 = r10 instanceof defpackage.of0
            if (r7 == 0) goto La1
            of0 r10 = (defpackage.of0) r10
            int r7 = r10.a
            java.lang.Object r8 = r10.b
            com.anthropic.claude.api.wiggle.PrepareUploadResponse r8 = (com.anthropic.claude.api.wiggle.PrepareUploadResponse) r8
            java.util.List r8 = r8.getUploads()
            java.lang.Object r8 = defpackage.w44.N0(r8)
            com.anthropic.claude.api.wiggle.PrepareUploadResult r8 = (com.anthropic.claude.api.wiggle.PrepareUploadResult) r8
            if (r8 != 0) goto L9b
            mf0 r7 = new mf0
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "prepare-upload returned empty uploads"
            r8.<init>(r9)
            r7.<init>(r8)
            return r7
        L9b:
            of0 r9 = new of0
            r9.<init>(r7, r8)
            return r9
        La1:
            boolean r7 = r10 instanceof defpackage.nf0
            if (r7 == 0) goto La6
            return r10
        La6:
            defpackage.mr9.b()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck7.e(java.lang.String, dk7, vp4):java.lang.Object");
    }

    public final boolean f(String str) {
        ChatConversationSettings settings;
        if (!this.f.e() || str == null) {
            return false;
        }
        ChatConversationWithProjectReference chatConversationWithProjectReferenceT = this.h.e.t(str);
        return this.g.a((chatConversationWithProjectReferenceT == null || (settings = chatConversationWithProjectReferenceT.getSettings()) == null) ? null : settings.getEnabled_monkeys_in_a_barrel());
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0127, code lost:
    
        if (r4 == r13) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r34, defpackage.dk7 r35, com.anthropic.claude.analytics.events.ChatEvents$AddAttachment r36, com.anthropic.claude.analytics.events.ChatEvents$UploadSource r37, java.lang.Integer r38, defpackage.bz7 r39, defpackage.zy7 r40, defpackage.vp4 r41) {
        /*
            Method dump skipped, instruction units count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck7.g(java.lang.String, dk7, com.anthropic.claude.analytics.events.ChatEvents$AddAttachment, com.anthropic.claude.analytics.events.ChatEvents$UploadSource, java.lang.Integer, bz7, zy7, vp4):java.lang.Object");
    }
}
