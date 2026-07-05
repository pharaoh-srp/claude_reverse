package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pz9 implements wlg {
    public final int E;
    public final int F;
    public final lsc G;
    public int H;

    public pz9(int i, int i2, int i3) {
        this.E = i2;
        this.F = i3;
        int i4 = (i / i2) * i2;
        this.G = new lsc(wd6.H0(Math.max(i4 - i3, 0), i4 + i2 + i3), a5.N);
        this.H = i;
    }

    public final void a(int i) {
        if (i != this.H) {
            this.H = i;
            int i2 = this.E;
            int i3 = (i / i2) * i2;
            int i4 = this.F;
            this.G.setValue(wd6.H0(Math.max(i3 - i4, 0), i3 + i2 + i4));
        }
    }

    @Override // defpackage.wlg
    public final Object getValue() {
        return (b79) this.G.getValue();
    }
}
