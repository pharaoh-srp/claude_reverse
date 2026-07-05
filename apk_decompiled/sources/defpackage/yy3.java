package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yy3 implements bz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ wlg G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ yy3(yih yihVar, boolean z, wlg wlgVar, LinkedHashSet linkedHashSet, bz7 bz7Var, bz7 bz7Var2) {
        this.H = yihVar;
        this.F = z;
        this.G = wlgVar;
        this.I = linkedHashSet;
        this.J = bz7Var;
        this.K = bz7Var2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj2 = this.K;
        Object obj3 = this.J;
        Object obj4 = this.I;
        Object obj5 = this.H;
        wlg wlgVar = this.G;
        boolean z = this.F;
        switch (i) {
            case 0:
                yih yihVar = (yih) obj5;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj4;
                bz7 bz7Var = (bz7) obj3;
                bz7 bz7Var2 = (bz7) obj2;
                j0a j0aVar = (j0a) obj;
                j0aVar.getClass();
                if (((List) wlgVar.getValue()).isEmpty() && yihVar.d().G.length() > 0 && z) {
                    j0a.V(j0aVar, "empty_search", null, uhk.e, 2);
                } else {
                    List list = (List) wlgVar.getValue();
                    j0aVar.W(list.size(), new kp(new it2(23), 29, list), new tq(list, 7), new ta4(802480018, true, new nw(list, linkedHashSet, bz7Var, bz7Var2, 2)));
                }
                j0a.V(j0aVar, "install_cta", null, uhk.f, 2);
                break;
            default:
                List list2 = (List) obj5;
                float[] fArr = (float[]) obj4;
                List list3 = (List) obj3;
                fcc[] fccVarArr = (fcc[]) obj2;
                xd6 xd6Var = (xd6) obj;
                xd6Var.getClass();
                float fFloatValue = z ? ((Number) wlgVar.getValue()).floatValue() : MTTypesetterKt.kLineSkipLimitMultiplier;
                for (int i2 = 0; i2 < 5; i2++) {
                    ir1 ir1Var = (ir1) list2.get(i2);
                    float fSin = ((((float) Math.sin((ir1Var.c * fFloatValue) + ir1Var.d)) * 0.18f) + 1.0f) * fArr[i2];
                    long j = fccVarArr[i2].a;
                    xd6.I(xd6Var, new w0e(list3, null, j, fSin, 0), fSin, j, 120);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ yy3(boolean z, wlg wlgVar, List list, float[] fArr, List list2, fcc[] fccVarArr) {
        this.F = z;
        this.G = wlgVar;
        this.H = list;
        this.I = fArr;
        this.J = list2;
        this.K = fccVarArr;
    }
}
