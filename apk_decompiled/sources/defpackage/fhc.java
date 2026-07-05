package defpackage;

import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.OrganizationId;

/* JADX INFO: loaded from: classes.dex */
public final class fhc {
    public final String a;
    public final String b;

    public fhc(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhc)) {
            return false;
        }
        fhc fhcVar = (fhc) obj;
        return AccountId.m946equalsimpl0(this.a, fhcVar.a) && OrganizationId.m1068equalsimpl0(this.b, fhcVar.b);
    }

    public final int hashCode() {
        return OrganizationId.m1069hashCodeimpl(this.b) + (AccountId.m947hashCodeimpl(this.a) * 31);
    }

    public final String toString() {
        return ij0.l("OpenConwayParams(accountId=", AccountId.m948toStringimpl(this.a), ", organizationId=", OrganizationId.m1070toStringimpl(this.b), ")");
    }
}
