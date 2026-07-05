package defpackage;

import android.content.Context;
import androidx.sqlite.db.framework.a;

/* JADX INFO: loaded from: classes.dex */
public final class ry7 implements bzg {
    public final Context E;
    public final String F;
    public final g11 G;
    public final boolean H;
    public final boolean I;
    public final u0h J;
    public boolean K;

    public ry7(Context context, String str, g11 g11Var, boolean z, boolean z2) {
        context.getClass();
        g11Var.getClass();
        this.E = context;
        this.F = str;
        this.G = g11Var;
        this.H = z;
        this.I = z2;
        this.J = new u0h(new p7(27, this));
    }

    @Override // defpackage.bzg
    public final oy7 X() {
        return ((a) this.J.getValue()).c(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        u0h u0hVar = this.J;
        if (u0hVar.b()) {
            ((a) u0hVar.getValue()).close();
        }
    }

    @Override // defpackage.bzg
    public final String getDatabaseName() {
        return this.F;
    }

    @Override // defpackage.bzg
    public final void setWriteAheadLoggingEnabled(boolean z) {
        u0h u0hVar = this.J;
        if (u0hVar.b()) {
            ((a) u0hVar.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.K = z;
    }
}
