package defpackage;

import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r75 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ CreatePublicKeyCredentialController F;

    public /* synthetic */ r75(CreatePublicKeyCredentialController createPublicKeyCredentialController, int i) {
        this.E = i;
        this.F = createPublicKeyCredentialController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        CreatePublicKeyCredentialController createPublicKeyCredentialController = this.F;
        switch (i) {
            case 0:
                CreatePublicKeyCredentialController.handleResponse$lambda$2$0(createPublicKeyCredentialController);
                break;
            default:
                CreatePublicKeyCredentialController.invokePlayServices$lambda$0$1$0(createPublicKeyCredentialController);
                break;
        }
    }
}
