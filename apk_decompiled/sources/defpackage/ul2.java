package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$PollingRecoveryTriggerReason;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings.OrganizationId;

/* JADX INFO: loaded from: classes2.dex */
public final class ul2 {
    public final String a;
    public final String b;
    public final ChatEvents$PollingRecoveryTriggerReason c;
    public final boolean d;
    public final Long e;
    public final String f;
    public final String g;
    public final String h;
    public final Boolean i;
    public final String j;
    public final vl2 k;
    public final int l;

    public ul2(String str, String str2, ChatEvents$PollingRecoveryTriggerReason chatEvents$PollingRecoveryTriggerReason, boolean z, Long l, String str3, String str4, String str5, Boolean bool, String str6, vl2 vl2Var, int i) {
        str.getClass();
        str2.getClass();
        chatEvents$PollingRecoveryTriggerReason.getClass();
        this.a = str;
        this.b = str2;
        this.c = chatEvents$PollingRecoveryTriggerReason;
        this.d = z;
        this.e = l;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = bool;
        this.j = str6;
        this.k = vl2Var;
        this.l = i;
    }

    public final String a() {
        return this.b;
    }

    public final int b() {
        return this.l;
    }

    public final boolean c() {
        return this.d;
    }

    public final Boolean d() {
        return this.i;
    }

    public final String e() {
        return this.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L5
            goto Lad
        L5:
            boolean r1 = r5 instanceof defpackage.ul2
            r2 = 0
            if (r1 != 0) goto Lc
            goto Lac
        Lc:
            ul2 r5 = (defpackage.ul2) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.a
            boolean r1 = com.anthropic.claude.types.strings.OrganizationId.m1068equalsimpl0(r1, r3)
            if (r1 != 0) goto L1a
            goto Lac
        L1a:
            java.lang.String r1 = r4.b
            java.lang.String r3 = r5.b
            boolean r1 = com.anthropic.claude.types.strings.ChatId.m981equalsimpl0(r1, r3)
            if (r1 != 0) goto L26
            goto Lac
        L26:
            com.anthropic.claude.analytics.events.ChatEvents$PollingRecoveryTriggerReason r1 = r4.c
            com.anthropic.claude.analytics.events.ChatEvents$PollingRecoveryTriggerReason r3 = r5.c
            if (r1 == r3) goto L2e
            goto Lac
        L2e:
            boolean r1 = r4.d
            boolean r3 = r5.d
            if (r1 == r3) goto L36
            goto Lac
        L36:
            java.lang.Long r1 = r4.e
            java.lang.Long r3 = r5.e
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L42
            goto Lac
        L42:
            java.lang.String r1 = r5.f
            java.lang.String r3 = r4.f
            if (r3 != 0) goto L4e
            if (r1 != 0) goto L4c
            r1 = r0
            goto L55
        L4c:
            r1 = r2
            goto L55
        L4e:
            if (r1 != 0) goto L51
            goto L4c
        L51:
            boolean r1 = com.anthropic.claude.types.strings.MessageId.m1054equalsimpl0(r3, r1)
        L55:
            if (r1 != 0) goto L59
            goto Lac
        L59:
            java.lang.String r1 = r5.g
            java.lang.String r3 = r4.g
            if (r3 != 0) goto L65
            if (r1 != 0) goto L63
            r1 = r0
            goto L6c
        L63:
            r1 = r2
            goto L6c
        L65:
            if (r1 != 0) goto L68
            goto L63
        L68:
            boolean r1 = com.anthropic.claude.types.strings.MessageId.m1054equalsimpl0(r3, r1)
        L6c:
            if (r1 != 0) goto L6f
            goto Lac
        L6f:
            java.lang.String r1 = r5.h
            java.lang.String r3 = r4.h
            if (r3 != 0) goto L7b
            if (r1 != 0) goto L79
            r1 = r0
            goto L82
        L79:
            r1 = r2
            goto L82
        L7b:
            if (r1 != 0) goto L7e
            goto L79
        L7e:
            boolean r1 = com.anthropic.claude.types.strings.ModelId.m1061equalsimpl0(r3, r1)
        L82:
            if (r1 != 0) goto L85
            goto Lac
        L85:
            java.lang.Boolean r1 = r4.i
            java.lang.Boolean r3 = r5.i
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L90
            goto Lac
        L90:
            java.lang.String r1 = r4.j
            java.lang.String r3 = r5.j
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L9b
            goto Lac
        L9b:
            vl2 r1 = r4.k
            vl2 r3 = r5.k
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto La6
            goto Lac
        La6:
            int r4 = r4.l
            int r5 = r5.l
            if (r4 == r5) goto Lad
        Lac:
            return r2
        Lad:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ul2.equals(java.lang.Object):boolean");
    }

