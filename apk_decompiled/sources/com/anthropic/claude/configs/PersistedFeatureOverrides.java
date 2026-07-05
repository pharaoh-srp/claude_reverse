package com.anthropic.claude.configs;

import com.anthropic.claude.api.account.GrowthBookFeature;
import defpackage.fyc;
import defpackage.h3a;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nm6;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B0\u0012'\b\u0002\u0010\t\u001a!\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\u0004\b\n\u0010\u000bB1\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001a\u001a!\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ9\u0010\u001c\u001a\u00020\u00002'\b\u0002\u0010\t\u001a!\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R6\u0010\t\u001a!\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u001b¨\u0006+"}, d2 = {"Lcom/anthropic/claude/configs/PersistedFeatureOverrides;", "", "", "", "Lcom/anthropic/claude/api/account/GrowthBookFeature;", "Lcom/anthropic/claude/api/account/GrowthBookFeatureMap;", "Lonf;", "with", "Lpl9;", "overrides", "<init>", "(Ljava/util/Map;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/Map;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$configs", "(Lcom/anthropic/claude/configs/PersistedFeatureOverrides;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/anthropic/claude/configs/PersistedFeatureOverrides;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getOverrides", "Companion", "eyc", "fyc", "configs"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class PersistedFeatureOverrides {
    public static final int $stable = 0;
    public static final fyc Companion = new fyc();
    private final Map<String, GrowthBookFeature> overrides;

    public /* synthetic */ PersistedFeatureOverrides(int i, Map map, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.overrides = nm6.E;
        } else {
            this.overrides = map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PersistedFeatureOverrides copy$default(PersistedFeatureOverrides persistedFeatureOverrides, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = persistedFeatureOverrides.overrides;
        }
        return persistedFeatureOverrides.copy(map);
    }

    public static final /* synthetic */ void write$Self$configs(PersistedFeatureOverrides self, vd4 output, SerialDescriptor serialDesc) {
        if (!output.E(serialDesc) && x44.r(self.overrides, nm6.E)) {
            return;
        }
        output.r(serialDesc, 0, h3a.a, self.overrides);
    }

    public final Map<String, GrowthBookFeature> component1() {
        return this.overrides;
    }

    public final PersistedFeatureOverrides copy(Map<String, GrowthBookFeature> overrides) {
        overrides.getClass();
        return new PersistedFeatureOverrides(overrides);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PersistedFeatureOverrides) && x44.r(this.overrides, ((PersistedFeatureOverrides) other).overrides);
    }

    public final Map<String, GrowthBookFeature> getOverrides() {
        return this.overrides;
    }

    public int hashCode() {
        return this.overrides.hashCode();
    }

    public String toString() {
        return "PersistedFeatureOverrides(overrides=" + this.overrides + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PersistedFeatureOverrides() {
        this((Map) null, 1, (mq5) (0 == true ? 1 : 0));
    }

    public PersistedFeatureOverrides(Map<String, GrowthBookFeature> map) {
        map.getClass();
        this.overrides = map;
    }

    public /* synthetic */ PersistedFeatureOverrides(Map map, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? nm6.E : map);
    }
}
