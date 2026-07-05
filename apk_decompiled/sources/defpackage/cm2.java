package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$SendMessageFailureReason;

/* JADX INFO: loaded from: classes2.dex */
public final class cm2 {
    public final ChatEvents$SendMessageFailureReason a;
    public final String b;
    public final bj3 c;
    public final String d;

    public cm2(ChatEvents$SendMessageFailureReason chatEvents$SendMessageFailureReason, String str, bj3 bj3Var, String str2) {
        chatEvents$SendMessageFailureReason.getClass();
        this.a = chatEvents$SendMessageFailureReason;
        this.b = str;
        this.c = bj3Var;
        this.d = str2;
    }

    public final String a() {
        return this.b;
    }

    public final bj3 b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final ChatEvents$SendMessageFailureReason d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cm2)) {
            return false;
        }
        cm2 cm2Var = (cm2) obj;
        return this.a == cm2Var.a && this.b.equals(cm2Var.b) && x44.r(this.c, cm2Var.c) && this.d.equals(cm2Var.d);
    }

    public final int hashCode() {
        int iL = kgh.l(this.a.hashCode() * 31, 31, this.b);
        bj3 bj3Var = this.c;
        return this.d.hashCode() + ((iL + (bj3Var == null ? 0 : bj3Var.hashCode())) * 31);
    }

    public final String toString() {
        return "ErrorDetails(reason=" + this.a + ", cause=" + this.b + ", claudeApiError=" + this.c + ", errorType=" + this.d + ")";
    }
}
