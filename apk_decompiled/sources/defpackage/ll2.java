package defpackage;

import com.anthropic.claude.analytics.events.ClaudeAiMessageEvents$FailureStage;
import com.anthropic.claude.analytics.events.ClaudeAiMessageEvents$FailureType;

/* JADX INFO: loaded from: classes2.dex */
public final class ll2 {
    public final ClaudeAiMessageEvents$FailureStage a;
    public final ClaudeAiMessageEvents$FailureType b;

    public ll2(ClaudeAiMessageEvents$FailureStage claudeAiMessageEvents$FailureStage, ClaudeAiMessageEvents$FailureType claudeAiMessageEvents$FailureType) {
        claudeAiMessageEvents$FailureStage.getClass();
        claudeAiMessageEvents$FailureType.getClass();
        this.a = claudeAiMessageEvents$FailureStage;
        this.b = claudeAiMessageEvents$FailureType;
    }

    public final ClaudeAiMessageEvents$FailureStage a() {
        return this.a;
    }

    public final ClaudeAiMessageEvents$FailureType b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll2)) {
            return false;
        }
        ll2 ll2Var = (ll2) obj;
        return this.a == ll2Var.a && this.b == ll2Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AnalyticsFailure(stage=" + this.a + ", type=" + this.b + ")";
    }
}
