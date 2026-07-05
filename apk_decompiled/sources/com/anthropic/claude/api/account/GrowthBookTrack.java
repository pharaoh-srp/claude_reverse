package com.anthropic.claude.api.account;

import defpackage.dc8;
import defpackage.gvj;
import defpackage.hc8;
import defpackage.mdj;
import defpackage.onf;
import defpackage.ud8;
import defpackage.vd4;
import defpackage.vd8;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006,"}, d2 = {"Lcom/anthropic/claude/api/account/GrowthBookTrack;", "", "Lcom/anthropic/claude/api/account/GrowthBookExperiment;", "experiment", "Lcom/anthropic/claude/api/account/GrowthBookExperimentResult;", "result", "<init>", "(Lcom/anthropic/claude/api/account/GrowthBookExperiment;Lcom/anthropic/claude/api/account/GrowthBookExperimentResult;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/account/GrowthBookExperiment;Lcom/anthropic/claude/api/account/GrowthBookExperimentResult;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/account/GrowthBookTrack;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/account/GrowthBookExperiment;", "component2", "()Lcom/anthropic/claude/api/account/GrowthBookExperimentResult;", "copy", "(Lcom/anthropic/claude/api/account/GrowthBookExperiment;Lcom/anthropic/claude/api/account/GrowthBookExperimentResult;)Lcom/anthropic/claude/api/account/GrowthBookTrack;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/account/GrowthBookExperiment;", "getExperiment", "Lcom/anthropic/claude/api/account/GrowthBookExperimentResult;", "getResult", "Companion", "ud8", "vd8", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class GrowthBookTrack {
    public static final int $stable = 0;
    public static final vd8 Companion = new vd8();
    private final GrowthBookExperiment experiment;
    private final GrowthBookExperimentResult result;

    public /* synthetic */ GrowthBookTrack(int i, GrowthBookExperiment growthBookExperiment, GrowthBookExperimentResult growthBookExperimentResult, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, ud8.a.getDescriptor());
            throw null;
        }
        this.experiment = growthBookExperiment;
        this.result = growthBookExperimentResult;
    }

    public static /* synthetic */ GrowthBookTrack copy$default(GrowthBookTrack growthBookTrack, GrowthBookExperiment growthBookExperiment, GrowthBookExperimentResult growthBookExperimentResult, int i, Object obj) {
        if ((i & 1) != 0) {
            growthBookExperiment = growthBookTrack.experiment;
        }
        if ((i & 2) != 0) {
            growthBookExperimentResult = growthBookTrack.result;
        }
        return growthBookTrack.copy(growthBookExperiment, growthBookExperimentResult);
    }

    public static final /* synthetic */ void write$Self$api(GrowthBookTrack self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, dc8.a, self.experiment);
        output.r(serialDesc, 1, hc8.a, self.result);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GrowthBookExperiment getExperiment() {
        return this.experiment;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final GrowthBookExperimentResult getResult() {
        return this.result;
    }

    public final GrowthBookTrack copy(GrowthBookExperiment experiment, GrowthBookExperimentResult result) {
        experiment.getClass();
        result.getClass();
        return new GrowthBookTrack(experiment, result);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GrowthBookTrack)) {
            return false;
        }
        GrowthBookTrack growthBookTrack = (GrowthBookTrack) other;
        return x44.r(this.experiment, growthBookTrack.experiment) && x44.r(this.result, growthBookTrack.result);
    }

    public final GrowthBookExperiment getExperiment() {
        return this.experiment;
    }

    public final GrowthBookExperimentResult getResult() {
        return this.result;
    }

    public int hashCode() {
        return this.result.hashCode() + (this.experiment.hashCode() * 31);
    }

    public String toString() {
        return "GrowthBookTrack(experiment=" + this.experiment + ", result=" + this.result + ")";
    }

    public GrowthBookTrack(GrowthBookExperiment growthBookExperiment, GrowthBookExperimentResult growthBookExperimentResult) {
        growthBookExperiment.getClass();
        growthBookExperimentResult.getClass();
        this.experiment = growthBookExperiment;
        this.result = growthBookExperimentResult;
    }
}
