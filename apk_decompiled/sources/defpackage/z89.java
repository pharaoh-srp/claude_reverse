package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: loaded from: classes3.dex */
public final class z89 extends iv1 {
    public final /* synthetic */ int f;

    public /* synthetic */ z89(int i) {
        this.f = i;
    }

    @Override // defpackage.iv1
    public ge0 k(Context context, Looper looper, rl rlVar, Object obj, h88 h88Var, i88 i88Var) {
        switch (this.f) {
            case 2:
                rlVar.getClass();
                Integer num = (Integer) rlVar.J;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new i6g(context, looper, rlVar, bundle, h88Var, i88Var);
            case 3:
                throw ij0.e(obj);
            case 4:
            case 6:
            default:
                return super.k(context, looper, rlVar, obj, h88Var, i88Var);
            case 5:
                return new joj(context, looper, rlVar, (ioj) obj, (kmj) h88Var, (kmj) i88Var);
            case 7:
                return new koj(context, looper, rlVar, (GoogleSignInOptions) obj, (kmj) h88Var, (kmj) i88Var);
            case 8:
                return new fvk(rlVar, context, looper, (kmj) h88Var, (kmj) i88Var);
        }
    }

    @Override // defpackage.iv1
    public ge0 l(Context context, Looper looper, rl rlVar, Object obj, kmj kmjVar, kmj kmjVar2) {
        switch (this.f) {
            case 0:
                context.getClass();
                looper.getClass();
                ((ee0) obj).getClass();
                return new qv8(context, looper, 352, rlVar, kmjVar, kmjVar2, 0);
            case 1:
                context.getClass();
                looper.getClass();
                ((ee0) obj).getClass();
                return new dre(context, looper, 381, rlVar, kmjVar, kmjVar2, 0);
            case 2:
            case 3:
            case 5:
            default:
                return super.l(context, looper, rlVar, obj, kmjVar, kmjVar2);
            case 4:
                return new znj(context, looper, 308, rlVar, kmjVar, kmjVar2, 0);
            case 6:
                return new doj(rlVar, context, looper, kmjVar, kmjVar2);
        }
    }
}
