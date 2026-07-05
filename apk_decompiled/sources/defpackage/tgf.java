package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tgf {
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final yjh f;

    public tgf(long j, int i, int i2, int i3, int i4, yjh yjhVar) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = yjhVar;
    }

    public final nhf a(int i) {
        return new nhf(bwk.i(this.f, i), i, this.a);
    }

    public final hc5 b() {
        int i = this.c;
        int i2 = this.d;
        return i < i2 ? hc5.F : i > i2 ? hc5.E : hc5.G;
    }

    public final int c() {
        return this.d;
    }

    public final int d() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionInfo(id=");
        sb.append(this.a);
        sb.append(", range=(");
        int i = this.c;
        sb.append(i);
        sb.append('-');
        yjh yjhVar = this.f;
        sb.append(bwk.i(yjhVar, i));
        sb.append(',');
        int i2 = this.d;
        sb.append(i2);
        sb.append('-');
        sb.append(bwk.i(yjhVar, i2));
        sb.append("), prevOffset=");
        return vb7.r(sb, this.e, ')');
    }
}
