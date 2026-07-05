package defpackage;

import com.anthropic.claude.api.tasks.AgentContentBlock;

/* JADX INFO: loaded from: classes2.dex */
public final class kq implements AgentContentBlock {
    public final String a;

    public kq(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kq) && this.a.equals(((kq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Unknown(type=", this.a, ")");
    }
}
