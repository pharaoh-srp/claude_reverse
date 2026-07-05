package com.anthropic.claude.api.trusteddevice;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.wo6;
import defpackage.x44;
import defpackage.xo6;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J>\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b)\u0010\u0018¨\u0006-"}, d2 = {"Lcom/anthropic/claude/api/trusteddevice/EnrollTrustedDeviceResponse;", "", "", "device_id", "device_token", "reattest_kid", "device_binding_kid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/trusteddevice/EnrollTrustedDeviceResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/trusteddevice/EnrollTrustedDeviceResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDevice_id", "getDevice_token", "getReattest_kid", "getDevice_binding_kid", "Companion", "wo6", "xo6", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class EnrollTrustedDeviceResponse {
    public static final int $stable = 0;
    public static final xo6 Companion = new xo6();
    private final String device_binding_kid;
    private final String device_id;
    private final String device_token;
    private final String reattest_kid;

    public /* synthetic */ EnrollTrustedDeviceResponse(int i, String str, String str2, String str3, String str4, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, wo6.a.getDescriptor());
            throw null;
        }
        this.device_id = str;
        if ((i & 2) == 0) {
            this.device_token = null;
        } else {
            this.device_token = str2;
        }
        if ((i & 4) == 0) {
            this.reattest_kid = null;
        } else {
            this.reattest_kid = str3;
        }
        if ((i & 8) == 0) {
            this.device_binding_kid = null;
        } else {
            this.device_binding_kid = str4;
        }
    }

    public static /* synthetic */ EnrollTrustedDeviceResponse copy$default(EnrollTrustedDeviceResponse enrollTrustedDeviceResponse, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = enrollTrustedDeviceResponse.device_id;
        }
        if ((i & 2) != 0) {
            str2 = enrollTrustedDeviceResponse.device_token;
        }
        if ((i & 4) != 0) {
            str3 = enrollTrustedDeviceResponse.reattest_kid;
        }
        if ((i & 8) != 0) {
            str4 = enrollTrustedDeviceResponse.device_binding_kid;
        }
        return enrollTrustedDeviceResponse.copy(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$api(EnrollTrustedDeviceResponse self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.device_id);
        if (output.E(serialDesc) || self.device_token != null) {
            output.B(serialDesc, 1, srg.a, self.device_token);
        }
        if (output.E(serialDesc) || self.reattest_kid != null) {
            output.B(serialDesc, 2, srg.a, self.reattest_kid);
        }
        if (!output.E(serialDesc) && self.device_binding_kid == null) {
            return;
        }
        output.B(serialDesc, 3, srg.a, self.device_binding_kid);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDevice_id() {
        return this.device_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDevice_token() {
        return this.device_token;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getReattest_kid() {
        return this.reattest_kid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDevice_binding_kid() {
        return this.device_binding_kid;
    }

    public final EnrollTrustedDeviceResponse copy(String device_id, String device_token, String reattest_kid, String device_binding_kid) {
        device_id.getClass();
        return new EnrollTrustedDeviceResponse(device_id, device_token, reattest_kid, device_binding_kid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnrollTrustedDeviceResponse)) {
            return false;
        }
        EnrollTrustedDeviceResponse enrollTrustedDeviceResponse = (EnrollTrustedDeviceResponse) other;
        return x44.r(this.device_id, enrollTrustedDeviceResponse.device_id) && x44.r(this.device_token, enrollTrustedDeviceResponse.device_token) && x44.r(this.reattest_kid, enrollTrustedDeviceResponse.reattest_kid) && x44.r(this.device_binding_kid, enrollTrustedDeviceResponse.device_binding_kid);
    }

    public final String getDevice_binding_kid() {
        return this.device_binding_kid;
    }

    public final String getDevice_id() {
        return this.device_id;
    }

    public final String getDevice_token() {
        return this.device_token;
    }

    public final String getReattest_kid() {
        return this.reattest_kid;
    }

    public int hashCode() {
        int iHashCode = this.device_id.hashCode() * 31;
        String str = this.device_token;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.reattest_kid;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.device_binding_kid;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.device_id;
        String str2 = this.device_token;
        return vb7.t(kgh.r("EnrollTrustedDeviceResponse(device_id=", str, ", device_token=", str2, ", reattest_kid="), this.reattest_kid, ", device_binding_kid=", this.device_binding_kid, ")");
    }

    public EnrollTrustedDeviceResponse(String str, String str2, String str3, String str4) {
        str.getClass();
        this.device_id = str;
        this.device_token = str2;
        this.reattest_kid = str3;
        this.device_binding_kid = str4;
    }

    public /* synthetic */ EnrollTrustedDeviceResponse(String str, String str2, String str3, String str4, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
