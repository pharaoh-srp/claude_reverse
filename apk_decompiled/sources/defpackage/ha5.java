package defpackage;

import android.content.Context;
import android.credentials.CredentialManager;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialRequest;
import android.credentials.GetCredentialResponse;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import android.util.Log;
import androidx.credentials.exceptions.ClearCredentialUnsupportedException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class ha5 implements q95 {
    public final CredentialManager a;

    public ha5(Context context) {
        context.getClass();
        this.a = ds.e(context.getSystemService("credential"));
    }

    @Override // defpackage.q95
    public final boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.a != null;
    }

    @Override // defpackage.q95
    public final void onClearCredential(zn3 zn3Var, CancellationSignal cancellationSignal, Executor executor, m95 m95Var) {
        Log.i("CredManProvService", "In CredentialProviderFrameworkImpl onClearCredential");
        z22 z22Var = (z22) m95Var;
        CredentialManager credentialManager = this.a;
        if (credentialManager == null) {
            z22Var.a(new ClearCredentialUnsupportedException("Your device doesn't support credential manager", "androidx.credentials.TYPE_CLEAR_CREDENTIAL_UNSUPPORTED_EXCEPTION"));
            return;
        }
        ga5 ga5Var = new ga5(z22Var);
        credentialManager.getClass();
        ds.v();
        credentialManager.clearCredentialState(ds.d(new Bundle()), cancellationSignal, (ao0) executor, ga5Var);
    }

    @Override // defpackage.q95
    public final void onGetCredential(Context context, r38 r38Var, CancellationSignal cancellationSignal, Executor executor, m95 m95Var) {
        context.getClass();
        bt4 bt4Var = (bt4) m95Var;
        CredentialManager credentialManager = this.a;
        if (credentialManager == null) {
            bt4Var.a(new GetCredentialUnsupportedException("Your device doesn't support credential manager"));
            return;
        }
        ga5 ga5Var = new ga5(bt4Var, this);
        credentialManager.getClass();
        ds.x();
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder builderG = ds.g(bundle);
        for (p95 p95Var : r38Var.a) {
            ds.z();
            p95Var.getClass();
            builderG.addCredentialOption(ds.f(p95Var.a, p95Var.b).setIsSystemProviderRequired(true).setAllowedProviders(p95Var.c).build());
        }
        GetCredentialRequest getCredentialRequestBuild = builderG.build();
        getCredentialRequestBuild.getClass();
        credentialManager.getCredential(context, getCredentialRequestBuild, cancellationSignal, (ao0) executor, (OutcomeReceiver<GetCredentialResponse, GetCredentialException>) ga5Var);
    }
}
