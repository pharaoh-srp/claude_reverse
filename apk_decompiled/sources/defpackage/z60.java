package defpackage;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final class z60 implements Choreographer.FrameCallback {
    public final /* synthetic */ ua2 E;
    public final /* synthetic */ bz7 F;

    public z60(ua2 ua2Var, a70 a70Var, bz7 bz7Var) {
        this.E = ua2Var;
        this.F = bz7Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object hreVar;
        try {
            hreVar = this.F.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            hreVar = new hre(th);
        }
        this.E.resumeWith(hreVar);
    }
}
