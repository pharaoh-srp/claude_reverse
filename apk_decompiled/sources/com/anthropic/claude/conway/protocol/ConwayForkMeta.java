package com.anthropic.claude.conway.protocol;

import com.anthropic.claude.api.login.VerifyResponse;
import com.anthropic.claude.types.strings.ForkId;
import defpackage.aw7;
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
import defpackage.xka;
import defpackage.xv4;
import defpackage.yv4;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@ABI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fBU\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\u001cJT\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010\u001cJ\u0010\u0010)\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\u001cR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010/\u0012\u0004\b4\u00102\u001a\u0004\b3\u0010\u001cR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00105\u0012\u0004\b7\u00102\u001a\u0004\b6\u0010 R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00108\u0012\u0004\b:\u00102\u001a\u0004\b9\u0010\"R\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010/\u0012\u0004\b<\u00102\u001a\u0004\b;\u0010\u001cR\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010/\u0012\u0004\b>\u00102\u001a\u0004\b=\u0010\u001c¨\u0006B"}, d2 = {"Lcom/anthropic/claude/conway/protocol/ConwayForkMeta;", "", "Lcom/anthropic/claude/types/strings/ForkId;", "agentId", "", "label", "", "createdAt", "lastActivityAt", "lastAssistantText", VerifyResponse.AuthenticationState.DISCRIMINATOR, "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/ConwayForkMeta;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-jXBynNE", "()Ljava/lang/String;", "component1", "component2", "component3", "()J", "component4", "()Ljava/lang/Long;", "component5", "component6", "copy-VyyBu6k", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/conway/protocol/ConwayForkMeta;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAgentId-jXBynNE", "getAgentId-jXBynNE$annotations", "()V", "getLabel", "getLabel$annotations", "J", "getCreatedAt", "getCreatedAt$annotations", "Ljava/lang/Long;", "getLastActivityAt", "getLastActivityAt$annotations", "getLastAssistantText", "getLastAssistantText$annotations", "getKind", "getKind$annotations", "Companion", "xv4", "yv4", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ConwayForkMeta {
    public static final int $stable = 0;
    public static final yv4 Companion = new yv4();
    private final String agentId;
    private final long createdAt;
    private final String kind;
    private final String label;
    private final Long lastActivityAt;
    private final String lastAssistantText;

    private /* synthetic */ ConwayForkMeta(int i, String str, String str2, long j, Long l, String str3, String str4, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, xv4.a.getDescriptor());
            throw null;
        }
        this.agentId = str;
        if ((i & 2) == 0) {
            this.label = null;
        } else {
            this.label = str2;
        }
        if ((i & 4) == 0) {
            this.createdAt = 0L;
        } else {
            this.createdAt = j;
        }
        if ((i & 8) == 0) {
            this.lastActivityAt = null;
        } else {
            this.lastActivityAt = l;
        }
        if ((i & 16) == 0) {
            this.lastAssistantText = null;
        } else {
            this.lastAssistantText = str3;
        }
        if ((i & 32) == 0) {
            this.kind = null;
        } else {
            this.kind = str4;
        }
    }

    /* JADX INFO: renamed from: copy-VyyBu6k$default, reason: not valid java name */
    public static /* synthetic */ ConwayForkMeta m733copyVyyBu6k$default(ConwayForkMeta conwayForkMeta, String str, String str2, long j, Long l, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conwayForkMeta.agentId;
        }
        if ((i & 2) != 0) {
            str2 = conwayForkMeta.label;
        }
        if ((i & 4) != 0) {
            j = conwayForkMeta.createdAt;
        }
        if ((i & 8) != 0) {
            l = conwayForkMeta.lastActivityAt;
        }
        if ((i & 16) != 0) {
            str3 = conwayForkMeta.lastAssistantText;
        }
        if ((i & 32) != 0) {
            str4 = conwayForkMeta.kind;
        }
        String str5 = str4;
        Long l2 = l;
        long j2 = j;
        return conwayForkMeta.m736copyVyyBu6k(str, str2, j2, l2, str3, str5);
    }

    /* JADX INFO: renamed from: getAgentId-jXBynNE$annotations, reason: not valid java name */
    public static /* synthetic */ void m734getAgentIdjXBynNE$annotations() {
    }

    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    public static /* synthetic */ void getKind$annotations() {
    }

    public static /* synthetic */ void getLabel$annotations() {
    }

    public static /* synthetic */ void getLastActivityAt$annotations() {
    }

    public static /* synthetic */ void getLastAssistantText$annotations() {
    }

    public static final /* synthetic */ void write$Self$conway(ConwayForkMeta self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, aw7.a, ForkId.m1021boximpl(self.agentId));
        if (output.E(serialDesc) || self.label != null) {
            output.B(serialDesc, 1, srg.a, self.label);
        }
        if (output.E(serialDesc) || self.createdAt != 0) {
            output.D(serialDesc, 2, self.createdAt);
        }
        if (output.E(serialDesc) || self.lastActivityAt != null) {
            output.B(serialDesc, 3, xka.a, self.lastActivityAt);
        }
        if (output.E(serialDesc) || self.lastAssistantText != null) {
            output.B(serialDesc, 4, srg.a, self.lastAssistantText);
        }
        if (!output.E(serialDesc) && self.kind == null) {
            return;
        }
        output.B(serialDesc, 5, srg.a, self.kind);
    }

    /* JADX INFO: renamed from: component1-jXBynNE, reason: not valid java name and from getter */
    public final String getAgentId() {
        return this.agentId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getLastActivityAt() {
        return this.lastActivityAt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLastAssistantText() {
        return this.lastAssistantText;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    /* JADX INFO: renamed from: copy-VyyBu6k, reason: not valid java name */
    public final ConwayForkMeta m736copyVyyBu6k(String agentId, String label, long createdAt, Long lastActivityAt, String lastAssistantText, String kind) {
        agentId.getClass();
        return new ConwayForkMeta(agentId, label, createdAt, lastActivityAt, lastAssistantText, kind, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConwayForkMeta)) {
            return false;
        }
        ConwayForkMeta conwayForkMeta = (ConwayForkMeta) other;
        return ForkId.m1024equalsimpl0(this.agentId, conwayForkMeta.agentId) && x44.r(this.label, conwayForkMeta.label) && this.createdAt == conwayForkMeta.createdAt && x44.r(this.lastActivityAt, conwayForkMeta.lastActivityAt) && x44.r(this.lastAssistantText, conwayForkMeta.lastAssistantText) && x44.r(this.kind, conwayForkMeta.kind);
    }

    /* JADX INFO: renamed from: getAgentId-jXBynNE, reason: not valid java name */
    public final String m737getAgentIdjXBynNE() {
        return this.agentId;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getLabel() {
        return this.label;
    }

    public final Long getLastActivityAt() {
        return this.lastActivityAt;
    }

    public final String getLastAssistantText() {
        return this.lastAssistantText;
    }

    public int hashCode() {
        int iM1025hashCodeimpl = ForkId.m1025hashCodeimpl(this.agentId) * 31;
        String str = this.label;
        int iE = vb7.e((iM1025hashCodeimpl + (str == null ? 0 : str.hashCode())) * 31, 31, this.createdAt);
        Long l = this.lastActivityAt;
        int iHashCode = (iE + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.lastAssistantText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.kind;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String strM1027toStringimpl = ForkId.m1027toStringimpl(this.agentId);
        String str = this.label;
        long j = this.createdAt;
        Long l = this.lastActivityAt;
        String str2 = this.lastAssistantText;
        String str3 = this.kind;
        StringBuilder sbR = kgh.r("ConwayForkMeta(agentId=", strM1027toStringimpl, ", label=", str, ", createdAt=");
        sbR.append(j);
        sbR.append(", lastActivityAt=");
        sbR.append(l);
        kgh.u(sbR, ", lastAssistantText=", str2, ", kind=", str3);
        sbR.append(")");
        return sbR.toString();
    }

    public /* synthetic */ ConwayForkMeta(String str, String str2, long j, Long l, String str3, String str4, mq5 mq5Var) {
        this(str, str2, j, l, str3, str4);
    }

    public /* synthetic */ ConwayForkMeta(int i, String str, String str2, long j, Long l, String str3, String str4, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, j, l, str3, str4, vnfVar);
    }

    private ConwayForkMeta(String str, String str2, long j, Long l, String str3, String str4) {
        str.getClass();
        this.agentId = str;
        this.label = str2;
        this.createdAt = j;
        this.lastActivityAt = l;
        this.lastAssistantText = str3;
        this.kind = str4;
    }

    public /* synthetic */ ConwayForkMeta(String str, String str2, long j, Long l, String str3, String str4, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, null);
    }
}
