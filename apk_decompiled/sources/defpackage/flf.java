package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$RetryCompletionReason;
import com.anthropic.claude.api.chat.InputMode;
import com.anthropic.claude.types.strings.MessageId;

/* JADX INFO: loaded from: classes2.dex */
public final class flf implements glf {
    public final ChatEvents$RetryCompletionReason a;
    public final String b;

    public flf(ChatEvents$RetryCompletionReason chatEvents$RetryCompletionReason, String str) {
        chatEvents$RetryCompletionReason.getClass();
        this.a = chatEvents$RetryCompletionReason;
        this.b = str;
    }

    @Override // defpackage.glf
    public final InputMode a() {
        return InputMode.RETRY;
    }

    public final ChatEvents$RetryCompletionReason b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.flf
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            flf r5 = (defpackage.flf) r5
            com.anthropic.claude.analytics.events.ChatEvents$RetryCompletionReason r1 = r4.a
            com.anthropic.claude.analytics.events.ChatEvents$RetryCompletionReason r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.String r5 = r5.b
            java.lang.String r4 = r4.b
            if (r4 != 0) goto L1f
            if (r5 != 0) goto L1d
            r4 = r0
            goto L26
        L1d:
            r4 = r2
            goto L26
        L1f:
            if (r5 != 0) goto L22
            goto L1d
        L22:
            boolean r4 = com.anthropic.claude.types.strings.MessageId.m1054equalsimpl0(r4, r5)
        L26:
            if (r4 != 0) goto L29
            return r2
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.flf.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : MessageId.m1055hashCodeimpl(str));
    }

    public final String toString() {
        String str = this.b;
        return "Retry(reason=" + this.a + ", retriedFromMessageUuid=" + (str == null ? "null" : MessageId.m1056toStringimpl(str)) + ")";
    }

    public /* synthetic */ flf(ChatEvents$RetryCompletionReason chatEvents$RetryCompletionReason) {
        this(chatEvents$RetryCompletionReason, null);
    }
}
