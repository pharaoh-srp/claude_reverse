package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fre extends vd1 {
    public fre(tp4 tp4Var) {
        super(tp4Var);
        if (tp4Var == null || tp4Var.getContext() == im6.E) {
            return;
        }
        sz6.p("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // defpackage.tp4
    public final c45 getContext() {
        return im6.E;
    }
}
