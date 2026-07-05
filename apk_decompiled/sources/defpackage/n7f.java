package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class n7f extends d1 implements n45 {
    public final tp4 J;

    public n7f(tp4 tp4Var, c45 c45Var) {
        super(c45Var, true);
        this.J = tp4Var;
    }

    @Override // defpackage.vf9
    public final boolean a0() {
        return true;
    }

    @Override // defpackage.n45
    public final n45 getCallerFrame() {
        tp4 tp4Var = this.J;
        if (tp4Var instanceof n45) {
            return (n45) tp4Var;
        }
        return null;
    }

    @Override // defpackage.vf9
    public void t(Object obj) {
        a86.a(zni.I(this.J), dgj.L(obj));
    }

    @Override // defpackage.vf9
    public void v(Object obj) {
        this.J.resumeWith(dgj.L(obj));
    }

    public void y0() {
    }
}
