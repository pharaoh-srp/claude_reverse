package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hnc {
    public final float a;
    public final List b;

    public hnc(int i, float f) {
        this((i & 1) != 0 ? MTTypesetterKt.kLineSkipLimitMultiplier : f, lm6.E);
    }

    public final hnc a(hnc hncVar) {
        return new hnc(this.a + hncVar.a, w44.a1(this.b, hncVar.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hnc)) {
            return false;
        }
        hnc hncVar = (hnc) obj;
        return va6.b(this.a, hncVar.a) && x44.r(this.b, hncVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaddingDimension(dp=");
        ebh.v(this.a, sb, ", resourceIds=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }

    public hnc(float f, List list) {
        this.a = f;
        this.b = list;
    }
}
