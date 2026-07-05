package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class d4 {
    public e4[] E;
    public int F;
    public int G;
    public nvg H;

    public final e4 d() {
        e4 e4VarH;
        nvg nvgVar;
        synchronized (this) {
            try {
                e4[] e4VarArrI = this.E;
                if (e4VarArrI == null) {
                    e4VarArrI = i();
                    this.E = e4VarArrI;
                } else if (this.F >= e4VarArrI.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(e4VarArrI, e4VarArrI.length * 2);
                    this.E = (e4[]) objArrCopyOf;
                    e4VarArrI = (e4[]) objArrCopyOf;
                }
                int i = this.G;
                do {
                    e4VarH = e4VarArrI[i];
                    if (e4VarH == null) {
                        e4VarH = h();
                        e4VarArrI[i] = e4VarH;
                    }
                    i++;
                    if (i >= e4VarArrI.length) {
                        i = 0;
                    }
                } while (!e4VarH.a(this));
                this.G = i;
                this.F++;
                nvgVar = this.H;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (nvgVar != null) {
            nvgVar.y(1);
        }
        return e4VarH;
    }

    public abstract e4 h();

    public abstract e4[] i();

    public final void j(e4 e4Var) {
        nvg nvgVar;
        int i;
        tp4[] tp4VarArrB;
        synchronized (this) {
            try {
                int i2 = this.F - 1;
                this.F = i2;
                nvgVar = this.H;
                if (i2 == 0) {
                    this.G = 0;
                }
                e4Var.getClass();
                tp4VarArrB = e4Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (tp4 tp4Var : tp4VarArrB) {
            if (tp4Var != null) {
                tp4Var.resumeWith(iei.a);
            }
        }
        if (nvgVar != null) {
            nvgVar.y(-1);
        }
    }

    public final nvg k() {
        nvg nvgVar;
        synchronized (this) {
            nvgVar = this.H;
            if (nvgVar == null) {
                int i = this.F;
                nvgVar = new nvg(1, Integer.MAX_VALUE, py1.F);
                nvgVar.f(Integer.valueOf(i));
                this.H = nvgVar;
            }
        }
        return nvgVar;
    }
}
