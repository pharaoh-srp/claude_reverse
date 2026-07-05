package defpackage;

import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.OrganizationId;

/* JADX INFO: loaded from: classes.dex */
public final class ooi {
    public final String a;
    public final String b;

    public ooi(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ooi)) {
            return false;
        }
        ooi ooiVar = (ooi) obj;
        return AccountId.m946equalsimpl0(this.a, ooiVar.a) && OrganizationId.m1068equalsimpl0(this.b, ooiVar.b);
    }

    public final int hashCode() {
        return OrganizationId.m1069hashCodeimpl(this.b) + (AccountId.m947hashCodeimpl(this.a) * 31);
    }

    public final String toString() {
        return ij0.l("UserSessionId(accountId=", AccountId.m948toStringimpl(this.a), ", organizationId=", OrganizationId.m1070toStringimpl(this.b), ")");
    }
}
