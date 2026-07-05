package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class sma extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ uma G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sma(uma umaVar, int i) {
        super(0);
        this.F = i;
        this.G = umaVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        uma umaVar = this.G;
        switch (i) {
            case 0:
                bna bnaVar = (bna) umaVar.M.getValue();
                float f = MTTypesetterKt.kLineSkipLimitMultiplier;
                if (bnaVar != null) {
                    float fFloatValue = ((Number) umaVar.J.getValue()).floatValue();
                    lsc lscVar = umaVar.I;
                    if (fFloatValue < MTTypesetterKt.kLineSkipLimitMultiplier) {
                        ana anaVar = (ana) lscVar.getValue();
                        if (anaVar != null) {
                            f = anaVar.a;
                        }
                    } else {
                        ana anaVar2 = (ana) lscVar.getValue();
                        f = anaVar2 != null ? anaVar2.b : 1.0f;
                    }
                }
                return Float.valueOf(f);
            case 1:
                lsc lscVar2 = umaVar.J;
                return Float.valueOf((((Boolean) umaVar.H.getValue()).booleanValue() && umaVar.f() % 2 == 0) ? -((Number) lscVar2.getValue()).floatValue() : ((Number) lscVar2.getValue()).floatValue());
            default:
                return Boolean.valueOf(umaVar.f() == ((Number) umaVar.G.getValue()).intValue() && umaVar.g() == umaVar.e());
        }
    }
}
