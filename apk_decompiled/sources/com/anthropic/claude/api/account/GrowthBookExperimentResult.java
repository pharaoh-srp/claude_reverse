package com.anthropic.claude.api.account;

import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.e79;
import defpackage.eh9;
import defpackage.ic8;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J@\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u0019¨\u00063"}, d2 = {"Lcom/anthropic/claude/api/account/GrowthBookExperimentResult;", "", "", "inExperiment", "", "variationId", "Lkotlinx/serialization/json/JsonElement;", ExperienceToggle.DEFAULT_PARAM_KEY, "hashUsed", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Lkotlinx/serialization/json/JsonElement;Ljava/lang/Boolean;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Integer;Lkotlinx/serialization/json/JsonElement;Ljava/lang/Boolean;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/account/GrowthBookExperimentResult;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/Integer;", "component3", "()Lkotlinx/serialization/json/JsonElement;", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;Lkotlinx/serialization/json/JsonElement;Ljava/lang/Boolean;)Lcom/anthropic/claude/api/account/GrowthBookExperimentResult;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getInExperiment", "Ljava/lang/Integer;", "getVariationId", "Lkotlinx/serialization/json/JsonElement;", "getValue", "getHashUsed", "Companion", "hc8", "ic8", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class GrowthBookExperimentResult {
    public static final int $stable = 0;
    public static final ic8 Companion = new ic8();
    private final Boolean hashUsed;
    private final Boolean inExperiment;
    private final JsonElement value;
    private final Integer variationId;

    public /* synthetic */ GrowthBookExperimentResult(int i, Boolean bool, Integer num, JsonElement jsonElement, Boolean bool2, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.inExperiment = null;
        } else {
            this.inExperiment = bool;
        }
        if ((i & 2) == 0) {
            this.variationId = null;
        } else {
            this.variationId = num;
        }
        if ((i & 4) == 0) {
            this.value = null;
        } else {
            this.value = jsonElement;
        }
        if ((i & 8) == 0) {
            this.hashUsed = null;
        } else {
            this.hashUsed = bool2;
        }
    }

    public static /* synthetic */ GrowthBookExperimentResult copy$default(GrowthBookExperimentResult growthBookExperimentResult, Boolean bool, Integer num, JsonElement jsonElement, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = growthBookExperimentResult.inExperiment;
        }
        if ((i & 2) != 0) {
            num = growthBookExperimentResult.variationId;
        }
        if ((i & 4) != 0) {
            jsonElement = growthBookExperimentResult.value;
        }
        if ((i & 8) != 0) {
            bool2 = growthBookExperimentResult.hashUsed;
        }
        return growthBookExperimentResult.copy(bool, num, jsonElement, bool2);
    }

    public static final /* synthetic */ void write$Self$api(GrowthBookExperimentResult self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.inExperiment != null) {
            output.B(serialDesc, 0, zt1.a, self.inExperiment);
        }
        if (output.E(serialDesc) || self.variationId != null) {
            output.B(serialDesc, 1, e79.a, self.variationId);
        }
        if (output.E(serialDesc) || self.value != null) {
            output.B(serialDesc, 2, eh9.a, self.value);
        }
        if (!output.E(serialDesc) && self.hashUsed == null) {
            return;
        }
        output.B(serialDesc, 3, zt1.a, self.hashUsed);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getInExperiment() {
        return this.inExperiment;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getVariationId() {
        return this.variationId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final JsonElement getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getHashUsed() {
        return this.hashUsed;
    }

    public final GrowthBookExperimentResult copy(Boolean inExperiment, Integer variationId, JsonElement value, Boolean hashUsed) {
        return new GrowthBookExperimentResult(inExperiment, variationId, value, hashUsed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GrowthBookExperimentResult)) {
            return false;
        }
        GrowthBookExperimentResult growthBookExperimentResult = (GrowthBookExperimentResult) other;
        return x44.r(this.inExperiment, growthBookExperimentResult.inExperiment) && x44.r(this.variationId, growthBookExperimentResult.variationId) && x44.r(this.value, growthBookExperimentResult.value) && x44.r(this.hashUsed, growthBookExperimentResult.hashUsed);
    }

    public final Boolean getHashUsed() {
        return this.hashUsed;
    }

    public final Boolean getInExperiment() {
        return this.inExperiment;
    }

    public final JsonElement getValue() {
        return this.value;
    }

    public final Integer getVariationId() {
        return this.variationId;
    }

    public int hashCode() {
        Boolean bool = this.inExperiment;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.variationId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        JsonElement jsonElement = this.value;
        int iHashCode3 = (iHashCode2 + (jsonElement == null ? 0 : jsonElement.hashCode())) * 31;
        Boolean bool2 = this.hashUsed;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "GrowthBookExperimentResult(inExperiment=" + this.inExperiment + ", variationId=" + this.variationId + ", value=" + this.value + ", hashUsed=" + this.hashUsed + ")";
    }

    public GrowthBookExperimentResult() {
        this((Boolean) null, (Integer) null, (JsonElement) null, (Boolean) null, 15, (mq5) null);
    }

    public GrowthBookExperimentResult(Boolean bool, Integer num, JsonElement jsonElement, Boolean bool2) {
        this.inExperiment = bool;
        this.variationId = num;
        this.value = jsonElement;
        this.hashUsed = bool2;
    }

    public /* synthetic */ GrowthBookExperimentResult(Boolean bool, Integer num, JsonElement jsonElement, Boolean bool2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : jsonElement, (i & 8) != 0 ? null : bool2);
    }
}
