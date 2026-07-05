package defpackage;

import android.view.autofill.AutofillValue;

/* JADX INFO: loaded from: classes2.dex */
public final class t6i extends ko3 {
    public wrh r0;

    @Override // defpackage.u0
    public final void s1(ekf ekfVar) {
        ckf.x(ekfVar, this.r0);
        ckf.k(ekfVar, lz1.I);
        ckf.o(ekfVar, new g20(AutofillValue.forToggle(this.r0 != wrh.G)));
        ckf.h(ekfVar, new urh(ekfVar, 1));
    }
}
