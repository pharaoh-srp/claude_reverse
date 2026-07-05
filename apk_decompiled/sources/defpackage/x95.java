package defpackage;

import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class x95 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ CredentialProviderCreatePasswordController F;
    public final /* synthetic */ CreateCredentialException G;

    public /* synthetic */ x95(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, CreateCredentialException createCredentialException, int i) {
        this.E = i;
        this.F = credentialProviderCreatePasswordController;
        this.G = createCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        CreateCredentialException createCredentialException = this.G;
        CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.F;
        switch (i) {
            case 0:
                CredentialProviderCreatePasswordController.invokePlayServices$lambda$2$0$0(credentialProviderCreatePasswordController, createCredentialException);
                break;
            default:
                CredentialProviderCreatePasswordController.handleResponse$lambda$1$0(credentialProviderCreatePasswordController, createCredentialException);
                break;
        }
    }
}
