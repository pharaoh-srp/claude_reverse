package com.anthropic.claude.settings.internal.growthbook;

import defpackage.f7a;
import defpackage.gvj;
import defpackage.hd8;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.srg;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u0019\u001a\u00020\r2\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0018¨\u0006("}, d2 = {"com/anthropic/claude/settings/internal/growthbook/GrowthBookOverrideScreenData$Companion$PersistedCustomFeatures", "", "", "", "Lcom/anthropic/claude/settings/internal/growthbook/GateKind;", "features", "<init>", "(Ljava/util/Map;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/Map;Lvnf;)V", "Lcom/anthropic/claude/settings/internal/growthbook/GrowthBookOverrideScreenData$Companion$PersistedCustomFeatures;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$settings", "(Lcom/anthropic/claude/settings/internal/growthbook/GrowthBookOverrideScreenData$Companion$PersistedCustomFeatures;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/anthropic/claude/settings/internal/growthbook/GrowthBookOverrideScreenData$Companion$PersistedCustomFeatures;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getFeatures", "Companion", "com/anthropic/claude/settings/internal/growthbook/c", "hd8", "settings"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
final /* data */ class GrowthBookOverrideScreenData$Companion$PersistedCustomFeatures {
    private final Map<String, GateKind> features;
    public static final hd8 Companion = new hd8();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new b())};

    public /* synthetic */ GrowthBookOverrideScreenData$Companion$PersistedCustomFeatures(int i, Map map, vnf vnfVar) {
        if (1 == (i & 1)) {
            this.features = map;
        } else {
            gvj.f(i, 1, c.a.getDescriptor());
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new f7a(srg.a, GateKind.Companion.serializer());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GrowthBookOverrideScreenData$Companion$PersistedCustomFeatures copy$default(GrowthBookOverrideScreenData$Companion$PersistedCustomFeatures growthBookOverrideScreenData$Companion$PersistedCustomFeatures, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = growthBookOverrideScreenData$Companion$PersistedCustomFeatures.features;
        }
        return growthBookOverrideScreenData$Companion$PersistedCustomFeatures.copy(map);
    }

    public final Map<String, GateKind> component1() {
        return this.features;
    }

    public final GrowthBookOverrideScreenData$Companion$PersistedCustomFeatures copy(Map<String, ? extends GateKind> features) {
        features.getClass();
        return new GrowthBookOverrideScreenData$Companion$PersistedCustomFeatures(features);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GrowthBookOverrideScreenData$Companion$PersistedCustomFeatures) && x44.r(this.features, ((GrowthBookOverrideScreenData$Companion$PersistedCustomFeatures) other).features);
    }

    public final Map<String, GateKind> getFeatures() {
        return this.features;
    }

    public int hashCode() {
        return this.features.hashCode();
    }

    public String toString() {
        return "PersistedCustomFeatures(features=" + this.features + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GrowthBookOverrideScreenData$Companion$PersistedCustomFeatures(Map<String, ? extends GateKind> map) {
        map.getClass();
        this.features = map;
    }
}
