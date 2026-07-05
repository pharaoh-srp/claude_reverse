package defpackage;

import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.OrganizationId;

/* JADX INFO: loaded from: classes3.dex */
public final class dpa implements epa {
    public final String a;
    public final String b;
    public final jj c;

    public dpa(String str, String str2, jj jjVar) {
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
        if (!(obj instanceof dpa)) {
            return false;
        }
        dpa dpaVar = (dpa) obj;
        return AccountId.m946equalsimpl0(this.a, dpaVar.a) && OrganizationId.m1068equalsimpl0(this.b, dpaVar.b) && this.c == dpaVar.c;
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
