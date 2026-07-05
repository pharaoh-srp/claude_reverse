package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class bw5 extends e45 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater I = AtomicIntegerFieldUpdater.newUpdater(bw5.class, "H");
    public final e45 G;
    public volatile /* synthetic */ int H = 1;

    public bw5(e45 e45Var) {
        this.G = e45Var;
    }

    @Override // defpackage.e45
    public final void O0(c45 c45Var, Runnable runnable) {
        S0().O0(c45Var, runnable);
    }

    @Override // defpackage.e45
    public final void P0(c45 c45Var, Runnable runnable) {
        S0().P0(c45Var, runnable);
    }

    @Override // defpackage.e45
    public final boolean Q0(c45 c45Var) {
        return S0().Q0(c45Var);
    }

    @Override // defpackage.e45
    public final e45 R0(int i, String str) {
        return S0().R0(i, str);
    }

    public final e45 S0() {
        return I.get(this) == 1 ? g86.b : this.G;
    }

    @Override // defpackage.e45
    public final String toString() {
        return "DeferredDispatchCoroutineDispatcher(delegate=" + this.G + ")";
    }
}
