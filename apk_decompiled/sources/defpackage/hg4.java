package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hg4 extends zy1 {
    public final py1 T;

    public hg4(int i, py1 py1Var) {
        super(i);
        this.T = py1Var;
        if (py1Var == py1.E) {
            xh6.l(jce.a.b(zy1.class).f(), " instead", "This implementation does not support suspension for senders, use ");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        mr9.q(grc.u("Buffered channel capacity must be at least 1, but ", i, " was specified"));
        throw null;
    }

    @Override // defpackage.zy1
    public final boolean F() {
        return this.T == py1.F;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b4, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U(java.lang.Object r16, boolean r17) {
        /*
            r15 = this;
            py1 r1 = r15.T
            py1 r2 = defpackage.py1.G
            iei r8 = defpackage.iei.a
            if (r1 != r2) goto L17
            java.lang.Object r0 = super.r(r16)
            boolean r1 = r0 instanceof defpackage.zh2
            if (r1 == 0) goto L16
            boolean r1 = r0 instanceof defpackage.yh2
            if (r1 == 0) goto L15
            goto L16
        L15:
            return r8
        L16:
            return r0
        L17:
            sqb r6 = defpackage.bz1.d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.zy1.J
            java.lang.Object r1 = r1.get(r15)
            bi2 r1 = (defpackage.bi2) r1
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = defpackage.zy1.F
            long r2 = r2.getAndIncrement(r15)
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r2
            r7 = 0
            boolean r7 = r15.D(r2, r7)
            int r9 = defpackage.bz1.b
            long r10 = (long) r9
            long r2 = r4 / r10
            long r12 = r4 % r10
            int r12 = (int) r12
            long r13 = r1.I
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L53
            bi2 r2 = r15.u(r2, r1)
            if (r2 != 0) goto L52
            if (r7 == 0) goto L21
            java.lang.Throwable r0 = r15.x()
            yh2 r1 = new yh2
            r1.<init>(r0)
            return r1
        L52:
            r1 = r2
        L53:
            r0 = r15
            r3 = r16
            r2 = r12
            int r12 = defpackage.zy1.e(r0, r1, r2, r3, r4, r6, r7)
            if (r12 == 0) goto Lb5
            r3 = 1
            if (r12 == r3) goto Lb4
            r3 = 2
            r13 = 0
            if (r12 == r3) goto L8f
            r2 = 3
            if (r12 == r2) goto L89
            r2 = 4
            if (r12 == r2) goto L72
            r2 = 5
            if (r12 == r2) goto L6e
            goto L21
        L6e:
            r1.a()
            goto L21
        L72:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = defpackage.zy1.G
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L7f
            r1.a()
        L7f:
            java.lang.Throwable r0 = r15.x()
            yh2 r1 = new yh2
            r1.<init>(r0)
            return r1
        L89:
            java.lang.String r0 = "unexpected"
            defpackage.sz6.j(r0)
            return r13
        L8f:
            if (r7 == 0) goto L9e
            r1.n()
            java.lang.Throwable r0 = r15.x()
            yh2 r1 = new yh2
            r1.<init>(r0)
            return r1
        L9e:
            boolean r3 = r6 instanceof defpackage.x5j
            if (r3 == 0) goto La5
            r13 = r6
            x5j r13 = (defpackage.x5j) r13
        La5:
            if (r13 == 0) goto Lac
            int r12 = r2 + r9
            r13.a(r1, r12)
        Lac:
            long r3 = r1.I
            long r3 = r3 * r10
            long r1 = (long) r2
            long r3 = r3 + r1
            r15.n(r3)
        Lb4:
            return r8
        Lb5:
            r1.a()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hg4.U(java.lang.Object, boolean):java.lang.Object");
    }

    @Override // defpackage.zy1, defpackage.mkf
    public final Object b(tp4 tp4Var, Object obj) throws Throwable {
        if (U(obj, true) instanceof yh2) {
            throw x();
        }
        return iei.a;
    }

    @Override // defpackage.zy1, defpackage.mkf
    public final Object r(Object obj) {
        return U(obj, false);
    }
}
