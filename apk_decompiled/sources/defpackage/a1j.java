package defpackage;

import com.anthropic.claude.types.strings.MessageId;

/* JADX INFO: loaded from: classes2.dex */
public final class a1j implements c1j {
    public final qxh a;
    public final String b;

    public a1j(qxh qxhVar, String str) {
        qxhVar.getClass();
        str.getClass();
        this.a = qxhVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1j)) {
            return false;
        }
        a1j a1jVar = (a1j) obj;
        return x44.r(this.a, a1jVar.a) && MessageId.m1054equalsimpl0(this.b, a1jVar.b);
    }

    public final int hashCode() {
        return MessageId.m1055hashCodeimpl(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "McpToolUse(block=" + this.a + ", id=" + MessageId.m1056toStringimpl(this.b) + ")";
    }
}
