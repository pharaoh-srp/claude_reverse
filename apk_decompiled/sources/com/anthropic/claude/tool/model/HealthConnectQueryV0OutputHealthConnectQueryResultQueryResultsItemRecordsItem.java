package com.anthropic.claude.tool.model;

import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.ay6;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.mk8;
import defpackage.mq5;
import defpackage.nk8;
import defpackage.onf;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import java.time.OffsetDateTime;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223BW\u0012\u001f\b\u0002\u0010\u0007\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0019\u0010\b\u001a\u00150\u0002j\u0002`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rBC\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001c\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001e\u001a\u00150\u0002j\u0002`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b!\u0010 Jd\u0010\"\u001a\u00020\u00002\u001f\b\u0002\u0010\u0007\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u001b\b\u0002\u0010\b\u001a\u00150\u0002j\u0002`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b$\u0010 J\u0010\u0010%\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R.\u0010\u0007\u001a\u0019\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001dR*\u0010\b\u001a\u00150\u0002j\u0002`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b-\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u0010 R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b0\u0010 ¨\u00064"}, d2 = {"Lcom/anthropic/claude/tool/model/HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem;", "", "Ljava/time/OffsetDateTime;", "Lcom/anthropic/claude/tool/model/EventDateTime;", "Lonf;", "with", "Lay6;", "end_time", "start_time", "", "unit", ExperienceToggle.DEFAULT_PARAM_KEY, "<init>", "(Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/time/OffsetDateTime;", "component2", "component3", "()Ljava/lang/String;", "component4", "copy", "(Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/tool/model/HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/time/OffsetDateTime;", "getEnd_time", "getStart_time", "Ljava/lang/String;", "getUnit", "getValue", "Companion", "mk8", "nk8", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem {
    public static final nk8 Companion = new nk8();
    private final OffsetDateTime end_time;
    private final OffsetDateTime start_time;
    private final String unit;
    private final String value;

    public /* synthetic */ HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem(int i, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, String str, String str2, vnf vnfVar) {
        if (10 != (i & 10)) {
            gvj.f(i, 10, mk8.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.end_time = null;
        } else {
            this.end_time = offsetDateTime;
        }
        this.start_time = offsetDateTime2;
        if ((i & 4) == 0) {
            this.unit = null;
        } else {
            this.unit = str;
        }
        this.value = str2;
    }

    public static /* synthetic */ HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem copy$default(HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            offsetDateTime = healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem.end_time;
        }
        if ((i & 2) != 0) {
            offsetDateTime2 = healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem.start_time;
        }
        if ((i & 4) != 0) {
            str = healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem.unit;
        }
        if ((i & 8) != 0) {
            str2 = healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem.value;
        }
        return healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem.copy(offsetDateTime, offsetDateTime2, str, str2);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.end_time != null) {
            output.B(serialDesc, 0, ay6.a, self.end_time);
        }
        output.r(serialDesc, 1, ay6.a, self.start_time);
        if (output.E(serialDesc) || self.unit != null) {
            output.B(serialDesc, 2, srg.a, self.unit);
        }
        output.q(serialDesc, 3, self.value);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OffsetDateTime getEnd_time() {
        return this.end_time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OffsetDateTime getStart_time() {
        return this.start_time;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem copy(OffsetDateTime end_time, OffsetDateTime start_time, String unit, String value) {
        start_time.getClass();
        value.getClass();
        return new HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem(end_time, start_time, unit, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem)) {
            return false;
        }
        HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem = (HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem) other;
        return x44.r(this.end_time, healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem.end_time) && x44.r(this.start_time, healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem.start_time) && x44.r(this.unit, healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem.unit) && x44.r(this.value, healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem.value);
    }

    public final OffsetDateTime getEnd_time() {
        return this.end_time;
    }

    public final OffsetDateTime getStart_time() {
        return this.start_time;
    }

    public final String getUnit() {
        return this.unit;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        OffsetDateTime offsetDateTime = this.end_time;
        int iHashCode = (this.start_time.hashCode() + ((offsetDateTime == null ? 0 : offsetDateTime.hashCode()) * 31)) * 31;
        String str = this.unit;
        return this.value.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        OffsetDateTime offsetDateTime = this.end_time;
        OffsetDateTime offsetDateTime2 = this.start_time;
        String str = this.unit;
        String str2 = this.value;
        StringBuilder sb = new StringBuilder("HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem(end_time=");
        sb.append(offsetDateTime);
        sb.append(", start_time=");
        sb.append(offsetDateTime2);
        sb.append(", unit=");
        return vb7.t(sb, str, ", value=", str2, ")");
    }

    public HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem(OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, String str, String str2) {
        offsetDateTime2.getClass();
        str2.getClass();
        this.end_time = offsetDateTime;
        this.start_time = offsetDateTime2;
        this.unit = str;
        this.value = str2;
    }

    public /* synthetic */ HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemRecordsItem(OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, String str, String str2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : offsetDateTime, offsetDateTime2, (i & 4) != 0 ? null : str, str2);
    }
}
