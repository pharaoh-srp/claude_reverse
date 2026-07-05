package defpackage;

import com.anthropic.claude.api.chat.InputMode;
import com.anthropic.claude.configs.flags.SendRetryConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class l53 extends xzg implements sz7 {
    public int E;
    public /* synthetic */ Throwable F;
    public /* synthetic */ long G;
    public final /* synthetic */ t53 H;
    public final /* synthetic */ m02 I;
    public final /* synthetic */ InputMode J;
    public final /* synthetic */ z9e K;
    public final /* synthetic */ SendRetryConfig L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l53(t53 t53Var, m02 m02Var, InputMode inputMode, z9e z9eVar, SendRetryConfig sendRetryConfig, tp4 tp4Var) {
        super(4, tp4Var);
        this.H = t53Var;
        this.I = m02Var;
        this.J = inputMode;
        this.K = z9eVar;
        this.L = sendRetryConfig;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        z9e z9eVar = this.K;
        SendRetryConfig sendRetryConfig = this.L;
        l53 l53Var = new l53(this.H, this.I, this.J, z9eVar, sendRetryConfig, (tp4) obj4);
        l53Var.F = (Throwable) obj2;
        l53Var.G = jLongValue;
        return l53Var.invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        if (r12 == r10) goto L25;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Throwable r0 = r11.F
            long r1 = r11.G
            int r3 = r11.E
            r4 = 0
            m02 r5 = r11.I
            t53 r6 = r11.H
            r7 = 2
            r8 = 0
            r9 = 1
            m45 r10 = defpackage.m45.E
            if (r3 == 0) goto L24
            if (r3 == r9) goto L20
            if (r3 != r7) goto L1a
            defpackage.sf5.h0(r12)
            goto L62
        L1a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r11)
            return r4
        L20:
            defpackage.sf5.h0(r12)
            goto L3d
        L24:
            defpackage.sf5.h0(r12)
            com.anthropic.claude.api.chat.InputMode r12 = r11.J
            com.anthropic.claude.api.chat.InputMode r3 = com.anthropic.claude.api.chat.InputMode.VOICE
            if (r12 != r3) goto L2f
            r12 = r9
            goto L30
        L2f:
            r12 = r8
        L30:
            r11.F = r0
            r11.G = r1
            r11.E = r9
            java.lang.Object r12 = defpackage.t53.i0(r6, r0, r5, r12, r11)
            if (r12 != r10) goto L3d
            goto L61
        L3d:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            z9e r3 = r11.K
            if (r12 == 0) goto L4b
            r3.E = r8
        L49:
            r8 = r9
            goto L6b
        L4b:
            int r12 = (int) r1
            int r5 = r5.a
            int r12 = r12 - r5
            boolean r3 = r3.E
            if (r3 != 0) goto L6b
            r11.F = r4
            r11.G = r1
            r11.E = r7
            com.anthropic.claude.configs.flags.SendRetryConfig r1 = r11.L
            java.lang.Object r12 = defpackage.t53.j0(r6, r0, r12, r1, r11)
            if (r12 != r10) goto L62
        L61:
            return r10
        L62:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r11 = r12.booleanValue()
            if (r11 == 0) goto L6b
            goto L49
        L6b:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r8)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l53.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
