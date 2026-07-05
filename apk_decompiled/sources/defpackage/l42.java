package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class l42 implements gfg {
    public final /* synthetic */ int a;
    public int b;
    public int c;

    public /* synthetic */ l42(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.gfg
    public int getBeginIndex() {
        return this.b;
    }

    @Override // defpackage.gfg
    public int getEndIndex() {
        return this.c;
    }

    public String toString() {
        switch (this.a) {
            case 4:
                StringBuilder sb = new StringBuilder("Span{beginIndex=");
                sb.append(this.b);
                sb.append(", endIndex=");
                return vb7.l(this.c, "}", sb);
            default:
                return super.toString();
        }
    }
}
