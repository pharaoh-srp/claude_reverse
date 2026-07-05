package defpackage;

import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.playservices.controllers.ResponseUtils;
import androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ka5 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Executor F;
    public final /* synthetic */ m95 G;
    public final /* synthetic */ GetCredentialException H;

    public /* synthetic */ ka5(Executor executor, m95 m95Var, GetCredentialException getCredentialException, int i) {
        this.E = i;
        this.F = executor;
        this.G = m95Var;
        this.H = getCredentialException;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        GetCredentialException getCredentialException = this.H;
        m95 m95Var = this.G;
        Executor executor = this.F;
        switch (i) {
            case 0:
                return CredentialProviderGetDigitalCredentialController.invokePlayServices$lambda$2$0(executor, m95Var, getCredentialException);
            default:
                return ResponseUtils.Companion.handleGetCredentialResponse$lambda$4(executor, m95Var, getCredentialException);
        }
    }
}
