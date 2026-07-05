package defpackage;

import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.OrganizationId;
import com.anthropic.claude.types.strings.SessionId;

/* JADX INFO: loaded from: classes.dex */
public final class ihc {
    public final String a;
    public final String b;
    public final String c;

    public ihc(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.ihc
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ihc r5 = (defpackage.ihc) r5
            java.lang.String r1 = r5.a
            java.lang.String r3 = r4.a
            if (r3 != 0) goto L18
            if (r1 != 0) goto L16
            r1 = r0
            goto L1f
        L16:
            r1 = r2
            goto L1f
        L18:
            if (r1 != 0) goto L1b
            goto L16
        L1b:
            boolean r1 = com.anthropic.claude.types.strings.SessionId.m1117equalsimpl0(r3, r1)
        L1f:
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r5.b
            java.lang.String r3 = r4.b
            if (r3 != 0) goto L2e
            if (r1 != 0) goto L2c
            r1 = r0
            goto L35
        L2c:
            r1 = r2
            goto L35
        L2e:
            if (r1 != 0) goto L31
            goto L2c
        L31:
            boolean r1 = com.anthropic.claude.types.strings.AccountId.m946equalsimpl0(r3, r1)
        L35:
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r5 = r5.c
            java.lang.String r4 = r4.c
            if (r4 != 0) goto L44
            if (r5 != 0) goto L42
            r4 = r0
            goto L4b
        L42:
            r4 = r2
            goto L4b
        L44:
            if (r5 != 0) goto L47
            goto L42
        L47:
            boolean r4 = com.anthropic.claude.types.strings.OrganizationId.m1068equalsimpl0(r4, r5)
        L4b:
            if (r4 != 0) goto L4e
            return r2
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ihc.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.a;
        int iM1118hashCodeimpl = (str == null ? 0 : SessionId.m1118hashCodeimpl(str)) * 31;
        String str2 = this.b;
        int iM947hashCodeimpl = (iM1118hashCodeimpl + (str2 == null ? 0 : AccountId.m947hashCodeimpl(str2))) * 31;
        String str3 = this.c;
        return iM947hashCodeimpl + (str3 != null ? OrganizationId.m1069hashCodeimpl(str3) : 0);
    }

    public final String toString() {
        String str = this.a;
        String strM1119toStringimpl = str == null ? "null" : SessionId.m1119toStringimpl(str);
        String str2 = this.b;
        String strM948toStringimpl = str2 == null ? "null" : AccountId.m948toStringimpl(str2);
        String str3 = this.c;
        return ij0.m(kgh.r("OpenDispatchSessionParams(sessionId=", strM1119toStringimpl, ", accountId=", strM948toStringimpl, ", organizationId="), str3 != null ? OrganizationId.m1070toStringimpl(str3) : "null", ")");
    }
}
