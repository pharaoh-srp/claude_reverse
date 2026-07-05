package defpackage;

import com.anthropic.claude.api.chat.messages.CompactionStatus;

/* JADX INFO: loaded from: classes2.dex */
public final class k84 {
    public final CompactionStatus.Status a;
    public final long b;

    public k84(CompactionStatus.Status status, long j) {
        status.getClass();
        this.a = status;
        this.b = j;
    }

    public static k84 a(k84 k84Var, CompactionStatus.Status status) {
        long j = k84Var.b;
        status.getClass();
        return new k84(status, j);
    }

    public final long b() {
        return this.b;
    }

    public final CompactionStatus.Status c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k84)) {
            return false;
        }
        k84 k84Var = (k84) obj;
        return this.a == k84Var.a && this.b == k84Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CompactionState(status=" + this.a + ", startTimeMs=" + this.b + ")";
    }
}
