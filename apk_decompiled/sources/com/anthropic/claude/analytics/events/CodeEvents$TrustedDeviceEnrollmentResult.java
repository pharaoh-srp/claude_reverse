package com.anthropic.claude.analytics.events;

import defpackage.ax3;
import defpackage.bx3;
import defpackage.fsh;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ<\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b-\u0010\u001aR\u0014\u0010/\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u001a¨\u00063"}, d2 = {"com/anthropic/claude/analytics/events/CodeEvents$TrustedDeviceEnrollmentResult", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "", "success", "error_code", "source", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/CodeEvents$TrustedDeviceEnrollmentResult;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/CodeEvents$TrustedDeviceEnrollmentResult;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/CodeEvents$TrustedDeviceEnrollmentResult;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "Z", "getSuccess", "getError_code", "getSource", "getEventName", "eventName", "Companion", "ax3", "bx3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CodeEvents$TrustedDeviceEnrollmentResult implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final bx3 Companion = new bx3();
    private final String error_code;
    private final String organization_uuid;
    private final String source;
    private final boolean success;

    public /* synthetic */ CodeEvents$TrustedDeviceEnrollmentResult(int i, String str, boolean z, String str2, String str3, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, ax3.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.success = z;
        if ((i & 4) == 0) {
            this.error_code = null;
        } else {
            this.error_code = str2;
        }
        if ((i & 8) == 0) {
            this.source = null;
        } else {
            this.source = str3;
        }
    }

    public static /* synthetic */ CodeEvents$TrustedDeviceEnrollmentResult copy$default(CodeEvents$TrustedDeviceEnrollmentResult codeEvents$TrustedDeviceEnrollmentResult, String str, boolean z, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = codeEvents$TrustedDeviceEnrollmentResult.organization_uuid;
        }
        if ((i & 2) != 0) {
            z = codeEvents$TrustedDeviceEnrollmentResult.success;
        }
        if ((i & 4) != 0) {
            str2 = codeEvents$TrustedDeviceEnrollmentResult.error_code;
        }
        if ((i & 8) != 0) {
            str3 = codeEvents$TrustedDeviceEnrollmentResult.source;
        }
        return codeEvents$TrustedDeviceEnrollmentResult.copy(str, z, str2, str3);
    }

    public static final /* synthetic */ void write$Self$analytics(CodeEvents$TrustedDeviceEnrollmentResult self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        output.p(serialDesc, 1, self.success);
        if (output.E(serialDesc) || self.error_code != null) {
            output.B(serialDesc, 2, srg.a, self.error_code);
        }
        if (!output.E(serialDesc) && self.source == null) {
            return;
        }
        output.B(serialDesc, 3, srg.a, self.source);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getError_code() {
        return this.error_code;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final CodeEvents$TrustedDeviceEnrollmentResult copy(String organization_uuid, boolean success, String error_code, String source) {
        organization_uuid.getClass();
        return new CodeEvents$TrustedDeviceEnrollmentResult(organization_uuid, success, error_code, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeEvents$TrustedDeviceEnrollmentResult)) {
            return false;
        }
        CodeEvents$TrustedDeviceEnrollmentResult codeEvents$TrustedDeviceEnrollmentResult = (CodeEvents$TrustedDeviceEnrollmentResult) other;
        return x44.r(this.organization_uuid, codeEvents$TrustedDeviceEnrollmentResult.organization_uuid) && this.success == codeEvents$TrustedDeviceEnrollmentResult.success && x44.r(this.error_code, codeEvents$TrustedDeviceEnrollmentResult.error_code) && x44.r(this.source, codeEvents$TrustedDeviceEnrollmentResult.source);
    }

    public final String getError_code() {
        return this.error_code;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_code_trusted_device_enrollment_result";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getSource() {
        return this.source;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int iP = fsh.p(this.organization_uuid.hashCode() * 31, 31, this.success);
        String str = this.error_code;
        int iHashCode = (iP + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.source;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.organization_uuid;
        boolean z = this.success;
        String str2 = this.error_code;
        String str3 = this.source;
        StringBuilder sb = new StringBuilder("TrustedDeviceEnrollmentResult(organization_uuid=");
        sb.append(str);
        sb.append(", success=");
        sb.append(z);
        sb.append(", error_code=");
        return vb7.t(sb, str2, ", source=", str3, ")");
    }

    public CodeEvents$TrustedDeviceEnrollmentResult(String str, boolean z, String str2, String str3) {
        str.getClass();
        this.organization_uuid = str;
        this.success = z;
        this.error_code = str2;
        this.source = str3;
    }

    public /* synthetic */ CodeEvents$TrustedDeviceEnrollmentResult(String str, boolean z, String str2, String str3, int i, mq5 mq5Var) {
        this(str, z, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
