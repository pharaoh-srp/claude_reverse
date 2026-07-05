package com.anthropic.claude.conway.protocol;

import com.anthropic.claude.types.strings.ForkId;
import defpackage.a75;
import defpackage.aw7;
import defpackage.grc;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.z65;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ0\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u00060"}, d2 = {"Lcom/anthropic/claude/conway/protocol/CreateForkResponse;", "", "Lcom/anthropic/claude/types/strings/ForkId;", "agentId", "", "label", "", "createdAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;JLvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/CreateForkResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-jXBynNE", "()Ljava/lang/String;", "component1", "component2", "component3", "()J", "copy-DVNocAw", "(Ljava/lang/String;Ljava/lang/String;J)Lcom/anthropic/claude/conway/protocol/CreateForkResponse;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAgentId-jXBynNE", "getLabel", "J", "getCreatedAt", "Companion", "z65", "a75", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CreateForkResponse {
    public static final int $stable = 0;
    public static final a75 Companion = new a75();
    private final String agentId;
    private final long createdAt;
    private final String label;

    private /* synthetic */ CreateForkResponse(int i, String str, String str2, long j, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, z65.a.getDescriptor());
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
    }

    /* JADX INFO: renamed from: copy-DVNocAw$default, reason: not valid java name */
    public static /* synthetic */ CreateForkResponse m738copyDVNocAw$default(CreateForkResponse createForkResponse, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createForkResponse.agentId;
        }
        if ((i & 2) != 0) {
            str2 = createForkResponse.label;
        }
        if ((i & 4) != 0) {
            j = createForkResponse.createdAt;
        }
        return createForkResponse.m740copyDVNocAw(str, str2, j);
    }

    public static final /* synthetic */ void write$Self$conway(CreateForkResponse self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, aw7.a, ForkId.m1021boximpl(self.agentId));
        if (output.E(serialDesc) || self.label != null) {
            output.B(serialDesc, 1, srg.a, self.label);
        }
        if (!output.E(serialDesc) && self.createdAt == 0) {
            return;
        }
        output.D(serialDesc, 2, self.createdAt);
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

    /* JADX INFO: renamed from: copy-DVNocAw, reason: not valid java name */
    public final CreateForkResponse m740copyDVNocAw(String agentId, String label, long createdAt) {
        agentId.getClass();
        return new CreateForkResponse(agentId, label, createdAt, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateForkResponse)) {
            return false;
        }
        CreateForkResponse createForkResponse = (CreateForkResponse) other;
        return ForkId.m1024equalsimpl0(this.agentId, createForkResponse.agentId) && x44.r(this.label, createForkResponse.label) && this.createdAt == createForkResponse.createdAt;
    }

    /* JADX INFO: renamed from: getAgentId-jXBynNE, reason: not valid java name */
    public final String m741getAgentIdjXBynNE() {
        return this.agentId;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        int iM1025hashCodeimpl = ForkId.m1025hashCodeimpl(this.agentId) * 31;
        String str = this.label;
        return Long.hashCode(this.createdAt) + ((iM1025hashCodeimpl + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        return grc.r(this.createdAt, ")", kgh.r("CreateForkResponse(agentId=", ForkId.m1027toStringimpl(this.agentId), ", label=", this.label, ", createdAt="));
    }

    public /* synthetic */ CreateForkResponse(String str, String str2, long j, mq5 mq5Var) {
        this(str, str2, j);
    }

    public /* synthetic */ CreateForkResponse(int i, String str, String str2, long j, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, j, vnfVar);
    }

    private CreateForkResponse(String str, String str2, long j) {
        str.getClass();
        this.agentId = str;
        this.label = str2;
        this.createdAt = j;
    }

    public /* synthetic */ CreateForkResponse(String str, String str2, long j, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? 0L : j, null);
    }
}
