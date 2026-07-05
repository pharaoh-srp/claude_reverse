package com.anthropic.claude.analytics.events;

import defpackage.e79;
import defpackage.fia;
import defpackage.kw9;
import defpackage.m99;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ@\u0010 \u001a\u00020\u000f2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b.\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001fR\u0014\u00102\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u001c¨\u00066"}, d2 = {"com/anthropic/claude/analytics/events/LoginEvents$EmailLoginSSOVerificationError", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "http_status", "", "server_error_type", "server_error_code", "Lcom/anthropic/claude/analytics/events/LoginEvents$LoginClientErrorKind;", "client_error_kind", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/LoginEvents$LoginClientErrorKind;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/LoginEvents$LoginClientErrorKind;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/LoginEvents$EmailLoginSSOVerificationError;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/LoginEvents$EmailLoginSSOVerificationError;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/anthropic/claude/analytics/events/LoginEvents$LoginClientErrorKind;", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/LoginEvents$LoginClientErrorKind;)Lcom/anthropic/claude/analytics/events/LoginEvents$EmailLoginSSOVerificationError;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getHttp_status", "Ljava/lang/String;", "getServer_error_type", "getServer_error_code", "Lcom/anthropic/claude/analytics/events/LoginEvents$LoginClientErrorKind;", "getClient_error_kind", "getEventName", "eventName", "Companion", "eia", "fia", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class LoginEvents$EmailLoginSSOVerificationError implements AnalyticsEvent {
    public static final int $stable = 0;
    private final LoginEvents$LoginClientErrorKind client_error_kind;
    private final Integer http_status;
    private final String server_error_code;
    private final String server_error_type;
    public static final fia Companion = new fia();
    private static final kw9[] $childSerializers = {null, null, null, yb5.w(w1a.F, new m99(29))};

    public /* synthetic */ LoginEvents$EmailLoginSSOVerificationError(int i, Integer num, String str, String str2, LoginEvents$LoginClientErrorKind loginEvents$LoginClientErrorKind, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.http_status = null;
        } else {
            this.http_status = num;
        }
        if ((i & 2) == 0) {
            this.server_error_type = null;
        } else {
            this.server_error_type = str;
        }
        if ((i & 4) == 0) {
            this.server_error_code = null;
        } else {
            this.server_error_code = str2;
        }
        if ((i & 8) == 0) {
            this.client_error_kind = null;
        } else {
            this.client_error_kind = loginEvents$LoginClientErrorKind;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return LoginEvents$LoginClientErrorKind.Companion.serializer();
    }

    public static /* synthetic */ LoginEvents$EmailLoginSSOVerificationError copy$default(LoginEvents$EmailLoginSSOVerificationError loginEvents$EmailLoginSSOVerificationError, Integer num, String str, String str2, LoginEvents$LoginClientErrorKind loginEvents$LoginClientErrorKind, int i, Object obj) {
        if ((i & 1) != 0) {
            num = loginEvents$EmailLoginSSOVerificationError.http_status;
        }
        if ((i & 2) != 0) {
            str = loginEvents$EmailLoginSSOVerificationError.server_error_type;
        }
        if ((i & 4) != 0) {
            str2 = loginEvents$EmailLoginSSOVerificationError.server_error_code;
        }
        if ((i & 8) != 0) {
            loginEvents$LoginClientErrorKind = loginEvents$EmailLoginSSOVerificationError.client_error_kind;
        }
        return loginEvents$EmailLoginSSOVerificationError.copy(num, str, str2, loginEvents$LoginClientErrorKind);
    }

    public static final /* synthetic */ void write$Self$analytics(LoginEvents$EmailLoginSSOVerificationError self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.http_status != null) {
            output.B(serialDesc, 0, e79.a, self.http_status);
        }
        if (output.E(serialDesc) || self.server_error_type != null) {
            output.B(serialDesc, 1, srg.a, self.server_error_type);
        }
        if (output.E(serialDesc) || self.server_error_code != null) {
            output.B(serialDesc, 2, srg.a, self.server_error_code);
        }
        if (!output.E(serialDesc) && self.client_error_kind == null) {
            return;
        }
        output.B(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.client_error_kind);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getHttp_status() {
        return this.http_status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getServer_error_type() {
        return this.server_error_type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getServer_error_code() {
        return this.server_error_code;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final LoginEvents$LoginClientErrorKind getClient_error_kind() {
        return this.client_error_kind;
    }

    public final LoginEvents$EmailLoginSSOVerificationError copy(Integer http_status, String server_error_type, String server_error_code, LoginEvents$LoginClientErrorKind client_error_kind) {
        return new LoginEvents$EmailLoginSSOVerificationError(http_status, server_error_type, server_error_code, client_error_kind);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginEvents$EmailLoginSSOVerificationError)) {
            return false;
        }
        LoginEvents$EmailLoginSSOVerificationError loginEvents$EmailLoginSSOVerificationError = (LoginEvents$EmailLoginSSOVerificationError) other;
        return x44.r(this.http_status, loginEvents$EmailLoginSSOVerificationError.http_status) && x44.r(this.server_error_type, loginEvents$EmailLoginSSOVerificationError.server_error_type) && x44.r(this.server_error_code, loginEvents$EmailLoginSSOVerificationError.server_error_code) && this.client_error_kind == loginEvents$EmailLoginSSOVerificationError.client_error_kind;
    }

    public final LoginEvents$LoginClientErrorKind getClient_error_kind() {
        return this.client_error_kind;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile.login.email.sso_verification_error";
    }

    public final Integer getHttp_status() {
        return this.http_status;
    }

    public final String getServer_error_code() {
        return this.server_error_code;
    }

    public final String getServer_error_type() {
        return this.server_error_type;
    }

    public int hashCode() {
        Integer num = this.http_status;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.server_error_type;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.server_error_code;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LoginEvents$LoginClientErrorKind loginEvents$LoginClientErrorKind = this.client_error_kind;
        return iHashCode3 + (loginEvents$LoginClientErrorKind != null ? loginEvents$LoginClientErrorKind.hashCode() : 0);
    }

    public String toString() {
        return "EmailLoginSSOVerificationError(http_status=" + this.http_status + ", server_error_type=" + this.server_error_type + ", server_error_code=" + this.server_error_code + ", client_error_kind=" + this.client_error_kind + ")";
    }

    public LoginEvents$EmailLoginSSOVerificationError() {
        this((Integer) null, (String) null, (String) null, (LoginEvents$LoginClientErrorKind) null, 15, (mq5) null);
    }

    public LoginEvents$EmailLoginSSOVerificationError(Integer num, String str, String str2, LoginEvents$LoginClientErrorKind loginEvents$LoginClientErrorKind) {
        this.http_status = num;
        this.server_error_type = str;
        this.server_error_code = str2;
        this.client_error_kind = loginEvents$LoginClientErrorKind;
    }

    public /* synthetic */ LoginEvents$EmailLoginSSOVerificationError(Integer num, String str, String str2, LoginEvents$LoginClientErrorKind loginEvents$LoginClientErrorKind, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : loginEvents$LoginClientErrorKind);
    }
}
