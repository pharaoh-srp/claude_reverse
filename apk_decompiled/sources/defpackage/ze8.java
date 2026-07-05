package defpackage;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ze8 implements Choreographer.FrameCallback {
    public final /* synthetic */ ua2 E;

    public /* synthetic */ ze8(ua2 ua2Var) {
        this.E = ua2Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        ft5 ft5Var = g86.a;
        this.E.F(tpa.a, Long.valueOf(j));
    }
}
