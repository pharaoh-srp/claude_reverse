package defpackage;

import com.anthropic.claude.sessions.types.PermissionMode;

/* JADX INFO: loaded from: classes3.dex */
public final class ruf implements fvf {
    public final PermissionMode a;

    public ruf(PermissionMode permissionMode) {
        permissionMode.getClass();
        this.a = permissionMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ruf) && this.a == ((ruf) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PermissionModeChanged(mode=" + this.a + ")";
    }
}
