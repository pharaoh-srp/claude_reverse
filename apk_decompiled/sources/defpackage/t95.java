package defpackage;

import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t95 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ CredentialProviderBeginSignInController F;
    public final /* synthetic */ GetCredentialException G;

    public /* synthetic */ t95(CredentialProviderBeginSignInController credentialProviderBeginSignInController, GetCredentialException getCredentialException, int i) {
        this.E = i;
        this.F = credentialProviderBeginSignInController;
        this.G = getCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        GetCredentialException getCredentialException = this.G;
        CredentialProviderBeginSignInController credentialProviderBeginSignInController = this.F;
        switch (i) {
            case 0:
                CredentialProviderBeginSignInController.invokePlayServices$lambda$2$0$0(credentialProviderBeginSignInController, getCredentialException);
                break;
            case 1:
                CredentialProviderBeginSignInController.handleResponse$lambda$1$0(credentialProviderBeginSignInController, getCredentialException);
                break;
            default:
                CredentialProviderBeginSignInController.handleResponse$lambda$4$0(credentialProviderBeginSignInController, getCredentialException);
                break;
        }
    }
}
