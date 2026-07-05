package androidx.credentials.playservices.controllers.blockstore.createrestorecredential;

import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.restorecredential.CreateRestoreCredentialDomException;
import androidx.credentials.exceptions.restorecredential.E2eeUnavailableException;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import defpackage.c85;
import defpackage.d85;
import defpackage.da5;
import defpackage.dae;
import defpackage.e85;
import defpackage.ea5;
import defpackage.iei;
import defpackage.l65;
import defpackage.m65;
import defpackage.m95;
import defpackage.mdj;
import defpackage.mr9;
import defpackage.o65;
import defpackage.p65;
import defpackage.sz6;
import defpackage.v75;
import defpackage.yg4;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/credentials/playservices/controllers/blockstore/createrestorecredential/CredentialProviderCreateRestoreCredentialController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Ld85;", "Lc85;", "Le85;", "Ll65;", "Landroidx/credentials/exceptions/CreateCredentialException;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "Lm95;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "Liei;", "invokePlayServices", "(Ld85;Lm95;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "convertRequestToPlayServices", "(Ld85;)Lc85;", "response", "convertResponseToCredentialManager", "(Le85;)Ll65;", "Landroid/content/Context;", "credentials-play-services-auth"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class CredentialProviderCreateRestoreCredentialController extends CredentialProviderController<d85, c85, e85, l65, CreateCredentialException> {
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreateRestoreCredentialController(Context context) {
        super(context);
        context.getClass();
        this.context = context;
    }

    private static final iei invokePlayServices$lambda$0(CredentialProviderCreateRestoreCredentialController credentialProviderCreateRestoreCredentialController, CancellationSignal cancellationSignal, Executor executor, m95 m95Var, e85 e85Var) {
        try {
            e85Var.getClass();
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new yg4(executor, m95Var, credentialProviderCreateRestoreCredentialController.convertResponseToCredentialManager(e85Var), 13));
        } catch (Exception e) {
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new o65(executor, m95Var, e, 1));
        }
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei invokePlayServices$lambda$0$0(Executor executor, m95 m95Var, l65 l65Var) {
        executor.execute(new v75(m95Var, l65Var, 1));
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei invokePlayServices$lambda$0$1(Executor executor, m95 m95Var, Exception exc) {
        executor.execute(new p65(m95Var, exc, 1));
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$0$1$0(m95 m95Var, Exception exc) {
        m95Var.a(new CreateCredentialUnknownException(exc.getMessage()));
    }

    private static final void invokePlayServices$lambda$2(CancellationSignal cancellationSignal, Executor executor, m95 m95Var, Exception exc) {
        exc.getClass();
        dae daeVar = new dae();
        daeVar.E = new CreateCredentialUnknownException("Create restore credential failed for unknown reason, failure: " + exc.getMessage());
        if (exc instanceof ApiException) {
            Status status = ((ApiException) exc).E;
            switch (status.E) {
                case 40201:
                    daeVar.E = new CreateCredentialUnknownException("The restore credential internal service had a failure, failure: " + exc.getMessage());
                    break;
                case 40202:
                    daeVar.E = new CreateRestoreCredentialDomException("The request did not match the fido spec, failure: " + exc.getMessage(), "androidx.credentials.TYPE_CREATE_RESTORE_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR");
                    break;
                case 40203:
                    daeVar.E = new E2eeUnavailableException("E2ee is not available on the device. Check whether the backup and screen lock are enabled.", "androidx.credentials.TYPE_E2EE_UNAVAILABLE_EXCEPTION");
                    break;
                default:
                    daeVar.E = new CreateCredentialUnknownException("The restore credential service failed with unsupported status code, failure: " + exc.getMessage() + ", status code: " + status.E);
                    break;
            }
        }
        CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new da5(executor, m95Var, daeVar, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei invokePlayServices$lambda$2$0(Executor executor, m95 m95Var, dae daeVar) {
        executor.execute(new ea5(m95Var, daeVar, 0));
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2$0$0(m95 m95Var, dae daeVar) {
        m95Var.a(daeVar.E);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public /* synthetic */ c85 convertRequestToPlayServices(d85 d85Var) {
        if (d85Var == null) {
            return convertRequestToPlayServices2((d85) null);
        }
        mr9.o();
        return null;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public l65 convertResponseToCredentialManager(e85 response) throws CreateCredentialUnknownException {
        response.getClass();
        Bundle bundle = response.E;
        bundle.getClass();
        String string = bundle.getString("androidx.credentials.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_RESPONSE");
        if (string == null) {
            throw new CreateCredentialUnknownException("The response bundle did not contain the response data. This should not happen.");
        }
        m65 m65Var = new m65();
        if (string.length() != 0) {
            try {
                new JSONObject(string);
                return m65Var;
            } catch (Exception unused) {
            }
        }
        sz6.p("registrationResponseJson must not be empty, and must be a valid JSON");
        return null;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public /* synthetic */ void invokePlayServices(d85 d85Var, m95 m95Var, Executor executor, CancellationSignal cancellationSignal) {
        if (d85Var == null) {
            invokePlayServices2((d85) null, m95Var, executor, cancellationSignal);
        } else {
            mr9.o();
        }
    }

    /* JADX INFO: renamed from: invokePlayServices, reason: avoid collision after fix types in other method */
    public void invokePlayServices2(d85 request, m95 callback, Executor executor, CancellationSignal cancellationSignal) {
        throw null;
    }

    /* JADX INFO: renamed from: convertRequestToPlayServices, reason: avoid collision after fix types in other method */
    public c85 convertRequestToPlayServices2(d85 request) {
        throw null;
    }
}
