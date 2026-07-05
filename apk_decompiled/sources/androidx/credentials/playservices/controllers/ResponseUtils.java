package androidx.credentials.playservices.controllers;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import defpackage.b4b;
import defpackage.gvk;
import defpackage.i5;
import defpackage.iei;
import defpackage.ka5;
import defpackage.la5;
import defpackage.m95;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.oa5;
import defpackage.oua;
import defpackage.pa5;
import defpackage.q75;
import defpackage.sz6;
import defpackage.u38;
import defpackage.u75;
import defpackage.urk;
import defpackage.zy7;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/credentials/playservices/controllers/ResponseUtils;", "", "<init>", "()V", "Companion", "credentials-play-services-auth"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class ResponseUtils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "GetCredentialController";

    public static final void handleGetCredentialResponse(int i, int i2, Intent intent, Executor executor, m95 m95Var, CancellationSignal cancellationSignal) {
        INSTANCE.handleGetCredentialResponse(i, i2, intent, executor, m95Var, cancellationSignal);
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/credentials/playservices/controllers/ResponseUtils$Companion;", "", "<init>", "()V", "", "uniqueRequestCode", "resultCode", "Landroid/content/Intent;", "data", "Ljava/util/concurrent/Executor;", "executor", "Lm95;", "Lu38;", "Landroidx/credentials/exceptions/GetCredentialException;", "callback", "Landroid/os/CancellationSignal;", "cancellationSignal", "Liei;", "handleGetCredentialResponse", "(IILandroid/content/Intent;Ljava/util/concurrent/Executor;Lm95;Landroid/os/CancellationSignal;)V", "", "TAG", "Ljava/lang/String;", "credentials-play-services-auth"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
    public static final class Companion {
        public /* synthetic */ Companion(mq5 mq5Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final iei handleGetCredentialResponse$lambda$0(CancellationSignal cancellationSignal, zy7 zy7Var) {
            zy7Var.getClass();
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, zy7Var);
            return iei.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final iei handleGetCredentialResponse$lambda$1(Executor executor, m95 m95Var, GetCredentialException getCredentialException) {
            getCredentialException.getClass();
            executor.execute(new la5(m95Var, getCredentialException, 1));
            return iei.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final iei handleGetCredentialResponse$lambda$2(Executor executor, m95 m95Var) {
            executor.execute(new q75(m95Var, 10));
            return iei.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void handleGetCredentialResponse$lambda$2$0(m95 m95Var) {
            m95Var.a(new GetCredentialUnknownException("No provider data returned."));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final iei handleGetCredentialResponse$lambda$3(Executor executor, m95 m95Var, u38 u38Var) {
            executor.execute(new oa5(m95Var, u38Var, 1));
            return iei.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final iei handleGetCredentialResponse$lambda$4(Executor executor, m95 m95Var, GetCredentialException getCredentialException) {
            executor.execute(new la5(m95Var, getCredentialException, 2));
            return iei.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void handleGetCredentialResponse$lambda$4$0(m95 m95Var, GetCredentialException getCredentialException) {
            if (getCredentialException == null) {
                getCredentialException = new GetCredentialUnknownException("No provider data returned");
            }
            m95Var.a(getCredentialException);
        }

        public final void handleGetCredentialResponse(int uniqueRequestCode, int resultCode, Intent data, Executor executor, m95 callback, CancellationSignal cancellationSignal) {
            String string;
            Bundle bundle;
            u38 u38Var;
            executor.getClass();
            callback.getClass();
            CredentialProviderBaseController.Companion companion = CredentialProviderBaseController.INSTANCE;
            if (uniqueRequestCode != companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth()) {
                Log.w(ResponseUtils.TAG, "Returned request code " + companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth() + " which  does not match what was given " + uniqueRequestCode);
                return;
            }
            CredentialProviderController.Companion companion2 = CredentialProviderController.INSTANCE;
            if (companion2.maybeReportErrorResultCodeGet$credentials_play_services_auth(resultCode, new oua(28), new b4b(executor, 26, callback), cancellationSignal)) {
                return;
            }
            if (data == null) {
                companion2.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new u75(executor, callback, 9));
                return;
            }
            int i = Build.VERSION.SDK_INT;
            GetCredentialException getCredentialExceptionJ = null;
            if (i >= 34) {
                u38Var = i5.d(data);
            } else {
                Bundle bundleExtra = data.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE");
                u38Var = (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE")) == null || (bundle = bundleExtra.getBundle("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA")) == null) ? null : new u38(gvk.f(string, bundle));
            }
            int i2 = 1;
            if (u38Var != null) {
                companion2.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new pa5(executor, callback, u38Var, i2));
                return;
            }
            if (i >= 34) {
                getCredentialExceptionJ = i5.c(data);
            } else {
                int i3 = GetCredentialException.E;
                Bundle bundleExtra2 = data.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION");
                if (bundleExtra2 != null) {
                    String string2 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                    if (string2 == null) {
                        sz6.p("Bundle was missing exception type.");
                        return;
                    }
                    getCredentialExceptionJ = urk.j(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string2);
                }
            }
            companion2.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new ka5(executor, callback, getCredentialExceptionJ, i2));
        }

        private Companion() {
        }
    }
}
