package defpackage;

import com.anthropic.claude.sessions.types.PermissionUpdate;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class byc {
    public static PermissionUpdate a(String str) {
        str.getClass();
        return new PermissionUpdate("setMode", str, "session");
    }

    public final KSerializer serializer() {
        return ayc.a;
    }
}
