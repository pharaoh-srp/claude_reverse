package com.anthropic.claude.api.memory;

import com.anthropic.claude.api.account.MemoryMode;
import defpackage.fcb;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.xbb;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ@\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001d¨\u00061"}, d2 = {"Lcom/anthropic/claude/api/memory/MemorySettingsResponse;", "", "", "enabled_melange", "enabled_saffron", "enabled_saffron_search", "Lcom/anthropic/claude/api/account/MemoryMode;", "memory_mode", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/anthropic/claude/api/account/MemoryMode;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/anthropic/claude/api/account/MemoryMode;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/memory/MemorySettingsResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "component4", "()Lcom/anthropic/claude/api/account/MemoryMode;", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/anthropic/claude/api/account/MemoryMode;)Lcom/anthropic/claude/api/memory/MemorySettingsResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getEnabled_melange", "getEnabled_saffron", "getEnabled_saffron_search", "Lcom/anthropic/claude/api/account/MemoryMode;", "getMemory_mode", "Companion", "ecb", "fcb", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MemorySettingsResponse {
    public static final int $stable = 0;
    public static final fcb Companion = new fcb();
    private final Boolean enabled_melange;
    private final Boolean enabled_saffron;
    private final Boolean enabled_saffron_search;
    private final MemoryMode memory_mode;

    public /* synthetic */ MemorySettingsResponse(int i, Boolean bool, Boolean bool2, Boolean bool3, MemoryMode memoryMode, vnf vnfVar) {
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
        if ((i & 4) == 0) {
            this.enabled_saffron_search = null;
        } else {
            this.enabled_saffron_search = bool3;
        }
        if ((i & 8) == 0) {
            this.memory_mode = null;
        } else {
            this.memory_mode = memoryMode;
        }
    }

    public static /* synthetic */ MemorySettingsResponse copy$default(MemorySettingsResponse memorySettingsResponse, Boolean bool, Boolean bool2, Boolean bool3, MemoryMode memoryMode, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = memorySettingsResponse.enabled_melange;
        }
        if ((i & 2) != 0) {
            bool2 = memorySettingsResponse.enabled_saffron;
        }
        if ((i & 4) != 0) {
            bool3 = memorySettingsResponse.enabled_saffron_search;
        }
        if ((i & 8) != 0) {
            memoryMode = memorySettingsResponse.memory_mode;
        }
        return memorySettingsResponse.copy(bool, bool2, bool3, memoryMode);
    }

    public static final /* synthetic */ void write$Self$api(MemorySettingsResponse self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.enabled_melange != null) {
            output.B(serialDesc, 0, zt1.a, self.enabled_melange);
        }
        if (output.E(serialDesc) || self.enabled_saffron != null) {
            output.B(serialDesc, 1, zt1.a, self.enabled_saffron);
        }
        if (output.E(serialDesc) || self.enabled_saffron_search != null) {
            output.B(serialDesc, 2, zt1.a, self.enabled_saffron_search);
        }
        if (!output.E(serialDesc) && self.memory_mode == null) {
            return;
        }
        output.B(serialDesc, 3, xbb.d, self.memory_mode);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getEnabled_melange() {
        return this.enabled_melange;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getEnabled_saffron() {
        return this.enabled_saffron;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getEnabled_saffron_search() {
        return this.enabled_saffron_search;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final MemoryMode getMemory_mode() {
        return this.memory_mode;
    }

    public final MemorySettingsResponse copy(Boolean enabled_melange, Boolean enabled_saffron, Boolean enabled_saffron_search, MemoryMode memory_mode) {
        return new MemorySettingsResponse(enabled_melange, enabled_saffron, enabled_saffron_search, memory_mode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MemorySettingsResponse)) {
            return false;
        }
        MemorySettingsResponse memorySettingsResponse = (MemorySettingsResponse) other;
        return x44.r(this.enabled_melange, memorySettingsResponse.enabled_melange) && x44.r(this.enabled_saffron, memorySettingsResponse.enabled_saffron) && x44.r(this.enabled_saffron_search, memorySettingsResponse.enabled_saffron_search) && this.memory_mode == memorySettingsResponse.memory_mode;
    }

    public final Boolean getEnabled_melange() {
        return this.enabled_melange;
    }

    public final Boolean getEnabled_saffron() {
        return this.enabled_saffron;
    }

    public final Boolean getEnabled_saffron_search() {
        return this.enabled_saffron_search;
    }

    public final MemoryMode getMemory_mode() {
        return this.memory_mode;
    }

    public int hashCode() {
        Boolean bool = this.enabled_melange;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.enabled_saffron;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.enabled_saffron_search;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        MemoryMode memoryMode = this.memory_mode;
        return iHashCode3 + (memoryMode != null ? memoryMode.hashCode() : 0);
    }

    public String toString() {
        return "MemorySettingsResponse(enabled_melange=" + this.enabled_melange + ", enabled_saffron=" + this.enabled_saffron + ", enabled_saffron_search=" + this.enabled_saffron_search + ", memory_mode=" + this.memory_mode + ")";
    }

    public MemorySettingsResponse() {
        this((Boolean) null, (Boolean) null, (Boolean) null, (MemoryMode) null, 15, (mq5) null);
    }

    public MemorySettingsResponse(Boolean bool, Boolean bool2, Boolean bool3, MemoryMode memoryMode) {
        this.enabled_melange = bool;
        this.enabled_saffron = bool2;
        this.enabled_saffron_search = bool3;
        this.memory_mode = memoryMode;
    }

    public /* synthetic */ MemorySettingsResponse(Boolean bool, Boolean bool2, Boolean bool3, MemoryMode memoryMode, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : memoryMode);
    }
}
