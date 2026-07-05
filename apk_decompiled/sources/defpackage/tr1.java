package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tr1 implements bz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ c3d F;
    public final /* synthetic */ int G;
    public final /* synthetic */ c3d H;

    public /* synthetic */ tr1(c3d c3dVar, int i, c3d c3dVar2) {
        this.F = c3dVar;
        this.G = i;
        this.H = c3dVar2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        c3d c3dVar = this.H;
        int i2 = this.G;
        c3d c3dVar2 = this.F;
        b3d b3dVar = (b3d) obj;
        switch (i) {
            case 0:
                b3dVar.getClass();
                b3d.j(b3dVar, c3dVar2, 0L);
                b3dVar.f(c3dVar, i2, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                break;
            default:
                b3d.k(b3dVar, c3dVar2, 0, ij0.c(i2 - c3dVar2.F, 2.0f, 1.0f));
                b3d.k(b3dVar, c3dVar, c3dVar2.E, ij0.c(i2 - c3dVar.F, 2.0f, 1.0f));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ tr1(c3d c3dVar, c3d c3dVar2, int i) {
        this.F = c3dVar;
        this.H = c3dVar2;
        this.G = i;
    }
}
