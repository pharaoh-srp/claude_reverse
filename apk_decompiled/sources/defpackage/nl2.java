package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$RetryCompletionReason;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings.OrganizationId;
import com.anthropic.claude.types.strings.ProjectId;
import com.anthropic.claude.types.strings.ThinkingMode;

/* JADX INFO: loaded from: classes2.dex */
public final class nl2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final String m;
    public final boolean n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final String s;
    public final ChatEvents$RetryCompletionReason t;
    public final String u;
    public final boolean v;

    public nl2(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, String str6, boolean z4, int i5, int i6, int i7, int i8, String str7, ChatEvents$RetryCompletionReason chatEvents$RetryCompletionReason, String str8, boolean z5) {
        grc.B(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = str6;
        this.n = z4;
        this.o = i5;
        this.p = i6;
        this.q = i7;
        this.r = i8;
        this.s = str7;
        this.t = chatEvents$RetryCompletionReason;
        this.u = str8;
        this.v = z5;
    }

    public final String a() {
        return this.b;
    }

    public final int b() {
        return this.o;
    }

    public final String c() {
        return this.s;
    }

    public final String d() {
        return this.c;
    }

    public final int e() {
        return this.p;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nl2.equals(java.lang.Object):boolean");
    }

    public final int f() {
        return this.f;
    }

    public final int g() {
        return this.g;
    }

    public final int h() {
        return this.h;
    }

    public final int hashCode() {
        int iL = kgh.l((ChatId.m982hashCodeimpl(this.b) + (OrganizationId.m1069hashCodeimpl(this.a) * 31)) * 31, 31, this.c);
        String str = this.d;
        int iM1062hashCodeimpl = (iL + (str == null ? 0 : ModelId.m1062hashCodeimpl(str))) * 31;
        String str2 = this.e;
        int iP = fsh.p(fsh.p(fsh.p(vb7.c(this.i, vb7.c(this.h, vb7.c(this.g, vb7.c(this.f, (iM1062hashCodeimpl + (str2 == null ? 0 : ProjectId.m1083hashCodeimpl(str2))) * 31, 31), 31), 31), 31), 31, this.j), 31, this.k), 31, this.l);
        String str3 = this.m;
        int iC = vb7.c(this.r, vb7.c(this.q, vb7.c(this.p, vb7.c(this.o, fsh.p((iP + (str3 == null ? 0 : ThinkingMode.m1146hashCodeimpl(str3))) * 31, 31, this.n), 31), 31), 31), 31);
        String str4 = this.s;
        int iM1055hashCodeimpl = (iC + (str4 == null ? 0 : MessageId.m1055hashCodeimpl(str4))) * 31;
        ChatEvents$RetryCompletionReason chatEvents$RetryCompletionReason = this.t;
        int iHashCode = (iM1055hashCodeimpl + (chatEvents$RetryCompletionReason == null ? 0 : chatEvents$RetryCompletionReason.hashCode())) * 31;
        String str5 = this.u;
        return Boolean.hashCode(this.v) + ((iHashCode + (str5 != null ? MessageId.m1055hashCodeimpl(str5) : 0)) * 31);
    }

    public final int i() {
        return this.q;
    }

    public final String j() {
        return this.d;
    }

    public final String k() {
        return this.a;
    }

    public final String l() {
        return this.e;
    }

    public final boolean m() {
        return this.n;
    }

    public final String n() {
        return this.u;
    }

    public final ChatEvents$RetryCompletionReason o() {
        return this.t;
    }

    public final String p() {
        return this.m;
    }

    public final int q() {
        return this.r;
    }

    public final boolean r() {
        return this.v;
    }

    public final boolean s() {
        return this.l;
    }

    public final boolean t() {
        return this.j;
    }

    public final String toString() {
        String strM1070toStringimpl = OrganizationId.m1070toStringimpl(this.a);
        String strM983toStringimpl = ChatId.m983toStringimpl(this.b);
        String str = this.d;
        String strM1063toStringimpl = str == null ? "null" : ModelId.m1063toStringimpl(str);
        String str2 = this.e;
        String strM1084toStringimpl = str2 == null ? "null" : ProjectId.m1084toStringimpl(str2);
        String str3 = this.m;
        String strM1148toStringimpl = str3 == null ? "null" : ThinkingMode.m1148toStringimpl(str3);
        String str4 = this.s;
        String strM1056toStringimpl = str4 == null ? "null" : MessageId.m1056toStringimpl(str4);
        String str5 = this.u;
        String strM1056toStringimpl2 = str5 != null ? MessageId.m1056toStringimpl(str5) : "null";
        StringBuilder sbR = kgh.r("CompletionContext(organizationId=", strM1070toStringimpl, ", chatId=", strM983toStringimpl, ", humanMessageUuid=");
        kgh.u(sbR, this.c, ", model=", strM1063toStringimpl, ", projectId=");
        sbR.append(strM1084toStringimpl);
        sbR.append(", messageIndex=");
        sbR.append(this.f);
        sbR.append(", messageLength=");
        qy1.k(this.g, this.h, ", messageNumber=", ", conversationMessageCount=", sbR);
        sbR.append(this.i);
        sbR.append(", isNewConversation=");
        sbR.append(this.j);
        sbR.append(", isRetry=");
        ij0.A(sbR, this.k, ", isIncognito=", this.l, ", thinkingMode=");
        gid.t(sbR, strM1148toStringimpl, ", researchEnabled=", this.n, ", documentAttachmentCount=");
        qy1.k(this.o, this.p, ", imageAttachmentCount=", ", mmDocumentCount=", sbR);
        qy1.k(this.q, this.r, ", toolCount=", ", editMessageId=", sbR);
        sbR.append(strM1056toStringimpl);
        sbR.append(", retryReason=");
        sbR.append(this.t);
        sbR.append(", retriedFromMessageUuid=");
        sbR.append(strM1056toStringimpl2);
        sbR.append(", wasRestoredDraft=");
        sbR.append(this.v);
        sbR.append(")");
        return sbR.toString();
    }

    public final boolean u() {
        return this.k;
    }
}
