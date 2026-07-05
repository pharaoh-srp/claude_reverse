package defpackage;

import com.anthropic.claude.configs.flags.StreamSmoothingConfig;
import com.anthropic.claude.tool.model.Tool;
import com.anthropic.claude.tool.model.f;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class nz2 {
    public final gl2 a;
    public final ny2 b;
    public final sc3 c;
    public final myh d;
    public final b1i e;
    public final qs2 f;
    public final yle g;

    public nz2(gl2 gl2Var, ny2 ny2Var, sc3 sc3Var, myh myhVar, b1i b1iVar, qs2 qs2Var, yle yleVar) {
        this.a = gl2Var;
        this.b = ny2Var;
        this.c = sc3Var;
        this.d = myhVar;
        this.e = b1iVar;
        this.f = qs2Var;
        this.g = yleVar;
    }

    public static /* synthetic */ Object c(nz2 nz2Var, String str, List list, boolean z, poj pojVar, boolean z2, boolean z3, Set set, m11 m11Var, lj2 lj2Var, vp4 vp4Var, int i) {
        if ((i & 8) != 0) {
            pojVar = null;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        if ((i & 32) != 0) {
            z3 = false;
        }
        if ((i & 64) != 0) {
            set = um6.E;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            m11Var = null;
        }
        bz7 it2Var = lj2Var;
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            it2Var = new it2(5);
        }
        return nz2Var.b(str, list, z, pojVar, z2, z3, set, m11Var, it2Var, vp4Var);
    }

    public final Tool a(String str) {
        Tool.Companion.getClass();
        Tool toolA = f.a(str);
        if (toolA.equals(Tool.Compass.INSTANCE)) {
            b1i b1iVar = this.e;
            if (!((Boolean) b1iVar.e.getValue()).booleanValue() && !b1iVar.f()) {
                return new Tool.Unknown(str, "");
            }
        }
        return toolA;
    }

    /* JADX WARN: Code restructure failed: missing block: B:238:0x081b, code lost:
    
        r15.add(new com.anthropic.claude.chat.parse.ParsedContentBlock$Thinking(r6, r14, r3, r21, r22, r23, r17));
        r3 = r13;
        r13 = r4;
        r4 = r3;
        r3 = r7;
        r7 = r5;
        r5 = r3;
        r3 = r8;
        r6 = r11;
        r14 = r19;
        r15 = r20;
        r8 = r30;
        r11 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x081b, code lost:
    
        r18 = r4;
        r2 = r2;
        r6 = r11;
        r4 = r13;
        r7 = r17;
        r1 = r20;
        r11 = r0;
        r13 = r8;
        r8 = r30;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x092b A[LOOP:0: B:149:0x087d->B:182:0x092b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0931 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0668  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0734 -> B:109:0x074c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x07bb -> B:119:0x07d5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:139:0x0844 -> B:140:0x085e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x04f2 -> B:140:0x085e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x051e -> B:131:0x081b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r47, java.util.List r48, boolean r49, defpackage.poj r50, boolean r51, boolean r52, java.util.Set r53, defpackage.m11 r54, defpackage.bz7 r55, defpackage.vp4 r56) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nz2.b(java.lang.String, java.util.List, boolean, poj, boolean, boolean, java.util.Set, m11, bz7, vp4):java.lang.Object");
    }

    public final th2 d(String str, gq7 gq7Var, poj pojVar, boolean z) {
        str.getClass();
        pojVar.getClass();
        StreamSmoothingConfig streamSmoothingConfigA = this.f.a();
        tp4 tp4Var = null;
        m11 m11Var = streamSmoothingConfigA != null ? new m11() : null;
        LinkedHashMap linkedHashMap = streamSmoothingConfigA != null ? new LinkedHashMap() : null;
        kp7 kp7VarL = j8.l(gq7Var, 1, py1.F);
        iz2 iz2Var = new iz2(this, str, pojVar, z, m11Var, linkedHashMap, streamSmoothingConfigA, (tp4) null);
        int i = sq7.a;
        return j8.l0(kp7VarL, new rq7(iz2Var, tp4Var, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.anthropic.claude.api.chat.messages.ToolResultBlock r8, defpackage.ftc r9, defpackage.vp4 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.jz2
            if (r0 == 0) goto L14
            r0 = r10
            jz2 r0 = (defpackage.jz2) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.I = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            jz2 r0 = new jz2
            r0.<init>(r7, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.G
            int r0 = r6.I
            myh r1 = r7.d
            r7 = 1
            r2 = 0
            if (r0 == 0) goto L34
            if (r0 != r7) goto L2e
            ftc r9 = r6.F
            com.anthropic.claude.api.chat.messages.ToolResultBlock r8 = r6.E
            defpackage.sf5.h0(r10)
            goto L87
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r2
        L34:
            defpackage.sf5.h0(r10)
            java.util.List r10 = r8.getContent()
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L66
            kotlinx.serialization.json.JsonObject r10 = r8.getStructured_content()
            if (r10 != 0) goto L66
            boolean r7 = r8.is_error()
            java.lang.String r10 = r9.getToolName()
            dlb r0 = r9.c()
            boolean r3 = r9.getIsComplete()
            boolean r8 = r8.is_error()
            java.lang.String r8 = r1.i(r10, r0, r3, r8)
            r10 = 2035(0x7f3, float:2.852E-42)
            ftc r7 = defpackage.ftc.a(r9, r8, r7, r2, r10)
            return r7
        L66:
            dlb r3 = r9.c()
            if (r3 == 0) goto L8a
            java.lang.String r2 = r9.getToolName()
            java.util.List r4 = r8.getContent()
            kotlinx.serialization.json.JsonObject r5 = r8.getStructured_content()
            r6.E = r8
            r6.F = r9
            r6.I = r7
            java.lang.Object r10 = r1.f(r2, r3, r4, r5, r6)
            m45 r7 = defpackage.m45.E
            if (r10 != r7) goto L87
            return r7
        L87:
            r2 = r10
            dlb r2 = (defpackage.dlb) r2
        L8a:
            if (r2 != 0) goto La2
            com.anthropic.claude.core.telemetry.SilentException r7 = new com.anthropic.claude.core.telemetry.SilentException
            java.lang.String r10 = r9.getToolName()
            java.lang.String r0 = "Failed to finish custom tool data model for "
            java.lang.String r10 = defpackage.ij0.i(r0, r10)
            r7.<init>(r10)
            r10 = 0
            r0 = 2
            ozf r3 = defpackage.ozf.F
            com.anthropic.claude.core.telemetry.SilentException.a(r7, r3, r10, r0)
        La2:
            if (r2 != 0) goto La9
            dlb r7 = r9.c()
            goto Laa
        La9:
            r7 = r2
        Laa:
            boolean r10 = r8.is_error()
            java.lang.String r0 = r8.getName()
            boolean r3 = r9.getIsComplete()
            boolean r8 = r8.is_error()
            java.lang.String r8 = r1.i(r0, r2, r3, r8)
            r0 = 1907(0x773, float:2.672E-42)
            ftc r7 = defpackage.ftc.a(r9, r8, r10, r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nz2.e(com.anthropic.claude.api.chat.messages.ToolResultBlock, ftc, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.anthropic.claude.api.chat.messages.ToolUseBlock r18, com.anthropic.claude.chat.parse.ParsedContentBlockId r19, boolean r20, defpackage.vp4 r21) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nz2.f(com.anthropic.claude.api.chat.messages.ToolUseBlock, com.anthropic.claude.chat.parse.ParsedContentBlockId, boolean, vp4):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f0 A[PHI: r1 r2 r3
      0x01f0: PHI (r1v14 boolean) = (r1v0 boolean), (r1v17 boolean) binds: [B:90:0x01f2, B:87:0x01e9] A[DONT_GENERATE, DONT_INLINE]
      0x01f0: PHI (r2v9 hj2) = (r2v2 hj2), (r2v11 hj2) binds: [B:90:0x01f2, B:87:0x01e9] A[DONT_GENERATE, DONT_INLINE]
      0x01f0: PHI (r3v4 mtc) = (r3v1 mtc), (r3v7 mtc) binds: [B:90:0x01f2, B:87:0x01e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021c  */
    /* JADX WARN: Type inference failed for: r11v0, types: [tp4] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.anthropic.claude.api.chat.messages.ToolResultBlock r30, boolean r31, defpackage.mtc r32, defpackage.hj2 r33, defpackage.vp4 r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nz2.g(com.anthropic.claude.api.chat.messages.ToolResultBlock, boolean, mtc, hj2, vp4):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r12v0, types: [tp4] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.anthropic.claude.api.chat.messages.ToolUseBlock r26, boolean r27, boolean r28, defpackage.poj r29, com.anthropic.claude.chat.parse.ParsedContentBlockId r30, java.util.Set r31, defpackage.vp4 r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nz2.h(com.anthropic.claude.api.chat.messages.ToolUseBlock, boolean, boolean, poj, com.anthropic.claude.chat.parse.ParsedContentBlockId, java.util.Set, vp4):java.lang.Object");
    }
}
