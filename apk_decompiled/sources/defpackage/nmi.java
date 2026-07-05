package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class nmi {
    public final ArrayList a = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.vp4 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.mmi
            if (r0 == 0) goto L13
            r0 = r5
            mmi r0 = (defpackage.mmi) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            mmi r0 = new mmi
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.F
            int r1 = r0.H
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            java.util.Iterator r4 = r0.E
            defpackage.sf5.h0(r5)
            goto L40
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.sf5.h0(r5)
            java.util.ArrayList r4 = r4.a
            java.util.List r5 = defpackage.w44.p1(r4)
            r4.clear()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r4 = r5.iterator()
        L40:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L59
            java.lang.Object r5 = r4.next()
            nmi r5 = (defpackage.nmi) r5
            r0.E = r4
            r0.H = r2
            java.lang.Object r5 = r5.a(r0)
            m45 r1 = defpackage.m45.E
            if (r5 != r1) goto L40
            return r1
        L59:
            iei r4 = defpackage.iei.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nmi.a(vp4):java.lang.Object");
    }
}
