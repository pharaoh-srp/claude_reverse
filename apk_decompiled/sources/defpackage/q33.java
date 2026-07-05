package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$PollingRecoveryTriggerReason;
import com.anthropic.claude.types.strings.MessageId;

/* JADX INFO: loaded from: classes2.dex */
public final class q33 {
    public final ChatEvents$PollingRecoveryTriggerReason a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;

    public q33(ChatEvents$PollingRecoveryTriggerReason chatEvents$PollingRecoveryTriggerReason, String str, String str2, long j, long j2) {
        chatEvents$PollingRecoveryTriggerReason.getClass();
        str.getClass();
        this.a = chatEvents$PollingRecoveryTriggerReason;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = j2;
    }

    public final String a() {
        return this.c;
    }

    public final long b() {
        return this.d;
    }

    public final long c() {
        return this.e;
    }

    public final String d() {
        return this.b;
    }

    public final ChatEvents$PollingRecoveryTriggerReason e() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.q33
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            q33 r8 = (defpackage.q33) r8
            com.anthropic.claude.analytics.events.ChatEvents$PollingRecoveryTriggerReason r1 = r7.a
            com.anthropic.claude.analytics.events.ChatEvents$PollingRecoveryTriggerReason r3 = r8.a
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.String r1 = r7.b
            java.lang.String r3 = r8.b
            boolean r1 = com.anthropic.claude.types.strings.MessageId.m1054equalsimpl0(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            java.lang.String r1 = r8.c
            java.lang.String r3 = r7.c
            if (r3 != 0) goto L2a
            if (r1 != 0) goto L28
            r1 = r0
            goto L31
        L28:
            r1 = r2
            goto L31
        L2a:
            if (r1 != 0) goto L2d
            goto L28
        L2d:
            boolean r1 = com.anthropic.claude.types.strings.MessageId.m1054equalsimpl0(r3, r1)
        L31:
            if (r1 != 0) goto L34
            return r2
        L34:
            long r3 = r7.d
            long r5 = r8.d
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L3d
            return r2
        L3d:
            long r3 = r7.e
            long r7 = r8.e
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L46
            return r2
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q33.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iM1055hashCodeimpl = (MessageId.m1055hashCodeimpl(this.b) + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return Long.hashCode(this.e) + vb7.e((iM1055hashCodeimpl + (str == null ? 0 : MessageId.m1055hashCodeimpl(str))) * 31, 31, this.d);
    }

    public final String toString() {
        String strM1056toStringimpl = MessageId.m1056toStringimpl(this.b);
        String str = this.c;
        return "Needed(trigger=" + this.a + ", messageUuid=" + strM1056toStringimpl + ", humanMessageUuid=" + (str == null ? "null" : MessageId.m1056toStringimpl(str)) + ", messageAgeMs=" + this.d + ", messageCreatedAtMs=" + this.e + ")";
    }
}
