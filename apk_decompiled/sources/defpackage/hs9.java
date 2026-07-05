package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class hs9 {
    public final wdg a;

    public hs9(wdg wdgVar, unb unbVar) {
        this.a = wdgVar;
    }

    public final long a() {
        is9 is9Var;
        wdg wdgVar = this.a;
        wdgVar.a();
        cbf cbfVar = wdgVar.e;
        x2g x2gVar = (x2g) cbfVar.F;
        long j = x2gVar.a.getLong("com.lyft.kronos.cached_current_time", 0L);
        long j2 = x2gVar.a.getLong("com.lyft.kronos.cached_elapsed_time", 0L);
        rdg rdgVar = j2 == 0 ? null : new rdg(j, j2, x2gVar.a.getLong("com.lyft.kronos.cached_offset", 0L), (unb) cbfVar.G);
        if (((udg) wdgVar.a.get()) == udg.E && rdgVar != null && Math.abs((rdgVar.a - rdgVar.b) - (System.currentTimeMillis() - SystemClock.elapsedRealtime())) >= 1000) {
            cbf cbfVar2 = wdgVar.e;
            synchronized (cbfVar2) {
                ((x2g) cbfVar2.F).a.edit().clear().apply();
            }
            rdgVar = null;
        }
        if (rdgVar == null) {
            if (SystemClock.elapsedRealtime() - wdgVar.b.get() >= wdgVar.i) {
                wdgVar.b();
            }
            is9Var = null;
        } else {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - rdgVar.b;
            if (jElapsedRealtime >= wdgVar.j && SystemClock.elapsedRealtime() - wdgVar.b.get() >= wdgVar.i) {
                wdgVar.b();
            }
            is9Var = new is9((SystemClock.elapsedRealtime() - rdgVar.b) + rdgVar.a + rdgVar.c, Long.valueOf(jElapsedRealtime));
        }
        if (is9Var == null) {
            is9Var = new is9(System.currentTimeMillis(), null);
        }
        return is9Var.a;
    }
}
