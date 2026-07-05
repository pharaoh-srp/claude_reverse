package androidx.credentials.playservices.controllers.identitycredentials.getcredential;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.ResponseUtils;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController;
import androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import defpackage.b99;
import defpackage.bz7;
import defpackage.d88;
import defpackage.do0;
import defpackage.fe0;
import defpackage.gvk;
import defpackage.gwc;
import defpackage.iei;
import defpackage.k95;
import defpackage.m95;
import defpackage.mdj;
import defpackage.o95;
import defpackage.p95;
import defpackage.q75;
import defpackage.r38;
import defpackage.r5l;
import defpackage.t38;
import defpackage.u38;
import defpackage.u75;
import defpackage.ua5;
import defpackage.x44;
import defpackage.y5h;
import defpackage.yfd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000S\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\b\u0005*\u00011\b\u0001\u0018\u0000 42 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u00014B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ=\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R4\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00118\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u0012\u0010\"\u0012\u0004\b'\u0010(\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R(\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u0014\u0010)\u0012\u0004\b.\u0010(\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0016\u0010/\u0012\u0004\b0\u0010(R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, d2 = {"Landroidx/credentials/playservices/controllers/identitycredentials/getcredential/GetCredentialController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Lr38;", "Lcom/google/android/gms/identitycredentials/GetCredentialRequest;", "Lt38;", "Lu38;", "Landroidx/credentials/exceptions/GetCredentialException;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lp95;", "option", "Lo95;", "convertCredentialOptionToPlayServices", "(Lp95;)Lo95;", "request", "Lm95;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "Liei;", "invokePlayServices", "(Lr38;Lm95;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "convertRequestToPlayServices", "(Lr38;)Lcom/google/android/gms/identitycredentials/GetCredentialRequest;", "response", "convertResponseToCredentialManager", "(Lt38;)Lu38;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lm95;", "getCallback", "()Lm95;", "setCallback", "(Lm95;)V", "getCallback$annotations", "()V", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "setExecutor", "(Ljava/util/concurrent/Executor;)V", "getExecutor$annotations", "Landroid/os/CancellationSignal;", "getCancellationSignal$annotations", "androidx/credentials/playservices/controllers/identitycredentials/getcredential/GetCredentialController$resultReceiver$1", "resultReceiver", "Landroidx/credentials/playservices/controllers/identitycredentials/getcredential/GetCredentialController$resultReceiver$1;", "Companion", "credentials-play-services-auth"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class GetCredentialController extends CredentialProviderController<r38, GetCredentialRequest, t38, u38, GetCredentialException> {
    private static final String TAG = "GetCredentialController";
    public m95 callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    public Executor executor;
    private final GetCredentialController$resultReceiver$1 resultReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController$resultReceiver$1] */
    public GetCredentialController(Context context) {
        super(context);
        context.getClass();
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int resultCode, Bundle resultData) {
                resultData.getClass();
                if (this.this$0.maybeReportErrorFromResultReceiver(resultData, new GetCredentialController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.INSTANCE), this.this$0.getExecutor(), this.this$0.getCallback(), this.this$0.cancellationSignal)) {
                    return;
                }
                ResponseUtils.INSTANCE.handleGetCredentialResponse(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), resultCode, (Intent) yfd.C(resultData, CredentialProviderBaseController.RESULT_DATA_TAG, Intent.class), this.this$0.getExecutor(), this.this$0.getCallback(), this.this$0.cancellationSignal);
            }
        };
    }

    private final o95 convertCredentialOptionToPlayServices(p95 option) {
        option.getClass();
        return new o95("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", option.a, option.b, "", "", "");
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei invokePlayServices$lambda$0(CancellationSignal cancellationSignal, GetCredentialController getCredentialController, Executor executor, m95 m95Var, gwc gwcVar) {
        boolean zCancellationReviewer$credentials_play_services_auth = CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth(cancellationSignal);
        iei ieiVar = iei.a;
        if (zCancellationReviewer$credentials_play_services_auth) {
            return ieiVar;
        }
        Intent intent = new Intent(getCredentialController.context, (Class<?>) HiddenActivity.class);
        getCredentialController.generateHiddenActivityIntent(getCredentialController.resultReceiver, intent, CredentialProviderBaseController.BEGIN_SIGN_IN_TAG);
        intent.putExtra(CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, gwcVar.E);
        try {
            getCredentialController.context.startActivity(intent);
            return ieiVar;
        } catch (Exception unused) {
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new u75(executor, m95Var, 8));
            return ieiVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei invokePlayServices$lambda$0$0(Executor executor, m95 m95Var) {
        executor.execute(new q75(m95Var, 9));
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$0$0$0(m95 m95Var) {
        m95Var.a(new GetCredentialUnknownException(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2(r38 r38Var, GetCredentialController getCredentialController, m95 m95Var, Executor executor, CancellationSignal cancellationSignal, Exception exc) {
        exc.getClass();
        if (CredentialProviderPlayServicesImpl.INSTANCE.isGetSignInIntentRequest$credentials_play_services_auth(r38Var)) {
            Log.w(TAG, "Pre-u credman get flow failed for get sign in intent; retrying with gis flow");
            new CredentialProviderGetSignInIntentController(getCredentialController.context).invokePlayServices(r38Var, m95Var, executor, cancellationSignal);
        } else {
            Log.w(TAG, "Pre-u credman get flow failed; retrying with gis flow");
            new CredentialProviderBeginSignInController(getCredentialController.context).invokePlayServices(r38Var, m95Var, executor, cancellationSignal);
        }
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public GetCredentialRequest convertRequestToPlayServices(r38 request) {
        request.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        List list = request.a;
        ArrayList arrayList = new ArrayList(x44.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(convertCredentialOptionToPlayServices((p95) it.next()));
        }
        return new GetCredentialRequest(arrayList, bundle, null, new ResultReceiver(null));
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public u38 convertResponseToCredentialManager(t38 response) {
        response.getClass();
        k95 k95Var = response.E;
        return new u38(gvk.f(k95Var.E, k95Var.F));
    }

    public final m95 getCallback() {
        m95 m95Var = this.callback;
        if (m95Var != null) {
            return m95Var;
        }
        x44.o0("callback");
        throw null;
    }

    public final Context getContext() {
        return this.context;
    }

    public final Executor getExecutor() {
        Executor executor = this.executor;
        if (executor != null) {
            return executor;
        }
        x44.o0("executor");
        throw null;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(r38 request, final m95 callback, final Executor executor, final CancellationSignal cancellationSignal) {
        request.getClass();
        callback.getClass();
        executor.getClass();
        this.cancellationSignal = cancellationSignal;
        setCallback(callback);
        setExecutor(executor);
        if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return;
        }
        GetCredentialRequest getCredentialRequestConvertRequestToPlayServices = convertRequestToPlayServices(request);
        Context context = this.context;
        context.getClass();
        r5l r5lVarE = new b99(context, b99.k, fe0.a, d88.c).e(getCredentialRequestConvertRequestToPlayServices);
        r5lVarE.c(y5h.a, new do0(27, new bz7() { // from class: q38
            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                return GetCredentialController.invokePlayServices$lambda$0(cancellationSignal, this, executor, callback, (gwc) obj);
            }
        }));
        r5lVarE.a(new ua5(request, this, callback, executor, cancellationSignal));
    }

    public final void setCallback(m95 m95Var) {
        m95Var.getClass();
        this.callback = m95Var;
    }

    public final void setExecutor(Executor executor) {
        executor.getClass();
        this.executor = executor;
    }
}
