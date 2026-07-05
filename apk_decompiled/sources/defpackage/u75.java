package defpackage;

import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.ResponseUtils;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u75 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Executor F;
    public final /* synthetic */ m95 G;

    public /* synthetic */ u75(Executor executor, m95 m95Var, int i) {
        this.E = i;
        this.F = executor;
        this.G = m95Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        m95 m95Var = this.G;
        Executor executor = this.F;
        switch (i) {
            case 0:
                return CreatePublicKeyCredentialController.invokePlayServices$lambda$0$0(executor, m95Var);
            case 1:
                return CreatePublicKeyCredentialController.invokePlayServices$lambda$0$3(executor, m95Var);
            case 2:
                return CredentialProviderPlayServicesImpl.onGetCredential$lambda$0(executor, m95Var);
            case 3:
                return CredentialProviderPlayServicesImpl.onGetCredential$lambda$1(executor, m95Var);
            case 4:
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$4$0(executor, m95Var);
            case 5:
                return CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$0$0(executor, m95Var);
            case 6:
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$1$0(executor, m95Var);
            case 7:
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$0(executor, m95Var);
            case 8:
                return GetCredentialController.invokePlayServices$lambda$0$0(executor, m95Var);
            default:
                return ResponseUtils.Companion.handleGetCredentialResponse$lambda$2(executor, m95Var);
        }
    }
}
