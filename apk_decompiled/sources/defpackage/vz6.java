package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class vz6 extends e45 {
    public static final /* synthetic */ int J = 0;
    public long G;
    public boolean H;
    public qo0 I;

    @Override // defpackage.e45
    public final e45 R0(int i, String str) {
        eve.o(i);
        return str != null ? new xxb(this, str) : this;
    }

    public final void S0(boolean z) {
        long j = this.G - (z ? 4294967296L : 1L);
        this.G = j;
        if (j <= 0 && this.H) {
            shutdown();
        }
    }

    public final void T0(c86 c86Var) {
        qo0 qo0Var = this.I;
        if (qo0Var == null) {
            qo0Var = new qo0();
            this.I = qo0Var;
        }
        qo0Var.addLast(c86Var);
    }

    public final void U0(boolean z) {
        this.G = (z ? 4294967296L : 1L) + this.G;
        if (z) {
            return;
        }
        this.H = true;
    }

    public abstract long V0();

    public final boolean W0() {
        qo0 qo0Var = this.I;
        if (qo0Var == null) {
            return false;
        }
        c86 c86Var = (c86) (qo0Var.isEmpty() ? null : qo0Var.removeFirst());
        if (c86Var == null) {
            return false;
        }
        c86Var.run();
        return true;
    }

    public abstract void shutdown();
}
