package defpackage;

import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.ResponseUtils;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q75 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ m95 F;

    public /* synthetic */ q75(m95 m95Var, int i) {
        this.E = i;
        this.F = m95Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        m95 m95Var = this.F;
        switch (i) {
            case 0:
                CreatePublicKeyCredentialController.invokePlayServices$lambda$0$0$0(m95Var);
                break;
            case 1:
                CreatePublicKeyCredentialController.invokePlayServices$lambda$0$3$0(m95Var);
                break;
            case 2:
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$1$0(m95Var);
                break;
            case 3:
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$0$0(m95Var);
                break;
            case 4:
                m95Var.onResult(null);
                break;
            case 5:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$0$0(m95Var);
                break;
            case 6:
                CredentialProviderPlayServicesImpl.onCreateCredential$lambda$0$0(m95Var);
                break;
            case 7:
                m95Var.onResult(null);
                break;
            case 8:
                m95Var.onResult(null);
                break;
            case 9:
                GetCredentialController.invokePlayServices$lambda$0$0$0(m95Var);
                break;
            case 10:
                ResponseUtils.Companion.handleGetCredentialResponse$lambda$2$0(m95Var);
                break;
            default:
                SignalCredentialStateController.invokePlayServices$lambda$0$0(m95Var);
                break;
        }
    }
}
