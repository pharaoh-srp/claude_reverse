package defpackage;

import com.anthropic.claude.api.chat.tool.ToolDisplayContent;
import com.anthropic.claude.types.strings.McpToolApprovalKey;
import com.anthropic.claude.types.strings.ToolUseId;

/* JADX INFO: loaded from: classes3.dex */
public final class i63 implements j63 {
    public final String a;
    public final ToolDisplayContent b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;

    public i63(String str, ToolDisplayContent toolDisplayContent, String str2, String str3, String str4, String str5, String str6, boolean z) {
        str.getClass();
        this.a = str;
        this.b = toolDisplayContent;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = z;
    }

    public final String a() {
        return this.g;
    }

    public final ToolDisplayContent b() {
        return this.b;
    }

    public final boolean c() {
        return this.h;
    }

    public final String d() {
        return this.e;
    }

    public final String e() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L5
            goto L6d
        L5:
            boolean r1 = r5 instanceof defpackage.i63
            r2 = 0
            if (r1 != 0) goto Lc
            goto L6c
        Lc:
            i63 r5 = (defpackage.i63) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.a
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L19
            goto L6c
        L19:
            com.anthropic.claude.api.chat.tool.ToolDisplayContent r1 = r4.b
            com.anthropic.claude.api.chat.tool.ToolDisplayContent r3 = r5.b
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L24
            goto L6c
        L24:
            java.lang.String r1 = r4.c
            java.lang.String r3 = r5.c
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L2f
            goto L6c
        L2f:
            java.lang.String r1 = r4.d
            java.lang.String r3 = r5.d
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L3a
            goto L6c
        L3a:
            java.lang.String r1 = r4.e
            java.lang.String r3 = r5.e
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L45
            goto L6c
        L45:
            java.lang.String r1 = r4.f
            java.lang.String r3 = r5.f
            boolean r1 = com.anthropic.claude.types.strings.ToolUseId.m1160equalsimpl0(r1, r3)
            if (r1 != 0) goto L50
            goto L6c
        L50:
            java.lang.String r1 = r5.g
            java.lang.String r3 = r4.g
            if (r3 != 0) goto L5c
            if (r1 != 0) goto L5a
            r1 = r0
            goto L63
        L5a:
            r1 = r2
            goto L63
        L5c:
            if (r1 != 0) goto L5f
            goto L5a
        L5f:
            boolean r1 = com.anthropic.claude.types.strings.McpToolApprovalKey.m1039equalsimpl0(r3, r1)
        L63:
            if (r1 != 0) goto L66
            goto L6c
        L66:
            boolean r4 = r4.h
            boolean r5 = r5.h
            if (r4 == r5) goto L6d
        L6c:
            return r2
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i63.equals(java.lang.Object):boolean");
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.a;
    }

    public final String h() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ToolDisplayContent toolDisplayContent = this.b;
        int iHashCode2 = (iHashCode + (toolDisplayContent == null ? 0 : toolDisplayContent.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iM1161hashCodeimpl = (ToolUseId.m1161hashCodeimpl(this.f) + ((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.g;
        return Boolean.hashCode(this.h) + ((iM1161hashCodeimpl + (str4 != null ? McpToolApprovalKey.m1040hashCodeimpl(str4) : 0)) * 31);
    }

    public final String toString() {
        String strM1162toStringimpl = ToolUseId.m1162toStringimpl(this.f);
        String str = this.g;
        String strM1041toStringimpl = str == null ? "null" : McpToolApprovalKey.m1041toStringimpl(str);
        StringBuilder sb = new StringBuilder("ShowToolApproval(toolName=");
        sb.append(this.a);
        sb.append(", displayContent=");
        sb.append(this.b);
        sb.append(", integrationIconUrl=");
        kgh.u(sb, this.c, ", integrationName=", this.d, ", iconName=");
        kgh.u(sb, this.e, ", toolUseId=", strM1162toStringimpl, ", approvalKey=");
        sb.append(strM1041toStringimpl);
        sb.append(", hasAllowAlways=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
