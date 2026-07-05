package defpackage;

import com.anthropic.claude.api.chat.ModelSelection;

/* JADX INFO: loaded from: classes2.dex */
public final class fgb extends jgb {
    public final String a;
    public final ModelSelection b;
    public final String c;
    public final String d;

    public fgb(String str, String str2, ModelSelection modelSelection, String str3) {
        this.a = str;
        this.b = modelSelection;
        this.c = str2;
        this.d = str3;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.c;
    }

    public final ModelSelection d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgb)) {
            return false;
        }
        fgb fgbVar = (fgb) obj;
        return x44.r(this.a, fgbVar.a) && x44.r(this.b, fgbVar.b) && x44.r(this.c, fgbVar.c) && x44.r(this.d, fgbVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ModelSelection modelSelection = this.b;
        int iHashCode2 = (iHashCode + (modelSelection == null ? 0 : modelSelection.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RefusalWithDetails(explanation=");
        sb.append(this.a);
        sb.append(", retrySuggestion=");
        sb.append(this.b);
        sb.append(", retryModelName=");
        return vb7.t(sb, this.c, ", learnMoreUrl=", this.d, ")");
    }
}
