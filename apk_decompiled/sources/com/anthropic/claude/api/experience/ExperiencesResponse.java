package com.anthropic.claude.api.experience;

import defpackage.db7;
import defpackage.eb7;
import defpackage.fa7;
import defpackage.g87;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.rk3;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001a¨\u0006-"}, d2 = {"Lcom/anthropic/claude/api/experience/ExperiencesResponse;", "", "", "Lcom/anthropic/claude/api/experience/Experience;", "experiences", "Lcom/anthropic/claude/api/experience/ExperienceRules;", "rules", "<init>", "(Ljava/util/List;Lcom/anthropic/claude/api/experience/ExperienceRules;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/anthropic/claude/api/experience/ExperienceRules;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/experience/ExperiencesResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Lcom/anthropic/claude/api/experience/ExperienceRules;", "copy", "(Ljava/util/List;Lcom/anthropic/claude/api/experience/ExperienceRules;)Lcom/anthropic/claude/api/experience/ExperiencesResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getExperiences", "Lcom/anthropic/claude/api/experience/ExperienceRules;", "getRules", "Companion", "db7", "eb7", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ExperiencesResponse {
    public static final int $stable = 0;
    private final List<Experience> experiences;
    private final ExperienceRules rules;
    public static final eb7 Companion = new eb7();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new rk3(29)), null};

    public /* synthetic */ ExperiencesResponse(int i, List list, ExperienceRules experienceRules, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, db7.a.getDescriptor());
            throw null;
        }
        this.experiences = list;
        if ((i & 2) == 0) {
            this.rules = null;
        } else {
            this.rules = experienceRules;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(g87.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExperiencesResponse copy$default(ExperiencesResponse experiencesResponse, List list, ExperienceRules experienceRules, int i, Object obj) {
        if ((i & 1) != 0) {
            list = experiencesResponse.experiences;
        }
        if ((i & 2) != 0) {
            experienceRules = experiencesResponse.rules;
        }
        return experiencesResponse.copy(list, experienceRules);
    }

    public static final /* synthetic */ void write$Self$api(ExperiencesResponse self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.experiences);
        if (!output.E(serialDesc) && self.rules == null) {
            return;
        }
        output.B(serialDesc, 1, fa7.a, self.rules);
    }

    public final List<Experience> component1() {
        return this.experiences;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ExperienceRules getRules() {
        return this.rules;
    }

    public final ExperiencesResponse copy(List<Experience> experiences, ExperienceRules rules) {
        experiences.getClass();
        return new ExperiencesResponse(experiences, rules);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExperiencesResponse)) {
            return false;
        }
        ExperiencesResponse experiencesResponse = (ExperiencesResponse) other;
        return x44.r(this.experiences, experiencesResponse.experiences) && x44.r(this.rules, experiencesResponse.rules);
    }

    public final List<Experience> getExperiences() {
        return this.experiences;
    }

    public final ExperienceRules getRules() {
        return this.rules;
    }

    public int hashCode() {
        int iHashCode = this.experiences.hashCode() * 31;
        ExperienceRules experienceRules = this.rules;
        return iHashCode + (experienceRules == null ? 0 : experienceRules.hashCode());
    }

    public String toString() {
        return "ExperiencesResponse(experiences=" + this.experiences + ", rules=" + this.rules + ")";
    }

    public ExperiencesResponse(List<Experience> list, ExperienceRules experienceRules) {
        list.getClass();
        this.experiences = list;
        this.rules = experienceRules;
    }

    public /* synthetic */ ExperiencesResponse(List list, ExperienceRules experienceRules, int i, mq5 mq5Var) {
        this(list, (i & 2) != 0 ? null : experienceRules);
    }
}
