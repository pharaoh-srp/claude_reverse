package androidx.credentials.playservices.controllers.identitycredentials.signalcredentialstate;

import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.publickeycredential.SignalCredentialRateLimitExceededException;
import androidx.credentials.exceptions.publickeycredential.SignalCredentialStateException;
import androidx.credentials.exceptions.publickeycredential.SignalCredentialUnknownException;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.common.api.ApiException;
import defpackage.bsg;
import defpackage.dae;
import defpackage.dgj;
import defpackage.ea5;
import defpackage.hva;
import defpackage.iei;
import defpackage.isg;
import defpackage.m95;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.mr9;
import defpackage.o6g;
import defpackage.ova;
import defpackage.p6g;
import defpackage.q6g;
import defpackage.q75;
import defpackage.r6g;
import defpackage.yw5;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u001b2 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/credentials/playservices/controllers/identitycredentials/signalcredentialstate/SignalCredentialStateController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Lp6g;", "Lo6g;", "Lq6g;", "Lr6g;", "Landroidx/credentials/exceptions/publickeycredential/SignalCredentialStateException;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "Lm95;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "Liei;", "invokePlayServices", "(Lp6g;Lm95;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "convertRequestToPlayServices", "(Lp6g;)Lo6g;", "response", "convertResponseToCredentialManager", "(Lq6g;)Lr6g;", "Landroid/content/Context;", "Companion", "credentials-play-services-auth"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class SignalCredentialStateController extends CredentialProviderController<p6g, o6g, q6g, r6g, SignalCredentialStateException> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final long MAX_RETRY_TIME = 600000;
    public static final String RATE_LIMIT_EXCEPTION_MESSAGE_MATCHER = "called too frequently";
    public static final String SIGNAL_REQUEST_JSON_KEY = "androidx.credentials.signal_request_json_key";
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalCredentialStateController(Context context) {
        super(context);
        context.getClass();
        this.context = context;
    }

    public static final SignalCredentialStateController getInstance(Context context) {
        return INSTANCE.getInstance(context);
    }

    private static final iei invokePlayServices$lambda$0(Executor executor, SignalCredentialStateController signalCredentialStateController, m95 m95Var, q6g q6gVar) {
        iei ieiVar = iei.a;
        if (q6gVar == null) {
            executor.execute(new q75(m95Var, 11));
            return ieiVar;
        }
        executor.execute(new yw5(m95Var, 24, signalCredentialStateController.convertResponseToCredentialManager(q6gVar)));
        return ieiVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$0$0(m95 m95Var) {
        int i = SignalCredentialStateException.E;
        m95Var.a(new SignalCredentialUnknownException("androidx.credentials.SignalCredentialStateException.TYPE_UNKNOWN", "No SignalCredentialStateResponse received"));
    }

    private static final void invokePlayServices$lambda$2(Executor executor, m95 m95Var, Exception exc) {
        String message;
        exc.getClass();
        dae daeVar = new dae();
        int i = SignalCredentialStateException.E;
        daeVar.E = new SignalCredentialUnknownException("androidx.credentials.SignalCredentialStateException.TYPE_UNKNOWN", exc.getMessage());
        if ((exc instanceof ApiException) && ((ApiException) exc).E.E == 16 && (message = exc.getMessage()) != null && bsg.u0(message, RATE_LIMIT_EXCEPTION_MESSAGE_MATCHER, false)) {
            INSTANCE.parseRefillMinutesRegex(exc.getMessage());
            daeVar.E = new SignalCredentialRateLimitExceededException("androidx.credentials.SignalCredentialStateException.RATE_LIMIT_EXCEEDED", exc.getMessage());
        }
        executor.execute(new ea5(m95Var, daeVar, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2$0(m95 m95Var, dae daeVar) {
        m95Var.a(daeVar.E);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public /* synthetic */ o6g convertRequestToPlayServices(p6g p6gVar) {
        if (p6gVar == null) {
            return convertRequestToPlayServices2((p6g) null);
        }
        mr9.o();
        return null;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public r6g convertResponseToCredentialManager(q6g response) {
        response.getClass();
        return new r6g();
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public /* synthetic */ void invokePlayServices(p6g p6gVar, m95 m95Var, Executor executor, CancellationSignal cancellationSignal) {
        if (p6gVar == null) {
            invokePlayServices2((p6g) null, m95Var, executor, cancellationSignal);
        } else {
            mr9.o();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/credentials/playservices/controllers/identitycredentials/signalcredentialstate/SignalCredentialStateController$Companion;", "", "<init>", "()V", "SIGNAL_REQUEST_JSON_KEY", "", "RATE_LIMIT_EXCEPTION_MESSAGE_MATCHER", "MAX_RETRY_TIME", "", "parseRefillMinutesRegex", "exceptionMessage", "getInstance", "Landroidx/credentials/playservices/controllers/identitycredentials/signalcredentialstate/SignalCredentialStateController;", "context", "Landroid/content/Context;", "credentials-play-services-auth"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
    public static final class Companion {
        public /* synthetic */ Companion(mq5 mq5Var) {
            this();
        }

        public final SignalCredentialStateController getInstance(Context context) {
            context.getClass();
            return new SignalCredentialStateController(context);
        }

        public final long parseRefillMinutesRegex(String exceptionMessage) {
            hva hvaVarA;
            Integer numR0;
            if (exceptionMessage == null) {
                return SignalCredentialStateController.MAX_RETRY_TIME;
            }
            Pattern patternCompile = Pattern.compile("^SignalCredentialState has been called too frequently\\. Please retry later after (\\d+) minutes\\.$");
            patternCompile.getClass();
            Matcher matcher = patternCompile.matcher(exceptionMessage);
            matcher.getClass();
            ova ovaVarL = dgj.l(matcher, 0, exceptionMessage);
            return (ovaVarL == null || (hvaVarA = ovaVarL.c.a(1)) == null || (numR0 = isg.r0(10, hvaVarA.a)) == null) ? SignalCredentialStateController.MAX_RETRY_TIME : numR0.intValue();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: invokePlayServices, reason: avoid collision after fix types in other method */
    public void invokePlayServices2(p6g request, m95 callback, Executor executor, CancellationSignal cancellationSignal) {
        throw null;
    }

    /* JADX INFO: renamed from: convertRequestToPlayServices, reason: avoid collision after fix types in other method */
    public o6g convertRequestToPlayServices2(p6g request) {
        throw null;
    }
}
