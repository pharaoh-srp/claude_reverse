package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class co1 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;

    public co1(v77 v77Var, r77 r77Var, g1h g1hVar, int i, int i2, int i3, int i4) {
        this.a = v77Var;
        this.c = r77Var;
        this.d = g1hVar;
        this.e = new jqh();
        this.f = g1hVar.a(v77Var.t, new gba(1, this));
        this.g = new vtg(this, i);
        this.h = new wtg(this, i2);
        this.i = new xtg(this, i3);
        this.j = new ytg(this, i4);
        utg utgVar = new utg(this);
        this.b = utgVar;
        v77Var.m.a(utgVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.co1 r7, java.lang.String r8, java.lang.String r9, defpackage.vp4 r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof defpackage.bo1
            if (r0 == 0) goto L16
            r0 = r10
            bo1 r0 = (defpackage.bo1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.G = r1
            goto L1b
        L16:
            bo1 r0 = new bo1
            r0.<init>(r7, r10)
        L1b:
            java.lang.Object r10 = r0.E
            int r1 = r0.G
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L29
            defpackage.sf5.h0(r10)
            goto L5a
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r3
        L2f:
            defpackage.sf5.h0(r10)
            java.lang.Object r10 = r7.c
            dl2 r10 = (defpackage.dl2) r10
            java.lang.Object r1 = r7.b
            koi r1 = (defpackage.koi) r1
            java.lang.String r1 = r1.e
            java.lang.Object r7 = r7.a
            java.lang.String r7 = (java.lang.String) r7
            com.anthropic.claude.api.chat.RecordToolResultRequest r4 = new com.anthropic.claude.api.chat.RecordToolResultRequest
            com.anthropic.claude.api.chat.tool.ToolResultText r5 = new com.anthropic.claude.api.chat.tool.ToolResultText
            r6 = 2
            r5.<init>(r9, r3, r6, r3)
            java.util.List r9 = defpackage.x44.W(r5)
            r4.<init>(r8, r9, r2, r3)
            r0.G = r2
            java.lang.Object r10 = r10.s(r1, r7, r4, r0)
            m45 r7 = defpackage.m45.E
            if (r10 != r7) goto L5a
            return r7
        L5a:
            com.anthropic.claude.api.result.ApiResult r10 = (com.anthropic.claude.api.result.ApiResult) r10
            boolean r7 = r10 instanceof defpackage.of0
            if (r7 != 0) goto L7b
            boolean r7 = r10 instanceof defpackage.nf0
            if (r7 == 0) goto L77
            nf0 r10 = (defpackage.nf0) r10
            com.anthropic.claude.core.telemetry.SilentException r7 = new com.anthropic.claude.core.telemetry.SilentException
            java.lang.String r8 = "Failed to send tool denial result"
            java.lang.Throwable r9 = defpackage.hsk.h(r10)
            r7.<init>(r8, r9)
            r8 = 0
            r9 = 3
            com.anthropic.claude.core.telemetry.SilentException.a(r7, r3, r8, r9)
            goto L7b
        L77:
            defpackage.wg6.i()
            return r3
        L7b:
            iei r7 = defpackage.iei.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.co1.a(co1, java.lang.String, java.lang.String, vp4):java.lang.Object");
    }

    public void b(String str) {
        amg amgVar = (amg) this.g;
        ovh ovhVar = (ovh) amgVar.getValue();
        if (ovhVar == null) {
            return;
        }
        amgVar.m(null);
        c(false);
        gb9.D((l45) this.f, null, null, new ao1(this, ovhVar, str, null, 1), 3);
    }

    public void c(boolean z) {
        amg amgVar = (amg) this.h;
        Boolean boolValueOf = Boolean.valueOf(z);
        amgVar.getClass();
        amgVar.n(null, boolValueOf);
    }

    public co1(String str, koi koiVar, dl2 dl2Var, myh myhVar, qi3 qi3Var, mp4 mp4Var) {
        str.getClass();
        mp4Var.getClass();
        this.a = str;
        this.b = koiVar;
        this.c = dl2Var;
        this.d = myhVar;
        this.e = qi3Var;
        this.f = mp4Var;
        amg amgVarA = bmg.a(null);
        this.g = amgVarA;
        this.i = j8.k(amgVarA);
        amg amgVarA2 = bmg.a(Boolean.FALSE);
        this.h = amgVarA2;
        this.j = j8.k(amgVarA2);
    }
}
