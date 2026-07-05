package defpackage;

import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t75 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ CreatePublicKeyCredentialController F;
    public final /* synthetic */ CreateCredentialException G;

    public /* synthetic */ t75(CreatePublicKeyCredentialController createPublicKeyCredentialController, CreateCredentialException createCredentialException, int i) {
        this.E = i;
        this.F = createPublicKeyCredentialController;
        this.G = createCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        CreateCredentialException createCredentialException = this.G;
        CreatePublicKeyCredentialController createPublicKeyCredentialController = this.F;
        switch (i) {
            case 0:
                CreatePublicKeyCredentialController.handleResponse$lambda$1$0(createPublicKeyCredentialController, createCredentialException);
                break;
            default:
                CreatePublicKeyCredentialController.handleResponse$lambda$4$0(createPublicKeyCredentialController, createCredentialException);
                break;
        }
    }
}
