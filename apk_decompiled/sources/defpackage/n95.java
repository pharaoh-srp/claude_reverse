package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.ClearCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;

/* JADX INFO: loaded from: classes2.dex */
public final class n95 implements c6b {
    public final Context E;

    public n95(Context context, int i) {
        switch (i) {
            case 1:
                this.E = context;
                break;
            default:
                context.getClass();
                this.E = context;
                break;
        }
    }

    public static Object b(Context context, r38 r38Var, v2h v2hVar) {
        ua2 ua2Var = new ua2(1, zni.I(v2hVar));
        ua2Var.t();
        CancellationSignal cancellationSignal = new CancellationSignal();
        ua2Var.w(new l95(cancellationSignal, 1));
        bt4 bt4Var = new bt4(ua2Var);
        ao0 ao0Var = new ao0(1);
        context.getClass();
        q95 q95VarA = kq1.a(new kq1(context, 2), r38Var);
        if (q95VarA == null) {
            bt4Var.a(new GetCredentialProviderConfigurationException("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            q95VarA.onGetCredential(context, r38Var, cancellationSignal, ao0Var, bt4Var);
        }
        return ua2Var.r();
    }

    public Object a(zn3 zn3Var, hs5 hs5Var) {
        ua2 ua2Var = new ua2(1, zni.I(hs5Var));
        ua2Var.t();
        CancellationSignal cancellationSignal = new CancellationSignal();
        ua2Var.w(new l95(cancellationSignal, 0));
        z22 z22Var = new z22(ua2Var, 3);
        ao0 ao0Var = new ao0(1);
        q95 q95VarA = kq1.a(new kq1(this.E, 2), zn3Var.a);
        if (q95VarA == null) {
            z22Var.a(new ClearCredentialProviderConfigurationException());
        } else {
            q95VarA.onClearCredential(zn3Var, cancellationSignal, ao0Var, z22Var);
        }
        Object objR = ua2Var.r();
        return objR == m45.E ? objR : iei.a;
    }

    @Override // defpackage.c6b
    public d6b j(h2f h2fVar) {
        Context context;
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && ((context = this.E) == null || i < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            return new am4(21).j(h2fVar);
        }
        int iF = gkb.f(((jw7) h2fVar.d).o);
        ysj.n("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(tpi.u(iF)));
        l11 l11Var = new l11(iF, 0);
        l11 l11Var2 = new l11(iF, 1);
        m11 m11Var = new m11();
        m11Var.F = l11Var;
        m11Var.G = l11Var2;
        m11Var.E = true;
        m11Var.E = true;
        return m11Var.j(h2fVar);
    }
}
