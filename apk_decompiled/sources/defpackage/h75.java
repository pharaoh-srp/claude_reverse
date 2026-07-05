package defpackage;

import androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h75 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ CreatePasswordCredentialController F;

    public /* synthetic */ h75(CreatePasswordCredentialController createPasswordCredentialController, int i) {
        this.E = i;
        this.F = createPasswordCredentialController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        CreatePasswordCredentialController createPasswordCredentialController = this.F;
        switch (i) {
            case 0:
                CreatePasswordCredentialController.invokePlayServices$lambda$0$0$0(createPasswordCredentialController);
                break;
            default:
                CreatePasswordCredentialController.handleResponse$lambda$2$0(createPasswordCredentialController);
                break;
        }
    }
}
