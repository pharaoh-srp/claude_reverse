package com.anthropic.claude.conway.protocol;

import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.skb;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Lcom/anthropic/claude/conway/protocol/MintTokenResponse;", "", "", "jwt", "", "expiresAt", "<init>", "(Ljava/lang/String;J)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;JLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/MintTokenResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()J", "copy", "(Ljava/lang/String;J)Lcom/anthropic/claude/conway/protocol/MintTokenResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getJwt", "J", "getExpiresAt", "Companion", "rkb", "skb", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MintTokenResponse {
    public static final int $stable = 0;
    public static final skb Companion = new skb();
    private final long expiresAt;
    private final String jwt;

    public /* synthetic */ MintTokenResponse(int i, String str, long j, vnf vnfVar) {
        this.jwt = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.expiresAt = 0L;
        } else {
            this.expiresAt = j;
        }
    }

    public static /* synthetic */ MintTokenResponse copy$default(MintTokenResponse mintTokenResponse, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mintTokenResponse.jwt;
        }
        if ((i & 2) != 0) {
            j = mintTokenResponse.expiresAt;
        }
        return mintTokenResponse.copy(str, j);
    }

    public static final /* synthetic */ void write$Self$conway(MintTokenResponse self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || !x44.r(self.jwt, "")) {
            output.q(serialDesc, 0, self.jwt);
        }
        if (!output.E(serialDesc) && self.expiresAt == 0) {
            return;
        }
        output.D(serialDesc, 1, self.expiresAt);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getJwt() {
        return this.jwt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getExpiresAt() {
        return this.expiresAt;
    }

    public final MintTokenResponse copy(String jwt, long expiresAt) {
        jwt.getClass();
        return new MintTokenResponse(jwt, expiresAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MintTokenResponse)) {
            return false;
        }
        MintTokenResponse mintTokenResponse = (MintTokenResponse) other;
        return x44.r(this.jwt, mintTokenResponse.jwt) && this.expiresAt == mintTokenResponse.expiresAt;
    }

    public final long getExpiresAt() {
        return this.expiresAt;
    }

    public final String getJwt() {
        return this.jwt;
    }

    public int hashCode() {
        return Long.hashCode(this.expiresAt) + (this.jwt.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sbW = vb7.w("MintTokenResponse(jwt=", this.jwt, ", expiresAt=", this.expiresAt);
        sbW.append(")");
        return sbW.toString();
    }

    public MintTokenResponse() {
        this((String) null, 0L, 3, (mq5) null);
    }

    public MintTokenResponse(String str, long j) {
        str.getClass();
        this.jwt = str;
        this.expiresAt = j;
    }

    public /* synthetic */ MintTokenResponse(String str, long j, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j);
    }
}
