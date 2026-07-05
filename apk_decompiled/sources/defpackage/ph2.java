package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ph2 extends oh2 {
    public ph2(kp7 kp7Var, c45 c45Var, int i, py1 py1Var, int i2) {
        super(kp7Var, (i2 & 2) != 0 ? im6.E : c45Var, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? py1.E : py1Var);
    }

    @Override // defpackage.lh2
    public final lh2 h(c45 c45Var, int i, py1 py1Var) {
        return new ph2(this.H, c45Var, i, py1Var);
    }

    @Override // defpackage.lh2
    public final kp7 i() {
        return this.H;
    }

    @Override // defpackage.oh2
    public final Object k(lp7 lp7Var, tp4 tp4Var) {
        Object objA = this.H.a(lp7Var, tp4Var);
        return objA == m45.E ? objA : iei.a;
    }
}
