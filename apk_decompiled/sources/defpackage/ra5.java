package defpackage;

import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ra5 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ CredentialProviderGetSignInIntentController F;
    public final /* synthetic */ GetCredentialException G;

    public /* synthetic */ ra5(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, GetCredentialException getCredentialException, int i) {
        this.E = i;
        this.F = credentialProviderGetSignInIntentController;
        this.G = getCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        GetCredentialException getCredentialException = this.G;
        CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = this.F;
        switch (i) {
            case 0:
                CredentialProviderGetSignInIntentController.invokePlayServices$lambda$3$0$0(credentialProviderGetSignInIntentController, getCredentialException);
                break;
            case 1:
                CredentialProviderGetSignInIntentController.handleResponse$lambda$1$0(credentialProviderGetSignInIntentController, getCredentialException);
                break;
            default:
                CredentialProviderGetSignInIntentController.handleResponse$lambda$4$0(credentialProviderGetSignInIntentController, getCredentialException);
                break;
        }
    }
}
