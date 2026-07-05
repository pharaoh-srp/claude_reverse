package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gh4 implements dh4 {
    public final d9d E;
    public final d9d F;
    public final dd8 G;
    public final ThreadLocal H;
    public volatile boolean I;
    public final long J;
    public final int K;

    public gh4(final nyj nyjVar, final String str, int i) {
        str.getClass();
        this.G = new dd8(15);
        this.H = new ThreadLocal();
        lz1 lz1Var = uh6.F;
        this.J = v40.Q(30, zh6.SECONDS);
        this.K = 2;
        if (i <= 0) {
            sz6.p("Maximum number of readers must be greater than 0");
            throw null;
        }
        final int i2 = 0;
        this.E = new d9d(i, new zy7() { // from class: eh4
            @Override // defpackage.zy7
            public final Object a() {
                int i3 = i2;
                String str2 = str;
                nyj nyjVar2 = nyjVar;
                switch (i3) {
                    case 0:
                        lze lzeVarR = nyjVar2.r(str2);
                        u00.r(lzeVarR, "PRAGMA query_only = 1");
                        return lzeVarR;
                    default:
                        return nyjVar2.r(str2);
                }
            }
        });
        final int i3 = 1;
        this.F = new d9d(1, new zy7() { // from class: eh4
            @Override // defpackage.zy7
            public final Object a() {
                int i32 = i3;
                String str2 = str;
                nyj nyjVar2 = nyjVar;
                switch (i32) {
                    case 0:
                        lze lzeVarR = nyjVar2.r(str2);
                        u00.r(lzeVarR, "PRAGMA query_only = 1");
                        return lzeVarR;
                    default:
                        return nyjVar2.r(str2);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014a A[Catch: all -> 0x01a7, TRY_LEAVE, TryCatch #3 {all -> 0x01a7, blocks: (B:64:0x0123, B:69:0x013f, B:71:0x014a, B:86:0x01ab, B:87:0x01b2), top: B:113:0x0123 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ab A[Catch: all -> 0x01a7, TRY_ENTER, TryCatch #3 {all -> 0x01a7, blocks: (B:64:0x0123, B:69:0x013f, B:71:0x014a, B:86:0x01ab, B:87:0x01b2), top: B:113:0x0123 }] */
    @Override // defpackage.dh4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(boolean r18, defpackage.pz7 r19, defpackage.vp4 r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gh4.D(boolean, pz7, vp4):java.lang.Object");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.I) {
            return;
        }
        this.I = true;
        this.E.c();
        this.F.c();
    }

    public gh4(nyj nyjVar) {
        this.G = new dd8(15);
        this.H = new ThreadLocal();
        lz1 lz1Var = uh6.F;
        this.J = v40.Q(30, zh6.SECONDS);
        this.K = 2;
        d9d d9dVar = new d9d(1, new d7(28, nyjVar));
        this.E = d9dVar;
        this.F = d9dVar;
    }
}
