package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wwe {
    public final gw9 a;
    public final boolean b;
    public final boolean c;

    public wwe(gw9 gw9Var, boolean z, boolean z2) {
        this.a = gw9Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwe)) {
            return false;
        }
        wwe wweVar = (wwe) obj;
        return this.a == wweVar.a && this.b == wweVar.b && this.c == wweVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + fsh.p(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RowColumnChildSelector(type=");
        sb.append(this.a);
        sb.append(", expandWidth=");
        sb.append(this.b);
        sb.append(", expandHeight=");
        return y6a.p(sb, this.c, ')');
    }
}
