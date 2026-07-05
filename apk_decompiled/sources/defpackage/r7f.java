package defpackage;

import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.OrganizationId;

/* JADX INFO: loaded from: classes.dex */
public final class r7f implements s7f {
    public final String a;
    public final String b;
    public final String c;

    public r7f(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = ij0.k("UserScope:", str, ":", str2);
    }

    @Override // defpackage.s7f
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7f)) {
            return false;
        }
        r7f r7fVar = (r7f) obj;
        return AccountId.m946equalsimpl0(this.a, r7fVar.a) && OrganizationId.m1068equalsimpl0(this.b, r7fVar.b);
    }

    public final int hashCode() {
        return OrganizationId.m1069hashCodeimpl(this.b) + (AccountId.m947hashCodeimpl(this.a) * 31);
    }

    public final String toString() {
        return ij0.l("User(accountId=", AccountId.m948toStringimpl(this.a), ", organizationId=", OrganizationId.m1070toStringimpl(this.b), ")");
    }
}
