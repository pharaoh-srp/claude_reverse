package defpackage;

import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController;
import androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p65 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ m95 F;
    public final /* synthetic */ Exception G;

    public /* synthetic */ p65(m95 m95Var, Exception exc, int i) {
        this.E = i;
        this.F = m95Var;
        this.G = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.E) {
            case 0:
                CreateDigitalCredentialController.invokePlayServices$lambda$2$0$0(this.F, this.G);
                break;
            case 1:
                CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$0$1$0(this.F, this.G);
                break;
            case 2:
                CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$0$1$0(this.F, this.G);
                break;
            default:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2$0$0$0(this.F, this.G);
                break;
        }
    }
}
