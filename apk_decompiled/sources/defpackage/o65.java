package defpackage;

import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController;
import androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o65 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Executor F;
    public final /* synthetic */ m95 G;
    public final /* synthetic */ Exception H;

    public /* synthetic */ o65(Exception exc, Executor executor, m95 m95Var) {
        this.E = 3;
        this.H = exc;
        this.F = executor;
        this.G = m95Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        m95 m95Var = this.G;
        Executor executor = this.F;
        Exception exc = this.H;
        switch (i) {
            case 0:
                return CreateDigitalCredentialController.invokePlayServices$lambda$2$0(executor, m95Var, exc);
            case 1:
                return CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$0$1(executor, m95Var, exc);
            case 2:
                return CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$0$1(executor, m95Var, exc);
            default:
                return CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2$0$0(exc, executor, m95Var);
        }
    }

    public /* synthetic */ o65(Executor executor, m95 m95Var, Exception exc, int i) {
        this.E = i;
        this.F = executor;
        this.G = m95Var;
        this.H = exc;
    }
}
