package defpackage;

import com.anthropic.claude.api.chat.RefusalStopDetails;
import com.anthropic.claude.api.chat.messages.ApiHelpline;
import com.anthropic.claude.api.chat.messages.CompactionStatus;
import com.anthropic.claude.api.chat.messages.ModelUpdateEvent;
import com.anthropic.claude.api.common.RateLimit;
import com.anthropic.claude.types.strings.MessageId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class im2 {
    public final List a;
    public final String b;
    public final String c;
    public final RateLimit d;
    public final boolean e;
    public final String f;
    public final Set g;
    public final CompactionStatus h;
    public final ApiHelpline i;
    public final iwc j;
    public final ModelUpdateEvent k;
    public final RefusalStopDetails l;

    public /* synthetic */ im2(List list, String str, String str2, RateLimit rateLimit, String str3, Set set, CompactionStatus compactionStatus, ApiHelpline apiHelpline, iwc iwcVar, ModelUpdateEvent modelUpdateEvent, RefusalStopDetails refusalStopDetails, int i) {
        this(list, str, str2, rateLimit, (i & 16) == 0, (i & 32) != 0 ? null : str3, set, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : compactionStatus, apiHelpline, (i & 512) != 0 ? null : iwcVar, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? null : modelUpdateEvent, (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? null : refusalStopDetails);
    }

    public final List a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
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
            boolean r1 = r5 instanceof defpackage.im2
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            im2 r5 = (defpackage.im2) r5
            java.util.List r1 = r4.a
            java.util.List r3 = r5.a
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r5.b
            java.lang.String r3 = r4.b
            if (r3 != 0) goto L23
            if (r1 != 0) goto L21
            r1 = r0
            goto L2a
        L21:
            r1 = r2
            goto L2a
        L23:
            if (r1 != 0) goto L26
            goto L21
        L26:
            boolean r1 = com.anthropic.claude.types.strings.MessageId.m1054equalsimpl0(r3, r1)
        L2a:
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r5.c
            java.lang.String r3 = r4.c
            if (r3 != 0) goto L39
            if (r1 != 0) goto L37
            r1 = r0
            goto L40
        L37:
            r1 = r2
            goto L40
        L39:
            if (r1 != 0) goto L3c
            goto L37
        L3c:
            boolean r1 = com.anthropic.claude.types.strings.MessageId.m1054equalsimpl0(r3, r1)
        L40:
            if (r1 != 0) goto L43
            return r2
        L43:
            com.anthropic.claude.api.common.RateLimit r1 = r4.d
            com.anthropic.claude.api.common.RateLimit r3 = r5.d
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            boolean r1 = r4.e
            boolean r3 = r5.e
            if (r1 == r3) goto L55
            return r2
        L55:
            java.lang.String r1 = r4.f
            java.lang.String r3 = r5.f
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L60
            return r2
        L60:
            java.util.Set r1 = r4.g
            java.util.Set r3 = r5.g
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L6b
            return r2
        L6b:
            com.anthropic.claude.api.chat.messages.CompactionStatus r1 = r4.h
            com.anthropic.claude.api.chat.messages.CompactionStatus r3 = r5.h
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L76
            return r2
        L76:
            com.anthropic.claude.api.chat.messages.ApiHelpline r1 = r4.i
            com.anthropic.claude.api.chat.messages.ApiHelpline r3 = r5.i
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L81
            return r2
        L81:
            iwc r1 = r4.j
            iwc r3 = r5.j
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L8c
            return r2
        L8c:
            com.anthropic.claude.api.chat.messages.ModelUpdateEvent r1 = r4.k
            com.anthropic.claude.api.chat.messages.ModelUpdateEvent r3 = r5.k
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L97
            return r2
        L97:
            com.anthropic.claude.api.chat.RefusalStopDetails r4 = r4.l
            com.anthropic.claude.api.chat.RefusalStopDetails r5 = r5.l
            boolean r4 = defpackage.x44.r(r4, r5)
            if (r4 != 0) goto La2
            return r2
        La2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.im2.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iM1055hashCodeimpl = (iHashCode + (str == null ? 0 : MessageId.m1055hashCodeimpl(str))) * 31;
        String str2 = this.c;
        int iP = fsh.p((this.d.hashCode() + ((iM1055hashCodeimpl + (str2 == null ? 0 : MessageId.m1055hashCodeimpl(str2))) * 31)) * 31, 31, this.e);
        String str3 = this.f;
        int iHashCode2 = (this.g.hashCode() + ((iP + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        CompactionStatus compactionStatus = this.h;
        int iHashCode3 = (iHashCode2 + (compactionStatus == null ? 0 : compactionStatus.hashCode())) * 31;
        ApiHelpline apiHelpline = this.i;
        int iHashCode4 = (iHashCode3 + (apiHelpline == null ? 0 : apiHelpline.hashCode())) * 31;
        iwc iwcVar = this.j;
        int iHashCode5 = (iHashCode4 + (iwcVar == null ? 0 : iwcVar.hashCode())) * 31;
        ModelUpdateEvent modelUpdateEvent = this.k;
        int iHashCode6 = (iHashCode5 + (modelUpdateEvent == null ? 0 : modelUpdateEvent.hashCode())) * 31;
        RefusalStopDetails refusalStopDetails = this.l;
        return iHashCode6 + (refusalStopDetails != null ? refusalStopDetails.hashCode() : 0);
    }

    public final String toString() {
        String str = this.b;
        String strM1056toStringimpl = str == null ? "null" : MessageId.m1056toStringimpl(str);
        String str2 = this.c;
        return "ChatCompletionData(contentBlocks=" + this.a + ", messageId=" + strM1056toStringimpl + ", parentMessageId=" + (str2 != null ? MessageId.m1056toStringimpl(str2) : "null") + ", messageLimit=" + this.d + ", isComplete=" + this.e + ", stopReason=" + this.f + ", incompleteBlockIndices=" + this.g + ", compactionStatus=" + this.h + ", helpline=" + this.i + ", pendingMcpAuth=" + this.j + ", modelUpdate=" + this.k + ", refusalDetails=" + this.l + ")";
    }

    public im2(List list, String str, String str2, RateLimit rateLimit, boolean z, String str3, Set set, CompactionStatus compactionStatus, ApiHelpline apiHelpline, iwc iwcVar, ModelUpdateEvent modelUpdateEvent, RefusalStopDetails refusalStopDetails) {
        list.getClass();
        rateLimit.getClass();
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = rateLimit;
        this.e = z;
        this.f = str3;
        this.g = set;
        this.h = compactionStatus;
        this.i = apiHelpline;
        this.j = iwcVar;
        this.k = modelUpdateEvent;
        this.l = refusalStopDetails;
    }
}
