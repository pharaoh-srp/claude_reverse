package defpackage;

import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qa5 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ CredentialProviderGetSignInIntentController F;
    public final /* synthetic */ GetCredentialException G;

    public /* synthetic */ qa5(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, GetCredentialException getCredentialException, int i) {
        this.E = i;
        this.F = credentialProviderGetSignInIntentController;
        this.G = getCredentialException;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        GetCredentialException getCredentialException = this.G;
        CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = this.F;
        switch (i) {
            case 0:
                return CredentialProviderGetSignInIntentController.handleResponse$lambda$4(credentialProviderGetSignInIntentController, getCredentialException);
            default:
                return CredentialProviderGetSignInIntentController.invokePlayServices$lambda$3$0(credentialProviderGetSignInIntentController, getCredentialException);
        }
    }
}
