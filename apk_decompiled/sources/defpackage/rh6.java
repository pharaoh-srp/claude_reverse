package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rh6 implements u9d {
    public final nwb a;
    public final long b;
    public final cz5 c;
    public final pyk d;
    public final int e;
    public final p30 f;
    public final tx g;
    public final tx h;
    public final ebj i;
    public final ebj j;
    public final ux k;
    public final ux l;
    public final ux m;
    public final fbj n;
    public final fbj o;

    public rh6(nwb nwbVar, long j, cz5 cz5Var, p30 p30Var) {
        pyk pykVar = pyk.O;
        qnc qncVar = ldb.a;
        int iM0 = cz5Var.M0(48.0f);
        this.a = nwbVar;
        this.b = j;
        this.c = cz5Var;
        this.d = pykVar;
        this.e = iM0;
        this.f = p30Var;
        int iM02 = cz5Var.M0(ya6.a(j));
        vo1 vo1Var = lja.S;
        this.g = new tx(vo1Var, vo1Var, iM02);
        vo1 vo1Var2 = lja.U;
        new tx(vo1Var2, vo1Var, iM02);
        this.h = new tx(vo1Var2, vo1Var2, iM02);
        new tx(vo1Var, vo1Var2, iM02);
        this.i = new ebj(ac1.d);
        this.j = new ebj(ac1.e);
        int iM03 = cz5Var.M0(ya6.b(j));
        wo1 wo1Var = lja.P;
        wo1 wo1Var2 = lja.R;
        this.k = new ux(wo1Var, wo1Var2, iM03);
        new ux(wo1Var, wo1Var, iM03);
        this.l = new ux(wo1Var2, wo1Var, iM03);
        new ux(wo1Var2, wo1Var2, iM03);
        this.m = new ux(lja.Q, wo1Var, iM03);
        this.n = new fbj(wo1Var, iM0);
        this.o = new fbj(wo1Var2, iM0);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0154 A[ADDED_TO_REGION, LOOP:3: B:52:0x0154->B:62:0x016d, LOOP_START, PHI: r6
      0x0154: PHI (r6v6 int) = (r6v5 int), (r6v7 int) binds: [B:51:0x0152, B:62:0x016d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0176  */
    @Override // defpackage.u9d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(defpackage.c79 r24, long r25, defpackage.fu9 r27, long r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rh6.a(c79, long, fu9, long):long");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rh6) {
            rh6 rh6Var = (rh6) obj;
            if (x44.r(this.a, rh6Var.a) && this.b == rh6Var.b && x44.r(this.c, rh6Var.c) && x44.r(this.d, rh6Var.d) && this.e == rh6Var.e && x44.r(this.f, rh6Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + vb7.c(0, vb7.c(this.e, (this.d.hashCode() + ((this.c.hashCode() + vb7.e(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(transformOriginState=" + this.a + ", contentOffset=" + ((Object) ya6.c(this.b)) + ", density=" + this.c + ", dropdownMenuAnchorPosition=" + this.d + ", verticalMargin=" + this.e + ", horizontalMargin=0, onPositionCalculated=" + this.f + ')';
    }
}
