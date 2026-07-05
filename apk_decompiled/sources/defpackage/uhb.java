package defpackage;

import com.anthropic.claude.chat.parse.ParsedContentBlock$Thinking;
import com.anthropic.claude.chat.parse.ParsedContentBlockId;

/* JADX INFO: loaded from: classes2.dex */
public final class uhb implements whb {
    public final ParsedContentBlock$Thinking a;

    public uhb(ParsedContentBlock$Thinking parsedContentBlock$Thinking) {
        parsedContentBlock$Thinking.getClass();
        this.a = parsedContentBlock$Thinking;
    }

    @Override // defpackage.whb
    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uhb) && x44.r(this.a, ((uhb) obj).a);
    }

    @Override // defpackage.whb
    public final ParsedContentBlockId getId() {
        return this.a.getId();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Thinking(originalBlock=" + this.a + ")";
    }
}
