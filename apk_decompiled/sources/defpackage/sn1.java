package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sn1 implements lp7 {
    public final /* synthetic */ zv5 E;
    public final /* synthetic */ tn1 F;

    public sn1(zv5 zv5Var, tn1 tn1Var) {
        this.E = zv5Var;
        this.F = tn1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if (r1 == r5) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.lp7
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.anthropic.claude.bell.api.BellApiData r8, defpackage.tp4 r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.rn1
            if (r0 == 0) goto L13
            r0 = r9
            rn1 r0 = (defpackage.rn1) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            rn1 r0 = new rn1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.G
            int r1 = r0.I
            r2 = 0
            r3 = 2
            r4 = 1
            m45 r5 = defpackage.m45.E
            if (r1 == 0) goto L3d
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.sf5.h0(r9)
            return r9
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r2
        L31:
            int r8 = r0.F
            com.anthropic.claude.bell.api.BellApiData r1 = r0.E
            defpackage.sf5.h0(r9)
            r6 = r9
            r9 = r8
            r8 = r1
            r1 = r6
            goto L63
        L3d:
            defpackage.sf5.h0(r9)
            boolean r9 = r8 instanceof com.anthropic.claude.bell.api.BellApiData.MessageData
            if (r9 == 0) goto L51
            r9 = r8
            com.anthropic.claude.bell.api.BellApiData$MessageData r9 = (com.anthropic.claude.bell.api.BellApiData.MessageData) r9
            com.anthropic.claude.bell.api.BellApiServerMessage r9 = r9.getMessage()
            boolean r9 = r9 instanceof com.anthropic.claude.bell.api.BellApiServerMessage.SessionServerInitialized
            if (r9 == 0) goto L51
            r9 = r4
            goto L52
        L51:
            r9 = 0
        L52:
            if (r9 == 0) goto L6e
            r0.E = r8
            r0.F = r9
            r0.I = r4
            zv5 r1 = r7.E
            java.lang.Object r1 = r1.w(r0)
            if (r1 != r5) goto L63
            goto L7e
        L63:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L6e
            iei r7 = defpackage.iei.a
            return r7
        L6e:
            tn1 r7 = r7.F
            dn1 r7 = r7.z
            r0.E = r2
            r0.F = r9
            r0.I = r3
            java.lang.Object r7 = r7.a(r8, r0)
            if (r7 != r5) goto L7f
        L7e:
            return r5
        L7f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sn1.g(com.anthropic.claude.bell.api.BellApiData, tp4):java.lang.Object");
    }
}
