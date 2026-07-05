package com.anthropic.claude.api.experience;

import defpackage.ba7;
import defpackage.ea7;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.o97;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006,"}, d2 = {"Lcom/anthropic/claude/api/experience/ExperienceRuleSet;", "", "Lcom/anthropic/claude/api/experience/ExperienceRateLimit;", "rate_limit", "Lcom/anthropic/claude/api/experience/ExperienceCooldown;", "cooldown", "<init>", "(Lcom/anthropic/claude/api/experience/ExperienceRateLimit;Lcom/anthropic/claude/api/experience/ExperienceCooldown;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/experience/ExperienceRateLimit;Lcom/anthropic/claude/api/experience/ExperienceCooldown;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/experience/ExperienceRuleSet;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/experience/ExperienceRateLimit;", "component2", "()Lcom/anthropic/claude/api/experience/ExperienceCooldown;", "copy", "(Lcom/anthropic/claude/api/experience/ExperienceRateLimit;Lcom/anthropic/claude/api/experience/ExperienceCooldown;)Lcom/anthropic/claude/api/experience/ExperienceRuleSet;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/experience/ExperienceRateLimit;", "getRate_limit", "Lcom/anthropic/claude/api/experience/ExperienceCooldown;", "getCooldown", "Companion", "da7", "ea7", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ExperienceRuleSet {
    public static final int $stable = 0;
    public static final ea7 Companion = new ea7();
    private final ExperienceCooldown cooldown;
    private final ExperienceRateLimit rate_limit;

    public /* synthetic */ ExperienceRuleSet(int i, ExperienceRateLimit experienceRateLimit, ExperienceCooldown experienceCooldown, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.rate_limit = null;
        } else {
            this.rate_limit = experienceRateLimit;
        }
        if ((i & 2) == 0) {
            this.cooldown = null;
        } else {
            this.cooldown = experienceCooldown;
        }
    }

    public static /* synthetic */ ExperienceRuleSet copy$default(ExperienceRuleSet experienceRuleSet, ExperienceRateLimit experienceRateLimit, ExperienceCooldown experienceCooldown, int i, Object obj) {
        if ((i & 1) != 0) {
            experienceRateLimit = experienceRuleSet.rate_limit;
        }
        if ((i & 2) != 0) {
            experienceCooldown = experienceRuleSet.cooldown;
        }
        return experienceRuleSet.copy(experienceRateLimit, experienceCooldown);
    }

    public static final /* synthetic */ void write$Self$api(ExperienceRuleSet self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.rate_limit != null) {
            output.B(serialDesc, 0, ba7.a, self.rate_limit);
        }
        if (!output.E(serialDesc) && self.cooldown == null) {
            return;
        }
        output.B(serialDesc, 1, o97.a, self.cooldown);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ExperienceRateLimit getRate_limit() {
        return this.rate_limit;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ExperienceCooldown getCooldown() {
        return this.cooldown;
    }

    public final ExperienceRuleSet copy(ExperienceRateLimit rate_limit, ExperienceCooldown cooldown) {
        return new ExperienceRuleSet(rate_limit, cooldown);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExperienceRuleSet)) {
            return false;
        }
        ExperienceRuleSet experienceRuleSet = (ExperienceRuleSet) other;
        return x44.r(this.rate_limit, experienceRuleSet.rate_limit) && x44.r(this.cooldown, experienceRuleSet.cooldown);
    }

    public final ExperienceCooldown getCooldown() {
        return this.cooldown;
    }

    public final ExperienceRateLimit getRate_limit() {
        return this.rate_limit;
    }

    public int hashCode() {
        ExperienceRateLimit experienceRateLimit = this.rate_limit;
        int iHashCode = (experienceRateLimit == null ? 0 : experienceRateLimit.hashCode()) * 31;
        ExperienceCooldown experienceCooldown = this.cooldown;
        return iHashCode + (experienceCooldown != null ? experienceCooldown.hashCode() : 0);
    }

    public String toString() {
        return "ExperienceRuleSet(rate_limit=" + this.rate_limit + ", cooldown=" + this.cooldown + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExperienceRuleSet() {
        this((ExperienceRateLimit) null, (ExperienceCooldown) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
    }

    public ExperienceRuleSet(ExperienceRateLimit experienceRateLimit, ExperienceCooldown experienceCooldown) {
        this.rate_limit = experienceRateLimit;
        this.cooldown = experienceCooldown;
    }

    public /* synthetic */ ExperienceRuleSet(ExperienceRateLimit experienceRateLimit, ExperienceCooldown experienceCooldown, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : experienceRateLimit, (i & 2) != 0 ? null : experienceCooldown);
    }
}
