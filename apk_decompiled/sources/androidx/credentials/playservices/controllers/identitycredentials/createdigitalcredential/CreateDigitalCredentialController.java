package androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential;

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
import androidx.credentials.playservices.controllers.identitycredentials.IdentityCredentialApiHiddenActivity;
import defpackage.d44;
import defpackage.fc;
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
import defpackage.n65;
import defpackage.o65;
import defpackage.p65;
import defpackage.py3;
import defpackage.q65;
import defpackage.quk;
import defpackage.x44;
import defpackage.xi4;
import defpackage.zsj;
import defpackage.zy7;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000U\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\b\u0006*\u00012\b\u0001\u0018\u0000 62 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u00016B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00022\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00152\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"R4\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00158\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u0016\u0010#\u0012\u0004\b(\u0010)\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R(\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u0018\u0010*\u0012\u0004\b/\u0010)\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u001a\u00100\u0012\u0004\b1\u0010)R\u001a\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\f\n\u0004\b3\u00104\u0012\u0004\b5\u0010)¨\u00067"}, d2 = {"Landroidx/credentials/playservices/controllers/identitycredentials/createdigitalcredential/CreateDigitalCredentialController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Lq65;", "Li65;", "Lk65;", "Ll65;", "Landroidx/credentials/exceptions/CreateCredentialException;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "uniqueRequestCode", "resultCode", "Landroid/content/Intent;", "data", "Liei;", "handleResponse$credentials_play_services_auth", "(IILandroid/content/Intent;)V", "handleResponse", "request", "Lm95;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "invokePlayServices", "(Lq65;Lm95;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "convertRequestToPlayServices", "(Lq65;)Li65;", "response", "convertResponseToCredentialManager", "(Lk65;)Ll65;", "Landroid/content/Context;", "Lm95;", "getCallback", "()Lm95;", "setCallback", "(Lm95;)V", "getCallback$annotations", "()V", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "setExecutor", "(Ljava/util/concurrent/Executor;)V", "getExecutor$annotations", "Landroid/os/CancellationSignal;", "getCancellationSignal$annotations", "androidx/credentials/playservices/controllers/identitycredentials/createdigitalcredential/CreateDigitalCredentialController$resultReceiver$1", "resultReceiver", "Landroidx/credentials/playservices/controllers/identitycredentials/createdigitalcredential/CreateDigitalCredentialController$resultReceiver$1;", "getResultReceiver$annotations", "Companion", "credentials-play-services-auth"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class CreateDigitalCredentialController extends CredentialProviderController<q65, i65, k65, l65, CreateCredentialException> {
    private static final Companion Companion = new Companion(null);
    private static final String TAG = "DigitalCredentialClient";
    public m95 callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    public Executor executor;
    private final CreateDigitalCredentialController$resultReceiver$1 resultReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController$resultReceiver$1] */
    public CreateDigitalCredentialController(Context context) {
        super(context);
        context.getClass();
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int resultCode, Bundle resultData) {
                resultData.getClass();
                if (this.this$0.maybeReportErrorFromResultReceiver(resultData, new CreateDigitalCredentialController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.INSTANCE), this.this$0.getExecutor(), this.this$0.getCallback(), this.this$0.cancellationSignal)) {
                    return;
                }
                this.this$0.handleResponse$credentials_play_services_auth(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), resultCode, (Intent) resultData.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
            }
        };
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    private static /* synthetic */ void getResultReceiver$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei handleResponse$lambda$0(CancellationSignal cancellationSignal, zy7 zy7Var) {
        zy7Var.getClass();
        CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, zy7Var);
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei handleResponse$lambda$1(CreateDigitalCredentialController createDigitalCredentialController, CreateCredentialException createCredentialException) {
        createCredentialException.getClass();
        createDigitalCredentialController.getExecutor().execute(new n65(createDigitalCredentialController, createCredentialException, 1));
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$1$0(CreateDigitalCredentialController createDigitalCredentialController, CreateCredentialException createCredentialException) {
        createDigitalCredentialController.getCallback().a(createCredentialException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei handleResponse$lambda$2(CreateDigitalCredentialController createDigitalCredentialController) {
        createDigitalCredentialController.getExecutor().execute(new fc(7, createDigitalCredentialController));
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$2$0(CreateDigitalCredentialController createDigitalCredentialController) {
        createDigitalCredentialController.getCallback().a(new CreateCredentialUnknownException("No provider data returned."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei handleResponse$lambda$3(CreateDigitalCredentialController createDigitalCredentialController, CreateCredentialException createCredentialException) {
        createDigitalCredentialController.getExecutor().execute(new n65(createDigitalCredentialController, createCredentialException, 0));
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$3$0(CreateDigitalCredentialController createDigitalCredentialController, CreateCredentialException createCredentialException) {
        m95 callback = createDigitalCredentialController.getCallback();
        if (createCredentialException == null) {
            createCredentialException = new CreateCredentialUnknownException("Unexpected configuration error");
        }
        callback.a(createCredentialException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei handleResponse$lambda$4(CreateDigitalCredentialController createDigitalCredentialController, l65 l65Var) {
        createDigitalCredentialController.getExecutor().execute(new fd(createDigitalCredentialController, 12, l65Var));
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$4$0(CreateDigitalCredentialController createDigitalCredentialController, l65 l65Var) {
        createDigitalCredentialController.getCallback().onResult(l65Var);
    }

    private static final iei invokePlayServices$lambda$0(CancellationSignal cancellationSignal, CreateDigitalCredentialController createDigitalCredentialController, h65 h65Var) {
        boolean zCancellationReviewer$credentials_play_services_auth = CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth(cancellationSignal);
        iei ieiVar = iei.a;
        if (zCancellationReviewer$credentials_play_services_auth) {
            return ieiVar;
        }
        Intent intent = new Intent(createDigitalCredentialController.context, (Class<?>) IdentityCredentialApiHiddenActivity.class);
        intent.setFlags(65536);
        intent.putExtra(CredentialProviderBaseController.RESULT_RECEIVER_TAG, createDigitalCredentialController.toIpcFriendlyResultReceiver(createDigitalCredentialController.resultReceiver));
        intent.putExtra(CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, h65Var.E);
        intent.putExtra(CredentialProviderBaseController.EXTRA_ERROR_NAME, CredentialProviderBaseController.CREATE_UNKNOWN);
        createDigitalCredentialController.context.startActivity(intent);
        return ieiVar;
    }

    private static final void invokePlayServices$lambda$2(CancellationSignal cancellationSignal, Executor executor, m95 m95Var, Exception exc) {
        exc.getClass();
        CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new o65(executor, m95Var, exc, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei invokePlayServices$lambda$2$0(Executor executor, m95 m95Var, Exception exc) {
        executor.execute(new p65(m95Var, exc, 0));
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2$0$0(m95 m95Var, Exception exc) {
        m95Var.a(new CreateCredentialUnknownException(exc.getMessage()));
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public /* synthetic */ i65 convertRequestToPlayServices(q65 q65Var) {
        if (q65Var == null) {
            return convertRequestToPlayServices2((q65) null);
        }
        mr9.o();
        return null;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public l65 convertResponseToCredentialManager(k65 response) {
        response.getClass();
        return quk.g("androidx.credentials.TYPE_DIGITAL_CREDENTIAL", response.F);
    }

    public final m95 getCallback() {
        m95 m95Var = this.callback;
        if (m95Var != null) {
            return m95Var;
        }
        x44.o0("callback");
        throw null;
    }

    public final Executor getExecutor() {
        Executor executor = this.executor;
        if (executor != null) {
            return executor;
        }
        x44.o0("executor");
        throw null;
    }

    public final void handleResponse$credentials_play_services_auth(int uniqueRequestCode, int resultCode, Intent data) {
        CredentialProviderBaseController.Companion companion = CredentialProviderBaseController.INSTANCE;
        if (uniqueRequestCode != companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth()) {
            Log.w(TAG, "Returned request code " + companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth() + " which  does not match what was given " + uniqueRequestCode);
            return;
        }
        if (CredentialProviderController.maybeReportErrorResultCodeCreate(resultCode, new lc4(14), new py3(6, this), this.cancellationSignal)) {
            return;
        }
        if (data == null) {
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new xi4(3, this));
            return;
        }
        l65 l65VarI = zsj.i(data, "androidx.credentials.TYPE_DIGITAL_CREDENTIAL");
        if (l65VarI != null) {
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new d44(this, 20, l65VarI));
        } else {
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new d44(this, 19, zsj.h(data)));
        }
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public /* synthetic */ void invokePlayServices(q65 q65Var, m95 m95Var, Executor executor, CancellationSignal cancellationSignal) {
        if (q65Var == null) {
            invokePlayServices2((q65) null, m95Var, executor, cancellationSignal);
        } else {
            mr9.o();
        }
    }

    public final void setCallback(m95 m95Var) {
        m95Var.getClass();
        this.callback = m95Var;
    }

    public final void setExecutor(Executor executor) {
        executor.getClass();
        this.executor = executor;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/credentials/playservices/controllers/identitycredentials/createdigitalcredential/CreateDigitalCredentialController$Companion;", "", "<init>", "()V", "TAG", "", "credentials-play-services-auth"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
    public static final class Companion {
        public /* synthetic */ Companion(mq5 mq5Var) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: invokePlayServices, reason: avoid collision after fix types in other method */
    public void invokePlayServices2(q65 request, m95 callback, Executor executor, CancellationSignal cancellationSignal) {
        throw null;
    }

    /* JADX INFO: renamed from: convertRequestToPlayServices, reason: avoid collision after fix types in other method */
    public i65 convertRequestToPlayServices2(q65 request) {
        throw null;
    }
}
