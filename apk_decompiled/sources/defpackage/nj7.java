package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class nj7 implements cq3 {
    public final File a;
    public final cof b;
    public final z7g c;
    public final p7 d;
    public final AtomicBoolean e;
    public final jxb f;

    public nj7(File file, cof cofVar, z7g z7gVar, p7 p7Var) {
        z7gVar.getClass();
        this.a = file;
        this.b = cofVar;
        this.c = z7gVar;
        this.d = p7Var;
        this.e = new AtomicBoolean(false);
        this.f = new jxb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071 A[Catch: all -> 0x0072, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:34:0x0071, B:43:0x0082, B:42:0x007f, B:39:0x007a), top: B:50:0x0020, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0, types: [nj7] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [jh5] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v6, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.jh5 r7, defpackage.vp4 r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.lj7
            if (r0 == 0) goto L13
            r0 = r8
            lj7 r0 = (defpackage.lj7) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            lj7 r0 = new lj7
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.G
            int r1 = r0.I
            jxb r2 = r6.f
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2e
            boolean r6 = r0.F
            ij7 r7 = r0.E
            defpackage.sf5.h0(r8)     // Catch: java.lang.Throwable -> L2c
            goto L63
        L2c:
            r8 = move-exception
            goto L7a
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r4
        L34:
            defpackage.sf5.h0(r8)
            java.util.concurrent.atomic.AtomicBoolean r8 = r6.e
            boolean r8 = r8.get()
            if (r8 != 0) goto L8a
            boolean r8 = r2.h()
            ij7 r1 = new ij7     // Catch: java.lang.Throwable -> L83
            java.io.File r5 = r6.a     // Catch: java.lang.Throwable -> L83
            cof r6 = r6.b     // Catch: java.lang.Throwable -> L83
            r1.<init>(r5, r6)     // Catch: java.lang.Throwable -> L83
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> L75
            r0.E = r1     // Catch: java.lang.Throwable -> L75
            r0.F = r8     // Catch: java.lang.Throwable -> L75
            r0.I = r3     // Catch: java.lang.Throwable -> L75
            java.lang.Object r6 = r7.invoke(r1, r6, r0)     // Catch: java.lang.Throwable -> L75
            m45 r7 = defpackage.m45.E
            if (r6 != r7) goto L5f
            return r7
        L5f:
            r7 = r8
            r8 = r6
            r6 = r7
            r7 = r1
        L63:
            r7.close()     // Catch: java.lang.Throwable -> L68
            r7 = r4
            goto L69
        L68:
            r7 = move-exception
        L69:
            if (r7 != 0) goto L71
            if (r6 == 0) goto L70
            r2.d(r4)
        L70:
            return r8
        L71:
            throw r7     // Catch: java.lang.Throwable -> L72
        L72:
            r7 = move-exception
            r8 = r6
            goto L84
        L75:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r7
            r7 = r1
        L7a:
            r7.close()     // Catch: java.lang.Throwable -> L7e
            goto L82
        L7e:
            r7 = move-exception
            defpackage.mwa.p(r8, r7)     // Catch: java.lang.Throwable -> L72
        L82:
            throw r8     // Catch: java.lang.Throwable -> L72
        L83:
            r7 = move-exception
        L84:
            if (r8 == 0) goto L89
            r2.d(r4)
        L89:
            throw r7
        L8a:
            java.lang.String r6 = "StorageConnection has already been disposed."
            defpackage.sz6.j(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nj7.a(jh5, vp4):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2 A[Catch: all -> 0x00cc, IOException -> 0x00cf, TRY_ENTER, TryCatch #8 {IOException -> 0x00cf, all -> 0x00cc, blocks: (B:42:0x00c2, B:44:0x00c8, B:52:0x00d9, B:59:0x00e7, B:58:0x00e4), top: B:84:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d9 A[Catch: all -> 0x00cc, IOException -> 0x00cf, TRY_ENTER, TRY_LEAVE, TryCatch #8 {IOException -> 0x00cf, all -> 0x00cc, blocks: (B:42:0x00c2, B:44:0x00c8, B:52:0x00d9, B:59:0x00e7, B:58:0x00e4), top: B:84:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r12v13, types: [hxb] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [hxb] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [hxb] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.File] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ai5 r11, defpackage.vp4 r12) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nj7.b(ai5, vp4):java.lang.Object");
    }

    @Override // defpackage.cq3
    public final void close() {
        this.e.set(true);
        this.d.a();
    }
}
