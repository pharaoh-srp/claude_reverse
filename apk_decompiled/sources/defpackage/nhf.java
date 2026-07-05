package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nhf {
    public final lne a;
    public final int b;
    public final long c;

    public nhf(lne lneVar, int i, long j) {
        this.a = lneVar;
        this.b = i;
        this.c = j;
    }

    public final int a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhf)) {
            return false;
        }
        nhf nhfVar = (nhf) obj;
        return this.a == nhfVar.a && this.b == nhfVar.b && this.c == nhfVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + vb7.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo(direction=");
        sb.append(this.a);
        sb.append(", offset=");
        sb.append(this.b);
        sb.append(", selectableId=");
        return ebh.p(sb, this.c, ')');
    }
}
