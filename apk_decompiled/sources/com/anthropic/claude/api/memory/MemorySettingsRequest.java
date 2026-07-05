package com.anthropic.claude.api.memory;

import defpackage.dcb;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lcom/anthropic/claude/api/memory/MemorySettingsRequest;", "", "", "enabled_melange", "enabled_saffron", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/memory/MemorySettingsRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/anthropic/claude/api/memory/MemorySettingsRequest;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getEnabled_melange", "getEnabled_saffron", "Companion", "ccb", "dcb", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MemorySettingsRequest {
    public static final int $stable = 0;
    public static final dcb Companion = new dcb();
    private final Boolean enabled_melange;
    private final Boolean enabled_saffron;

    public /* synthetic */ MemorySettingsRequest(int i, Boolean bool, Boolean bool2, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.enabled_melange = null;
        } else {
            this.enabled_melange = bool;
        }
        if ((i & 2) == 0) {
            this.enabled_saffron = null;
        } else {
            this.enabled_saffron = bool2;
        }
    }

    public static /* synthetic */ MemorySettingsRequest copy$default(MemorySettingsRequest memorySettingsRequest, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = memorySettingsRequest.enabled_melange;
        }
        if ((i & 2) != 0) {
            bool2 = memorySettingsRequest.enabled_saffron;
        }
        return memorySettingsRequest.copy(bool, bool2);
    }

    public static final /* synthetic */ void write$Self$api(MemorySettingsRequest self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.enabled_melange != null) {
            output.B(serialDesc, 0, zt1.a, self.enabled_melange);
        }
        if (!output.E(serialDesc) && self.enabled_saffron == null) {
            return;
        }
        output.B(serialDesc, 1, zt1.a, self.enabled_saffron);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getEnabled_melange() {
        return this.enabled_melange;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getEnabled_saffron() {
        return this.enabled_saffron;
    }

    public final MemorySettingsRequest copy(Boolean enabled_melange, Boolean enabled_saffron) {
        return new MemorySettingsRequest(enabled_melange, enabled_saffron);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MemorySettingsRequest)) {
            return false;
        }
        MemorySettingsRequest memorySettingsRequest = (MemorySettingsRequest) other;
        return x44.r(this.enabled_melange, memorySettingsRequest.enabled_melange) && x44.r(this.enabled_saffron, memorySettingsRequest.enabled_saffron);
    }

    public final Boolean getEnabled_melange() {
        return this.enabled_melange;
    }

    public final Boolean getEnabled_saffron() {
        return this.enabled_saffron;
    }

    public int hashCode() {
        Boolean bool = this.enabled_melange;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.enabled_saffron;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "MemorySettingsRequest(enabled_melange=" + this.enabled_melange + ", enabled_saffron=" + this.enabled_saffron + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MemorySettingsRequest() {
        this((Boolean) null, (Boolean) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
    }

    public MemorySettingsRequest(Boolean bool, Boolean bool2) {
        this.enabled_melange = bool;
        this.enabled_saffron = bool2;
    }

    public /* synthetic */ MemorySettingsRequest(Boolean bool, Boolean bool2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2);
    }
}
