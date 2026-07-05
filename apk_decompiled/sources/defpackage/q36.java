package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q36 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ c3d F;
    public final /* synthetic */ c3d G;

    public /* synthetic */ q36(c3d c3dVar, c3d c3dVar2, int i) {
        this.E = i;
        this.F = c3dVar;
        this.G = c3dVar2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i;
        int i2 = this.E;
        iei ieiVar = iei.a;
        c3d c3dVar = this.G;
        c3d c3dVar2 = this.F;
        b3d b3dVar = (b3d) obj;
        switch (i2) {
            case 0:
                b3dVar.getClass();
                b3dVar.f(c3dVar2, c3dVar.E, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                b3dVar.f(c3dVar, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                break;
            case 1:
                b3dVar.getClass();
                if (c3dVar2 != null) {
                    b3dVar.f(c3dVar2, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                    i = c3dVar2.E;
                } else {
                    i = 0;
                }
                b3dVar.f(c3dVar, i, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                break;
            default:
                b3dVar.getClass();
                b3d.k(b3dVar, c3dVar2, c3dVar.E - c3dVar2.E, 0);
                b3d.k(b3dVar, c3dVar, 0, 0);
                break;
        }
        return ieiVar;
    }
}
