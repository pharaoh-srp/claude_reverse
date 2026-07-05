package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wdi extends e45 {
    public static final wdi G = new wdi();

    @Override // defpackage.e45
    public final void O0(c45 c45Var, Runnable runnable) {
        ojj ojjVar = (ojj) c45Var.x0(ojj.G);
        if (ojjVar != null) {
            ojjVar.F = true;
        } else {
            pmf.n("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // defpackage.e45
    public final e45 R0(int i, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // defpackage.e45
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
