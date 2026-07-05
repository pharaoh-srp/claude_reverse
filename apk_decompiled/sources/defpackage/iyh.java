package defpackage;

import com.anthropic.claude.api.chat.tool.Tool;

/* JADX INFO: loaded from: classes3.dex */
public final class iyh {
    public final String a;
    public final String b;
    public final int c;
    public final d54 d;
    public final boolean e;
    public final Tool.CustomTool f;

    public iyh(String str, String str2, int i, d54 d54Var, boolean z, Tool.CustomTool customTool) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = d54Var;
        this.e = z;
        this.f = customTool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iyh)) {
            return false;
        }
        iyh iyhVar = (iyh) obj;
        return x44.r(this.a, iyhVar.a) && x44.r(this.b, iyhVar.b) && this.c == iyhVar.c && x44.r(this.d, iyhVar.d) && this.e == iyhVar.e && x44.r(this.f, iyhVar.f);
    }

    public final int hashCode() {
        int iC = vb7.c(this.c, kgh.l(this.a.hashCode() * 31, 31, this.b), 31);
        d54 d54Var = this.d;
        int iP = fsh.p((iC + (d54Var == null ? 0 : Long.hashCode(d54Var.a))) * 31, 31, this.e);
        Tool.CustomTool customTool = this.f;
        return iP + (customTool != null ? customTool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("ToolInspectorInfo(identifier=", this.a, ", title=", this.b, ", iconResId=");
        sbR.append(this.c);
        sbR.append(", iconTint=");
        sbR.append(this.d);
        sbR.append(", isClientTool=");
        sbR.append(this.e);
        sbR.append(", toolDefinition=");
        sbR.append(this.f);
        sbR.append(")");
        return sbR.toString();
    }
}
