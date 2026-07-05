package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class z7g {
    public final jxb a = new jxb();
    public final tk5 b = new tk5(4);
    public final b3f c = new b3f(new ml0(2, null, 4));

    public z7g(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.b.F).get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (r8 == r5) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0, types: [z7g] */
    /* JADX WARN: Type inference failed for: r6v1, types: [hxb] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v4, types: [hxb] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [bz7] */
    /* JADX WARN: Type inference failed for: r7v2, types: [bz7] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.bz7 r7, defpackage.vp4 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.x7g
            if (r0 == 0) goto L13
            r0 = r8
            x7g r0 = (defpackage.x7g) r0
            int r1 = r0.J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.J = r1
            goto L18
        L13:
            x7g r0 = new x7g
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.H
            int r1 = r0.J
            r2 = 2
            r3 = 1
            r4 = 0
            m45 r5 = defpackage.m45.E
            if (r1 == 0) goto L44
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2f
            hxb r6 = r0.F
            defpackage.sf5.h0(r8)     // Catch: java.lang.Throwable -> L2d
            goto L6b
        L2d:
            r7 = move-exception
            goto L6f
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r4
        L35:
            int r6 = r0.G
            hxb r7 = r0.F
            xzg r1 = r0.E
            bz7 r1 = (defpackage.bz7) r1
            defpackage.sf5.h0(r8)
            r8 = r6
            r6 = r7
            r7 = r1
            goto L5c
        L44:
            defpackage.sf5.h0(r8)
            r8 = r7
            xzg r8 = (defpackage.xzg) r8
            r0.E = r8
            jxb r6 = r6.a
            r0.F = r6
            r8 = 0
            r0.G = r8
            r0.J = r3
            java.lang.Object r1 = r6.c(r0)
            if (r1 != r5) goto L5c
            goto L6a
        L5c:
            r0.E = r4     // Catch: java.lang.Throwable -> L2d
            r0.F = r6     // Catch: java.lang.Throwable -> L2d
            r0.G = r8     // Catch: java.lang.Throwable -> L2d
            r0.J = r2     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r8 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L2d
            if (r8 != r5) goto L6b
        L6a:
            return r5
        L6b:
            r6.d(r4)
            return r8
        L6f:
            r6.d(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z7g.b(bz7, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.pz7 r6, defpackage.vp4 r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.y7g
            if (r0 == 0) goto L13
            r0 = r7
            y7g r0 = (defpackage.y7g) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            y7g r0 = new y7g
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.G
            int r1 = r0.I
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            boolean r5 = r0.F
            jxb r6 = r0.E
            defpackage.sf5.h0(r7)     // Catch: java.lang.Throwable -> L2a
            goto L52
        L2a:
            r7 = move-exception
            goto L5d
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            return r3
        L32:
            defpackage.sf5.h0(r7)
            jxb r5 = r5.a
            boolean r7 = r5.h()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L58
            r0.E = r5     // Catch: java.lang.Throwable -> L58
            r0.F = r7     // Catch: java.lang.Throwable -> L58
            r0.I = r2     // Catch: java.lang.Throwable -> L58
            java.lang.Object r6 = r6.invoke(r1, r0)     // Catch: java.lang.Throwable -> L58
            m45 r0 = defpackage.m45.E
            if (r6 != r0) goto L4e
            return r0
        L4e:
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L52:
            if (r5 == 0) goto L57
            r6.d(r3)
        L57:
            return r7
        L58:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L5d:
            if (r5 == 0) goto L62
            r6.d(r3)
        L62:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z7g.c(pz7, vp4):java.lang.Object");
    }
}
