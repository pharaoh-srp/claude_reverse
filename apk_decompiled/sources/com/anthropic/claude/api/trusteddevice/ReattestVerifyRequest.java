package com.anthropic.claude.api.trusteddevice;

import defpackage.a6e;
import defpackage.b6e;
import defpackage.grc;
import defpackage.gvj;
import defpackage.kgh;
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

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J:\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b)\u0010\u0018¨\u0006-"}, d2 = {"Lcom/anthropic/claude/api/trusteddevice/ReattestVerifyRequest;", "", "", "challenge_id", "trusted_device_id", "signature", "kid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/trusteddevice/ReattestVerifyRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/trusteddevice/ReattestVerifyRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getChallenge_id", "getTrusted_device_id", "getSignature", "getKid", "Companion", "a6e", "b6e", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ReattestVerifyRequest {
    public static final int $stable = 0;
    public static final b6e Companion = new b6e();
    private final String challenge_id;
    private final String kid;
    private final String signature;
    private final String trusted_device_id;

    public /* synthetic */ ReattestVerifyRequest(int i, String str, String str2, String str3, String str4, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, a6e.a.getDescriptor());
            throw null;
        }
        this.challenge_id = str;
        this.trusted_device_id = str2;
        this.signature = str3;
        if ((i & 8) == 0) {
            this.kid = null;
        } else {
            this.kid = str4;
        }
    }

    public static /* synthetic */ ReattestVerifyRequest copy$default(ReattestVerifyRequest reattestVerifyRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reattestVerifyRequest.challenge_id;
        }
        if ((i & 2) != 0) {
            str2 = reattestVerifyRequest.trusted_device_id;
        }
        if ((i & 4) != 0) {
            str3 = reattestVerifyRequest.signature;
        }
        if ((i & 8) != 0) {
            str4 = reattestVerifyRequest.kid;
        }
        return reattestVerifyRequest.copy(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$api(ReattestVerifyRequest self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.challenge_id);
        output.q(serialDesc, 1, self.trusted_device_id);
        output.q(serialDesc, 2, self.signature);
        if (!output.E(serialDesc) && self.kid == null) {
            return;
        }
        output.B(serialDesc, 3, srg.a, self.kid);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChallenge_id() {
        return this.challenge_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTrusted_device_id() {
        return this.trusted_device_id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getKid() {
        return this.kid;
    }

    public final ReattestVerifyRequest copy(String challenge_id, String trusted_device_id, String signature, String kid) {
        challenge_id.getClass();
        trusted_device_id.getClass();
        signature.getClass();
        return new ReattestVerifyRequest(challenge_id, trusted_device_id, signature, kid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReattestVerifyRequest)) {
            return false;
        }
        ReattestVerifyRequest reattestVerifyRequest = (ReattestVerifyRequest) other;
        return x44.r(this.challenge_id, reattestVerifyRequest.challenge_id) && x44.r(this.trusted_device_id, reattestVerifyRequest.trusted_device_id) && x44.r(this.signature, reattestVerifyRequest.signature) && x44.r(this.kid, reattestVerifyRequest.kid);
    }

    public final String getChallenge_id() {
        return this.challenge_id;
    }

    public final String getKid() {
        return this.kid;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final String getTrusted_device_id() {
        return this.trusted_device_id;
    }

    public int hashCode() {
        int iL = kgh.l(kgh.l(this.challenge_id.hashCode() * 31, 31, this.trusted_device_id), 31, this.signature);
        String str = this.kid;
        return iL + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.challenge_id;
        String str2 = this.trusted_device_id;
        return vb7.t(kgh.r("ReattestVerifyRequest(challenge_id=", str, ", trusted_device_id=", str2, ", signature="), this.signature, ", kid=", this.kid, ")");
    }

    public ReattestVerifyRequest(String str, String str2, String str3, String str4) {
        grc.B(str, str2, str3);
        this.challenge_id = str;
        this.trusted_device_id = str2;
        this.signature = str3;
        this.kid = str4;
    }

    public /* synthetic */ ReattestVerifyRequest(String str, String str2, String str3, String str4, int i, mq5 mq5Var) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4);
    }
}
