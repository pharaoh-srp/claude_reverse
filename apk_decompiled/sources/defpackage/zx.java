package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zx implements bz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ float F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ zx(float f, aae aaeVar, qy qyVar, aae aaeVar2) {
        this.F = f;
        this.G = aaeVar;
        this.I = qyVar;
        this.H = aaeVar2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj2 = this.I;
        Object obj3 = this.H;
        final float f = this.F;
        Object obj4 = this.G;
        switch (i) {
            case 0:
                aae aaeVar = (aae) obj4;
                qy qyVar = (qy) obj2;
                aae aaeVar2 = (aae) obj3;
                lb0 lb0Var = (lb0) obj;
                lsc lscVar = lb0Var.e;
                if ((((Number) lscVar.getValue()).floatValue() < f && aaeVar.E > f) || (((Number) lscVar.getValue()).floatValue() > f && aaeVar.E < f)) {
                    float fFloatValue = ((Number) lscVar.getValue()).floatValue();
                    float fFloatValue2 = MTTypesetterKt.kLineSkipLimitMultiplier;
                    if (f == MTTypesetterKt.kLineSkipLimitMultiplier) {
                        f = 0.0f;
                    } else if (f <= MTTypesetterKt.kLineSkipLimitMultiplier ? fFloatValue >= f : fFloatValue <= f) {
                        f = fFloatValue;
                    }
                    qyVar.a(f, ((Number) lb0Var.b()).floatValue());
                    if (!Float.isNaN(((Number) lb0Var.b()).floatValue())) {
                        fFloatValue2 = ((Number) lb0Var.b()).floatValue();
                    }
                    aaeVar2.E = fFloatValue2;
                    aaeVar.E = f;
                    lb0Var.a();
                } else {
                    qyVar.a(((Number) lscVar.getValue()).floatValue(), ((Number) lb0Var.b()).floatValue());
                    aaeVar2.E = ((Number) lb0Var.b()).floatValue();
                    aaeVar.E = ((Number) lscVar.getValue()).floatValue();
                }
                break;
            default:
                List list = (List) obj4;
                j0a j0aVar = (j0a) obj;
                j0aVar.getClass();
                j0aVar.Y("top_spacer", null, new ta4(1284286527, true, new sz7() { // from class: f1j
                    @Override // defpackage.sz7
                    public final Object i(Object obj5, Object obj6, Object obj7, Object obj8) {
                        ((Integer) obj6).getClass();
                        ld4 ld4Var = (ld4) obj7;
                        int iIntValue = ((Integer) obj8).intValue();
                        ((px9) obj5).getClass();
                        e18 e18Var = (e18) ld4Var;
                        if (e18Var.Q(iIntValue & 1, (iIntValue & 129) != 128)) {
                            kxk.g(e18Var, b.e(b.c(fqb.E, 1.0f), f));
                        } else {
                            e18Var.T();
                        }
                        return iei.a;
                    }
                }));
                j0aVar.W(list.size(), new zkd(new hzh(10), 20, list), new wxf(list, 9), new ta4(2039820996, true, new lp(list, (fn1) obj3, (lvh) obj2, 12)));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ zx(List list, float f, fn1 fn1Var, lvh lvhVar) {
        this.G = list;
        this.F = f;
        this.H = fn1Var;
        this.I = lvhVar;
    }
}
