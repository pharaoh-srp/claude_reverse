package defpackage;

import com.anthropic.claude.api.wiggle.PrepareUploadResult;

/* JADX INFO: loaded from: classes2.dex */
public final class ak7 extends xzg implements bz7 {
    public int E;
    public final /* synthetic */ PrepareUploadResult F;
    public final /* synthetic */ ck7 G;
    public final /* synthetic */ dk7 H;
    public final /* synthetic */ gub I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ String K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak7(PrepareUploadResult prepareUploadResult, ck7 ck7Var, dk7 dk7Var, gub gubVar, boolean z, String str, tp4 tp4Var) {
        super(1, tp4Var);
        this.F = prepareUploadResult;
        this.G = ck7Var;
        this.H = dk7Var;
        this.I = gubVar;
        this.J = z;
        this.K = str;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        return new ak7(this.F, this.G, this.H, this.I, this.J, this.K, tp4Var);
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        return ((ak7) create((tp4) obj)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (r8 == r2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (r8 == r2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        if (r8 == r2) goto L28;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            ck7 r0 = r7.G
            java.lang.String r1 = r0.d
            int r2 = r7.E
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L24
            if (r2 == r5) goto L20
            if (r2 == r4) goto L1c
            if (r2 != r3) goto L15
            defpackage.sf5.h0(r8)
            goto L5c
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            r7 = 0
            return r7
        L1c:
            defpackage.sf5.h0(r8)
            goto L4e
        L20:
            defpackage.sf5.h0(r8)
            goto L3a
        L24:
            defpackage.sf5.h0(r8)
            gub r8 = r7.I
            m45 r2 = defpackage.m45.E
            com.anthropic.claude.api.wiggle.PrepareUploadResult r6 = r7.F
            if (r6 == 0) goto L3d
            r7.E = r5
            dk7 r1 = r7.H
            java.lang.Object r8 = defpackage.ck7.a(r0, r6, r1, r8, r7)
            if (r8 != r2) goto L3a
            goto L5b
        L3a:
            com.anthropic.claude.api.result.ApiResult r8 = (com.anthropic.claude.api.result.ApiResult) r8
            return r8
        L3d:
            boolean r5 = r7.J
            if (r5 == 0) goto L51
            haj r0 = r0.b
            r7.E = r4
            java.lang.String r3 = r7.K
            java.lang.Object r8 = r0.c(r1, r3, r8, r7)
            if (r8 != r2) goto L4e
            goto L5b
        L4e:
            com.anthropic.claude.api.result.ApiResult r8 = (com.anthropic.claude.api.result.ApiResult) r8
            return r8
        L51:
            dl2 r0 = r0.a
            r7.E = r3
            java.lang.Object r8 = r0.A(r1, r8, r7)
            if (r8 != r2) goto L5c
        L5b:
            return r2
        L5c:
            com.anthropic.claude.api.result.ApiResult r8 = (com.anthropic.claude.api.result.ApiResult) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ak7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
