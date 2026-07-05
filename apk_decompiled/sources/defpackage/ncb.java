package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class ncb implements o0j {
    public static final File c = new File("/proc/self/status");
    public static final ide d = new ide("VmRSS:\\s+(\\d+) kB");
    public final File a;
    public final h99 b;

    public ncb(h99 h99Var) {
        File file = c;
        file.getClass();
        h99Var.getClass();
        this.a = file;
        this.b = h99Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    @Override // defpackage.o0j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Double a() {
        /*
            r9 = this;
            java.io.File r1 = r9.a
            h99 r2 = r9.b
            boolean r9 = defpackage.fd9.T(r1, r2)
            r8 = 0
            if (r9 == 0) goto Lba
            boolean r9 = defpackage.fd9.x(r1, r2)
            if (r9 != 0) goto L13
            goto Lba
        L13:
            java.nio.charset.Charset r9 = defpackage.dj2.a
            r9.getClass()
            boolean r0 = defpackage.fd9.T(r1, r2)
            if (r0 == 0) goto L65
            boolean r0 = defpackage.fd9.x(r1, r2)
            if (r0 == 0) goto L65
            e0 r0 = new e0
            r3 = 15
            r0.<init>(r3, r9)
            g99 r9 = defpackage.g99.G
            g99 r3 = defpackage.g99.F
            r4 = r3
            r3 = 5
            java.lang.Object r9 = r0.invoke(r1)     // Catch: java.lang.Exception -> L36 java.lang.SecurityException -> L4c
            goto L62
        L36:
            r0 = move-exception
            r6 = r0
            g99[] r9 = new defpackage.g99[]{r4, r9}
            java.util.List r4 = defpackage.x44.X(r9)
            fh1 r5 = new fh1
            r9 = 5
            r5.<init>(r1, r9)
            r7 = 48
            defpackage.dch.I(r2, r3, r4, r5, r6, r7)
            goto L61
        L4c:
            r0 = move-exception
            r6 = r0
            g99[] r9 = new defpackage.g99[]{r4, r9}
            java.util.List r4 = defpackage.x44.X(r9)
            fh1 r5 = new fh1
            r9 = 4
            r5.<init>(r1, r9)
            r7 = 48
            defpackage.dch.I(r2, r3, r4, r5, r6, r7)
        L61:
            r9 = r8
        L62:
            java.util.List r9 = (java.util.List) r9
            goto L66
        L65:
            r9 = r8
        L66:
            if (r9 == 0) goto La7
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()
        L73:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L9a
            java.lang.Object r1 = r9.next()
            java.lang.String r1 = (java.lang.String) r1
            ide r2 = defpackage.ncb.d
            ova r1 = r2.e(r1)
            if (r1 == 0) goto L93
            java.util.List r1 = r1.a()
            r2 = 1
            java.lang.Object r1 = defpackage.w44.O0(r2, r1)
            java.lang.String r1 = (java.lang.String) r1
            goto L94
        L93:
            r1 = r8
        L94:
            if (r1 == 0) goto L73
            r0.add(r1)
            goto L73
        L9a:
            java.lang.Object r9 = defpackage.w44.N0(r0)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto La7
            java.lang.Double r9 = defpackage.hsg.a0(r9)
            goto La8
        La7:
            r9 = r8
        La8:
            if (r9 != 0) goto Lab
            goto Lba
        Lab:
            double r0 = r9.doubleValue()
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 * r2
            java.lang.Double r9 = java.lang.Double.valueOf(r0)
            return r9
        Lba:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ncb.a():java.lang.Double");
    }
}
