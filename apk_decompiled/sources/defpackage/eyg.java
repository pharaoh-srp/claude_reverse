package defpackage;

import com.anthropic.claude.sessions.types.RequiresActionDetails;

/* JADX INFO: loaded from: classes2.dex */
public final class eyg {
    public final RequiresActionDetails a;

    public eyg(RequiresActionDetails requiresActionDetails) {
        this.a = requiresActionDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eyg) && this.a.equals(((eyg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NeedsInputPermission(details=" + this.a + ")";
    }
}
