package defpackage;

import com.anthropic.claude.types.strings.OrganizationId;

/* JADX INFO: loaded from: classes2.dex */
public final class hca implements jca {
    public final String a;

    public hca(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hca) && OrganizationId.m1068equalsimpl0(this.a, ((hca) obj).a);
    }

    public final int hashCode() {
        return OrganizationId.m1069hashCodeimpl(this.a);
    }

    public final String toString() {
        return ij0.j("InvalidOrganization(defaultOrganizationId=", OrganizationId.m1070toStringimpl(this.a), ")");
    }
}