    public final String f() {
        return this.j;
    }

    public final Long g() {
        return this.e;
    }

    public final String h() {
        return this.f;
    }

    public final int hashCode() {
        int iP = fsh.p((this.c.hashCode() + ((ChatId.m982hashCodeimpl(this.b) + (OrganizationId.m1069hashCodeimpl(this.a) * 31)) * 31)) * 31, 31, this.d);
        Long l = this.e;
        int iHashCode = (iP + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.f;
        int iM1055hashCodeimpl = (iHashCode + (str == null ? 0 : MessageId.m1055hashCodeimpl(str))) * 31;
        String str2 = this.g;
        int iM1055hashCodeimpl2 = (iM1055hashCodeimpl + (str2 == null ? 0 : MessageId.m1055hashCodeimpl(str2))) * 31;
        String str3 = this.h;
        int iM1062hashCodeimpl = (iM1055hashCodeimpl2 + (str3 == null ? 0 : ModelId.m1062hashCodeimpl(str3))) * 31;
        Boolean bool = this.i;
        int iHashCode2 = (iM1062hashCodeimpl + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.j;
        return Integer.hashCode(this.l) + ((this.k.hashCode() + ((iHashCode2 + (str4 != null ? str4.hashCode() : 0)) * 31)) * 31);
    }

    public final String i() {
        return this.h;
    }

    public final String j() {
        return this.a;
    }

    public final vl2 k() {
        return this.k;
    }

    public final ChatEvents$PollingRecoveryTriggerReason l() {
        return this.c;
    }

    public final String toString() {
        String strM1070toStringimpl = OrganizationId.m1070toStringimpl(this.a);
        String strM983toStringimpl = ChatId.m983toStringimpl(this.b);
        String str = this.f;
        String strM1056toStringimpl = str == null ? "null" : MessageId.m1056toStringimpl(str);
        String str2 = this.g;
        String strM1056toStringimpl2 = str2 == null ? "null" : MessageId.m1056toStringimpl(str2);
        String str3 = this.h;
        String strM1063toStringimpl = str3 != null ? ModelId.m1063toStringimpl(str3) : "null";
        StringBuilder sbR = kgh.r("RecoveryState(organizationId=", strM1070toStringimpl, ", chatId=", strM983toStringimpl, ", triggerReason=");
        sbR.append(this.c);
        sbR.append(", discoveredInForeground=");
        sbR.append(this.d);
        sbR.append(", messageAgeMs=");
        sbR.append(this.e);
        sbR.append(", messageUuid=");
        sbR.append(strM1056toStringimpl);
        sbR.append(", humanMessageUuid=");
        kgh.u(sbR, strM1056toStringimpl2, ", model=", strM1063toStringimpl, ", hadPendingToolApproval=");
        sbR.append(this.i);
        sbR.append(", lastContentBlockType=");
        sbR.append(this.j);
        sbR.append(", startMark=");
        sbR.append(this.k);
        sbR.append(", conversationFetchCount=");
        sbR.append(this.l);
        sbR.append(")");
        return sbR.toString();
    }

    public /* synthetic */ ul2(String str, String str2, ChatEvents$PollingRecoveryTriggerReason chatEvents$PollingRecoveryTriggerReason, boolean z, Long l, String str3, String str4, String str5, Boolean bool, String str6, vl2 vl2Var) {
        this(str, str2, chatEvents$PollingRecoveryTriggerReason, z, l, str3, str4, str5, bool, str6, vl2Var, 0);
    }
}
