package com.anthropic.claude.api.events;

import defpackage.ij8;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wk8;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ*\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001d¨\u0006."}, d2 = {"Lcom/anthropic/claude/api/events/HealthMetricEventConfig;", "", "", "enabled", "", "", "allowed_actions", "<init>", "(ZLjava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IZLjava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/events/HealthMetricEventConfig;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "action", "permits", "(Ljava/lang/String;)Z", "component1", "()Z", "component2", "()Ljava/util/List;", "copy", "(ZLjava/util/List;)Lcom/anthropic/claude/api/events/HealthMetricEventConfig;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getEnabled", "Ljava/util/List;", "getAllowed_actions", "Companion", "wk8", "vk8", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class HealthMetricEventConfig {
    public static final int $stable = 8;
    public static final String FEATURE_NAME = "cuj_event_logging_config";
    private final List<String> allowed_actions;
    private final boolean enabled;
    public static final wk8 Companion = new wk8();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new ij8(13))};

    public /* synthetic */ HealthMetricEventConfig(int i, boolean z, List list, vnf vnfVar) {
        this.enabled = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.allowed_actions = lm6.E;
        } else {
            this.allowed_actions = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HealthMetricEventConfig copy$default(HealthMetricEventConfig healthMetricEventConfig, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = healthMetricEventConfig.enabled;
        }
        if ((i & 2) != 0) {
            list = healthMetricEventConfig.allowed_actions;
        }
        return healthMetricEventConfig.copy(z, list);
    }

    public static final /* synthetic */ void write$Self$api(HealthMetricEventConfig self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.enabled) {
            output.p(serialDesc, 0, self.enabled);
        }
        if (!output.E(serialDesc) && x44.r(self.allowed_actions, lm6.E)) {
            return;
        }
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.allowed_actions);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final List<String> component2() {
        return this.allowed_actions;
    }

    public final HealthMetricEventConfig copy(boolean enabled, List<String> allowed_actions) {
        allowed_actions.getClass();
        return new HealthMetricEventConfig(enabled, allowed_actions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthMetricEventConfig)) {
            return false;
        }
        HealthMetricEventConfig healthMetricEventConfig = (HealthMetricEventConfig) other;
        return this.enabled == healthMetricEventConfig.enabled && x44.r(this.allowed_actions, healthMetricEventConfig.allowed_actions);
    }

    public final List<String> getAllowed_actions() {
        return this.allowed_actions;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public int hashCode() {
        return this.allowed_actions.hashCode() + (Boolean.hashCode(this.enabled) * 31);
    }

    public final boolean permits(String action) {
        action.getClass();
        if (this.enabled) {
            return this.allowed_actions.contains("*") || this.allowed_actions.contains(action);
        }
        return false;
    }

    public String toString() {
        return "HealthMetricEventConfig(enabled=" + this.enabled + ", allowed_actions=" + this.allowed_actions + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HealthMetricEventConfig() {
        this(false, (List) null, 3, (mq5) (0 == true ? 1 : 0));
    }

    public HealthMetricEventConfig(boolean z, List<String> list) {
        list.getClass();
        this.enabled = z;
        this.allowed_actions = list;
    }

    public /* synthetic */ HealthMetricEventConfig(boolean z, List list, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? lm6.E : list);
    }
}
