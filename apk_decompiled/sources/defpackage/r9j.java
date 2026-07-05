package defpackage;

import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.OrganizationId;

/* JADX INFO: loaded from: classes3.dex */
public final class r9j implements s9j {
    public final String a;
    public final String b;
    public final jj c;

    public r9j(String str, String str2, jj jjVar) {
        str.getClass();
        str2.getClass();
        jjVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = jjVar;
    }

    public final String a() {
        return this.a;
    }

    public final jj b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9j)) {
            return false;
        }
        r9j r9jVar = (r9j) obj;
        return AccountId.m946equalsimpl0(this.a, r9jVar.a) && OrganizationId.m1068equalsimpl0(this.b, r9jVar.b) && this.c == r9jVar.c;
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
