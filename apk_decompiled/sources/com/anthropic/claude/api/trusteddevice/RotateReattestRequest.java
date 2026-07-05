package com.anthropic.claude.api.trusteddevice;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.mve;
import defpackage.nve;
import defpackage.onf;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000278BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fB_\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJZ\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b1\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b2\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b3\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b4\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b5\u0010\u001c¨\u00069"}, d2 = {"Lcom/anthropic/claude/api/trusteddevice/RotateReattestRequest;", "", "", "new_reattest_public_key", "", "device_binding_timestamp", "device_binding_signature", "predecessor_kid", "device_binding_kid", "platform", "attestation_blob", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/trusteddevice/RotateReattestRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/trusteddevice/RotateReattestRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNew_reattest_public_key", "J", "getDevice_binding_timestamp", "getDevice_binding_signature", "getPredecessor_kid", "getDevice_binding_kid", "getPlatform", "getAttestation_blob", "Companion", "mve", "nve", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class RotateReattestRequest {
    public static final int $stable = 0;
    public static final nve Companion = new nve();
    private final String attestation_blob;
    private final String device_binding_kid;
    private final String device_binding_signature;
    private final long device_binding_timestamp;
    private final String new_reattest_public_key;
    private final String platform;
    private final String predecessor_kid;

    public /* synthetic */ RotateReattestRequest(int i, String str, long j, String str2, String str3, String str4, String str5, String str6, vnf vnfVar) {
        if (103 != (i & 103)) {
            gvj.f(i, 103, mve.a.getDescriptor());
            throw null;
        }
        this.new_reattest_public_key = str;
        this.device_binding_timestamp = j;
        this.device_binding_signature = str2;
        if ((i & 8) == 0) {
            this.predecessor_kid = null;
        } else {
            this.predecessor_kid = str3;
        }
        if ((i & 16) == 0) {
            this.device_binding_kid = null;
        } else {
            this.device_binding_kid = str4;
        }
        this.platform = str5;
        this.attestation_blob = str6;
    }

    public static /* synthetic */ RotateReattestRequest copy$default(RotateReattestRequest rotateReattestRequest, String str, long j, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rotateReattestRequest.new_reattest_public_key;
        }
        if ((i & 2) != 0) {
            j = rotateReattestRequest.device_binding_timestamp;
        }
        if ((i & 4) != 0) {
            str2 = rotateReattestRequest.device_binding_signature;
        }
        if ((i & 8) != 0) {
            str3 = rotateReattestRequest.predecessor_kid;
        }
        if ((i & 16) != 0) {
            str4 = rotateReattestRequest.device_binding_kid;
        }
        if ((i & 32) != 0) {
            str5 = rotateReattestRequest.platform;
        }
        if ((i & 64) != 0) {
            str6 = rotateReattestRequest.attestation_blob;
        }
        String str7 = str6;
        String str8 = str4;
        String str9 = str2;
        return rotateReattestRequest.copy(str, j, str9, str3, str8, str5, str7);
    }

    public static final /* synthetic */ void write$Self$api(RotateReattestRequest self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.new_reattest_public_key);
        output.D(serialDesc, 1, self.device_binding_timestamp);
        output.q(serialDesc, 2, self.device_binding_signature);
        if (output.E(serialDesc) || self.predecessor_kid != null) {
            output.B(serialDesc, 3, srg.a, self.predecessor_kid);
        }
        if (output.E(serialDesc) || self.device_binding_kid != null) {
            output.B(serialDesc, 4, srg.a, self.device_binding_kid);
        }
        output.q(serialDesc, 5, self.platform);
        output.q(serialDesc, 6, self.attestation_blob);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNew_reattest_public_key() {
        return this.new_reattest_public_key;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getDevice_binding_timestamp() {
        return this.device_binding_timestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDevice_binding_signature() {
        return this.device_binding_signature;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPredecessor_kid() {
        return this.predecessor_kid;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDevice_binding_kid() {
        return this.device_binding_kid;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAttestation_blob() {
        return this.attestation_blob;
    }

    public final RotateReattestRequest copy(String new_reattest_public_key, long device_binding_timestamp, String device_binding_signature, String predecessor_kid, String device_binding_kid, String platform, String attestation_blob) {
        new_reattest_public_key.getClass();
        device_binding_signature.getClass();
        platform.getClass();
        attestation_blob.getClass();
        return new RotateReattestRequest(new_reattest_public_key, device_binding_timestamp, device_binding_signature, predecessor_kid, device_binding_kid, platform, attestation_blob);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RotateReattestRequest)) {
            return false;
        }
        RotateReattestRequest rotateReattestRequest = (RotateReattestRequest) other;
        return x44.r(this.new_reattest_public_key, rotateReattestRequest.new_reattest_public_key) && this.device_binding_timestamp == rotateReattestRequest.device_binding_timestamp && x44.r(this.device_binding_signature, rotateReattestRequest.device_binding_signature) && x44.r(this.predecessor_kid, rotateReattestRequest.predecessor_kid) && x44.r(this.device_binding_kid, rotateReattestRequest.device_binding_kid) && x44.r(this.platform, rotateReattestRequest.platform) && x44.r(this.attestation_blob, rotateReattestRequest.attestation_blob);
    }

    public final String getAttestation_blob() {
        return this.attestation_blob;
    }

    public final String getDevice_binding_kid() {
        return this.device_binding_kid;
    }

    public final String getDevice_binding_signature() {
        return this.device_binding_signature;
    }

    public final long getDevice_binding_timestamp() {
        return this.device_binding_timestamp;
    }

    public final String getNew_reattest_public_key() {
        return this.new_reattest_public_key;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getPredecessor_kid() {
        return this.predecessor_kid;
    }

    public int hashCode() {
        int iL = kgh.l(vb7.e(this.new_reattest_public_key.hashCode() * 31, 31, this.device_binding_timestamp), 31, this.device_binding_signature);
        String str = this.predecessor_kid;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.device_binding_kid;
        return this.attestation_blob.hashCode() + kgh.l((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.platform);
    }

    public String toString() {
        String str = this.new_reattest_public_key;
        long j = this.device_binding_timestamp;
        String str2 = this.device_binding_signature;
        String str3 = this.predecessor_kid;
        String str4 = this.device_binding_kid;
        String str5 = this.platform;
        String str6 = this.attestation_blob;
        StringBuilder sbW = vb7.w("RotateReattestRequest(new_reattest_public_key=", str, ", device_binding_timestamp=", j);
        kgh.u(sbW, ", device_binding_signature=", str2, ", predecessor_kid=", str3);
        kgh.u(sbW, ", device_binding_kid=", str4, ", platform=", str5);
        return kgh.q(sbW, ", attestation_blob=", str6, ")");
    }

    public RotateReattestRequest(String str, long j, String str2, String str3, String str4, String str5, String str6) {
        ij0.z(str, str2, str5, str6);
        this.new_reattest_public_key = str;
        this.device_binding_timestamp = j;
        this.device_binding_signature = str2;
        this.predecessor_kid = str3;
        this.device_binding_kid = str4;
        this.platform = str5;
        this.attestation_blob = str6;
    }

    public /* synthetic */ RotateReattestRequest(String str, long j, String str2, String str3, String str4, String str5, String str6, int i, mq5 mq5Var) {
        this(str, j, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, str5, str6);
    }
}
