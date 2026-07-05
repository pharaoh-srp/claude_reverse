package defpackage;

import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z95 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController F;
    public final /* synthetic */ CreateCredentialException G;

    public /* synthetic */ z95(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, CreateCredentialException createCredentialException, int i) {
        this.E = i;
        this.F = credentialProviderCreatePublicKeyCredentialController;
        this.G = createCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        CreateCredentialException createCredentialException = this.G;
        CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.F;
        switch (i) {
            case 0:
                CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$4$0$0(credentialProviderCreatePublicKeyCredentialController, createCredentialException);
                break;
            case 1:
                CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$3$0(credentialProviderCreatePublicKeyCredentialController, createCredentialException);
                break;
            default:
                CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$1$0(credentialProviderCreatePublicKeyCredentialController, createCredentialException);
                break;
        }
    }
}
