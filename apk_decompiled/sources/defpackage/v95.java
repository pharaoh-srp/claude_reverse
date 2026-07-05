package defpackage;

import androidx.credentials.playservices.controllers.CredentialProviderController;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class v95 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ bz7 F;
    public final /* synthetic */ dae G;

    public /* synthetic */ v95(bz7 bz7Var, dae daeVar, int i) {
        this.E = i;
        this.F = bz7Var;
        this.G = daeVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        dae daeVar = this.G;
        bz7 bz7Var = this.F;
        switch (i) {
            case 0:
                return CredentialProviderController.Companion.maybeReportErrorResultCodeCreate$lambda$0(bz7Var, daeVar);
            default:
                return CredentialProviderController.Companion.maybeReportErrorResultCodeGet$lambda$0(bz7Var, daeVar);
        }
    }
}
