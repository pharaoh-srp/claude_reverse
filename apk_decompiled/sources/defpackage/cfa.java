package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class cfa implements zy7 {
    public final gfa E;
    public final zy7 F;
    public volatile Object G;

    public cfa(gfa gfaVar, zy7 zy7Var) {
        if (gfaVar == null) {
            d(0);
            throw null;
        }
        this.G = ffa.E;
        this.E = gfaVar;
        this.F = zy7Var;
    }

    public static /* synthetic */ void d(int i) {
        String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "computable";
        } else if (i == 2 || i == 3) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 2) {
            objArr[1] = "recursionDetected";
        } else if (i != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[1] = "renderDebugInformation";
        }
        if (i != 2 && i != 3) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055 A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #1 {all -> 0x0026, blocks: (B:7:0x0015, B:9:0x001b, B:15:0x002a, B:17:0x0037, B:22:0x0046, B:24:0x0050, B:25:0x0055, B:29:0x0064, B:31:0x006a, B:33:0x006e, B:34:0x0075, B:35:0x0080, B:36:0x0081, B:37:0x0087, B:26:0x0057), top: B:42:0x0015, inners: #0 }] */
    @Override // defpackage.zy7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a() throws java.lang.Throwable {
        /*
            r5 = this;
            ffa r0 = defpackage.ffa.G
            ffa r1 = defpackage.ffa.F
            java.lang.Object r2 = r5.G
            boolean r3 = r2 instanceof defpackage.ffa
            if (r3 != 0) goto Le
            defpackage.kij.a(r2)
            return r2
        Le:
            gfa r2 = r5.E
            f7g r2 = r2.a
            r2.lock()
            java.lang.Object r2 = r5.G     // Catch: java.lang.Throwable -> L26
            boolean r3 = r2 instanceof defpackage.ffa     // Catch: java.lang.Throwable -> L26
            if (r3 != 0) goto L28
            defpackage.kij.a(r2)     // Catch: java.lang.Throwable -> L26
            gfa r5 = r5.E
            f7g r5 = r5.a
            r5.unlock()
            return r2
        L26:
            r0 = move-exception
            goto L88
        L28:
            if (r2 != r1) goto L43
            r5.G = r0     // Catch: java.lang.Throwable -> L26
            r3 = 1
            z5l r3 = r5.f(r3)     // Catch: java.lang.Throwable -> L26
            boolean r4 = r3.g()     // Catch: java.lang.Throwable -> L26
            if (r4 != 0) goto L43
            java.lang.Object r0 = r3.f()     // Catch: java.lang.Throwable -> L26
        L3b:
            gfa r5 = r5.E
            f7g r5 = r5.a
            r5.unlock()
            return r0
        L43:
            if (r2 != r0) goto L55
            r0 = 0
            z5l r0 = r5.f(r0)     // Catch: java.lang.Throwable -> L26
            boolean r2 = r0.g()     // Catch: java.lang.Throwable -> L26
            if (r2 != 0) goto L55
            java.lang.Object r0 = r0.f()     // Catch: java.lang.Throwable -> L26
            goto L3b
        L55:
            r5.G = r1     // Catch: java.lang.Throwable -> L26
            zy7 r0 = r5.F     // Catch: java.lang.Throwable -> L63
            java.lang.Object r0 = r0.a()     // Catch: java.lang.Throwable -> L63
            r5.e(r0)     // Catch: java.lang.Throwable -> L63
            r5.G = r0     // Catch: java.lang.Throwable -> L63
            goto L3b
        L63:
            r0 = move-exception
            boolean r2 = defpackage.djk.i(r0)     // Catch: java.lang.Throwable -> L26
            if (r2 != 0) goto L81
            java.lang.Object r2 = r5.G     // Catch: java.lang.Throwable -> L26
            if (r2 != r1) goto L75
            jij r1 = new jij     // Catch: java.lang.Throwable -> L26
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L26
            r5.G = r1     // Catch: java.lang.Throwable -> L26
        L75:
            gfa r1 = r5.E     // Catch: java.lang.Throwable -> L26
            efk r1 = r1.b     // Catch: java.lang.Throwable -> L26
            r1.getClass()     // Catch: java.lang.Throwable -> L26
            defpackage.djk.j(r0)     // Catch: java.lang.Throwable -> L26
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L26
        L81:
            ffa r1 = defpackage.ffa.E     // Catch: java.lang.Throwable -> L26
            r5.G = r1     // Catch: java.lang.Throwable -> L26
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch: java.lang.Throwable -> L26
            throw r0     // Catch: java.lang.Throwable -> L26
        L88:
            gfa r5 = r5.E
            f7g r5 = r5.a
            r5.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfa.a():java.lang.Object");
    }

    public void e(Object obj) {
    }

    public z5l f(boolean z) {
        z5l z5lVarD = this.E.d("in a lazy value", null);
        if (z5lVarD != null) {
            return z5lVarD;
        }
        d(2);
        throw null;
    }
}
