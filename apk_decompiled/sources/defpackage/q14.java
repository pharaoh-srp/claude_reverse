package defpackage;

import com.anthropic.claude.code.remote.i;

/* JADX INFO: loaded from: classes2.dex */
public final class q14 extends xzg implements rz7 {
    public lp7 E;
    public int F;
    public /* synthetic */ lp7 G;
    public /* synthetic */ Object H;
    public final /* synthetic */ i I;
    public String J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q14(tp4 tp4Var, i iVar) {
        super(3, tp4Var);
        this.I = iVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        q14 q14Var = new q14((tp4) obj3, this.I);
        q14Var.G = (lp7) obj;
        q14Var.H = obj2;
        return q14Var.invokeSuspend(iei.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082 A[RETURN] */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            com.anthropic.claude.code.remote.i r0 = r9.I
            psf r0 = r0.z
            lp7 r1 = r9.G
            java.lang.Object r2 = r9.H
            int r3 = r9.F
            iei r4 = defpackage.iei.a
            r5 = 2
            r6 = 1
            r7 = 0
            m45 r8 = defpackage.m45.E
            if (r3 == 0) goto L29
            if (r3 == r6) goto L21
            if (r3 != r5) goto L1b
            defpackage.sf5.h0(r10)
            return r4
        L1b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r9)
            return r7
        L21:
            java.lang.String r1 = r9.J
            lp7 r2 = r9.E
            defpackage.sf5.h0(r10)
            goto L5a
        L29:
            defpackage.sf5.h0(r10)
            com.anthropic.claude.types.strings.SessionId r2 = (com.anthropic.claude.types.strings.SessionId) r2
            if (r2 == 0) goto L35
            java.lang.String r10 = r2.m1120unboximpl()
            goto L36
        L35:
            r10 = r7
        L36:
            if (r10 == 0) goto L66
            r9.G = r7
            r9.H = r7
            r9.E = r1
            r9.J = r10
            r9.F = r6
            h86 r2 = r0.b
            e45 r2 = r2.b()
            lsf r3 = new lsf
            r3.<init>(r0, r10, r7, r6)
            java.lang.Object r2 = defpackage.gb9.c0(r2, r3, r9)
            if (r2 != r8) goto L54
            goto L55
        L54:
            r2 = r4
        L55:
            if (r2 != r8) goto L58
            goto L81
        L58:
            r2 = r1
            r1 = r10
        L5a:
            r0.getClass()
            r1.getClass()
            amg r10 = r0.c(r1)
            r1 = r2
            goto L71
        L66:
            qsf r10 = new qsf
            r10.<init>()
            pj4 r0 = new pj4
            r0.<init>(r6, r10)
            r10 = r0
        L71:
            r9.G = r7
            r9.H = r7
            r9.E = r7
            r9.J = r7
            r9.F = r5
            java.lang.Object r9 = defpackage.j8.D(r1, r10, r9)
            if (r9 != r8) goto L82
        L81:
            return r8
        L82:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q14.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
