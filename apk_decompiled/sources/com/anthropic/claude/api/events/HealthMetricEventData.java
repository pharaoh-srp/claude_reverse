package com.anthropic.claude.api.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.c69;
import defpackage.g69;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.xk8;
import defpackage.xka;
import defpackage.yk8;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0002IJB{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B\u0093\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0019J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0019J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0019J\u0012\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0092\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0019J\u0010\u0010*\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/J'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b=\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b>\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b?\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b@\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\bA\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\bB\u0010\u0019R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\bC\u0010\u0019R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\bD\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\bE\u0010\u0019R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010F\u001a\u0004\bG\u0010&¨\u0006K"}, d2 = {"Lcom/anthropic/claude/api/events/HealthMetricEventData;", "", "", "event_id", "Lc69;", "event_timestamp", "action", "surface", "outcome", "error_type", "error_code", "variant", "model", "app_version", "platform", "", "duration_ms", "<init>", "(Ljava/lang/String;Lc69;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lc69;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "()Lc69;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Lc69;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/anthropic/claude/api/events/HealthMetricEventData;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/events/HealthMetricEventData;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getEvent_id", "Lc69;", "getEvent_timestamp", "getAction", "getSurface", "getOutcome", "getError_type", "getError_code", "getVariant", "getModel", "getApp_version", "getPlatform", "Ljava/lang/Long;", "getDuration_ms", "Companion", "xk8", "yk8", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class HealthMetricEventData {
    public static final int $stable = 8;
    public static final yk8 Companion = new yk8();
    private final String action;
    private final String app_version;
    private final Long duration_ms;
    private final String error_code;
    private final String error_type;
    private final String event_id;
    private final c69 event_timestamp;
    private final String model;
    private final String outcome;
    private final String platform;
    private final String surface;
    private final String variant;

    public /* synthetic */ HealthMetricEventData(int i, String str, c69 c69Var, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Long l, vnf vnfVar) {
        if (1567 != (i & 1567)) {
            gvj.f(i, 1567, xk8.a.getDescriptor());
            throw null;
        }
        this.event_id = str;
        this.event_timestamp = c69Var;
        this.action = str2;
        this.surface = str3;
        this.outcome = str4;
        if ((i & 32) == 0) {
            this.error_type = null;
        } else {
            this.error_type = str5;
        }
        if ((i & 64) == 0) {
            this.error_code = null;
        } else {
            this.error_code = str6;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.variant = null;
        } else {
            this.variant = str7;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.model = null;
        } else {
            this.model = str8;
        }
        this.app_version = str9;
        this.platform = str10;
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 0) {
            this.duration_ms = null;
        } else {
            this.duration_ms = l;
        }
    }

    public static /* synthetic */ HealthMetricEventData copy$default(HealthMetricEventData healthMetricEventData, String str, c69 c69Var, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = healthMetricEventData.event_id;
        }
        if ((i & 2) != 0) {
            c69Var = healthMetricEventData.event_timestamp;
        }
        if ((i & 4) != 0) {
            str2 = healthMetricEventData.action;
        }
        if ((i & 8) != 0) {
            str3 = healthMetricEventData.surface;
        }
        if ((i & 16) != 0) {
            str4 = healthMetricEventData.outcome;
        }
        if ((i & 32) != 0) {
            str5 = healthMetricEventData.error_type;
        }
        if ((i & 64) != 0) {
            str6 = healthMetricEventData.error_code;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            str7 = healthMetricEventData.variant;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            str8 = healthMetricEventData.model;
        }
        if ((i & 512) != 0) {
            str9 = healthMetricEventData.app_version;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
            str10 = healthMetricEventData.platform;
        }
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0) {
            l = healthMetricEventData.duration_ms;
        }
        String str11 = str10;
        Long l2 = l;
        String str12 = str8;
        String str13 = str9;
        String str14 = str6;
        String str15 = str7;
        String str16 = str4;
        String str17 = str5;
        return healthMetricEventData.copy(str, c69Var, str2, str3, str16, str17, str14, str15, str12, str13, str11, l2);
    }

    public static final /* synthetic */ void write$Self$api(HealthMetricEventData self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.event_id);
        output.r(serialDesc, 1, g69.a, self.event_timestamp);
        output.q(serialDesc, 2, self.action);
        output.q(serialDesc, 3, self.surface);
        output.q(serialDesc, 4, self.outcome);
        if (output.E(serialDesc) || self.error_type != null) {
            output.B(serialDesc, 5, srg.a, self.error_type);
        }
        if (output.E(serialDesc) || self.error_code != null) {
            output.B(serialDesc, 6, srg.a, self.error_code);
        }
        if (output.E(serialDesc) || self.variant != null) {
            output.B(serialDesc, 7, srg.a, self.variant);
        }
        if (output.E(serialDesc) || self.model != null) {
            output.B(serialDesc, 8, srg.a, self.model);
        }
        output.q(serialDesc, 9, self.app_version);
        output.q(serialDesc, 10, self.platform);
        if (!output.E(serialDesc) && self.duration_ms == null) {
            return;
        }
        output.B(serialDesc, 11, xka.a, self.duration_ms);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEvent_id() {
        return this.event_id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getApp_version() {
        return this.app_version;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Long getDuration_ms() {
        return this.duration_ms;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final c69 getEvent_timestamp() {
        return this.event_timestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSurface() {
        return this.surface;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOutcome() {
        return this.outcome;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getError_type() {
        return this.error_type;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getError_code() {
        return this.error_code;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getVariant() {
        return this.variant;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    public final HealthMetricEventData copy(String event_id, c69 event_timestamp, String action, String surface, String outcome, String error_type, String error_code, String variant, String model, String app_version, String platform, Long duration_ms) {
        event_id.getClass();
        event_timestamp.getClass();
        action.getClass();
        surface.getClass();
        outcome.getClass();
        app_version.getClass();
        platform.getClass();
        return new HealthMetricEventData(event_id, event_timestamp, action, surface, outcome, error_type, error_code, variant, model, app_version, platform, duration_ms);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthMetricEventData)) {
            return false;
        }
        HealthMetricEventData healthMetricEventData = (HealthMetricEventData) other;
        return x44.r(this.event_id, healthMetricEventData.event_id) && x44.r(this.event_timestamp, healthMetricEventData.event_timestamp) && x44.r(this.action, healthMetricEventData.action) && x44.r(this.surface, healthMetricEventData.surface) && x44.r(this.outcome, healthMetricEventData.outcome) && x44.r(this.error_type, healthMetricEventData.error_type) && x44.r(this.error_code, healthMetricEventData.error_code) && x44.r(this.variant, healthMetricEventData.variant) && x44.r(this.model, healthMetricEventData.model) && x44.r(this.app_version, healthMetricEventData.app_version) && x44.r(this.platform, healthMetricEventData.platform) && x44.r(this.duration_ms, healthMetricEventData.duration_ms);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getApp_version() {
        return this.app_version;
    }

    public final Long getDuration_ms() {
        return this.duration_ms;
    }

    public final String getError_code() {
        return this.error_code;
    }

    public final String getError_type() {
        return this.error_type;
    }

    public final String getEvent_id() {
        return this.event_id;
    }

    public final c69 getEvent_timestamp() {
        return this.event_timestamp;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getOutcome() {
        return this.outcome;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getSurface() {
        return this.surface;
    }

    public final String getVariant() {
        return this.variant;
    }

    public int hashCode() {
        int iL = kgh.l(kgh.l(kgh.l((this.event_timestamp.hashCode() + (this.event_id.hashCode() * 31)) * 31, 31, this.action), 31, this.surface), 31, this.outcome);
        String str = this.error_type;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.error_code;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.variant;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.model;
        int iL2 = kgh.l(kgh.l((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.app_version), 31, this.platform);
        Long l = this.duration_ms;
        return iL2 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        String str = this.event_id;
        c69 c69Var = this.event_timestamp;
        String str2 = this.action;
        String str3 = this.surface;
        String str4 = this.outcome;
        String str5 = this.error_type;
        String str6 = this.error_code;
        String str7 = this.variant;
        String str8 = this.model;
        String str9 = this.app_version;
        String str10 = this.platform;
        Long l = this.duration_ms;
        StringBuilder sb = new StringBuilder("HealthMetricEventData(event_id=");
        sb.append(str);
        sb.append(", event_timestamp=");
        sb.append(c69Var);
        sb.append(", action=");
        kgh.u(sb, str2, ", surface=", str3, ", outcome=");
        kgh.u(sb, str4, ", error_type=", str5, ", error_code=");
        kgh.u(sb, str6, ", variant=", str7, ", model=");
        kgh.u(sb, str8, ", app_version=", str9, ", platform=");
        sb.append(str10);
        sb.append(", duration_ms=");
        sb.append(l);
        sb.append(")");
        return sb.toString();
    }

    public HealthMetricEventData(String str, c69 c69Var, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Long l) {
        str.getClass();
        c69Var.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str9.getClass();
        str10.getClass();
        this.event_id = str;
        this.event_timestamp = c69Var;
        this.action = str2;
        this.surface = str3;
        this.outcome = str4;
        this.error_type = str5;
        this.error_code = str6;
        this.variant = str7;
        this.model = str8;
        this.app_version = str9;
        this.platform = str10;
        this.duration_ms = l;
    }

    public /* synthetic */ HealthMetricEventData(String str, c69 c69Var, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Long l, int i, mq5 mq5Var) {
        this(str, c69Var, str2, str3, str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : str7, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : str8, str9, str10, (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? null : l);
    }
}
