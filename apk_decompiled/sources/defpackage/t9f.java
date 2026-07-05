package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t9f implements yzb {
    public final raf E;
    public boolean F;

    public t9f(raf rafVar, boolean z) {
        this.E = rafVar;
        this.F = z;
    }

    @Override // defpackage.yzb
    public final long F(long j, int i, long j2) {
        if (!this.F) {
            return 0L;
        }
        raf rafVar = this.E;
        if (rafVar.a.a()) {
            return 0L;
        }
        return rafVar.h(rafVar.d(rafVar.a.e(rafVar.d(rafVar.g(j2)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.yzb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(long r4, long r6, defpackage.tp4 r8) throws java.lang.Throwable {
        /*
            r3 = this;
            boolean r4 = r8 instanceof defpackage.s9f
            if (r4 == 0) goto L13
            r4 = r8
            s9f r4 = (defpackage.s9f) r4
            int r5 = r4.H
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r0
            if (r1 == 0) goto L13
            int r5 = r5 - r0
            r4.H = r5
            goto L1a
        L13:
            s9f r4 = new s9f
            vp4 r8 = (defpackage.vp4) r8
            r4.<init>(r3, r8)
        L1a:
            java.lang.Object r5 = r4.F
            int r8 = r4.H
            r0 = 1
            if (r8 == 0) goto L30
            if (r8 != r0) goto L29
            long r6 = r4.E
            defpackage.sf5.h0(r5)
            goto L4d
        L29:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r3)
            r3 = 0
            return r3
        L30:
            defpackage.sf5.h0(r5)
            boolean r5 = r3.F
            r1 = 0
            if (r5 == 0) goto L57
            raf r3 = r3.E
            boolean r5 = r3.i
            if (r5 == 0) goto L40
            goto L53
        L40:
            r4.E = r6
            r4.H = r0
            java.lang.Object r5 = r3.a(r6, r4)
            m45 r3 = defpackage.m45.E
            if (r5 != r3) goto L4d
            return r3
        L4d:
            qsi r5 = (defpackage.qsi) r5
            long r1 = r5.j()
        L53:
            long r1 = defpackage.qsi.f(r6, r1)
        L57:
            qsi r3 = defpackage.qsi.a(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t9f.G(long, long, tp4):java.lang.Object");
    }
}
