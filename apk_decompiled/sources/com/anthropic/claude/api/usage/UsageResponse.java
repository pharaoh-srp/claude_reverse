package com.anthropic.claude.api.usage;

import defpackage.bmi;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.rme;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.wli;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!JX\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b1\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b2\u0010\u001bR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00103\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010!¨\u0006:"}, d2 = {"Lcom/anthropic/claude/api/usage/UsageResponse;", "", "Lcom/anthropic/claude/api/usage/UsageWindow;", "five_hour", "seven_day", "seven_day_opus", "seven_day_sonnet", "seven_day_cowork", "Lcom/anthropic/claude/api/usage/ExtraUsageResponse;", "extra_usage", "<init>", "(Lcom/anthropic/claude/api/usage/UsageWindow;Lcom/anthropic/claude/api/usage/UsageWindow;Lcom/anthropic/claude/api/usage/UsageWindow;Lcom/anthropic/claude/api/usage/UsageWindow;Lcom/anthropic/claude/api/usage/UsageWindow;Lcom/anthropic/claude/api/usage/ExtraUsageResponse;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/usage/UsageWindow;Lcom/anthropic/claude/api/usage/UsageWindow;Lcom/anthropic/claude/api/usage/UsageWindow;Lcom/anthropic/claude/api/usage/UsageWindow;Lcom/anthropic/claude/api/usage/UsageWindow;Lcom/anthropic/claude/api/usage/ExtraUsageResponse;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/usage/UsageResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/usage/UsageWindow;", "component2", "component3", "component4", "component5", "component6", "()Lcom/anthropic/claude/api/usage/ExtraUsageResponse;", "copy", "(Lcom/anthropic/claude/api/usage/UsageWindow;Lcom/anthropic/claude/api/usage/UsageWindow;Lcom/anthropic/claude/api/usage/UsageWindow;Lcom/anthropic/claude/api/usage/UsageWindow;Lcom/anthropic/claude/api/usage/UsageWindow;Lcom/anthropic/claude/api/usage/ExtraUsageResponse;)Lcom/anthropic/claude/api/usage/UsageResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/usage/UsageWindow;", "getFive_hour", "getSeven_day", "getSeven_day_opus", "getSeven_day_sonnet", "getSeven_day_cowork", "Lcom/anthropic/claude/api/usage/ExtraUsageResponse;", "getExtra_usage", "getExtra_usage$annotations", "()V", "Companion", "vli", "wli", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class UsageResponse {
    public static final int $stable = 0;
    public static final wli Companion = new wli();
    private final ExtraUsageResponse extra_usage;
    private final UsageWindow five_hour;
    private final UsageWindow seven_day;
    private final UsageWindow seven_day_cowork;
    private final UsageWindow seven_day_opus;
    private final UsageWindow seven_day_sonnet;

    public /* synthetic */ UsageResponse(int i, UsageWindow usageWindow, UsageWindow usageWindow2, UsageWindow usageWindow3, UsageWindow usageWindow4, UsageWindow usageWindow5, ExtraUsageResponse extraUsageResponse, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.five_hour = null;
        } else {
            this.five_hour = usageWindow;
        }
        if ((i & 2) == 0) {
            this.seven_day = null;
        } else {
            this.seven_day = usageWindow2;
        }
        if ((i & 4) == 0) {
            this.seven_day_opus = null;
        } else {
            this.seven_day_opus = usageWindow3;
        }
        if ((i & 8) == 0) {
            this.seven_day_sonnet = null;
        } else {
            this.seven_day_sonnet = usageWindow4;
        }
        if ((i & 16) == 0) {
            this.seven_day_cowork = null;
        } else {
            this.seven_day_cowork = usageWindow5;
        }
        if ((i & 32) == 0) {
            this.extra_usage = null;
        } else {
            this.extra_usage = extraUsageResponse;
        }
    }

    public static /* synthetic */ UsageResponse copy$default(UsageResponse usageResponse, UsageWindow usageWindow, UsageWindow usageWindow2, UsageWindow usageWindow3, UsageWindow usageWindow4, UsageWindow usageWindow5, ExtraUsageResponse extraUsageResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            usageWindow = usageResponse.five_hour;
        }
        if ((i & 2) != 0) {
            usageWindow2 = usageResponse.seven_day;
        }
        if ((i & 4) != 0) {
            usageWindow3 = usageResponse.seven_day_opus;
        }
        if ((i & 8) != 0) {
            usageWindow4 = usageResponse.seven_day_sonnet;
        }
        if ((i & 16) != 0) {
            usageWindow5 = usageResponse.seven_day_cowork;
        }
        if ((i & 32) != 0) {
            extraUsageResponse = usageResponse.extra_usage;
        }
        UsageWindow usageWindow6 = usageWindow5;
        ExtraUsageResponse extraUsageResponse2 = extraUsageResponse;
        return usageResponse.copy(usageWindow, usageWindow2, usageWindow3, usageWindow4, usageWindow6, extraUsageResponse2);
    }

    @onf(with = rme.class)
    public static /* synthetic */ void getExtra_usage$annotations() {
    }

    public static final /* synthetic */ void write$Self$api(UsageResponse self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.five_hour != null) {
            output.B(serialDesc, 0, bmi.a, self.five_hour);
        }
        if (output.E(serialDesc) || self.seven_day != null) {
            output.B(serialDesc, 1, bmi.a, self.seven_day);
        }
        if (output.E(serialDesc) || self.seven_day_opus != null) {
            output.B(serialDesc, 2, bmi.a, self.seven_day_opus);
        }
        if (output.E(serialDesc) || self.seven_day_sonnet != null) {
            output.B(serialDesc, 3, bmi.a, self.seven_day_sonnet);
        }
        if (output.E(serialDesc) || self.seven_day_cowork != null) {
            output.B(serialDesc, 4, bmi.a, self.seven_day_cowork);
        }
        if (!output.E(serialDesc) && self.extra_usage == null) {
            return;
        }
        output.B(serialDesc, 5, rme.a, self.extra_usage);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UsageWindow getFive_hour() {
        return this.five_hour;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UsageWindow getSeven_day() {
        return this.seven_day;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UsageWindow getSeven_day_opus() {
        return this.seven_day_opus;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final UsageWindow getSeven_day_sonnet() {
        return this.seven_day_sonnet;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final UsageWindow getSeven_day_cowork() {
        return this.seven_day_cowork;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ExtraUsageResponse getExtra_usage() {
        return this.extra_usage;
    }

    public final UsageResponse copy(UsageWindow five_hour, UsageWindow seven_day, UsageWindow seven_day_opus, UsageWindow seven_day_sonnet, UsageWindow seven_day_cowork, ExtraUsageResponse extra_usage) {
        return new UsageResponse(five_hour, seven_day, seven_day_opus, seven_day_sonnet, seven_day_cowork, extra_usage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UsageResponse)) {
            return false;
        }
        UsageResponse usageResponse = (UsageResponse) other;
        return x44.r(this.five_hour, usageResponse.five_hour) && x44.r(this.seven_day, usageResponse.seven_day) && x44.r(this.seven_day_opus, usageResponse.seven_day_opus) && x44.r(this.seven_day_sonnet, usageResponse.seven_day_sonnet) && x44.r(this.seven_day_cowork, usageResponse.seven_day_cowork) && x44.r(this.extra_usage, usageResponse.extra_usage);
    }

    public final ExtraUsageResponse getExtra_usage() {
        return this.extra_usage;
    }

    public final UsageWindow getFive_hour() {
        return this.five_hour;
    }

    public final UsageWindow getSeven_day() {
        return this.seven_day;
    }

    public final UsageWindow getSeven_day_cowork() {
        return this.seven_day_cowork;
    }

    public final UsageWindow getSeven_day_opus() {
        return this.seven_day_opus;
    }

    public final UsageWindow getSeven_day_sonnet() {
        return this.seven_day_sonnet;
    }

    public int hashCode() {
        UsageWindow usageWindow = this.five_hour;
        int iHashCode = (usageWindow == null ? 0 : usageWindow.hashCode()) * 31;
        UsageWindow usageWindow2 = this.seven_day;
        int iHashCode2 = (iHashCode + (usageWindow2 == null ? 0 : usageWindow2.hashCode())) * 31;
        UsageWindow usageWindow3 = this.seven_day_opus;
        int iHashCode3 = (iHashCode2 + (usageWindow3 == null ? 0 : usageWindow3.hashCode())) * 31;
        UsageWindow usageWindow4 = this.seven_day_sonnet;
        int iHashCode4 = (iHashCode3 + (usageWindow4 == null ? 0 : usageWindow4.hashCode())) * 31;
        UsageWindow usageWindow5 = this.seven_day_cowork;
        int iHashCode5 = (iHashCode4 + (usageWindow5 == null ? 0 : usageWindow5.hashCode())) * 31;
        ExtraUsageResponse extraUsageResponse = this.extra_usage;
        return iHashCode5 + (extraUsageResponse != null ? extraUsageResponse.hashCode() : 0);
    }

    public String toString() {
        return "UsageResponse(five_hour=" + this.five_hour + ", seven_day=" + this.seven_day + ", seven_day_opus=" + this.seven_day_opus + ", seven_day_sonnet=" + this.seven_day_sonnet + ", seven_day_cowork=" + this.seven_day_cowork + ", extra_usage=" + this.extra_usage + ")";
    }

    public UsageResponse() {
        this((UsageWindow) null, (UsageWindow) null, (UsageWindow) null, (UsageWindow) null, (UsageWindow) null, (ExtraUsageResponse) null, 63, (mq5) null);
    }

    public UsageResponse(UsageWindow usageWindow, UsageWindow usageWindow2, UsageWindow usageWindow3, UsageWindow usageWindow4, UsageWindow usageWindow5, ExtraUsageResponse extraUsageResponse) {
        this.five_hour = usageWindow;
        this.seven_day = usageWindow2;
        this.seven_day_opus = usageWindow3;
        this.seven_day_sonnet = usageWindow4;
        this.seven_day_cowork = usageWindow5;
        this.extra_usage = extraUsageResponse;
    }

    public /* synthetic */ UsageResponse(UsageWindow usageWindow, UsageWindow usageWindow2, UsageWindow usageWindow3, UsageWindow usageWindow4, UsageWindow usageWindow5, ExtraUsageResponse extraUsageResponse, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : usageWindow, (i & 2) != 0 ? null : usageWindow2, (i & 4) != 0 ? null : usageWindow3, (i & 8) != 0 ? null : usageWindow4, (i & 16) != 0 ? null : usageWindow5, (i & 32) != 0 ? null : extraUsageResponse);
    }
}
