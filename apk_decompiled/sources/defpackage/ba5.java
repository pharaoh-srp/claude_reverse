package defpackage;

import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ba5 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController F;
    public final /* synthetic */ CreateCredentialException G;

    public /* synthetic */ ba5(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, CreateCredentialException createCredentialException, int i) {
        this.E = i;
        this.F = credentialProviderCreatePublicKeyCredentialController;
        this.G = createCredentialException;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        CreateCredentialException createCredentialException = this.G;
        CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.F;
        switch (i) {
            case 0:
                return CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$4$0(credentialProviderCreatePublicKeyCredentialController, createCredentialException);
            default:
                return CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$3(credentialProviderCreatePublicKeyCredentialController, createCredentialException);
        }
    }
}
