package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.anthropic.claude.R;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class hq1 extends cx7 {
    public final Handler y0 = new Handler(Looper.getMainLooper());
    public qq1 z0;

    @Override // defpackage.cx7
    public final void C() {
        this.i0 = true;
        if (Build.VERSION.SDK_INT == 29 && mvk.f(this.z0.e())) {
            qq1 qq1Var = this.z0;
            qq1Var.o = true;
            this.y0.postDelayed(new gq1(qq1Var, 2), 250L);
        }
    }

    @Override // defpackage.cx7
    public final void D() {
        this.i0 = true;
        if (Build.VERSION.SDK_INT >= 29 || this.z0.m) {
            return;
        }
        fx7 fx7VarH = h();
        if (fx7VarH == null || !fx7VarH.isChangingConfigurations()) {
            H(0);
        }
    }

    public final void H(int i) {
        if (i == 3 || !this.z0.o) {
            if (L()) {
                this.z0.j = i;
                if (i == 1) {
                    O(10, zik.i(j(), 10));
                }
            }
            qq1 qq1Var = this.z0;
            if (qq1Var.g == null) {
                qq1Var.g = new ive(17, false);
            }
            ive iveVar = qq1Var.g;
            CancellationSignal cancellationSignal = (CancellationSignal) iveVar.F;
            if (cancellationSignal != null) {
                try {
                    ab2.a(cancellationSignal);
                } catch (NullPointerException e) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
                }
                iveVar.F = null;
            }
        }
    }

    public final void I() {
        this.z0.k = false;
        J();
        if (!this.z0.m && p()) {
            tb1 tb1Var = new tb1(l());
            tb1Var.h(this);
            tb1Var.e(true, true);
        }
        Context contextJ = j();
        if (contextJ != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29 && str != null) {
                for (String str2 : contextJ.getResources().getStringArray(R.array.delay_showing_prompt_models)) {
                    if (str.equals(str2)) {
                        qq1 qq1Var = this.z0;
                        qq1Var.n = true;
                        this.y0.postDelayed(new gq1(qq1Var, 1), 600L);
                        return;
                    }
                }
            }
        }
    }

    public final void J() {
        this.z0.k = false;
        if (p()) {
            rx7 rx7VarL = l();
            gl7 gl7Var = (gl7) rx7VarL.D("androidx.biometric.FingerprintDialogFragment");
            if (gl7Var != null) {
                if (gl7Var.p()) {
                    gl7Var.H(false);
                    return;
                }
                tb1 tb1Var = new tb1(rx7VarL);
                tb1Var.h(gl7Var);
                tb1Var.e(true, true);
            }
        }
    }

    public final boolean K() {
        return Build.VERSION.SDK_INT <= 28 && mvk.f(this.z0.e());
    }

    public final boolean L() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            fx7 fx7VarH = h();
            if (fx7VarH != null && this.z0.e != null) {
                String str = Build.MANUFACTURER;
                String str2 = Build.MODEL;
                if (i == 28) {
                    if (str != null) {
                        for (String str3 : fx7VarH.getResources().getStringArray(R.array.crypto_fingerprint_fallback_vendors)) {
                            if (str.equalsIgnoreCase(str3)) {
                                break;
                            }
                        }
                    }
                    String str4 = Build.MODEL;
                    if (str4 != null) {
                        for (String str5 : fx7VarH.getResources().getStringArray(R.array.crypto_fingerprint_fallback_prefixes)) {
                            if (!str4.startsWith(str5)) {
                            }
                        }
                    }
                }
            }
            if (Build.VERSION.SDK_INT != 28) {
                return false;
            }
            Context contextJ = j();
            return contextJ == null || contextJ.getPackageManager() == null || !cnc.a(contextJ.getPackageManager());
        }
        return true;
    }

    public final void M() {
        fx7 fx7VarH = h();
        if (fx7VarH == null) {
            Log.e("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager keyguardManagerA = yp9.a(fx7VarH);
        if (keyguardManagerA == null) {
            N(12, m(R.string.generic_error_no_keyguard));
            return;
        }
        qq1 qq1Var = this.z0;
        xv8 xv8Var = qq1Var.d;
        CharSequence charSequence = xv8Var != null ? (CharSequence) xv8Var.F : null;
        CharSequence charSequence2 = xv8Var != null ? (CharSequence) xv8Var.G : null;
        qq1Var.getClass();
        Intent intentA = bq1.a(keyguardManagerA, charSequence, charSequence2 != null ? charSequence2 : null);
        if (intentA == null) {
            N(14, m(R.string.generic_error_no_device_credential));
            return;
        }
        this.z0.m = true;
        if (L()) {
            J();
        }
        intentA.setFlags(134742016);
        if (this.Y == null) {
            xh6.b(this, " not attached to Activity", "Fragment ");
            return;
        }
        rx7 rx7VarL = l();
        if (rx7VarL.C != null) {
            rx7VarL.F.addLast(new nx7(this.I, 1));
            rx7VarL.C.t(intentA);
        } else {
            rx7VarL.w.getClass();
            intentA.getClass();
            sz6.j("Starting activity with a requestCode requires a FragmentActivity host");
        }
    }

    public final void N(int i, CharSequence charSequence) {
        O(i, charSequence);
        I();
    }

    public final void O(int i, CharSequence charSequence) {
        qq1 qq1Var = this.z0;
        if (qq1Var.m) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
            return;
        }
        if (!qq1Var.l) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
            return;
        }
        int i2 = 0;
        qq1Var.l = false;
        Executor fq1Var = qq1Var.b;
        if (fq1Var == null) {
            fq1Var = new fq1(1);
        }
        fq1Var.execute(new yp1(this, i, charSequence, i2));
    }

    public final void P(lq1 lq1Var) {
        qq1 qq1Var = this.z0;
        if (qq1Var.l) {
            boolean z = false;
            qq1Var.l = false;
            Executor fq1Var = qq1Var.b;
            if (fq1Var == null) {
                fq1Var = new fq1(1);
            }
            fq1Var.execute(new t08(this, lq1Var, z, 3));
        } else {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        }
        I();
    }

    public final void Q(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = m(R.string.default_error_msg);
        }
        this.z0.h(2);
        this.z0.g(charSequence);
    }

    public final void R() {
        if (this.z0.k) {
            return;
        }
        if (j() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        qq1 qq1Var = this.z0;
        qq1Var.k = true;
        qq1Var.l = true;
        if (L()) {
            N(12, zik.i(F().getApplicationContext(), 12));
            return;
        }
        BiometricPrompt.Builder builderD = cq1.d(F().getApplicationContext());
        qq1 qq1Var2 = this.z0;
        xv8 xv8Var = qq1Var2.d;
        CharSequence charSequence = null;
        CharSequence charSequence2 = xv8Var != null ? (CharSequence) xv8Var.F : null;
        CharSequence charSequence3 = xv8Var != null ? (CharSequence) xv8Var.G : null;
        qq1Var2.getClass();
        if (charSequence2 != null) {
            cq1.g(builderD, charSequence2);
        }
        if (charSequence3 != null) {
            cq1.f(builderD, charSequence3);
        }
        qq1 qq1Var3 = this.z0;
        String str = qq1Var3.i;
        if (str != null) {
            charSequence = str;
        } else {
            xv8 xv8Var2 = qq1Var3.d;
            if (xv8Var2 != null && (charSequence = (CharSequence) xv8Var2.H) == null) {
                charSequence = "";
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            Executor fq1Var = this.z0.b;
            if (fq1Var == null) {
                fq1Var = new fq1(1);
            }
            qq1 qq1Var4 = this.z0;
            if (qq1Var4.h == null) {
                qq1Var4.h = new pq1(qq1Var4);
            }
            cq1.e(builderD, charSequence, fq1Var, qq1Var4.h);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            xv8 xv8Var3 = this.z0.d;
            dq1.a(builderD, true);
        }
        int iE = this.z0.e();
        if (i >= 30) {
            eq1.a(builderD, iE);
        } else if (i >= 29) {
            dq1.b(builderD, mvk.f(iE));
        }
        BiometricPrompt biometricPromptC = cq1.c(builderD);
        Context contextJ = j();
        BiometricPrompt.CryptoObject cryptoObjectH = hvk.h(this.z0.e);
        qq1 qq1Var5 = this.z0;
        boolean z = false;
        if (qq1Var5.g == null) {
            qq1Var5.g = new ive(17, z);
        }
        ive iveVar = qq1Var5.g;
        if (((CancellationSignal) iveVar.F) == null) {
            iveVar.F = ab2.b();
        }
        CancellationSignal cancellationSignal = (CancellationSignal) iveVar.F;
        fq1 fq1Var2 = new fq1(0);
        qq1 qq1Var6 = this.z0;
        if (qq1Var6.f == null) {
            oq1 oq1Var = new oq1(qq1Var6);
            epk epkVar = new epk();
            epkVar.F = oq1Var;
            qq1Var6.f = epkVar;
        }
        epk epkVar2 = qq1Var6.f;
        if (((BiometricPrompt$AuthenticationCallback) epkVar2.E) == null) {
            epkVar2.E = u61.a((oq1) epkVar2.F);
        }
        BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback = (BiometricPrompt$AuthenticationCallback) epkVar2.E;
        try {
            if (cryptoObjectH == null) {
                cq1.b(biometricPromptC, cancellationSignal, fq1Var2, biometricPrompt$AuthenticationCallback);
            } else {
                cq1.a(biometricPromptC, cryptoObjectH, cancellationSignal, fq1Var2, biometricPrompt$AuthenticationCallback);
            }
        } catch (NullPointerException e) {
            Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e);
            N(1, contextJ != null ? contextJ.getString(R.string.default_error_msg) : "");
        }
    }

    @Override // defpackage.cx7
    public final void t(int i, int i2, Intent intent) {
        super.t(i, i2, intent);
        if (i == 1) {
            this.z0.m = false;
            if (i2 == -1) {
                P(new lq1(null, 1));
            } else {
                N(10, m(R.string.generic_error_user_canceled));
            }
        }
    }

    @Override // defpackage.cx7
    public final void v(Bundle bundle) {
        super.v(bundle);
        if (h() == null) {
            return;
        }
        fx7 fx7VarH = h();
        fx7VarH.getClass();
        dyi dyiVarF = fx7VarH.f();
        zxi zxiVarL = fx7VarH.l();
        sub subVarD = fx7VarH.d();
        zxiVarL.getClass();
        dpf dpfVar = new dpf(dyiVarF, zxiVarL, subVarD);
        pl9 pl9VarB = jce.a.b(qq1.class);
        String strD = pl9VarB.d();
        if (strD == null) {
            sz6.p("Local and anonymous classes can not be ViewModels");
            return;
        }
        qq1 qq1Var = (qq1) dpfVar.L(pl9VarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strD));
        this.z0 = qq1Var;
        if (qq1Var.p == null) {
            qq1Var.p = new bvb();
        }
        int i = 0;
        qq1Var.p.d(this, new zp1(this, i));
        qq1 qq1Var2 = this.z0;
        if (qq1Var2.q == null) {
            qq1Var2.q = new bvb();
        }
        qq1Var2.q.d(this, new aq1(this, i));
        qq1 qq1Var3 = this.z0;
        if (qq1Var3.r == null) {
            qq1Var3.r = new bvb();
        }
        int i2 = 1;
        qq1Var3.r.d(this, new zp1(this, i2));
        qq1 qq1Var4 = this.z0;
        if (qq1Var4.s == null) {
            qq1Var4.s = new bvb();
        }
        qq1Var4.s.d(this, new aq1(this, i2));
        qq1 qq1Var5 = this.z0;
        if (qq1Var5.t == null) {
            qq1Var5.t = new bvb();
        }
        int i3 = 2;
        qq1Var5.t.d(this, new zp1(this, i3));
        qq1 qq1Var6 = this.z0;
        if (qq1Var6.v == null) {
            qq1Var6.v = new bvb();
        }
        qq1Var6.v.d(this, new aq1(this, i3));
    }
}
