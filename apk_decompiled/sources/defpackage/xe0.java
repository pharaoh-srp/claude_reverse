package defpackage;

import com.anthropic.claude.types.environment.AppEnvironment;

/* JADX INFO: loaded from: classes.dex */
public final class xe0 extends ze0 {
    public static final xe0 g = new xe0("https://claude.ai", AppEnvironment.PRODUCTION, false, mp0.Z0(new String[]{"https://claude.ai", "https://www.claudeusercontent.com"}), 8);

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xe0);
    }

    public final int hashCode() {
        return -216709001;
    }

    public final String toString() {
        return "Production";
    }
}
