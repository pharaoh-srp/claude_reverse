package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class iej implements Runnable {
    public final File E;
    public final gmf F;
    public final h99 G;
    public final iuj H;

    public iej(File file, gmf gmfVar, h99 h99Var, iuj iujVar) {
        gmfVar.getClass();
        h99Var.getClass();
        iujVar.getClass();
        this.E = file;
        this.F = gmfVar;
        this.G = h99Var;
        this.H = iujVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File file = this.E;
        h99 h99Var = this.G;
        if (file == null) {
            dch.H(h99Var, 4, g99.F, tnh.Q, null, false, 56);
        } else {
            fd9.t0(h99Var, this.H, new x7f(8, this));
        }
    }
}
