package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.onf;
import defpackage.t59;
import defpackage.u59;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nBE\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001dJB\u0010!\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b0\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b1\u0010\u001dR\u0014\u00103\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u001b¨\u00067"}, d2 = {"com/anthropic/claude/analytics/events/InstallReferrerAnalyticsEvents$InstallReferrerLogged", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "install_referrer", "", "referrer_click_timestamp_seconds", "install_begin_timestamp_seconds", "referrer_click_timestamp_server_seconds", "install_begin_timestamp_server_seconds", "<init>", "(Ljava/lang/String;JJJJ)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;JJJJLvnf;)V", "Lcom/anthropic/claude/analytics/events/InstallReferrerAnalyticsEvents$InstallReferrerLogged;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/InstallReferrerAnalyticsEvents$InstallReferrerLogged;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "component4", "component5", "copy", "(Ljava/lang/String;JJJJ)Lcom/anthropic/claude/analytics/events/InstallReferrerAnalyticsEvents$InstallReferrerLogged;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInstall_referrer", "J", "getReferrer_click_timestamp_seconds", "getInstall_begin_timestamp_seconds", "getReferrer_click_timestamp_server_seconds", "getInstall_begin_timestamp_server_seconds", "getEventName", "eventName", "Companion", "u59", "t59", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class InstallReferrerAnalyticsEvents$InstallReferrerLogged implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final u59 Companion = new u59();
    private final long install_begin_timestamp_seconds;
    private final long install_begin_timestamp_server_seconds;
    private final String install_referrer;
    private final long referrer_click_timestamp_seconds;
    private final long referrer_click_timestamp_server_seconds;

    public /* synthetic */ InstallReferrerAnalyticsEvents$InstallReferrerLogged(int i, String str, long j, long j2, long j3, long j4, vnf vnfVar) {
        if (31 != (i & 31)) {
            gvj.f(i, 31, t59.a.getDescriptor());
            throw null;
        }
        this.install_referrer = str;
        this.referrer_click_timestamp_seconds = j;
        this.install_begin_timestamp_seconds = j2;
        this.referrer_click_timestamp_server_seconds = j3;
        this.install_begin_timestamp_server_seconds = j4;
    }

    public static /* synthetic */ InstallReferrerAnalyticsEvents$InstallReferrerLogged copy$default(InstallReferrerAnalyticsEvents$InstallReferrerLogged installReferrerAnalyticsEvents$InstallReferrerLogged, String str, long j, long j2, long j3, long j4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = installReferrerAnalyticsEvents$InstallReferrerLogged.install_referrer;
        }
        if ((i & 2) != 0) {
            j = installReferrerAnalyticsEvents$InstallReferrerLogged.referrer_click_timestamp_seconds;
        }
        if ((i & 4) != 0) {
            j2 = installReferrerAnalyticsEvents$InstallReferrerLogged.install_begin_timestamp_seconds;
        }
        if ((i & 8) != 0) {
            j3 = installReferrerAnalyticsEvents$InstallReferrerLogged.referrer_click_timestamp_server_seconds;
        }
        if ((i & 16) != 0) {
            j4 = installReferrerAnalyticsEvents$InstallReferrerLogged.install_begin_timestamp_server_seconds;
        }
        long j5 = j4;
        long j6 = j3;
        return installReferrerAnalyticsEvents$InstallReferrerLogged.copy(str, j, j2, j6, j5);
    }

    public static final /* synthetic */ void write$Self$analytics(InstallReferrerAnalyticsEvents$InstallReferrerLogged self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.install_referrer);
        output.D(serialDesc, 1, self.referrer_click_timestamp_seconds);
        output.D(serialDesc, 2, self.install_begin_timestamp_seconds);
        output.D(serialDesc, 3, self.referrer_click_timestamp_server_seconds);
        output.D(serialDesc, 4, self.install_begin_timestamp_server_seconds);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getInstall_referrer() {
        return this.install_referrer;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getReferrer_click_timestamp_seconds() {
        return this.referrer_click_timestamp_seconds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getInstall_begin_timestamp_seconds() {
        return this.install_begin_timestamp_seconds;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getReferrer_click_timestamp_server_seconds() {
        return this.referrer_click_timestamp_server_seconds;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getInstall_begin_timestamp_server_seconds() {
        return this.install_begin_timestamp_server_seconds;
    }

    public final InstallReferrerAnalyticsEvents$InstallReferrerLogged copy(String install_referrer, long referrer_click_timestamp_seconds, long install_begin_timestamp_seconds, long referrer_click_timestamp_server_seconds, long install_begin_timestamp_server_seconds) {
        install_referrer.getClass();
        return new InstallReferrerAnalyticsEvents$InstallReferrerLogged(install_referrer, referrer_click_timestamp_seconds, install_begin_timestamp_seconds, referrer_click_timestamp_server_seconds, install_begin_timestamp_server_seconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstallReferrerAnalyticsEvents$InstallReferrerLogged)) {
            return false;
        }
        InstallReferrerAnalyticsEvents$InstallReferrerLogged installReferrerAnalyticsEvents$InstallReferrerLogged = (InstallReferrerAnalyticsEvents$InstallReferrerLogged) other;
        return x44.r(this.install_referrer, installReferrerAnalyticsEvents$InstallReferrerLogged.install_referrer) && this.referrer_click_timestamp_seconds == installReferrerAnalyticsEvents$InstallReferrerLogged.referrer_click_timestamp_seconds && this.install_begin_timestamp_seconds == installReferrerAnalyticsEvents$InstallReferrerLogged.install_begin_timestamp_seconds && this.referrer_click_timestamp_server_seconds == installReferrerAnalyticsEvents$InstallReferrerLogged.referrer_click_timestamp_server_seconds && this.install_begin_timestamp_server_seconds == installReferrerAnalyticsEvents$InstallReferrerLogged.install_begin_timestamp_server_seconds;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.install_referrer.logged";
    }

    public final long getInstall_begin_timestamp_seconds() {
        return this.install_begin_timestamp_seconds;
    }

    public final long getInstall_begin_timestamp_server_seconds() {
        return this.install_begin_timestamp_server_seconds;
    }

    public final String getInstall_referrer() {
        return this.install_referrer;
    }

    public final long getReferrer_click_timestamp_seconds() {
        return this.referrer_click_timestamp_seconds;
    }

    public final long getReferrer_click_timestamp_server_seconds() {
        return this.referrer_click_timestamp_server_seconds;
    }

    public int hashCode() {
        return Long.hashCode(this.install_begin_timestamp_server_seconds) + vb7.e(vb7.e(vb7.e(this.install_referrer.hashCode() * 31, 31, this.referrer_click_timestamp_seconds), 31, this.install_begin_timestamp_seconds), 31, this.referrer_click_timestamp_server_seconds);
    }

    public String toString() {
        String str = this.install_referrer;
        long j = this.referrer_click_timestamp_seconds;
        long j2 = this.install_begin_timestamp_seconds;
        long j3 = this.referrer_click_timestamp_server_seconds;
        long j4 = this.install_begin_timestamp_server_seconds;
        StringBuilder sbW = vb7.w("InstallReferrerLogged(install_referrer=", str, ", referrer_click_timestamp_seconds=", j);
        ij0.u(j2, ", install_begin_timestamp_seconds=", ", referrer_click_timestamp_server_seconds=", sbW);
        sbW.append(j3);
        sbW.append(", install_begin_timestamp_server_seconds=");
        sbW.append(j4);
        sbW.append(")");
        return sbW.toString();
    }

    public InstallReferrerAnalyticsEvents$InstallReferrerLogged(String str, long j, long j2, long j3, long j4) {
        str.getClass();
        this.install_referrer = str;
        this.referrer_click_timestamp_seconds = j;
        this.install_begin_timestamp_seconds = j2;
        this.referrer_click_timestamp_server_seconds = j3;
        this.install_begin_timestamp_server_seconds = j4;
    }
}
