package com.anthropic.claude.api.trusteddevice;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.uo6;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.vo6;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J>\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b)\u0010\u0018¨\u0006-"}, d2 = {"Lcom/anthropic/claude/api/trusteddevice/EnrollTrustedDeviceRequest;", "", "", "display_name", "device_public_key", "reattest_public_key", "platform", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/trusteddevice/EnrollTrustedDeviceRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/trusteddevice/EnrollTrustedDeviceRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDisplay_name", "getDevice_public_key", "getReattest_public_key", "getPlatform", "Companion", "uo6", "vo6", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class EnrollTrustedDeviceRequest {
    public static final int $stable = 0;
    public static final vo6 Companion = new vo6();
    private final String device_public_key;
    private final String display_name;
    private final String platform;
    private final String reattest_public_key;

    public /* synthetic */ EnrollTrustedDeviceRequest(int i, String str, String str2, String str3, String str4, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, uo6.a.getDescriptor());
            throw null;
        }
        this.display_name = str;
        if ((i & 2) == 0) {
            this.device_public_key = null;
        } else {
            this.device_public_key = str2;
        }
        if ((i & 4) == 0) {
            this.reattest_public_key = null;
        } else {
            this.reattest_public_key = str3;
        }
        if ((i & 8) == 0) {
            this.platform = null;
        } else {
            this.platform = str4;
        }
    }

    public static /* synthetic */ EnrollTrustedDeviceRequest copy$default(EnrollTrustedDeviceRequest enrollTrustedDeviceRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = enrollTrustedDeviceRequest.display_name;
        }
        if ((i & 2) != 0) {
            str2 = enrollTrustedDeviceRequest.device_public_key;
        }
        if ((i & 4) != 0) {
            str3 = enrollTrustedDeviceRequest.reattest_public_key;
        }
        if ((i & 8) != 0) {
            str4 = enrollTrustedDeviceRequest.platform;
        }
        return enrollTrustedDeviceRequest.copy(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$api(EnrollTrustedDeviceRequest self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.display_name);
        if (output.E(serialDesc) || self.device_public_key != null) {
            output.B(serialDesc, 1, srg.a, self.device_public_key);
        }
        if (output.E(serialDesc) || self.reattest_public_key != null) {
            output.B(serialDesc, 2, srg.a, self.reattest_public_key);
        }
        if (!output.E(serialDesc) && self.platform == null) {
            return;
        }
        output.B(serialDesc, 3, srg.a, self.platform);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDisplay_name() {
        return this.display_name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDevice_public_key() {
        return this.device_public_key;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getReattest_public_key() {
        return this.reattest_public_key;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    public final EnrollTrustedDeviceRequest copy(String display_name, String device_public_key, String reattest_public_key, String platform) {
        display_name.getClass();
        return new EnrollTrustedDeviceRequest(display_name, device_public_key, reattest_public_key, platform);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnrollTrustedDeviceRequest)) {
            return false;
        }
        EnrollTrustedDeviceRequest enrollTrustedDeviceRequest = (EnrollTrustedDeviceRequest) other;
        return x44.r(this.display_name, enrollTrustedDeviceRequest.display_name) && x44.r(this.device_public_key, enrollTrustedDeviceRequest.device_public_key) && x44.r(this.reattest_public_key, enrollTrustedDeviceRequest.reattest_public_key) && x44.r(this.platform, enrollTrustedDeviceRequest.platform);
    }

    public final String getDevice_public_key() {
        return this.device_public_key;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getReattest_public_key() {
        return this.reattest_public_key;
    }

    public int hashCode() {
        int iHashCode = this.display_name.hashCode() * 31;
        String str = this.device_public_key;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.reattest_public_key;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.platform;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.display_name;
        String str2 = this.device_public_key;
        return vb7.t(kgh.r("EnrollTrustedDeviceRequest(display_name=", str, ", device_public_key=", str2, ", reattest_public_key="), this.reattest_public_key, ", platform=", this.platform, ")");
    }

    public EnrollTrustedDeviceRequest(String str, String str2, String str3, String str4) {
        str.getClass();
        this.display_name = str;
        this.device_public_key = str2;
        this.reattest_public_key = str3;
        this.platform = str4;
    }

    public /* synthetic */ EnrollTrustedDeviceRequest(String str, String str2, String str3, String str4, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
