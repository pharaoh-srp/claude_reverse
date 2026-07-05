package defpackage;

import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.OrganizationId;
import com.anthropic.claude.types.strings.SessionId;

/* JADX INFO: loaded from: classes.dex */
public final class chc {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public chc(String str, String str2, String str3, boolean z) {
        grc.B(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chc)) {
            return false;
        }
        chc chcVar = (chc) obj;
        return SessionId.m1117equalsimpl0(this.a, chcVar.a) && AccountId.m946equalsimpl0(this.b, chcVar.b) && OrganizationId.m1068equalsimpl0(this.c, chcVar.c) && this.d == chcVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((OrganizationId.m1069hashCodeimpl(this.c) + ((AccountId.m947hashCodeimpl(this.b) + (SessionId.m1118hashCodeimpl(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String strM1119toStringimpl = SessionId.m1119toStringimpl(this.a);
        String strM948toStringimpl = AccountId.m948toStringimpl(this.b);
        String strM1070toStringimpl = OrganizationId.m1070toStringimpl(this.c);
        StringBuilder sbR = kgh.r("OpenCodeSessionParams(sessionId=", strM1119toStringimpl, ", accountId=", strM948toStringimpl, ", organizationId=");
        sbR.append(strM1070toStringimpl);
        sbR.append(", isCoworkSession=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
