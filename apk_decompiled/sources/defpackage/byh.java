package defpackage;

import com.anthropic.claude.tool.ToolIdentifier;

/* JADX INFO: loaded from: classes3.dex */
public final class byh extends rok {
    public final String F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public byh(String str) {
        super("third_party__".concat(str));
        str.getClass();
        this.F = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof byh) && ToolIdentifier.m915equalsimpl0(this.F, ((byh) obj).F);
    }

    public final int hashCode() {
        return ToolIdentifier.m916hashCodeimpl(this.F);
    }

    @Override // defpackage.rok
    public final eyh r0() {
        return eyh.E;
    }

    public final String toString() {
        return ij0.j("ThirdPartyApp(toolId=", ToolIdentifier.m917toStringimpl(this.F), ")");
    }
}
