package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yek {
    public static final Object f = new Object();
    public final String a;
    public final pek b;
    public final Object c;
    public final Object d = new Object();
    public volatile Object e = null;

    public yek(String str, Object obj, pek pekVar) {
        this.a = str;
        this.c = obj;
        this.b = pekVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.d
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6c
            if (r4 == 0) goto L7
            return r4
        L7:
            s4i r4 = defpackage.iek.a
            if (r4 != 0) goto Le
            java.lang.Object r3 = r3.c
            return r3
        Le:
            java.lang.Object r4 = defpackage.yek.f
            monitor-enter(r4)
            boolean r0 = defpackage.s4i.f()     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L24
            java.lang.Object r0 = r3.e     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L20
            java.lang.Object r3 = r3.c     // Catch: java.lang.Throwable -> L1e
            goto L22
        L1e:
            r3 = move-exception
            goto L6a
        L20:
            java.lang.Object r3 = r3.e     // Catch: java.lang.Throwable -> L1e
        L22:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            return r3
        L24:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            java.util.List r4 = defpackage.zvj.a     // Catch: java.lang.SecurityException -> L58
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.SecurityException -> L58
        L2b:
            boolean r0 = r4.hasNext()     // Catch: java.lang.SecurityException -> L58
            if (r0 == 0) goto L58
            java.lang.Object r0 = r4.next()     // Catch: java.lang.SecurityException -> L58
            yek r0 = (defpackage.yek) r0     // Catch: java.lang.SecurityException -> L58
            boolean r1 = defpackage.s4i.f()     // Catch: java.lang.SecurityException -> L58
            if (r1 != 0) goto L50
            r1 = 0
            pek r2 = r0.b     // Catch: java.lang.IllegalStateException -> L46 java.lang.SecurityException -> L58
            if (r2 == 0) goto L46
            java.lang.Object r1 = r2.zza()     // Catch: java.lang.IllegalStateException -> L46 java.lang.SecurityException -> L58
        L46:
            java.lang.Object r2 = defpackage.yek.f     // Catch: java.lang.SecurityException -> L58
            monitor-enter(r2)     // Catch: java.lang.SecurityException -> L58
            r0.e = r1     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4d
            goto L2b
        L4d:
            r4 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4d
            throw r4     // Catch: java.lang.SecurityException -> L58
        L50:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.SecurityException -> L58
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch: java.lang.SecurityException -> L58
            throw r4     // Catch: java.lang.SecurityException -> L58
        L58:
            pek r4 = r3.b
            if (r4 != 0) goto L5f
            java.lang.Object r3 = r3.c
            return r3
        L5f:
            java.lang.Object r3 = r4.zza()     // Catch: java.lang.IllegalStateException -> L64 java.lang.SecurityException -> L67
            return r3
        L64:
            java.lang.Object r3 = r3.c
            return r3
        L67:
            java.lang.Object r3 = r3.c
            return r3
        L6a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            throw r3
        L6c:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6c
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yek.a(java.lang.Object):java.lang.Object");
    }
}
