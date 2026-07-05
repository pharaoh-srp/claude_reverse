package androidx.credentials.playservices;

import android.content.Context;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.exceptions.ClearCredentialProviderConfigurationException;
import androidx.credentials.exceptions.ClearCredentialUnknownException;
import androidx.credentials.exceptions.CreateCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController;
import androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController;
import com.google.android.gms.common.api.ApiException;
import defpackage.ao3;
import defpackage.ax5;
import defpackage.b99;
import defpackage.bz7;
import defpackage.c6k;
import defpackage.coj;
import defpackage.d88;
import defpackage.da5;
import defpackage.dae;
import defpackage.do0;
import defpackage.do3;
import defpackage.ea5;
import defpackage.ee0;
import defpackage.f88;
import defpackage.fe0;
import defpackage.fnf;
import defpackage.hh4;
import defpackage.iei;
import defpackage.j3f;
import defpackage.j65;
import defpackage.j88;
import defpackage.ja5;
import defpackage.jf7;
import defpackage.kik;
import defpackage.m48;
import defpackage.m95;
import defpackage.mdj;
import defpackage.mmj;
import defpackage.mq5;
import defpackage.mr9;
import defpackage.na5;
import defpackage.nik;
import defpackage.o65;
import defpackage.p65;
import defpackage.p6g;
import defpackage.p95;
import defpackage.pcd;
import defpackage.pik;
import defpackage.q75;
import defpackage.q95;
import defpackage.r38;
import defpackage.r5l;
import defpackage.u75;
import defpackage.ua5;
import defpackage.vtk;
import defpackage.w19;
import defpackage.y5h;
import defpackage.yn3;
import defpackage.zn3;
import defpackage.zy7;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 52\u00020\u0001:\u00015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JE\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012JE\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00132\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\fH\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0019\u0010\u001dJ?\u0010!\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u001e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020 0\fH\u0016¢\u0006\u0004\b!\u0010\"J3\u0010&\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0\fH\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b(\u0010)J?\u0010*\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u001e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020 0\fH\u0002¢\u0006\u0004\b*\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R(\u0010-\u001a\u00020,8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b-\u0010.\u0012\u0004\b3\u00104\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00066"}, d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;", "Lq95;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lr38;", "request", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Lm95;", "Lu38;", "Landroidx/credentials/exceptions/GetCredentialException;", "callback", "Liei;", "onGetCredential", "(Landroid/content/Context;Lr38;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lm95;)V", "Lj65;", "Ll65;", "Landroidx/credentials/exceptions/CreateCredentialException;", "onCreateCredential", "(Landroid/content/Context;Lj65;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lm95;)V", "", "isAvailableOnDevice", "()Z", "", "minApkVersion", "(I)Z", "Lzn3;", "Ljava/lang/Void;", "Landroidx/credentials/exceptions/ClearCredentialException;", "onClearCredential", "(Lzn3;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lm95;)V", "Lp6g;", "Lr6g;", "Landroidx/credentials/exceptions/publickeycredential/SignalCredentialStateException;", "onSignalCredentialState", "(Lp6g;Ljava/util/concurrent/Executor;Lm95;)V", "isGooglePlayServicesAvailable", "(Landroid/content/Context;I)I", "runFallbackClearCredFlow", "Landroid/content/Context;", "Lf88;", "googleApiAvailability", "Lf88;", "getGoogleApiAvailability", "()Lf88;", "setGoogleApiAvailability", "(Lf88;)V", "getGoogleApiAvailability$annotations", "()V", "Companion", "credentials-play-services-auth"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class CredentialProviderPlayServicesImpl implements q95 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int MIN_GMS_APK_VERSION = 230815045;
    public static final int MIN_GMS_APK_VERSION_DIGITAL_CRED = 243100000;
    public static final int MIN_GMS_APK_VERSION_RESTORE_CRED = 242200000;
    public static final int MIN_GMS_APK_VERSION_SIGNAL_API = 254625000;
    public static final int PRE_U_MIN_GMS_APK_VERSION = 252400000;
    private static final String TAG = "PlayServicesImpl";
    private final Context context;
    private f88 googleApiAvailability;

    public CredentialProviderPlayServicesImpl(Context context) {
        context.getClass();
        this.context = context;
        this.googleApiAvailability = f88.d;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    private final int isGooglePlayServicesAvailable(Context context, int minApkVersion) {
        return this.googleApiAvailability.c(context, minApkVersion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei onClearCredential$lambda$0(Executor executor, m95 m95Var) {
        executor.execute(new q75(m95Var, 5));
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$0$0(m95 m95Var) {
        m95Var.a(new ClearCredentialProviderConfigurationException());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei onClearCredential$lambda$1(CancellationSignal cancellationSignal, Executor executor, m95 m95Var, Boolean bool) {
        INSTANCE.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, new u75(executor, m95Var, 6));
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei onClearCredential$lambda$1$0(Executor executor, m95 m95Var) {
        Log.i(TAG, "Cleared restore credential successfully!");
        executor.execute(new q75(m95Var, 7));
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$3(CancellationSignal cancellationSignal, Executor executor, m95 m95Var, Exception exc) {
        exc.getClass();
        Log.w(TAG, "Clearing restore credential failed", exc);
        dae daeVar = new dae();
        daeVar.E = new ClearCredentialUnknownException("Clear restore credential failed for unknown reason.");
        if ((exc instanceof ApiException) && ((ApiException) exc).E.E == 40201) {
            daeVar.E = new ClearCredentialUnknownException("The restore credential internal service had a failure.");
        }
        INSTANCE.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, new da5(executor, m95Var, daeVar, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei onClearCredential$lambda$3$0(Executor executor, m95 m95Var, dae daeVar) {
        executor.execute(new ea5(m95Var, daeVar, 2));
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$3$0$0(m95 m95Var, dae daeVar) {
        m95Var.a(daeVar.E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei onClearCredential$lambda$4(CancellationSignal cancellationSignal, Executor executor, m95 m95Var, ao3 ao3Var) {
        INSTANCE.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, new u75(executor, m95Var, 4));
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei onClearCredential$lambda$4$0(Executor executor, m95 m95Var) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new q75(m95Var, 4));
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$6(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, zn3 zn3Var, CancellationSignal cancellationSignal, Executor executor, m95 m95Var, Exception exc) {
        exc.getClass();
        Log.e(TAG, "GMS Clear credential flow failed, calling fallback");
        credentialProviderPlayServicesImpl.runFallbackClearCredFlow(zn3Var, cancellationSignal, executor, m95Var);
    }

    private static final iei onCreateCredential$lambda$0(Executor executor, m95 m95Var) {
        executor.execute(new q75(m95Var, 6));
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateCredential$lambda$0$0(m95 m95Var) {
        m95Var.a(new CreateCredentialProviderConfigurationException("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei onGetCredential$lambda$0(Executor executor, m95 m95Var) {
        executor.execute(new q75(m95Var, 3));
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$0$0(m95 m95Var) {
        m95Var.a(new GetCredentialProviderConfigurationException("this device requires a Google Play Services update for the given feature to be supported"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei onGetCredential$lambda$1(Executor executor, m95 m95Var) {
        executor.execute(new q75(m95Var, 2));
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$1$0(m95 m95Var) {
        m95Var.a(new GetCredentialProviderConfigurationException("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    private final void runFallbackClearCredFlow(zn3 request, final CancellationSignal cancellationSignal, final Executor executor, final m95 callback) {
        coj cojVarI = vtk.i(this.context);
        cojVarI.a.getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Set set = mmj.b;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((mmj) it.next()).getClass();
            mr9.x();
            return;
        }
        j88.a();
        w19 w19VarB = w19.b();
        w19VarB.d = new jf7[]{kik.c};
        w19VarB.c = new fnf(17, cojVarI);
        w19VarB.a = false;
        w19VarB.b = 1554;
        r5l r5lVarC = cojVarI.c(1, w19VarB.a());
        do0 do0Var = new do0(12, new bz7() { // from class: va5
            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                return CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$0(cancellationSignal, executor, callback, (Void) obj);
            }
        });
        r5lVarC.getClass();
        r5lVarC.c(y5h.a, do0Var);
        r5lVarC.a(new ja5(this, cancellationSignal, executor, callback, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei runFallbackClearCredFlow$lambda$0(CancellationSignal cancellationSignal, Executor executor, m95 m95Var, Void r5) {
        INSTANCE.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, new u75(executor, m95Var, 5));
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei runFallbackClearCredFlow$lambda$0$0(Executor executor, m95 m95Var) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new q75(m95Var, 8));
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$2(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, m95 m95Var, Exception exc) {
        exc.getClass();
        INSTANCE.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, new o65(exc, executor, m95Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei runFallbackClearCredFlow$lambda$2$0$0(Exception exc, Executor executor, m95 m95Var) {
        Log.w(TAG, "During clear credential sign out failed with " + exc);
        executor.execute(new p65(m95Var, exc, 3));
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$2$0$0$0(m95 m95Var, Exception exc) {
        m95Var.a(new ClearCredentialUnknownException(exc.getMessage()));
    }

    public final f88 getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    public final boolean isAvailableOnDevice(int minApkVersion) {
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context, minApkVersion);
        boolean z = iIsGooglePlayServicesAvailable == 0;
        if (!z) {
            Log.w(TAG, "Connection with Google Play Services was not successful. Connection result is: " + new hh4(iIsGooglePlayServicesAvailable, null, null));
        }
        return z;
    }

    @Override // defpackage.q95
    public void onClearCredential(zn3 request, final CancellationSignal cancellationSignal, final Executor executor, final m95 callback) {
        request.getClass();
        executor.getClass();
        callback.getClass();
        Companion companion = INSTANCE;
        if (companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return;
        }
        boolean zEquals = request.a.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL");
        int i = 1;
        ee0 ee0Var = fe0.a;
        if (!zEquals) {
            if (!isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
                runFallbackClearCredFlow(request, cancellationSignal, executor, callback);
                return;
            }
            Context context = this.context;
            context.getClass();
            b99 b99Var = new b99(context, b99.k, ee0Var, d88.c);
            yn3 yn3Var = new yn3();
            w19 w19VarB = w19.b();
            w19VarB.d = new jf7[]{pik.c};
            w19VarB.c = new c6k(yn3Var);
            w19VarB.b = 32708;
            r5l r5lVarC = b99Var.c(1, w19VarB.a());
            r5lVarC.getClass();
            do0 do0Var = new do0(11, new bz7() { // from class: ta5
                @Override // defpackage.bz7
                public final Object invoke(Object obj) {
                    return CredentialProviderPlayServicesImpl.onClearCredential$lambda$4(cancellationSignal, executor, callback, (ao3) obj);
                }
            });
            j3f j3fVar = y5h.a;
            r5lVarC.c(j3fVar, do0Var);
            r5lVarC.b(j3fVar, new ua5(this, request, cancellationSignal, executor, callback));
            return;
        }
        if (!isAvailableOnDevice(MIN_GMS_APK_VERSION_RESTORE_CRED)) {
            companion.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, new u75(executor, callback, 7));
            return;
        }
        Context context2 = this.context;
        context2.getClass();
        b99 b99Var2 = new b99(context2, b99.l, ee0Var, d88.c);
        do3 do3Var = new do3(request.b);
        w19 w19VarB2 = w19.b();
        w19VarB2.d = new jf7[]{nik.c};
        ax5 ax5Var = new ax5(12, false);
        ax5Var.F = do3Var;
        w19VarB2.c = ax5Var;
        w19VarB2.b = 1694;
        r5l r5lVarC2 = b99Var2.c(0, w19VarB2.a());
        r5lVarC2.getClass();
        do0 do0Var2 = new do0(10, new bz7() { // from class: wa5
            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$1(cancellationSignal, executor, callback, (Boolean) obj);
            }
        });
        j3f j3fVar2 = y5h.a;
        r5lVarC2.c(j3fVar2, do0Var2);
        r5lVarC2.b(j3fVar2, new na5(cancellationSignal, executor, callback, i));
    }

    public void onCreateCredential(Context context, j65 request, CancellationSignal cancellationSignal, Executor executor, m95 callback) {
        context.getClass();
        throw null;
    }

    @Override // defpackage.q95
    public void onGetCredential(Context context, r38 request, CancellationSignal cancellationSignal, Executor executor, m95 callback) {
        context.getClass();
        request.getClass();
        executor.getClass();
        callback.getClass();
        Companion companion = INSTANCE;
        if (companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return;
        }
        if (companion.isDigitalCredentialRequest$credentials_play_services_auth(request)) {
            if (isAvailableOnDevice(MIN_GMS_APK_VERSION_DIGITAL_CRED)) {
                new CredentialProviderGetDigitalCredentialController(context).invokePlayServices(request, callback, executor, cancellationSignal);
                return;
            } else {
                companion.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, new u75(executor, callback, 2));
                return;
            }
        }
        if (companion.isGetRestoreCredentialRequest$credentials_play_services_auth(request)) {
            if (isAvailableOnDevice(MIN_GMS_APK_VERSION_RESTORE_CRED)) {
                new CredentialProviderGetRestoreCredentialController(context).invokePlayServices(request, callback, executor, cancellationSignal);
                return;
            } else {
                companion.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, new u75(executor, callback, 3));
                return;
            }
        }
        if (isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
            new GetCredentialController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        } else if (companion.isGetSignInIntentRequest$credentials_play_services_auth(request)) {
            new CredentialProviderGetSignInIntentController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        } else {
            new CredentialProviderBeginSignInController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        }
    }

    public void onPrepareCredential(r38 r38Var, CancellationSignal cancellationSignal, Executor executor, m95 m95Var) {
        r38Var.getClass();
        executor.getClass();
        m95Var.getClass();
    }

    public void onSignalCredentialState(p6g request, Executor executor, m95 callback) {
        throw null;
    }

    public final void setGoogleApiAvailability(f88 f88Var) {
        f88Var.getClass();
        this.googleApiAvailability = f88Var;
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000f\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0017\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u001c8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010 \u001a\u00020\u001c8\u0006X\u0087T¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010!\u001a\u00020\u001c8\u0006X\u0087T¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001c8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\"\u0010\u001e¨\u0006#"}, d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl$Companion;", "", "<init>", "()V", "Landroid/os/CancellationSignal;", "cancellationSignal", "Lkotlin/Function0;", "Liei;", "callback", "cancellationReviewerWithCallback$credentials_play_services_auth", "(Landroid/os/CancellationSignal;Lzy7;)V", "cancellationReviewerWithCallback", "", "cancellationReviewer$credentials_play_services_auth", "(Landroid/os/CancellationSignal;)Z", "cancellationReviewer", "Lr38;", "request", "isGetSignInIntentRequest$credentials_play_services_auth", "(Lr38;)Z", "isGetSignInIntentRequest", "isGetRestoreCredentialRequest$credentials_play_services_auth", "isGetRestoreCredentialRequest", "isDigitalCredentialRequest$credentials_play_services_auth", "isDigitalCredentialRequest", "", "TAG", "Ljava/lang/String;", "", "MIN_GMS_APK_VERSION", "I", "PRE_U_MIN_GMS_APK_VERSION", "MIN_GMS_APK_VERSION_RESTORE_CRED", "MIN_GMS_APK_VERSION_DIGITAL_CRED", "MIN_GMS_APK_VERSION_SIGNAL_API", "credentials-play-services-auth"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
    public static final class Companion {
        public /* synthetic */ Companion(mq5 mq5Var) {
            this();
        }

        public final boolean cancellationReviewer$credentials_play_services_auth(CancellationSignal cancellationSignal) {
            if (cancellationSignal == null) {
                Log.i(CredentialProviderPlayServicesImpl.TAG, "No cancellationSignal found");
                return false;
            }
            if (!cancellationSignal.isCanceled()) {
                return false;
            }
            Log.i(CredentialProviderPlayServicesImpl.TAG, "the flow has been canceled");
            return true;
        }

        public final void cancellationReviewerWithCallback$credentials_play_services_auth(CancellationSignal cancellationSignal, zy7 callback) {
            callback.getClass();
            if (cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
                return;
            }
            callback.a();
        }

        public final boolean isDigitalCredentialRequest$credentials_play_services_auth(r38 request) {
            request.getClass();
            for (p95 p95Var : request.a) {
            }
            return false;
        }

        public final boolean isGetRestoreCredentialRequest$credentials_play_services_auth(r38 request) {
            request.getClass();
            for (p95 p95Var : request.a) {
            }
            return false;
        }

        public final boolean isGetSignInIntentRequest$credentials_play_services_auth(r38 request) {
            request.getClass();
            Iterator it = request.a.iterator();
            while (it.hasNext()) {
                if (((p95) it.next()) instanceof m48) {
                    return true;
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    @Override // defpackage.q95
    public boolean isAvailableOnDevice() {
        return isAvailableOnDevice(MIN_GMS_APK_VERSION);
    }

    public void onGetCredential(Context context, pcd pcdVar, CancellationSignal cancellationSignal, Executor executor, m95 m95Var) {
        context.getClass();
        throw null;
    }
}
