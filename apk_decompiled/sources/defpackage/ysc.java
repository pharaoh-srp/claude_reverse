package defpackage;

import com.anthropic.claude.types.strings.ToolUseId;

/* JADX INFO: loaded from: classes2.dex */
public final class ysc implements mtc, qf8 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;

    public ysc(String str, String str2, String str3, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        if (str3 != null && str3.length() != 0) {
            str2 = ij0.C(str2, "\n\n", str3);
        }
        this.e = str2;
    }

    public static ysc a(ysc yscVar, String str, int i) {
        String str2 = yscVar.a;
        String str3 = yscVar.b;
        if ((i & 4) != 0) {
            str = yscVar.c;
        }
        boolean z = (i & 8) != 0 ? yscVar.d : true;
        yscVar.getClass();
        str2.getClass();
        str3.getClass();
        return new ysc(str2, str3, str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ysc)) {
            return false;
        }
        ysc yscVar = (ysc) obj;
        return ToolUseId.m1160equalsimpl0(this.a, yscVar.a) && x44.r(this.b, yscVar.b) && x44.r(this.c, yscVar.c) && this.d == yscVar.d;
    }

    @Override // defpackage.mtc
    public final String getBody() {
        return this.e;
    }

    public final int hashCode() {
        int iL = kgh.l(ToolUseId.m1161hashCodeimpl(this.a) * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((iL + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // defpackage.mtc, defpackage.qf8
    /* JADX INFO: renamed from: isComplete */
    public final boolean getIsComplete() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("AnalysisToolInvocation(toolUseId=", ToolUseId.m1162toStringimpl(this.a), ", input=", this.b, ", result=");
        sbR.append(this.c);
        sbR.append(", isComplete=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
