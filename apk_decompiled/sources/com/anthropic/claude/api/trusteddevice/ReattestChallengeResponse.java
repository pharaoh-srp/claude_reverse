package com.anthropic.claude.api.trusteddevice;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.onf;
import defpackage.q5e;
import defpackage.r5e;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0016¨\u0006'"}, d2 = {"Lcom/anthropic/claude/api/trusteddevice/ReattestChallengeResponse;", "", "", "challenge_id", "nonce", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/trusteddevice/ReattestChallengeResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/trusteddevice/ReattestChallengeResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getChallenge_id", "getNonce", "Companion", "q5e", "r5e", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ReattestChallengeResponse {
    public static final int $stable = 0;
    public static final r5e Companion = new r5e();
    private final String challenge_id;
    private final String nonce;

    public /* synthetic */ ReattestChallengeResponse(int i, String str, String str2, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, q5e.a.getDescriptor());
            throw null;
        }
        this.challenge_id = str;
        this.nonce = str2;
    }

    public static /* synthetic */ ReattestChallengeResponse copy$default(ReattestChallengeResponse reattestChallengeResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reattestChallengeResponse.challenge_id;
        }
        if ((i & 2) != 0) {
            str2 = reattestChallengeResponse.nonce;
        }
        return reattestChallengeResponse.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$api(ReattestChallengeResponse self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.challenge_id);
        output.q(serialDesc, 1, self.nonce);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChallenge_id() {
        return this.challenge_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNonce() {
        return this.nonce;
    }

    public final ReattestChallengeResponse copy(String challenge_id, String nonce) {
        challenge_id.getClass();
        nonce.getClass();
        return new ReattestChallengeResponse(challenge_id, nonce);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReattestChallengeResponse)) {
            return false;
        }
        ReattestChallengeResponse reattestChallengeResponse = (ReattestChallengeResponse) other;
        return x44.r(this.challenge_id, reattestChallengeResponse.challenge_id) && x44.r(this.nonce, reattestChallengeResponse.nonce);
    }

    public final String getChallenge_id() {
        return this.challenge_id;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public int hashCode() {
        return this.nonce.hashCode() + (this.challenge_id.hashCode() * 31);
    }

    public String toString() {
        return ij0.l("ReattestChallengeResponse(challenge_id=", this.challenge_id, ", nonce=", this.nonce, ")");
    }

    public ReattestChallengeResponse(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.challenge_id = str;
        this.nonce = str2;
    }
}
