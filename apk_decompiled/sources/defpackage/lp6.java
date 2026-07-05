package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lp6 extends tu9 {
    public a6i S;
    public q5i T;
    public q5i U;
    public q5i V;
    public wp6 W;
    public d77 X;
    public zy7 Y;
    public bp6 Z;
    public long a0 = -9223372034707292160L;
    public tt b0;
    public final kp6 c0;
    public final kp6 d0;

    public lp6(a6i a6iVar, q5i q5iVar, q5i q5iVar2, q5i q5iVar3, wp6 wp6Var, d77 d77Var, zy7 zy7Var, bp6 bp6Var) {
        this.S = a6iVar;
        this.T = q5iVar;
        this.U = q5iVar2;
        this.V = q5iVar3;
        this.W = wp6Var;
        this.X = d77Var;
        this.Y = zy7Var;
        this.Z = bp6Var;
        sl4.b(0, 0, 0, 0, 15);
        this.c0 = new kp6(this, 0);
        this.d0 = new kp6(this, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    @Override // defpackage.pu9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.p5b b(defpackage.q5b r27, defpackage.h5b r28, long r29) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lp6.b(q5b, h5b, long):p5b");
    }

    @Override // defpackage.hqb
    public final void h1() {
        this.a0 = -9223372034707292160L;
    }

    public final tt p1() {
        tt ttVar;
        tt ttVar2;
        if (this.S.f().a(zo6.E, zo6.F)) {
            dh2 dh2Var = this.W.a.c;
            if (dh2Var != null && (ttVar2 = dh2Var.a) != null) {
                return ttVar2;
            }
            dh2 dh2Var2 = this.X.a.c;
            if (dh2Var2 != null) {
                return dh2Var2.a;
            }
            return null;
        }
        dh2 dh2Var3 = this.X.a.c;
        if (dh2Var3 != null && (ttVar = dh2Var3.a) != null) {
            return ttVar;
        }
        dh2 dh2Var4 = this.W.a.c;
        if (dh2Var4 != null) {
            return dh2Var4.a;
        }
        return null;
    }
}
