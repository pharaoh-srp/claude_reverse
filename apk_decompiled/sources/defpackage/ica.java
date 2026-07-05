package defpackage;

import com.anthropic.claude.types.strings.OrganizationId;

/* JADX INFO: loaded from: classes.dex */
public final class ica implements jca {
    public final String a;
    public final jj b;

    public ica(String str, jj jjVar) {
        str.getClass();
        jjVar.getClass();
        this.a = str;
        this.b = jjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ica)) {
            return false;
        }
        ica icaVar = (ica) obj;
        return OrganizationId.m1068equalsimpl0(this.a, icaVar.a) && this.b == icaVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (OrganizationId.m1069hashCodeimpl(this.a) * 31);
    }

    public final String toString() {
        return "UserSessionLoaded(organizationId=" + OrganizationId.m1070toStringimpl(this.a) + ", ageSignalsResult=" + this.b + ")";
    }
}
