package com.anthropic.claude.api.experience;

import defpackage.aa7;
import defpackage.fsh;
import defpackage.g87;
import defpackage.gvj;
import defpackage.h87;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.l97;
import defpackage.m17;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<=BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBU\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'JR\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\t2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b:\u0010'¨\u0006>"}, d2 = {"Lcom/anthropic/claude/api/experience/Experience;", "", "", "id", "key", "Lcom/anthropic/claude/api/experience/ExperiencePlacement;", "placement_key", "Lcom/anthropic/claude/api/experience/ExperienceContent;", "content", "", "enabled", "Lcom/anthropic/claude/api/experience/ExperienceConfig;", "config", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/experience/ExperiencePlacement;Lcom/anthropic/claude/api/experience/ExperienceContent;ZLcom/anthropic/claude/api/experience/ExperienceConfig;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/experience/ExperiencePlacement;Lcom/anthropic/claude/api/experience/ExperienceContent;ZLcom/anthropic/claude/api/experience/ExperienceConfig;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/experience/Experience;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/anthropic/claude/api/experience/ExperiencePlacement;", "component4", "()Lcom/anthropic/claude/api/experience/ExperienceContent;", "component5", "()Z", "component6", "()Lcom/anthropic/claude/api/experience/ExperienceConfig;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/experience/ExperiencePlacement;Lcom/anthropic/claude/api/experience/ExperienceContent;ZLcom/anthropic/claude/api/experience/ExperienceConfig;)Lcom/anthropic/claude/api/experience/Experience;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getKey", "Lcom/anthropic/claude/api/experience/ExperiencePlacement;", "getPlacement_key", "Lcom/anthropic/claude/api/experience/ExperienceContent;", "getContent", "Z", "getEnabled", "Lcom/anthropic/claude/api/experience/ExperienceConfig;", "getConfig", "Companion", "g87", "h87", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class Experience {
    public static final int $stable = 0;
    private final ExperienceConfig config;
    private final ExperienceContent content;
    private final boolean enabled;
    private final String id;
    private final String key;
    private final ExperiencePlacement placement_key;
    public static final h87 Companion = new h87();
    private static final kw9[] $childSerializers = {null, null, null, yb5.w(w1a.F, new m17(25)), null, null};

    public /* synthetic */ Experience(int i, String str, String str2, ExperiencePlacement experiencePlacement, ExperienceContent experienceContent, boolean z, ExperienceConfig experienceConfig, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, g87.a.getDescriptor());
            throw null;
        }
        this.id = str;
        this.key = str2;
        if ((i & 4) == 0) {
            this.placement_key = null;
        } else {
            this.placement_key = experiencePlacement;
        }
        if ((i & 8) == 0) {
            this.content = null;
        } else {
            this.content = experienceContent;
        }
        if ((i & 16) == 0) {
            this.enabled = true;
        } else {
            this.enabled = z;
        }
        if ((i & 32) == 0) {
            this.config = null;
        } else {
            this.config = experienceConfig;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ExperienceContent.Companion.serializer();
    }

    public static /* synthetic */ Experience copy$default(Experience experience, String str, String str2, ExperiencePlacement experiencePlacement, ExperienceContent experienceContent, boolean z, ExperienceConfig experienceConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            str = experience.id;
        }
        if ((i & 2) != 0) {
            str2 = experience.key;
        }
        if ((i & 4) != 0) {
            experiencePlacement = experience.placement_key;
        }
        if ((i & 8) != 0) {
            experienceContent = experience.content;
        }
        if ((i & 16) != 0) {
            z = experience.enabled;
        }
        if ((i & 32) != 0) {
            experienceConfig = experience.config;
        }
        boolean z2 = z;
        ExperienceConfig experienceConfig2 = experienceConfig;
        return experience.copy(str, str2, experiencePlacement, experienceContent, z2, experienceConfig2);
    }

    public static final /* synthetic */ void write$Self$api(Experience self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.id);
        output.q(serialDesc, 1, self.key);
        if (output.E(serialDesc) || self.placement_key != null) {
            output.B(serialDesc, 2, aa7.d, self.placement_key);
        }
        if (output.E(serialDesc) || self.content != null) {
            output.B(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.content);
        }
        if (output.E(serialDesc) || !self.enabled) {
            output.p(serialDesc, 4, self.enabled);
        }
        if (!output.E(serialDesc) && self.config == null) {
            return;
        }
        output.B(serialDesc, 5, l97.a, self.config);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ExperiencePlacement getPlacement_key() {
        return this.placement_key;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ExperienceContent getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ExperienceConfig getConfig() {
        return this.config;
    }

    public final Experience copy(String id, String key, ExperiencePlacement placement_key, ExperienceContent content, boolean enabled, ExperienceConfig config) {
        id.getClass();
        key.getClass();
        return new Experience(id, key, placement_key, content, enabled, config);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Experience)) {
            return false;
        }
        Experience experience = (Experience) other;
        return x44.r(this.id, experience.id) && x44.r(this.key, experience.key) && this.placement_key == experience.placement_key && x44.r(this.content, experience.content) && this.enabled == experience.enabled && x44.r(this.config, experience.config);
    }

    public final ExperienceConfig getConfig() {
        return this.config;
    }

    public final ExperienceContent getContent() {
        return this.content;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getId() {
        return this.id;
    }

    public final String getKey() {
        return this.key;
    }

    public final ExperiencePlacement getPlacement_key() {
        return this.placement_key;
    }

    public int hashCode() {
        int iL = kgh.l(this.id.hashCode() * 31, 31, this.key);
        ExperiencePlacement experiencePlacement = this.placement_key;
        int iHashCode = (iL + (experiencePlacement == null ? 0 : experiencePlacement.hashCode())) * 31;
        ExperienceContent experienceContent = this.content;
        int iP = fsh.p((iHashCode + (experienceContent == null ? 0 : experienceContent.hashCode())) * 31, 31, this.enabled);
        ExperienceConfig experienceConfig = this.config;
        return iP + (experienceConfig != null ? experienceConfig.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.key;
        ExperiencePlacement experiencePlacement = this.placement_key;
        ExperienceContent experienceContent = this.content;
        boolean z = this.enabled;
        ExperienceConfig experienceConfig = this.config;
        StringBuilder sbR = kgh.r("Experience(id=", str, ", key=", str2, ", placement_key=");
        sbR.append(experiencePlacement);
        sbR.append(", content=");
        sbR.append(experienceContent);
        sbR.append(", enabled=");
        sbR.append(z);
        sbR.append(", config=");
        sbR.append(experienceConfig);
        sbR.append(")");
        return sbR.toString();
    }

    public Experience(String str, String str2, ExperiencePlacement experiencePlacement, ExperienceContent experienceContent, boolean z, ExperienceConfig experienceConfig) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.key = str2;
        this.placement_key = experiencePlacement;
        this.content = experienceContent;
        this.enabled = z;
        this.config = experienceConfig;
    }

    public /* synthetic */ Experience(String str, String str2, ExperiencePlacement experiencePlacement, ExperienceContent experienceContent, boolean z, ExperienceConfig experienceConfig, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : experiencePlacement, (i & 8) != 0 ? null : experienceContent, (i & 16) != 0 ? true : z, (i & 32) != 0 ? null : experienceConfig);
    }
}
