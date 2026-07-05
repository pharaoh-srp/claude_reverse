package defpackage;

import androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f75 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ CreatePasswordCredentialController F;

    public /* synthetic */ f75(CreatePasswordCredentialController createPasswordCredentialController, int i) {
        this.E = i;
        this.F = createPasswordCredentialController;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        CreatePasswordCredentialController createPasswordCredentialController = this.F;
        switch (i) {
            case 0:
                return CreatePasswordCredentialController.invokePlayServices$lambda$0$0(createPasswordCredentialController);
            default:
                return CreatePasswordCredentialController.handleResponse$lambda$2(createPasswordCredentialController);
        }
    }
}
