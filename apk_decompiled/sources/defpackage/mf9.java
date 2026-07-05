package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class mf9 extends vf9 {
    public final boolean I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf9(lf9 lf9Var) {
        super(true);
        boolean z = true;
        X(lf9Var);
        me3 me3VarQ = Q();
        ne3 ne3Var = me3VarQ instanceof ne3 ? (ne3) me3VarQ : null;
        if (ne3Var == null) {
            z = false;
            break;
        }
        vf9 vf9VarQ = ne3Var.q();
        while (!vf9VarQ.L()) {
            me3 me3VarQ2 = vf9VarQ.Q();
            ne3 ne3Var2 = me3VarQ2 instanceof ne3 ? (ne3) me3VarQ2 : null;
            if (ne3Var2 == null) {
                z = false;
                break;
            }
            vf9VarQ = ne3Var2.q();
        }
        this.I = z;
    }

    @Override // defpackage.vf9
    public final boolean L() {
        return this.I;
    }

    @Override // defpackage.vf9
    public final boolean N() {
        return true;
    }
}
