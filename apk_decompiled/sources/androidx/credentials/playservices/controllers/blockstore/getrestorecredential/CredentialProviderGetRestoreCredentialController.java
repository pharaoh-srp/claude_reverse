package androidx.credentials.playservices.controllers.blockstore.getrestorecredential;

import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import defpackage.b99;
import defpackage.bz7;
import defpackage.d88;
import defpackage.da5;
import defpackage.dae;
import defpackage.do0;
import defpackage.e48;
import defpackage.ea5;
import defpackage.f48;
import defpackage.fe0;
import defpackage.gvk;
import defpackage.iei;
import defpackage.jf7;
import defpackage.m95;
import defpackage.mdj;
import defpackage.na5;
import defpackage.nik;
import defpackage.o65;
import defpackage.oa5;
import defpackage.p65;
import defpackage.p95;
import defpackage.pa5;
import defpackage.r38;
import defpackage.r5l;
import defpackage.ro6;
import defpackage.u38;
import defpackage.w19;
import defpackage.x44;
import defpackage.y5h;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/credentials/playservices/controllers/blockstore/getrestorecredential/CredentialProviderGetRestoreCredentialController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Lr38;", "Le48;", "Lf48;", "Lu38;", "Landroidx/credentials/exceptions/GetCredentialException;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "Lm95;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "Liei;", "invokePlayServices", "(Lr38;Lm95;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "convertRequestToPlayServices", "(Lr38;)Le48;", "response", "convertResponseToCredentialManager", "(Lf48;)Lu38;", "Landroid/content/Context;", "credentials-play-services-auth"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class CredentialProviderGetRestoreCredentialController extends CredentialProviderController<r38, e48, f48, u38, GetCredentialException> {
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetRestoreCredentialController(Context context) {
        super(context);
        context.getClass();
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei invokePlayServices$lambda$0(CredentialProviderGetRestoreCredentialController credentialProviderGetRestoreCredentialController, CancellationSignal cancellationSignal, Executor executor, m95 m95Var, f48 f48Var) {
        try {
            f48Var.getClass();
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new pa5(executor, m95Var, credentialProviderGetRestoreCredentialController.convertResponseToCredentialManager(f48Var), 0));
        } catch (Exception e) {
            CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new o65(executor, m95Var, e, 2));
        }
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei invokePlayServices$lambda$0$0(Executor executor, m95 m95Var, u38 u38Var) {
        executor.execute(new oa5(m95Var, u38Var, 0));
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei invokePlayServices$lambda$0$1(Executor executor, m95 m95Var, Exception exc) {
        executor.execute(new p65(m95Var, exc, 2));
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$0$1$0(m95 m95Var, Exception exc) {
        m95Var.a(exc instanceof NoCredentialException ? (GetCredentialException) exc : new GetCredentialUnknownException(exc.getMessage()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2(CancellationSignal cancellationSignal, Executor executor, m95 m95Var, Exception exc) {
        exc.getClass();
        dae daeVar = new dae();
        daeVar.E = new GetCredentialUnknownException("Get restore credential failed for unknown reason, failure: " + exc.getMessage());
        if (exc instanceof ApiException) {
            Status status = ((ApiException) exc).E;
            if (status.E == 40201) {
                daeVar.E = new GetCredentialUnknownException("The restore credential internal service had a failure, failure: " + exc.getMessage());
            } else {
                daeVar.E = new GetCredentialUnknownException("The restore credential service failed with unsupported status code, failure: " + exc.getMessage() + ", status code: " + status.E);
            }
        }
        CredentialProviderController.INSTANCE.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new da5(executor, m95Var, daeVar, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei invokePlayServices$lambda$2$0(Executor executor, m95 m95Var, dae daeVar) {
        executor.execute(new ea5(m95Var, daeVar, 1));
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2$0$0(m95 m95Var, dae daeVar) {
        m95Var.a(daeVar.E);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public e48 convertRequestToPlayServices(r38 request) {
        request.getClass();
        for (p95 p95Var : request.a) {
        }
        x44.o0("credentialOption");
        throw null;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public u38 convertResponseToCredentialManager(f48 response) {
        response.getClass();
        return new u38(gvk.f("androidx.credentials.TYPE_RESTORE_CREDENTIAL", response.E));
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(r38 request, final m95 callback, final Executor executor, final CancellationSignal cancellationSignal) {
        request.getClass();
        callback.getClass();
        executor.getClass();
        if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return;
        }
        e48 e48VarConvertRequestToPlayServices = convertRequestToPlayServices(request);
        Context context = this.context;
        context.getClass();
        b99 b99Var = new b99(context, b99.l, fe0.a, d88.c);
        e48VarConvertRequestToPlayServices.getClass();
        w19 w19VarB = w19.b();
        w19VarB.d = new jf7[]{nik.d};
        byte b = 0;
        ro6 ro6Var = new ro6(b, 5);
        ro6Var.F = e48VarConvertRequestToPlayServices;
        w19VarB.c = ro6Var;
        w19VarB.b = 1695;
        r5l r5lVarC = b99Var.c(0, w19VarB.a());
        r5lVarC.getClass();
        r5lVarC.c(y5h.a, new do0(8, new bz7() { // from class: ma5
            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                return CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$0(this.E, cancellationSignal, executor, callback, (f48) obj);
            }
        }));
        r5lVarC.a(new na5(cancellationSignal, executor, callback, b));
    }
}
