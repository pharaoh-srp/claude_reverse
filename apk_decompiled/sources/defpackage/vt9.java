package defpackage;

import android.media.ImageReader;

/* JADX INFO: loaded from: classes3.dex */
public final class vt9 extends vp4 {
    public ImageReader E;
    public /* synthetic */ Object F;
    public final /* synthetic */ lyk G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt9(lyk lykVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = lykVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.o(null, this);
    }
}
