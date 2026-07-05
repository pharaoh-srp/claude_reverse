package defpackage;

import android.os.SystemClock;
import androidx.media3.common.util.StuckPlayerException;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class xtg {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public boolean e;
    public long f;
    public final /* synthetic */ co1 g;

    public xtg(co1 co1Var, int i) {
        this.g = co1Var;
        this.a = i;
    }

    public final void a() {
        long jL;
        co1 co1Var = this.g;
        jqh jqhVar = (jqh) co1Var.e;
        k1h k1hVar = (k1h) co1Var.f;
        v77 v77Var = (v77) co1Var.a;
        mqh mqhVarJ = v77Var.j();
        Object objL = mqhVarJ.p() ? null : mqhVarJ.l(v77Var.g());
        int iD = v77Var.d();
        int iE = v77Var.e();
        long jH = v77Var.h();
        if (objL == null || iD != -1) {
            jL = iD != -1 ? v77Var.l() : -9223372036854775807L;
        } else {
            mqhVarJ.g(objL, jqhVar);
            jH -= tpi.M(jqhVar.e);
            jL = tpi.M(jqhVar.d);
        }
        boolean z = v77Var.n() == 3 && v77Var.m() && v77Var.o() == 0;
        if (!z || jL == -9223372036854775807L || jH < jL) {
            k1hVar.e(3);
            if (z && jL != -9223372036854775807L) {
                v77Var.F();
                k1hVar.a.sendEmptyMessageDelayed(3, (int) Math.ceil((jL - jH) / v77Var.d0.o.a));
            }
            this.e = false;
            return;
        }
        ((g1h) co1Var.d).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z2 = this.e;
        int i = this.a;
        if (z2 && Objects.equals(objL, this.b) && iD == this.c && iE == this.d) {
            if (jElapsedRealtime - this.f >= i) {
                ((r77) co1Var.c).E.B(new ExoPlaybackException(2, new StuckPlayerException(3, i), 1003));
                return;
            }
            return;
        }
        this.e = true;
        this.f = jElapsedRealtime;
        this.b = objL;
        this.c = iD;
        this.d = iE;
        k1hVar.e(3);
        k1hVar.a.sendEmptyMessageDelayed(3, i);
    }
}
