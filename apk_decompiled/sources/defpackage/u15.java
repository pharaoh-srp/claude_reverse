package defpackage;

import android.os.SystemClock;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class u15 implements gsi {
    public long E;
    public long F;
    public Object G;

    public u15(int i) {
        switch (i) {
            case 1:
                this.E = -9223372036854775807L;
                this.F = -9223372036854775807L;
                break;
            default:
                t15 t15Var = t15.E;
                this.E = 300000L;
                this.G = t15Var;
                break;
        }
    }

    public boolean b(String str, boolean z) {
        if (!z && str != null) {
            long j = this.F;
            if (j == 0) {
                return false;
            }
            this.F = 0L;
            if (((Number) ((zy7) this.G).a()).longValue() - j < this.E) {
                return true;
            }
        }
        return false;
    }

    public void c(Exception exc) throws Exception {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.G) == null) {
            this.G = exc;
        }
        if (this.E == -9223372036854775807L && vp5.c0.get() <= 0) {
            this.E = 200 + jElapsedRealtime;
        }
        long j = this.E;
        if (j == -9223372036854775807L || jElapsedRealtime < j) {
            this.F = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = (Exception) this.G;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = (Exception) this.G;
        this.G = null;
        this.E = -9223372036854775807L;
        this.F = -9223372036854775807L;
        throw exc3;
    }

    public void d(sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3) {
        if (x44.r(sb0Var, null) && x44.r(sb0Var2, null) && x44.r(sb0Var3, null)) {
            return;
        }
        long jE = ((dpf) ((w9h) this.G).E).e(sb0Var, sb0Var2, sb0Var3);
        this.F = jE;
        this.E = (long) (jE * 0.1f);
    }

    @Override // defpackage.dsi
    public long e(sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3) {
        d(sb0Var, sb0Var2, sb0Var3);
        return this.F + this.E;
    }

    @Override // defpackage.dsi
    public sb0 f(long j, sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3) {
        d(sb0Var, sb0Var2, sb0Var3);
        long j2 = this.E;
        if (j <= j2) {
            return sb0Var3;
        }
        return ((dpf) ((w9h) this.G).E).f(j - j2, sb0Var, sb0Var2, sb0Var3);
    }

    @Override // defpackage.dsi
    public sb0 p(long j, sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3) {
        d(sb0Var, sb0Var2, sb0Var3);
        long j2 = this.E;
        if (j <= j2) {
            return sb0Var;
        }
        return ((dpf) ((w9h) this.G).E).p(j - j2, sb0Var, sb0Var2, sb0Var3);
    }

    public u15(long j, long j2, Date date) {
        this.E = j;
        this.F = j2;
        this.G = date;
    }

    public u15(w9h w9hVar) {
        this.G = w9hVar;
    }
}
