package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public interface ms {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    default defpackage.cpc a(defpackage.hs r5) {
        /*
            r4 = this;
            r5.getClass()
            vr r0 = r4.b()
            r0.getClass()
            tr r1 = r0.a
            boolean r2 = r1 instanceof defpackage.sr
            r3 = 0
            if (r2 == 0) goto L26
            java.util.Map r5 = r5.a
            java.lang.String r0 = r0.a()
            java.lang.Object r5 = r5.get(r0)
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 == 0) goto L24
            java.lang.Object r5 = r1.invoke(r5)
            goto L3c
        L24:
            r5 = r3
            goto L3c
        L26:
            boolean r2 = r1 instanceof defpackage.rr
            if (r2 == 0) goto L4a
            java.util.Map r5 = r5.b
            java.lang.String r0 = r0.a()
            java.lang.Object r5 = r5.get(r0)
            java.lang.Double r5 = (java.lang.Double) r5
            if (r5 == 0) goto L24
            java.lang.Object r5 = r1.invoke(r5)
        L3c:
            if (r5 == 0) goto L49
            bz7 r4 = r4.c()
            java.lang.Object r4 = r4.invoke(r5)
            cpc r4 = (defpackage.cpc) r4
            return r4
        L49:
            return r3
        L4a:
            defpackage.wg6.i()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ms.a(hs):cpc");
    }

    vr b();

    bz7 c();
}
