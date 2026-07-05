package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zvf extends e1 implements f45 {
    public final /* synthetic */ drh F;
    public final /* synthetic */ wm0 G;
    public final /* synthetic */ Context H;

    /* JADX WARN: Illegal instructions before constructor call */
    public zvf(drh drhVar, wm0 wm0Var, Context context) {
        zp3 zp3Var = zp3.G;
        this.F = drhVar;
        this.G = wm0Var;
        this.H = context;
        super(zp3Var);
    }

    @Override // defpackage.f45
    public final void x(c45 c45Var, Throwable th) {
        wm0 wm0Var = this.G;
        Context context = this.H;
        drh drhVar = this.F;
        gb9.D(drhVar, null, null, new lza(wm0Var, context, th, drhVar, (tp4) null, 13), 3);
    }
}
