package defpackage;

import com.anthropic.claude.sessions.types.PermissionMode;

/* JADX INFO: loaded from: classes2.dex */
public final class knb implements mnb {
    public final PermissionMode a;

    public knb(PermissionMode permissionMode) {
        permissionMode.getClass();
        this.a = permissionMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof knb) && this.a == ((knb) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Revert(revertTo=" + this.a + ")";
    }
}
