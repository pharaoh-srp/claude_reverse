package defpackage;

import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s95 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ CredentialProviderBeginSignInController F;
    public final /* synthetic */ GetCredentialException G;

    public /* synthetic */ s95(CredentialProviderBeginSignInController credentialProviderBeginSignInController, GetCredentialException getCredentialException, int i) {
        this.E = i;
        this.F = credentialProviderBeginSignInController;
        this.G = getCredentialException;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        GetCredentialException getCredentialException = this.G;
        CredentialProviderBeginSignInController credentialProviderBeginSignInController = this.F;
        switch (i) {
            case 0:
                return CredentialProviderBeginSignInController.handleResponse$lambda$4(credentialProviderBeginSignInController, getCredentialException);
            default:
                return CredentialProviderBeginSignInController.invokePlayServices$lambda$2$0(credentialProviderBeginSignInController, getCredentialException);
        }
    }
}
