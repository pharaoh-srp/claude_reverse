package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class t40 extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ c3d G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t40(c3d c3dVar, int i) {
        super(1);
        this.F = i;
        this.G = c3dVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.F;
        iei ieiVar = iei.a;
        c3d c3dVar = this.G;
        switch (i) {
            case 0:
                b3d.k((b3d) obj, c3dVar, 0, 0);
                break;
            case 1:
                ((b3d) obj).f(c3dVar, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                break;
            case 2:
                ((b3d) obj).f(c3dVar, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                break;
            default:
                b3d b3dVar = (b3d) obj;
                b3dVar.getClass();
                b3d.k(b3dVar, c3dVar, 0, 0);
                break;
        }
        return ieiVar;
    }
}
