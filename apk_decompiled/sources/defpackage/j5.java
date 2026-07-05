package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j5 implements c29 {
    public final String a = null;
    public final Boolean b = null;
    public final Boolean c = null;
    public final Boolean d = null;
    public final Boolean e = null;
    public final Boolean f = null;
    public final Boolean g = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5)) {
            return false;
        }
        j5 j5Var = (j5) obj;
        return x44.r(this.a, j5Var.a) && x44.r(this.b, j5Var.b) && x44.r(this.c, j5Var.c) && x44.r(this.d, j5Var.d) && x44.r(this.e, j5Var.e) && x44.r(this.f, j5Var.f) && x44.r(this.g, j5Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.c;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.d;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.e;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f;
        int iHashCode6 = (iHashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.g;
        return iHashCode6 + (bool6 != null ? bool6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityInfo(textSize=");
        sb.append(this.a);
        sb.append(", isScreenReaderEnabled=");
        sb.append(this.b);
        sb.append(", isColorInversionEnabled=");
        ebh.C(sb, this.c, ", isClosedCaptioningEnabled=", this.d, ", isReducedAnimationsEnabled=");
        ebh.C(sb, this.e, ", isScreenPinningEnabled=", this.f, ", isRtlEnabled=");
        return qy1.h(sb, this.g, ")");
    }
}
