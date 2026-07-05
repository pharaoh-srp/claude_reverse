package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class osc extends hqb implements p6i, ujf {
    public l6 S;
    public boolean T;

    @Override // defpackage.ujf
    public final void X0(ekf ekfVar) {
        if (this.T) {
            return;
        }
        this.S.invoke(ekfVar);
    }

    @Override // defpackage.ujf
    public final boolean Z0() {
        return true;
    }

    @Override // defpackage.p6i
    public final Object o() {
        return dd8.L;
    }

    public final void p1(ekf ekfVar) {
        this.T = true;
        this.S.invoke(ekfVar);
        yfd.W(this).V();
    }
}
