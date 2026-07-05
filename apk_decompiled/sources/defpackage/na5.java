package defpackage;

import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class na5 implements cec {
    public final /* synthetic */ int E;
    public final /* synthetic */ CancellationSignal F;
    public final /* synthetic */ Executor G;
    public final /* synthetic */ m95 H;

    public /* synthetic */ na5(CancellationSignal cancellationSignal, Executor executor, m95 m95Var, int i) {
        this.E = i;
        this.F = cancellationSignal;
        this.G = executor;
        this.H = m95Var;
    }

    @Override // defpackage.cec
    public final void onFailure(Exception exc) {
        int i = this.E;
        m95 m95Var = this.H;
        Executor executor = this.G;
        CancellationSignal cancellationSignal = this.F;
        switch (i) {
            case 0:
                CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$2(cancellationSignal, executor, m95Var, exc);
                break;
            default:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$3(cancellationSignal, executor, m95Var, exc);
                break;
        }
    }
}
