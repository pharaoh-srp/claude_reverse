package defpackage;

import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i8b implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ l8b F;
    public final /* synthetic */ Pair G;
    public final /* synthetic */ uba H;
    public final /* synthetic */ l7b I;

    public /* synthetic */ i8b(l8b l8bVar, Pair pair, uba ubaVar, l7b l7bVar, int i) {
        this.E = i;
        this.F = l8bVar;
        this.G = pair;
        this.H = ubaVar;
        this.I = l7bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        l7b l7bVar = this.I;
        uba ubaVar = this.H;
        Pair pair = this.G;
        l8b l8bVar = this.F;
        switch (i) {
            case 0:
                ((hp5) l8bVar.b.i).g(((Integer) pair.first).intValue(), (z7b) pair.second, ubaVar, l7bVar);
                break;
            default:
                ((hp5) l8bVar.b.i).j(((Integer) pair.first).intValue(), (z7b) pair.second, ubaVar, l7bVar);
                break;
        }
    }
}
