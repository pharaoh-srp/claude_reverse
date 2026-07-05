package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class bi2 extends lff {
    public final zy1 K;
    public final /* synthetic */ AtomicReferenceArray L;

    public bi2(long j, bi2 bi2Var, zy1 zy1Var, int i) {
        super(j, bi2Var, i);
        this.K = zy1Var;
        this.L = new AtomicReferenceArray(bz1.b * 2);
    }

    @Override // defpackage.lff
    public final int l() {
        return bz1.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004b, code lost:
    
        s(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004e, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0050, code lost:
    
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0053, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // defpackage.lff
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r5, defpackage.c45 r6) {
        /*
            r4 = this;
            int r6 = defpackage.bz1.b
            if (r5 < r6) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r5 = r5 - r6
        La:
            int r6 = r5 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r4.L
            r1.get(r6)
        L11:
            java.lang.Object r6 = r4.q(r5)
            boolean r1 = r6 instanceof defpackage.x5j
            zy1 r2 = r4.K
            r3 = 0
            if (r1 != 0) goto L54
            boolean r1 = r6 instanceof defpackage.y5j
            if (r1 == 0) goto L21
            goto L54
        L21:
            sqb r1 = defpackage.bz1.j
            if (r6 == r1) goto L4b
            sqb r1 = defpackage.bz1.k
            if (r6 != r1) goto L2a
            goto L4b
        L2a:
            sqb r1 = defpackage.bz1.g
            if (r6 == r1) goto L11
            sqb r1 = defpackage.bz1.f
            if (r6 != r1) goto L33
            goto L11
        L33:
            sqb r4 = defpackage.bz1.i
            if (r6 == r4) goto L6e
            sqb r4 = defpackage.bz1.d
            if (r6 != r4) goto L3c
            goto L6e
        L3c:
            sqb r4 = defpackage.bz1.l
            if (r6 != r4) goto L41
            goto L6e
        L41:
            java.lang.String r4 = "unexpected state: "
            java.lang.String r4 = defpackage.ij0.B(r4, r6)
            defpackage.sz6.j(r4)
            return
        L4b:
            r4.s(r5, r3)
            if (r0 == 0) goto L6e
            r2.getClass()
            return
        L54:
            if (r0 == 0) goto L59
            sqb r1 = defpackage.bz1.j
            goto L5b
        L59:
            sqb r1 = defpackage.bz1.k
        L5b:
            boolean r6 = r4.p(r6, r5, r1)
            if (r6 == 0) goto L11
            r4.s(r5, r3)
            r6 = r0 ^ 1
            r4.r(r5, r6)
            if (r0 == 0) goto L6e
            r2.getClass()
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi2.m(int, c45):void");
    }

    public final boolean p(Object obj, int i, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.L;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object q(int i) {
        return this.L.get((i * 2) + 1);
    }

    public final void r(int i, boolean z) {
        if (z) {
            zy1 zy1Var = this.K;
            zy1Var.getClass();
            zy1Var.T((this.I * ((long) bz1.b)) + ((long) i));
        }
        n();
    }

    public final void s(int i, Object obj) {
        this.L.set(i * 2, obj);
    }

    public final void t(int i, Object obj) {
        this.L.set((i * 2) + 1, obj);
    }
}
