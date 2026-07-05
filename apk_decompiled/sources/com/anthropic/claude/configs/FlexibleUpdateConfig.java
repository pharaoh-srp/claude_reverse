package com.anthropic.claude.configs;

import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.xn7;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u001a\u0010\"\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u0019¨\u0006,"}, d2 = {"Lcom/anthropic/claude/configs/FlexibleUpdateConfig;", "", "", "enabled", "", "min_staleness_days", "dismiss_cooldown_days", "<init>", "(ZII)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IZIILvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$configs", "(Lcom/anthropic/claude/configs/FlexibleUpdateConfig;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "()I", "component3", "copy", "(ZII)Lcom/anthropic/claude/configs/FlexibleUpdateConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getEnabled", "I", "getMin_staleness_days", "getDismiss_cooldown_days", "Companion", "xn7", "wn7", "configs"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class FlexibleUpdateConfig {
    public static final int $stable = 0;
    public static final String CONFIG_NAME = "mobile_flexible_update_config";
    public static final xn7 Companion = new xn7();
    private final int dismiss_cooldown_days;
    private final boolean enabled;
    private final int min_staleness_days;

    public /* synthetic */ FlexibleUpdateConfig(int i, boolean z, int i2, int i3, vnf vnfVar) {
        this.enabled = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.min_staleness_days = 28;
        } else {
            this.min_staleness_days = i2;
        }
        if ((i & 4) == 0) {
            this.dismiss_cooldown_days = 6;
        } else {
            this.dismiss_cooldown_days = i3;
        }
    }

    public static /* synthetic */ FlexibleUpdateConfig copy$default(FlexibleUpdateConfig flexibleUpdateConfig, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = flexibleUpdateConfig.enabled;
        }
        if ((i3 & 2) != 0) {
            i = flexibleUpdateConfig.min_staleness_days;
        }
        if ((i3 & 4) != 0) {
            i2 = flexibleUpdateConfig.dismiss_cooldown_days;
        }
        return flexibleUpdateConfig.copy(z, i, i2);
    }

    public static final /* synthetic */ void write$Self$configs(FlexibleUpdateConfig self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.enabled) {
            output.p(serialDesc, 0, self.enabled);
        }
        if (output.E(serialDesc) || self.min_staleness_days != 28) {
            output.l(1, self.min_staleness_days, serialDesc);
        }
        if (!output.E(serialDesc) && self.dismiss_cooldown_days == 6) {
            return;
        }
        output.l(2, self.dismiss_cooldown_days, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMin_staleness_days() {
        return this.min_staleness_days;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDismiss_cooldown_days() {
        return this.dismiss_cooldown_days;
    }

    public final FlexibleUpdateConfig copy(boolean enabled, int min_staleness_days, int dismiss_cooldown_days) {
        return new FlexibleUpdateConfig(enabled, min_staleness_days, dismiss_cooldown_days);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlexibleUpdateConfig)) {
            return false;
        }
        FlexibleUpdateConfig flexibleUpdateConfig = (FlexibleUpdateConfig) other;
        return this.enabled == flexibleUpdateConfig.enabled && this.min_staleness_days == flexibleUpdateConfig.min_staleness_days && this.dismiss_cooldown_days == flexibleUpdateConfig.dismiss_cooldown_days;
    }

    public final int getDismiss_cooldown_days() {
        return this.dismiss_cooldown_days;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final int getMin_staleness_days() {
        return this.min_staleness_days;
    }

    public int hashCode() {
        return Integer.hashCode(this.dismiss_cooldown_days) + vb7.c(this.min_staleness_days, Boolean.hashCode(this.enabled) * 31, 31);
    }

    public String toString() {
        boolean z = this.enabled;
        int i = this.min_staleness_days;
        int i2 = this.dismiss_cooldown_days;
        StringBuilder sb = new StringBuilder("FlexibleUpdateConfig(enabled=");
        sb.append(z);
        sb.append(", min_staleness_days=");
        sb.append(i);
        sb.append(", dismiss_cooldown_days=");
        return vb7.l(i2, ")", sb);
    }

    public FlexibleUpdateConfig() {
        this(false, 0, 0, 7, (mq5) null);
    }

    public FlexibleUpdateConfig(boolean z, int i, int i2) {
        this.enabled = z;
        this.min_staleness_days = i;
        this.dismiss_cooldown_days = i2;
    }

    public /* synthetic */ FlexibleUpdateConfig(boolean z, int i, int i2, int i3, mq5 mq5Var) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 28 : i, (i3 & 4) != 0 ? 6 : i2);
    }
}
