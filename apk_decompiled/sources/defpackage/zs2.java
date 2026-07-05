package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zs2 {
    public final cve a;
    public final nyj b;

    public zs2(cve cveVar) {
        this.a = cveVar;
        int i = 2;
        this.b = new nyj(new u52(i, this), 26, new v52(i, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(defpackage.zs2 r6, defpackage.ft2 r7, java.util.ArrayList r8, defpackage.vp4 r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof defpackage.xs2
            if (r0 == 0) goto L13
            r0 = r9
            xs2 r0 = (defpackage.xs2) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            xs2 r0 = new xs2
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.G
            int r1 = r0.I
            r2 = 2
            r3 = 1
            r4 = 0
            m45 r5 = defpackage.m45.E
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.sf5.h0(r9)
            return r9
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r4
        L31:
            java.util.ArrayList r8 = r0.F
            zs2 r6 = r0.E
            defpackage.sf5.h0(r9)
            goto L56
        L39:
            defpackage.sf5.h0(r9)
            r0.E = r6
            r0.F = r8
            r0.I = r3
            cve r9 = r6.a
            ys2 r1 = new ys2
            r1.<init>(r6, r7, r3)
            r7 = 0
            java.lang.Object r7 = defpackage.u00.G(r0, r9, r7, r3, r1)
            if (r7 != r5) goto L51
            goto L53
        L51:
            iei r7 = defpackage.iei.a
        L53:
            if (r7 != r5) goto L56
            goto L62
        L56:
            r0.E = r4
            r0.F = r4
            r0.I = r2
            java.lang.Object r6 = r6.b(r8, r0)
            if (r6 != r5) goto L63
        L62:
            return r5
        L63:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zs2.a(zs2, ft2, java.util.ArrayList, vp4):java.lang.Object");
    }

    public final Object b(List list, vp4 vp4Var) throws Throwable {
        Object objG = u00.G(vp4Var, this.a, false, true, new o5(this, 7, list));
        return objG == m45.E ? objG : iei.a;
    }
}
