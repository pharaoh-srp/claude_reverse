package defpackage;

import com.anthropic.claude.api.chat.ModelSelection;

/* JADX INFO: loaded from: classes2.dex */
public final class hs1 extends oe5 {
    public final String c;
    public final ModelSelection d;
    public final String e;
    public final String f;

    public hs1(String str, String str2, ModelSelection modelSelection, String str3) {
        this.c = str;
        this.d = modelSelection;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs1)) {
            return false;
        }
        hs1 hs1Var = (hs1) obj;
        return x44.r(this.c, hs1Var.c) && x44.r(this.d, hs1Var.d) && x44.r(this.e, hs1Var.e) && x44.r(this.f, hs1Var.f);
    }

    public final int hashCode() {
        String str = this.c;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ModelSelection modelSelection = this.d;
        int iHashCode2 = (iHashCode + (modelSelection == null ? 0 : modelSelection.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String j() {
        return this.c;
    }

    public final String k() {
        return this.f;
    }

    public final String l() {
        return this.e;
    }

    public final ModelSelection m() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RefusalWithDetails(explanation=");
        sb.append(this.c);
        sb.append(", retrySuggestion=");
        sb.append(this.d);
        sb.append(", retryModelName=");
        return vb7.t(sb, this.e, ", learnMoreUrl=", this.f, ")");
    }
}
