package defpackage;

import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y95 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController F;
    public final /* synthetic */ JSONException G;

    public /* synthetic */ y95(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException, int i) {
        this.E = i;
        this.F = credentialProviderCreatePublicKeyCredentialController;
        this.G = jSONException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        JSONException jSONException = this.G;
        CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.F;
        switch (i) {
            case 0:
                CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$5$0(credentialProviderCreatePublicKeyCredentialController, jSONException);
                break;
            default:
                CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$0$0(credentialProviderCreatePublicKeyCredentialController, jSONException);
                break;
        }
    }
}
