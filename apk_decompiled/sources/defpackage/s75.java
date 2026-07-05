package defpackage;

import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s75 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ CreatePublicKeyCredentialController F;

    public /* synthetic */ s75(CreatePublicKeyCredentialController createPublicKeyCredentialController, int i) {
        this.E = i;
        this.F = createPublicKeyCredentialController;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        CreatePublicKeyCredentialController createPublicKeyCredentialController = this.F;
        switch (i) {
            case 0:
                return CreatePublicKeyCredentialController.handleResponse$lambda$2(createPublicKeyCredentialController);
            default:
                return CreatePublicKeyCredentialController.invokePlayServices$lambda$0$1(createPublicKeyCredentialController);
        }
    }
}
