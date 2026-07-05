package defpackage;

import com.anthropic.claude.analytics.events.MobileToolEvents$MobileToolKind;
import com.anthropic.claude.types.strings.MessageId;

/* JADX INFO: loaded from: classes2.dex */
public final class tl2 {
    public final MobileToolEvents$MobileToolKind a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;

    public tl2(MobileToolEvents$MobileToolKind mobileToolEvents$MobileToolKind, String str, String str2, String str3, long j) {
        mobileToolEvents$MobileToolKind.getClass();
        str.getClass();
        this.a = mobileToolEvents$MobileToolKind;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof defpackage.tl2
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            tl2 r6 = (defpackage.tl2) r6
            com.anthropic.claude.analytics.events.MobileToolEvents$MobileToolKind r1 = r5.a
            com.anthropic.claude.analytics.events.MobileToolEvents$MobileToolKind r3 = r6.a
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.String r1 = r5.b
            java.lang.String r3 = r6.b
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            java.lang.String r1 = r5.c
            java.lang.String r3 = r6.c
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L29
            return r2
        L29:
            java.lang.String r1 = r6.d
            java.lang.String r3 = r5.d
            if (r3 != 0) goto L35
            if (r1 != 0) goto L33
            r1 = r0
            goto L3c
        L33:
            r1 = r2
            goto L3c
        L35:
            if (r1 != 0) goto L38
            goto L33
        L38:
            boolean r1 = com.anthropic.claude.types.strings.MessageId.m1054equalsimpl0(r3, r1)
        L3c:
            if (r1 != 0) goto L3f
            return r2
        L3f:
            long r3 = r5.e
            long r5 = r6.e
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L48
            return r2
        L48:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl2.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iL = kgh.l(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return Long.hashCode(this.e) + ((iHashCode + (str2 != null ? MessageId.m1055hashCodeimpl(str2) : 0)) * 31);
    }

    public final String toString() {
        String str = this.d;
        String strM1056toStringimpl = str == null ? "null" : MessageId.m1056toStringimpl(str);
        StringBuilder sb = new StringBuilder("PendingToolUse(kind=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", serverName=");
        kgh.u(sb, this.c, ", messageId=", strM1056toStringimpl, ", stopElapsedMs=");
        return grc.r(this.e, ")", sb);
    }
}
