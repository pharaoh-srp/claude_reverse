package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kqc {
    public final int a;
    public final float b;
    public final int c;
    public final float d;
    public final float e;
    public final List f;

    public kqc(int i, float f, int i2, float f2, float f3, List list) {
        this.a = i;
        this.b = f;
        this.c = i2;
        this.d = f2;
        this.e = f3;
        this.f = list;
    }

    public static kqc a(kqc kqcVar, int i, float f, int i2) {
        if ((i2 & 2) != 0) {
            f = kqcVar.b;
        }
        return new kqc(i, f, kqcVar.c, kqcVar.d, kqcVar.e, (i2 & 32) != 0 ? kqcVar.f : lm6.E);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqc)) {
            return false;
        }
        kqc kqcVar = (kqc) obj;
        return this.a == kqcVar.a && va6.b(this.b, kqcVar.b) && this.c == kqcVar.c && va6.b(this.d, kqcVar.d) && va6.b(this.e, kqcVar.e) && va6.b(420.0f, 420.0f) && x44.r(this.f, kqcVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + vb7.b(420.0f, vb7.b(this.e, vb7.b(this.d, (vb7.b(this.b, this.a * 31, 31) + this.c) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaneScaffoldDirective(maxHorizontalPartitions=");
        sb.append(this.a);
        sb.append(", horizontalPartitionSpacerSize=");
        ebh.v(this.b, sb, ", maxVerticalPartitions=");
        sb.append(this.c);
        sb.append(", verticalPartitionSpacerSize=");
        ebh.v(this.d, sb, ", defaultPanePreferredWidth=");
        sb.append((Object) va6.c(this.e));
        sb.append(", defaultPanePreferredHeight=");
        sb.append((Object) va6.c(420.0f));
        sb.append(", number of excluded bounds=");
        sb.append(this.f.size());
        sb.append(')');
        return sb.toString();
    }
}
