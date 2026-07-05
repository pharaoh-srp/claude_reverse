package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ybg {
    public final jxb a = new jxb();
    public final lsc b = mpk.P(null);

    public static Object b(ybg ybgVar, String str, String str2, tp4 tp4Var, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        int i2 = i & 8;
        tbg tbgVar = tbg.G;
        if (i2 != 0 && str2 == null) {
            tbgVar = tbg.E;
        }
        ybgVar.getClass();
        return ybgVar.a(new wbg(str, str2, false, tbgVar), tp4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        if (r9 == r6) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0, types: [ybg] */
    /* JADX WARN: Type inference failed for: r7v1, types: [hxb] */
    /* JADX WARN: Type inference failed for: r7v4, types: [hxb] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcg r8, defpackage.tp4 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.xbg
            if (r0 == 0) goto L13
            r0 = r9
            xbg r0 = (defpackage.xbg) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            xbg r0 = new xbg
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.G
            int r1 = r0.I
            lsc r2 = r7.b
            r3 = 2
            r4 = 1
            r5 = 0
            m45 r6 = defpackage.m45.E
            if (r1 == 0) goto L3f
            if (r1 == r4) goto L37
            if (r1 != r3) goto L31
            hxb r7 = r0.F
            defpackage.sf5.h0(r9)     // Catch: java.lang.Throwable -> L2f
            goto L72
        L2f:
            r8 = move-exception
            goto L7b
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r5
        L37:
            hxb r7 = r0.F
            fcg r8 = r0.E
            defpackage.sf5.h0(r9)
            goto L51
        L3f:
            defpackage.sf5.h0(r9)
            r0.E = r8
            jxb r7 = r7.a
            r0.F = r7
            r0.I = r4
            java.lang.Object r9 = r7.c(r0)
            if (r9 != r6) goto L51
            goto L71
        L51:
            r0.E = r8     // Catch: java.lang.Throwable -> L2f
            r0.F = r7     // Catch: java.lang.Throwable -> L2f
            r0.I = r3     // Catch: java.lang.Throwable -> L2f
            ua2 r9 = new ua2     // Catch: java.lang.Throwable -> L2f
            tp4 r0 = defpackage.zni.I(r0)     // Catch: java.lang.Throwable -> L2f
            r9.<init>(r4, r0)     // Catch: java.lang.Throwable -> L2f
            r9.t()     // Catch: java.lang.Throwable -> L2f
            vbg r0 = new vbg     // Catch: java.lang.Throwable -> L2f
            r0.<init>(r8, r9)     // Catch: java.lang.Throwable -> L2f
            r2.setValue(r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r9 = r9.r()     // Catch: java.lang.Throwable -> L2f
            if (r9 != r6) goto L72
        L71:
            return r6
        L72:
            r2.setValue(r5)     // Catch: java.lang.Throwable -> L79
            r7.d(r5)
            return r9
        L79:
            r8 = move-exception
            goto L7f
        L7b:
            r2.setValue(r5)     // Catch: java.lang.Throwable -> L79
            throw r8     // Catch: java.lang.Throwable -> L79
        L7f:
            r7.d(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ybg.a(fcg, tp4):java.lang.Object");
    }
}
