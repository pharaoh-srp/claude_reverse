package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rp3 implements b4f {
    public final b4f E;
    public boolean F;
    public final /* synthetic */ sp3 G;

    public rp3(sp3 sp3Var, b4f b4fVar) {
        this.G = sp3Var;
        this.E = b4fVar;
    }

    @Override // defpackage.b4f
    public final boolean a() {
        return !this.G.j() && this.E.a();
    }

    @Override // defpackage.b4f
    public final int b(qb5 qb5Var, ro5 ro5Var, int i) {
        sp3 sp3Var = this.G;
        if (sp3Var.j()) {
            return -3;
        }
        if (this.F) {
            ro5Var.F = 4;
            return -4;
        }
        long jP = sp3Var.p();
        int iB = this.E.b(qb5Var, ro5Var, i);
        if (sp3Var.I != -9223372036854775807L && iB != -3) {
            sp3Var.I = -9223372036854775807L;
        }
        if (iB != -5) {
            long j = sp3Var.K;
            if (j == Long.MIN_VALUE || ((iB != -4 || ro5Var.K < j) && !(iB == -3 && jP == Long.MIN_VALUE && !ro5Var.J))) {
                return iB;
            }
            ro5Var.e();
            ro5Var.F = 4;
            this.F = true;
            return -4;
        }
        long j2 = sp3Var.J;
        long j3 = sp3Var.K;
        jw7 jw7Var = (jw7) qb5Var.F;
        jw7Var.getClass();
        int i2 = jw7Var.K;
        int i3 = jw7Var.J;
        if (i3 != 0 || i2 != 0) {
            if (j2 != 0) {
                i3 = 0;
            }
            if (j3 != Long.MIN_VALUE) {
                i2 = 0;
            }
            iw7 iw7VarA = jw7Var.a();
            iw7VarA.I = i3;
            iw7VarA.J = i2;
            qb5Var.F = new jw7(iw7VarA);
        }
        return -5;
    }

    @Override // defpackage.b4f
    public final void g() {
        this.E.g();
    }

    @Override // defpackage.b4f
    public final int h(long j) {
        if (this.G.j()) {
            return -3;
        }
        return this.E.h(j);
    }
}
