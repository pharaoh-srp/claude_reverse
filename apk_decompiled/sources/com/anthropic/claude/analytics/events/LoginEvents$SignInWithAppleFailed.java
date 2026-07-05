package com.anthropic.claude.analytics.events;

import defpackage.e79;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mia;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.uia;
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
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:;BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JX\u0010$\u001a\u00020\u00112\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010\u001eJ\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b2\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b3\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b4\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010#R\u0014\u00108\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u001e¨\u0006<"}, d2 = {"com/anthropic/claude/analytics/events/LoginEvents$SignInWithAppleFailed", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "error_code", "", "error_domain", "http_status", "server_error_type", "server_error_code", "Lcom/anthropic/claude/analytics/events/LoginEvents$LoginClientErrorKind;", "client_error_kind", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/LoginEvents$LoginClientErrorKind;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/LoginEvents$LoginClientErrorKind;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/LoginEvents$SignInWithAppleFailed;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/LoginEvents$SignInWithAppleFailed;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Lcom/anthropic/claude/analytics/events/LoginEvents$LoginClientErrorKind;", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/LoginEvents$LoginClientErrorKind;)Lcom/anthropic/claude/analytics/events/LoginEvents$SignInWithAppleFailed;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getError_code", "Ljava/lang/String;", "getError_domain", "getHttp_status", "getServer_error_type", "getServer_error_code", "Lcom/anthropic/claude/analytics/events/LoginEvents$LoginClientErrorKind;", "getClient_error_kind", "getEventName", "eventName", "Companion", "tia", "uia", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class LoginEvents$SignInWithAppleFailed implements AnalyticsEvent {
    public static final int $stable = 0;
    private final LoginEvents$LoginClientErrorKind client_error_kind;
    private final Integer error_code;
    private final String error_domain;
    private final Integer http_status;
    private final String server_error_code;
    private final String server_error_type;
    public static final uia Companion = new uia();
    private static final kw9[] $childSerializers = {null, null, null, null, null, yb5.w(w1a.F, new mia(2))};

    public /* synthetic */ LoginEvents$SignInWithAppleFailed(int i, Integer num, String str, Integer num2, String str2, String str3, LoginEvents$LoginClientErrorKind loginEvents$LoginClientErrorKind, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.error_code = null;
        } else {
            this.error_code = num;
        }
        if ((i & 2) == 0) {
            this.error_domain = null;
        } else {
            this.error_domain = str;
        }
        if ((i & 4) == 0) {
            this.http_status = null;
        } else {
            this.http_status = num2;
        }
        if ((i & 8) == 0) {
            this.server_error_type = null;
        } else {
            this.server_error_type = str2;
        }
        if ((i & 16) == 0) {
            this.server_error_code = null;
        } else {
            this.server_error_code = str3;
        }
        if ((i & 32) == 0) {
            this.client_error_kind = null;
        } else {
            this.client_error_kind = loginEvents$LoginClientErrorKind;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return LoginEvents$LoginClientErrorKind.Companion.serializer();
    }

    public static /* synthetic */ LoginEvents$SignInWithAppleFailed copy$default(LoginEvents$SignInWithAppleFailed loginEvents$SignInWithAppleFailed, Integer num, String str, Integer num2, String str2, String str3, LoginEvents$LoginClientErrorKind loginEvents$LoginClientErrorKind, int i, Object obj) {
        if ((i & 1) != 0) {
            num = loginEvents$SignInWithAppleFailed.error_code;
        }
        if ((i & 2) != 0) {
            str = loginEvents$SignInWithAppleFailed.error_domain;
        }
        if ((i & 4) != 0) {
            num2 = loginEvents$SignInWithAppleFailed.http_status;
        }
        if ((i & 8) != 0) {
            str2 = loginEvents$SignInWithAppleFailed.server_error_type;
        }
        if ((i & 16) != 0) {
            str3 = loginEvents$SignInWithAppleFailed.server_error_code;
        }
        if ((i & 32) != 0) {
            loginEvents$LoginClientErrorKind = loginEvents$SignInWithAppleFailed.client_error_kind;
        }
        String str4 = str3;
        LoginEvents$LoginClientErrorKind loginEvents$LoginClientErrorKind2 = loginEvents$LoginClientErrorKind;
        return loginEvents$SignInWithAppleFailed.copy(num, str, num2, str2, str4, loginEvents$LoginClientErrorKind2);
    }

    public static final /* synthetic */ void write$Self$analytics(LoginEvents$SignInWithAppleFailed self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.error_code != null) {
            output.B(serialDesc, 0, e79.a, self.error_code);
        }
        if (output.E(serialDesc) || self.error_domain != null) {
            output.B(serialDesc, 1, srg.a, self.error_domain);
        }
        if (output.E(serialDesc) || self.http_status != null) {
            output.B(serialDesc, 2, e79.a, self.http_status);
        }
        if (output.E(serialDesc) || self.server_error_type != null) {
            output.B(serialDesc, 3, srg.a, self.server_error_type);
        }
        if (output.E(serialDesc) || self.server_error_code != null) {
            output.B(serialDesc, 4, srg.a, self.server_error_code);
        }
        if (!output.E(serialDesc) && self.client_error_kind == null) {
            return;
        }
        output.B(serialDesc, 5, (znf) kw9VarArr[5].getValue(), self.client_error_kind);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getError_code() {
        return this.error_code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getError_domain() {
        return this.error_domain;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getHttp_status() {
        return this.http_status;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getServer_error_type() {
        return this.server_error_type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getServer_error_code() {
        return this.server_error_code;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final LoginEvents$LoginClientErrorKind getClient_error_kind() {
        return this.client_error_kind;
    }

    public final LoginEvents$SignInWithAppleFailed copy(Integer error_code, String error_domain, Integer http_status, String server_error_type, String server_error_code, LoginEvents$LoginClientErrorKind client_error_kind) {
        return new LoginEvents$SignInWithAppleFailed(error_code, error_domain, http_status, server_error_type, server_error_code, client_error_kind);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginEvents$SignInWithAppleFailed)) {
            return false;
        }
        LoginEvents$SignInWithAppleFailed loginEvents$SignInWithAppleFailed = (LoginEvents$SignInWithAppleFailed) other;
        return x44.r(this.error_code, loginEvents$SignInWithAppleFailed.error_code) && x44.r(this.error_domain, loginEvents$SignInWithAppleFailed.error_domain) && x44.r(this.http_status, loginEvents$SignInWithAppleFailed.http_status) && x44.r(this.server_error_type, loginEvents$SignInWithAppleFailed.server_error_type) && x44.r(this.server_error_code, loginEvents$SignInWithAppleFailed.server_error_code) && this.client_error_kind == loginEvents$SignInWithAppleFailed.client_error_kind;
    }

    public final LoginEvents$LoginClientErrorKind getClient_error_kind() {
        return this.client_error_kind;
    }

    public final Integer getError_code() {
        return this.error_code;
    }

    public final String getError_domain() {
        return this.error_domain;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile.login.apple.failed";
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
        Integer num = this.error_code;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.error_domain;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.http_status;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.server_error_type;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.server_error_code;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        LoginEvents$LoginClientErrorKind loginEvents$LoginClientErrorKind = this.client_error_kind;
        return iHashCode5 + (loginEvents$LoginClientErrorKind != null ? loginEvents$LoginClientErrorKind.hashCode() : 0);
    }

    public String toString() {
        return "SignInWithAppleFailed(error_code=" + this.error_code + ", error_domain=" + this.error_domain + ", http_status=" + this.http_status + ", server_error_type=" + this.server_error_type + ", server_error_code=" + this.server_error_code + ", client_error_kind=" + this.client_error_kind + ")";
    }

    public LoginEvents$SignInWithAppleFailed() {
        this((Integer) null, (String) null, (Integer) null, (String) null, (String) null, (LoginEvents$LoginClientErrorKind) null, 63, (mq5) null);
    }

    public LoginEvents$SignInWithAppleFailed(Integer num, String str, Integer num2, String str2, String str3, LoginEvents$LoginClientErrorKind loginEvents$LoginClientErrorKind) {
        this.error_code = num;
        this.error_domain = str;
        this.http_status = num2;
        this.server_error_type = str2;
        this.server_error_code = str3;
        this.client_error_kind = loginEvents$LoginClientErrorKind;
    }

    public /* synthetic */ LoginEvents$SignInWithAppleFailed(Integer num, String str, Integer num2, String str2, String str3, LoginEvents$LoginClientErrorKind loginEvents$LoginClientErrorKind, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : loginEvents$LoginClientErrorKind);
    }
}
