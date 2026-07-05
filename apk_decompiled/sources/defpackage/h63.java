package defpackage;

import com.anthropic.claude.tool.model.MobileAppToolPreviewInfo;
import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.types.strings.ToolUseId;

/* JADX INFO: loaded from: classes2.dex */
public final class h63 implements j63 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final MobileAppToolPreviewInfo e;
    public final boolean f;

    public h63(String str, String str2, MobileAppToolPreviewInfo mobileAppToolPreviewInfo, String str3, String str4, boolean z) {
        str.getClass();
        str3.getClass();
        mobileAppToolPreviewInfo.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = mobileAppToolPreviewInfo;
        this.f = z;
    }

    public final boolean a() {
        return this.f;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public final MobileAppToolPreviewInfo e() {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            goto L55
        L4:
            boolean r1 = r5 instanceof defpackage.h63
            r2 = 0
            if (r1 != 0) goto La
            goto L54
        La:
            h63 r5 = (defpackage.h63) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.a
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L17
            goto L54
        L17:
            java.lang.String r1 = r4.b
            java.lang.String r3 = r5.b
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L22
            goto L54
        L22:
            java.lang.String r1 = r4.c
            java.lang.String r3 = r5.c
            boolean r1 = com.anthropic.claude.types.strings.ToolUseId.m1160equalsimpl0(r1, r3)
            if (r1 != 0) goto L2d
            goto L54
        L2d:
            java.lang.String r1 = r5.d
            java.lang.String r3 = r4.d
            if (r3 != 0) goto L39
            if (r1 != 0) goto L37
            r1 = r0
            goto L40
        L37:
            r1 = r2
            goto L40
        L39:
            if (r1 != 0) goto L3c
            goto L37
        L3c:
            boolean r1 = com.anthropic.claude.types.strings.MessageId.m1054equalsimpl0(r3, r1)
        L40:
            if (r1 != 0) goto L43
            goto L54
        L43:
            com.anthropic.claude.tool.model.MobileAppToolPreviewInfo r1 = r4.e
            com.anthropic.claude.tool.model.MobileAppToolPreviewInfo r3 = r5.e
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L4e
            goto L54
        L4e:
            boolean r4 = r4.f
            boolean r5 = r5.f
            if (r4 == r5) goto L55
        L54:
            return r2
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h63.equals(java.lang.Object):boolean");
    }

    public final String f() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iM1161hashCodeimpl = (ToolUseId.m1161hashCodeimpl(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.d;
        int iM1055hashCodeimpl = str2 != null ? MessageId.m1055hashCodeimpl(str2) : 0;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((iM1161hashCodeimpl + iM1055hashCodeimpl) * 31)) * 31);
    }

    public final String toString() {
        String strM1162toStringimpl = ToolUseId.m1162toStringimpl(this.c);
        String str = this.d;
        String strM1056toStringimpl = str == null ? "null" : MessageId.m1056toStringimpl(str);
        StringBuilder sbR = kgh.r("ShowLocalToolUseApproval(toolName=", this.a, ", toolInput=", this.b, ", toolUseId=");
        kgh.u(sbR, strM1162toStringimpl, ", messageId=", strM1056toStringimpl, ", toolPreviewInfo=");
        sbR.append(this.e);
        sbR.append(", fromVoice=");
        sbR.append(this.f);
        sbR.append(")");
        return sbR.toString();
    }
}
