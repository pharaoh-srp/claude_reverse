package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class s11 implements qdg {
    public final /* synthetic */ int E = 1;
    public int F;
    public long G;
    public int H;

    public s11(int i, int i2, long j) {
        this.F = i;
        this.G = j;
        this.H = i2;
    }

    public String toString() {
        switch (this.E) {
            case 0:
                StringBuilder sb = new StringBuilder("AtomSizeTooSmall{type=");
                sb.append(tpi.L(this.F));
                sb.append(", size=");
                sb.append(this.G);
                sb.append(", minHeaderSize=");
                return vb7.l(this.H, "}", sb);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ s11() {
    }
}
