package com.anthropic.claude.analytics;

import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.EmailAddress;
import com.anthropic.claude.types.strings.OrganizationId;
import defpackage.fkc;
import defpackage.grc;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.ok6;
import defpackage.onf;
import defpackage.ri3;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.z7;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0083\b\u0018\u0000 22\u00020\u0001:\u000234B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ:\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b0\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b1\u0010\u001c¨\u00065"}, d2 = {"com/anthropic/claude/analytics/ClaudeAnalyticsImpl$Traits", "", "Lcom/anthropic/claude/types/strings/AccountId;", "account_uuid", "Lcom/anthropic/claude/types/strings/OrganizationId;", "organization_uuid", "Lcom/anthropic/claude/types/strings/EmailAddress;", "email", "", "subscription_level", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "Lcom/anthropic/claude/analytics/ClaudeAnalyticsImpl$Traits;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/ClaudeAnalyticsImpl$Traits;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-islZJdo", "()Ljava/lang/String;", "component1", "component2-XjkXN6I", "component2", "component3-ZiuLfiY", "component3", "component4", "copy-AlyoyZ4", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/ClaudeAnalyticsImpl$Traits;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccount_uuid-islZJdo", "getOrganization_uuid-XjkXN6I", "getEmail-ZiuLfiY", "getSubscription_level", "Companion", "com/anthropic/claude/analytics/a", "ri3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
final /* data */ class ClaudeAnalyticsImpl$Traits {
    public static final ri3 Companion = new ri3();
    private final String account_uuid;
    private final String email;
    private final String organization_uuid;
    private final String subscription_level;

    private /* synthetic */ ClaudeAnalyticsImpl$Traits(int i, String str, String str2, String str3, String str4, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, a.a.getDescriptor());
            throw null;
        }
        this.account_uuid = str;
        this.organization_uuid = str2;
        this.email = str3;
        this.subscription_level = str4;
    }

    /* JADX INFO: renamed from: copy-AlyoyZ4$default, reason: not valid java name */
    public static /* synthetic */ ClaudeAnalyticsImpl$Traits m93copyAlyoyZ4$default(ClaudeAnalyticsImpl$Traits claudeAnalyticsImpl$Traits, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = claudeAnalyticsImpl$Traits.account_uuid;
        }
        if ((i & 2) != 0) {
            str2 = claudeAnalyticsImpl$Traits.organization_uuid;
        }
        if ((i & 4) != 0) {
            str3 = claudeAnalyticsImpl$Traits.email;
        }
        if ((i & 8) != 0) {
            str4 = claudeAnalyticsImpl$Traits.subscription_level;
        }
        return claudeAnalyticsImpl$Traits.m97copyAlyoyZ4(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$analytics(ClaudeAnalyticsImpl$Traits self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, z7.a, AccountId.m943boximpl(self.account_uuid));
        output.r(serialDesc, 1, fkc.a, OrganizationId.m1065boximpl(self.organization_uuid));
        output.r(serialDesc, 2, ok6.a, EmailAddress.m1006boximpl(self.email));
        output.B(serialDesc, 3, srg.a, self.subscription_level);
    }

    /* JADX INFO: renamed from: component1-islZJdo, reason: not valid java name and from getter */
    public final String getAccount_uuid() {
        return this.account_uuid;
    }

    /* JADX INFO: renamed from: component2-XjkXN6I, reason: not valid java name and from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component3-ZiuLfiY, reason: not valid java name and from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubscription_level() {
        return this.subscription_level;
    }

    /* JADX INFO: renamed from: copy-AlyoyZ4, reason: not valid java name */
    public final ClaudeAnalyticsImpl$Traits m97copyAlyoyZ4(String account_uuid, String organization_uuid, String email, String subscription_level) {
        account_uuid.getClass();
        organization_uuid.getClass();
        email.getClass();
        return new ClaudeAnalyticsImpl$Traits(account_uuid, organization_uuid, email, subscription_level, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClaudeAnalyticsImpl$Traits)) {
            return false;
        }
        ClaudeAnalyticsImpl$Traits claudeAnalyticsImpl$Traits = (ClaudeAnalyticsImpl$Traits) other;
        return AccountId.m946equalsimpl0(this.account_uuid, claudeAnalyticsImpl$Traits.account_uuid) && OrganizationId.m1068equalsimpl0(this.organization_uuid, claudeAnalyticsImpl$Traits.organization_uuid) && EmailAddress.m1009equalsimpl0(this.email, claudeAnalyticsImpl$Traits.email) && x44.r(this.subscription_level, claudeAnalyticsImpl$Traits.subscription_level);
    }

    /* JADX INFO: renamed from: getAccount_uuid-islZJdo, reason: not valid java name */
    public final String m98getAccount_uuidislZJdo() {
        return this.account_uuid;
    }

    /* JADX INFO: renamed from: getEmail-ZiuLfiY, reason: not valid java name */
    public final String m99getEmailZiuLfiY() {
        return this.email;
    }

    /* JADX INFO: renamed from: getOrganization_uuid-XjkXN6I, reason: not valid java name */
    public final String m100getOrganization_uuidXjkXN6I() {
        return this.organization_uuid;
    }

    public final String getSubscription_level() {
        return this.subscription_level;
    }

    public int hashCode() {
        int iM1010hashCodeimpl = (EmailAddress.m1010hashCodeimpl(this.email) + ((OrganizationId.m1069hashCodeimpl(this.organization_uuid) + (AccountId.m947hashCodeimpl(this.account_uuid) * 31)) * 31)) * 31;
        String str = this.subscription_level;
        return iM1010hashCodeimpl + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String strM948toStringimpl = AccountId.m948toStringimpl(this.account_uuid);
        String strM1070toStringimpl = OrganizationId.m1070toStringimpl(this.organization_uuid);
        return vb7.t(kgh.r("Traits(account_uuid=", strM948toStringimpl, ", organization_uuid=", strM1070toStringimpl, ", email="), EmailAddress.m1012toStringimpl(this.email), ", subscription_level=", this.subscription_level, ")");
    }

    private ClaudeAnalyticsImpl$Traits(String str, String str2, String str3, String str4) {
        grc.B(str, str2, str3);
        this.account_uuid = str;
        this.organization_uuid = str2;
        this.email = str3;
        this.subscription_level = str4;
    }

    public /* synthetic */ ClaudeAnalyticsImpl$Traits(String str, String str2, String str3, String str4, mq5 mq5Var) {
        this(str, str2, str3, str4);
    }

    public /* synthetic */ ClaudeAnalyticsImpl$Traits(int i, String str, String str2, String str3, String str4, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, str3, str4, vnfVar);
    }
}
