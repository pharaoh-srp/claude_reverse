package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class oh6 implements bz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ c3d F;
    public final /* synthetic */ c3d G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;

    public /* synthetic */ oh6(c3d c3dVar, int i, c3d c3dVar2, int i2) {
        this.F = c3dVar;
        this.H = i;
        this.G = c3dVar2;
        this.I = i2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.I;
        int i3 = this.H;
        c3d c3dVar = this.G;
        c3d c3dVar2 = this.F;
        b3d b3dVar = (b3d) obj;
        switch (i) {
            case 0:
                b3d.k(b3dVar, c3dVar2, 0, ij0.c(i3 - c3dVar2.F, 2.0f, 1.0f));
                b3d.k(b3dVar, c3dVar, i2 - c3dVar.E, ij0.c(i3 - c3dVar.F, 2.0f, 1.0f));
                break;
            default:
                b3dVar.getClass();
                b3dVar.f(c3dVar2, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                if (c3dVar != null) {
                    b3dVar.f(c3dVar, 0, i3 - i2, MTTypesetterKt.kLineSkipLimitMultiplier);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ oh6(c3d c3dVar, c3d c3dVar2, int i, int i2) {
        this.F = c3dVar;
        this.G = c3dVar2;
        this.H = i;
        this.I = i2;
    }
}
