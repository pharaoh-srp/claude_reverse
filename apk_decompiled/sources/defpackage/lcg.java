package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lcg implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ float F;
    public final /* synthetic */ aae G;
    public final /* synthetic */ h9f H;
    public final /* synthetic */ bz7 I;

    public /* synthetic */ lcg(float f, aae aaeVar, h9f h9fVar, bz7 bz7Var, int i) {
        this.E = i;
        this.F = f;
        this.G = aaeVar;
        this.H = h9fVar;
        this.I = bz7Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        float fB;
        int i = this.E;
        iei ieiVar = iei.a;
        bz7 bz7Var = this.I;
        h9f h9fVar = this.H;
        aae aaeVar = this.G;
        float f = this.F;
        lb0 lb0Var = (lb0) obj;
        switch (i) {
            case 0:
                float fAbs = Math.abs(((Number) lb0Var.e.getValue()).floatValue());
                float fAbs2 = Math.abs(f);
                lsc lscVar = lb0Var.e;
                if (fAbs < fAbs2) {
                    dgj.m(lb0Var, h9fVar, bz7Var, ((Number) lscVar.getValue()).floatValue() - aaeVar.E);
                    aaeVar.E = ((Number) lscVar.getValue()).floatValue();
                } else {
                    float fZ = dgj.z(((Number) lscVar.getValue()).floatValue(), f);
                    dgj.m(lb0Var, h9fVar, bz7Var, fZ - aaeVar.E);
                    lb0Var.a();
                    aaeVar.E = fZ;
                }
                break;
            default:
                float fZ2 = dgj.z(((Number) lb0Var.e.getValue()).floatValue(), f);
                float f2 = fZ2 - aaeVar.E;
                try {
                    fB = h9fVar.b(f2);
                } catch (CancellationException unused) {
                    lb0Var.a();
                    fB = MTTypesetterKt.kLineSkipLimitMultiplier;
                }
                bz7Var.invoke(Float.valueOf(fB));
                if (Math.abs(f2 - fB) > 0.5f || fZ2 != ((Number) lb0Var.e.getValue()).floatValue()) {
                    lb0Var.a();
                }
                aaeVar.E += fB;
                break;
        }
        return ieiVar;
    }
}
