package defpackage;

import com.anthropic.claude.api.chat.tool.Tool;

/* JADX INFO: loaded from: classes3.dex */
public final class vg4 {
    public final String a;
    public final String b;
    public final String c;
    public final Tool.CustomTool d;

    public vg4(String str, String str2, String str3, Tool.CustomTool customTool) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        customTool.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = customTool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vg4)) {
            return false;
        }
        vg4 vg4Var = (vg4) obj;
        return x44.r(this.a, vg4Var.a) && x44.r(this.b, vg4Var.b) && x44.r(this.c, vg4Var.c) && x44.r(this.d, vg4Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kgh.l(kgh.l(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("ConnectedAppToolInfo(toolId=", this.a, ", appName=", this.b, ", packageName=");
        sbR.append(this.c);
        sbR.append(", toolDefinition=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
