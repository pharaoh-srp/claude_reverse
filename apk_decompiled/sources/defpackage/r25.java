package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r25 extends hqb implements ujf {
    public boolean S;
    public final boolean T;
    public bz7 U;

    public r25(bz7 bz7Var, boolean z, boolean z2) {
        this.S = z;
        this.T = z2;
        this.U = bz7Var;
    }

    @Override // defpackage.ujf
    public final boolean S() {
        return this.T;
    }

    @Override // defpackage.ujf
    public final void X0(ekf ekfVar) {
        this.U.invoke(ekfVar);
    }

    @Override // defpackage.ujf
    public final boolean Z0() {
        return this.S;
    }
}
