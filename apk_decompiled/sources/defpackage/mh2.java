package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class mh2 extends lh2 {
    public final pz7 H;

    public mh2(pz7 pz7Var, c45 c45Var, int i, py1 py1Var) {
        super(c45Var, i, py1Var);
        this.H = pz7Var;
    }

    @Override // defpackage.lh2
    public Object g(aid aidVar, tp4 tp4Var) {
        Object objInvoke = this.H.invoke(aidVar, tp4Var);
        return objInvoke == m45.E ? objInvoke : iei.a;
    }

    @Override // defpackage.lh2
    public lh2 h(c45 c45Var, int i, py1 py1Var) {
        return new mh2(this.H, c45Var, i, py1Var);
    }

    @Override // defpackage.lh2
    public final String toString() {
        return "block[" + this.H + "] -> " + super.toString();
    }
}
