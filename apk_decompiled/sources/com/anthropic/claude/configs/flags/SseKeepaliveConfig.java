package com.anthropic.claude.configs.flags;

import defpackage.jjg;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u001a\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0018¨\u0006)"}, d2 = {"Lcom/anthropic/claude/configs/flags/SseKeepaliveConfig;", "", "", "enabled", "", "max_hold_sec", "<init>", "(ZI)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IZILvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$configs", "(Lcom/anthropic/claude/configs/flags/SseKeepaliveConfig;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "()I", "copy", "(ZI)Lcom/anthropic/claude/configs/flags/SseKeepaliveConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getEnabled", "I", "getMax_hold_sec", "Companion", "jjg", "ijg", "configs"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SseKeepaliveConfig {
    public static final int $stable = 0;
    public static final jjg Companion = new jjg();
    public static final String FEATURE_KEY = "mobile_android_sse_keepalive_worker";
    private final boolean enabled;
    private final int max_hold_sec;

    public /* synthetic */ SseKeepaliveConfig(int i, boolean z, int i2, vnf vnfVar) {
        this.enabled = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.max_hold_sec = 300;
        } else {
            this.max_hold_sec = i2;
        }
    }

    public static /* synthetic */ SseKeepaliveConfig copy$default(SseKeepaliveConfig sseKeepaliveConfig, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = sseKeepaliveConfig.enabled;
        }
        if ((i2 & 2) != 0) {
            i = sseKeepaliveConfig.max_hold_sec;
        }
        return sseKeepaliveConfig.copy(z, i);
    }

    public static final /* synthetic */ void write$Self$configs(SseKeepaliveConfig self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.enabled) {
            output.p(serialDesc, 0, self.enabled);
        }
        if (!output.E(serialDesc) && self.max_hold_sec == 300) {
            return;
        }
        output.l(1, self.max_hold_sec, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMax_hold_sec() {
        return this.max_hold_sec;
    }

    public final SseKeepaliveConfig copy(boolean enabled, int max_hold_sec) {
        return new SseKeepaliveConfig(enabled, max_hold_sec);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SseKeepaliveConfig)) {
            return false;
        }
        SseKeepaliveConfig sseKeepaliveConfig = (SseKeepaliveConfig) other;
        return this.enabled == sseKeepaliveConfig.enabled && this.max_hold_sec == sseKeepaliveConfig.max_hold_sec;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final int getMax_hold_sec() {
        return this.max_hold_sec;
    }

    public int hashCode() {
        return Integer.hashCode(this.max_hold_sec) + (Boolean.hashCode(this.enabled) * 31);
    }

    public String toString() {
        return "SseKeepaliveConfig(enabled=" + this.enabled + ", max_hold_sec=" + this.max_hold_sec + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SseKeepaliveConfig() {
        this(false, (int) (0 == true ? 1 : 0), 3, (mq5) null);
    }

    public SseKeepaliveConfig(boolean z, int i) {
        this.enabled = z;
        this.max_hold_sec = i;
    }

    public /* synthetic */ SseKeepaliveConfig(boolean z, int i, int i2, mq5 mq5Var) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 300 : i);
    }
}
