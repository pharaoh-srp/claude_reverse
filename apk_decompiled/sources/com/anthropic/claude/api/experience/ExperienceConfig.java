package com.anthropic.claude.api.experience;

import defpackage.m97;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/anthropic/claude/api/experience/ExperienceConfig;", "", "", "bypass_global_rules", "<init>", "(Ljava/lang/Boolean;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/experience/ExperienceConfig;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Boolean;)Lcom/anthropic/claude/api/experience/ExperienceConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getBypass_global_rules", "Companion", "l97", "m97", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ExperienceConfig {
    public static final int $stable = 0;
    public static final m97 Companion = new m97();
    private final Boolean bypass_global_rules;

    public /* synthetic */ ExperienceConfig(int i, Boolean bool, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.bypass_global_rules = null;
        } else {
            this.bypass_global_rules = bool;
        }
    }

    public static /* synthetic */ ExperienceConfig copy$default(ExperienceConfig experienceConfig, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = experienceConfig.bypass_global_rules;
        }
        return experienceConfig.copy(bool);
    }

    public static final /* synthetic */ void write$Self$api(ExperienceConfig self, vd4 output, SerialDescriptor serialDesc) {
        if (!output.E(serialDesc) && self.bypass_global_rules == null) {
            return;
        }
        output.B(serialDesc, 0, zt1.a, self.bypass_global_rules);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getBypass_global_rules() {
        return this.bypass_global_rules;
    }

    public final ExperienceConfig copy(Boolean bypass_global_rules) {
        return new ExperienceConfig(bypass_global_rules);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ExperienceConfig) && x44.r(this.bypass_global_rules, ((ExperienceConfig) other).bypass_global_rules);
    }

    public final Boolean getBypass_global_rules() {
        return this.bypass_global_rules;
    }

    public int hashCode() {
        Boolean bool = this.bypass_global_rules;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        return "ExperienceConfig(bypass_global_rules=" + this.bypass_global_rules + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExperienceConfig() {
        this((Boolean) null, 1, (mq5) (0 == true ? 1 : 0));
    }

    public ExperienceConfig(Boolean bool) {
        this.bypass_global_rules = bool;
    }

    public /* synthetic */ ExperienceConfig(Boolean bool, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : bool);
    }
}
