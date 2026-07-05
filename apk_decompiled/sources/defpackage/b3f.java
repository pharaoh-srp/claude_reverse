package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b3f implements kp7, wa2 {
    public final pz7 E;

    public b3f(pz7 pz7Var) {
        this.E = pz7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.kp7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.lp7 r5, defpackage.tp4 r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.i1
            if (r0 == 0) goto L13
            r0 = r6
            i1 r0 = (defpackage.i1) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            i1 r0 = new i1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.F
            int r1 = r0.H
            iei r2 = defpackage.iei.a
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2b
            x2f r4 = r0.E
            defpackage.sf5.h0(r6)     // Catch: java.lang.Throwable -> L29
            goto L52
        L29:
            r5 = move-exception
            goto L5c
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L32:
            defpackage.sf5.h0(r6)
            x2f r6 = new x2f
            c45 r1 = r0.getContext()
            r6.<init>(r5, r1)
            r0.E = r6     // Catch: java.lang.Throwable -> L5a
            r0.H = r3     // Catch: java.lang.Throwable -> L5a
            pz7 r4 = r4.E     // Catch: java.lang.Throwable -> L56
            java.lang.Object r4 = r4.invoke(r6, r0)     // Catch: java.lang.Throwable -> L56
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L4d
            goto L4e
        L4d:
            r4 = r2
        L4e:
            if (r4 != r5) goto L51
            return r5
        L51:
            r4 = r6
        L52:
            r4.releaseIntercepted()
            return r2
        L56:
            r4 = move-exception
            r5 = r4
        L58:
            r4 = r6
            goto L5c
        L5a:
            r5 = move-exception
            goto L58
        L5c:
            r4.releaseIntercepted()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b3f.a(lp7, tp4):java.lang.Object");
    }
}
