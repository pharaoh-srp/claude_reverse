package com.anthropic.claude.api.common;

import defpackage.jq3;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0003$%&B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/api/common/CloudflareWaitingRoomResponse;", "", "Lcom/anthropic/claude/api/common/CloudflareWaitingRoomResponse$WaitingRoom;", "cfWaitingRoom", "<init>", "(Lcom/anthropic/claude/api/common/CloudflareWaitingRoomResponse$WaitingRoom;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/common/CloudflareWaitingRoomResponse$WaitingRoom;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/common/CloudflareWaitingRoomResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/common/CloudflareWaitingRoomResponse$WaitingRoom;", "copy", "(Lcom/anthropic/claude/api/common/CloudflareWaitingRoomResponse$WaitingRoom;)Lcom/anthropic/claude/api/common/CloudflareWaitingRoomResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/common/CloudflareWaitingRoomResponse$WaitingRoom;", "getCfWaitingRoom", "Companion", "WaitingRoom", "com/anthropic/claude/api/common/a", "jq3", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CloudflareWaitingRoomResponse {
    public static final int $stable = 0;
    public static final jq3 Companion = new jq3();
    private final WaitingRoom cfWaitingRoom;

    public /* synthetic */ CloudflareWaitingRoomResponse(int i, WaitingRoom waitingRoom, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.cfWaitingRoom = null;
        } else {
            this.cfWaitingRoom = waitingRoom;
        }
    }

    public static /* synthetic */ CloudflareWaitingRoomResponse copy$default(CloudflareWaitingRoomResponse cloudflareWaitingRoomResponse, WaitingRoom waitingRoom, int i, Object obj) {
        if ((i & 1) != 0) {
            waitingRoom = cloudflareWaitingRoomResponse.cfWaitingRoom;
        }
        return cloudflareWaitingRoomResponse.copy(waitingRoom);
    }

    public static final /* synthetic */ void write$Self$api(CloudflareWaitingRoomResponse self, vd4 output, SerialDescriptor serialDesc) {
        if (!output.E(serialDesc) && self.cfWaitingRoom == null) {
            return;
        }
        output.B(serialDesc, 0, b.a, self.cfWaitingRoom);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WaitingRoom getCfWaitingRoom() {
        return this.cfWaitingRoom;
    }

    public final CloudflareWaitingRoomResponse copy(WaitingRoom cfWaitingRoom) {
        return new CloudflareWaitingRoomResponse(cfWaitingRoom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CloudflareWaitingRoomResponse) && x44.r(this.cfWaitingRoom, ((CloudflareWaitingRoomResponse) other).cfWaitingRoom);
    }

    public final WaitingRoom getCfWaitingRoom() {
        return this.cfWaitingRoom;
    }

    public int hashCode() {
        WaitingRoom waitingRoom = this.cfWaitingRoom;
        if (waitingRoom == null) {
            return 0;
        }
        return waitingRoom.hashCode();
    }

    public String toString() {
        return "CloudflareWaitingRoomResponse(cfWaitingRoom=" + this.cfWaitingRoom + ")";
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/anthropic/claude/api/common/CloudflareWaitingRoomResponse$WaitingRoom;", "", "", "inWaitingRoom", "<init>", "(Ljava/lang/Boolean;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/common/CloudflareWaitingRoomResponse$WaitingRoom;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Boolean;)Lcom/anthropic/claude/api/common/CloudflareWaitingRoomResponse$WaitingRoom;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getInWaitingRoom", "Companion", "com/anthropic/claude/api/common/b", "com/anthropic/claude/api/common/c", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class WaitingRoom {
        public static final int $stable = 0;
        public static final c Companion = new c();
        private final Boolean inWaitingRoom;

        public /* synthetic */ WaitingRoom(int i, Boolean bool, vnf vnfVar) {
            if ((i & 1) == 0) {
                this.inWaitingRoom = null;
            } else {
                this.inWaitingRoom = bool;
            }
        }

        public static /* synthetic */ WaitingRoom copy$default(WaitingRoom waitingRoom, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = waitingRoom.inWaitingRoom;
            }
            return waitingRoom.copy(bool);
        }

        public static final /* synthetic */ void write$Self$api(WaitingRoom self, vd4 output, SerialDescriptor serialDesc) {
            if (!output.E(serialDesc) && self.inWaitingRoom == null) {
                return;
            }
            output.B(serialDesc, 0, zt1.a, self.inWaitingRoom);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getInWaitingRoom() {
            return this.inWaitingRoom;
        }

        public final WaitingRoom copy(Boolean inWaitingRoom) {
            return new WaitingRoom(inWaitingRoom);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WaitingRoom) && x44.r(this.inWaitingRoom, ((WaitingRoom) other).inWaitingRoom);
        }

        public final Boolean getInWaitingRoom() {
            return this.inWaitingRoom;
        }

        public int hashCode() {
            Boolean bool = this.inWaitingRoom;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public String toString() {
            return "WaitingRoom(inWaitingRoom=" + this.inWaitingRoom + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public WaitingRoom() {
            this((Boolean) null, 1, (mq5) (0 == true ? 1 : 0));
        }

        public WaitingRoom(Boolean bool) {
            this.inWaitingRoom = bool;
        }

        public /* synthetic */ WaitingRoom(Boolean bool, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? null : bool);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CloudflareWaitingRoomResponse() {
        this((WaitingRoom) null, 1, (mq5) (0 == true ? 1 : 0));
    }

    public CloudflareWaitingRoomResponse(WaitingRoom waitingRoom) {
        this.cfWaitingRoom = waitingRoom;
    }

    public /* synthetic */ CloudflareWaitingRoomResponse(WaitingRoom waitingRoom, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : waitingRoom);
    }
}
