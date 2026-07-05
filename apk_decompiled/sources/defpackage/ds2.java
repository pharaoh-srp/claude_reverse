package defpackage;

import com.anthropic.claude.api.chat.ChatFeedbackType;
import com.anthropic.claude.types.strings.MessageId;

/* JADX INFO: loaded from: classes3.dex */
public final class ds2 {
    public final String a;
    public final int b;
    public final ChatFeedbackType c;
    public final String d;

    public ds2(String str, int i, ChatFeedbackType chatFeedbackType, String str2) {
        chatFeedbackType.getClass();
        this.a = str;
        this.b = i;
        this.c = chatFeedbackType;
        this.d = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
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
            boolean r1 = r5 instanceof defpackage.ds2
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ds2 r5 = (defpackage.ds2) r5
            java.lang.String r1 = r5.a
            java.lang.String r3 = r4.a
            if (r3 != 0) goto L18
            if (r1 != 0) goto L16
            r1 = r0
            goto L1f
        L16:
            r1 = r2
            goto L1f
        L18:
            if (r1 != 0) goto L1b
            goto L16
        L1b:
            boolean r1 = com.anthropic.claude.types.strings.MessageId.m1054equalsimpl0(r3, r1)
        L1f:
            if (r1 != 0) goto L22
            return r2
        L22:
            int r1 = r4.b
            int r3 = r5.b
            if (r1 == r3) goto L29
            return r2
        L29:
            com.anthropic.claude.api.chat.ChatFeedbackType r1 = r4.c
            com.anthropic.claude.api.chat.ChatFeedbackType r3 = r5.c
            if (r1 == r3) goto L30
            return r2
        L30:
            java.lang.String r4 = r4.d
            java.lang.String r5 = r5.d
            boolean r4 = defpackage.x44.r(r4, r5)
            if (r4 != 0) goto L3b
            return r2
        L3b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ds2.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (this.c.hashCode() + vb7.c(this.b, (str == null ? 0 : MessageId.m1055hashCodeimpl(str)) * 31, 31)) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sbP = ij0.p("Submitted(messageId=", str == null ? "null" : MessageId.m1056toStringimpl(str), this.b, ", messageIndex=", ", feedbackType=");
        sbP.append(this.c);
        sbP.append(", reason=");
        sbP.append(this.d);
        sbP.append(")");
        return sbP.toString();
    }
}
