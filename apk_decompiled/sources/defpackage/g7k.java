package defpackage;

import android.os.SystemClock;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g7k implements Callable {
    public final /* synthetic */ zs9 E;
    public final /* synthetic */ ffk F;
    public final /* synthetic */ String G;
    public final /* synthetic */ boolean H;

    public /* synthetic */ g7k(zs9 zs9Var, ffk ffkVar, String str, boolean z) {
        this.E = zs9Var;
        this.F = ffkVar;
        this.G = str;
        this.H = z;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        zs9 zs9Var = this.E;
        ffk ffkVar = this.F;
        String str = this.G;
        boolean z = this.H;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            String strA = ffkVar.a(str.substring(0, Math.min(str.length(), 200)));
            c6k c6kVar = new c6k();
            wg wgVar = new wg(17);
            wgVar.F = strA;
            c6kVar.E = new nqk(wgVar);
            zs9Var.f(jElapsedRealtime, z, new hrk(c6kVar), wmk.NO_ERROR);
            return strA;
        } catch (RuntimeException e) {
            zs9Var.f(jElapsedRealtime, z, null, wmk.UNKNOWN_ERROR);
            throw e;
        }
    }
}
