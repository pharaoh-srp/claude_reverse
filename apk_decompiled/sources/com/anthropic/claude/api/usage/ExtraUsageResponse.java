package com.anthropic.claude.api.usage;

import defpackage.e79;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.na6;
import defpackage.onf;
import defpackage.srg;
import defpackage.td7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"JL\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b%\u0010\"J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b\u0003\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b0\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\"¨\u00066"}, d2 = {"Lcom/anthropic/claude/api/usage/ExtraUsageResponse;", "", "", "is_enabled", "", "monthly_limit", "", "used_credits", "utilization", "", "currency", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/usage/ExtraUsageResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/Integer;", "component3", "()Ljava/lang/Double;", "component4", "component5", "()Ljava/lang/String;", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)Lcom/anthropic/claude/api/usage/ExtraUsageResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "Ljava/lang/Integer;", "getMonthly_limit", "Ljava/lang/Double;", "getUsed_credits", "getUtilization", "Ljava/lang/String;", "getCurrency", "Companion", "sd7", "td7", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ExtraUsageResponse {
    public static final int $stable = 0;
    public static final td7 Companion = new td7();
    private final String currency;
    private final Boolean is_enabled;
    private final Integer monthly_limit;
    private final Double used_credits;
    private final Double utilization;

    public /* synthetic */ ExtraUsageResponse(int i, Boolean bool, Integer num, Double d, Double d2, String str, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.is_enabled = null;
        } else {
            this.is_enabled = bool;
        }
        if ((i & 2) == 0) {
            this.monthly_limit = null;
        } else {
            this.monthly_limit = num;
        }
        if ((i & 4) == 0) {
            this.used_credits = null;
        } else {
            this.used_credits = d;
        }
        if ((i & 8) == 0) {
            this.utilization = null;
        } else {
            this.utilization = d2;
        }
        if ((i & 16) == 0) {
            this.currency = null;
        } else {
            this.currency = str;
        }
    }

    public static /* synthetic */ ExtraUsageResponse copy$default(ExtraUsageResponse extraUsageResponse, Boolean bool, Integer num, Double d, Double d2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = extraUsageResponse.is_enabled;
        }
        if ((i & 2) != 0) {
            num = extraUsageResponse.monthly_limit;
        }
        if ((i & 4) != 0) {
            d = extraUsageResponse.used_credits;
        }
        if ((i & 8) != 0) {
            d2 = extraUsageResponse.utilization;
        }
        if ((i & 16) != 0) {
            str = extraUsageResponse.currency;
        }
        String str2 = str;
        Double d3 = d;
        return extraUsageResponse.copy(bool, num, d3, d2, str2);
    }

    public static final /* synthetic */ void write$Self$api(ExtraUsageResponse self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.is_enabled != null) {
            output.B(serialDesc, 0, zt1.a, self.is_enabled);
        }
        if (output.E(serialDesc) || self.monthly_limit != null) {
            output.B(serialDesc, 1, e79.a, self.monthly_limit);
        }
        if (output.E(serialDesc) || self.used_credits != null) {
            output.B(serialDesc, 2, na6.a, self.used_credits);
        }
        if (output.E(serialDesc) || self.utilization != null) {
            output.B(serialDesc, 3, na6.a, self.utilization);
        }
        if (!output.E(serialDesc) && self.currency == null) {
            return;
        }
        output.B(serialDesc, 4, srg.a, self.currency);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getIs_enabled() {
        return this.is_enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getMonthly_limit() {
        return this.monthly_limit;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getUsed_credits() {
        return this.used_credits;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getUtilization() {
        return this.utilization;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final ExtraUsageResponse copy(Boolean is_enabled, Integer monthly_limit, Double used_credits, Double utilization, String currency) {
        return new ExtraUsageResponse(is_enabled, monthly_limit, used_credits, utilization, currency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtraUsageResponse)) {
            return false;
        }
        ExtraUsageResponse extraUsageResponse = (ExtraUsageResponse) other;
        return x44.r(this.is_enabled, extraUsageResponse.is_enabled) && x44.r(this.monthly_limit, extraUsageResponse.monthly_limit) && x44.r(this.used_credits, extraUsageResponse.used_credits) && x44.r(this.utilization, extraUsageResponse.utilization) && x44.r(this.currency, extraUsageResponse.currency);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Integer getMonthly_limit() {
        return this.monthly_limit;
    }

    public final Double getUsed_credits() {
        return this.used_credits;
    }

    public final Double getUtilization() {
        return this.utilization;
    }

    public int hashCode() {
        Boolean bool = this.is_enabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.monthly_limit;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.used_credits;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.utilization;
        int iHashCode4 = (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str = this.currency;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final Boolean is_enabled() {
        return this.is_enabled;
    }

    public String toString() {
        Boolean bool = this.is_enabled;
        Integer num = this.monthly_limit;
        Double d = this.used_credits;
        Double d2 = this.utilization;
        String str = this.currency;
        StringBuilder sb = new StringBuilder("ExtraUsageResponse(is_enabled=");
        sb.append(bool);
        sb.append(", monthly_limit=");
        sb.append(num);
        sb.append(", used_credits=");
        sb.append(d);
        sb.append(", utilization=");
        sb.append(d2);
        sb.append(", currency=");
        return ij0.m(sb, str, ")");
    }

    public ExtraUsageResponse() {
        this((Boolean) null, (Integer) null, (Double) null, (Double) null, (String) null, 31, (mq5) null);
    }

    public ExtraUsageResponse(Boolean bool, Integer num, Double d, Double d2, String str) {
        this.is_enabled = bool;
        this.monthly_limit = num;
        this.used_credits = d;
        this.utilization = d2;
        this.currency = str;
    }

    public /* synthetic */ ExtraUsageResponse(Boolean bool, Integer num, Double d, Double d2, String str, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : d2, (i & 16) != 0 ? null : str);
    }
}
