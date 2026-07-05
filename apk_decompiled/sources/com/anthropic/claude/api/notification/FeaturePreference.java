package com.anthropic.claude.api.notification;

import defpackage.mdj;
import defpackage.mq5;
import defpackage.og7;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.wh2;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000267B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBa\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJd\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b1\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b2\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b3\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b4\u0010\u001b¨\u00068"}, d2 = {"Lcom/anthropic/claude/api/notification/FeaturePreference;", "", "Lcom/anthropic/claude/api/notification/ChannelPreference;", "compass", "completion", "bogosort", "code_requires_action", "hearth_session_mentioned", "dispatch", "marketing", "<init>", "(Lcom/anthropic/claude/api/notification/ChannelPreference;Lcom/anthropic/claude/api/notification/ChannelPreference;Lcom/anthropic/claude/api/notification/ChannelPreference;Lcom/anthropic/claude/api/notification/ChannelPreference;Lcom/anthropic/claude/api/notification/ChannelPreference;Lcom/anthropic/claude/api/notification/ChannelPreference;Lcom/anthropic/claude/api/notification/ChannelPreference;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/notification/ChannelPreference;Lcom/anthropic/claude/api/notification/ChannelPreference;Lcom/anthropic/claude/api/notification/ChannelPreference;Lcom/anthropic/claude/api/notification/ChannelPreference;Lcom/anthropic/claude/api/notification/ChannelPreference;Lcom/anthropic/claude/api/notification/ChannelPreference;Lcom/anthropic/claude/api/notification/ChannelPreference;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/notification/FeaturePreference;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/notification/ChannelPreference;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/anthropic/claude/api/notification/ChannelPreference;Lcom/anthropic/claude/api/notification/ChannelPreference;Lcom/anthropic/claude/api/notification/ChannelPreference;Lcom/anthropic/claude/api/notification/ChannelPreference;Lcom/anthropic/claude/api/notification/ChannelPreference;Lcom/anthropic/claude/api/notification/ChannelPreference;Lcom/anthropic/claude/api/notification/ChannelPreference;)Lcom/anthropic/claude/api/notification/FeaturePreference;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/notification/ChannelPreference;", "getCompass", "getCompletion", "getBogosort", "getCode_requires_action", "getHearth_session_mentioned", "getDispatch", "getMarketing", "Companion", "ng7", "og7", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class FeaturePreference {
    public static final int $stable = 0;
    public static final og7 Companion = new og7();
    private final ChannelPreference bogosort;
    private final ChannelPreference code_requires_action;
    private final ChannelPreference compass;
    private final ChannelPreference completion;
    private final ChannelPreference dispatch;
    private final ChannelPreference hearth_session_mentioned;
    private final ChannelPreference marketing;

    public /* synthetic */ FeaturePreference(int i, ChannelPreference channelPreference, ChannelPreference channelPreference2, ChannelPreference channelPreference3, ChannelPreference channelPreference4, ChannelPreference channelPreference5, ChannelPreference channelPreference6, ChannelPreference channelPreference7, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.compass = null;
        } else {
            this.compass = channelPreference;
        }
        if ((i & 2) == 0) {
            this.completion = null;
        } else {
            this.completion = channelPreference2;
        }
        if ((i & 4) == 0) {
            this.bogosort = null;
        } else {
            this.bogosort = channelPreference3;
        }
        if ((i & 8) == 0) {
            this.code_requires_action = null;
        } else {
            this.code_requires_action = channelPreference4;
        }
        if ((i & 16) == 0) {
            this.hearth_session_mentioned = null;
        } else {
            this.hearth_session_mentioned = channelPreference5;
        }
        if ((i & 32) == 0) {
            this.dispatch = null;
        } else {
            this.dispatch = channelPreference6;
        }
        if ((i & 64) == 0) {
            this.marketing = null;
        } else {
            this.marketing = channelPreference7;
        }
    }

    public static /* synthetic */ FeaturePreference copy$default(FeaturePreference featurePreference, ChannelPreference channelPreference, ChannelPreference channelPreference2, ChannelPreference channelPreference3, ChannelPreference channelPreference4, ChannelPreference channelPreference5, ChannelPreference channelPreference6, ChannelPreference channelPreference7, int i, Object obj) {
        if ((i & 1) != 0) {
            channelPreference = featurePreference.compass;
        }
        if ((i & 2) != 0) {
            channelPreference2 = featurePreference.completion;
        }
        if ((i & 4) != 0) {
            channelPreference3 = featurePreference.bogosort;
        }
        if ((i & 8) != 0) {
            channelPreference4 = featurePreference.code_requires_action;
        }
        if ((i & 16) != 0) {
            channelPreference5 = featurePreference.hearth_session_mentioned;
        }
        if ((i & 32) != 0) {
            channelPreference6 = featurePreference.dispatch;
        }
        if ((i & 64) != 0) {
            channelPreference7 = featurePreference.marketing;
        }
        ChannelPreference channelPreference8 = channelPreference6;
        ChannelPreference channelPreference9 = channelPreference7;
        ChannelPreference channelPreference10 = channelPreference5;
        ChannelPreference channelPreference11 = channelPreference3;
        return featurePreference.copy(channelPreference, channelPreference2, channelPreference11, channelPreference4, channelPreference10, channelPreference8, channelPreference9);
    }

    public static final /* synthetic */ void write$Self$api(FeaturePreference self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.compass != null) {
            output.B(serialDesc, 0, wh2.a, self.compass);
        }
        if (output.E(serialDesc) || self.completion != null) {
            output.B(serialDesc, 1, wh2.a, self.completion);
        }
        if (output.E(serialDesc) || self.bogosort != null) {
            output.B(serialDesc, 2, wh2.a, self.bogosort);
        }
        if (output.E(serialDesc) || self.code_requires_action != null) {
            output.B(serialDesc, 3, wh2.a, self.code_requires_action);
        }
        if (output.E(serialDesc) || self.hearth_session_mentioned != null) {
            output.B(serialDesc, 4, wh2.a, self.hearth_session_mentioned);
        }
        if (output.E(serialDesc) || self.dispatch != null) {
            output.B(serialDesc, 5, wh2.a, self.dispatch);
        }
        if (!output.E(serialDesc) && self.marketing == null) {
            return;
        }
        output.B(serialDesc, 6, wh2.a, self.marketing);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ChannelPreference getCompass() {
        return this.compass;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ChannelPreference getCompletion() {
        return this.completion;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ChannelPreference getBogosort() {
        return this.bogosort;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ChannelPreference getCode_requires_action() {
        return this.code_requires_action;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ChannelPreference getHearth_session_mentioned() {
        return this.hearth_session_mentioned;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ChannelPreference getDispatch() {
        return this.dispatch;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ChannelPreference getMarketing() {
        return this.marketing;
    }

    public final FeaturePreference copy(ChannelPreference compass, ChannelPreference completion, ChannelPreference bogosort, ChannelPreference code_requires_action, ChannelPreference hearth_session_mentioned, ChannelPreference dispatch, ChannelPreference marketing) {
        return new FeaturePreference(compass, completion, bogosort, code_requires_action, hearth_session_mentioned, dispatch, marketing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeaturePreference)) {
            return false;
        }
        FeaturePreference featurePreference = (FeaturePreference) other;
        return x44.r(this.compass, featurePreference.compass) && x44.r(this.completion, featurePreference.completion) && x44.r(this.bogosort, featurePreference.bogosort) && x44.r(this.code_requires_action, featurePreference.code_requires_action) && x44.r(this.hearth_session_mentioned, featurePreference.hearth_session_mentioned) && x44.r(this.dispatch, featurePreference.dispatch) && x44.r(this.marketing, featurePreference.marketing);
    }

    public final ChannelPreference getBogosort() {
        return this.bogosort;
    }

    public final ChannelPreference getCode_requires_action() {
        return this.code_requires_action;
    }

    public final ChannelPreference getCompass() {
        return this.compass;
    }

    public final ChannelPreference getCompletion() {
        return this.completion;
    }

    public final ChannelPreference getDispatch() {
        return this.dispatch;
    }

    public final ChannelPreference getHearth_session_mentioned() {
        return this.hearth_session_mentioned;
    }

    public final ChannelPreference getMarketing() {
        return this.marketing;
    }

    public int hashCode() {
        ChannelPreference channelPreference = this.compass;
        int iHashCode = (channelPreference == null ? 0 : channelPreference.hashCode()) * 31;
        ChannelPreference channelPreference2 = this.completion;
        int iHashCode2 = (iHashCode + (channelPreference2 == null ? 0 : channelPreference2.hashCode())) * 31;
        ChannelPreference channelPreference3 = this.bogosort;
        int iHashCode3 = (iHashCode2 + (channelPreference3 == null ? 0 : channelPreference3.hashCode())) * 31;
        ChannelPreference channelPreference4 = this.code_requires_action;
        int iHashCode4 = (iHashCode3 + (channelPreference4 == null ? 0 : channelPreference4.hashCode())) * 31;
        ChannelPreference channelPreference5 = this.hearth_session_mentioned;
        int iHashCode5 = (iHashCode4 + (channelPreference5 == null ? 0 : channelPreference5.hashCode())) * 31;
        ChannelPreference channelPreference6 = this.dispatch;
        int iHashCode6 = (iHashCode5 + (channelPreference6 == null ? 0 : channelPreference6.hashCode())) * 31;
        ChannelPreference channelPreference7 = this.marketing;
        return iHashCode6 + (channelPreference7 != null ? channelPreference7.hashCode() : 0);
    }

    public String toString() {
        return "FeaturePreference(compass=" + this.compass + ", completion=" + this.completion + ", bogosort=" + this.bogosort + ", code_requires_action=" + this.code_requires_action + ", hearth_session_mentioned=" + this.hearth_session_mentioned + ", dispatch=" + this.dispatch + ", marketing=" + this.marketing + ")";
    }

    public FeaturePreference() {
        this((ChannelPreference) null, (ChannelPreference) null, (ChannelPreference) null, (ChannelPreference) null, (ChannelPreference) null, (ChannelPreference) null, (ChannelPreference) null, 127, (mq5) null);
    }

    public FeaturePreference(ChannelPreference channelPreference, ChannelPreference channelPreference2, ChannelPreference channelPreference3, ChannelPreference channelPreference4, ChannelPreference channelPreference5, ChannelPreference channelPreference6, ChannelPreference channelPreference7) {
        this.compass = channelPreference;
        this.completion = channelPreference2;
        this.bogosort = channelPreference3;
        this.code_requires_action = channelPreference4;
        this.hearth_session_mentioned = channelPreference5;
        this.dispatch = channelPreference6;
        this.marketing = channelPreference7;
    }

    public /* synthetic */ FeaturePreference(ChannelPreference channelPreference, ChannelPreference channelPreference2, ChannelPreference channelPreference3, ChannelPreference channelPreference4, ChannelPreference channelPreference5, ChannelPreference channelPreference6, ChannelPreference channelPreference7, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : channelPreference, (i & 2) != 0 ? null : channelPreference2, (i & 4) != 0 ? null : channelPreference3, (i & 8) != 0 ? null : channelPreference4, (i & 16) != 0 ? null : channelPreference5, (i & 32) != 0 ? null : channelPreference6, (i & 64) != 0 ? null : channelPreference7);
    }
}
