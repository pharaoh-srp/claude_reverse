package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dwe implements s7d {
    public final /* synthetic */ float E;
    public final /* synthetic */ float F;
    public final /* synthetic */ float G;

    public dwe(float f, float f2, float f3) {
        this.E = f;
        this.F = f2;
        this.G = f3;
    }

    @Override // defpackage.s7d
    public final long a(float f, float f2) {
        float f3 = f + this.E;
        float f4 = this.F;
        return so7.a(f3 / f4, (f2 + this.G) / f4);
    }
}
