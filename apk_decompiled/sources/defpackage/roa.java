package defpackage;

import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.OrganizationId;

/* JADX INFO: loaded from: classes3.dex */
public final class roa implements soa {
    public final String a;
    public final String b;
    public final jj c;

    public roa(String str, String str2, jj jjVar) {
        str.getClass();
        str2.getClass();
        jjVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = jjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof roa)) {
            return false;
        }
        roa roaVar = (roa) obj;
        return AccountId.m946equalsimpl0(this.a, roaVar.a) && OrganizationId.m1068equalsimpl0(this.b, roaVar.b) && this.c == roaVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((OrganizationId.m1069hashCodeimpl(this.b) + (AccountId.m947hashCodeimpl(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("UserSessionInitialized(accountId=", AccountId.m948toStringimpl(this.a), ", organizationId=", OrganizationId.m1070toStringimpl(this.b), ", ageSignalsResult=");
        sbR.append(this.c);
        sbR.append(")");
        return sbR.toString();
    }
}
