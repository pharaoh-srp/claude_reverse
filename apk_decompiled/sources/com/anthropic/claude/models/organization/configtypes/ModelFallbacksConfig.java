package com.anthropic.claude.models.organization.configtypes;

import defpackage.f7a;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.pnb;
import defpackage.snb;
import defpackage.srg;
import defpackage.ulb;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B7\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBG\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ@\u0010\u001f\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001dR%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u001d¨\u0006/"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/ModelFallbacksConfig;", "", "", "", "Lcom/anthropic/claude/models/organization/configtypes/ModelFallback;", "modelFallbacks", "cyberModelFallbacks", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/Map;Ljava/util/Map;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/ModelFallbacksConfig;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/anthropic/claude/types/strings/ModelId;", "modelId", "fallbackModel-YWwWmQU", "(Ljava/lang/String;)Lcom/anthropic/claude/models/organization/configtypes/ModelFallback;", "fallbackModel", "component1", "()Ljava/util/Map;", "component2", "copy", "(Ljava/util/Map;Ljava/util/Map;)Lcom/anthropic/claude/models/organization/configtypes/ModelFallbacksConfig;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getModelFallbacks", "getCyberModelFallbacks", "Companion", "rnb", "snb", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ModelFallbacksConfig {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final snb Companion = new snb();
    private final Map<String, ModelFallback> cyberModelFallbacks;
    private final Map<String, ModelFallback> modelFallbacks;

    static {
        ulb ulbVar = new ulb(17);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{yb5.w(w1aVar, ulbVar), yb5.w(w1aVar, new ulb(18))};
    }

    public /* synthetic */ ModelFallbacksConfig(int i, Map map, Map map2, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.modelFallbacks = null;
        } else {
            this.modelFallbacks = map;
        }
        if ((i & 2) == 0) {
            this.cyberModelFallbacks = null;
        } else {
            this.cyberModelFallbacks = map2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new f7a(srg.a, pnb.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new f7a(srg.a, pnb.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ModelFallbacksConfig copy$default(ModelFallbacksConfig modelFallbacksConfig, Map map, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            map = modelFallbacksConfig.modelFallbacks;
        }
        if ((i & 2) != 0) {
            map2 = modelFallbacksConfig.cyberModelFallbacks;
        }
        return modelFallbacksConfig.copy(map, map2);
    }

    public static final /* synthetic */ void write$Self$models(ModelFallbacksConfig self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.modelFallbacks != null) {
            output.B(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.modelFallbacks);
        }
        if (!output.E(serialDesc) && self.cyberModelFallbacks == null) {
            return;
        }
        output.B(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.cyberModelFallbacks);
    }

    public final Map<String, ModelFallback> component1() {
        return this.modelFallbacks;
    }

    public final Map<String, ModelFallback> component2() {
        return this.cyberModelFallbacks;
    }

    public final ModelFallbacksConfig copy(Map<String, ModelFallback> modelFallbacks, Map<String, ModelFallback> cyberModelFallbacks) {
        return new ModelFallbacksConfig(modelFallbacks, cyberModelFallbacks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModelFallbacksConfig)) {
            return false;
        }
        ModelFallbacksConfig modelFallbacksConfig = (ModelFallbacksConfig) other;
        return x44.r(this.modelFallbacks, modelFallbacksConfig.modelFallbacks) && x44.r(this.cyberModelFallbacks, modelFallbacksConfig.cyberModelFallbacks);
    }

    /* JADX INFO: renamed from: fallbackModel-YWwWmQU, reason: not valid java name */
    public final ModelFallback m781fallbackModelYWwWmQU(String modelId) {
        modelId.getClass();
        Map<String, ModelFallback> map = this.modelFallbacks;
        if (map != null) {
            return map.get(modelId);
        }
        return null;
    }

    public final Map<String, ModelFallback> getCyberModelFallbacks() {
        return this.cyberModelFallbacks;
    }

    public final Map<String, ModelFallback> getModelFallbacks() {
        return this.modelFallbacks;
    }

    public int hashCode() {
        Map<String, ModelFallback> map = this.modelFallbacks;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, ModelFallback> map2 = this.cyberModelFallbacks;
        return iHashCode + (map2 != null ? map2.hashCode() : 0);
    }

    public String toString() {
        return "ModelFallbacksConfig(modelFallbacks=" + this.modelFallbacks + ", cyberModelFallbacks=" + this.cyberModelFallbacks + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ModelFallbacksConfig() {
        this((Map) null, (Map) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
    }

    public ModelFallbacksConfig(Map<String, ModelFallback> map, Map<String, ModelFallback> map2) {
        this.modelFallbacks = map;
        this.cyberModelFallbacks = map2;
    }

    public /* synthetic */ ModelFallbacksConfig(Map map, Map map2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : map2);
    }
}
