package defpackage;

import android.view.autofill.AutofillManager;

/* JADX INFO: loaded from: classes3.dex */
public final class fz extends ts9 implements sz7 {
    public final /* synthetic */ gz F;
    public final /* synthetic */ av9 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz(gz gzVar, av9 av9Var) {
        super(4);
        this.F = gzVar;
        this.G = av9Var;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        gz gzVar = this.F;
        gzVar.J.set(iIntValue, iIntValue2, iIntValue3, iIntValue4);
        n78 n78Var = gzVar.E;
        ((AutofillManager) n78Var.F).requestAutofill(gzVar.G, this.G.F, gzVar.J);
        return iei.a;
    }
}
