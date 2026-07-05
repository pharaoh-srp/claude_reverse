package com.anthropic.claude.conway.protocol;

import defpackage.grc;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qy1;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.xka;
import defpackage.xy4;
import defpackage.yy4;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001aJD\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b2\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b3\u0010\u001a¨\u00067"}, d2 = {"Lcom/anthropic/claude/conway/protocol/ConwaySearchHit;", "", "", "agentId", "", "seq", "timestamp", "role", "snippet", "<init>", "(Ljava/lang/String;Ljava/lang/Long;JLjava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Long;JLjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/ConwaySearchHit;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Long;", "component3", "()J", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Long;JLjava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/conway/protocol/ConwaySearchHit;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAgentId", "getAgentId$annotations", "()V", "Ljava/lang/Long;", "getSeq", "J", "getTimestamp", "getRole", "getSnippet", "Companion", "xy4", "yy4", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ConwaySearchHit {
    public static final int $stable = 0;
    public static final yy4 Companion = new yy4();
    private final String agentId;
    private final String role;
    private final Long seq;
    private final String snippet;
    private final long timestamp;

    public /* synthetic */ ConwaySearchHit(int i, String str, Long l, long j, String str2, String str3, vnf vnfVar) {
        if (28 != (i & 28)) {
            gvj.f(i, 28, xy4.a.getDescriptor());
            throw null;
        }
        this.agentId = (i & 1) == 0 ? "main" : str;
        if ((i & 2) == 0) {
            this.seq = null;
        } else {
            this.seq = l;
        }
        this.timestamp = j;
        this.role = str2;
        this.snippet = str3;
    }

    public static /* synthetic */ ConwaySearchHit copy$default(ConwaySearchHit conwaySearchHit, String str, Long l, long j, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conwaySearchHit.agentId;
        }
        if ((i & 2) != 0) {
            l = conwaySearchHit.seq;
        }
        if ((i & 4) != 0) {
            j = conwaySearchHit.timestamp;
        }
        if ((i & 8) != 0) {
            str2 = conwaySearchHit.role;
        }
        if ((i & 16) != 0) {
            str3 = conwaySearchHit.snippet;
        }
        long j2 = j;
        return conwaySearchHit.copy(str, l, j2, str2, str3);
    }

    public static /* synthetic */ void getAgentId$annotations() {
    }

    public static final /* synthetic */ void write$Self$conway(ConwaySearchHit self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || !x44.r(self.agentId, "main")) {
            output.q(serialDesc, 0, self.agentId);
        }
        if (output.E(serialDesc) || self.seq != null) {
            output.B(serialDesc, 1, xka.a, self.seq);
        }
        output.D(serialDesc, 2, self.timestamp);
        output.q(serialDesc, 3, self.role);
        output.q(serialDesc, 4, self.snippet);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAgentId() {
        return this.agentId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getSeq() {
        return this.seq;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSnippet() {
        return this.snippet;
    }

    public final ConwaySearchHit copy(String agentId, Long seq, long timestamp, String role, String snippet) {
        agentId.getClass();
        role.getClass();
        snippet.getClass();
        return new ConwaySearchHit(agentId, seq, timestamp, role, snippet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConwaySearchHit)) {
            return false;
        }
        ConwaySearchHit conwaySearchHit = (ConwaySearchHit) other;
        return x44.r(this.agentId, conwaySearchHit.agentId) && x44.r(this.seq, conwaySearchHit.seq) && this.timestamp == conwaySearchHit.timestamp && x44.r(this.role, conwaySearchHit.role) && x44.r(this.snippet, conwaySearchHit.snippet);
    }

    public final String getAgentId() {
        return this.agentId;
    }

    public final String getRole() {
        return this.role;
    }

    public final Long getSeq() {
        return this.seq;
    }

    public final String getSnippet() {
        return this.snippet;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = this.agentId.hashCode() * 31;
        Long l = this.seq;
        return this.snippet.hashCode() + kgh.l(vb7.e((iHashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.timestamp), 31, this.role);
    }

    public String toString() {
        String str = this.agentId;
        Long l = this.seq;
        long j = this.timestamp;
        String str2 = this.role;
        String str3 = this.snippet;
        StringBuilder sb = new StringBuilder("ConwaySearchHit(agentId=");
        sb.append(str);
        sb.append(", seq=");
        sb.append(l);
        sb.append(", timestamp=");
        qy1.m(j, ", role=", str2, sb);
        return kgh.q(sb, ", snippet=", str3, ")");
    }

    public ConwaySearchHit(String str, Long l, long j, String str2, String str3) {
        grc.B(str, str2, str3);
        this.agentId = str;
        this.seq = l;
        this.timestamp = j;
        this.role = str2;
        this.snippet = str3;
    }

    public /* synthetic */ ConwaySearchHit(String str, Long l, long j, String str2, String str3, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? "main" : str, (i & 2) != 0 ? null : l, j, str2, str3);
    }
}
