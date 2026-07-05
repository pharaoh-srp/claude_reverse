package defpackage;

import java.io.Closeable;

/* JADX INFO: loaded from: classes2.dex */
public final class r66 implements Closeable {
    public final p66 E;
    public boolean F;
    public final /* synthetic */ v66 G;

    public r66(v66 v66Var, p66 p66Var) {
        this.G = v66Var;
        this.E = p66Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.F) {
            return;
        }
        this.F = true;
        v66 v66Var = this.G;
        synchronized (v66Var) {
            p66 p66Var = this.E;
            int i = p66Var.h - 1;
            p66Var.h = i;
            if (i == 0 && p66Var.f) {
                ide ideVar = v66.U;
                v66Var.H(p66Var);
            }
        }
    }
}
