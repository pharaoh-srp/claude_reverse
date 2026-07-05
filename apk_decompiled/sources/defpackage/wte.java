package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wte extends x1 {
    public int G;
    public int H;
    public final /* synthetic */ xte I;

    public wte(xte xteVar) {
        this.I = xteVar;
        this.G = xteVar.size();
        this.H = xteVar.G;
    }

    @Override // defpackage.x1
    public final void a() {
        int i = this.G;
        if (i == 0) {
            this.E = 2;
            return;
        }
        xte xteVar = this.I;
        Object[] objArr = xteVar.E;
        int i2 = this.H;
        this.F = objArr[i2];
        this.E = 1;
        this.H = (i2 + 1) % xteVar.F;
        this.G = i - 1;
    }
}
