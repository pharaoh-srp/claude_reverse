package defpackage;

import com.anthropic.claude.types.environment.AppEnvironment;

/* JADX INFO: loaded from: classes.dex */
public final class ye0 extends ze0 {
    public static final ye0 g = new ye0("https://claude-ai.staging.ant.dev", AppEnvironment.STAGING, false, true, mp0.Z0(new String[]{"https://claude-ai.staging.ant.dev", "https://staging.claudeusercontent.com"}));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ye0);
    }

    public final int hashCode() {
        return -1642264259;
    }

    public final String toString() {
        return "Staging";
    }
}
