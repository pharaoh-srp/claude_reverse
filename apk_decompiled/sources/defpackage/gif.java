package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gif {
    public final te8 a;
    public final long b;
    public final fif c;
    public final boolean d;

    public gif(te8 te8Var, long j, fif fifVar, boolean z) {
        this.a = te8Var;
        this.b = j;
        this.c = fifVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gif)) {
            return false;
        }
        gif gifVar = (gif) obj;
        return this.a == gifVar.a && fcc.c(this.b, gifVar.b) && this.c == gifVar.c && this.d == gifVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + vb7.e(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append((Object) fcc.k(this.b));
        sb.append(", anchor=");
        sb.append(this.c);
        sb.append(", visible=");
        return y6a.p(sb, this.d, ')');
    }
}
