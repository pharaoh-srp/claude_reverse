package defpackage;

import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.ArtifactIdentifier;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.OrganizationId;
import com.anthropic.claude.types.strings.ProjectId;

/* JADX INFO: loaded from: classes.dex */
public final class ahc {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public ahc(String str, String str2, String str3, int i, String str4, String str5, String str6) {
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        str4 = (i & 8) != 0 ? null : str4;
        str5 = (i & 16) != 0 ? null : str5;
        str6 = (i & 32) != 0 ? null : str6;
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L5
            goto L89
        L5:
            boolean r1 = r5 instanceof defpackage.ahc
            r2 = 0
            if (r1 != 0) goto Lc
            goto L88
        Lc:
            ahc r5 = (defpackage.ahc) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.a
            boolean r1 = com.anthropic.claude.types.strings.ChatId.m981equalsimpl0(r1, r3)
            if (r1 != 0) goto L1a
            goto L88
        L1a:
            java.lang.String r1 = r5.b
            java.lang.String r3 = r4.b
            if (r3 != 0) goto L26
            if (r1 != 0) goto L24
            r1 = r0
            goto L2d
        L24:
            r1 = r2
            goto L2d
        L26:
            if (r1 != 0) goto L29
            goto L24
        L29:
            boolean r1 = com.anthropic.claude.types.strings.AccountId.m946equalsimpl0(r3, r1)
        L2d:
            if (r1 != 0) goto L31
            goto L88
        L31:
            java.lang.String r1 = r5.c
            java.lang.String r3 = r4.c
            if (r3 != 0) goto L3d
            if (r1 != 0) goto L3b
            r1 = r0
            goto L44
        L3b:
            r1 = r2
            goto L44
        L3d:
            if (r1 != 0) goto L40
            goto L3b
        L40:
            boolean r1 = com.anthropic.claude.types.strings.OrganizationId.m1068equalsimpl0(r3, r1)
        L44:
            if (r1 != 0) goto L47
            goto L88
        L47:
            java.lang.String r1 = r5.d
            java.lang.String r3 = r4.d
            if (r3 != 0) goto L53
            if (r1 != 0) goto L51
            r1 = r0
            goto L5a
        L51:
            r1 = r2
            goto L5a
        L53:
            if (r1 != 0) goto L56
            goto L51
        L56:
            boolean r1 = com.anthropic.claude.types.strings.ProjectId.m1082equalsimpl0(r3, r1)
        L5a:
            if (r1 != 0) goto L5d
            goto L88
        L5d:
            java.lang.String r1 = r5.e
            java.lang.String r3 = r4.e
            if (r3 != 0) goto L69
            if (r1 != 0) goto L67
            r1 = r0
            goto L70
        L67:
            r1 = r2
            goto L70
        L69:
            if (r1 != 0) goto L6c
            goto L67
        L6c:
            boolean r1 = defpackage.tvk.d(r3, r1)
        L70:
            if (r1 != 0) goto L73
            goto L88
        L73:
            java.lang.String r5 = r5.f
            java.lang.String r4 = r4.f
            if (r4 != 0) goto L7f
            if (r5 != 0) goto L7d
            r4 = r0
            goto L86
        L7d:
            r4 = r2
            goto L86
        L7f:
            if (r5 != 0) goto L82
            goto L7d
        L82:
            boolean r4 = com.anthropic.claude.types.strings.ArtifactIdentifier.m967equalsimpl0(r4, r5)
        L86:
            if (r4 != 0) goto L89
        L88:
            return r2
        L89:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahc.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iM982hashCodeimpl = ChatId.m982hashCodeimpl(this.a) * 31;
        String str = this.b;
        int iM947hashCodeimpl = (iM982hashCodeimpl + (str == null ? 0 : AccountId.m947hashCodeimpl(str))) * 31;
        String str2 = this.c;
        int iM1069hashCodeimpl = (iM947hashCodeimpl + (str2 == null ? 0 : OrganizationId.m1069hashCodeimpl(str2))) * 31;
        String str3 = this.d;
        int iM1083hashCodeimpl = (iM1069hashCodeimpl + (str3 == null ? 0 : ProjectId.m1083hashCodeimpl(str3))) * 31;
        String str4 = this.e;
        int iE = (iM1083hashCodeimpl + (str4 == null ? 0 : tvk.e(str4))) * 31;
        String str5 = this.f;
        return iE + (str5 != null ? ArtifactIdentifier.m968hashCodeimpl(str5) : 0);
    }

    public final String toString() {
        String strM983toStringimpl = ChatId.m983toStringimpl(this.a);
        String str = this.b;
        String strM948toStringimpl = str == null ? "null" : AccountId.m948toStringimpl(str);
        String str2 = this.c;
        String strM1070toStringimpl = str2 == null ? "null" : OrganizationId.m1070toStringimpl(str2);
        String str3 = this.d;
        String strM1084toStringimpl = str3 == null ? "null" : ProjectId.m1084toStringimpl(str3);
        String str4 = this.e;
        String strH = str4 == null ? "null" : tvk.h(str4);
        String str5 = this.f;
        String strM969toStringimpl = str5 != null ? ArtifactIdentifier.m969toStringimpl(str5) : "null";
        StringBuilder sbR = kgh.r("OpenChatParams(chatId=", strM983toStringimpl, ", accountId=", strM948toStringimpl, ", organizationId=");
        kgh.u(sbR, strM1070toStringimpl, ", projectId=", strM1084toStringimpl, ", source=");
        return vb7.t(sbR, strH, ", artifactIdentifier=", strM969toStringimpl, ")");
    }
}
