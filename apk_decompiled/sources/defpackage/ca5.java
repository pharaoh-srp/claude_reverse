package defpackage;

import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ca5 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController F;
    public final /* synthetic */ Throwable G;

    public /* synthetic */ ca5(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th, int i) {
        this.E = i;
        this.F = credentialProviderCreatePublicKeyCredentialController;
        this.G = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        Throwable th = this.G;
        CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.F;
        switch (i) {
            case 0:
                CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$1$0(credentialProviderCreatePublicKeyCredentialController, th);
                break;
            default:
                CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$6$0(credentialProviderCreatePublicKeyCredentialController, th);
                break;
        }
    }
}
