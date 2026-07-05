package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ev6 {
    public static final long l;
    public static final long m;
    public final jz6 a;
    public final pz7 b;
    public final String c;
    public final l45 d;
    public final h86 e;
    public final xf7 f;
    public final zy7 g;
    public final long h;
    public final long i;
    public lf9 j;
    public long k;

    static {
        lz1 lz1Var = uh6.F;
        l = v40.Q(30, zh6.SECONDS);
        m = v40.Q(3, zh6.MINUTES);
    }

    public ev6(jz6 jz6Var, pz7 pz7Var, String str, l45 l45Var, h86 h86Var, xf7 xf7Var, zy7 zy7Var) {
        this.a = jz6Var;
        this.b = pz7Var;
        this.c = str;
        this.d = l45Var;
        this.e = h86Var;
        this.f = xf7Var;
        this.g = zy7Var;
        long j = l;
        this.h = j;
        this.i = m;
        this.k = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        if (r15 == r7) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f7, code lost:
    
        if (r15 == r7) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f9, code lost:
    
        return r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00f7 -> B:49:0x00fa). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.vp4 r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ev6.a(vp4):java.lang.Object");
    }

    public final void b() {
        lf9 lf9Var = this.j;
        if (lf9Var == null || !lf9Var.c()) {
            this.k = this.h;
            this.j = gb9.D(this.d, this.e.b(), null, new fj(this, null, 5), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.List r6, defpackage.vp4 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dv6
            if (r0 == 0) goto L13
            r0 = r7
            dv6 r0 = (defpackage.dv6) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            dv6 r0 = new dv6
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.sf5.h0(r7)
            goto L3c
        L26:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            return r2
        L2c:
            defpackage.sf5.h0(r7)
            r0.G = r3
            pz7 r7 = r5.b
            java.lang.Object r7 = r7.invoke(r6, r0)
            m45 r6 = defpackage.m45.E
            if (r7 != r6) goto L3c
            return r6
        L3c:
            hki r7 = (defpackage.hki) r7
            boolean r6 = r7 instanceof defpackage.gki
            java.lang.String r0 = r5.c
            xf7 r5 = r5.f
            r1 = 0
            if (r6 == 0) goto L7c
            gki r7 = (defpackage.gki) r7
            int r6 = r7.b()
            if (r6 <= 0) goto L76
            int r6 = r7.a()
            int r7 = r7.b()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = " upload partially rejected: accepted="
            r4.append(r0)
            r4.append(r6)
            java.lang.String r6 = ", rejected="
            r4.append(r6)
            r4.append(r7)
            java.lang.String r6 = r4.toString()
            r5.a(r6, r2)
        L76:
            bv6 r5 = new bv6
            r5.<init>(r3, r1)
            return r5
        L7c:
            boolean r6 = r7 instanceof defpackage.dki
            if (r6 == 0) goto La3
            dki r7 = (defpackage.dki) r7
            java.lang.String r6 = r7.a()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            java.lang.String r0 = " permanent error, discarding batch: "
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.a(r6, r2)
            bv6 r5 = new bv6
            r5.<init>(r3, r1)
            return r5
        La3:
            boolean r5 = r7 instanceof defpackage.fki
            if (r5 == 0) goto Lad
            bv6 r5 = new bv6
            r5.<init>(r1, r1)
            return r5
        Lad:
            boolean r5 = r7 instanceof defpackage.eki
            if (r5 == 0) goto Lb7
            bv6 r5 = new bv6
            r5.<init>(r1, r3)
            return r5
        Lb7:
            defpackage.mr9.b()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ev6.c(java.util.List, vp4):java.lang.Object");
    }
}
