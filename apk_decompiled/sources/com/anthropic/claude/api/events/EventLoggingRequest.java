package com.anthropic.claude.api.events;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.onf;
import defpackage.qg9;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/api/events/EventLoggingRequest;", "", "Companion", "ExperimentExposure", "FeatureEvaluation", "HealthMetric", "com/anthropic/claude/api/events/a", "Lcom/anthropic/claude/api/events/EventLoggingRequest$ExperimentExposure;", "Lcom/anthropic/claude/api/events/EventLoggingRequest$FeatureEvaluation;", "Lcom/anthropic/claude/api/events/EventLoggingRequest$HealthMetric;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
@qg9(discriminator = "event_type")
public interface EventLoggingRequest {
    public static final a Companion = a.a;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/api/events/EventLoggingRequest$ExperimentExposure;", "Lcom/anthropic/claude/api/events/EventLoggingRequest;", "Lcom/anthropic/claude/api/events/GrowthBookExperimentEventData;", "event_data", "<init>", "(Lcom/anthropic/claude/api/events/GrowthBookExperimentEventData;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/events/GrowthBookExperimentEventData;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/events/EventLoggingRequest$ExperimentExposure;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/events/GrowthBookExperimentEventData;", "copy", "(Lcom/anthropic/claude/api/events/GrowthBookExperimentEventData;)Lcom/anthropic/claude/api/events/EventLoggingRequest$ExperimentExposure;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/events/GrowthBookExperimentEventData;", "getEvent_data", "Companion", "com/anthropic/claude/api/events/c", "com/anthropic/claude/api/events/d", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ExperimentExposure implements EventLoggingRequest {
        public static final int $stable = 8;
        public static final d Companion = new d();
        private final GrowthBookExperimentEventData event_data;

        public /* synthetic */ ExperimentExposure(int i, GrowthBookExperimentEventData growthBookExperimentEventData, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.event_data = growthBookExperimentEventData;
            } else {
                gvj.f(i, 1, c.a.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ ExperimentExposure copy$default(ExperimentExposure experimentExposure, GrowthBookExperimentEventData growthBookExperimentEventData, int i, Object obj) {
            if ((i & 1) != 0) {
                growthBookExperimentEventData = experimentExposure.event_data;
            }
            return experimentExposure.copy(growthBookExperimentEventData);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final GrowthBookExperimentEventData getEvent_data() {
            return this.event_data;
        }

        public final ExperimentExposure copy(GrowthBookExperimentEventData event_data) {
            event_data.getClass();
            return new ExperimentExposure(event_data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ExperimentExposure) && x44.r(this.event_data, ((ExperimentExposure) other).event_data);
        }

        public final GrowthBookExperimentEventData getEvent_data() {
            return this.event_data;
        }

        public int hashCode() {
            return this.event_data.hashCode();
        }

        public String toString() {
            return "ExperimentExposure(event_data=" + this.event_data + ")";
        }

        public ExperimentExposure(GrowthBookExperimentEventData growthBookExperimentEventData) {
            growthBookExperimentEventData.getClass();
            this.event_data = growthBookExperimentEventData;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/api/events/EventLoggingRequest$FeatureEvaluation;", "Lcom/anthropic/claude/api/events/EventLoggingRequest;", "Lcom/anthropic/claude/api/events/GrowthBookFeatureEvaluationEventData;", "event_data", "<init>", "(Lcom/anthropic/claude/api/events/GrowthBookFeatureEvaluationEventData;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/events/GrowthBookFeatureEvaluationEventData;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/events/EventLoggingRequest$FeatureEvaluation;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/events/GrowthBookFeatureEvaluationEventData;", "copy", "(Lcom/anthropic/claude/api/events/GrowthBookFeatureEvaluationEventData;)Lcom/anthropic/claude/api/events/EventLoggingRequest$FeatureEvaluation;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/events/GrowthBookFeatureEvaluationEventData;", "getEvent_data", "Companion", "com/anthropic/claude/api/events/e", "com/anthropic/claude/api/events/f", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class FeatureEvaluation implements EventLoggingRequest {
        public static final int $stable = 8;
        public static final f Companion = new f();
        private final GrowthBookFeatureEvaluationEventData event_data;

        public /* synthetic */ FeatureEvaluation(int i, GrowthBookFeatureEvaluationEventData growthBookFeatureEvaluationEventData, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.event_data = growthBookFeatureEvaluationEventData;
            } else {
                gvj.f(i, 1, e.a.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ FeatureEvaluation copy$default(FeatureEvaluation featureEvaluation, GrowthBookFeatureEvaluationEventData growthBookFeatureEvaluationEventData, int i, Object obj) {
            if ((i & 1) != 0) {
                growthBookFeatureEvaluationEventData = featureEvaluation.event_data;
            }
            return featureEvaluation.copy(growthBookFeatureEvaluationEventData);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final GrowthBookFeatureEvaluationEventData getEvent_data() {
            return this.event_data;
        }

        public final FeatureEvaluation copy(GrowthBookFeatureEvaluationEventData event_data) {
            event_data.getClass();
            return new FeatureEvaluation(event_data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FeatureEvaluation) && x44.r(this.event_data, ((FeatureEvaluation) other).event_data);
        }

        public final GrowthBookFeatureEvaluationEventData getEvent_data() {
            return this.event_data;
        }

        public int hashCode() {
            return this.event_data.hashCode();
        }

        public String toString() {
            return "FeatureEvaluation(event_data=" + this.event_data + ")";
        }

        public FeatureEvaluation(GrowthBookFeatureEvaluationEventData growthBookFeatureEvaluationEventData) {
            growthBookFeatureEvaluationEventData.getClass();
            this.event_data = growthBookFeatureEvaluationEventData;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/api/events/EventLoggingRequest$HealthMetric;", "Lcom/anthropic/claude/api/events/EventLoggingRequest;", "Lcom/anthropic/claude/api/events/HealthMetricEventData;", "event_data", "<init>", "(Lcom/anthropic/claude/api/events/HealthMetricEventData;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/events/HealthMetricEventData;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/events/EventLoggingRequest$HealthMetric;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/events/HealthMetricEventData;", "copy", "(Lcom/anthropic/claude/api/events/HealthMetricEventData;)Lcom/anthropic/claude/api/events/EventLoggingRequest$HealthMetric;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/events/HealthMetricEventData;", "getEvent_data", "Companion", "com/anthropic/claude/api/events/g", "com/anthropic/claude/api/events/h", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class HealthMetric implements EventLoggingRequest {
        public static final int $stable = 8;
        public static final h Companion = new h();
        private final HealthMetricEventData event_data;

        public /* synthetic */ HealthMetric(int i, HealthMetricEventData healthMetricEventData, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.event_data = healthMetricEventData;
            } else {
                gvj.f(i, 1, g.a.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ HealthMetric copy$default(HealthMetric healthMetric, HealthMetricEventData healthMetricEventData, int i, Object obj) {
            if ((i & 1) != 0) {
                healthMetricEventData = healthMetric.event_data;
            }
            return healthMetric.copy(healthMetricEventData);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final HealthMetricEventData getEvent_data() {
            return this.event_data;
        }

        public final HealthMetric copy(HealthMetricEventData event_data) {
            event_data.getClass();
            return new HealthMetric(event_data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HealthMetric) && x44.r(this.event_data, ((HealthMetric) other).event_data);
        }

        public final HealthMetricEventData getEvent_data() {
            return this.event_data;
        }

        public int hashCode() {
            return this.event_data.hashCode();
        }

        public String toString() {
            return "HealthMetric(event_data=" + this.event_data + ")";
        }

        public HealthMetric(HealthMetricEventData healthMetricEventData) {
            healthMetricEventData.getClass();
            this.event_data = healthMetricEventData;
        }
    }
}
