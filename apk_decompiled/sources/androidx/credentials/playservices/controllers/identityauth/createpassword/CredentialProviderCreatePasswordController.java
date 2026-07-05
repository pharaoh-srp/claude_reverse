package androidx.credentials.playservices.controllers.identityauth.createpassword;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import com.google.android.gms.common.api.ApiException;
import defpackage.fc;
import defpackage.fd;
import defpackage.i75;
import defpackage.iei;
import defpackage.l65;
import defpackage.lc4;
import defpackage.m65;
import defpackage.m95;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.mr9;
import defpackage.py3;
import defpackage.v4f;
import defpackage.w4f;
import defpackage.w95;
import defpackage.x44;
import defpackage.x95;
import defpackage.xi4;
import defpackage.zy7;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000O\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\b\u0005*\u0001*\b\u0000\u0018\u0000 -2 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u0001-B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ=\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0004H\u0017¢\u0006\u0004\b!\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R(\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00108\u0002@\u0002X\u0083.¢\u0006\f\n\u0004\b\u0011\u0010$\u0012\u0004\b%\u0010&R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010'R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0015\u0010(\u0012\u0004\b)\u0010&R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"Landroidx/credentials/playservices/controllers/identityauth/createpassword/CredentialProviderCreatePasswordController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Li75;", "Lv4f;", "Liei;", "Ll65;", "Landroidx/credentials/exceptions/CreateCredentialException;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "e", "fromGmsException", "(Ljava/lang/Throwable;)Landroidx/credentials/exceptions/CreateCredentialException;", "request", "Lm95;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "invokePlayServices", "(Li75;Lm95;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "", "uniqueRequestCode", "resultCode", "handleResponse$credentials_play_services_auth", "(II)V", "handleResponse", "convertRequestToPlayServices", "(Li75;)Lv4f;", "response", "convertResponseToCredentialManager", "(Liei;)Ll65;", "Landroid/content/Context;", "Lm95;", "getCallback$annotations", "()V", "Ljava/util/concurrent/Executor;", "Landroid/os/CancellationSignal;", "getCancellationSignal$annotations", "androidx/credentials/playservices/controllers/identityauth/createpassword/CredentialProviderCreatePasswordController$resultReceiver$1", "resultReceiver", "Landroidx/credentials/playservices/controllers/identityauth/createpassword/CredentialProviderCreatePasswordController$resultReceiver$1;", "Companion", "credentials-play-services-auth"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class CredentialProviderCreatePasswordController extends CredentialProviderController<i75, v4f, iei, l65, CreateCredentialException> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "CreatePassword";
    private m95 callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    private Executor executor;
    private final CredentialProviderCreatePasswordController$resultReceiver$1 resultReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$resultReceiver$1] */
    public CredentialProviderCreatePasswordController(Context context) {
        super(context);
        context.getClass();
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int resultCode, Bundle resultData) {
                resultData.getClass();
                CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.this$0;
                CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1 credentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1 = new CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.INSTANCE);
                Executor executor = this.this$0.executor;
                if (executor == null) {
                    x44.o0("executor");
                    throw null;
                }
                m95 m95Var = this.this$0.callback;
                if (m95Var == null) {
                    x44.o0("callback");
                    throw null;
                }
                if (credentialProviderCreatePasswordController.maybeReportErrorFromResultReceiver(resultData, credentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1, executor, m95Var, this.this$0.cancellationSignal)) {
                    return;
                }
                this.this$0.handleResponse$credentials_play_services_auth(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), resultCode);
            }
        };
    }

    private final CreateCredentialException fromGmsException(Throwable e) {
        String str = ((e instanceof ApiException) && CredentialProviderBaseController.INSTANCE.getRetryables().contains(Integer.valueOf(((ApiException) e).E.E))) ? CredentialProviderBaseController.CREATE_INTERRUPTED : CredentialProviderBaseController.CREATE_UNKNOWN;
        return CredentialProviderBaseController.INSTANCE.createCredentialExceptionTypeToException$credentials_play_services_auth(str, "During save password, found password failure response from one tap " + e.getMessage());
    }

    private static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static final CredentialProviderCreatePasswordController getInstance(Context context) {
        return INSTANCE.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei handleResponse$lambda$0(CancellationSignal cancellationSignal, zy7 zy7Var) {
        zy7Var.getClass();
        CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, zy7Var);
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei handleResponse$lambda$1(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, CreateCredentialException createCredentialException) {
        createCredentialException.getClass();
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor != null) {
            executor.execute(new x95(credentialProviderCreatePasswordController, createCredentialException, 1));
            return iei.a;
        }
        x44.o0("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$1$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, CreateCredentialException createCredentialException) {
        m95 m95Var = credentialProviderCreatePasswordController.callback;
        if (m95Var != null) {
            m95Var.a(createCredentialException);
        } else {
            x44.o0("callback");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei handleResponse$lambda$2(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, l65 l65Var) {
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor != null) {
            executor.execute(new fd(credentialProviderCreatePasswordController, 20, l65Var));
            return iei.a;
        }
        x44.o0("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$2$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, l65 l65Var) {
        m95 m95Var = credentialProviderCreatePasswordController.callback;
        if (m95Var != null) {
            m95Var.onResult(l65Var);
        } else {
            x44.o0("callback");
            throw null;
        }
    }

    private static final iei invokePlayServices$lambda$0(CancellationSignal cancellationSignal, CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, w4f w4fVar) {
        boolean zCancellationReviewer$credentials_play_services_auth = CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth(cancellationSignal);
        iei ieiVar = iei.a;
        if (zCancellationReviewer$credentials_play_services_auth) {
            return ieiVar;
        }
        Intent intent = new Intent(credentialProviderCreatePasswordController.context, (Class<?>) HiddenActivity.class);
        credentialProviderCreatePasswordController.generateHiddenActivityIntent(credentialProviderCreatePasswordController.resultReceiver, intent, CredentialProviderBaseController.CREATE_PASSWORD_TAG);
        intent.putExtra(CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, w4fVar.E);
        try {
            credentialProviderCreatePasswordController.context.startActivity(intent);
            return ieiVar;
        } catch (Exception unused) {
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new xi4(5, credentialProviderCreatePasswordController));
            return ieiVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei invokePlayServices$lambda$0$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController) {
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor != null) {
            executor.execute(new fc(9, credentialProviderCreatePasswordController));
            return iei.a;
        }
        x44.o0("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$0$0$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController) {
        m95 m95Var = credentialProviderCreatePasswordController.callback;
        if (m95Var != null) {
            m95Var.a(new CreateCredentialUnknownException(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
        } else {
            x44.o0("callback");
            throw null;
        }
    }

    private static final void invokePlayServices$lambda$2(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, CancellationSignal cancellationSignal, Exception exc) {
        exc.getClass();
        CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new w95(credentialProviderCreatePasswordController, 1, credentialProviderCreatePasswordController.fromGmsException(exc)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei invokePlayServices$lambda$2$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, CreateCredentialException createCredentialException) {
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor != null) {
            executor.execute(new x95(credentialProviderCreatePasswordController, createCredentialException, 0));
            return iei.a;
        }
        x44.o0("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2$0$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, CreateCredentialException createCredentialException) {
        m95 m95Var = credentialProviderCreatePasswordController.callback;
        if (m95Var != null) {
            m95Var.a(createCredentialException);
        } else {
            x44.o0("callback");
            throw null;
        }
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public /* synthetic */ v4f convertRequestToPlayServices(i75 i75Var) {
        if (i75Var == null) {
            return convertRequestToPlayServices2((i75) null);
        }
        mr9.o();
        return null;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public l65 convertResponseToCredentialManager(iei response) {
        response.getClass();
        return new m65();
    }

    public final void handleResponse$credentials_play_services_auth(int uniqueRequestCode, int resultCode) {
        CredentialProviderBaseController.Companion companion = CredentialProviderBaseController.INSTANCE;
        if (uniqueRequestCode == companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth()) {
            if (CredentialProviderController.maybeReportErrorResultCodeCreate(resultCode, new lc4(18), new py3(10, this), this.cancellationSignal)) {
                return;
            }
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new w95(this, 0, convertResponseToCredentialManager(iei.a)));
            return;
        }
        Log.w(TAG, "Returned request code " + companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth() + " which does not match what was given " + uniqueRequestCode);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public /* synthetic */ void invokePlayServices(i75 i75Var, m95 m95Var, Executor executor, CancellationSignal cancellationSignal) {
        if (i75Var == null) {
            invokePlayServices2((i75) null, m95Var, executor, cancellationSignal);
        } else {
            mr9.o();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/credentials/playservices/controllers/identityauth/createpassword/CredentialProviderCreatePasswordController$Companion;", "", "<init>", "()V", "TAG", "", "getInstance", "Landroidx/credentials/playservices/controllers/identityauth/createpassword/CredentialProviderCreatePasswordController;", "context", "Landroid/content/Context;", "credentials-play-services-auth"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
    public static final class Companion {
        public /* synthetic */ Companion(mq5 mq5Var) {
            this();
        }

        public final CredentialProviderCreatePasswordController getInstance(Context context) {
            context.getClass();
            return new CredentialProviderCreatePasswordController(context);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: invokePlayServices, reason: avoid collision after fix types in other method */
    public void invokePlayServices2(i75 request, m95 callback, Executor executor, CancellationSignal cancellationSignal) {
        throw null;
    }

    /* JADX INFO: renamed from: convertRequestToPlayServices, reason: avoid collision after fix types in other method */
    public v4f convertRequestToPlayServices2(i75 request) {
        throw null;
    }
}
