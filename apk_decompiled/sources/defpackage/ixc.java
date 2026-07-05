package defpackage;

import com.anthropic.claude.sessions.types.PermissionMode;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class ixc {
    public static PermissionMode a(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 3005871) {
            if (iHashCode != 3443497) {
                if (iHashCode == 1544803905 && str.equals("default")) {
                    return PermissionMode.Default;
                }
            } else if (str.equals("plan")) {
                return PermissionMode.Plan;
            }
        } else if (str.equals("auto")) {
            return PermissionMode.Auto;
        }
        return PermissionMode.Default;
    }

    public final KSerializer serializer() {
        return (KSerializer) PermissionMode.$cachedSerializer$delegate.getValue();
    }
}
