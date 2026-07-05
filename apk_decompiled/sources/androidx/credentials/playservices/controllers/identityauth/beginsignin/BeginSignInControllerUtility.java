package androidx.credentials.playservices.controllers.identityauth.beginsignin;

import android.content.Context;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.p95;
import defpackage.r38;
import defpackage.rh1;
import defpackage.sh1;
import defpackage.th1;
import defpackage.uh1;
import defpackage.vh1;
import defpackage.w38;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/credentials/playservices/controllers/identityauth/beginsignin/BeginSignInControllerUtility;", "", "<init>", "()V", "Companion", "credentials-play-services-auth"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class BeginSignInControllerUtility {
    private static final long AUTH_MIN_VERSION_JSON_PARSING = 231815000;
    private static final long AUTH_MIN_VERSION_PREFER_IMME_CRED = 241217000;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "BeginSignInUtility";

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/credentials/playservices/controllers/identityauth/beginsignin/BeginSignInControllerUtility$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "determineDeviceGMSVersionCode", "(Landroid/content/Context;)J", "curAuthVersion", "", "needsBackwardsCompatibleRequest", "(J)Z", "Lw38;", "option", "Lrh1;", "convertToGoogleIdTokenOption", "(Lw38;)Lrh1;", "Lr38;", "request", "Lvh1;", "constructBeginSignInRequest$credentials_play_services_auth", "(Lr38;Landroid/content/Context;)Lvh1;", "constructBeginSignInRequest", "", "TAG", "Ljava/lang/String;", "AUTH_MIN_VERSION_JSON_PARSING", "J", "AUTH_MIN_VERSION_PREFER_IMME_CRED", "credentials-play-services-auth"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
    public static final class Companion {
        public /* synthetic */ Companion(mq5 mq5Var) {
            this();
        }

        private final rh1 convertToGoogleIdTokenOption(w38 option) {
            throw null;
        }

        private final long determineDeviceGMSVersionCode(Context context) {
            context.getPackageManager().getClass();
            return r1.getPackageInfo("com.google.android.gms", 0).versionCode;
        }

        private final boolean needsBackwardsCompatibleRequest(long curAuthVersion) {
            return curAuthVersion < BeginSignInControllerUtility.AUTH_MIN_VERSION_JSON_PARSING;
        }

        public final vh1 constructBeginSignInRequest$credentials_play_services_auth(r38 request, Context context) {
            request.getClass();
            context.getClass();
            uh1 uh1Var = new uh1(false);
            rh1 rh1Var = new rh1(false, null, null, true, null, null, false);
            th1 th1Var = new th1(null, false, null);
            sh1 sh1Var = new sh1(false, null);
            determineDeviceGMSVersionCode(context);
            for (p95 p95Var : request.a) {
            }
            return new vh1(uh1Var, rh1Var, null, false, 0, th1Var, sh1Var, false);
        }

        private Companion() {
        }
    }
}
