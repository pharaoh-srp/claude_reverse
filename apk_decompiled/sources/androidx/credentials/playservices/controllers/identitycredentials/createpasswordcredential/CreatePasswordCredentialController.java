package androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential;

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
import androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController;
import defpackage.d44;
import defpackage.f75;
import defpackage.fd;
import defpackage.g75;
import defpackage.h65;
import defpackage.h75;
import defpackage.i65;
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
import defpackage.x44;
import defpackage.yfd;
import defpackage.zsj;
import defpackage.zy7;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000O\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\b\u0005*\u0001*\b\u0001\u0018\u0000 -2 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u0001-B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010 \u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R(\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f8\u0002@\u0002X\u0083.¢\u0006\f\n\u0004\b\r\u0010$\u0012\u0004\b%\u0010&R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010'R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0011\u0010(\u0012\u0004\b)\u0010&R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"Landroidx/credentials/playservices/controllers/identitycredentials/createpasswordcredential/CreatePasswordCredentialController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Li75;", "Li65;", "Liei;", "Ll65;", "Landroidx/credentials/exceptions/CreateCredentialException;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "Lm95;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "invokePlayServices", "(Li75;Lm95;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "convertRequestToPlayServices", "(Li75;)Li65;", "response", "convertResponseToCredentialManager", "(Liei;)Ll65;", "", "uniqueRequestCode", "resultCode", "Landroid/content/Intent;", "data", "handleResponse$credentials_play_services_auth", "(IILandroid/content/Intent;)V", "handleResponse", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lm95;", "getCallback$annotations", "()V", "Ljava/util/concurrent/Executor;", "Landroid/os/CancellationSignal;", "getCancellationSignal$annotations", "androidx/credentials/playservices/controllers/identitycredentials/createpasswordcredential/CreatePasswordCredentialController$resultReceiver$1", "resultReceiver", "Landroidx/credentials/playservices/controllers/identitycredentials/createpasswordcredential/CreatePasswordCredentialController$resultReceiver$1;", "Companion", "credentials-play-services-auth"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class CreatePasswordCredentialController extends CredentialProviderController<i75, i65, iei, l65, CreateCredentialException> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "CreatePassword";
    private m95 callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    private Executor executor;
    private final CreatePasswordCredentialController$resultReceiver$1 resultReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$resultReceiver$1] */
    public CreatePasswordCredentialController(Context context) {
        super(context);
        context.getClass();
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int resultCode, Bundle resultData) {
                resultData.getClass();
                CreatePasswordCredentialController createPasswordCredentialController = this.this$0;
                CreatePasswordCredentialController$resultReceiver$1$onReceiveResult$1 createPasswordCredentialController$resultReceiver$1$onReceiveResult$1 = new CreatePasswordCredentialController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.INSTANCE);
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
                if (createPasswordCredentialController.maybeReportErrorFromResultReceiver(resultData, createPasswordCredentialController$resultReceiver$1$onReceiveResult$1, executor, m95Var, this.this$0.cancellationSignal)) {
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

    public static final CreatePasswordCredentialController getInstance(Context context) {
        return INSTANCE.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei handleResponse$lambda$0(CancellationSignal cancellationSignal, zy7 zy7Var) {
        zy7Var.getClass();
        CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, zy7Var);
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei handleResponse$lambda$1(CreatePasswordCredentialController createPasswordCredentialController, CreateCredentialException createCredentialException) {
        createCredentialException.getClass();
        Executor executor = createPasswordCredentialController.executor;
        if (executor != null) {
            executor.execute(new g75(createPasswordCredentialController, createCredentialException, 0));
            return iei.a;
        }
        x44.o0("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$1$0(CreatePasswordCredentialController createPasswordCredentialController, CreateCredentialException createCredentialException) {
        m95 m95Var = createPasswordCredentialController.callback;
        if (m95Var != null) {
            m95Var.a(createCredentialException);
        } else {
            x44.o0("callback");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei handleResponse$lambda$2(CreatePasswordCredentialController createPasswordCredentialController) {
        Executor executor = createPasswordCredentialController.executor;
        if (executor != null) {
            executor.execute(new h75(createPasswordCredentialController, 1));
            return iei.a;
        }
        x44.o0("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$2$0(CreatePasswordCredentialController createPasswordCredentialController) {
        m95 m95Var = createPasswordCredentialController.callback;
        if (m95Var != null) {
            m95Var.a(new CreateCredentialUnknownException("No provider data returned."));
        } else {
            x44.o0("callback");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei handleResponse$lambda$3(CreatePasswordCredentialController createPasswordCredentialController, l65 l65Var) {
        Executor executor = createPasswordCredentialController.executor;
        if (executor != null) {
            executor.execute(new fd(createPasswordCredentialController, 13, l65Var));
            return iei.a;
        }
        x44.o0("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$3$0(CreatePasswordCredentialController createPasswordCredentialController, l65 l65Var) {
        m95 m95Var = createPasswordCredentialController.callback;
        if (m95Var != null) {
            m95Var.onResult(l65Var);
        } else {
            x44.o0("callback");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei handleResponse$lambda$4(CreatePasswordCredentialController createPasswordCredentialController, CreateCredentialException createCredentialException) {
        Executor executor = createPasswordCredentialController.executor;
        if (executor != null) {
            executor.execute(new g75(createPasswordCredentialController, createCredentialException, 1));
            return iei.a;
        }
        x44.o0("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$4$0(CreatePasswordCredentialController createPasswordCredentialController, CreateCredentialException createCredentialException) {
        m95 m95Var = createPasswordCredentialController.callback;
        if (m95Var == null) {
            x44.o0("callback");
            throw null;
        }
        if (createCredentialException == null) {
            createCredentialException = new CreateCredentialUnknownException("No provider data returned");
        }
        m95Var.a(createCredentialException);
    }

    private static final iei invokePlayServices$lambda$0(CancellationSignal cancellationSignal, CreatePasswordCredentialController createPasswordCredentialController, h65 h65Var) {
        boolean zCancellationReviewer$credentials_play_services_auth = CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth(cancellationSignal);
        iei ieiVar = iei.a;
        if (zCancellationReviewer$credentials_play_services_auth) {
            return ieiVar;
        }
        Intent intent = new Intent(createPasswordCredentialController.context, (Class<?>) HiddenActivity.class);
        createPasswordCredentialController.generateHiddenActivityIntent(createPasswordCredentialController.resultReceiver, intent, CredentialProviderBaseController.CREATE_PASSWORD_TAG);
        intent.putExtra(CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, h65Var.E);
        try {
            createPasswordCredentialController.context.startActivity(intent);
            return ieiVar;
        } catch (Exception unused) {
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new f75(createPasswordCredentialController, 0));
            return ieiVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei invokePlayServices$lambda$0$0(CreatePasswordCredentialController createPasswordCredentialController) {
        Executor executor = createPasswordCredentialController.executor;
        if (executor != null) {
            executor.execute(new h75(createPasswordCredentialController, 0));
            return iei.a;
        }
        x44.o0("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$0$0$0(CreatePasswordCredentialController createPasswordCredentialController) {
        m95 m95Var = createPasswordCredentialController.callback;
        if (m95Var != null) {
            m95Var.a(new CreateCredentialUnknownException(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
        } else {
            x44.o0("callback");
            throw null;
        }
    }

    private static final void invokePlayServices$lambda$2(CreatePasswordCredentialController createPasswordCredentialController, i75 i75Var, m95 m95Var, Executor executor, CancellationSignal cancellationSignal, Exception exc) {
        exc.getClass();
        Log.w(TAG, "Pre-u credman create flow failed " + exc + "; retrying with gis flow");
        new CredentialProviderCreatePasswordController(createPasswordCredentialController.context).invokePlayServices2(i75Var, m95Var, executor, cancellationSignal);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public /* synthetic */ i65 convertRequestToPlayServices(i75 i75Var) {
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

    public final Context getContext() {
        return this.context;
    }

    public final void handleResponse$credentials_play_services_auth(int uniqueRequestCode, int resultCode, Intent data) {
        CredentialProviderBaseController.Companion companion = CredentialProviderBaseController.INSTANCE;
        if (uniqueRequestCode != companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth()) {
            Log.w(TAG, "Returned request code " + companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth() + " which does not match what was given " + uniqueRequestCode);
            return;
        }
        if (CredentialProviderController.maybeReportErrorResultCodeCreate(resultCode, new lc4(15), new py3(7, this), this.cancellationSignal)) {
            return;
        }
        if (data == null) {
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new f75(this, 1));
            return;
        }
        l65 l65VarI = zsj.i(data, "android.credentials.TYPE_PASSWORD_CREDENTIAL");
        if (l65VarI != null) {
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new d44(this, 21, l65VarI));
        } else {
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new d44(this, 22, zsj.h(data)));
        }
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public /* synthetic */ void invokePlayServices(i75 i75Var, m95 m95Var, Executor executor, CancellationSignal cancellationSignal) {
        if (i75Var == null) {
            invokePlayServices2((i75) null, m95Var, executor, cancellationSignal);
        } else {
            mr9.o();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/credentials/playservices/controllers/identitycredentials/createpasswordcredential/CreatePasswordCredentialController$Companion;", "", "<init>", "()V", "getInstance", "Landroidx/credentials/playservices/controllers/identitycredentials/createpasswordcredential/CreatePasswordCredentialController;", "context", "Landroid/content/Context;", "TAG", "", "credentials-play-services-auth"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
    public static final class Companion {
        public /* synthetic */ Companion(mq5 mq5Var) {
            this();
        }

        public final CreatePasswordCredentialController getInstance(Context context) {
            context.getClass();
            return new CreatePasswordCredentialController(context);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: invokePlayServices, reason: avoid collision after fix types in other method */
    public void invokePlayServices2(i75 request, m95 callback, Executor executor, CancellationSignal cancellationSignal) {
        throw null;
    }

    /* JADX INFO: renamed from: convertRequestToPlayServices, reason: avoid collision after fix types in other method */
    public i65 convertRequestToPlayServices2(i75 request) {
        throw null;
    }
}
