package com.anthropic.claude.api.events;

import com.anthropic.claude.api.experience.ExperienceToggle;
import com.anthropic.claude.types.environment.AppEnvironment;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.c69;
import defpackage.g69;
import defpackage.gvj;
import defpackage.jd7;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nc8;
import defpackage.oc8;
import defpackage.onf;
import defpackage.srg;
import defpackage.vb7;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002CDBk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010B\u007f\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0017J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0017J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0017J~\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0017J\u0010\u0010&\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+J'\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b9\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b:\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b;\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b<\u0010\u0017R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b>\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b?\u0010\u0017R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b@\u0010\u0017R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\bA\u0010\u0017¨\u0006E"}, d2 = {"Lcom/anthropic/claude/api/events/GrowthBookFeatureEvaluationEventData;", "", "", "event_id", "Lc69;", "timestamp", "feature_key", ExperienceToggle.DEFAULT_PARAM_KEY, "reason", "unit_id", "Lcom/anthropic/claude/types/environment/AppEnvironment;", "environment", "project_id", "rule_id", "user_attributes", "<init>", "(Ljava/lang/String;Lc69;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/types/environment/AppEnvironment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lc69;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/types/environment/AppEnvironment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "()Lc69;", "component3", "component4", "component5", "component6", "component7", "()Lcom/anthropic/claude/types/environment/AppEnvironment;", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Lc69;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/types/environment/AppEnvironment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/events/GrowthBookFeatureEvaluationEventData;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/events/GrowthBookFeatureEvaluationEventData;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getEvent_id", "Lc69;", "getTimestamp", "getFeature_key", "getValue", "getReason", "getUnit_id", "Lcom/anthropic/claude/types/environment/AppEnvironment;", "getEnvironment", "getProject_id", "getRule_id", "getUser_attributes", "Companion", "nc8", "oc8", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class GrowthBookFeatureEvaluationEventData {
    public static final int $stable = 8;
    private final AppEnvironment environment;
    private final String event_id;
    private final String feature_key;
    private final String project_id;
    private final String reason;
    private final String rule_id;
    private final c69 timestamp;
    private final String unit_id;
    private final String user_attributes;
    private final String value;
    public static final oc8 Companion = new oc8();
    private static final kw9[] $childSerializers = {null, null, null, null, null, null, yb5.w(w1a.F, new jd7(14)), null, null, null};

    public /* synthetic */ GrowthBookFeatureEvaluationEventData(int i, String str, c69 c69Var, String str2, String str3, String str4, String str5, AppEnvironment appEnvironment, String str6, String str7, String str8, vnf vnfVar) {
        if (31 != (i & 31)) {
            gvj.f(i, 31, nc8.a.getDescriptor());
            throw null;
        }
        this.event_id = str;
        this.timestamp = c69Var;
        this.feature_key = str2;
        this.value = str3;
        this.reason = str4;
        if ((i & 32) == 0) {
            this.unit_id = null;
        } else {
            this.unit_id = str5;
        }
        if ((i & 64) == 0) {
            this.environment = null;
        } else {
            this.environment = appEnvironment;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.project_id = null;
        } else {
            this.project_id = str6;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.rule_id = null;
        } else {
            this.rule_id = str7;
        }
        if ((i & 512) == 0) {
            this.user_attributes = null;
        } else {
            this.user_attributes = str8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return AppEnvironment.Companion.serializer();
    }

    public static /* synthetic */ GrowthBookFeatureEvaluationEventData copy$default(GrowthBookFeatureEvaluationEventData growthBookFeatureEvaluationEventData, String str, c69 c69Var, String str2, String str3, String str4, String str5, AppEnvironment appEnvironment, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = growthBookFeatureEvaluationEventData.event_id;
        }
        if ((i & 2) != 0) {
            c69Var = growthBookFeatureEvaluationEventData.timestamp;
        }
        if ((i & 4) != 0) {
            str2 = growthBookFeatureEvaluationEventData.feature_key;
        }
        if ((i & 8) != 0) {
            str3 = growthBookFeatureEvaluationEventData.value;
        }
        if ((i & 16) != 0) {
            str4 = growthBookFeatureEvaluationEventData.reason;
        }
        if ((i & 32) != 0) {
            str5 = growthBookFeatureEvaluationEventData.unit_id;
        }
        if ((i & 64) != 0) {
            appEnvironment = growthBookFeatureEvaluationEventData.environment;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            str6 = growthBookFeatureEvaluationEventData.project_id;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            str7 = growthBookFeatureEvaluationEventData.rule_id;
        }
        if ((i & 512) != 0) {
            str8 = growthBookFeatureEvaluationEventData.user_attributes;
        }
        String str9 = str7;
        String str10 = str8;
        AppEnvironment appEnvironment2 = appEnvironment;
        String str11 = str6;
        String str12 = str4;
        String str13 = str5;
        return growthBookFeatureEvaluationEventData.copy(str, c69Var, str2, str3, str12, str13, appEnvironment2, str11, str9, str10);
    }

    public static final /* synthetic */ void write$Self$api(GrowthBookFeatureEvaluationEventData self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.event_id);
        output.r(serialDesc, 1, g69.a, self.timestamp);
        output.q(serialDesc, 2, self.feature_key);
        output.q(serialDesc, 3, self.value);
        output.q(serialDesc, 4, self.reason);
        if (output.E(serialDesc) || self.unit_id != null) {
            output.B(serialDesc, 5, srg.a, self.unit_id);
        }
        if (output.E(serialDesc) || self.environment != null) {
            output.B(serialDesc, 6, (znf) kw9VarArr[6].getValue(), self.environment);
        }
        if (output.E(serialDesc) || self.project_id != null) {
            output.B(serialDesc, 7, srg.a, self.project_id);
        }
        if (output.E(serialDesc) || self.rule_id != null) {
            output.B(serialDesc, 8, srg.a, self.rule_id);
        }
        if (!output.E(serialDesc) && self.user_attributes == null) {
            return;
        }
        output.B(serialDesc, 9, srg.a, self.user_attributes);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEvent_id() {
        return this.event_id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getUser_attributes() {
        return this.user_attributes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final c69 getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFeature_key() {
        return this.feature_key;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUnit_id() {
        return this.unit_id;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final AppEnvironment getEnvironment() {
        return this.environment;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getProject_id() {
        return this.project_id;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRule_id() {
        return this.rule_id;
    }

    public final GrowthBookFeatureEvaluationEventData copy(String event_id, c69 timestamp, String feature_key, String value, String reason, String unit_id, AppEnvironment environment, String project_id, String rule_id, String user_attributes) {
        event_id.getClass();
        timestamp.getClass();
        feature_key.getClass();
        value.getClass();
        reason.getClass();
        return new GrowthBookFeatureEvaluationEventData(event_id, timestamp, feature_key, value, reason, unit_id, environment, project_id, rule_id, user_attributes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GrowthBookFeatureEvaluationEventData)) {
            return false;
        }
        GrowthBookFeatureEvaluationEventData growthBookFeatureEvaluationEventData = (GrowthBookFeatureEvaluationEventData) other;
        return x44.r(this.event_id, growthBookFeatureEvaluationEventData.event_id) && x44.r(this.timestamp, growthBookFeatureEvaluationEventData.timestamp) && x44.r(this.feature_key, growthBookFeatureEvaluationEventData.feature_key) && x44.r(this.value, growthBookFeatureEvaluationEventData.value) && x44.r(this.reason, growthBookFeatureEvaluationEventData.reason) && x44.r(this.unit_id, growthBookFeatureEvaluationEventData.unit_id) && this.environment == growthBookFeatureEvaluationEventData.environment && x44.r(this.project_id, growthBookFeatureEvaluationEventData.project_id) && x44.r(this.rule_id, growthBookFeatureEvaluationEventData.rule_id) && x44.r(this.user_attributes, growthBookFeatureEvaluationEventData.user_attributes);
    }

    public final AppEnvironment getEnvironment() {
        return this.environment;
    }

    public final String getEvent_id() {
        return this.event_id;
    }

    public final String getFeature_key() {
        return this.feature_key;
    }

    public final String getProject_id() {
        return this.project_id;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getRule_id() {
        return this.rule_id;
    }

    public final c69 getTimestamp() {
        return this.timestamp;
    }

    public final String getUnit_id() {
        return this.unit_id;
    }

    public final String getUser_attributes() {
        return this.user_attributes;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iL = kgh.l(kgh.l(kgh.l((this.timestamp.hashCode() + (this.event_id.hashCode() * 31)) * 31, 31, this.feature_key), 31, this.value), 31, this.reason);
        String str = this.unit_id;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        AppEnvironment appEnvironment = this.environment;
        int iHashCode2 = (iHashCode + (appEnvironment == null ? 0 : appEnvironment.hashCode())) * 31;
        String str2 = this.project_id;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rule_id;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.user_attributes;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.event_id;
        c69 c69Var = this.timestamp;
        String str2 = this.feature_key;
        String str3 = this.value;
        String str4 = this.reason;
        String str5 = this.unit_id;
        AppEnvironment appEnvironment = this.environment;
        String str6 = this.project_id;
        String str7 = this.rule_id;
        String str8 = this.user_attributes;
        StringBuilder sb = new StringBuilder("GrowthBookFeatureEvaluationEventData(event_id=");
        sb.append(str);
        sb.append(", timestamp=");
        sb.append(c69Var);
        sb.append(", feature_key=");
        kgh.u(sb, str2, ", value=", str3, ", reason=");
        kgh.u(sb, str4, ", unit_id=", str5, ", environment=");
        sb.append(appEnvironment);
        sb.append(", project_id=");
        sb.append(str6);
        sb.append(", rule_id=");
        return vb7.t(sb, str7, ", user_attributes=", str8, ")");
    }

    public GrowthBookFeatureEvaluationEventData(String str, c69 c69Var, String str2, String str3, String str4, String str5, AppEnvironment appEnvironment, String str6, String str7, String str8) {
        str.getClass();
        c69Var.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.event_id = str;
        this.timestamp = c69Var;
        this.feature_key = str2;
        this.value = str3;
        this.reason = str4;
        this.unit_id = str5;
        this.environment = appEnvironment;
        this.project_id = str6;
        this.rule_id = str7;
        this.user_attributes = str8;
    }

    public /* synthetic */ GrowthBookFeatureEvaluationEventData(String str, c69 c69Var, String str2, String str3, String str4, String str5, AppEnvironment appEnvironment, String str6, String str7, String str8, int i, mq5 mq5Var) {
        this(str, c69Var, str2, str3, str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : appEnvironment, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : str6, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : str7, (i & 512) != 0 ? null : str8);
    }
}
