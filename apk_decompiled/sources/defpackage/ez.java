package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillManager;

/* JADX INFO: loaded from: classes.dex */
public final class ez extends ts9 implements sz7 {
    public final /* synthetic */ gz F;
    public final /* synthetic */ int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez(gz gzVar, int i) {
        super(4);
        this.F = gzVar;
        this.G = i;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        gz gzVar = this.F;
        n78 n78Var = gzVar.E;
        ((AutofillManager) n78Var.F).notifyViewEntered(gzVar.G, this.G, new Rect(iIntValue, iIntValue2, iIntValue3, iIntValue4));
        return iei.a;
    }
}
