package com.anthropic.claude.analytics.events;

import defpackage.cha;
import defpackage.dha;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.m99;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.xka;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001aR\u0014\u0010,\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u001f¨\u00060"}, d2 = {"com/anthropic/claude/analytics/events/LoginEvents$AccountLoggedOut", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "Lcom/anthropic/claude/analytics/events/LoginEvents$LogoutReason;", "reason", "", "seconds_since_last_valid", "<init>", "(Lcom/anthropic/claude/analytics/events/LoginEvents$LogoutReason;Ljava/lang/Long;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/analytics/events/LoginEvents$LogoutReason;Ljava/lang/Long;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/LoginEvents$AccountLoggedOut;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/LoginEvents$AccountLoggedOut;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/analytics/events/LoginEvents$LogoutReason;", "component2", "()Ljava/lang/Long;", "copy", "(Lcom/anthropic/claude/analytics/events/LoginEvents$LogoutReason;Ljava/lang/Long;)Lcom/anthropic/claude/analytics/events/LoginEvents$AccountLoggedOut;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/analytics/events/LoginEvents$LogoutReason;", "getReason", "Ljava/lang/Long;", "getSeconds_since_last_valid", "getEventName", "eventName", "Companion", "cha", "dha", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class LoginEvents$AccountLoggedOut implements AnalyticsEvent {
    public static final int $stable = 0;
    private final LoginEvents$LogoutReason reason;
    private final Long seconds_since_last_valid;
    public static final dha Companion = new dha();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new m99(24)), null};

    public /* synthetic */ LoginEvents$AccountLoggedOut(int i, LoginEvents$LogoutReason loginEvents$LogoutReason, Long l, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, cha.a.getDescriptor());
            throw null;
        }
        this.reason = loginEvents$LogoutReason;
        if ((i & 2) == 0) {
            this.seconds_since_last_valid = null;
        } else {
            this.seconds_since_last_valid = l;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return LoginEvents$LogoutReason.Companion.serializer();
    }

    public static /* synthetic */ LoginEvents$AccountLoggedOut copy$default(LoginEvents$AccountLoggedOut loginEvents$AccountLoggedOut, LoginEvents$LogoutReason loginEvents$LogoutReason, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            loginEvents$LogoutReason = loginEvents$AccountLoggedOut.reason;
        }
        if ((i & 2) != 0) {
            l = loginEvents$AccountLoggedOut.seconds_since_last_valid;
        }
        return loginEvents$AccountLoggedOut.copy(loginEvents$LogoutReason, l);
    }

    public static final /* synthetic */ void write$Self$analytics(LoginEvents$AccountLoggedOut self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.reason);
        if (!output.E(serialDesc) && self.seconds_since_last_valid == null) {
            return;
        }
        output.B(serialDesc, 1, xka.a, self.seconds_since_last_valid);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LoginEvents$LogoutReason getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getSeconds_since_last_valid() {
        return this.seconds_since_last_valid;
    }

    public final LoginEvents$AccountLoggedOut copy(LoginEvents$LogoutReason reason, Long seconds_since_last_valid) {
        reason.getClass();
        return new LoginEvents$AccountLoggedOut(reason, seconds_since_last_valid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginEvents$AccountLoggedOut)) {
            return false;
        }
        LoginEvents$AccountLoggedOut loginEvents$AccountLoggedOut = (LoginEvents$AccountLoggedOut) other;
        return this.reason == loginEvents$AccountLoggedOut.reason && x44.r(this.seconds_since_last_valid, loginEvents$AccountLoggedOut.seconds_since_last_valid);
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile.login.logged_out";
    }

    public final LoginEvents$LogoutReason getReason() {
        return this.reason;
    }

    public final Long getSeconds_since_last_valid() {
        return this.seconds_since_last_valid;
    }

    public int hashCode() {
        int iHashCode = this.reason.hashCode() * 31;
        Long l = this.seconds_since_last_valid;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        return "AccountLoggedOut(reason=" + this.reason + ", seconds_since_last_valid=" + this.seconds_since_last_valid + ")";
    }

    public LoginEvents$AccountLoggedOut(LoginEvents$LogoutReason loginEvents$LogoutReason, Long l) {
        loginEvents$LogoutReason.getClass();
        this.reason = loginEvents$LogoutReason;
        this.seconds_since_last_valid = l;
    }

    public /* synthetic */ LoginEvents$AccountLoggedOut(LoginEvents$LogoutReason loginEvents$LogoutReason, Long l, int i, mq5 mq5Var) {
        this(loginEvents$LogoutReason, (i & 2) != 0 ? null : l);
    }
}
