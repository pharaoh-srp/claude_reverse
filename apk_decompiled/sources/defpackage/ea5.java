package defpackage;

import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController;
import androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ea5 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ m95 F;
    public final /* synthetic */ dae G;

    public /* synthetic */ ea5(m95 m95Var, dae daeVar, int i) {
        this.E = i;
        this.F = m95Var;
        this.G = daeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        dae daeVar = this.G;
        m95 m95Var = this.F;
        switch (i) {
            case 0:
                CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$2$0$0(m95Var, daeVar);
                break;
            case 1:
                CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$2$0$0(m95Var, daeVar);
                break;
            case 2:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$3$0$0(m95Var, daeVar);
                break;
            default:
                SignalCredentialStateController.invokePlayServices$lambda$2$0(m95Var, daeVar);
                break;
        }
    }
}
