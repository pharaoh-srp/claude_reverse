package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class a90 extends ts9 implements bz7 {
    public final /* synthetic */ c3d[] F;
    public final /* synthetic */ b90 G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a90(c3d[] c3dVarArr, b90 b90Var, int i, int i2) {
        super(1);
        this.F = c3dVarArr;
        this.G = b90Var;
        this.H = i;
        this.I = i2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        b3d b3dVar = (b3d) obj;
        for (c3d c3dVar : this.F) {
            if (c3dVar != null) {
                long jA = this.G.a.b.a((((long) c3dVar.E) << 32) | (((long) c3dVar.F) & 4294967295L), (((long) this.H) << 32) | (((long) this.I) & 4294967295L), fu9.E);
                b3dVar.f(c3dVar, (int) (jA >> 32), (int) (jA & 4294967295L), MTTypesetterKt.kLineSkipLimitMultiplier);
            }
        }
        return iei.a;
    }
}
