package defpackage;

import com.anthropic.claude.api.chat.ChatCompletionRequest;

/* JADX INFO: loaded from: classes.dex */
public final class nm2 {
    public final dl2 a;
    public final qs2 b;
    public final sm2 c;
    public final iib d;
    public final loi e;
    public final mn5 f;

    public nm2(dl2 dl2Var, qs2 qs2Var, sm2 sm2Var, iib iibVar, loi loiVar, mn5 mn5Var) {
        this.a = dl2Var;
        this.b = qs2Var;
        this.c = sm2Var;
        this.d = iibVar;
        this.e = loiVar;
        this.f = mn5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.nm2 r25, defpackage.iib r26, java.lang.String r27, com.anthropic.claude.api.chat.ChatCompletionRequest r28, defpackage.im2 r29, java.lang.String r30, int r31, java.lang.String r32, boolean r33, defpackage.vp4 r34) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nm2.a(nm2, iib, java.lang.String, com.anthropic.claude.api.chat.ChatCompletionRequest, im2, java.lang.String, int, java.lang.String, boolean, vp4):java.lang.Object");
    }

    public final yp7 b(ChatCompletionRequest chatCompletionRequest, String str, String str2, int i, String str3, boolean z, a33 a33Var, nn nnVar, bo boVar, bo boVar2, ei eiVar, d7 d7Var) {
        str.getClass();
        str2.getClass();
        boolean zO = this.b.a.o("claude_ai_clients_completions_use_bard");
        dl2 dl2Var = this.a;
        u82<iei> u82VarM = (z && zO) ? dl2Var.m(str, str2, chatCompletionRequest) : z ? dl2Var.x(str, str2, chatCompletionRequest) : zO ? dl2Var.w(str, str2, chatCompletionRequest) : dl2Var.D(str, str2, chatCompletionRequest);
        dae daeVar = new dae();
        kie kieVarL0 = u82VarM.l0();
        kieVarL0.getClass();
        sm2 sm2Var = this.c;
        return new yp7(new gq7(j8.K(j8.l(j8.q(new zo(sm2Var, kieVarL0, d7Var, a33Var, nnVar, boVar, boVar2, eiVar, (tp4) null)), Integer.MAX_VALUE, py1.E), sm2Var.a.b()), new jm2(daeVar, null, 0), 2), new lm2(daeVar, this, str2, chatCompletionRequest, i, str3, z, null), 0);
    }
}
