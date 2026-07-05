package defpackage;

import android.view.autofill.AutofillValue;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class urh implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ekf F;

    public /* synthetic */ urh(ekf ekfVar, int i) {
        this.E = i;
        this.F = ekfVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        Boolean boolValueOf;
        int i = this.E;
        boolean z = false;
        wrh wrhVar = wrh.F;
        wrh wrhVar2 = wrh.E;
        ekf ekfVar = this.F;
        g20 g20Var = (g20) obj;
        switch (i) {
            case 0:
                AutofillValue autofillValue = g20Var.a;
                boolValueOf = autofillValue.isToggle() ? Boolean.valueOf(autofillValue.getToggleValue()) : null;
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        wrhVar = wrhVar2;
                    }
                    ckf.x(ekfVar, wrhVar);
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                AutofillValue autofillValue2 = g20Var.a;
                boolValueOf = autofillValue2.isToggle() ? Boolean.valueOf(autofillValue2.getToggleValue()) : null;
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        wrhVar = wrhVar2;
                    }
                    ckf.x(ekfVar, wrhVar);
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
