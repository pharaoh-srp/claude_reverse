package androidx.credentials.playservices.controllers.identityauth.createpublickeycredential;

import android.app.PendingIntent;
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
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import com.google.android.gms.common.api.ApiException;
import defpackage.a71;
import defpackage.aa5;
import defpackage.b71;
import defpackage.ba5;
import defpackage.c71;
import defpackage.ca5;
import defpackage.fd;
import defpackage.fd9;
import defpackage.iei;
import defpackage.l65;
import defpackage.lc4;
import defpackage.m95;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.mr9;
import defpackage.ntk;
import defpackage.py3;
import defpackage.r;
import defpackage.rvd;
import defpackage.tvd;
import defpackage.w75;
import defpackage.w95;
import defpackage.wik;
import defpackage.x44;
import defpackage.x75;
import defpackage.xi4;
import defpackage.y61;
import defpackage.y95;
import defpackage.z95;
import defpackage.zy7;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\b\u0005*\u00013\b\u0000\u0018\u0000 62 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u00016B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0004H\u0017¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010+R(\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f8\u0002@\u0002X\u0083.¢\u0006\f\n\u0004\b\r\u0010,\u0012\u0004\b-\u0010.R\u001c\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0083.¢\u0006\f\n\u0004\b\u000f\u0010/\u0012\u0004\b0\u0010.R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0011\u00101\u0012\u0004\b2\u0010.R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, d2 = {"Landroidx/credentials/playservices/controllers/identityauth/createpublickeycredential/CredentialProviderCreatePublicKeyCredentialController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Lw75;", "Ltvd;", "Lrvd;", "Ll65;", "Landroidx/credentials/exceptions/CreateCredentialException;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "Lm95;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "Liei;", "invokePlayServices", "(Lw75;Lm95;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "", "uniqueRequestCode", "resultCode", "Landroid/content/Intent;", "data", "handleResponse$credentials_play_services_auth", "(IILandroid/content/Intent;)V", "handleResponse", "convertRequestToPlayServices", "(Lw75;)Ltvd;", "response", "convertResponseToCredentialManager", "(Lrvd;)Ll65;", "", "e", "fromIntentRequestException", "(Ljava/lang/Throwable;)Landroidx/credentials/exceptions/CreateCredentialException;", "Lorg/json/JSONException;", "exception", "Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialDomException;", "JSONExceptionToPKCError", "(Lorg/json/JSONException;)Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialDomException;", "Landroid/content/Context;", "Lm95;", "getCallback$annotations", "()V", "Ljava/util/concurrent/Executor;", "getExecutor$annotations", "Landroid/os/CancellationSignal;", "getCancellationSignal$annotations", "androidx/credentials/playservices/controllers/identityauth/createpublickeycredential/CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1", "resultReceiver", "Landroidx/credentials/playservices/controllers/identityauth/createpublickeycredential/CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1;", "Companion", "credentials-play-services-auth"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class CredentialProviderCreatePublicKeyCredentialController extends CredentialProviderController<w75, tvd, rvd, l65, CreateCredentialException> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "CreatePublicKey";
    private m95 callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    private Executor executor;
    private final CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1 resultReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1] */
    public CredentialProviderCreatePublicKeyCredentialController(Context context) {
        super(context);
        context.getClass();
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int resultCode, Bundle resultData) {
                resultData.getClass();
                CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
                CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 credentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 = new CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.INSTANCE);
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
                if (credentialProviderCreatePublicKeyCredentialController.maybeReportErrorFromResultReceiver(resultData, credentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1, executor, m95Var, this.this$0.cancellationSignal)) {
                    return;
                }
                this.this$0.handleResponse$credentials_play_services_auth(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), resultCode, (Intent) resultData.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
            }
        };
    }

    private final CreatePublicKeyCredentialDomException JSONExceptionToPKCError(JSONException exception) {
        String message = exception.getMessage();
        return (message == null || message.length() <= 0) ? new CreatePublicKeyCredentialDomException(new r(4), "Unknown error") : new CreatePublicKeyCredentialDomException(new r(4), message);
    }

    private final CreateCredentialException fromIntentRequestException(Throwable e) {
        String str = ((e instanceof ApiException) && CredentialProviderBaseController.INSTANCE.getRetryables().contains(Integer.valueOf(((ApiException) e).E.E))) ? CredentialProviderBaseController.CREATE_INTERRUPTED : CredentialProviderBaseController.CREATE_UNKNOWN;
        return CredentialProviderBaseController.INSTANCE.createCredentialExceptionTypeToException$credentials_play_services_auth(str, "During create public key credential, fido registration failure: " + e.getMessage());
    }

    private static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    private static /* synthetic */ void getExecutor$annotations() {
    }

    public static final CredentialProviderCreatePublicKeyCredentialController getInstance(Context context) {
        return INSTANCE.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei handleResponse$lambda$0(CancellationSignal cancellationSignal, zy7 zy7Var) {
        zy7Var.getClass();
        CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, zy7Var);
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei handleResponse$lambda$1(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, CreateCredentialException createCredentialException) {
        createCredentialException.getClass();
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor != null) {
            executor.execute(new z95(credentialProviderCreatePublicKeyCredentialController, createCredentialException, 2));
            return iei.a;
        }
        x44.o0("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$1$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, CreateCredentialException createCredentialException) {
        m95 m95Var = credentialProviderCreatePublicKeyCredentialController.callback;
        if (m95Var != null) {
            m95Var.a(createCredentialException);
        } else {
            x44.o0("callback");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$2(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        m95 m95Var = credentialProviderCreatePublicKeyCredentialController.callback;
        if (m95Var != null) {
            m95Var.a(new CreatePublicKeyCredentialDomException(new r(26), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
        } else {
            x44.o0("callback");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei handleResponse$lambda$3(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, CreateCredentialException createCredentialException) {
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor != null) {
            executor.execute(new z95(credentialProviderCreatePublicKeyCredentialController, createCredentialException, 1));
            return iei.a;
        }
        x44.o0("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$3$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, CreateCredentialException createCredentialException) {
        m95 m95Var = credentialProviderCreatePublicKeyCredentialController.callback;
        if (m95Var != null) {
            m95Var.a(createCredentialException);
        } else {
            x44.o0("callback");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei handleResponse$lambda$4(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, l65 l65Var) {
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor != null) {
            executor.execute(new fd(credentialProviderCreatePublicKeyCredentialController, 21, l65Var));
            return iei.a;
        }
        x44.o0("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$4$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, l65 l65Var) {
        m95 m95Var = credentialProviderCreatePublicKeyCredentialController.callback;
        if (m95Var != null) {
            m95Var.onResult(l65Var);
        } else {
            x44.o0("callback");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei handleResponse$lambda$5(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException) {
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor != null) {
            executor.execute(new y95(credentialProviderCreatePublicKeyCredentialController, jSONException, 0));
            return iei.a;
        }
        x44.o0("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$5$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException) {
        m95 m95Var = credentialProviderCreatePublicKeyCredentialController.callback;
        if (m95Var != null) {
            m95Var.a(new CreatePublicKeyCredentialDomException(new r(4), jSONException.getMessage()));
        } else {
            x44.o0("callback");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei handleResponse$lambda$6(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th) {
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor != null) {
            executor.execute(new ca5(credentialProviderCreatePublicKeyCredentialController, th, 1));
            return iei.a;
        }
        x44.o0("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$6$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th) {
        m95 m95Var = credentialProviderCreatePublicKeyCredentialController.callback;
        if (m95Var != null) {
            m95Var.a(new CreatePublicKeyCredentialDomException(new r(26), th.getMessage()));
        } else {
            x44.o0("callback");
            throw null;
        }
    }

    private static final iei invokePlayServices$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException) {
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor != null) {
            executor.execute(new y95(credentialProviderCreatePublicKeyCredentialController, jSONException, 1));
            return iei.a;
        }
        x44.o0("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$0$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException) {
        m95 m95Var = credentialProviderCreatePublicKeyCredentialController.callback;
        if (m95Var != null) {
            m95Var.a(credentialProviderCreatePublicKeyCredentialController.JSONExceptionToPKCError(jSONException));
        } else {
            x44.o0("callback");
            throw null;
        }
    }

    private static final iei invokePlayServices$lambda$1(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th) {
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor != null) {
            executor.execute(new ca5(credentialProviderCreatePublicKeyCredentialController, th, 0));
            return iei.a;
        }
        x44.o0("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$1$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th) {
        m95 m95Var = credentialProviderCreatePublicKeyCredentialController.callback;
        if (m95Var != null) {
            m95Var.a(new CreateCredentialUnknownException(th.getMessage()));
        } else {
            x44.o0("callback");
            throw null;
        }
    }

    private static final iei invokePlayServices$lambda$2(CancellationSignal cancellationSignal, CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, PendingIntent pendingIntent) {
        pendingIntent.getClass();
        boolean zCancellationReviewer$credentials_play_services_auth = CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth(cancellationSignal);
        iei ieiVar = iei.a;
        if (zCancellationReviewer$credentials_play_services_auth) {
            return ieiVar;
        }
        Intent intent = new Intent(credentialProviderCreatePublicKeyCredentialController.context, (Class<?>) HiddenActivity.class);
        credentialProviderCreatePublicKeyCredentialController.generateHiddenActivityIntent(credentialProviderCreatePublicKeyCredentialController.resultReceiver, intent, CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG);
        intent.putExtra(CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, pendingIntent);
        try {
            credentialProviderCreatePublicKeyCredentialController.context.startActivity(intent);
            return ieiVar;
        } catch (Exception unused) {
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new xi4(6, credentialProviderCreatePublicKeyCredentialController));
            return ieiVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei invokePlayServices$lambda$2$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor != null) {
            executor.execute(new aa5(credentialProviderCreatePublicKeyCredentialController, 0));
            return iei.a;
        }
        x44.o0("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2$0$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        m95 m95Var = credentialProviderCreatePublicKeyCredentialController.callback;
        if (m95Var != null) {
            m95Var.a(new CreateCredentialUnknownException(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
        } else {
            x44.o0("callback");
            throw null;
        }
    }

    private static final void invokePlayServices$lambda$4(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, CancellationSignal cancellationSignal, Exception exc) {
        exc.getClass();
        CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new ba5(credentialProviderCreatePublicKeyCredentialController, credentialProviderCreatePublicKeyCredentialController.fromIntentRequestException(exc), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei invokePlayServices$lambda$4$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, CreateCredentialException createCredentialException) {
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor != null) {
            executor.execute(new z95(credentialProviderCreatePublicKeyCredentialController, createCredentialException, 0));
            return iei.a;
        }
        x44.o0("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$4$0$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, CreateCredentialException createCredentialException) {
        m95 m95Var = credentialProviderCreatePublicKeyCredentialController.callback;
        if (m95Var != null) {
            m95Var.a(createCredentialException);
        } else {
            x44.o0("callback");
            throw null;
        }
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public /* synthetic */ tvd convertRequestToPlayServices(w75 w75Var) {
        if (w75Var == null) {
            return convertRequestToPlayServices2((w75) null);
        }
        mr9.o();
        return null;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public l65 convertResponseToCredentialManager(rvd response) throws CreateCredentialUnknownException {
        JSONObject jSONObjectL0;
        response.getClass();
        try {
            c71 c71Var = response.J;
            wik wikVar = response.G;
            try {
                JSONObject jSONObject = new JSONObject();
                if (wikVar != null && wikVar.o().length > 0) {
                    jSONObject.put("rawId", fd9.R(wikVar.o()));
                }
                String str = response.L;
                if (str != null) {
                    jSONObject.put("authenticatorAttachment", str);
                }
                String str2 = response.F;
                if (str2 != null && c71Var == null) {
                    jSONObject.put("type", str2);
                }
                String str3 = response.E;
                if (str3 != null) {
                    jSONObject.put("id", str3);
                }
                String str4 = "response";
                a71 a71Var = response.I;
                boolean z = true;
                if (a71Var != null) {
                    jSONObjectL0 = a71Var.l0();
                } else {
                    b71 b71Var = response.H;
                    if (b71Var != null) {
                        jSONObjectL0 = b71Var.l0();
                    } else {
                        z = false;
                        if (c71Var != null) {
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("code", c71Var.E.E);
                                String str5 = c71Var.F;
                                if (str5 != null) {
                                    jSONObject2.put("message", str5);
                                }
                                str4 = "error";
                                jSONObjectL0 = jSONObject2;
                            } catch (JSONException e) {
                                throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e);
                            }
                        } else {
                            jSONObjectL0 = null;
                        }
                    }
                }
                if (jSONObjectL0 != null) {
                    jSONObject.put(str4, jSONObjectL0);
                }
                y61 y61Var = response.K;
                if (y61Var != null) {
                    jSONObject.put("clientExtensionResults", y61Var.l0());
                } else if (z) {
                    jSONObject.put("clientExtensionResults", new JSONObject());
                }
                String string = jSONObject.toString();
                string.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON", string);
                return new x75(string, bundle);
            } catch (JSONException e2) {
                throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e2);
            }
        } catch (Throwable th) {
            throw new CreateCredentialUnknownException("The PublicKeyCredential response json had an unexpected exception when parsing: " + th.getMessage());
        }
    }

    public final void handleResponse$credentials_play_services_auth(int uniqueRequestCode, int resultCode, Intent data) {
        CredentialProviderBaseController.Companion companion = CredentialProviderBaseController.INSTANCE;
        if (uniqueRequestCode != companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth()) {
            Log.w(TAG, "Returned request code " + companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth() + " does not match what was given " + uniqueRequestCode);
            return;
        }
        if (CredentialProviderController.maybeReportErrorResultCodeCreate(resultCode, new lc4(19), new py3(11, this), this.cancellationSignal)) {
            return;
        }
        byte[] byteArrayExtra = data != null ? data.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA") : null;
        int i = 1;
        if (byteArrayExtra == null) {
            if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth(this.cancellationSignal)) {
                return;
            }
            Executor executor = this.executor;
            if (executor != null) {
                executor.execute(new aa5(this, i));
                return;
            } else {
                x44.o0("executor");
                throw null;
            }
        }
        rvd rvdVar = (rvd) ntk.c(byteArrayExtra, rvd.CREATOR);
        rvdVar.getClass();
        CreateCredentialException createCredentialExceptionPublicKeyCredentialResponseContainsError = PublicKeyCredentialControllerUtility.INSTANCE.publicKeyCredentialResponseContainsError(rvdVar);
        if (createCredentialExceptionPublicKeyCredentialResponseContainsError != null) {
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new ba5(this, createCredentialExceptionPublicKeyCredentialResponseContainsError, i));
            return;
        }
        try {
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new w95(this, 4, convertResponseToCredentialManager(rvdVar)));
        } catch (JSONException e) {
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new w95(this, 2, e));
        } catch (Throwable th) {
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new w95(this, 3, th));
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

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/credentials/playservices/controllers/identityauth/createpublickeycredential/CredentialProviderCreatePublicKeyCredentialController$Companion;", "", "<init>", "()V", "TAG", "", "getInstance", "Landroidx/credentials/playservices/controllers/identityauth/createpublickeycredential/CredentialProviderCreatePublicKeyCredentialController;", "context", "Landroid/content/Context;", "credentials-play-services-auth"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
    public static final class Companion {
        public /* synthetic */ Companion(mq5 mq5Var) {
            this();
        }

        public final CredentialProviderCreatePublicKeyCredentialController getInstance(Context context) {
            context.getClass();
            return new CredentialProviderCreatePublicKeyCredentialController(context);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: invokePlayServices, reason: avoid collision after fix types in other method */
    public void invokePlayServices2(w75 request, m95 callback, Executor executor, CancellationSignal cancellationSignal) {
        throw null;
    }

    /* JADX INFO: renamed from: convertRequestToPlayServices, reason: avoid collision after fix types in other method */
    public tvd convertRequestToPlayServices2(w75 request) {
        throw null;
    }
}
