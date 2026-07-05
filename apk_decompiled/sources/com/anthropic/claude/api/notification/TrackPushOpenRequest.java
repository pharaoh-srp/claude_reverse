package com.anthropic.claude.api.notification;

import defpackage.a4i;
import defpackage.e79;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.z3i;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001b¨\u0006-"}, d2 = {"Lcom/anthropic/claude/api/notification/TrackPushOpenRequest;", "", "", "campaign_id", "", "message_id", "template_id", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/Integer;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/notification/TrackPushOpenRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "copy", "(ILjava/lang/String;Ljava/lang/Integer;)Lcom/anthropic/claude/api/notification/TrackPushOpenRequest;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCampaign_id", "Ljava/lang/String;", "getMessage_id", "Ljava/lang/Integer;", "getTemplate_id", "Companion", "z3i", "a4i", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class TrackPushOpenRequest {
    public static final int $stable = 0;
    public static final a4i Companion = new a4i();
    private final int campaign_id;
    private final String message_id;
    private final Integer template_id;

    public /* synthetic */ TrackPushOpenRequest(int i, int i2, String str, Integer num, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, z3i.a.getDescriptor());
            throw null;
        }
        this.campaign_id = i2;
        this.message_id = str;
        if ((i & 4) == 0) {
            this.template_id = null;
        } else {
            this.template_id = num;
        }
    }

    public static /* synthetic */ TrackPushOpenRequest copy$default(TrackPushOpenRequest trackPushOpenRequest, int i, String str, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = trackPushOpenRequest.campaign_id;
        }
        if ((i2 & 2) != 0) {
            str = trackPushOpenRequest.message_id;
        }
        if ((i2 & 4) != 0) {
            num = trackPushOpenRequest.template_id;
        }
        return trackPushOpenRequest.copy(i, str, num);
    }

    public static final /* synthetic */ void write$Self$api(TrackPushOpenRequest self, vd4 output, SerialDescriptor serialDesc) {
        output.l(0, self.campaign_id, serialDesc);
        output.q(serialDesc, 1, self.message_id);
        if (!output.E(serialDesc) && self.template_id == null) {
            return;
        }
        output.B(serialDesc, 2, e79.a, self.template_id);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCampaign_id() {
        return this.campaign_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage_id() {
        return this.message_id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getTemplate_id() {
        return this.template_id;
    }

    public final TrackPushOpenRequest copy(int campaign_id, String message_id, Integer template_id) {
        message_id.getClass();
        return new TrackPushOpenRequest(campaign_id, message_id, template_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackPushOpenRequest)) {
            return false;
        }
        TrackPushOpenRequest trackPushOpenRequest = (TrackPushOpenRequest) other;
        return this.campaign_id == trackPushOpenRequest.campaign_id && x44.r(this.message_id, trackPushOpenRequest.message_id) && x44.r(this.template_id, trackPushOpenRequest.template_id);
    }

    public final int getCampaign_id() {
        return this.campaign_id;
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final Integer getTemplate_id() {
        return this.template_id;
    }

    public int hashCode() {
        int iL = kgh.l(Integer.hashCode(this.campaign_id) * 31, 31, this.message_id);
        Integer num = this.template_id;
        return iL + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "TrackPushOpenRequest(campaign_id=" + this.campaign_id + ", message_id=" + this.message_id + ", template_id=" + this.template_id + ")";
    }

    public TrackPushOpenRequest(int i, String str, Integer num) {
        str.getClass();
        this.campaign_id = i;
        this.message_id = str;
        this.template_id = num;
    }

    public /* synthetic */ TrackPushOpenRequest(int i, String str, Integer num, int i2, mq5 mq5Var) {
        this(i, str, (i2 & 4) != 0 ? null : num);
    }
}
