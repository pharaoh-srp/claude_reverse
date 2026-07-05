package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class th2 extends oh2 {
    public final rz7 I;

    public th2(rz7 rz7Var, kp7 kp7Var, c45 c45Var, int i, py1 py1Var) {
        super(kp7Var, c45Var, i, py1Var);
        this.I = rz7Var;
    }

    @Override // defpackage.lh2
    public final lh2 h(c45 c45Var, int i, py1 py1Var) {
        return new th2(this.I, this.H, c45Var, i, py1Var);
    }

    @Override // defpackage.oh2
    public final Object k(lp7 lp7Var, tp4 tp4Var) {
        Object objN = fd9.N(new qh2(this, lp7Var, null), tp4Var);
        return objN == m45.E ? objN : iei.a;
    }
}
