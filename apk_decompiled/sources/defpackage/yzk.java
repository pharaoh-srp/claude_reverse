package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class yzk extends yak {
    public xnj G;
    public boolean H;
    public final bnh I;
    public final e5e J;
    public final cbf K;

    public yzk(umk umkVar) {
        super(umkVar);
        this.H = true;
        this.I = new bnh(9, this);
        this.J = new e5e(this);
        this.K = new cbf(this);
    }

    @Override // defpackage.yak
    public final boolean Q0() {
        return false;
    }

    public final void R0() {
        K0();
        if (this.G == null) {
            this.G = new xnj(Looper.getMainLooper(), 2);
        }
    }
}
