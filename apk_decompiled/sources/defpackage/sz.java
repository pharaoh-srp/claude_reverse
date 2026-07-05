package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class sz extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ c3d G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sz(c3d c3dVar, int i) {
        super(1);
        this.F = i;
        this.G = c3dVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.F;
        c3d c3dVar = this.G;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((b3d) obj).f(c3dVar, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                break;
            case 1:
                ((b3d) obj).f(c3dVar, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                break;
            case 2:
                ((b3d) obj).f(c3dVar, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                break;
            case 3:
                b3d.k((b3d) obj, c3dVar, 0, 0);
                break;
            default:
                b3d.l((b3d) obj, this.G, 0, 0, null, 12);
                break;
        }
        return ieiVar;
    }
}
