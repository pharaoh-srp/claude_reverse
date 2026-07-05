package com.anthropic.claude.configs;

import defpackage.mdj;
import defpackage.mq5;
import defpackage.na6;
import defpackage.onf;
import defpackage.tmb;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B7\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J@\u0010\u001c\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0018¨\u0006/"}, d2 = {"Lcom/anthropic/claude/configs/MobileObservabilityConfig;", "", "", "network_request_sample_rate", "datadog_request_trace_sample_rate", "datadog_rum_profiler_sample_rate", "streaming_jank_sample_rate", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$configs", "(Lcom/anthropic/claude/configs/MobileObservabilityConfig;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Double;", "component2", "component3", "component4", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/anthropic/claude/configs/MobileObservabilityConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Double;", "getNetwork_request_sample_rate", "getDatadog_request_trace_sample_rate", "getDatadog_rum_profiler_sample_rate", "getStreaming_jank_sample_rate", "Companion", "tmb", "smb", "configs"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MobileObservabilityConfig {
    public static final int $stable = 0;
    public static final String CONFIG_NAME = "mobile_observability_config";
    public static final tmb Companion = new tmb();
    private final Double datadog_request_trace_sample_rate;
    private final Double datadog_rum_profiler_sample_rate;
    private final Double network_request_sample_rate;
    private final Double streaming_jank_sample_rate;

    public /* synthetic */ MobileObservabilityConfig(int i, Double d, Double d2, Double d3, Double d4, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.network_request_sample_rate = null;
        } else {
            this.network_request_sample_rate = d;
        }
        if ((i & 2) == 0) {
            this.datadog_request_trace_sample_rate = null;
        } else {
            this.datadog_request_trace_sample_rate = d2;
        }
        if ((i & 4) == 0) {
            this.datadog_rum_profiler_sample_rate = null;
        } else {
            this.datadog_rum_profiler_sample_rate = d3;
        }
        if ((i & 8) == 0) {
            this.streaming_jank_sample_rate = null;
        } else {
            this.streaming_jank_sample_rate = d4;
        }
    }

    public static /* synthetic */ MobileObservabilityConfig copy$default(MobileObservabilityConfig mobileObservabilityConfig, Double d, Double d2, Double d3, Double d4, int i, Object obj) {
        if ((i & 1) != 0) {
            d = mobileObservabilityConfig.network_request_sample_rate;
        }
        if ((i & 2) != 0) {
            d2 = mobileObservabilityConfig.datadog_request_trace_sample_rate;
        }
        if ((i & 4) != 0) {
            d3 = mobileObservabilityConfig.datadog_rum_profiler_sample_rate;
        }
        if ((i & 8) != 0) {
            d4 = mobileObservabilityConfig.streaming_jank_sample_rate;
        }
        return mobileObservabilityConfig.copy(d, d2, d3, d4);
    }

    public static final /* synthetic */ void write$Self$configs(MobileObservabilityConfig self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.network_request_sample_rate != null) {
            output.B(serialDesc, 0, na6.a, self.network_request_sample_rate);
        }
        if (output.E(serialDesc) || self.datadog_request_trace_sample_rate != null) {
            output.B(serialDesc, 1, na6.a, self.datadog_request_trace_sample_rate);
        }
        if (output.E(serialDesc) || self.datadog_rum_profiler_sample_rate != null) {
            output.B(serialDesc, 2, na6.a, self.datadog_rum_profiler_sample_rate);
        }
        if (!output.E(serialDesc) && self.streaming_jank_sample_rate == null) {
            return;
        }
        output.B(serialDesc, 3, na6.a, self.streaming_jank_sample_rate);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getNetwork_request_sample_rate() {
        return this.network_request_sample_rate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getDatadog_request_trace_sample_rate() {
        return this.datadog_request_trace_sample_rate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getDatadog_rum_profiler_sample_rate() {
        return this.datadog_rum_profiler_sample_rate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getStreaming_jank_sample_rate() {
        return this.streaming_jank_sample_rate;
    }

    public final MobileObservabilityConfig copy(Double network_request_sample_rate, Double datadog_request_trace_sample_rate, Double datadog_rum_profiler_sample_rate, Double streaming_jank_sample_rate) {
        return new MobileObservabilityConfig(network_request_sample_rate, datadog_request_trace_sample_rate, datadog_rum_profiler_sample_rate, streaming_jank_sample_rate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileObservabilityConfig)) {
            return false;
        }
        MobileObservabilityConfig mobileObservabilityConfig = (MobileObservabilityConfig) other;
        return x44.r(this.network_request_sample_rate, mobileObservabilityConfig.network_request_sample_rate) && x44.r(this.datadog_request_trace_sample_rate, mobileObservabilityConfig.datadog_request_trace_sample_rate) && x44.r(this.datadog_rum_profiler_sample_rate, mobileObservabilityConfig.datadog_rum_profiler_sample_rate) && x44.r(this.streaming_jank_sample_rate, mobileObservabilityConfig.streaming_jank_sample_rate);
    }

    public final Double getDatadog_request_trace_sample_rate() {
        return this.datadog_request_trace_sample_rate;
    }

    public final Double getDatadog_rum_profiler_sample_rate() {
        return this.datadog_rum_profiler_sample_rate;
    }

    public final Double getNetwork_request_sample_rate() {
        return this.network_request_sample_rate;
    }

    public final Double getStreaming_jank_sample_rate() {
        return this.streaming_jank_sample_rate;
    }

    public int hashCode() {
        Double d = this.network_request_sample_rate;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.datadog_request_trace_sample_rate;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.datadog_rum_profiler_sample_rate;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.streaming_jank_sample_rate;
        return iHashCode3 + (d4 != null ? d4.hashCode() : 0);
    }

    public String toString() {
        return "MobileObservabilityConfig(network_request_sample_rate=" + this.network_request_sample_rate + ", datadog_request_trace_sample_rate=" + this.datadog_request_trace_sample_rate + ", datadog_rum_profiler_sample_rate=" + this.datadog_rum_profiler_sample_rate + ", streaming_jank_sample_rate=" + this.streaming_jank_sample_rate + ")";
    }

    public MobileObservabilityConfig() {
        this((Double) null, (Double) null, (Double) null, (Double) null, 15, (mq5) null);
    }

    public MobileObservabilityConfig(Double d, Double d2, Double d3, Double d4) {
        this.network_request_sample_rate = d;
        this.datadog_request_trace_sample_rate = d2;
        this.datadog_rum_profiler_sample_rate = d3;
        this.streaming_jank_sample_rate = d4;
    }

    public /* synthetic */ MobileObservabilityConfig(Double d, Double d2, Double d3, Double d4, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2, (i & 4) != 0 ? null : d3, (i & 8) != 0 ? null : d4);
    }
}
