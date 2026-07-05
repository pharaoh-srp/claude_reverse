package com.anthropic.claude.api.experience;

import defpackage.da7;
import defpackage.f7a;
import defpackage.ga7;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nm6;
import defpackage.onf;
import defpackage.rk3;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ2\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u001a¨\u0006,"}, d2 = {"Lcom/anthropic/claude/api/experience/ExperienceRules;", "", "Lcom/anthropic/claude/api/experience/ExperienceRuleSet;", "global", "", "", "placements", "<init>", "(Lcom/anthropic/claude/api/experience/ExperienceRuleSet;Ljava/util/Map;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/experience/ExperienceRuleSet;Ljava/util/Map;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/experience/ExperienceRules;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/experience/ExperienceRuleSet;", "component2", "()Ljava/util/Map;", "copy", "(Lcom/anthropic/claude/api/experience/ExperienceRuleSet;Ljava/util/Map;)Lcom/anthropic/claude/api/experience/ExperienceRules;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/experience/ExperienceRuleSet;", "getGlobal", "Ljava/util/Map;", "getPlacements", "Companion", "fa7", "ga7", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ExperienceRules {
    public static final int $stable = 0;
    private final ExperienceRuleSet global;
    private final Map<String, ExperienceRuleSet> placements;
    public static final ga7 Companion = new ga7();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new rk3(28))};

    public /* synthetic */ ExperienceRules(int i, ExperienceRuleSet experienceRuleSet, Map map, vnf vnfVar) {
        this.global = (i & 1) == 0 ? null : experienceRuleSet;
        if ((i & 2) == 0) {
            this.placements = nm6.E;
        } else {
            this.placements = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new f7a(srg.a, da7.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExperienceRules copy$default(ExperienceRules experienceRules, ExperienceRuleSet experienceRuleSet, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            experienceRuleSet = experienceRules.global;
        }
        if ((i & 2) != 0) {
            map = experienceRules.placements;
        }
        return experienceRules.copy(experienceRuleSet, map);
    }

    public static final /* synthetic */ void write$Self$api(ExperienceRules self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.global != null) {
            output.B(serialDesc, 0, da7.a, self.global);
        }
        if (!output.E(serialDesc) && x44.r(self.placements, nm6.E)) {
            return;
        }
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.placements);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ExperienceRuleSet getGlobal() {
        return this.global;
    }

    public final Map<String, ExperienceRuleSet> component2() {
        return this.placements;
    }

    public final ExperienceRules copy(ExperienceRuleSet global, Map<String, ExperienceRuleSet> placements) {
        placements.getClass();
        return new ExperienceRules(global, placements);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExperienceRules)) {
            return false;
        }
        ExperienceRules experienceRules = (ExperienceRules) other;
        return x44.r(this.global, experienceRules.global) && x44.r(this.placements, experienceRules.placements);
    }

    public final ExperienceRuleSet getGlobal() {
        return this.global;
    }

    public final Map<String, ExperienceRuleSet> getPlacements() {
        return this.placements;
    }

    public int hashCode() {
        ExperienceRuleSet experienceRuleSet = this.global;
        return this.placements.hashCode() + ((experienceRuleSet == null ? 0 : experienceRuleSet.hashCode()) * 31);
    }

    public String toString() {
        return "ExperienceRules(global=" + this.global + ", placements=" + this.placements + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExperienceRules() {
        this((ExperienceRuleSet) null, (Map) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
    }

    public ExperienceRules(ExperienceRuleSet experienceRuleSet, Map<String, ExperienceRuleSet> map) {
        map.getClass();
        this.global = experienceRuleSet;
        this.placements = map;
    }

    public /* synthetic */ ExperienceRules(ExperienceRuleSet experienceRuleSet, Map map, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : experienceRuleSet, (i & 2) != 0 ? nm6.E : map);
    }
}
