package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class n01 implements wlg {
    public final List E;
    public final rbi F;
    public final fj0 G;
    public final bz7 H;
    public final m20 I;
    public final lsc J;
    public boolean K = true;

    public n01(List list, Object obj, rbi rbiVar, fj0 fj0Var, bz7 bz7Var, m20 m20Var) {
        this.E = list;
        this.F = rbiVar;
        this.G = fj0Var;
        this.H = bz7Var;
        this.I = m20Var;
        this.J = mpk.P(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ce, code lost:
    
        if (defpackage.pjj.b(r2) == r11) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:25:0x0066, B:27:0x0070, B:32:0x0095, B:36:0x00bc, B:20:0x0051, B:23:0x005a), top: B:44:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095 A[Catch: all -> 0x003e, TRY_LEAVE, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:25:0x0066, B:27:0x0070, B:32:0x0095, B:36:0x00bc, B:20:0x0051, B:23:0x005a), top: B:44:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc A[Catch: all -> 0x003e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:25:0x0066, B:27:0x0070, B:32:0x0095, B:36:0x00bc, B:20:0x0051, B:23:0x005a), top: B:44:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x006e -> B:40:0x00d2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00ce -> B:39:0x00d1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.vp4 r18) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n01.a(vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.k20 r6, defpackage.vp4 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.m01
            if (r0 == 0) goto L13
            r0 = r7
            m01 r0 = (defpackage.m01) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            m01 r0 = new m01
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.F
            int r1 = r0.H
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            k20 r6 = r0.E
            defpackage.sf5.h0(r7)     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            return r7
        L28:
            r5 = move-exception
            goto L4c
        L2a:
            r5 = move-exception
            goto L75
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            return r3
        L32:
            defpackage.sf5.h0(r7)
            m0 r7 = new m0     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            r1 = 20
            r7.<init>(r5, r6, r3, r1)     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            r0.E = r6     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            r0.H = r2     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            r1 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r5 = defpackage.iuj.Q(r1, r7, r0)     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            m45 r6 = defpackage.m45.E
            if (r5 != r6) goto L4b
            return r6
        L4b:
            return r5
        L4c:
            c45 r7 = r0.getContext()
            zp3 r1 = defpackage.zp3.G
            a45 r7 = r7.x0(r1)
            f45 r7 = (defpackage.f45) r7
            if (r7 == 0) goto L7f
            c45 r0 = r0.getContext()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Unable to load font "
            r2.<init>(r4)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r1.<init>(r6, r5)
            r7.x(r0, r1)
            goto L7f
        L75:
            c45 r6 = r0.getContext()
            boolean r6 = defpackage.knk.B(r6)
            if (r6 == 0) goto L80
        L7f:
            return r3
        L80:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n01.d(k20, vp4):java.lang.Object");
    }

    @Override // defpackage.wlg
    public final Object getValue() {
        return this.J.getValue();
    }
}
