package com.anthropic.claude.api.events;

import com.anthropic.claude.types.environment.AppEnvironment;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.c69;
import defpackage.fc8;
import defpackage.g69;
import defpackage.gc8;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.jd7;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002ABBc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010Bs\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001fJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001fJt\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u001fJ\u0010\u0010.\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b.\u0010$J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010!R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b7\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b9\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b;\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b<\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b=\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b>\u0010\u001fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b?\u0010\u001f¨\u0006C"}, d2 = {"Lcom/anthropic/claude/api/events/GrowthBookExperimentEventData;", "", "", "event_id", "Lc69;", "timestamp", "experiment_id", "", "variation_id", "Lcom/anthropic/claude/types/environment/AppEnvironment;", "environment", "experiment_metadata", "device_id", "session_id", "user_attributes", "<init>", "(Ljava/lang/String;Lc69;Ljava/lang/String;ILcom/anthropic/claude/types/environment/AppEnvironment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lc69;Ljava/lang/String;ILcom/anthropic/claude/types/environment/AppEnvironment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/events/GrowthBookExperimentEventData;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lc69;", "component3", "component4", "()I", "component5", "()Lcom/anthropic/claude/types/environment/AppEnvironment;", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lc69;Ljava/lang/String;ILcom/anthropic/claude/types/environment/AppEnvironment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/events/GrowthBookExperimentEventData;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEvent_id", "Lc69;", "getTimestamp", "getExperiment_id", "I", "getVariation_id", "Lcom/anthropic/claude/types/environment/AppEnvironment;", "getEnvironment", "getExperiment_metadata", "getDevice_id", "getSession_id", "getUser_attributes", "Companion", "fc8", "gc8", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class GrowthBookExperimentEventData {
    public static final int $stable = 8;
    private final String device_id;
    private final AppEnvironment environment;
    private final String event_id;
    private final String experiment_id;
    private final String experiment_metadata;
    private final String session_id;
    private final c69 timestamp;
    private final String user_attributes;
    private final int variation_id;
    public static final gc8 Companion = new gc8();
    private static final kw9[] $childSerializers = {null, null, null, null, yb5.w(w1a.F, new jd7(12)), null, null, null, null};

    public /* synthetic */ GrowthBookExperimentEventData(int i, String str, c69 c69Var, String str2, int i2, AppEnvironment appEnvironment, String str3, String str4, String str5, String str6, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, fc8.a.getDescriptor());
            throw null;
        }
        this.event_id = str;
        this.timestamp = c69Var;
        this.experiment_id = str2;
        this.variation_id = i2;
        if ((i & 16) == 0) {
            this.environment = null;
        } else {
            this.environment = appEnvironment;
        }
        if ((i & 32) == 0) {
            this.experiment_metadata = null;
        } else {
            this.experiment_metadata = str3;
        }
        if ((i & 64) == 0) {
            this.device_id = null;
        } else {
            this.device_id = str4;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.session_id = null;
        } else {
            this.session_id = str5;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.user_attributes = null;
        } else {
            this.user_attributes = str6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return AppEnvironment.Companion.serializer();
    }

    public static /* synthetic */ GrowthBookExperimentEventData copy$default(GrowthBookExperimentEventData growthBookExperimentEventData, String str, c69 c69Var, String str2, int i, AppEnvironment appEnvironment, String str3, String str4, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = growthBookExperimentEventData.event_id;
        }
        if ((i2 & 2) != 0) {
            c69Var = growthBookExperimentEventData.timestamp;
        }
        if ((i2 & 4) != 0) {
            str2 = growthBookExperimentEventData.experiment_id;
        }
        if ((i2 & 8) != 0) {
            i = growthBookExperimentEventData.variation_id;
        }
        if ((i2 & 16) != 0) {
            appEnvironment = growthBookExperimentEventData.environment;
        }
        if ((i2 & 32) != 0) {
            str3 = growthBookExperimentEventData.experiment_metadata;
        }
        if ((i2 & 64) != 0) {
            str4 = growthBookExperimentEventData.device_id;
        }
        if ((i2 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            str5 = growthBookExperimentEventData.session_id;
        }
        if ((i2 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            str6 = growthBookExperimentEventData.user_attributes;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str3;
        String str10 = str4;
        AppEnvironment appEnvironment2 = appEnvironment;
        String str11 = str2;
        return growthBookExperimentEventData.copy(str, c69Var, str11, i, appEnvironment2, str9, str10, str7, str8);
    }

    public static final /* synthetic */ void write$Self$api(GrowthBookExperimentEventData self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.event_id);
        output.r(serialDesc, 1, g69.a, self.timestamp);
        output.q(serialDesc, 2, self.experiment_id);
        output.l(3, self.variation_id, serialDesc);
        if (output.E(serialDesc) || self.environment != null) {
            output.B(serialDesc, 4, (znf) kw9VarArr[4].getValue(), self.environment);
        }
        if (output.E(serialDesc) || self.experiment_metadata != null) {
            output.B(serialDesc, 5, srg.a, self.experiment_metadata);
        }
        if (output.E(serialDesc) || self.device_id != null) {
            output.B(serialDesc, 6, srg.a, self.device_id);
        }
        if (output.E(serialDesc) || self.session_id != null) {
            output.B(serialDesc, 7, srg.a, self.session_id);
        }
        if (!output.E(serialDesc) && self.user_attributes == null) {
            return;
        }
        output.B(serialDesc, 8, srg.a, self.user_attributes);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEvent_id() {
        return this.event_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final c69 getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getExperiment_id() {
        return this.experiment_id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getVariation_id() {
        return this.variation_id;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final AppEnvironment getEnvironment() {
        return this.environment;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getExperiment_metadata() {
        return this.experiment_metadata;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDevice_id() {
        return this.device_id;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSession_id() {
        return this.session_id;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getUser_attributes() {
        return this.user_attributes;
    }

    public final GrowthBookExperimentEventData copy(String event_id, c69 timestamp, String experiment_id, int variation_id, AppEnvironment environment, String experiment_metadata, String device_id, String session_id, String user_attributes) {
        event_id.getClass();
        timestamp.getClass();
        experiment_id.getClass();
        return new GrowthBookExperimentEventData(event_id, timestamp, experiment_id, variation_id, environment, experiment_metadata, device_id, session_id, user_attributes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GrowthBookExperimentEventData)) {
            return false;
        }
        GrowthBookExperimentEventData growthBookExperimentEventData = (GrowthBookExperimentEventData) other;
        return x44.r(this.event_id, growthBookExperimentEventData.event_id) && x44.r(this.timestamp, growthBookExperimentEventData.timestamp) && x44.r(this.experiment_id, growthBookExperimentEventData.experiment_id) && this.variation_id == growthBookExperimentEventData.variation_id && this.environment == growthBookExperimentEventData.environment && x44.r(this.experiment_metadata, growthBookExperimentEventData.experiment_metadata) && x44.r(this.device_id, growthBookExperimentEventData.device_id) && x44.r(this.session_id, growthBookExperimentEventData.session_id) && x44.r(this.user_attributes, growthBookExperimentEventData.user_attributes);
    }

    public final String getDevice_id() {
        return this.device_id;
    }

    public final AppEnvironment getEnvironment() {
        return this.environment;
    }

    public final String getEvent_id() {
        return this.event_id;
    }

    public final String getExperiment_id() {
        return this.experiment_id;
    }

    public final String getExperiment_metadata() {
        return this.experiment_metadata;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final c69 getTimestamp() {
        return this.timestamp;
    }

    public final String getUser_attributes() {
        return this.user_attributes;
    }

    public final int getVariation_id() {
        return this.variation_id;
    }

    public int hashCode() {
        int iC = vb7.c(this.variation_id, kgh.l((this.timestamp.hashCode() + (this.event_id.hashCode() * 31)) * 31, 31, this.experiment_id), 31);
        AppEnvironment appEnvironment = this.environment;
        int iHashCode = (iC + (appEnvironment == null ? 0 : appEnvironment.hashCode())) * 31;
        String str = this.experiment_metadata;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.device_id;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.session_id;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.user_attributes;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.event_id;
        c69 c69Var = this.timestamp;
        String str2 = this.experiment_id;
        int i = this.variation_id;
        AppEnvironment appEnvironment = this.environment;
        String str3 = this.experiment_metadata;
        String str4 = this.device_id;
        String str5 = this.session_id;
        String str6 = this.user_attributes;
        StringBuilder sb = new StringBuilder("GrowthBookExperimentEventData(event_id=");
        sb.append(str);
        sb.append(", timestamp=");
        sb.append(c69Var);
        sb.append(", experiment_id=");
        sb.append(str2);
        sb.append(", variation_id=");
        sb.append(i);
        sb.append(", environment=");
        sb.append(appEnvironment);
        sb.append(", experiment_metadata=");
        sb.append(str3);
        sb.append(", device_id=");
        kgh.u(sb, str4, ", session_id=", str5, ", user_attributes=");
        return ij0.m(sb, str6, ")");
    }

    public GrowthBookExperimentEventData(String str, c69 c69Var, String str2, int i, AppEnvironment appEnvironment, String str3, String str4, String str5, String str6) {
        str.getClass();
        c69Var.getClass();
        str2.getClass();
        this.event_id = str;
        this.timestamp = c69Var;
        this.experiment_id = str2;
        this.variation_id = i;
        this.environment = appEnvironment;
        this.experiment_metadata = str3;
        this.device_id = str4;
        this.session_id = str5;
        this.user_attributes = str6;
    }

    public /* synthetic */ GrowthBookExperimentEventData(String str, c69 c69Var, String str2, int i, AppEnvironment appEnvironment, String str3, String str4, String str5, String str6, int i2, mq5 mq5Var) {
        this(str, c69Var, str2, i, (i2 & 16) != 0 ? null : appEnvironment, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : str4, (i2 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : str5, (i2 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : str6);
    }
}
