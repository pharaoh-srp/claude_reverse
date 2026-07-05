package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ux0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public ux0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ux0)) {
            return false;
        }
        ux0 ux0Var = (ux0) obj;
        return this.a == ux0Var.a && this.b == ux0Var.b && this.c == ux0Var.c && this.d == ux0Var.d && this.e == ux0Var.e && this.f == ux0Var.f && this.g == ux0Var.g && this.h == ux0Var.h && this.i == ux0Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + fsh.p(fsh.p(fsh.p(fsh.p(fsh.p(fsh.p(fsh.p(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AssistantMessageFooterState(isVisible=");
        sb.append(this.a);
        sb.append(", isFeedbackVisible=");
        sb.append(this.b);
        sb.append(", isFeedbackPositive=");
        ij0.A(sb, this.c, ", isFeedbackFlagged=", this.d, ", isRetryButtonVisible=");
        ij0.A(sb, this.e, ", isShareButtonVisible=", this.f, ", isNarrateButtonVisible=");
        ij0.A(sb, this.g, ", isNarrating=", this.h, ", isNarrationPaused=");
        return sq6.v(")", sb, this.i);
    }
}
