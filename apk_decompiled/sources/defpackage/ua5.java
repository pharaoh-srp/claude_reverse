package defpackage;

import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ua5 implements cec {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ m95 F;
    public final /* synthetic */ Executor G;
    public final /* synthetic */ CancellationSignal H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    public /* synthetic */ ua5(r38 r38Var, GetCredentialController getCredentialController, m95 m95Var, Executor executor, CancellationSignal cancellationSignal) {
        this.I = r38Var;
        this.J = getCredentialController;
        this.F = m95Var;
        this.G = executor;
        this.H = cancellationSignal;
    }

    @Override // defpackage.cec
    public final void onFailure(Exception exc) {
        int i = this.E;
        Object obj = this.J;
        Object obj2 = this.I;
        switch (i) {
            case 0:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$6((CredentialProviderPlayServicesImpl) obj2, (zn3) obj, this.H, this.G, this.F, exc);
                break;
            default:
                GetCredentialController.invokePlayServices$lambda$2((r38) obj2, (GetCredentialController) obj, this.F, this.G, this.H, exc);
                break;
        }
    }

    public /* synthetic */ ua5(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, zn3 zn3Var, CancellationSignal cancellationSignal, Executor executor, m95 m95Var) {
        this.I = credentialProviderPlayServicesImpl;
        this.J = zn3Var;
        this.H = cancellationSignal;
        this.G = executor;
        this.F = m95Var;
    }
}
