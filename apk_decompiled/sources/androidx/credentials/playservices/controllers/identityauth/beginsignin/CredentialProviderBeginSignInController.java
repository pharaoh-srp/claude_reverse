package androidx.credentials.playservices.controllers.identityauth.beginsignin;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import defpackage.bz7;
import defpackage.coj;
import defpackage.d44;
import defpackage.dae;
import defpackage.dgj;
import defpackage.do0;
import defpackage.fc;
import defpackage.fd;
import defpackage.iei;
import defpackage.j6g;
import defpackage.jf7;
import defpackage.k5;
import defpackage.lc4;
import defpackage.m88;
import defpackage.m95;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.py3;
import defpackage.r38;
import defpackage.r5l;
import defpackage.rh1;
import defpackage.s95;
import defpackage.sh1;
import defpackage.t95;
import defpackage.th1;
import defpackage.u38;
import defpackage.u95;
import defpackage.uh1;
import defpackage.vh1;
import defpackage.vtk;
import defpackage.w19;
import defpackage.wd5;
import defpackage.wh1;
import defpackage.x44;
import defpackage.xi4;
import defpackage.xzd;
import defpackage.y5h;
import defpackage.zy7;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\b\u0005*\u00019\b\u0000\u0018\u0000 <2 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u0001<B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0004H\u0017¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010)R4\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\r\u0010*\u0012\u0004\b/\u00100\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R(\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u000f\u00101\u0012\u0004\b6\u00100\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0011\u00107\u0012\u0004\b8\u00100R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006="}, d2 = {"Landroidx/credentials/playservices/controllers/identityauth/beginsignin/CredentialProviderBeginSignInController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Lr38;", "Lvh1;", "Lj6g;", "Lu38;", "Landroidx/credentials/exceptions/GetCredentialException;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "Lm95;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "Liei;", "invokePlayServices", "(Lr38;Lm95;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "", "uniqueRequestCode", "resultCode", "Landroid/content/Intent;", "data", "handleResponse$credentials_play_services_auth", "(IILandroid/content/Intent;)V", "handleResponse", "convertRequestToPlayServices", "(Lr38;)Lvh1;", "response", "convertResponseToCredentialManager", "(Lj6g;)Lu38;", "", "e", "fromGmsException", "(Ljava/lang/Throwable;)Landroidx/credentials/exceptions/GetCredentialException;", "Lm88;", "createGoogleIdCredential", "(Lj6g;)Lm88;", "Landroid/content/Context;", "Lm95;", "getCallback", "()Lm95;", "setCallback", "(Lm95;)V", "getCallback$annotations", "()V", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "setExecutor", "(Ljava/util/concurrent/Executor;)V", "getExecutor$annotations", "Landroid/os/CancellationSignal;", "getCancellationSignal$annotations", "androidx/credentials/playservices/controllers/identityauth/beginsignin/CredentialProviderBeginSignInController$resultReceiver$1", "resultReceiver", "Landroidx/credentials/playservices/controllers/identityauth/beginsignin/CredentialProviderBeginSignInController$resultReceiver$1;", "Companion", "credentials-play-services-auth"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class CredentialProviderBeginSignInController extends CredentialProviderController<r38, vh1, j6g, u38, GetCredentialException> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "BeginSignIn";
    public m95 callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    public Executor executor;
    private final CredentialProviderBeginSignInController$resultReceiver$1 resultReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$resultReceiver$1] */
    public CredentialProviderBeginSignInController(Context context) {
        super(context);
        context.getClass();
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int resultCode, Bundle resultData) {
                resultData.getClass();
                if (this.this$0.maybeReportErrorFromResultReceiver(resultData, new CredentialProviderBeginSignInController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.INSTANCE), this.this$0.getExecutor(), this.this$0.getCallback(), this.this$0.cancellationSignal)) {
                    return;
                }
                this.this$0.handleResponse$credentials_play_services_auth(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), resultCode, (Intent) resultData.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
            }
        };
    }

    private final m88 createGoogleIdCredential(j6g response) {
        String str = response.E;
        str.getClass();
        String str2 = response.K;
        str2.getClass();
        String str3 = response.F;
        String str4 = str3 != null ? str3 : null;
        String str5 = response.G;
        String str6 = str5 != null ? str5 : null;
        String str7 = response.H;
        String str8 = str7 != null ? str7 : null;
        String str9 = response.L;
        String str10 = str9 != null ? str9 : null;
        Uri uri = response.I;
        return new m88(str, str2, str4, str8, str6, uri != null ? uri : null, str10);
    }

    private final GetCredentialException fromGmsException(Throwable e) {
        String str = ((e instanceof ApiException) && CredentialProviderBaseController.INSTANCE.getRetryables().contains(Integer.valueOf(((ApiException) e).E.E))) ? CredentialProviderBaseController.GET_INTERRUPTED : CredentialProviderBaseController.GET_NO_CREDENTIALS;
        return CredentialProviderBaseController.INSTANCE.getCredentialExceptionTypeToException$credentials_play_services_auth(str, "During begin sign in, failure response from one tap: " + e.getMessage());
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    public static final CredentialProviderBeginSignInController getInstance(Context context) {
        return INSTANCE.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei handleResponse$lambda$0(CancellationSignal cancellationSignal, zy7 zy7Var) {
        zy7Var.getClass();
        CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, zy7Var);
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei handleResponse$lambda$1(CredentialProviderBeginSignInController credentialProviderBeginSignInController, GetCredentialException getCredentialException) {
        getCredentialException.getClass();
        credentialProviderBeginSignInController.getExecutor().execute(new t95(credentialProviderBeginSignInController, getCredentialException, 1));
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$1$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, GetCredentialException getCredentialException) {
        credentialProviderBeginSignInController.getCallback().a(getCredentialException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei handleResponse$lambda$2(CredentialProviderBeginSignInController credentialProviderBeginSignInController, u38 u38Var) {
        credentialProviderBeginSignInController.getExecutor().execute(new fd(credentialProviderBeginSignInController, 17, u38Var));
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$2$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, u38 u38Var) {
        credentialProviderBeginSignInController.getCallback().onResult(u38Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei handleResponse$lambda$3(CredentialProviderBeginSignInController credentialProviderBeginSignInController, dae daeVar) {
        credentialProviderBeginSignInController.getExecutor().execute(new fd(credentialProviderBeginSignInController, 18, daeVar));
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$3$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, dae daeVar) {
        credentialProviderBeginSignInController.getCallback().a(daeVar.E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei handleResponse$lambda$4(CredentialProviderBeginSignInController credentialProviderBeginSignInController, GetCredentialException getCredentialException) {
        credentialProviderBeginSignInController.getExecutor().execute(new t95(credentialProviderBeginSignInController, getCredentialException, 2));
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$4$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, GetCredentialException getCredentialException) {
        credentialProviderBeginSignInController.getCallback().a(getCredentialException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei handleResponse$lambda$5(CredentialProviderBeginSignInController credentialProviderBeginSignInController, GetCredentialUnknownException getCredentialUnknownException) {
        credentialProviderBeginSignInController.getExecutor().execute(new fd(credentialProviderBeginSignInController, 16, getCredentialUnknownException));
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$5$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, GetCredentialUnknownException getCredentialUnknownException) {
        credentialProviderBeginSignInController.getCallback().a(getCredentialUnknownException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei invokePlayServices$lambda$0(CancellationSignal cancellationSignal, CredentialProviderBeginSignInController credentialProviderBeginSignInController, wh1 wh1Var) {
        boolean zCancellationReviewer$credentials_play_services_auth = CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth(cancellationSignal);
        iei ieiVar = iei.a;
        if (zCancellationReviewer$credentials_play_services_auth) {
            return ieiVar;
        }
        Intent intent = new Intent(credentialProviderBeginSignInController.context, (Class<?>) HiddenActivity.class);
        credentialProviderBeginSignInController.generateHiddenActivityIntent(credentialProviderBeginSignInController.resultReceiver, intent, CredentialProviderBaseController.BEGIN_SIGN_IN_TAG);
        intent.putExtra(CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, wh1Var.E);
        try {
            credentialProviderBeginSignInController.context.startActivity(intent);
            return ieiVar;
        } catch (Exception unused) {
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new xi4(4, credentialProviderBeginSignInController));
            return ieiVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei invokePlayServices$lambda$0$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController) {
        credentialProviderBeginSignInController.getExecutor().execute(new fc(8, credentialProviderBeginSignInController));
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$0$0$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController) {
        credentialProviderBeginSignInController.getCallback().a(new GetCredentialUnknownException(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2(CredentialProviderBeginSignInController credentialProviderBeginSignInController, CancellationSignal cancellationSignal, Exception exc) {
        exc.getClass();
        CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new s95(credentialProviderBeginSignInController, credentialProviderBeginSignInController.fromGmsException(exc), 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei invokePlayServices$lambda$2$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, GetCredentialException getCredentialException) {
        credentialProviderBeginSignInController.getExecutor().execute(new t95(credentialProviderBeginSignInController, getCredentialException, 0));
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2$0$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, GetCredentialException getCredentialException) {
        credentialProviderBeginSignInController.getCallback().a(getCredentialException);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public vh1 convertRequestToPlayServices(r38 request) {
        request.getClass();
        return BeginSignInControllerUtility.INSTANCE.constructBeginSignInRequest$credentials_play_services_auth(request, this.context);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public u38 convertResponseToCredentialManager(j6g response) throws GetCredentialUnknownException {
        k5 wd5Var;
        response.getClass();
        String str = response.J;
        if (str != null) {
            String str2 = response.E;
            str2.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_ID", str2);
            bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", str);
            wd5Var = new wd5(str, bundle, 2);
        } else if (response.K != null) {
            wd5Var = createGoogleIdCredential(response);
        } else if (response.M != null) {
            String assertPasskeyResponse = PublicKeyCredentialControllerUtility.INSTANCE.toAssertPasskeyResponse(response);
            assertPasskeyResponse.getClass();
            Bundle bundle2 = new Bundle();
            bundle2.putString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON", assertPasskeyResponse);
            wd5Var = new wd5(assertPasskeyResponse, bundle2, 3);
        } else {
            Log.w(TAG, "Credential returned but no google Id or password or passkey found");
            wd5Var = null;
        }
        if (wd5Var != null) {
            return new u38(wd5Var);
        }
        throw new GetCredentialUnknownException("When attempting to convert get response, null credential found");
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
        CredentialProviderController.Companion companion2 = CredentialProviderController.INSTANCE;
        if (companion2.maybeReportErrorResultCodeGet$credentials_play_services_auth(resultCode, new lc4(17), new py3(9, this), this.cancellationSignal)) {
            return;
        }
        try {
            vtk.i(this.context);
            companion2.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new d44(this, 27, convertResponseToCredentialManager(coj.d(data))));
        } catch (GetCredentialException e) {
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new s95(this, e, 0));
        } catch (ApiException e2) {
            dae daeVar = new dae();
            daeVar.E = new GetCredentialUnknownException(e2.getMessage());
            Status status = e2.E;
            if (status.E == 16) {
                daeVar.E = new GetCredentialCancellationException(e2.getMessage());
            } else if (CredentialProviderBaseController.INSTANCE.getRetryables().contains(Integer.valueOf(status.E))) {
                daeVar.E = new GetCredentialInterruptedException(e2.getMessage());
            }
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new d44(this, 28, daeVar));
        } catch (Throwable th) {
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new d44(this, 29, new GetCredentialUnknownException(th.getMessage())));
        }
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(r38 request, m95 callback, Executor executor, final CancellationSignal cancellationSignal) {
        request.getClass();
        callback.getClass();
        executor.getClass();
        this.cancellationSignal = cancellationSignal;
        setCallback(callback);
        setExecutor(executor);
        if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return;
        }
        vh1 vh1VarConvertRequestToPlayServices = convertRequestToPlayServices(request);
        coj cojVarI = vtk.i(this.context);
        dgj.v(vh1VarConvertRequestToPlayServices);
        new rh1(false, null, null, true, null, null, false);
        rh1 rh1Var = vh1VarConvertRequestToPlayServices.F;
        dgj.v(rh1Var);
        uh1 uh1Var = vh1VarConvertRequestToPlayServices.E;
        dgj.v(uh1Var);
        th1 th1Var = vh1VarConvertRequestToPlayServices.J;
        dgj.v(th1Var);
        sh1 sh1Var = vh1VarConvertRequestToPlayServices.K;
        dgj.v(sh1Var);
        vh1 vh1Var = new vh1(uh1Var, rh1Var, cojVarI.k, vh1VarConvertRequestToPlayServices.H, vh1VarConvertRequestToPlayServices.I, th1Var, sh1Var, vh1VarConvertRequestToPlayServices.L);
        w19 w19VarB = w19.b();
        w19VarB.d = new jf7[]{new jf7("auth_api_credentials_begin_sign_in", 8L)};
        w19VarB.c = new xzd(cojVarI, vh1Var, 25);
        w19VarB.a = false;
        w19VarB.b = 1553;
        r5l r5lVarC = cojVarI.c(0, w19VarB.a());
        do0 do0Var = new do0(6, new bz7() { // from class: r95
            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                return CredentialProviderBeginSignInController.invokePlayServices$lambda$0(cancellationSignal, this, (wh1) obj);
            }
        });
        r5lVarC.getClass();
        r5lVarC.c(y5h.a, do0Var);
        r5lVarC.a(new u95(this, 0, cancellationSignal));
    }

    public final void setCallback(m95 m95Var) {
        m95Var.getClass();
        this.callback = m95Var;
    }

    public final void setExecutor(Executor executor) {
        executor.getClass();
        this.executor = executor;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/credentials/playservices/controllers/identityauth/beginsignin/CredentialProviderBeginSignInController$Companion;", "", "<init>", "()V", "TAG", "", "getInstance", "Landroidx/credentials/playservices/controllers/identityauth/beginsignin/CredentialProviderBeginSignInController;", "context", "Landroid/content/Context;", "credentials-play-services-auth"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
    public static final class Companion {
        public /* synthetic */ Companion(mq5 mq5Var) {
            this();
        }

        public final CredentialProviderBeginSignInController getInstance(Context context) {
            context.getClass();
            return new CredentialProviderBeginSignInController(context);
        }

        private Companion() {
        }
    }
}
