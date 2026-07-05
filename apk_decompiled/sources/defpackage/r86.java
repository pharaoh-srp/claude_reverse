package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class r86 {
    public final String a;
    public final int b;
    public final int c;

    public r86(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r86)) {
            return false;
        }
        r86 r86Var = (r86) obj;
        return this.a.equals(r86Var.a) && this.b == r86Var.b && this.c == r86Var.c;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.b);
        Integer numValueOf2 = Integer.valueOf(this.c);
        Float fValueOf = Float.valueOf(1.0f);
        return Objects.hash(this.a, numValueOf, numValueOf2, fValueOf, 0, 0, 0, fValueOf);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayShapeCompat{ spec=");
        sb.append(Integer.valueOf(this.a.hashCode()));
        sb.append(" displayWidth=");
        sb.append(this.b);
        sb.append(" displayHeight=");
        return vb7.l(this.c, " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}", sb);
    }
}
