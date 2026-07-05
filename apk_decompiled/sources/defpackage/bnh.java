package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.l0;
import com.google.android.gms.internal.measurement.m0;
import com.google.android.gms.internal.measurement.zzkl$zzb;
import java.nio.charset.Charset;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class bnh implements fb8, tb0, vbj, plj, see, jjk, lqj {
    public final /* synthetic */ int E;
    public final Object F;

    public bnh(float f, float f2, sb0 sb0Var) {
        this.E = 1;
        int iB = sb0Var.b();
        vo7[] vo7VarArr = new vo7[iB];
        for (int i = 0; i < iB; i++) {
            vo7VarArr[i] = new vo7(f, f2, sb0Var.a(i));
        }
        this.F = vo7VarArr;
    }

    public static String k(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = kgh.p(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return ij0.C(str, " : ", str2);
    }

    public void a() {
        yzk yzkVar = (yzk) this.F;
        yzkVar.K0();
        vik vikVarI0 = yzkVar.I0();
        umk umkVar = (umk) yzkVar.E;
        umkVar.R.getClass();
        if (vikVarI0.Q0(System.currentTimeMillis())) {
            yzkVar.I0().Q.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                yzkVar.b0().R.b("Detected application was in foreground");
                umkVar.R.getClass();
                h(System.currentTimeMillis());
            }
        }
    }

    @Override // defpackage.see
    public void accept(Object obj, Object obj2) {
        ((nnj) ((tnj) obj).t()).O((ibh) this.F);
        ((j5h) obj2).b(null);
    }

    public void b(int i, Object obj, b0l b0lVar) throws zzkl$zzb {
        m0 m0Var = (m0) this.F;
        m0Var.o(i, 3);
        b0lVar.g((l0) obj, m0Var.a);
        m0Var.o(i, 4);
    }

    @Override // defpackage.fb8
    public Object c(Object obj) {
        return ((xmh) obj).x();
    }

    @Override // defpackage.qlj
    public Object d() {
        return (Context) this.F;
    }

    @Override // defpackage.jjk
    public glk e(Class cls) {
        for (int i = 0; i < 2; i++) {
            jjk jjkVar = ((jjk[]) this.F)[i];
            if (jjkVar.w(cls)) {
                return jjkVar.e(cls);
            }
        }
        pmf.n("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    public void f(long j) {
        yzk yzkVar = (yzk) this.F;
        yzkVar.K0();
        yzkVar.R0();
        if (yzkVar.I0().Q0(j)) {
            yzkVar.I0().Q.a(true);
            ((umk) yzkVar.E).j().T0();
        }
        yzkVar.I0().U.b(j);
        if (yzkVar.I0().Q.b()) {
            h(j);
        }
    }

    public void g(int i, Object obj, b0l b0lVar) throws zzkl$zzb {
        m0 m0Var = (m0) this.F;
        l0 l0Var = (l0) obj;
        m0Var.o(i, 2);
        m0Var.n(l0Var.a(b0lVar));
        b0lVar.g(l0Var, m0Var.a);
    }

    @Override // defpackage.tb0
    public jo7 get(int i) {
        return ((vo7[]) this.F)[i];
    }

    public void h(long j) {
        yzk yzkVar = (yzk) this.F;
        yzkVar.K0();
        umk umkVar = (umk) yzkVar.E;
        if (umkVar.e()) {
            yzkVar.I0().U.b(j);
            umkVar.R.getClass();
            yzkVar.b0().R.c("Session started, time", Long.valueOf(SystemClock.elapsedRealtime()));
            long j2 = j / 1000;
            yzkVar.L0().S0(j, Long.valueOf(j2), "auto", "_sid");
            yzkVar.I0().V.b(j2);
            yzkVar.I0().Q.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j2);
            yzkVar.L0().R0(j, bundle, "auto", "_s");
            String strD = yzkVar.I0().a0.d();
            if (TextUtils.isEmpty(strD)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strD);
            yzkVar.L0().R0(j, bundle2, "auto", "_ssr");
        }
    }

    public void i(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", k((String) this.F, str, objArr));
        }
    }

    public void j(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", k((String) this.F, str, objArr));
        }
    }

    @Override // defpackage.fb8
    public Iterator t0() {
        return ((Iterable) this.F).iterator();
    }

    @Override // defpackage.jjk
    public boolean w(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((jjk[]) this.F)[i].w(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.lqj
    public Object zza() {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 7:
                dfk dfkVar = (dfk) ((lqj) obj).zza();
                if (dfkVar != null) {
                    return dfkVar;
                }
                mr9.h("Cannot return null from a non-@Nullable @Provides method");
                return null;
            default:
                return new v4l(((kf5) ((hsi) obj).F).a);
        }
    }

    public bnh(String str) {
        this.E = 5;
        this.F = vb7.q("UID: [", "]  PID: [", Process.myUid(), Process.myPid(), "] ").concat(str);
    }

    public bnh(m0 m0Var) {
        this.E = 8;
        Charset charset = sxk.a;
        this.F = m0Var;
        m0Var.a = this;
    }

    public bnh(udj udjVar, gbj gbjVar, v4i v4iVar) {
        this.E = 2;
        this.F = gbjVar;
    }

    public /* synthetic */ bnh(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }
}
