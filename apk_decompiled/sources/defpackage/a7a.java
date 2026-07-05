package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class a7a implements gfg {
    public final c7a a;
    public final int b;
    public final int c;

    public a7a(c7a c7aVar, int i, int i2) {
        this.a = c7aVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.gfg
    public final int getBeginIndex() {
        return this.b;
    }

    @Override // defpackage.gfg
    public final int getEndIndex() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Link{type=");
        sb.append(this.a);
        sb.append(", beginIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        return vb7.l(this.c, "}", sb);
    }
}
