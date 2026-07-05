package defpackage;

import com.anthropic.claude.api.mcp.McpAppToolResult;
import com.anthropic.claude.chat.parse.ParsedContentBlockId;
import com.anthropic.claude.types.strings.ToolUseId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ctc implements mtc, qxh {
    public final ParsedContentBlockId a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final JsonObject h;
    public final McpAppToolResult i;
    public final List j;
    public final boolean k;
    public final boolean l;
    public final String m;

    public ctc(ParsedContentBlockId parsedContentBlockId, String str, String str2, String str3, String str4, String str5, String str6, JsonObject jsonObject, McpAppToolResult mcpAppToolResult, List list, boolean z, boolean z2) {
        parsedContentBlockId.getClass();
        str.getClass();
        str2.getClass();
        str6.getClass();
        this.a = parsedContentBlockId;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = jsonObject;
        this.i = mcpAppToolResult;
        this.j = list;
        this.k = z;
        this.l = z2;
        this.m = str3 != null ? str3 : str;
    }

    public static ctc b(ctc ctcVar, McpAppToolResult mcpAppToolResult, boolean z, int i) {
        ParsedContentBlockId parsedContentBlockId = ctcVar.a;
        String str = ctcVar.b;
        String str2 = ctcVar.c;
        String str3 = ctcVar.d;
        ctcVar.getClass();
        String str4 = ctcVar.e;
        String str5 = ctcVar.f;
        String str6 = ctcVar.g;
        JsonObject jsonObject = ctcVar.h;
        if ((i & 512) != 0) {
            mcpAppToolResult = ctcVar.i;
        }
        McpAppToolResult mcpAppToolResult2 = mcpAppToolResult;
        List list = ctcVar.j;
        boolean z2 = (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? ctcVar.k : true;
        boolean z3 = (i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? ctcVar.l : z;
        ctcVar.getClass();
        parsedContentBlockId.getClass();
        str.getClass();
        str2.getClass();
        str6.getClass();
        list.getClass();
        return new ctc(parsedContentBlockId, str, str2, str3, str4, str5, str6, jsonObject, mcpAppToolResult2, list, z2, z3);
    }

    public final String a() {
        String str = this.b;
        String str2 = this.e;
        return (str2 == null || !isg.q0(str, str2.concat(":"), false)) ? bsg.e1(str, ":", str) : bsg.R0(str, str2.concat(":"));
    }

    public final boolean c() {
        return this.i != null ? !r0.isError() : this.j.isEmpty();
    }

    public final String d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctc)) {
            return false;
        }
        ctc ctcVar = (ctc) obj;
        return x44.r(this.a, ctcVar.a) && x44.r(this.b, ctcVar.b) && ToolUseId.m1160equalsimpl0(this.c, ctcVar.c) && x44.r(this.d, ctcVar.d) && x44.r(this.e, ctcVar.e) && x44.r(this.f, ctcVar.f) && x44.r(this.g, ctcVar.g) && x44.r(this.h, ctcVar.h) && x44.r(this.i, ctcVar.i) && x44.r(this.j, ctcVar.j) && this.k == ctcVar.k && this.l == ctcVar.l;
    }

    @Override // defpackage.mtc
    public final String getBody() {
        return this.m;
    }

    @Override // defpackage.qxh
    public final boolean getCanBeCollapsed() {
        return false;
    }

    @Override // defpackage.qxh
    public final String getIconName() {
        return null;
    }

    @Override // defpackage.vf8
    public final ParsedContentBlockId getId() {
        return this.a;
    }

    @Override // defpackage.qxh
    public final String getIntegrationIconUrl() {
        return this.f;
    }

    @Override // defpackage.qxh
    public final String getIntegrationName() {
        return this.e;
    }

    @Override // defpackage.qxh
    public final String getMessageSubText() {
        return null;
    }

    @Override // defpackage.qxh
    public final String getMessageText() {
        return this.d;
    }

    @Override // defpackage.qxh
    public final Integer getToolIconResId() {
        return null;
    }

    @Override // defpackage.qxh
    /* JADX INFO: renamed from: getToolIconTint-QN2ZGVo */
    public final d54 mo681getToolIconTintQN2ZGVo() {
        return null;
    }

    @Override // defpackage.qxh
    public final String getToolName() {
        return this.b;
    }

    public final int hashCode() {
        int iM1161hashCodeimpl = (ToolUseId.m1161hashCodeimpl(this.c) + kgh.l(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        int iHashCode = (iM1161hashCodeimpl + (str == null ? 0 : str.hashCode())) * 961;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iL = kgh.l((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.g);
        JsonObject jsonObject = this.h;
        int iHashCode3 = (iL + (jsonObject == null ? 0 : jsonObject.hashCode())) * 31;
        McpAppToolResult mcpAppToolResult = this.i;
        return Boolean.hashCode(this.l) + fsh.p(kgh.m((iHashCode3 + (mcpAppToolResult != null ? mcpAppToolResult.hashCode() : 0)) * 31, 31, this.j), 31, this.k);
    }

    @Override // defpackage.mtc, defpackage.qf8
    /* JADX INFO: renamed from: isComplete */
    public final boolean getIsComplete() {
        return this.k;
    }

    @Override // defpackage.uf8
    public final boolean isError() {
        return this.l;
    }

    public final String toString() {
        String strM1162toStringimpl = ToolUseId.m1162toStringimpl(this.c);
        StringBuilder sb = new StringBuilder("McpAppInvocation(id=");
        sb.append(this.a);
        sb.append(", toolName=");
        sb.append(this.b);
        sb.append(", toolUseId=");
        kgh.u(sb, strM1162toStringimpl, ", messageText=", this.d, ", iconName=null, integrationName=");
        kgh.u(sb, this.e, ", integrationIconUrl=", this.f, ", input=");
        sb.append(this.g);
        sb.append(", inputArgs=");
        sb.append(this.h);
        sb.append(", toolResult=");
        sb.append(this.i);
        sb.append(", approvalOptions=");
        sb.append(this.j);
        sb.append(", isComplete=");
        sb.append(this.k);
        sb.append(", isError=");
        sb.append(this.l);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ ctc(ParsedContentBlockId parsedContentBlockId, String str, String str2, String str3, String str4, String str5, String str6, JsonObject jsonObject, List list, boolean z) {
        this(parsedContentBlockId, str, str2, str3, str4, str5, str6, jsonObject, null, list, z, false);
    }
}
