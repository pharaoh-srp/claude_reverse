package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class xm8 {
    public final fn0 a;
    public final h86 b;
    public final Context c;
    public final jxb d = new jxb();
    public zv5 e;
    public int f;
    public boolean g;

    public xm8(Context context, fn0 fn0Var, h86 h86Var) {
        this.a = fn0Var;
        this.b = h86Var;
        this.c = context.getApplicationContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.xm8 r4, defpackage.vp4 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.vm8
            if (r0 == 0) goto L13
            r0 = r5
            vm8 r0 = (defpackage.vm8) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            vm8 r0 = new vm8
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.E
            int r1 = r0.G
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            defpackage.sf5.h0(r5)     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L53 java.util.concurrent.CancellationException -> L54
            goto L45
        L26:
            r4 = move-exception
            goto L48
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r3
        L2e:
            defpackage.sf5.h0(r5)
            cm4 r5 = defpackage.um8.e     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L53 java.lang.Throwable -> L53 java.util.concurrent.CancellationException -> L54
            android.content.Context r1 = r4.c     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L53 java.lang.Throwable -> L53 java.util.concurrent.CancellationException -> L54
            r1.getClass()     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L53 java.lang.Throwable -> L53 java.util.concurrent.CancellationException -> L54
            h86 r4 = r4.b     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L53 java.lang.Throwable -> L53 java.util.concurrent.CancellationException -> L54
            r0.G = r2     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L53 java.lang.Throwable -> L53 java.util.concurrent.CancellationException -> L54
            java.lang.Object r5 = r5.a(r1, r4, r0)     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L53 java.lang.Throwable -> L53 java.util.concurrent.CancellationException -> L54
            m45 r4 = defpackage.m45.E
            if (r5 != r4) goto L45
            return r4
        L45:
            um8 r5 = (defpackage.um8) r5     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L53 java.lang.Throwable -> L53 java.util.concurrent.CancellationException -> L54
            return r5
        L48:
            java.util.List r5 = defpackage.xah.a
            ozf r5 = defpackage.ozf.F
            r0 = 24
            java.lang.String r1 = "Highlighter creation failed"
            defpackage.xah.f(r4, r1, r5, r3, r0)
        L53:
            return r3
        L54:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xm8.a(xm8, vp4):java.lang.Object");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.vp4 r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.wm8
            if (r0 == 0) goto L13
            r0 = r10
            wm8 r0 = (defpackage.wm8) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            wm8 r0 = new wm8
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.F
            int r1 = r0.H
            r2 = 2
            r3 = 1
            r4 = 0
            m45 r5 = defpackage.m45.E
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2f
            jxb r9 = r0.E
            yv5 r9 = (defpackage.yv5) r9
            defpackage.sf5.h0(r10)
            return r10
        L2f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r9)
            return r4
        L35:
            jxb r1 = r0.E
            defpackage.sf5.h0(r10)
            goto L4c
        L3b:
            defpackage.sf5.h0(r10)
            jxb r1 = r9.d
            r0.E = r1
            r0.H = r3
            java.lang.Object r10 = r1.c(r0)
            if (r10 != r5) goto L4c
            goto Lbb
        L4c:
            zv5 r10 = r9.e     // Catch: java.lang.Throwable -> L55
            if (r10 != 0) goto L57
            zv5 r10 = r9.c()     // Catch: java.lang.Throwable -> L55
            goto Lae
        L55:
            r9 = move-exception
            goto Lbd
        L57:
            boolean r6 = r10.isCancelled()     // Catch: java.lang.Throwable -> L55
            if (r6 == 0) goto L62
            zv5 r10 = r9.c()     // Catch: java.lang.Throwable -> L55
            goto Lae
        L62:
            boolean r6 = r10.Z()     // Catch: java.lang.Throwable -> L55
            if (r6 != 0) goto L69
            goto Lae
        L69:
            java.lang.Object r6 = r10.I()     // Catch: java.lang.Throwable -> L55
            um8 r6 = (defpackage.um8) r6     // Catch: java.lang.Throwable -> L55
            if (r6 != 0) goto L72
            goto Lae
        L72:
            boolean r7 = r6.d()     // Catch: java.lang.Throwable -> L55
            if (r7 != 0) goto L79
            goto Lae
        L79:
            int r7 = r9.f     // Catch: java.lang.Throwable -> L55
            r8 = 3
            if (r7 < r8) goto La4
            boolean r6 = r9.g     // Catch: java.lang.Throwable -> L55
            if (r6 == 0) goto L83
            goto Lae
        L83:
            r9.g = r3     // Catch: java.lang.Throwable -> L55
            com.anthropic.claude.core.telemetry.SilentException r9 = new com.anthropic.claude.core.telemetry.SilentException     // Catch: java.lang.Throwable -> L55
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            java.lang.String r6 = "Highlighter recovery cap hit ("
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L55
            r3.append(r7)     // Catch: java.lang.Throwable -> L55
            java.lang.String r6 = " attempts), serving plain text for rest of process"
            r3.append(r6)     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L55
            r9.<init>(r3)     // Catch: java.lang.Throwable -> L55
            ozf r3 = defpackage.ozf.G     // Catch: java.lang.Throwable -> L55
            r6 = 0
            com.anthropic.claude.core.telemetry.SilentException.a(r9, r3, r6, r2)     // Catch: java.lang.Throwable -> L55
            goto Lae
        La4:
            int r7 = r7 + r3
            r9.f = r7     // Catch: java.lang.Throwable -> L55
            r6.b()     // Catch: java.lang.Throwable -> Laa
        Laa:
            zv5 r10 = r9.c()     // Catch: java.lang.Throwable -> L55
        Lae:
            r1.d(r4)
            r0.E = r4
            r0.H = r2
            java.lang.Object r9 = r10.w(r0)
            if (r9 != r5) goto Lbc
        Lbb:
            return r5
        Lbc:
            return r9
        Lbd:
            r1.d(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xm8.b(vp4):java.lang.Object");
    }

    public final zv5 c() {
        zv5 zv5VarK = gb9.k(this.a, null, new al8(this, (tp4) null, 1), 3);
        this.e = zv5VarK;
        return zv5VarK;
    }
}
