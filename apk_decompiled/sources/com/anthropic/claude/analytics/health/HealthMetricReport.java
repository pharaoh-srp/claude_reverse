package com.anthropic.claude.analytics.health;

import defpackage.fl8;
import defpackage.gl8;
import defpackage.gvj;
import defpackage.ij8;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.xka;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?@BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eBa\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'J`\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b*\u0010 J\u0010\u0010+\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b5\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b6\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b7\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010'R\u0011\u0010=\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b<\u0010 ¨\u0006A"}, d2 = {"Lcom/anthropic/claude/analytics/health/HealthMetricReport;", "", "Lcom/anthropic/claude/analytics/health/HealthMetricOutcome;", "outcome", "", "variant", "error_type", "error_code", "model", "", "duration_ms", "Lcom/anthropic/claude/analytics/health/HealthMetricAction;", "action", "<init>", "(Lcom/anthropic/claude/analytics/health/HealthMetricOutcome;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/anthropic/claude/analytics/health/HealthMetricAction;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/analytics/health/HealthMetricOutcome;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/anthropic/claude/analytics/health/HealthMetricAction;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/health/HealthMetricReport;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/analytics/health/HealthMetricOutcome;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Ljava/lang/Long;", "component7", "()Lcom/anthropic/claude/analytics/health/HealthMetricAction;", "copy", "(Lcom/anthropic/claude/analytics/health/HealthMetricOutcome;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/anthropic/claude/analytics/health/HealthMetricAction;)Lcom/anthropic/claude/analytics/health/HealthMetricReport;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/analytics/health/HealthMetricOutcome;", "getOutcome", "Ljava/lang/String;", "getVariant", "getError_type", "getError_code", "getModel", "Ljava/lang/Long;", "getDuration_ms", "Lcom/anthropic/claude/analytics/health/HealthMetricAction;", "getAction", "getEventName", "eventName", "Companion", "fl8", "gl8", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class HealthMetricReport {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final gl8 Companion = new gl8();
    private final HealthMetricAction action;
    private final Long duration_ms;
    private final String error_code;
    private final String error_type;
    private final String model;
    private final HealthMetricOutcome outcome;
    private final String variant;

    static {
        ij8 ij8Var = new ij8(15);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{yb5.w(w1aVar, ij8Var), null, null, null, null, null, yb5.w(w1aVar, new ij8(16))};
    }

    public /* synthetic */ HealthMetricReport(int i, HealthMetricOutcome healthMetricOutcome, String str, String str2, String str3, String str4, Long l, HealthMetricAction healthMetricAction, vnf vnfVar) {
        if (65 != (i & 65)) {
            gvj.f(i, 65, fl8.a.getDescriptor());
            throw null;
        }
        this.outcome = healthMetricOutcome;
        if ((i & 2) == 0) {
            this.variant = null;
        } else {
            this.variant = str;
        }
        if ((i & 4) == 0) {
            this.error_type = null;
        } else {
            this.error_type = str2;
        }
        if ((i & 8) == 0) {
            this.error_code = null;
        } else {
            this.error_code = str3;
        }
        if ((i & 16) == 0) {
            this.model = null;
        } else {
            this.model = str4;
        }
        if ((i & 32) == 0) {
            this.duration_ms = null;
        } else {
            this.duration_ms = l;
        }
        this.action = healthMetricAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return HealthMetricOutcome.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return HealthMetricAction.Companion.serializer();
    }

    public static /* synthetic */ HealthMetricReport copy$default(HealthMetricReport healthMetricReport, HealthMetricOutcome healthMetricOutcome, String str, String str2, String str3, String str4, Long l, HealthMetricAction healthMetricAction, int i, Object obj) {
        if ((i & 1) != 0) {
            healthMetricOutcome = healthMetricReport.outcome;
        }
        if ((i & 2) != 0) {
            str = healthMetricReport.variant;
        }
        if ((i & 4) != 0) {
            str2 = healthMetricReport.error_type;
        }
        if ((i & 8) != 0) {
            str3 = healthMetricReport.error_code;
        }
        if ((i & 16) != 0) {
            str4 = healthMetricReport.model;
        }
        if ((i & 32) != 0) {
            l = healthMetricReport.duration_ms;
        }
        if ((i & 64) != 0) {
            healthMetricAction = healthMetricReport.action;
        }
        Long l2 = l;
        HealthMetricAction healthMetricAction2 = healthMetricAction;
        String str5 = str4;
        String str6 = str2;
        return healthMetricReport.copy(healthMetricOutcome, str, str6, str3, str5, l2, healthMetricAction2);
    }

    public static final /* synthetic */ void write$Self$analytics(HealthMetricReport self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.outcome);
        if (output.E(serialDesc) || self.variant != null) {
            output.B(serialDesc, 1, srg.a, self.variant);
        }
        if (output.E(serialDesc) || self.error_type != null) {
            output.B(serialDesc, 2, srg.a, self.error_type);
        }
        if (output.E(serialDesc) || self.error_code != null) {
            output.B(serialDesc, 3, srg.a, self.error_code);
        }
        if (output.E(serialDesc) || self.model != null) {
            output.B(serialDesc, 4, srg.a, self.model);
        }
        if (output.E(serialDesc) || self.duration_ms != null) {
            output.B(serialDesc, 5, xka.a, self.duration_ms);
        }
        output.r(serialDesc, 6, (znf) kw9VarArr[6].getValue(), self.action);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HealthMetricOutcome getOutcome() {
        return this.outcome;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVariant() {
        return this.variant;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getError_type() {
        return this.error_type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getError_code() {
        return this.error_code;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getDuration_ms() {
        return this.duration_ms;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final HealthMetricAction getAction() {
        return this.action;
    }

    public final HealthMetricReport copy(HealthMetricOutcome outcome, String variant, String error_type, String error_code, String model, Long duration_ms, HealthMetricAction action) {
        outcome.getClass();
        action.getClass();
        return new HealthMetricReport(outcome, variant, error_type, error_code, model, duration_ms, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthMetricReport)) {
            return false;
        }
        HealthMetricReport healthMetricReport = (HealthMetricReport) other;
        return this.outcome == healthMetricReport.outcome && x44.r(this.variant, healthMetricReport.variant) && x44.r(this.error_type, healthMetricReport.error_type) && x44.r(this.error_code, healthMetricReport.error_code) && x44.r(this.model, healthMetricReport.model) && x44.r(this.duration_ms, healthMetricReport.duration_ms) && this.action == healthMetricReport.action;
    }

    public final HealthMetricAction getAction() {
        return this.action;
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

    public final String getEventName() {
        return this.action.getStringValue();
    }

    public final String getModel() {
        return this.model;
    }

    public final HealthMetricOutcome getOutcome() {
        return this.outcome;
    }

    public final String getVariant() {
        return this.variant;
    }

    public int hashCode() {
        int iHashCode = this.outcome.hashCode() * 31;
        String str = this.variant;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.error_type;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.error_code;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.model;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.duration_ms;
        return this.action.hashCode() + ((iHashCode5 + (l != null ? l.hashCode() : 0)) * 31);
    }

    public String toString() {
        HealthMetricOutcome healthMetricOutcome = this.outcome;
        String str = this.variant;
        String str2 = this.error_type;
        String str3 = this.error_code;
        String str4 = this.model;
        Long l = this.duration_ms;
        HealthMetricAction healthMetricAction = this.action;
        StringBuilder sb = new StringBuilder("HealthMetricReport(outcome=");
        sb.append(healthMetricOutcome);
        sb.append(", variant=");
        sb.append(str);
        sb.append(", error_type=");
        kgh.u(sb, str2, ", error_code=", str3, ", model=");
        sb.append(str4);
        sb.append(", duration_ms=");
        sb.append(l);
        sb.append(", action=");
        sb.append(healthMetricAction);
        sb.append(")");
        return sb.toString();
    }

    public HealthMetricReport(HealthMetricOutcome healthMetricOutcome, String str, String str2, String str3, String str4, Long l, HealthMetricAction healthMetricAction) {
        healthMetricOutcome.getClass();
        healthMetricAction.getClass();
        this.outcome = healthMetricOutcome;
        this.variant = str;
        this.error_type = str2;
        this.error_code = str3;
        this.model = str4;
        this.duration_ms = l;
        this.action = healthMetricAction;
    }

    public /* synthetic */ HealthMetricReport(HealthMetricOutcome healthMetricOutcome, String str, String str2, String str3, String str4, Long l, HealthMetricAction healthMetricAction, int i, mq5 mq5Var) {
        this(healthMetricOutcome, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : l, healthMetricAction);
    }
}
