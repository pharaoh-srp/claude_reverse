package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class no1 {
    public static final no1 k = new no1(true, false, false, false, false, false, false, false, false, false);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public no1(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = z10;
    }

    public static no1 a(no1 no1Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i) {
        if ((i & 1) != 0) {
            z = no1Var.a;
        }
        boolean z11 = z;
        if ((i & 2) != 0) {
            z2 = no1Var.b;
        }
        boolean z12 = z2;
        if ((i & 4) != 0) {
            z3 = no1Var.c;
        }
        boolean z13 = z3;
        if ((i & 8) != 0) {
            z4 = no1Var.d;
        }
        boolean z14 = z4;
        boolean z15 = (i & 16) != 0 ? no1Var.e : z5;
        boolean z16 = (i & 32) != 0 ? no1Var.f : z6;
        boolean z17 = (i & 64) != 0 ? no1Var.g : z7;
        boolean z18 = (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? no1Var.h : z8;
        boolean z19 = (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? no1Var.i : z9;
        boolean z20 = (i & 512) != 0 ? no1Var.j : z10;
        no1Var.getClass();
        return new no1(z11, z12, z13, z14, z15, z16, z17, z18, z19, z20);
    }

    public final no1 b() {
        return a(this, true, false, false, true, false, false, false, false, false, false, 518);
    }

    public final no1 c() {
        return a(this, false, false, false, false, false, false, false, false, false, false, 248);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no1)) {
            return false;
        }
        no1 no1Var = (no1) obj;
        return this.a == no1Var.a && this.b == no1Var.b && this.c == no1Var.c && this.d == no1Var.d && this.e == no1Var.e && this.f == no1Var.f && this.g == no1Var.g && this.h == no1Var.h && this.i == no1Var.i && this.j == no1Var.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + fsh.p(fsh.p(fsh.p(fsh.p(fsh.p(fsh.p(fsh.p(fsh.p(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BellTurnState(isUserInput=");
        sb.append(this.a);
        sb.append(", isPlayback=");
        sb.append(this.b);
        sb.append(", isReceivingAudio=");
        ij0.A(sb, this.c, ", isInterrupted=", this.d, ", isTranscriptionStart=");
        ij0.A(sb, this.e, ", isSearching=", this.f, ", isThinking=");
        ij0.A(sb, this.g, ", isInvokingMcpTool=", this.h, ", isWaitingForToolApproval=");
        sb.append(this.i);
        sb.append(", isAttachmentFlowStarted=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}
