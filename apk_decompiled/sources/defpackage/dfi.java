package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dfi extends e45 {
    public static final dfi G = new dfi();

    @Override // defpackage.e45
    public final void O0(c45 c45Var, Runnable runnable) {
        ft5.H.G.d(runnable, true, false);
    }

    @Override // defpackage.e45
    public final void P0(c45 c45Var, Runnable runnable) {
        ft5.H.G.d(runnable, true, true);
    }

    @Override // defpackage.e45
    public final e45 R0(int i, String str) {
        eve.o(i);
        return i >= x9h.d ? str != null ? new xxb(this, str) : this : super.R0(i, str);
    }

    @Override // defpackage.e45
    public final String toString() {
        return "Dispatchers.IO";
    }
}
