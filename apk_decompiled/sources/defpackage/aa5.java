package defpackage;

import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aa5 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController F;

    public /* synthetic */ aa5(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, int i) {
        this.E = i;
        this.F = credentialProviderCreatePublicKeyCredentialController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.F;
        switch (i) {
            case 0:
                CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$2$0$0(credentialProviderCreatePublicKeyCredentialController);
                break;
            default:
                CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$2(credentialProviderCreatePublicKeyCredentialController);
                break;
        }
    }
}
