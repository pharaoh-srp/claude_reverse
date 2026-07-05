package defpackage;

import com.anthropic.claude.api.chat.tool.Tool;

/* JADX INFO: loaded from: classes.dex */
public final class ewh implements fwh {
    public final Tool.CustomTool a;
    public final lp3 b;

    public ewh(Tool.CustomTool customTool, lp3 lp3Var) {
        this.a = customTool;
        this.b = lp3Var;
    }

    @Override // defpackage.fwh
    public final boolean a() {
        return this.a != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewh)) {
            return false;
        }
        ewh ewhVar = (ewh) obj;
        return x44.r(this.a, ewhVar.a) && this.b.equals(ewhVar.b);
    }

    public final int hashCode() {
        Tool.CustomTool customTool = this.a;
        return this.b.hashCode() + ((customTool == null ? 0 : customTool.hashCode()) * 31);
    }

    public final String toString() {
        return "ClientTool(toolDefinition=" + this.a + ", toolExecution=" + this.b + ")";
    }
}
