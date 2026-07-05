package defpackage;

import com.anthropic.claude.api.kyc.KycStatusResponse;

/* JADX INFO: loaded from: classes2.dex */
public final class mwg implements pwg {
    public final KycStatusResponse a;

    public mwg(KycStatusResponse kycStatusResponse) {
        kycStatusResponse.getClass();
        this.a = kycStatusResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mwg) && x44.r(this.a, ((mwg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KycRequired(idv=" + this.a + ")";
    }
}
