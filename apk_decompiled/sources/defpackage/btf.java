package defpackage;

import androidx.glance.session.SessionWorker;

/* JADX INFO: loaded from: classes2.dex */
public final class btf implements wsf {
    public final Class a;
    public final qte b;
    public final zl4 c;
    public final jxb d;
    public final atf e;

    public btf() {
        qte qteVar = new qte((byte) 0, 11);
        this.a = SessionWorker.class;
        this.b = qteVar;
        this.c = fgj.a;
        this.d = new jxb();
        this.e = new atf(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.pz7 r8, defpackage.vp4 r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.xsf
            if (r0 == 0) goto L13
            r0 = r9
            xsf r0 = (defpackage.xsf) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            xsf r0 = new xsf
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.G
            int r1 = r0.I
            r2 = 2
            r3 = 1
            r4 = 0
            m45 r5 = defpackage.m45.E
            if (r1 == 0) goto L41
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            java.lang.Object r7 = r0.E
            hxb r7 = (defpackage.hxb) r7
            defpackage.sf5.h0(r9)     // Catch: java.lang.Throwable -> L2f
            goto L65
        L2f:
            r8 = move-exception
            goto L6d
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r4
        L37:
            jxb r8 = r0.F
            java.lang.Object r1 = r0.E
            pz7 r1 = (defpackage.pz7) r1
            defpackage.sf5.h0(r9)
            goto L55
        L41:
            defpackage.sf5.h0(r9)
            r0.E = r8
            jxb r9 = r7.d
            r0.F = r9
            r0.I = r3
            java.lang.Object r1 = r9.c(r0)
            if (r1 != r5) goto L53
            goto L63
        L53:
            r1 = r8
            r8 = r9
        L55:
            atf r7 = r7.e     // Catch: java.lang.Throwable -> L69
            r0.E = r8     // Catch: java.lang.Throwable -> L69
            r0.F = r4     // Catch: java.lang.Throwable -> L69
            r0.I = r2     // Catch: java.lang.Throwable -> L69
            java.lang.Object r9 = r1.invoke(r7, r0)     // Catch: java.lang.Throwable -> L69
            if (r9 != r5) goto L64
        L63:
            return r5
        L64:
            r7 = r8
        L65:
            r7.d(r4)
            return r9
        L69:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L6d:
            r7.d(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btf.a(pz7, vp4):java.lang.Object");
    }
}
