package defpackage;

import com.anthropic.claude.api.chat.RefusalStopDetails;

/* JADX INFO: loaded from: classes2.dex */
public final class eog implements kog {
    public final RefusalStopDetails a;

    public eog(RefusalStopDetails refusalStopDetails) {
        this.a = refusalStopDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eog) && x44.r(this.a, ((eog) obj).a);
    }

    public final int hashCode() {
        RefusalStopDetails refusalStopDetails = this.a;
        if (refusalStopDetails == null) {
            return 0;
        }
        return refusalStopDetails.hashCode();
    }

    public final String toString() {
        return "Refusal(details=" + this.a + ")";
    }
}
