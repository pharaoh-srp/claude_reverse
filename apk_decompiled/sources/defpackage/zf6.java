package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zf6 {
    public static final oqb c;
    public static final xbd d;
    public final tbd a;
    public final aj0 b;

    static {
        xg5 xg5Var = new xg5(12);
        oqb oqbVar = new oqb();
        xg5Var.invoke(oqbVar);
        c = oqbVar;
        d = new xbd("drawer_tab_preferences");
    }

    public zf6(v4d v4dVar) {
        tbd tbdVarA = v4dVar.a("drawer_tab_preferences");
        this.a = tbdVarA;
        this.b = new aj0(3, new yp7(tbdVarA.a.getData(), new vf6(3, null), 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.uf6 r5, defpackage.vp4 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.wf6
            if (r0 == 0) goto L13
            r0 = r6
            wf6 r0 = (defpackage.wf6) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            wf6 r0 = new wf6
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.sf5.h0(r6)
            goto L48
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L2c:
            defpackage.sf5.h0(r6)
            com.anthropic.claude.home.c r6 = new com.anthropic.claude.home.c
            r6.<init>(r5, r2)
            r0.G = r3
            cx r5 = new cx
            r1 = 27
            r5.<init>(r6, r2, r1)
            tbd r4 = r4.a
            java.lang.Object r4 = r4.a(r5, r0)
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L48
            return r5
        L48:
            iei r4 = defpackage.iei.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zf6.a(uf6, vp4):java.lang.Object");
    }
}
