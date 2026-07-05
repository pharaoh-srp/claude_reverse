package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r80 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ float F;

    public /* synthetic */ r80(int i, float f) {
        this.E = i;
        this.F = f;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        float f = this.F;
        switch (i) {
            case 0:
                ((xre) obj).b(Math.abs(f));
                return ieiVar;
            case 1:
                xre xreVar = (xre) obj;
                float fC = gv1.c(xreVar, f);
                float fD = gv1.d(xreVar, f);
                xreVar.m(fD != MTTypesetterKt.kLineSkipLimitMultiplier ? fC / fD : 1.0f);
                xreVar.u(gv1.a);
                return ieiVar;
            default:
                b52 b52Var = (b52) obj;
                b52Var.getClass();
                Float fValueOf = Float.valueOf(MTTypesetterKt.kLineSkipLimitMultiplier);
                long j = d54.g;
                cpc cpcVar = new cpc(fValueOf, new d54(j));
                Float fValueOf2 = Float.valueOf(f);
                long j2 = d54.b;
                return b52Var.b(new df7(lz1.J(new cpc[]{cpcVar, new cpc(fValueOf2, new d54(j2)), new cpc(Float.valueOf(1.0f - f), new d54(j2)), new cpc(Float.valueOf(1.0f), new d54(j))}, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 14), 2));
        }
    }
}
