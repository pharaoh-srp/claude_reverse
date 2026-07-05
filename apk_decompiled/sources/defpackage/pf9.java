package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pf9 extends ua2 {
    public final vf9 O;

    public pf9(tp4 tp4Var, vf9 vf9Var) {
        super(1, tp4Var);
        this.O = vf9Var;
    }

    @Override // defpackage.ua2
    public final String B() {
        return "AwaitContinuation";
    }

    @Override // defpackage.ua2
    public final Throwable n(vf9 vf9Var) {
        Throwable thE;
        Object objU = this.O.U();
        return (!(objU instanceof rf9) || (thE = ((rf9) objU).e()) == null) ? objU instanceof e94 ? ((e94) objU).a : vf9Var.H() : thE;
    }
}
