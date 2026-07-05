package io.sentry.android.replay;

import defpackage.bsg;
import defpackage.dae;
import io.sentry.f1;
import io.sentry.j4;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements j4 {
    public final /* synthetic */ int E;
    public final /* synthetic */ dae F;

    public /* synthetic */ n(int i, dae daeVar) {
        this.E = i;
        this.F = daeVar;
    }

    @Override // io.sentry.j4
    public final void i(f1 f1Var) {
        int i = this.E;
        dae daeVar = this.F;
        switch (i) {
            case 0:
                int i2 = ReplayIntegration.V;
                f1Var.getClass();
                String strN = f1Var.N();
                daeVar.E = strN != null ? bsg.d1('.', strN, strN) : null;
                break;
            default:
                f1Var.getClass();
                daeVar.E = new ArrayList(f1Var.A());
                break;
        }
    }
}
