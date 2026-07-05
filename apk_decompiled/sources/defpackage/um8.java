package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class um8 {
    public static final cm4 e = new cm4();
    public static String f;
    public static String g;
    public final re9 a;
    public final ne9 b;
    public final h86 c;
    public final AtomicBoolean d = new AtomicBoolean(false);

    public um8(re9 re9Var, ne9 ne9Var, h86 h86Var) {
        this.a = re9Var;
        this.b = ne9Var;
        this.c = h86Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.um8 r7, java.lang.String r8, java.lang.String r9, defpackage.vp4 r10) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.d
            boolean r1 = r10 instanceof defpackage.sm8
            if (r1 == 0) goto L15
            r1 = r10
            sm8 r1 = (defpackage.sm8) r1
            int r2 = r1.G
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.G = r2
            goto L1a
        L15:
            sm8 r1 = new sm8
            r1.<init>(r7, r10)
        L1a:
            java.lang.Object r10 = r1.E
            int r2 = r1.G
            r3 = 24
            ozf r4 = defpackage.ozf.F
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L36
            if (r2 != r5) goto L30
            defpackage.sf5.h0(r10)     // Catch: java.lang.Throwable -> L2c androidx.javascriptengine.IsolateTerminatedException -> L2e java.util.concurrent.CancellationException -> L65
            goto L4b
        L2c:
            r7 = move-exception
            goto L4e
        L2e:
            r7 = move-exception
            goto L56
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r6
        L36:
            defpackage.sf5.h0(r10)
            boolean r10 = r0.get()
            if (r10 == 0) goto L40
            goto L64
        L40:
            r1.G = r5     // Catch: java.lang.Throwable -> L2c androidx.javascriptengine.IsolateTerminatedException -> L2e java.util.concurrent.CancellationException -> L65
            java.lang.Object r10 = r7.c(r8, r9, r1)     // Catch: java.lang.Throwable -> L2c androidx.javascriptengine.IsolateTerminatedException -> L2e java.util.concurrent.CancellationException -> L65
            m45 r7 = defpackage.m45.E
            if (r10 != r7) goto L4b
            return r7
        L4b:
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L2c androidx.javascriptengine.IsolateTerminatedException -> L2e java.util.concurrent.CancellationException -> L65
            return r10
        L4e:
            java.util.List r8 = defpackage.xah.a
            java.lang.String r8 = "Highlight evaluation failed"
            defpackage.xah.f(r7, r8, r4, r6, r3)
            goto L64
        L56:
            r8 = 0
            boolean r8 = r0.compareAndSet(r8, r5)
            if (r8 == 0) goto L64
            java.util.List r8 = defpackage.xah.a
            java.lang.String r8 = "Highlight sandbox/isolate terminated"
            defpackage.xah.f(r7, r8, r4, r6, r3)
        L64:
            return r6
        L65:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.um8.a(um8, java.lang.String, java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannableString[] e(java.util.List r16, java.lang.String r17, java.lang.String r18, defpackage.om8 r19) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.um8.e(java.util.List, java.lang.String, java.lang.String, om8):android.text.SpannableString[]");
    }

    public final void b() {
        ozf ozfVar = ozf.F;
        this.d.set(true);
        try {
            this.b.close();
        } catch (Throwable th) {
            List list = xah.a;
            xah.f(th, "Highlighter isolate.close() failed", ozfVar, null, 24);
        }
        try {
            this.a.close();
        } catch (Throwable th2) {
            List list2 = xah.a;
            xah.f(th2, "Highlighter sandbox.close() failed", ozfVar, null, 24);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r5, java.lang.String r6, defpackage.vp4 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.rm8
            if (r0 == 0) goto L13
            r0 = r7
            rm8 r0 = (defpackage.rm8) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            rm8 r0 = new rm8
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.E
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.sf5.h0(r7)
            goto L55
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.sf5.h0(r7)
            java.lang.String r5 = org.json.JSONObject.quote(r5)
            java.lang.String r6 = org.json.JSONObject.quote(r6)
            java.lang.String r7 = ", "
            java.lang.String r1 = ")"
            java.lang.String r3 = "highlightTokens("
            java.lang.String r5 = defpackage.ij0.l(r3, r5, r7, r6, r1)
            ne9 r4 = r4.b
            saa r4 = r4.e(r5)
            r4.getClass()
            r0.G = r2
            java.lang.Object r7 = defpackage.uwj.c(r4, r0)
            m45 r4 = defpackage.m45.E
            if (r7 != r4) goto L55
            return r4
        L55:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.um8.c(java.lang.String, java.lang.String, vp4):java.lang.Object");
    }

    public final boolean d() {
        return this.d.get();
    }
}
