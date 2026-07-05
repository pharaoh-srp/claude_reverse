package defpackage;

import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import androidx.credentials.exceptions.ClearCredentialUnknownException;

/* JADX INFO: loaded from: classes2.dex */
public final class ga5 implements OutcomeReceiver {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ m95 F;

    public ga5(bt4 bt4Var, ha5 ha5Var) {
        this.F = bt4Var;
    }

    public final void onError(Throwable th) {
        int i = this.E;
        m95 m95Var = this.F;
        switch (i) {
            case 0:
                fa5.f(th).getClass();
                Log.i("CredManProvService", "ClearCredentialStateException error returned from framework");
                ((z22) m95Var).a(new ClearCredentialUnknownException(null));
                break;
            default:
                GetCredentialException getCredentialExceptionK = fa5.k(th);
                getCredentialExceptionK.getClass();
                Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
                String type = getCredentialExceptionK.getType();
                type.getClass();
                ((bt4) m95Var).a(urk.j(getCredentialExceptionK.getMessage(), type));
                break;
        }
    }

    public final void onResult(Object obj) {
        int i = this.E;
        m95 m95Var = this.F;
        switch (i) {
            case 0:
                Log.i("CredManProvService", "Clear result returned from framework: ");
                ((z22) m95Var).onResult((Void) obj);
                break;
            default:
                GetCredentialResponse getCredentialResponseM = fa5.m(obj);
                getCredentialResponseM.getClass();
                Log.i("CredManProvService", "GetCredentialResponse returned from framework");
                Credential credential = getCredentialResponseM.getCredential();
                credential.getClass();
                String type = credential.getType();
                type.getClass();
                Bundle data = credential.getData();
                data.getClass();
                ((bt4) m95Var).onResult(new u38(gvk.f(type, data)));
                break;
        }
    }

    public ga5(z22 z22Var) {
        this.F = z22Var;
    }
}
