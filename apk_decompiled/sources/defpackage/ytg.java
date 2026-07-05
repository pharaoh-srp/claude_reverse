package defpackage;

import android.os.SystemClock;
import androidx.media3.common.util.StuckPlayerException;
import androidx.media3.exoplayer.ExoPlaybackException;

/* JADX INFO: loaded from: classes2.dex */
public final class ytg {
    public final int a;
    public int b;
    public boolean c;
    public long d;
    public final /* synthetic */ co1 e;

    public ytg(co1 co1Var, int i) {
        this.e = co1Var;
        this.a = i;
    }

    public final void a() {
        co1 co1Var = this.e;
        k1h k1hVar = (k1h) co1Var.f;
        v77 v77Var = (v77) co1Var.a;
        int iO = v77Var.o();
        if (!v77Var.m() || v77Var.n() == 1 || v77Var.n() == 4 || iO == 0 || iO == 1) {
            if (this.c) {
                k1hVar.e(4);
            }
            this.c = false;
            return;
        }
        ((g1h) co1Var.d).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.c;
        int i = this.a;
        if (z && this.b == iO) {
            if (jElapsedRealtime - this.d >= i) {
                ((r77) co1Var.c).E.B(new ExoPlaybackException(2, new StuckPlayerException(4, i), 1003));
                return;
            }
            return;
        }
        this.c = true;
        this.d = jElapsedRealtime;
        this.b = iO;
        k1hVar.e(4);
        k1hVar.a.sendEmptyMessageDelayed(4, i);
    }
}
