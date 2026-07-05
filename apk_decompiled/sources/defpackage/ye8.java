package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class ye8 extends e45 implements gw5 {
    public final Handler G;
    public final String H;
    public final boolean I;
    public final ye8 J;

    public ye8(Handler handler, String str, boolean z) {
        this.G = handler;
        this.H = str;
        this.I = z;
        this.J = z ? this : new ye8(handler, str, true);
    }

    @Override // defpackage.e45
    public final void O0(c45 c45Var, Runnable runnable) {
        if (this.G.post(runnable)) {
            return;
        }
        S0(c45Var, runnable);
    }

    @Override // defpackage.gw5
    public final y86 P(long j, final Runnable runnable, c45 c45Var) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.G.postDelayed(runnable, j)) {
            return new y86() { // from class: xe8
                @Override // defpackage.y86
                public final void a() {
                    this.E.G.removeCallbacks(runnable);
                }
            };
        }
        S0(c45Var, runnable);
        return d6c.E;
    }

    @Override // defpackage.e45
    public final boolean Q0(c45 c45Var) {
        return (this.I && x44.r(Looper.myLooper(), this.G.getLooper())) ? false : true;
    }

    @Override // defpackage.e45
    public final e45 R0(int i, String str) {
        eve.o(i);
        return str != null ? new xxb(this, str) : this;
    }

    public final void S0(c45 c45Var, Runnable runnable) {
        knk.o(c45Var, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        ft5 ft5Var = g86.a;
        vr5.G.O0(c45Var, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ye8)) {
            return false;
        }
        ye8 ye8Var = (ye8) obj;
        return ye8Var.G == this.G && ye8Var.I == this.I;
    }

    public final int hashCode() {
        return (this.I ? 1231 : 1237) ^ System.identityHashCode(this.G);
    }

    @Override // defpackage.gw5
    public final void l0(long j, ua2 ua2Var) {
        j01 j01Var = new j01(ua2Var, 11, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.G.postDelayed(j01Var, j)) {
            ua2Var.w(new vk3(this, 7, j01Var));
        } else {
            S0(ua2Var.I, j01Var);
        }
    }

    @Override // defpackage.e45
    public final String toString() {
        ye8 ye8Var;
        String str;
        ft5 ft5Var = g86.a;
        ye8 ye8Var2 = tpa.a;
        if (this == ye8Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                ye8Var = ye8Var2.J;
            } catch (UnsupportedOperationException unused) {
                ye8Var = null;
            }
            str = this == ye8Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.H;
        if (string == null) {
            string = this.G.toString();
        }
        return this.I ? kgh.o(string, ".immediate") : string;
    }

    public ye8(Handler handler) {
        this(handler, null, false);
    }
}
