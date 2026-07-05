package androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialInterruptedException;
import androidx.credentials.exceptions.CreateCredentialNoCreateOptionException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.CreateCredentialUnsupportedException;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import defpackage.d44;
import defpackage.fd;
import defpackage.h65;
import defpackage.i65;
import defpackage.iei;
import defpackage.k65;
import defpackage.l65;
import defpackage.lc4;
import defpackage.m95;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.mr9;
import defpackage.py3;
import defpackage.q75;
import defpackage.quk;
import defpackage.r75;
import defpackage.s75;
import defpackage.t75;
import defpackage.u75;
import defpackage.v75;
import defpackage.w75;
import defpackage.x44;
import defpackage.x75;
import defpackage.yfd;
import defpackage.yg4;
import defpackage.zsj;
import defpackage.zy7;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000]\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0010\n\u0002\b\u0005*\u0001.\b\u0001\u0018\u0000 12 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u00011B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0004H\u0014¢\u0006\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010&R(\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f8\u0002@\u0002X\u0083.¢\u0006\f\n\u0004\b\r\u0010'\u0012\u0004\b(\u0010)R\u001c\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0083.¢\u0006\f\n\u0004\b\u000f\u0010*\u0012\u0004\b+\u0010)R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0011\u0010,\u0012\u0004\b-\u0010)R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Landroidx/credentials/playservices/controllers/identitycredentials/createpublickeycredential/CreatePublicKeyCredentialController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Lw75;", "Li65;", "Lk65;", "Ll65;", "Landroidx/credentials/exceptions/CreateCredentialException;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "Lm95;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "Liei;", "invokePlayServices", "(Lw75;Lm95;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "", "uniqueRequestCode", "resultCode", "Landroid/content/Intent;", "data", "handleResponse$credentials_play_services_auth", "(IILandroid/content/Intent;)V", "handleResponse", "", "e", "fromGmsException", "(Ljava/lang/Throwable;)Landroidx/credentials/exceptions/CreateCredentialException;", "convertRequestToPlayServices", "(Lw75;)Li65;", "response", "convertResponseToCredentialManager", "(Lk65;)Ll65;", "Landroid/content/Context;", "Lm95;", "getCallback$annotations", "()V", "Ljava/util/concurrent/Executor;", "getExecutor$annotations", "Landroid/os/CancellationSignal;", "getCancellationSignal$annotations", "androidx/credentials/playservices/controllers/identitycredentials/createpublickeycredential/CreatePublicKeyCredentialController$resultReceiver$1", "resultReceiver", "Landroidx/credentials/playservices/controllers/identitycredentials/createpublickeycredential/CreatePublicKeyCredentialController$resultReceiver$1;", "Companion", "credentials-play-services-auth"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class CreatePublicKeyCredentialController extends CredentialProviderController<w75, i65, k65, l65, CreateCredentialException> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "CreatePublicKey";
    private m95 callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    private Executor executor;
    private final CreatePublicKeyCredentialController$resultReceiver$1 resultReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$resultReceiver$1] */
    public CreatePublicKeyCredentialController(Context context) {
        super(context);
        context.getClass();
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int resultCode, Bundle resultData) {
                resultData.getClass();
                CreatePublicKeyCredentialController createPublicKeyCredentialController = this.this$0;
                CreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 createPublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 = new CreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.INSTANCE);
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
                if (createPublicKeyCredentialController.maybeReportErrorFromResultReceiver(resultData, createPublicKeyCredentialController$resultReceiver$1$onReceiveResult$1, executor, m95Var, this.this$0.cancellationSignal)) {
                    return;
                }
                this.this$0.handleResponse$credentials_play_services_auth(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), resultCode, (Intent) yfd.C(resultData, CredentialProviderBaseController.RESULT_DATA_TAG, Intent.class));
            }
        };
    }

    private static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    private static /* synthetic */ void getExecutor$annotations() {
    }

    public static final CreatePublicKeyCredentialController getInstance(Context context) {
        return INSTANCE.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei handleResponse$lambda$0(CancellationSignal cancellationSignal, zy7 zy7Var) {
        zy7Var.getClass();
        CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, zy7Var);
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei handleResponse$lambda$1(CreatePublicKeyCredentialController createPublicKeyCredentialController, CreateCredentialException createCredentialException) {
        createCredentialException.getClass();
        Executor executor = createPublicKeyCredentialController.executor;
        if (executor != null) {
            executor.execute(new t75(createPublicKeyCredentialController, createCredentialException, 0));
            return iei.a;
        }
        x44.o0("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$1$0(CreatePublicKeyCredentialController createPublicKeyCredentialController, CreateCredentialException createCredentialException) {
        m95 m95Var = createPublicKeyCredentialController.callback;
        if (m95Var != null) {
            m95Var.a(createCredentialException);
        } else {
            x44.o0("callback");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei handleResponse$lambda$2(CreatePublicKeyCredentialController createPublicKeyCredentialController) {
        Executor executor = createPublicKeyCredentialController.executor;
        if (executor != null) {
            executor.execute(new r75(createPublicKeyCredentialController, 0));
            return iei.a;
        }
        x44.o0("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$2$0(CreatePublicKeyCredentialController createPublicKeyCredentialController) {
        m95 m95Var = createPublicKeyCredentialController.callback;
        if (m95Var != null) {
            m95Var.a(new CreateCredentialUnknownException("No provider data returned."));
        } else {
            x44.o0("callback");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei handleResponse$lambda$3(CreatePublicKeyCredentialController createPublicKeyCredentialController, l65 l65Var) {
        Executor executor = createPublicKeyCredentialController.executor;
        if (executor != null) {
            executor.execute(new fd(createPublicKeyCredentialController, 15, l65Var));
            return iei.a;
        }
        x44.o0("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$3$0(CreatePublicKeyCredentialController createPublicKeyCredentialController, l65 l65Var) {
        m95 m95Var = createPublicKeyCredentialController.callback;
        if (m95Var != null) {
            m95Var.onResult(l65Var);
        } else {
            x44.o0("callback");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei handleResponse$lambda$4(CreatePublicKeyCredentialController createPublicKeyCredentialController, CreateCredentialException createCredentialException) {
        Executor executor = createPublicKeyCredentialController.executor;
        if (executor != null) {
            executor.execute(new t75(createPublicKeyCredentialController, createCredentialException, 1));
            return iei.a;
        }
        x44.o0("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$4$0(CreatePublicKeyCredentialController createPublicKeyCredentialController, CreateCredentialException createCredentialException) {
        m95 m95Var = createPublicKeyCredentialController.callback;
        if (m95Var == null) {
            x44.o0("callback");
            throw null;
        }
        if (createCredentialException == null) {
            createCredentialException = new CreateCredentialUnknownException("No provider data returned");
        }
        m95Var.a(createCredentialException);
    }

    private static final iei invokePlayServices$lambda$0(CancellationSignal cancellationSignal, CreatePublicKeyCredentialController createPublicKeyCredentialController, Executor executor, m95 m95Var, h65 h65Var) {
        PendingIntent pendingIntent = h65Var.E;
        k65 k65Var = h65Var.F;
        iei ieiVar = iei.a;
        if (pendingIntent == null && k65Var == null) {
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new u75(executor, m95Var, 0));
            return ieiVar;
        }
        int i = 1;
        if (pendingIntent != null) {
            Intent intent = new Intent(createPublicKeyCredentialController.context, (Class<?>) HiddenActivity.class);
            createPublicKeyCredentialController.generateHiddenActivityIntent(createPublicKeyCredentialController.resultReceiver, intent, CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG);
            intent.putExtra(CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, pendingIntent);
            try {
                createPublicKeyCredentialController.context.startActivity(intent);
            } catch (Exception unused) {
                CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new s75(createPublicKeyCredentialController, i));
            }
        }
        if (k65Var != null) {
            l65 l65VarConvertResponseToCredentialManager = createPublicKeyCredentialController.convertResponseToCredentialManager(k65Var);
            if (l65VarConvertResponseToCredentialManager instanceof x75) {
                CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new yg4(executor, m95Var, (x75) l65VarConvertResponseToCredentialManager, 11));
                return ieiVar;
            }
        }
        if (pendingIntent == null) {
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new u75(executor, m95Var, i));
        }
        return ieiVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei invokePlayServices$lambda$0$0(Executor executor, m95 m95Var) {
        executor.execute(new q75(m95Var, 0));
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$0$0$0(m95 m95Var) {
        m95Var.a(new CreateCredentialUnknownException(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei invokePlayServices$lambda$0$1(CreatePublicKeyCredentialController createPublicKeyCredentialController) {
        Executor executor = createPublicKeyCredentialController.executor;
        if (executor != null) {
            executor.execute(new r75(createPublicKeyCredentialController, 1));
            return iei.a;
        }
        x44.o0("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$0$1$0(CreatePublicKeyCredentialController createPublicKeyCredentialController) {
        m95 m95Var = createPublicKeyCredentialController.callback;
        if (m95Var != null) {
            m95Var.a(new CreateCredentialUnknownException(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
        } else {
            x44.o0("callback");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei invokePlayServices$lambda$0$2(Executor executor, m95 m95Var, l65 l65Var) {
        executor.execute(new v75(m95Var, l65Var, 0));
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei invokePlayServices$lambda$0$3(Executor executor, m95 m95Var) {
        executor.execute(new q75(m95Var, 1));
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$0$3$0(m95 m95Var) {
        m95Var.a(new CreateCredentialUnknownException(null));
    }

    private static final void invokePlayServices$lambda$2(w75 w75Var, CreatePublicKeyCredentialController createPublicKeyCredentialController, m95 m95Var, Executor executor, CancellationSignal cancellationSignal, Exception exc) {
        exc.getClass();
        throw null;
    }

    private static final iei invokePlayServices$lambda$2$0(CreatePublicKeyCredentialController createPublicKeyCredentialController, Exception exc, Executor executor, m95 m95Var) {
        exc.getClass();
        executor.execute(new fd(m95Var, 14, createPublicKeyCredentialController.fromGmsException(exc)));
        return iei.a;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public /* synthetic */ i65 convertRequestToPlayServices(w75 w75Var) {
        if (w75Var == null) {
            return convertRequestToPlayServices2((w75) null);
        }
        mr9.o();
        return null;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public l65 convertResponseToCredentialManager(k65 response) {
        response.getClass();
        return quk.g(response.E, response.F);
    }

    public final CreateCredentialException fromGmsException(Throwable e) {
        e.getClass();
        if (!(e instanceof ApiException)) {
            if (e instanceof UnsupportedApiCallException) {
                return new CreateCredentialUnsupportedException("API is unsupported");
            }
            return new CreateCredentialUnknownException("Conditional create failed, failure: " + e);
        }
        int i = ((ApiException) e).E.E;
        if (i == 16) {
            return new CreateCredentialCancellationException(e.getMessage());
        }
        if (i == 17) {
            return new CreateCredentialUnsupportedException("API is not supported: " + e.getMessage());
        }
        if (i == 8) {
            return new CreateCredentialNoCreateOptionException(e.getMessage());
        }
        if (CredentialProviderBaseController.INSTANCE.getRetryables().contains(Integer.valueOf(i))) {
            return new CreateCredentialInterruptedException(e.getMessage());
        }
        return new CreateCredentialUnknownException("Conditional create failed, failure: " + e.getMessage());
    }

    public final void handleResponse$credentials_play_services_auth(int uniqueRequestCode, int resultCode, Intent data) {
        CredentialProviderBaseController.Companion companion = CredentialProviderBaseController.INSTANCE;
        if (uniqueRequestCode != companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth()) {
            Log.w(TAG, "Returned request code " + companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth() + " does not match what was given " + uniqueRequestCode);
            return;
        }
        if (CredentialProviderController.maybeReportErrorResultCodeCreate(resultCode, new lc4(16), new py3(8, this), this.cancellationSignal)) {
            return;
        }
        if (data == null) {
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new s75(this, 0));
            return;
        }
        l65 l65VarI = zsj.i(data, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL");
        if (l65VarI != null) {
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new d44(this, 23, l65VarI));
        } else {
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new d44(this, 24, zsj.h(data)));
        }
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public /* synthetic */ void invokePlayServices(w75 w75Var, m95 m95Var, Executor executor, CancellationSignal cancellationSignal) {
        if (w75Var == null) {
            invokePlayServices2((w75) null, m95Var, executor, cancellationSignal);
        } else {
            mr9.o();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/credentials/playservices/controllers/identitycredentials/createpublickeycredential/CreatePublicKeyCredentialController$Companion;", "", "<init>", "()V", "getInstance", "Landroidx/credentials/playservices/controllers/identitycredentials/createpublickeycredential/CreatePublicKeyCredentialController;", "context", "Landroid/content/Context;", "TAG", "", "credentials-play-services-auth"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
    public static final class Companion {
        public /* synthetic */ Companion(mq5 mq5Var) {
            this();
        }

        public final CreatePublicKeyCredentialController getInstance(Context context) {
            context.getClass();
            return new CreatePublicKeyCredentialController(context);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: invokePlayServices, reason: avoid collision after fix types in other method */
    public void invokePlayServices2(w75 request, m95 callback, Executor executor, CancellationSignal cancellationSignal) {
        throw null;
    }

    /* JADX INFO: renamed from: convertRequestToPlayServices, reason: avoid collision after fix types in other method */
    public i65 convertRequestToPlayServices2(w75 request) {
        throw null;
    }
}
