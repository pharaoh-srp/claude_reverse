package com.anthropic.claude.api.memory;

import defpackage.bc9;
import defpackage.kcb;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import java.util.Date;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B@\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u001f\b\u0002\u0010\n\u001a\u0019\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\u0004\b\u000b\u0010\fB9\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ'\u0010\u001e\u001a\u0019\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJI\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u001f\b\u0002\u0010\n\u001a\u0019\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001cR.\u0010\n\u001a\u0019\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010\u001f¨\u00061"}, d2 = {"Lcom/anthropic/claude/api/memory/MemorySynthesisResponse;", "", "", "memory", "user_instructions", "Ljava/util/Date;", "Lcom/anthropic/claude/api/Iso8601Date;", "Lonf;", "with", "Lbc9;", "updated_at", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Date;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/memory/MemorySynthesisResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Date;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)Lcom/anthropic/claude/api/memory/MemorySynthesisResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMemory", "getUser_instructions", "Ljava/util/Date;", "getUpdated_at", "Companion", "jcb", "kcb", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MemorySynthesisResponse {
    public static final int $stable = 0;
    public static final kcb Companion = new kcb();
    private final String memory;
    private final Date updated_at;
    private final String user_instructions;

    public /* synthetic */ MemorySynthesisResponse(int i, String str, String str2, Date date, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.memory = null;
        } else {
            this.memory = str;
        }
        if ((i & 2) == 0) {
            this.user_instructions = null;
        } else {
            this.user_instructions = str2;
        }
        if ((i & 4) == 0) {
            this.updated_at = null;
        } else {
            this.updated_at = date;
        }
    }

    public static /* synthetic */ MemorySynthesisResponse copy$default(MemorySynthesisResponse memorySynthesisResponse, String str, String str2, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            str = memorySynthesisResponse.memory;
        }
        if ((i & 2) != 0) {
            str2 = memorySynthesisResponse.user_instructions;
        }
        if ((i & 4) != 0) {
            date = memorySynthesisResponse.updated_at;
        }
        return memorySynthesisResponse.copy(str, str2, date);
    }

    public static final /* synthetic */ void write$Self$api(MemorySynthesisResponse self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.memory != null) {
            output.B(serialDesc, 0, srg.a, self.memory);
        }
        if (output.E(serialDesc) || self.user_instructions != null) {
            output.B(serialDesc, 1, srg.a, self.user_instructions);
        }
        if (!output.E(serialDesc) && self.updated_at == null) {
            return;
        }
        output.B(serialDesc, 2, bc9.a, self.updated_at);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMemory() {
        return this.memory;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUser_instructions() {
        return this.user_instructions;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getUpdated_at() {
        return this.updated_at;
    }

    public final MemorySynthesisResponse copy(String memory, String user_instructions, Date updated_at) {
        return new MemorySynthesisResponse(memory, user_instructions, updated_at);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MemorySynthesisResponse)) {
            return false;
        }
        MemorySynthesisResponse memorySynthesisResponse = (MemorySynthesisResponse) other;
        return x44.r(this.memory, memorySynthesisResponse.memory) && x44.r(this.user_instructions, memorySynthesisResponse.user_instructions) && x44.r(this.updated_at, memorySynthesisResponse.updated_at);
    }

    public final String getMemory() {
        return this.memory;
    }

    public final Date getUpdated_at() {
        return this.updated_at;
    }

    public final String getUser_instructions() {
        return this.user_instructions;
    }

    public int hashCode() {
        String str = this.memory;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.user_instructions;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Date date = this.updated_at;
        return iHashCode2 + (date != null ? date.hashCode() : 0);
    }

    public String toString() {
        String str = this.memory;
        String str2 = this.user_instructions;
        Date date = this.updated_at;
        StringBuilder sbR = kgh.r("MemorySynthesisResponse(memory=", str, ", user_instructions=", str2, ", updated_at=");
        sbR.append(date);
        sbR.append(")");
        return sbR.toString();
    }

    public MemorySynthesisResponse() {
        this((String) null, (String) null, (Date) null, 7, (mq5) null);
    }

    public MemorySynthesisResponse(String str, String str2, Date date) {
        this.memory = str;
        this.user_instructions = str2;
        this.updated_at = date;
    }

    public /* synthetic */ MemorySynthesisResponse(String str, String str2, Date date, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : date);
    }
}
