package defpackage;

import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController;
import androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class da5 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Executor F;
    public final /* synthetic */ m95 G;
    public final /* synthetic */ dae H;

    public /* synthetic */ da5(Executor executor, m95 m95Var, dae daeVar, int i) {
        this.E = i;
        this.F = executor;
        this.G = m95Var;
        this.H = daeVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        dae daeVar = this.H;
        m95 m95Var = this.G;
        Executor executor = this.F;
        switch (i) {
            case 0:
                return CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$2$0(executor, m95Var, daeVar);
            case 1:
                return CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$2$0(executor, m95Var, daeVar);
            default:
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$3$0(executor, m95Var, daeVar);
        }
    }
}
