package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bcb {
    public final kab a;
    public final koi b;

    public bcb(kab kabVar, koi koiVar) {
        this.a = kabVar;
        this.b = koiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.vp4 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.acb
            if (r0 == 0) goto L13
            r0 = r5
            acb r0 = (defpackage.acb) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            acb r0 = new acb
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.sf5.h0(r5)
            goto L40
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L2c:
            defpackage.sf5.h0(r5)
            koi r5 = r4.b
            java.lang.String r5 = r5.e
            r0.G = r3
            kab r4 = r4.a
            java.lang.Object r5 = r4.c(r5, r0)
            m45 r4 = defpackage.m45.E
            if (r5 != r4) goto L40
            return r4
        L40:
            com.anthropic.claude.api.result.ApiResult r5 = (com.anthropic.claude.api.result.ApiResult) r5
            boolean r4 = r5 instanceof defpackage.of0
            if (r4 != 0) goto L6c
            boolean r4 = r5 instanceof defpackage.nf0
            if (r4 == 0) goto L68
            r4 = r5
            nf0 r4 = (defpackage.nf0) r4
            java.util.List r0 = defpackage.xah.a
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to reset memory: "
            r1.<init>(r3)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            r4 = 30
            defpackage.xah.f(r0, r2, r2, r2, r4)
            return r5
        L68:
            defpackage.mr9.b()
            return r2
        L6c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcb.a(vp4):java.lang.Object");
    }
}
