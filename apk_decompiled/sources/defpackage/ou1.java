package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ou1 extends qw5 implements ujf {
    public fu1 U;
    public float V;
    public eeg W;
    public e0g X;
    public final z42 Y;

    public ou1(float f, eeg eegVar, e0g e0gVar) {
        this.V = f;
        this.W = eegVar;
        this.X = e0gVar;
        z42 z42Var = new z42(new b52(), new a2(4, this));
        p1(z42Var);
        this.Y = z42Var;
    }

    @Override // defpackage.ujf
    public final void X0(ekf ekfVar) {
        ckf.u(ekfVar, this.X);
    }

    @Override // defpackage.hqb
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.ujf
    public final boolean k() {
        return false;
    }
}
