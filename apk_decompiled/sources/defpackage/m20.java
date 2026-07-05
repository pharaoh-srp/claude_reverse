package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class m20 {
    public final Context a;

    public m20(Context context, int i) {
        switch (i) {
            case 1:
                dgj.v(context);
                Context applicationContext = context.getApplicationContext();
                dgj.v(applicationContext);
                this.a = applicationContext;
                break;
            default:
                this.a = context.getApplicationContext();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.k20 r5, defpackage.vp4 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.l20
            if (r0 == 0) goto L13
            r0 = r6
            l20 r0 = (defpackage.l20) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            l20 r0 = new l20
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            r4 = 2
            if (r1 == r4) goto L2b
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L2b:
            defpackage.sf5.h0(r6)
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6
            throw r2
        L31:
            defpackage.sf5.h0(r6)
            return r6
        L35:
            defpackage.sf5.h0(r6)
            boolean r6 = r5 instanceof defpackage.k20
            if (r6 == 0) goto L4c
            j20 r6 = r5.b
            r0.G = r3
            android.content.Context r4 = r4.a
            java.lang.Object r4 = r6.e(r4, r5)
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L4b
            return r5
        L4b:
            return r4
        L4c:
            java.lang.String r4 = "Unknown font type: "
            defpackage.xh6.k(r4, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m20.a(k20, vp4):java.lang.Object");
    }
}
