package defpackage;

import com.anthropic.claude.sessions.types.RequiresActionDetails;

/* JADX INFO: loaded from: classes2.dex */
public final class fyg {
    public final RequiresActionDetails a;

    public fyg(RequiresActionDetails requiresActionDetails) {
        this.a = requiresActionDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fyg) && this.a.equals(((fyg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NeedsInputQuestion(details=" + this.a + ")";
    }
}
