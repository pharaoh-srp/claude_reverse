package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r6 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ c3d F;
    public final /* synthetic */ int G;

    public /* synthetic */ r6(int i, int i2, c3d c3dVar) {
        this.E = i2;
        this.F = c3dVar;
        this.G = i;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.G;
        c3d c3dVar = this.F;
        b3d b3dVar = (b3d) obj;
        switch (i) {
            case 0:
                b3dVar.f(c3dVar, -i2, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                break;
            case 1:
                b3dVar.f(c3dVar, 0, -i2, MTTypesetterKt.kLineSkipLimitMultiplier);
                break;
            default:
                b3d.k(b3dVar, c3dVar, 0, ij0.c(i2 - c3dVar.F, 2.0f, 1.0f));
                break;
        }
        return ieiVar;
    }
}
