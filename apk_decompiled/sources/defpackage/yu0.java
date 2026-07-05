package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yu0 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;

    public /* synthetic */ yu0(boolean z, boolean z2, int i) {
        this.E = i;
        this.F = z;
        this.G = z2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        float density = MTTypesetterKt.kLineSkipLimitMultiplier;
        boolean z = this.G;
        boolean z2 = this.F;
        xre xreVar = (xre) obj;
        xreVar.getClass();
        switch (i) {
            case 0:
                if (z2 || z) {
                    density = 8.0f;
                }
                xreVar.n(density);
                break;
            default:
                xreVar.k(z2 ? -20.0f : z ? 20.0f : 0.0f);
                if (z2 || z) {
                    density = xreVar.W.getDensity() * 4.0f;
                }
                xreVar.w(density);
                break;
        }
        return ieiVar;
    }
}
