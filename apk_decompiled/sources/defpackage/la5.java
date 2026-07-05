package defpackage;

import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.playservices.controllers.ResponseUtils;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class la5 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ m95 F;
    public final /* synthetic */ GetCredentialException G;

    public /* synthetic */ la5(m95 m95Var, GetCredentialException getCredentialException, int i) {
        this.E = i;
        this.F = m95Var;
        this.G = getCredentialException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        GetCredentialException getCredentialException = this.G;
        m95 m95Var = this.F;
        switch (i) {
            case 0:
                m95Var.a(getCredentialException);
                break;
            case 1:
                m95Var.a(getCredentialException);
                break;
            default:
                ResponseUtils.Companion.handleGetCredentialResponse$lambda$4$0(m95Var, getCredentialException);
                break;
        }
    }
}
