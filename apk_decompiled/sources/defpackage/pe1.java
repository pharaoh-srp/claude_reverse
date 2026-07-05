package defpackage;

import androidx.media3.exoplayer.ExoPlaybackException;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pe1 implements b7d {
    public final int F;
    public hge H;
    public int I;
    public z6d J;
    public g1h K;
    public int L;
    public b4f M;
    public jw7[] N;
    public long O;
    public long P;
    public boolean R;
    public boolean S;
    public z7b U;
    public gv5 V;
    public final Object E = new Object();
    public final qb5 G = new qb5();
    public long Q = Long.MIN_VALUE;
    public mqh T = mqh.a;

    public pe1(int i) {
        this.F = i;
    }

    public static int f(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | FreeTypeConstants.FT_LOAD_PEDANTIC | i4;
    }

    public static boolean n(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    public final void A(jw7[] jw7VarArr, b4f b4fVar, long j, long j2, z7b z7bVar) {
        fd9.M(!this.R);
        this.M = b4fVar;
        this.U = z7bVar;
        if (this.Q == Long.MIN_VALUE) {
            this.Q = j;
        }
        this.N = jw7VarArr;
        this.O = j2;
        w(jw7VarArr, j, j2, z7bVar);
    }

    public final void B(long j, boolean z, boolean z2) {
        this.R = false;
        this.P = j;
        this.Q = j;
        if (!z2) {
            b4f b4fVar = this.M;
            b4fVar.getClass();
            z2 = b4fVar.h(j - this.O) != 0;
        }
        r(j, z, z2);
    }

    public void C(float f, float f2) {
    }

    public abstract int D(jw7 jw7Var);

    public int E() {
        return 0;
    }

    public boolean F(long j) {
        return false;
    }

    @Override // defpackage.b7d
    public void d(int i, Object obj) {
    }

    public final ExoPlaybackException g(Exception exc, jw7 jw7Var, boolean z, int i) {
        int iD;
        if (jw7Var == null || this.S) {
            iD = 4;
        } else {
            this.S = true;
            try {
                iD = D(jw7Var) & 7;
            } catch (ExoPlaybackException unused) {
                iD = 4;
            } finally {
                this.S = false;
            }
        }
        return new ExoPlaybackException(1, exc, i, k(), this.I, jw7Var, jw7Var == null ? 4 : iD, this.U, z);
    }

    public void h() {
    }

    public long i(long j, long j2) {
        if (this.L == 1) {
            return (o() || m()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    public b6b j() {
        return null;
    }

    public abstract String k();

    public final boolean l() {
        return this.Q == Long.MIN_VALUE;
    }

    public abstract boolean m();

    public abstract boolean o();

    public abstract void p();

    public void q(boolean z, boolean z2) {
    }

    public abstract void r(long j, boolean z, boolean z2);

    public void s() {
    }

    public void t() {
    }

    public void u() {
    }

    public void v() {
    }

    public void w(jw7[] jw7VarArr, long j, long j2, z7b z7bVar) {
    }

    public void x() {
    }

    public final int y(qb5 qb5Var, ro5 ro5Var, int i) {
        b4f b4fVar = this.M;
        b4fVar.getClass();
        int iB = b4fVar.b(qb5Var, ro5Var, i);
        if (iB == -4) {
            if (ro5Var.c(4)) {
                this.Q = Long.MIN_VALUE;
                return this.R ? -4 : -3;
            }
            long j = ro5Var.K + this.O;
            ro5Var.K = j;
            this.Q = Math.max(this.Q, j);
            return iB;
        }
        if (iB == -5) {
            jw7 jw7Var = (jw7) qb5Var.F;
            jw7Var.getClass();
            long j2 = jw7Var.t;
            if (j2 != Long.MAX_VALUE) {
                iw7 iw7VarA = jw7Var.a();
                iw7VarA.s = j2 + this.O;
                qb5Var.F = new jw7(iw7VarA);
            }
        }
        return iB;
    }

    public abstract void z(long j, long j2);
}
