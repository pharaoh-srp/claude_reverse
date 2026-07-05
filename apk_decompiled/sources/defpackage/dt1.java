package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class dt1 extends ts9 implements bz7 {
    public final /* synthetic */ float F;
    public final /* synthetic */ float G;
    public final /* synthetic */ int H;
    public final /* synthetic */ boolean I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt1(float f, float f2, int i, boolean z) {
        super(1);
        this.F = f;
        this.G = f2;
        this.H = i;
        this.I = z;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        wo8 wo8Var = zni.b;
        xre xreVar = (xre) obj;
        float density = xreVar.W.getDensity() * this.F;
        float density2 = xreVar.W.getDensity() * this.G;
        xreVar.f((density <= MTTypesetterKt.kLineSkipLimitMultiplier || density2 <= MTTypesetterKt.kLineSkipLimitMultiplier) ? null : new at1(density, density2, this.H));
        xreVar.o(wo8Var);
        xreVar.d(this.I);
        return iei.a;
    }
}
