package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.api.ApiException;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class hsi implements tb0, ce1, cec, lqj, dzk {
    public final /* synthetic */ int E;
    public Object F;

    public /* synthetic */ hsi(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    public void a(int i, String str, List list, boolean z, boolean z2) {
        pkk pkkVar = (pkk) this.F;
        int i2 = plk.a[sq6.F(i)];
        ygk ygkVar = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? pkkVar.b0().P : pkkVar.b0().R : z ? pkkVar.b0().N : !z2 ? pkkVar.b0().O : pkkVar.b0().M : z ? pkkVar.b0().K : !z2 ? pkkVar.b0().L : pkkVar.b0().J : pkkVar.b0().Q;
        int size = list.size();
        if (size == 1) {
            ygkVar.c(str, list.get(0));
            return;
        }
        if (size == 2) {
            ygkVar.a(list.get(0), list.get(1), str);
        } else if (size != 3) {
            ygkVar.b(str);
        } else {
            ygkVar.d(str, list.get(0), list.get(1), list.get(2));
        }
    }

    @Override // defpackage.ce1
    public void c(int i) {
        ((h88) this.F).c(i);
    }

    @Override // defpackage.ce1
    public void d() {
        ((h88) this.F).d();
    }

    @Override // defpackage.dzk
    public boolean e(Class cls) {
        for (dzk dzkVar : (dzk[]) this.F) {
            if (dzkVar.e(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dzk
    public zzk f(Class cls) {
        for (dzk dzkVar : (dzk[]) this.F) {
            if (dzkVar.e(cls)) {
                return dzkVar.f(cls);
            }
        }
        pmf.n("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.tb0
    public jo7 get(int i) {
        return (jo7) this.F;
    }

    @Override // defpackage.cec
    public void onFailure(Exception exc) {
        hh4 hh4Var;
        if ((exc instanceof ApiException) && (hh4Var = ((ApiException) exc).E.H) != null && hh4Var.F == 24) {
            ((AtomicLong) ((nyj) this.F).G).set(SystemClock.elapsedRealtime());
        }
    }

    @Override // defpackage.lqj
    public Object zza() {
        switch (this.E) {
            case 3:
                return new pyj(((kf5) ((hsi) this.F).F).a);
            default:
                return ((kf5) this.F).a;
        }
    }
}
