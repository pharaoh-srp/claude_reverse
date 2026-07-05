package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class b6c extends e1 implements lf9 {
    public static final b6c F = new b6c(dd8.J);

    @Override // defpackage.lf9
    public final y86 D0(bz7 bz7Var) {
        return d6c.E;
    }

    @Override // defpackage.lf9
    public final CancellationException H() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.lf9
    public final boolean c() {
        return true;
    }

    @Override // defpackage.lf9, defpackage.d6e
    public final void d(CancellationException cancellationException) {
    }

    @Override // defpackage.lf9
    public final me3 i(vf9 vf9Var) {
        return d6c.E;
    }

    @Override // defpackage.lf9
    public final boolean isCancelled() {
        return false;
    }

    @Override // defpackage.lf9
    public final y86 j(boolean z, boolean z2, ty4 ty4Var) {
        return d6c.E;
    }

    @Override // defpackage.lf9
    public final Object n(tp4 tp4Var) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.lf9
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }
}
