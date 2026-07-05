package defpackage;

import androidx.credentials.playservices.controllers.ResponseUtils;
import androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pa5 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Executor F;
    public final /* synthetic */ m95 G;
    public final /* synthetic */ u38 H;

    public /* synthetic */ pa5(Executor executor, m95 m95Var, u38 u38Var, int i) {
        this.E = i;
        this.F = executor;
        this.G = m95Var;
        this.H = u38Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        u38 u38Var = this.H;
        m95 m95Var = this.G;
        Executor executor = this.F;
        switch (i) {
            case 0:
                return CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$0$0(executor, m95Var, u38Var);
            default:
                return ResponseUtils.Companion.handleGetCredentialResponse$lambda$3(executor, m95Var, u38Var);
        }
    }
}
