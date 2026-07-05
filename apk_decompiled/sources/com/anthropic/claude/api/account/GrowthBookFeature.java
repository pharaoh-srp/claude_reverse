package com.anthropic.claude.api.account;

import defpackage.ch9;
import defpackage.eh9;
import defpackage.gvj;
import defpackage.jd7;
import defpackage.kw9;
import defpackage.lc8;
import defpackage.mc8;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qd8;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.w44;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>?B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001aR\u0016\u0010-\u001a\u0004\u0018\u00010*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u00100\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u00102\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b1\u0010\u001fR\u0013\u00106\u001a\u0004\u0018\u0001038F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0013\u0010:\u001a\u0004\u0018\u0001078F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0013\u0010<\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b;\u0010\u001f¨\u0006@"}, d2 = {"Lcom/anthropic/claude/api/account/GrowthBookFeature;", "", "Lkotlinx/serialization/json/JsonElement;", "defaultValue", "", "Lcom/anthropic/claude/api/account/GrowthBookRule;", "rules", "<init>", "(Lkotlinx/serialization/json/JsonElement;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILkotlinx/serialization/json/JsonElement;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/account/GrowthBookFeature;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lkotlinx/serialization/json/JsonElement;", "component2", "()Ljava/util/List;", "copy", "(Lkotlinx/serialization/json/JsonElement;Ljava/util/List;)Lcom/anthropic/claude/api/account/GrowthBookFeature;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/serialization/json/JsonElement;", "getDefaultValue", "Ljava/util/List;", "getRules", "Lcom/anthropic/claude/api/account/GrowthBookTrack;", "getTrack", "()Lcom/anthropic/claude/api/account/GrowthBookTrack;", "track", "getOn", "()Z", "on", "getSource", "source", "Lcom/anthropic/claude/api/account/GrowthBookExperiment;", "getExperiment", "()Lcom/anthropic/claude/api/account/GrowthBookExperiment;", "experiment", "Lcom/anthropic/claude/api/account/GrowthBookExperimentResult;", "getExperimentResult", "()Lcom/anthropic/claude/api/account/GrowthBookExperimentResult;", "experimentResult", "getRuleId", "ruleId", "Companion", "lc8", "mc8", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class GrowthBookFeature {
    public static final int $stable = 0;
    private final JsonElement defaultValue;
    private final List<GrowthBookRule> rules;
    public static final mc8 Companion = new mc8();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new jd7(13))};

    public /* synthetic */ GrowthBookFeature(int i, JsonElement jsonElement, List list, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, lc8.a.getDescriptor());
            throw null;
        }
        this.defaultValue = jsonElement;
        if ((i & 2) == 0) {
            this.rules = null;
        } else {
            this.rules = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(qd8.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GrowthBookFeature copy$default(GrowthBookFeature growthBookFeature, JsonElement jsonElement, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            jsonElement = growthBookFeature.defaultValue;
        }
        if ((i & 2) != 0) {
            list = growthBookFeature.rules;
        }
        return growthBookFeature.copy(jsonElement, list);
    }

    private final GrowthBookTrack getTrack() {
        GrowthBookRule growthBookRule;
        List<GrowthBookTrack> tracks;
        List<GrowthBookRule> list = this.rules;
        if (list == null || (growthBookRule = (GrowthBookRule) w44.N0(list)) == null || (tracks = growthBookRule.getTracks()) == null) {
            return null;
        }
        return (GrowthBookTrack) w44.N0(tracks);
    }

    public static final /* synthetic */ void write$Self$api(GrowthBookFeature self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, eh9.a, self.defaultValue);
        if (!output.E(serialDesc) && self.rules == null) {
            return;
        }
        output.B(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.rules);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final JsonElement getDefaultValue() {
        return this.defaultValue;
    }

    public final List<GrowthBookRule> component2() {
        return this.rules;
    }

    public final GrowthBookFeature copy(JsonElement defaultValue, List<GrowthBookRule> rules) {
        defaultValue.getClass();
        return new GrowthBookFeature(defaultValue, rules);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GrowthBookFeature)) {
            return false;
        }
        GrowthBookFeature growthBookFeature = (GrowthBookFeature) other;
        return x44.r(this.defaultValue, growthBookFeature.defaultValue) && x44.r(this.rules, growthBookFeature.rules);
    }

    public final JsonElement getDefaultValue() {
        return this.defaultValue;
    }

    public final GrowthBookExperiment getExperiment() {
        GrowthBookTrack track = getTrack();
        if (track != null) {
            return track.getExperiment();
        }
        return null;
    }

    public final GrowthBookExperimentResult getExperimentResult() {
        GrowthBookTrack track = getTrack();
        if (track != null) {
            return track.getResult();
        }
        return null;
    }

    public final boolean getOn() {
        Boolean boolE;
        JsonElement jsonElement = this.defaultValue;
        JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
        if (jsonPrimitive == null || (boolE = ch9.e(jsonPrimitive)) == null) {
            return false;
        }
        return boolE.booleanValue();
    }

    public final String getRuleId() {
        GrowthBookRule growthBookRule;
        List<GrowthBookRule> list = this.rules;
        if (list == null || (growthBookRule = (GrowthBookRule) w44.N0(list)) == null) {
            return null;
        }
        return growthBookRule.getId();
    }

    public final List<GrowthBookRule> getRules() {
        return this.rules;
    }

    public final String getSource() {
        List<GrowthBookTrack> tracks;
        List<GrowthBookRule> list = this.rules;
        GrowthBookRule growthBookRule = list != null ? (GrowthBookRule) w44.N0(list) : null;
        if (growthBookRule == null || (tracks = growthBookRule.getTracks()) == null || !(!tracks.isEmpty())) {
            return (growthBookRule != null ? growthBookRule.getId() : null) != null ? "force" : "defaultValue";
        }
        return "experiment";
    }

    public int hashCode() {
        int iHashCode = this.defaultValue.hashCode() * 31;
        List<GrowthBookRule> list = this.rules;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "GrowthBookFeature(defaultValue=" + this.defaultValue + ", rules=" + this.rules + ")";
    }

    public GrowthBookFeature(JsonElement jsonElement, List<GrowthBookRule> list) {
        jsonElement.getClass();
        this.defaultValue = jsonElement;
        this.rules = list;
    }

    public /* synthetic */ GrowthBookFeature(JsonElement jsonElement, List list, int i, mq5 mq5Var) {
        this(jsonElement, (i & 2) != 0 ? null : list);
    }
}
