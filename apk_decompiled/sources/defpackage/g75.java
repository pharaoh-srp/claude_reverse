package defpackage;

import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g75 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ CreatePasswordCredentialController F;
    public final /* synthetic */ CreateCredentialException G;

    public /* synthetic */ g75(CreatePasswordCredentialController createPasswordCredentialController, CreateCredentialException createCredentialException, int i) {
        this.E = i;
        this.F = createPasswordCredentialController;
        this.G = createCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        CreateCredentialException createCredentialException = this.G;
        CreatePasswordCredentialController createPasswordCredentialController = this.F;
        switch (i) {
            case 0:
                CreatePasswordCredentialController.handleResponse$lambda$1$0(createPasswordCredentialController, createCredentialException);
                break;
            default:
                CreatePasswordCredentialController.handleResponse$lambda$4$0(createPasswordCredentialController, createCredentialException);
                break;
        }
    }
}
