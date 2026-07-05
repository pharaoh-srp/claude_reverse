package defpackage;

import android.os.SystemClock;
import androidx.media3.common.util.StuckPlayerException;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class wtg {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public long e;
    public boolean f;
    public long g;
    public final /* synthetic */ co1 h;

    public wtg(co1 co1Var, int i) {
        this.h = co1Var;
        this.a = i;
    }

    public final void a() {
        co1 co1Var = this.h;
        k1h k1hVar = (k1h) co1Var.f;
        v77 v77Var = (v77) co1Var.a;
        if (v77Var.n() != 3 || !v77Var.m() || v77Var.o() != 0) {
            if (this.f) {
                k1hVar.e(2);
            }
            this.f = false;
            return;
        }
        mqh mqhVarJ = v77Var.j();
        Object objL = mqhVarJ.p() ? null : mqhVarJ.l(v77Var.g());
        int iD = v77Var.d();
        int iE = v77Var.e();
        long jH = v77Var.h();
        if (objL != null && iD == -1) {
            jH -= tpi.M(mqhVarJ.g(objL, (jqh) co1Var.e).e);
        }
        ((g1h) co1Var.d).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.f;
        int i = this.a;
        if (z && Objects.equals(objL, this.b) && iD == this.c && iE == this.d && jH == this.e) {
            if (jElapsedRealtime - this.g >= i) {
                ((r77) co1Var.c).E.B(new ExoPlaybackException(2, new StuckPlayerException(2, i), 1003));
                return;
            }
            return;
        }
        this.f = true;
        this.g = jElapsedRealtime;
        this.b = objL;
        this.c = iD;
        this.d = iE;
        this.e = jH;
        k1hVar.e(2);
        k1hVar.a.sendEmptyMessageDelayed(2, i);
    }
}
