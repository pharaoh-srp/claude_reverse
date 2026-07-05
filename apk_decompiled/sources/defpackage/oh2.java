package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class oh2 extends lh2 {
    public final kp7 H;

    public oh2(kp7 kp7Var, c45 c45Var, int i, py1 py1Var) {
        super(c45Var, i, py1Var);
        this.H = kp7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    @Override // defpackage.lh2, defpackage.kp7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.lp7 r6, defpackage.tp4 r7) throws java.lang.Throwable {
        /*
            r5 = this;
            int r0 = r5.F
            r1 = -3
            m45 r2 = defpackage.m45.E
            if (r0 != r1) goto L6e
            c45 r0 = r7.getContext()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            z35 r3 = new z35
            r4 = 1
            r3.<init>(r4)
            c45 r4 = r5.E
            java.lang.Object r1 = r4.K(r3, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L26
            c45 r1 = r0.r0(r4)
            goto L2b
        L26:
            r1 = 0
            c45 r1 = defpackage.zni.x(r0, r4, r1)
        L2b:
            boolean r3 = defpackage.x44.r(r1, r0)
            if (r3 == 0) goto L38
            java.lang.Object r5 = r5.k(r6, r7)
            if (r5 != r2) goto L75
            return r5
        L38:
            a5 r3 = defpackage.a5.G
            a45 r4 = r1.x0(r3)
            a45 r0 = r0.x0(r3)
            boolean r0 = defpackage.x44.r(r4, r0)
            if (r0 == 0) goto L6e
            c45 r0 = r7.getContext()
            boolean r3 = r6 instanceof defpackage.bmf
            if (r3 != 0) goto L5b
            boolean r3 = r6 instanceof defpackage.p6c
            if (r3 == 0) goto L55
            goto L5b
        L55:
            dp r3 = new dp
            r3.<init>(r6, r0)
            r6 = r3
        L5b:
            nn1 r0 = new nn1
            r3 = 0
            r4 = 12
            r0.<init>(r5, r3, r4)
            java.lang.Object r5 = defpackage.qnh.b(r1)
            java.lang.Object r5 = defpackage.xn5.x0(r1, r6, r5, r0, r7)
            if (r5 != r2) goto L75
            return r5
        L6e:
            java.lang.Object r5 = super.a(r6, r7)
            if (r5 != r2) goto L75
            return r5
        L75:
            iei r5 = defpackage.iei.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oh2.a(lp7, tp4):java.lang.Object");
    }

    @Override // defpackage.lh2
    public final Object g(aid aidVar, tp4 tp4Var) {
        Object objK = k(new bmf(aidVar), tp4Var);
        return objK == m45.E ? objK : iei.a;
    }

    public abstract Object k(lp7 lp7Var, tp4 tp4Var);

    @Override // defpackage.lh2
    public final String toString() {
        return this.H + " -> " + super.toString();
    }
}
