package com.anthropic.claude.api.notification;

import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.xh2;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lcom/anthropic/claude/api/notification/ChannelPreference;", "", "", "enable_email", "enable_push", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/notification/ChannelPreference;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/anthropic/claude/api/notification/ChannelPreference;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getEnable_email", "getEnable_push", "Companion", "wh2", "xh2", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChannelPreference {
    public static final int $stable = 0;
    public static final xh2 Companion = new xh2();
    private final Boolean enable_email;
    private final Boolean enable_push;

    public /* synthetic */ ChannelPreference(int i, Boolean bool, Boolean bool2, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.enable_email = null;
        } else {
            this.enable_email = bool;
        }
        if ((i & 2) == 0) {
            this.enable_push = null;
        } else {
            this.enable_push = bool2;
        }
    }

    public static /* synthetic */ ChannelPreference copy$default(ChannelPreference channelPreference, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = channelPreference.enable_email;
        }
        if ((i & 2) != 0) {
            bool2 = channelPreference.enable_push;
        }
        return channelPreference.copy(bool, bool2);
    }

    public static final /* synthetic */ void write$Self$api(ChannelPreference self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.enable_email != null) {
            output.B(serialDesc, 0, zt1.a, self.enable_email);
        }
        if (!output.E(serialDesc) && self.enable_push == null) {
            return;
        }
        output.B(serialDesc, 1, zt1.a, self.enable_push);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getEnable_email() {
        return this.enable_email;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getEnable_push() {
        return this.enable_push;
    }

    public final ChannelPreference copy(Boolean enable_email, Boolean enable_push) {
        return new ChannelPreference(enable_email, enable_push);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelPreference)) {
            return false;
        }
        ChannelPreference channelPreference = (ChannelPreference) other;
        return x44.r(this.enable_email, channelPreference.enable_email) && x44.r(this.enable_push, channelPreference.enable_push);
    }

    public final Boolean getEnable_email() {
        return this.enable_email;
    }

    public final Boolean getEnable_push() {
        return this.enable_push;
    }

    public int hashCode() {
        Boolean bool = this.enable_email;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.enable_push;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "ChannelPreference(enable_email=" + this.enable_email + ", enable_push=" + this.enable_push + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelPreference() {
        this((Boolean) null, (Boolean) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
    }

    public ChannelPreference(Boolean bool, Boolean bool2) {
        this.enable_email = bool;
        this.enable_push = bool2;
    }

    public /* synthetic */ ChannelPreference(Boolean bool, Boolean bool2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2);
    }
}
