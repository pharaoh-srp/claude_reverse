package defpackage;

import android.os.SystemClock;
import androidx.media3.common.util.StuckPlayerException;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class vtg {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public long e;
    public long f;
    public boolean g;
    public long h;
    public final /* synthetic */ co1 i;

    public vtg(co1 co1Var, int i) {
        this.i = co1Var;
        this.a = i;
    }

    public final void a() {
        long jM;
        if (((v77) this.i.a).n() != 2 || !((v77) this.i.a).m() || ((v77) this.i.a).o() != 0) {
            if (this.g) {
                ((k1h) this.i.f).e(1);
            }
            this.g = false;
            return;
        }
        mqh mqhVarJ = ((v77) this.i.a).j();
        Object objL = mqhVarJ.p() ? null : mqhVarJ.l(((v77) this.i.a).g());
        int iD = ((v77) this.i.a).d();
        int iE = ((v77) this.i.a).e();
        v77 v77Var = (v77) this.i.a;
        v77Var.F();
        if (v77Var.r()) {
            j6d j6dVar = v77Var.d0;
            jM = j6dVar.k.equals(j6dVar.b) ? tpi.M(v77Var.d0.q) : v77Var.l();
        } else {
            v77Var.F();
            if (v77Var.d0.a.p()) {
                jM = v77Var.f0;
            } else {
                j6d j6dVar2 = v77Var.d0;
                if (j6dVar2.k.d != j6dVar2.b.d) {
                    jM = tpi.M(j6dVar2.a.m(v77Var.f(), v77Var.a, 0L).k);
                } else {
                    long j = j6dVar2.q;
                    if (v77Var.d0.k.b()) {
                        j6d j6dVar3 = v77Var.d0;
                        j6dVar3.a.g(j6dVar3.k.a, v77Var.o).d(v77Var.d0.k.b);
                        j = 0;
                    }
                    j6d j6dVar4 = v77Var.d0;
                    mqh mqhVar = j6dVar4.a;
                    Object obj = j6dVar4.k.a;
                    jqh jqhVar = v77Var.o;
                    mqhVar.g(obj, jqhVar);
                    jM = tpi.M(j + jqhVar.e);
                }
            }
        }
        long jMax = Math.max(0L, jM - ((v77) this.i.a).h());
        v77 v77Var2 = (v77) this.i.a;
        v77Var2.F();
        long jMax2 = Math.max(0L, tpi.M(v77Var2.d0.r) - jMax);
        if (objL != null && iD == -1) {
            jM -= tpi.M(mqhVarJ.g(objL, (jqh) this.i.e).e);
        }
        ((g1h) this.i.d).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.g && Objects.equals(objL, this.b) && iD == this.c && iE == this.d && jM == this.e && jMax2 == this.f) {
            long j2 = jElapsedRealtime - this.h;
            int i = this.a;
            if (j2 >= i) {
                ((r77) this.i.c).E.B(new ExoPlaybackException(2, new StuckPlayerException(1, i), 1003));
                return;
            }
            return;
        }
        this.g = true;
        this.h = jElapsedRealtime;
        this.b = objL;
        this.c = iD;
        this.d = iE;
        this.e = jM;
        this.f = jMax2;
        ((k1h) this.i.f).e(1);
        ((k1h) this.i.f).a.sendEmptyMessageDelayed(1, this.a);
    }
}
