package defpackage;

import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n65 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ CreateDigitalCredentialController F;
    public final /* synthetic */ CreateCredentialException G;

    public /* synthetic */ n65(CreateDigitalCredentialController createDigitalCredentialController, CreateCredentialException createCredentialException, int i) {
        this.E = i;
        this.F = createDigitalCredentialController;
        this.G = createCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        CreateCredentialException createCredentialException = this.G;
        CreateDigitalCredentialController createDigitalCredentialController = this.F;
        switch (i) {
            case 0:
                CreateDigitalCredentialController.handleResponse$lambda$3$0(createDigitalCredentialController, createCredentialException);
                break;
            default:
                CreateDigitalCredentialController.handleResponse$lambda$1$0(createDigitalCredentialController, createCredentialException);
                break;
        }
    }
}
