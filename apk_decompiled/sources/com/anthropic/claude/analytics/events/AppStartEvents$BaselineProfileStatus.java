package com.anthropic.claude.analytics.events;

import defpackage.fsh;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.onf;
import defpackage.sq6;
import defpackage.uk0;
import defpackage.vd4;
import defpackage.vk0;
import defpackage.vnf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ.\u0010\u001c\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0018J\u001a\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b\u0005\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001aR\u0014\u0010+\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010 ¨\u0006/"}, d2 = {"com/anthropic/claude/analytics/events/AppStartEvents$BaselineProfileStatus", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "result_code", "", "is_compiled_with_profile", "has_profile_enqueued", "<init>", "(IZZ)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IIZZLvnf;)V", "Lcom/anthropic/claude/analytics/events/AppStartEvents$BaselineProfileStatus;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/AppStartEvents$BaselineProfileStatus;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Z", "component3", "copy", "(IZZ)Lcom/anthropic/claude/analytics/events/AppStartEvents$BaselineProfileStatus;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getResult_code", "Z", "getHas_profile_enqueued", "getEventName", "eventName", "Companion", "uk0", "vk0", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class AppStartEvents$BaselineProfileStatus implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final vk0 Companion = new vk0();
    private final boolean has_profile_enqueued;
    private final boolean is_compiled_with_profile;
    private final int result_code;

    public /* synthetic */ AppStartEvents$BaselineProfileStatus(int i, int i2, boolean z, boolean z2, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, uk0.a.getDescriptor());
            throw null;
        }
        this.result_code = i2;
        this.is_compiled_with_profile = z;
        this.has_profile_enqueued = z2;
    }

    public static /* synthetic */ AppStartEvents$BaselineProfileStatus copy$default(AppStartEvents$BaselineProfileStatus appStartEvents$BaselineProfileStatus, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = appStartEvents$BaselineProfileStatus.result_code;
        }
        if ((i2 & 2) != 0) {
            z = appStartEvents$BaselineProfileStatus.is_compiled_with_profile;
        }
        if ((i2 & 4) != 0) {
            z2 = appStartEvents$BaselineProfileStatus.has_profile_enqueued;
        }
        return appStartEvents$BaselineProfileStatus.copy(i, z, z2);
    }

    public static final /* synthetic */ void write$Self$analytics(AppStartEvents$BaselineProfileStatus self, vd4 output, SerialDescriptor serialDesc) {
        output.l(0, self.result_code, serialDesc);
        output.p(serialDesc, 1, self.is_compiled_with_profile);
        output.p(serialDesc, 2, self.has_profile_enqueued);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getResult_code() {
        return this.result_code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIs_compiled_with_profile() {
        return this.is_compiled_with_profile;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getHas_profile_enqueued() {
        return this.has_profile_enqueued;
    }

    public final AppStartEvents$BaselineProfileStatus copy(int result_code, boolean is_compiled_with_profile, boolean has_profile_enqueued) {
        return new AppStartEvents$BaselineProfileStatus(result_code, is_compiled_with_profile, has_profile_enqueued);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppStartEvents$BaselineProfileStatus)) {
            return false;
        }
        AppStartEvents$BaselineProfileStatus appStartEvents$BaselineProfileStatus = (AppStartEvents$BaselineProfileStatus) other;
        return this.result_code == appStartEvents$BaselineProfileStatus.result_code && this.is_compiled_with_profile == appStartEvents$BaselineProfileStatus.is_compiled_with_profile && this.has_profile_enqueued == appStartEvents$BaselineProfileStatus.has_profile_enqueued;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile.app_start.baseline_profile_status";
    }

    public final boolean getHas_profile_enqueued() {
        return this.has_profile_enqueued;
    }

    public final int getResult_code() {
        return this.result_code;
    }

    public int hashCode() {
        return Boolean.hashCode(this.has_profile_enqueued) + fsh.p(Integer.hashCode(this.result_code) * 31, 31, this.is_compiled_with_profile);
    }

    public final boolean is_compiled_with_profile() {
        return this.is_compiled_with_profile;
    }

    public String toString() {
        int i = this.result_code;
        boolean z = this.is_compiled_with_profile;
        boolean z2 = this.has_profile_enqueued;
        StringBuilder sb = new StringBuilder("BaselineProfileStatus(result_code=");
        sb.append(i);
        sb.append(", is_compiled_with_profile=");
        sb.append(z);
        sb.append(", has_profile_enqueued=");
        return sq6.v(")", sb, z2);
    }

    public AppStartEvents$BaselineProfileStatus(int i, boolean z, boolean z2) {
        this.result_code = i;
        this.is_compiled_with_profile = z;
        this.has_profile_enqueued = z2;
    }
}
