package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b0c {
    public f0c a;
    public f0c b;
    public zy7 c = new l4(25, this);
    public l45 d;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006d, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006f, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r8, long r10, defpackage.vp4 r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.zzb
            if (r0 == 0) goto L14
            r0 = r12
            zzb r0 = (defpackage.zzb) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.G = r1
        L12:
            r12 = r0
            goto L1a
        L14:
            zzb r0 = new zzb
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r0 = r12.E
            int r1 = r12.G
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L35
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.sf5.h0(r0)
            goto L70
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r2
        L31:
            defpackage.sf5.h0(r0)
            goto L55
        L35:
            defpackage.sf5.h0(r0)
            f0c r0 = r7.a
            if (r0 == 0) goto L41
            f0c r0 = r0.q1()
            goto L42
        L41:
            r0 = r2
        L42:
            r5 = 0
            m45 r1 = defpackage.m45.E
            if (r0 != 0) goto L5c
            f0c r7 = r7.b
            if (r7 == 0) goto L76
            r12.G = r4
            java.lang.Object r0 = r7.G(r8, r10, r12)
            if (r0 != r1) goto L55
            goto L6f
        L55:
            qsi r0 = (defpackage.qsi) r0
            long r5 = r0.j()
            goto L76
        L5c:
            f0c r7 = r7.a
            if (r7 == 0) goto L64
            f0c r2 = r7.q1()
        L64:
            r7 = r2
            if (r7 == 0) goto L76
            r12.G = r3
            java.lang.Object r0 = r7.G(r8, r10, r12)
            if (r0 != r1) goto L70
        L6f:
            return r1
        L70:
            qsi r0 = (defpackage.qsi) r0
            long r5 = r0.j()
        L76:
            qsi r7 = defpackage.qsi.a(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b0c.a(long, long, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r5, defpackage.vp4 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.a0c
            if (r0 == 0) goto L13
            r0 = r7
            a0c r0 = (defpackage.a0c) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            a0c r0 = new a0c
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.sf5.h0(r7)
            goto L44
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L2c:
            defpackage.sf5.h0(r7)
            f0c r4 = r4.a
            if (r4 == 0) goto L37
            f0c r2 = r4.q1()
        L37:
            if (r2 == 0) goto L4b
            r0.G = r3
            java.lang.Object r7 = r2.O0(r5, r0)
            m45 r4 = defpackage.m45.E
            if (r7 != r4) goto L44
            return r4
        L44:
            qsi r7 = (defpackage.qsi) r7
            long r4 = r7.j()
            goto L4d
        L4b:
            r4 = 0
        L4d:
            qsi r4 = defpackage.qsi.a(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b0c.b(long, vp4):java.lang.Object");
    }

    public final l45 c() {
        l45 l45Var = (l45) this.c.a();
        if (l45Var != null) {
            return l45Var;
        }
        sz6.j("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }
}
