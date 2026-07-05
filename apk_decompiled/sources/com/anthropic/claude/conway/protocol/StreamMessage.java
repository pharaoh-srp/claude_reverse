package com.anthropic.claude.conway.protocol;

import com.anthropic.claude.api.login.VerifyResponse;
import com.anthropic.claude.types.strings.ForkId;
import defpackage.aqg;
import defpackage.aw7;
import defpackage.grc;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nm6;
import defpackage.onf;
import defpackage.qy1;
import defpackage.rr4;
import defpackage.srg;
import defpackage.st4;
import defpackage.uh9;
import defpackage.uo0;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wq;
import defpackage.x44;
import defpackage.xv4;
import defpackage.y1g;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \f2\u00020\u0001:\u0015\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b\u0082\u0001\u0014\"#$%&\u0019'()*+,-./\u00140123¨\u00064À\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/conway/protocol/StreamMessage;", "", "", "getType", "()Ljava/lang/String;", "type", "", "getSeq", "()J", "seq", "getTs", "ts", "Companion", "Connected", "Heartbeat", "Error", "Goodbye", "Shutdown", "AgentsUpdated", "HealthProbe", "cqg", "ToolCall", "StatusLine", "ClientsChanged", "ExtensionsChanged", "bqg", "ForkCreated", "ForkJoined", "ForksSnapshot", "ClientPermissionRequest", "ClientPermissionResolved", "Ignored", "Unknown", "aqg", "Lcom/anthropic/claude/conway/protocol/StreamMessage$AgentsUpdated;", "Lcom/anthropic/claude/conway/protocol/StreamMessage$ClientPermissionRequest;", "Lcom/anthropic/claude/conway/protocol/StreamMessage$ClientPermissionResolved;", "Lcom/anthropic/claude/conway/protocol/StreamMessage$ClientsChanged;", "Lcom/anthropic/claude/conway/protocol/StreamMessage$Connected;", "Lcom/anthropic/claude/conway/protocol/StreamMessage$Error;", "Lcom/anthropic/claude/conway/protocol/StreamMessage$ExtensionsChanged;", "Lcom/anthropic/claude/conway/protocol/StreamMessage$ForkCreated;", "Lcom/anthropic/claude/conway/protocol/StreamMessage$ForkJoined;", "Lcom/anthropic/claude/conway/protocol/StreamMessage$ForksSnapshot;", "Lcom/anthropic/claude/conway/protocol/StreamMessage$Goodbye;", "Lcom/anthropic/claude/conway/protocol/StreamMessage$HealthProbe;", "Lcom/anthropic/claude/conway/protocol/StreamMessage$Heartbeat;", "Lcom/anthropic/claude/conway/protocol/StreamMessage$Ignored;", "Lcom/anthropic/claude/conway/protocol/StreamMessage$Shutdown;", "Lcom/anthropic/claude/conway/protocol/StreamMessage$StatusLine;", "Lcom/anthropic/claude/conway/protocol/StreamMessage$ToolCall;", "Lcom/anthropic/claude/conway/protocol/StreamMessage$Unknown;", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = y1.class)
public interface StreamMessage {
    public static final aqg Companion = aqg.a;

    long getSeq();

    long getTs();

    String getType();

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0017R\u0014\u0010+\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u001e¨\u0006/"}, d2 = {"Lcom/anthropic/claude/conway/protocol/StreamMessage$Heartbeat;", "Lcom/anthropic/claude/conway/protocol/StreamMessage;", "", "seq", "ts", "ack", "<init>", "(JJJ)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IJJJLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/StreamMessage$Heartbeat;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "component3", "copy", "(JJJ)Lcom/anthropic/claude/conway/protocol/StreamMessage$Heartbeat;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getSeq", "getTs", "getAck", "getType", "type", "Companion", "com/anthropic/claude/conway/protocol/m1", "com/anthropic/claude/conway/protocol/n1", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Heartbeat implements StreamMessage {
        public static final int $stable = 0;
        public static final n1 Companion = new n1();
        private final long ack;
        private final long seq;
        private final long ts;

        public /* synthetic */ Heartbeat(int i, long j, long j2, long j3, vnf vnfVar) {
            if ((i & 1) == 0) {
                this.seq = 0L;
            } else {
                this.seq = j;
            }
            if ((i & 2) == 0) {
                this.ts = 0L;
            } else {
                this.ts = j2;
            }
            if ((i & 4) == 0) {
                this.ack = 0L;
            } else {
                this.ack = j3;
            }
        }

        public static /* synthetic */ Heartbeat copy$default(Heartbeat heartbeat, long j, long j2, long j3, int i, Object obj) {
            if ((i & 1) != 0) {
                j = heartbeat.seq;
            }
            long j4 = j;
            if ((i & 2) != 0) {
                j2 = heartbeat.ts;
            }
            long j5 = j2;
            if ((i & 4) != 0) {
                j3 = heartbeat.ack;
            }
            return heartbeat.copy(j4, j5, j3);
        }

        public static final /* synthetic */ void write$Self$conway(Heartbeat self, vd4 output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || self.getSeq() != 0) {
                output.D(serialDesc, 0, self.getSeq());
            }
            if (output.E(serialDesc) || self.getTs() != 0) {
                output.D(serialDesc, 1, self.getTs());
            }
            if (!output.E(serialDesc) && self.ack == 0) {
                return;
            }
            output.D(serialDesc, 2, self.ack);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getSeq() {
            return this.seq;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTs() {
            return this.ts;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getAck() {
            return this.ack;
        }

        public final Heartbeat copy(long seq, long ts, long ack) {
            return new Heartbeat(seq, ts, ack);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Heartbeat)) {
                return false;
            }
            Heartbeat heartbeat = (Heartbeat) other;
            return this.seq == heartbeat.seq && this.ts == heartbeat.ts && this.ack == heartbeat.ack;
        }

        public final long getAck() {
            return this.ack;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public long getSeq() {
            return this.seq;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public long getTs() {
            return this.ts;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public String getType() {
            return "heartbeat";
        }

        public int hashCode() {
            return Long.hashCode(this.ack) + vb7.e(Long.hashCode(this.seq) * 31, 31, this.ts);
        }

        public String toString() {
            long j = this.seq;
            long j2 = this.ts;
            long j3 = this.ack;
            StringBuilder sbW = grc.w(j, "Heartbeat(seq=", ", ts=");
            sbW.append(j2);
            sbW.append(", ack=");
            sbW.append(j3);
            sbW.append(")");
            return sbW.toString();
        }

        public Heartbeat() {
            this(0L, 0L, 0L, 7, (mq5) null);
        }

        public Heartbeat(long j, long j2, long j3) {
            this.seq = j;
            this.ts = j2;
            this.ack = j3;
        }

        public /* synthetic */ Heartbeat(long j, long j2, long j3, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0L : j3);
        }
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tB;\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ4\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001cR\u0014\u0010/\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010!¨\u00063"}, d2 = {"Lcom/anthropic/claude/conway/protocol/StreamMessage$ClientsChanged;", "Lcom/anthropic/claude/conway/protocol/StreamMessage;", "", "seq", "ts", "", "Lcom/anthropic/claude/conway/protocol/ConwayClientInfo;", "clients", "<init>", "(JJLjava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IJJLjava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/StreamMessage$ClientsChanged;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "component3", "()Ljava/util/List;", "copy", "(JJLjava/util/List;)Lcom/anthropic/claude/conway/protocol/StreamMessage$ClientsChanged;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getSeq", "getTs", "Ljava/util/List;", "getClients", "getType", "type", "Companion", "com/anthropic/claude/conway/protocol/u0", "com/anthropic/claude/conway/protocol/v0", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ClientsChanged implements StreamMessage {
        public static final int $stable = 8;
        private final List<ConwayClientInfo> clients;
        private final long seq;
        private final long ts;
        public static final v0 Companion = new v0();
        private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new y1g(21))};

        public /* synthetic */ ClientsChanged(int i, long j, long j2, List list, vnf vnfVar) {
            if ((i & 1) == 0) {
                this.seq = 0L;
            } else {
                this.seq = j;
            }
            if ((i & 2) == 0) {
                this.ts = 0L;
            } else {
                this.ts = j2;
            }
            if ((i & 4) == 0) {
                this.clients = lm6.E;
            } else {
                this.clients = list;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new uo0(rr4.a, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ClientsChanged copy$default(ClientsChanged clientsChanged, long j, long j2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                j = clientsChanged.seq;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = clientsChanged.ts;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                list = clientsChanged.clients;
            }
            return clientsChanged.copy(j3, j4, list);
        }

        public static final /* synthetic */ void write$Self$conway(ClientsChanged self, vd4 output, SerialDescriptor serialDesc) {
            kw9[] kw9VarArr = $childSerializers;
            if (output.E(serialDesc) || self.getSeq() != 0) {
                output.D(serialDesc, 0, self.getSeq());
            }
            if (output.E(serialDesc) || self.getTs() != 0) {
                output.D(serialDesc, 1, self.getTs());
            }
            if (!output.E(serialDesc) && x44.r(self.clients, lm6.E)) {
                return;
            }
            output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.clients);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getSeq() {
            return this.seq;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTs() {
            return this.ts;
        }

        public final List<ConwayClientInfo> component3() {
            return this.clients;
        }

        public final ClientsChanged copy(long seq, long ts, List<ConwayClientInfo> clients) {
            clients.getClass();
            return new ClientsChanged(seq, ts, clients);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ClientsChanged)) {
                return false;
            }
            ClientsChanged clientsChanged = (ClientsChanged) other;
            return this.seq == clientsChanged.seq && this.ts == clientsChanged.ts && x44.r(this.clients, clientsChanged.clients);
        }

        public final List<ConwayClientInfo> getClients() {
            return this.clients;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public long getSeq() {
            return this.seq;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public long getTs() {
            return this.ts;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public String getType() {
            return "clients_changed";
        }

        public int hashCode() {
            return this.clients.hashCode() + vb7.e(Long.hashCode(this.seq) * 31, 31, this.ts);
        }

        public String toString() {
            long j = this.seq;
            long j2 = this.ts;
            List<ConwayClientInfo> list = this.clients;
            StringBuilder sbW = grc.w(j, "ClientsChanged(seq=", ", ts=");
            sbW.append(j2);
            sbW.append(", clients=");
            sbW.append(list);
            sbW.append(")");
            return sbW.toString();
        }

        public ClientsChanged() {
            this(0L, 0L, (List) null, 7, (mq5) null);
        }

        public ClientsChanged(long j, long j2, List<ConwayClientInfo> list) {
            list.getClass();
            this.seq = j;
            this.ts = j2;
            this.clients = list;
        }

        public /* synthetic */ ClientsChanged(long j, long j2, List list, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? lm6.E : list);
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001bR\u0014\u0010,\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u001b¨\u00060"}, d2 = {"Lcom/anthropic/claude/conway/protocol/StreamMessage$ExtensionsChanged;", "Lcom/anthropic/claude/conway/protocol/StreamMessage;", "", "seq", "ts", "", "extension", "<init>", "(JJLjava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IJJLjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/StreamMessage$ExtensionsChanged;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "component3", "()Ljava/lang/String;", "copy", "(JJLjava/lang/String;)Lcom/anthropic/claude/conway/protocol/StreamMessage$ExtensionsChanged;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getSeq", "getTs", "Ljava/lang/String;", "getExtension", "getType", "type", "Companion", "com/anthropic/claude/conway/protocol/a1", "com/anthropic/claude/conway/protocol/b1", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ExtensionsChanged implements StreamMessage {
        public static final int $stable = 0;
        public static final b1 Companion = new b1();
        private final String extension;
        private final long seq;
        private final long ts;

        public /* synthetic */ ExtensionsChanged(int i, long j, long j2, String str, vnf vnfVar) {
            if ((i & 1) == 0) {
                this.seq = 0L;
            } else {
                this.seq = j;
            }
            if ((i & 2) == 0) {
                this.ts = 0L;
            } else {
                this.ts = j2;
            }
            if ((i & 4) == 0) {
                this.extension = "";
            } else {
                this.extension = str;
            }
        }

        public static /* synthetic */ ExtensionsChanged copy$default(ExtensionsChanged extensionsChanged, long j, long j2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                j = extensionsChanged.seq;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = extensionsChanged.ts;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                str = extensionsChanged.extension;
            }
            return extensionsChanged.copy(j3, j4, str);
        }

        public static final /* synthetic */ void write$Self$conway(ExtensionsChanged self, vd4 output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || self.getSeq() != 0) {
                output.D(serialDesc, 0, self.getSeq());
            }
            if (output.E(serialDesc) || self.getTs() != 0) {
                output.D(serialDesc, 1, self.getTs());
            }
            if (!output.E(serialDesc) && x44.r(self.extension, "")) {
                return;
            }
            output.q(serialDesc, 2, self.extension);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getSeq() {
            return this.seq;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTs() {
            return this.ts;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getExtension() {
            return this.extension;
        }

        public final ExtensionsChanged copy(long seq, long ts, String extension) {
            extension.getClass();
            return new ExtensionsChanged(seq, ts, extension);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExtensionsChanged)) {
                return false;
            }
            ExtensionsChanged extensionsChanged = (ExtensionsChanged) other;
            return this.seq == extensionsChanged.seq && this.ts == extensionsChanged.ts && x44.r(this.extension, extensionsChanged.extension);
        }

        public final String getExtension() {
            return this.extension;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public long getSeq() {
            return this.seq;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public long getTs() {
            return this.ts;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public String getType() {
            return "extensions_changed";
        }

        public int hashCode() {
            return this.extension.hashCode() + vb7.e(Long.hashCode(this.seq) * 31, 31, this.ts);
        }

        public String toString() {
            long j = this.seq;
            long j2 = this.ts;
            String str = this.extension;
            StringBuilder sbW = grc.w(j, "ExtensionsChanged(seq=", ", ts=");
            qy1.m(j2, ", extension=", str, sbW);
            sbW.append(")");
            return sbW.toString();
        }

        public ExtensionsChanged() {
            this(0L, 0L, (String) null, 7, (mq5) null);
        }

        public ExtensionsChanged(long j, long j2, String str) {
            str.getClass();
            this.seq = j;
            this.ts = j2;
            this.extension = str;
        }

        public /* synthetic */ ExtensionsChanged(long j, long j2, String str, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? "" : str);
        }
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tB;\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ4\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0019R&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001cR\u0014\u00101\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010!¨\u00065"}, d2 = {"Lcom/anthropic/claude/conway/protocol/StreamMessage$ForksSnapshot;", "Lcom/anthropic/claude/conway/protocol/StreamMessage;", "", "seq", "ts", "", "Lcom/anthropic/claude/conway/protocol/ConwayForkMeta;", "forks", "<init>", "(JJLjava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IJJLjava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/StreamMessage$ForksSnapshot;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "component3", "()Ljava/util/List;", "copy", "(JJLjava/util/List;)Lcom/anthropic/claude/conway/protocol/StreamMessage$ForksSnapshot;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getSeq", "getTs", "Ljava/util/List;", "getForks", "getForks$annotations", "()V", "getType", "type", "Companion", "com/anthropic/claude/conway/protocol/g1", "com/anthropic/claude/conway/protocol/h1", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ForksSnapshot implements StreamMessage {
        public static final int $stable = 8;
        private final List<ConwayForkMeta> forks;
        private final long seq;
        private final long ts;
        public static final h1 Companion = new h1();
        private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new y1g(22))};

        public /* synthetic */ ForksSnapshot(int i, long j, long j2, List list, vnf vnfVar) {
            if ((i & 1) == 0) {
                this.seq = 0L;
            } else {
                this.seq = j;
            }
            if ((i & 2) == 0) {
                this.ts = 0L;
            } else {
                this.ts = j2;
            }
            if ((i & 4) == 0) {
                this.forks = lm6.E;
            } else {
                this.forks = list;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new uo0(xv4.a, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ForksSnapshot copy$default(ForksSnapshot forksSnapshot, long j, long j2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                j = forksSnapshot.seq;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = forksSnapshot.ts;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                list = forksSnapshot.forks;
            }
            return forksSnapshot.copy(j3, j4, list);
        }

        public static /* synthetic */ void getForks$annotations() {
        }

        public static final /* synthetic */ void write$Self$conway(ForksSnapshot self, vd4 output, SerialDescriptor serialDesc) {
            kw9[] kw9VarArr = $childSerializers;
            if (output.E(serialDesc) || self.getSeq() != 0) {
                output.D(serialDesc, 0, self.getSeq());
            }
            if (output.E(serialDesc) || self.getTs() != 0) {
                output.D(serialDesc, 1, self.getTs());
            }
            if (!output.E(serialDesc) && x44.r(self.forks, lm6.E)) {
                return;
            }
            output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.forks);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getSeq() {
            return this.seq;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTs() {
            return this.ts;
        }

        public final List<ConwayForkMeta> component3() {
            return this.forks;
        }

        public final ForksSnapshot copy(long seq, long ts, List<ConwayForkMeta> forks) {
            forks.getClass();
            return new ForksSnapshot(seq, ts, forks);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ForksSnapshot)) {
                return false;
            }
            ForksSnapshot forksSnapshot = (ForksSnapshot) other;
            return this.seq == forksSnapshot.seq && this.ts == forksSnapshot.ts && x44.r(this.forks, forksSnapshot.forks);
        }

        public final List<ConwayForkMeta> getForks() {
            return this.forks;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public long getSeq() {
            return this.seq;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public long getTs() {
            return this.ts;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public String getType() {
            return "forks_snapshot";
        }

        public int hashCode() {
            return this.forks.hashCode() + vb7.e(Long.hashCode(this.seq) * 31, 31, this.ts);
        }

        public String toString() {
            long j = this.seq;
            long j2 = this.ts;
            List<ConwayForkMeta> list = this.forks;
            StringBuilder sbW = grc.w(j, "ForksSnapshot(seq=", ", ts=");
            sbW.append(j2);
            sbW.append(", forks=");
            sbW.append(list);
            sbW.append(")");
            return sbW.toString();
        }

        public ForksSnapshot() {
            this(0L, 0L, (List) null, 7, (mq5) null);
        }

        public ForksSnapshot(long j, long j2, List<ConwayForkMeta> list) {
            list.getClass();
            this.seq = j;
            this.ts = j2;
            this.forks = list;
        }

        public /* synthetic */ ForksSnapshot(long j, long j2, List list, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? lm6.E : list);
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001bR\u0014\u0010,\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u001b¨\u00060"}, d2 = {"Lcom/anthropic/claude/conway/protocol/StreamMessage$Goodbye;", "Lcom/anthropic/claude/conway/protocol/StreamMessage;", "", "seq", "ts", "", "reason", "<init>", "(JJLjava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IJJLjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/StreamMessage$Goodbye;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "component3", "()Ljava/lang/String;", "copy", "(JJLjava/lang/String;)Lcom/anthropic/claude/conway/protocol/StreamMessage$Goodbye;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getSeq", "getTs", "Ljava/lang/String;", "getReason", "getType", "type", "Companion", "com/anthropic/claude/conway/protocol/i1", "com/anthropic/claude/conway/protocol/j1", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Goodbye implements StreamMessage {
        public static final int $stable = 0;
        public static final j1 Companion = new j1();
        private final String reason;
        private final long seq;
        private final long ts;

        public /* synthetic */ Goodbye(int i, long j, long j2, String str, vnf vnfVar) {
            if ((i & 1) == 0) {
                this.seq = 0L;
            } else {
                this.seq = j;
            }
            if ((i & 2) == 0) {
                this.ts = 0L;
            } else {
                this.ts = j2;
            }
            if ((i & 4) == 0) {
                this.reason = "";
            } else {
                this.reason = str;
            }
        }

        public static /* synthetic */ Goodbye copy$default(Goodbye goodbye, long j, long j2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                j = goodbye.seq;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = goodbye.ts;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                str = goodbye.reason;
            }
            return goodbye.copy(j3, j4, str);
        }

        public static final /* synthetic */ void write$Self$conway(Goodbye self, vd4 output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || self.getSeq() != 0) {
                output.D(serialDesc, 0, self.getSeq());
            }
            if (output.E(serialDesc) || self.getTs() != 0) {
                output.D(serialDesc, 1, self.getTs());
            }
            if (!output.E(serialDesc) && x44.r(self.reason, "")) {
                return;
            }
            output.q(serialDesc, 2, self.reason);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getSeq() {
            return this.seq;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTs() {
            return this.ts;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        public final Goodbye copy(long seq, long ts, String reason) {
            reason.getClass();
            return new Goodbye(seq, ts, reason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Goodbye)) {
                return false;
            }
            Goodbye goodbye = (Goodbye) other;
            return this.seq == goodbye.seq && this.ts == goodbye.ts && x44.r(this.reason, goodbye.reason);
        }

        public final String getReason() {
            return this.reason;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public long getSeq() {
            return this.seq;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public long getTs() {
            return this.ts;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public String getType() {
            return "goodbye";
        }

        public int hashCode() {
            return this.reason.hashCode() + vb7.e(Long.hashCode(this.seq) * 31, 31, this.ts);
        }

        public String toString() {
            long j = this.seq;
            long j2 = this.ts;
            String str = this.reason;
            StringBuilder sbW = grc.w(j, "Goodbye(seq=", ", ts=");
            qy1.m(j2, ", reason=", str, sbW);
            sbW.append(")");
            return sbW.toString();
        }

        public Goodbye() {
            this(0L, 0L, (String) null, 7, (mq5) null);
        }

        public Goodbye(long j, long j2, String str) {
            str.getClass();
            this.seq = j;
            this.ts = j2;
            this.reason = str;
        }

        public /* synthetic */ Goodbye(long j, long j2, String str, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? "" : str);
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001bR\u0014\u0010.\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010 ¨\u00062"}, d2 = {"Lcom/anthropic/claude/conway/protocol/StreamMessage$Error;", "Lcom/anthropic/claude/conway/protocol/StreamMessage;", "", "seq", "ts", "Lcom/anthropic/claude/conway/protocol/ConwayErrorPayload;", "error", "<init>", "(JJLcom/anthropic/claude/conway/protocol/ConwayErrorPayload;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IJJLcom/anthropic/claude/conway/protocol/ConwayErrorPayload;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/StreamMessage$Error;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "component3", "()Lcom/anthropic/claude/conway/protocol/ConwayErrorPayload;", "copy", "(JJLcom/anthropic/claude/conway/protocol/ConwayErrorPayload;)Lcom/anthropic/claude/conway/protocol/StreamMessage$Error;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getSeq", "getTs", "Lcom/anthropic/claude/conway/protocol/ConwayErrorPayload;", "getError", "getType", "type", "Companion", "com/anthropic/claude/conway/protocol/y0", "com/anthropic/claude/conway/protocol/z0", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Error implements StreamMessage {
        public static final int $stable = 8;
        public static final z0 Companion = new z0();
        private final ConwayErrorPayload error;
        private final long seq;
        private final long ts;

        public /* synthetic */ Error(int i, long j, long j2, ConwayErrorPayload conwayErrorPayload, vnf vnfVar) {
            if (4 != (i & 4)) {
                gvj.f(i, 4, y0.a.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.seq = 0L;
            } else {
                this.seq = j;
            }
            if ((i & 2) == 0) {
                this.ts = 0L;
            } else {
                this.ts = j2;
            }
            this.error = conwayErrorPayload;
        }

        public static /* synthetic */ Error copy$default(Error error, long j, long j2, ConwayErrorPayload conwayErrorPayload, int i, Object obj) {
            if ((i & 1) != 0) {
                j = error.seq;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = error.ts;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                conwayErrorPayload = error.error;
            }
            return error.copy(j3, j4, conwayErrorPayload);
        }

        public static final /* synthetic */ void write$Self$conway(Error self, vd4 output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || self.getSeq() != 0) {
                output.D(serialDesc, 0, self.getSeq());
            }
            if (output.E(serialDesc) || self.getTs() != 0) {
                output.D(serialDesc, 1, self.getTs());
            }
            output.r(serialDesc, 2, st4.a, self.error);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getSeq() {
            return this.seq;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTs() {
            return this.ts;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ConwayErrorPayload getError() {
            return this.error;
        }

        public final Error copy(long seq, long ts, ConwayErrorPayload error) {
            error.getClass();
            return new Error(seq, ts, error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return this.seq == error.seq && this.ts == error.ts && x44.r(this.error, error.error);
        }

        public final ConwayErrorPayload getError() {
            return this.error;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public long getSeq() {
            return this.seq;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public long getTs() {
            return this.ts;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public String getType() {
            return "error";
        }

        public int hashCode() {
            return this.error.hashCode() + vb7.e(Long.hashCode(this.seq) * 31, 31, this.ts);
        }

        public String toString() {
            long j = this.seq;
            long j2 = this.ts;
            ConwayErrorPayload conwayErrorPayload = this.error;
            StringBuilder sbW = grc.w(j, "Error(seq=", ", ts=");
            sbW.append(j2);
            sbW.append(", error=");
            sbW.append(conwayErrorPayload);
            sbW.append(")");
            return sbW.toString();
        }

        public Error(long j, long j2, ConwayErrorPayload conwayErrorPayload) {
            conwayErrorPayload.getClass();
            this.seq = j;
            this.ts = j2;
            this.error = conwayErrorPayload;
        }

        public /* synthetic */ Error(long j, long j2, ConwayErrorPayload conwayErrorPayload, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, conwayErrorPayload);
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0018R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001bR\u0014\u0010.\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u001b¨\u00062"}, d2 = {"Lcom/anthropic/claude/conway/protocol/StreamMessage$HealthProbe;", "Lcom/anthropic/claude/conway/protocol/StreamMessage;", "", "seq", "ts", "", "probeId", "<init>", "(JJLjava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IJJLjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/StreamMessage$HealthProbe;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "component3", "()Ljava/lang/String;", "copy", "(JJLjava/lang/String;)Lcom/anthropic/claude/conway/protocol/StreamMessage$HealthProbe;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getSeq", "getTs", "Ljava/lang/String;", "getProbeId", "getProbeId$annotations", "()V", "getType", "type", "Companion", "com/anthropic/claude/conway/protocol/k1", "com/anthropic/claude/conway/protocol/l1", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class HealthProbe implements StreamMessage {
        public static final int $stable = 0;
        public static final l1 Companion = new l1();
        private final String probeId;
        private final long seq;
        private final long ts;

        public /* synthetic */ HealthProbe(int i, long j, long j2, String str, vnf vnfVar) {
            if (4 != (i & 4)) {
                gvj.f(i, 4, k1.a.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.seq = 0L;
            } else {
                this.seq = j;
            }
            if ((i & 2) == 0) {
                this.ts = 0L;
            } else {
                this.ts = j2;
            }
            this.probeId = str;
        }

        public static /* synthetic */ HealthProbe copy$default(HealthProbe healthProbe, long j, long j2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                j = healthProbe.seq;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = healthProbe.ts;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                str = healthProbe.probeId;
            }
            return healthProbe.copy(j3, j4, str);
        }

        public static /* synthetic */ void getProbeId$annotations() {
        }

        public static final /* synthetic */ void write$Self$conway(HealthProbe self, vd4 output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || self.getSeq() != 0) {
                output.D(serialDesc, 0, self.getSeq());
            }
            if (output.E(serialDesc) || self.getTs() != 0) {
                output.D(serialDesc, 1, self.getTs());
            }
            output.q(serialDesc, 2, self.probeId);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getSeq() {
            return this.seq;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTs() {
            return this.ts;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getProbeId() {
            return this.probeId;
        }

        public final HealthProbe copy(long seq, long ts, String probeId) {
            probeId.getClass();
            return new HealthProbe(seq, ts, probeId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HealthProbe)) {
                return false;
            }
            HealthProbe healthProbe = (HealthProbe) other;
            return this.seq == healthProbe.seq && this.ts == healthProbe.ts && x44.r(this.probeId, healthProbe.probeId);
        }

        public final String getProbeId() {
            return this.probeId;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public long getSeq() {
            return this.seq;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public long getTs() {
            return this.ts;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public String getType() {
            return "health_probe";
        }

        public int hashCode() {
            return this.probeId.hashCode() + vb7.e(Long.hashCode(this.seq) * 31, 31, this.ts);
        }

        public String toString() {
            long j = this.seq;
            long j2 = this.ts;
            String str = this.probeId;
            StringBuilder sbW = grc.w(j, "HealthProbe(seq=", ", ts=");
            qy1.m(j2, ", probeId=", str, sbW);
            sbW.append(")");
            return sbW.toString();
        }

        public HealthProbe(long j, long j2, String str) {
            str.getClass();
            this.seq = j;
            this.ts = j2;
            this.probeId = str;
        }

        public /* synthetic */ HealthProbe(long j, long j2, String str, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, str);
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b*\u0010\u001a¨\u0006."}, d2 = {"Lcom/anthropic/claude/conway/protocol/StreamMessage$Ignored;", "Lcom/anthropic/claude/conway/protocol/StreamMessage;", "", "type", "", "seq", "ts", "<init>", "(Ljava/lang/String;JJ)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;JJLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/StreamMessage$Ignored;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "copy", "(Ljava/lang/String;JJ)Lcom/anthropic/claude/conway/protocol/StreamMessage$Ignored;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "J", "getSeq", "getTs", "Companion", "com/anthropic/claude/conway/protocol/o1", "com/anthropic/claude/conway/protocol/p1", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Ignored implements StreamMessage {
        public static final int $stable = 0;
        public static final p1 Companion = new p1();
        private final long seq;
        private final long ts;
        private final String type;

        public /* synthetic */ Ignored(int i, String str, long j, long j2, vnf vnfVar) {
            if (1 != (i & 1)) {
                gvj.f(i, 1, o1.a.getDescriptor());
                throw null;
            }
            this.type = str;
            if ((i & 2) == 0) {
                this.seq = 0L;
            } else {
                this.seq = j;
            }
            if ((i & 4) == 0) {
                this.ts = 0L;
            } else {
                this.ts = j2;
            }
        }

        public static /* synthetic */ Ignored copy$default(Ignored ignored, String str, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ignored.type;
            }
            if ((i & 2) != 0) {
                j = ignored.seq;
            }
            if ((i & 4) != 0) {
                j2 = ignored.ts;
            }
            return ignored.copy(str, j, j2);
        }

        public static final /* synthetic */ void write$Self$conway(Ignored self, vd4 output, SerialDescriptor serialDesc) {
            output.q(serialDesc, 0, self.getType());
            if (output.E(serialDesc) || self.getSeq() != 0) {
                output.D(serialDesc, 1, self.getSeq());
            }
            if (!output.E(serialDesc) && self.getTs() == 0) {
                return;
            }
            output.D(serialDesc, 2, self.getTs());
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getSeq() {
            return this.seq;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getTs() {
            return this.ts;
        }

        public final Ignored copy(String type, long seq, long ts) {
            type.getClass();
            return new Ignored(type, seq, ts);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ignored)) {
                return false;
            }
            Ignored ignored = (Ignored) other;
            return x44.r(this.type, ignored.type) && this.seq == ignored.seq && this.ts == ignored.ts;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public long getSeq() {
            return this.seq;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public long getTs() {
            return this.ts;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            return Long.hashCode(this.ts) + vb7.e(this.type.hashCode() * 31, 31, this.seq);
        }

        public String toString() {
            String str = this.type;
            long j = this.seq;
            long j2 = this.ts;
            StringBuilder sbW = vb7.w("Ignored(type=", str, ", seq=", j);
            sbW.append(", ts=");
            sbW.append(j2);
            sbW.append(")");
            return sbW.toString();
        }

        public Ignored(String str, long j, long j2) {
            str.getClass();
            this.type = str;
            this.seq = j;
            this.ts = j2;
        }

        public /* synthetic */ Ignored(String str, long j, long j2, int i, mq5 mq5Var) {
            this(str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? 0L : j2);
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b*\u0010\u001a¨\u0006."}, d2 = {"Lcom/anthropic/claude/conway/protocol/StreamMessage$Unknown;", "Lcom/anthropic/claude/conway/protocol/StreamMessage;", "", "type", "", "seq", "ts", "<init>", "(Ljava/lang/String;JJ)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;JJLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/StreamMessage$Unknown;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "copy", "(Ljava/lang/String;JJ)Lcom/anthropic/claude/conway/protocol/StreamMessage$Unknown;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "J", "getSeq", "getTs", "Companion", "com/anthropic/claude/conway/protocol/w1", "com/anthropic/claude/conway/protocol/x1", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Unknown implements StreamMessage {
        public static final int $stable = 0;
        public static final x1 Companion = new x1();
        private final long seq;
        private final long ts;
        private final String type;

        public /* synthetic */ Unknown(int i, String str, long j, long j2, vnf vnfVar) {
            if (1 != (i & 1)) {
                gvj.f(i, 1, w1.a.getDescriptor());
                throw null;
            }
            this.type = str;
            if ((i & 2) == 0) {
                this.seq = 0L;
            } else {
                this.seq = j;
            }
            if ((i & 4) == 0) {
                this.ts = 0L;
            } else {
                this.ts = j2;
            }
        }

        public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unknown.type;
            }
            if ((i & 2) != 0) {
                j = unknown.seq;
            }
            if ((i & 4) != 0) {
                j2 = unknown.ts;
            }
            return unknown.copy(str, j, j2);
        }

        public static final /* synthetic */ void write$Self$conway(Unknown self, vd4 output, SerialDescriptor serialDesc) {
            output.q(serialDesc, 0, self.getType());
            if (output.E(serialDesc) || self.getSeq() != 0) {
                output.D(serialDesc, 1, self.getSeq());
            }
            if (!output.E(serialDesc) && self.getTs() == 0) {
                return;
            }
            output.D(serialDesc, 2, self.getTs());
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getSeq() {
            return this.seq;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getTs() {
            return this.ts;
        }

        public final Unknown copy(String type, long seq, long ts) {
            type.getClass();
            return new Unknown(type, seq, ts);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Unknown)) {
                return false;
            }
            Unknown unknown = (Unknown) other;
            return x44.r(this.type, unknown.type) && this.seq == unknown.seq && this.ts == unknown.ts;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public long getSeq() {
            return this.seq;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public long getTs() {
            return this.ts;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            return Long.hashCode(this.ts) + vb7.e(this.type.hashCode() * 31, 31, this.seq);
        }

        public String toString() {
            String str = this.type;
            long j = this.seq;
            long j2 = this.ts;
            StringBuilder sbW = vb7.w("Unknown(type=", str, ", seq=", j);
            sbW.append(", ts=");
            sbW.append(j2);
            sbW.append(")");
            return sbW.toString();
        }

        public Unknown(String str, long j, long j2) {
            str.getClass();
            this.type = str;
            this.seq = j;
            this.ts = j2;
        }

        public /* synthetic */ Unknown(String str, long j, long j2, int i, mq5 mq5Var) {
            this(str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? 0L : j2);
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ<\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001cR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010+\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001cR\u0014\u00101\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u001c¨\u00065"}, d2 = {"Lcom/anthropic/claude/conway/protocol/StreamMessage$StatusLine;", "Lcom/anthropic/claude/conway/protocol/StreamMessage;", "", "seq", "ts", "", "text", "agentId", "<init>", "(JJLjava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IJJLjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/StreamMessage$StatusLine;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "component3", "()Ljava/lang/String;", "component4", "copy", "(JJLjava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/conway/protocol/StreamMessage$StatusLine;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getSeq", "getTs", "Ljava/lang/String;", "getText", "getAgentId", "getAgentId$annotations", "()V", "getType", "type", "Companion", "com/anthropic/claude/conway/protocol/s1", "com/anthropic/claude/conway/protocol/t1", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class StatusLine implements StreamMessage {
        public static final int $stable = 0;
        public static final t1 Companion = new t1();
        private final String agentId;
        private final long seq;
        private final String text;
        private final long ts;

        public /* synthetic */ StatusLine(int i, long j, long j2, String str, String str2, vnf vnfVar) {
            if ((i & 1) == 0) {
                this.seq = 0L;
            } else {
                this.seq = j;
            }
            if ((i & 2) == 0) {
                this.ts = 0L;
            } else {
                this.ts = j2;
            }
            if ((i & 4) == 0) {
                this.text = null;
            } else {
                this.text = str;
            }
            if ((i & 8) == 0) {
                this.agentId = null;
            } else {
                this.agentId = str2;
            }
        }

        public static /* synthetic */ StatusLine copy$default(StatusLine statusLine, long j, long j2, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = statusLine.seq;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = statusLine.ts;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                str = statusLine.text;
            }
            String str3 = str;
            if ((i & 8) != 0) {
                str2 = statusLine.agentId;
            }
            return statusLine.copy(j3, j4, str3, str2);
        }

        public static /* synthetic */ void getAgentId$annotations() {
        }

        public static final /* synthetic */ void write$Self$conway(StatusLine self, vd4 output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || self.getSeq() != 0) {
                output.D(serialDesc, 0, self.getSeq());
            }
            if (output.E(serialDesc) || self.getTs() != 0) {
                output.D(serialDesc, 1, self.getTs());
            }
            if (output.E(serialDesc) || self.text != null) {
                output.B(serialDesc, 2, srg.a, self.text);
            }
            if (!output.E(serialDesc) && self.agentId == null) {
                return;
            }
            output.B(serialDesc, 3, srg.a, self.agentId);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getSeq() {
            return this.seq;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTs() {
            return this.ts;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getAgentId() {
            return this.agentId;
        }

        public final StatusLine copy(long seq, long ts, String text, String agentId) {
            return new StatusLine(seq, ts, text, agentId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StatusLine)) {
                return false;
            }
            StatusLine statusLine = (StatusLine) other;
            return this.seq == statusLine.seq && this.ts == statusLine.ts && x44.r(this.text, statusLine.text) && x44.r(this.agentId, statusLine.agentId);
        }

        public final String getAgentId() {
            return this.agentId;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public long getSeq() {
            return this.seq;
        }

        public final String getText() {
            return this.text;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public long getTs() {
            return this.ts;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public String getType() {
            return "status_line";
        }

        public int hashCode() {
            int iE = vb7.e(Long.hashCode(this.seq) * 31, 31, this.ts);
            String str = this.text;
            int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.agentId;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            long j = this.seq;
            long j2 = this.ts;
            String str = this.text;
            String str2 = this.agentId;
            StringBuilder sbW = grc.w(j, "StatusLine(seq=", ", ts=");
            qy1.m(j2, ", text=", str, sbW);
            return kgh.q(sbW, ", agentId=", str2, ")");
        }

        public StatusLine() {
            this(0L, 0L, (String) null, (String) null, 15, (mq5) null);
        }

        public StatusLine(long j, long j2, String str, String str2) {
            this.seq = j;
            this.ts = j2;
            this.text = str;
            this.agentId = str2;
        }

        public /* synthetic */ StatusLine(long j, long j2, String str, String str2, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000bBK\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJD\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b0\u0010\u001eR\u0014\u00102\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010#¨\u00066"}, d2 = {"Lcom/anthropic/claude/conway/protocol/StreamMessage$AgentsUpdated;", "Lcom/anthropic/claude/conway/protocol/StreamMessage;", "", "seq", "ts", "", "", "agentIds", "Lcom/anthropic/claude/conway/protocol/AgentState;", "agents", "<init>", "(JJLjava/util/List;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IJJLjava/util/List;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/StreamMessage$AgentsUpdated;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "component3", "()Ljava/util/List;", "component4", "copy", "(JJLjava/util/List;Ljava/util/List;)Lcom/anthropic/claude/conway/protocol/StreamMessage$AgentsUpdated;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getSeq", "getTs", "Ljava/util/List;", "getAgentIds", "getAgents", "getType", "type", "Companion", "com/anthropic/claude/conway/protocol/o0", "com/anthropic/claude/conway/protocol/p0", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class AgentsUpdated implements StreamMessage {
        private static final kw9[] $childSerializers;
        public static final int $stable = 0;
        public static final p0 Companion = new p0();
        private final List<String> agentIds;
        private final List<AgentState> agents;
        private final long seq;
        private final long ts;

        static {
            y1g y1gVar = new y1g(19);
            w1a w1aVar = w1a.F;
            $childSerializers = new kw9[]{null, null, yb5.w(w1aVar, y1gVar), yb5.w(w1aVar, new y1g(20))};
        }

        public /* synthetic */ AgentsUpdated(int i, long j, long j2, List list, List list2, vnf vnfVar) {
            if ((i & 1) == 0) {
                this.seq = 0L;
            } else {
                this.seq = j;
            }
            if ((i & 2) == 0) {
                this.ts = 0L;
            } else {
                this.ts = j2;
            }
            int i2 = i & 4;
            lm6 lm6Var = lm6.E;
            if (i2 == 0) {
                this.agentIds = lm6Var;
            } else {
                this.agentIds = list;
            }
            if ((i & 8) == 0) {
                this.agents = lm6Var;
            } else {
                this.agents = list2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new uo0(srg.a, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new uo0(wq.a, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AgentsUpdated copy$default(AgentsUpdated agentsUpdated, long j, long j2, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = agentsUpdated.seq;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = agentsUpdated.ts;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                list = agentsUpdated.agentIds;
            }
            List list3 = list;
            if ((i & 8) != 0) {
                list2 = agentsUpdated.agents;
            }
            return agentsUpdated.copy(j3, j4, list3, list2);
        }

        public static final /* synthetic */ void write$Self$conway(AgentsUpdated self, vd4 output, SerialDescriptor serialDesc) {
            kw9[] kw9VarArr = $childSerializers;
            if (output.E(serialDesc) || self.getSeq() != 0) {
                output.D(serialDesc, 0, self.getSeq());
            }
            if (output.E(serialDesc) || self.getTs() != 0) {
                output.D(serialDesc, 1, self.getTs());
            }
            boolean zE = output.E(serialDesc);
            lm6 lm6Var = lm6.E;
            if (zE || !x44.r(self.agentIds, lm6Var)) {
                output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.agentIds);
            }
            if (!output.E(serialDesc) && x44.r(self.agents, lm6Var)) {
                return;
            }
            output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.agents);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getSeq() {
            return this.seq;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTs() {
            return this.ts;
        }

        public final List<String> component3() {
            return this.agentIds;
        }

        public final List<AgentState> component4() {
            return this.agents;
        }

        public final AgentsUpdated copy(long seq, long ts, List<String> agentIds, List<AgentState> agents) {
            agentIds.getClass();
            agents.getClass();
            return new AgentsUpdated(seq, ts, agentIds, agents);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AgentsUpdated)) {
                return false;
            }
            AgentsUpdated agentsUpdated = (AgentsUpdated) other;
            return this.seq == agentsUpdated.seq && this.ts == agentsUpdated.ts && x44.r(this.agentIds, agentsUpdated.agentIds) && x44.r(this.agents, agentsUpdated.agents);
        }

        public final List<String> getAgentIds() {
            return this.agentIds;
        }

        public final List<AgentState> getAgents() {
            return this.agents;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public long getSeq() {
            return this.seq;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public long getTs() {
            return this.ts;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public String getType() {
            return "agentsUpdated";
        }

        public int hashCode() {
            return this.agents.hashCode() + kgh.m(vb7.e(Long.hashCode(this.seq) * 31, 31, this.ts), 31, this.agentIds);
        }

        public String toString() {
            long j = this.seq;
            long j2 = this.ts;
            List<String> list = this.agentIds;
            List<AgentState> list2 = this.agents;
            StringBuilder sbW = grc.w(j, "AgentsUpdated(seq=", ", ts=");
            sbW.append(j2);
            sbW.append(", agentIds=");
            sbW.append(list);
            sbW.append(", agents=");
            sbW.append(list2);
            sbW.append(")");
            return sbW.toString();
        }

        public AgentsUpdated() {
            this(0L, 0L, (List) null, (List) null, 15, (mq5) null);
        }

        public AgentsUpdated(long j, long j2, List<String> list, List<AgentState> list2) {
            list.getClass();
            list2.getClass();
            this.seq = j;
            this.ts = j2;
            this.agentIds = list;
            this.agents = list2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ AgentsUpdated(long j, long j2, List list, List list2, int i, mq5 mq5Var) {
            j = (i & 1) != 0 ? 0L : j;
            j2 = (i & 2) != 0 ? 0L : j2;
            int i2 = i & 4;
            lm6 lm6Var = lm6.E;
            this(j, j2, i2 != 0 ? lm6Var : list, (i & 8) != 0 ? lm6Var : list2);
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0019R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b/\u0010\u001cR\u0014\u00101\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u001c¨\u00065"}, d2 = {"Lcom/anthropic/claude/conway/protocol/StreamMessage$ClientPermissionResolved;", "Lcom/anthropic/claude/conway/protocol/StreamMessage;", "", "seq", "ts", "", "clientName", "state", "<init>", "(JJLjava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IJJLjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/StreamMessage$ClientPermissionResolved;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "component3", "()Ljava/lang/String;", "component4", "copy", "(JJLjava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/conway/protocol/StreamMessage$ClientPermissionResolved;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getSeq", "getTs", "Ljava/lang/String;", "getClientName", "getClientName$annotations", "()V", "getState", "getType", "type", "Companion", "com/anthropic/claude/conway/protocol/s0", "com/anthropic/claude/conway/protocol/t0", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ClientPermissionResolved implements StreamMessage {
        public static final int $stable = 0;
        public static final t0 Companion = new t0();
        private final String clientName;
        private final long seq;
        private final String state;
        private final long ts;

        public /* synthetic */ ClientPermissionResolved(int i, long j, long j2, String str, String str2, vnf vnfVar) {
            if ((i & 1) == 0) {
                this.seq = 0L;
            } else {
                this.seq = j;
            }
            if ((i & 2) == 0) {
                this.ts = 0L;
            } else {
                this.ts = j2;
            }
            if ((i & 4) == 0) {
                this.clientName = "";
            } else {
                this.clientName = str;
            }
            if ((i & 8) == 0) {
                this.state = "";
            } else {
                this.state = str2;
            }
        }

        public static /* synthetic */ ClientPermissionResolved copy$default(ClientPermissionResolved clientPermissionResolved, long j, long j2, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = clientPermissionResolved.seq;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = clientPermissionResolved.ts;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                str = clientPermissionResolved.clientName;
            }
            String str3 = str;
            if ((i & 8) != 0) {
                str2 = clientPermissionResolved.state;
            }
            return clientPermissionResolved.copy(j3, j4, str3, str2);
        }

        public static /* synthetic */ void getClientName$annotations() {
        }

        public static final /* synthetic */ void write$Self$conway(ClientPermissionResolved self, vd4 output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || self.getSeq() != 0) {
                output.D(serialDesc, 0, self.getSeq());
            }
            if (output.E(serialDesc) || self.getTs() != 0) {
                output.D(serialDesc, 1, self.getTs());
            }
            if (output.E(serialDesc) || !x44.r(self.clientName, "")) {
                output.q(serialDesc, 2, self.clientName);
            }
            if (!output.E(serialDesc) && x44.r(self.state, "")) {
                return;
            }
            output.q(serialDesc, 3, self.state);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getSeq() {
            return this.seq;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTs() {
            return this.ts;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getClientName() {
            return this.clientName;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getState() {
            return this.state;
        }

        public final ClientPermissionResolved copy(long seq, long ts, String clientName, String state) {
            clientName.getClass();
            state.getClass();
            return new ClientPermissionResolved(seq, ts, clientName, state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ClientPermissionResolved)) {
                return false;
            }
            ClientPermissionResolved clientPermissionResolved = (ClientPermissionResolved) other;
            return this.seq == clientPermissionResolved.seq && this.ts == clientPermissionResolved.ts && x44.r(this.clientName, clientPermissionResolved.clientName) && x44.r(this.state, clientPermissionResolved.state);
        }

        public final String getClientName() {
            return this.clientName;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public long getSeq() {
            return this.seq;
        }

        public final String getState() {
            return this.state;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public long getTs() {
            return this.ts;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public String getType() {
            return "client_permission_resolved";
        }

        public int hashCode() {
            return this.state.hashCode() + kgh.l(vb7.e(Long.hashCode(this.seq) * 31, 31, this.ts), 31, this.clientName);
        }

        public String toString() {
            long j = this.seq;
            long j2 = this.ts;
            String str = this.clientName;
            String str2 = this.state;
            StringBuilder sbW = grc.w(j, "ClientPermissionResolved(seq=", ", ts=");
            qy1.m(j2, ", clientName=", str, sbW);
            return kgh.q(sbW, ", state=", str2, ")");
        }

        public ClientPermissionResolved() {
            this(0L, 0L, (String) null, (String) null, 15, (mq5) null);
        }

        public ClientPermissionResolved(long j, long j2, String str, String str2) {
            str.getClass();
            str2.getClass();
            this.seq = j;
            this.ts = j2;
            this.clientName = str;
            this.state = str2;
        }

        public /* synthetic */ ClientPermissionResolved(long j, long j2, String str, String str2, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2);
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tB=\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001cR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010(\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u0019R\u0014\u00101\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u001c¨\u00065"}, d2 = {"Lcom/anthropic/claude/conway/protocol/StreamMessage$Shutdown;", "Lcom/anthropic/claude/conway/protocol/StreamMessage;", "", "seq", "ts", "", "reason", "waitMs", "<init>", "(JJLjava/lang/String;J)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IJJLjava/lang/String;JLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/StreamMessage$Shutdown;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "component3", "()Ljava/lang/String;", "component4", "copy", "(JJLjava/lang/String;J)Lcom/anthropic/claude/conway/protocol/StreamMessage$Shutdown;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getSeq", "getTs", "Ljava/lang/String;", "getReason", "getWaitMs", "getWaitMs$annotations", "()V", "getType", "type", "Companion", "com/anthropic/claude/conway/protocol/q1", "com/anthropic/claude/conway/protocol/r1", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Shutdown implements StreamMessage {
        public static final int $stable = 0;
        public static final r1 Companion = new r1();
        private final String reason;
        private final long seq;
        private final long ts;
        private final long waitMs;

        public /* synthetic */ Shutdown(int i, long j, long j2, String str, long j3, vnf vnfVar) {
            if ((i & 1) == 0) {
                this.seq = 0L;
            } else {
                this.seq = j;
            }
            if ((i & 2) == 0) {
                this.ts = 0L;
            } else {
                this.ts = j2;
            }
            if ((i & 4) == 0) {
                this.reason = "";
            } else {
                this.reason = str;
            }
            if ((i & 8) == 0) {
                this.waitMs = 0L;
            } else {
                this.waitMs = j3;
            }
        }

        public static /* synthetic */ Shutdown copy$default(Shutdown shutdown, long j, long j2, String str, long j3, int i, Object obj) {
            if ((i & 1) != 0) {
                j = shutdown.seq;
            }
            long j4 = j;
            if ((i & 2) != 0) {
                j2 = shutdown.ts;
            }
            long j5 = j2;
            if ((i & 4) != 0) {
                str = shutdown.reason;
            }
            String str2 = str;
            if ((i & 8) != 0) {
                j3 = shutdown.waitMs;
            }
            return shutdown.copy(j4, j5, str2, j3);
        }

        public static /* synthetic */ void getWaitMs$annotations() {
        }

        public static final /* synthetic */ void write$Self$conway(Shutdown self, vd4 output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || self.getSeq() != 0) {
                output.D(serialDesc, 0, self.getSeq());
            }
            if (output.E(serialDesc) || self.getTs() != 0) {
                output.D(serialDesc, 1, self.getTs());
            }
            if (output.E(serialDesc) || !x44.r(self.reason, "")) {
                output.q(serialDesc, 2, self.reason);
            }
            if (!output.E(serialDesc) && self.waitMs == 0) {
                return;
            }
            output.D(serialDesc, 3, self.waitMs);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getSeq() {
            return this.seq;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTs() {
            return this.ts;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getWaitMs() {
            return this.waitMs;
        }

        public final Shutdown copy(long seq, long ts, String reason, long waitMs) {
            reason.getClass();
            return new Shutdown(seq, ts, reason, waitMs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Shutdown)) {
                return false;
            }
            Shutdown shutdown = (Shutdown) other;
            return this.seq == shutdown.seq && this.ts == shutdown.ts && x44.r(this.reason, shutdown.reason) && this.waitMs == shutdown.waitMs;
        }

        public final String getReason() {
            return this.reason;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public long getSeq() {
            return this.seq;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public long getTs() {
            return this.ts;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public String getType() {
            return "shutdown";
        }

        public final long getWaitMs() {
            return this.waitMs;
        }

        public int hashCode() {
            return Long.hashCode(this.waitMs) + kgh.l(vb7.e(Long.hashCode(this.seq) * 31, 31, this.ts), 31, this.reason);
        }

        public String toString() {
            long j = this.seq;
            long j2 = this.ts;
            String str = this.reason;
            long j3 = this.waitMs;
            StringBuilder sbW = grc.w(j, "Shutdown(seq=", ", ts=");
            qy1.m(j2, ", reason=", str, sbW);
            sbW.append(", waitMs=");
            sbW.append(j3);
            sbW.append(")");
            return sbW.toString();
        }

        public Shutdown() {
            this(0L, 0L, (String) null, 0L, 15, (mq5) null);
        }

        public Shutdown(long j, long j2, String str, long j3) {
            str.getClass();
            this.seq = j;
            this.ts = j2;
            this.reason = str;
            this.waitMs = j3;
        }

        public /* synthetic */ Shutdown(long j, long j2, String str, long j3, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? 0L : j3);
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000278B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ8\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001aR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u001dR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010.\u0012\u0004\b3\u00101\u001a\u0004\b2\u0010\u001dR\u0014\u00105\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u001d¨\u00069"}, d2 = {"Lcom/anthropic/claude/conway/protocol/StreamMessage$ForkJoined;", "Lcom/anthropic/claude/conway/protocol/StreamMessage;", "", "seq", "ts", "Lcom/anthropic/claude/types/strings/ForkId;", "agentId", "", "summary", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IJJLjava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/StreamMessage$ForkJoined;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "component3-jXBynNE", "()Ljava/lang/String;", "component3", "component4", "copy-7PjYkGM", "(JJLjava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/conway/protocol/StreamMessage$ForkJoined;", "copy", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getSeq", "getTs", "Ljava/lang/String;", "getAgentId-jXBynNE", "getAgentId-jXBynNE$annotations", "()V", "getSummary", "getSummary$annotations", "getType", "type", "Companion", "com/anthropic/claude/conway/protocol/e1", "com/anthropic/claude/conway/protocol/f1", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ForkJoined implements StreamMessage {
        public static final int $stable = 0;
        public static final f1 Companion = new f1();
        private final String agentId;
        private final long seq;
        private final String summary;
        private final long ts;

        private /* synthetic */ ForkJoined(int i, long j, long j2, String str, String str2, vnf vnfVar) {
            if (4 != (i & 4)) {
                gvj.f(i, 4, e1.a.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.seq = 0L;
            } else {
                this.seq = j;
            }
            if ((i & 2) == 0) {
                this.ts = 0L;
            } else {
                this.ts = j2;
            }
            this.agentId = str;
            if ((i & 8) == 0) {
                this.summary = "";
            } else {
                this.summary = str2;
            }
        }

        /* JADX INFO: renamed from: copy-7PjYkGM$default, reason: not valid java name */
        public static /* synthetic */ ForkJoined m756copy7PjYkGM$default(ForkJoined forkJoined, long j, long j2, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = forkJoined.seq;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = forkJoined.ts;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                str = forkJoined.agentId;
            }
            String str3 = str;
            if ((i & 8) != 0) {
                str2 = forkJoined.summary;
            }
            return forkJoined.m759copy7PjYkGM(j3, j4, str3, str2);
        }

        /* JADX INFO: renamed from: getAgentId-jXBynNE$annotations, reason: not valid java name */
        public static /* synthetic */ void m757getAgentIdjXBynNE$annotations() {
        }

        public static /* synthetic */ void getSummary$annotations() {
        }

        public static final /* synthetic */ void write$Self$conway(ForkJoined self, vd4 output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || self.getSeq() != 0) {
                output.D(serialDesc, 0, self.getSeq());
            }
            if (output.E(serialDesc) || self.getTs() != 0) {
                output.D(serialDesc, 1, self.getTs());
            }
            output.r(serialDesc, 2, aw7.a, ForkId.m1021boximpl(self.agentId));
            if (!output.E(serialDesc) && x44.r(self.summary, "")) {
                return;
            }
            output.q(serialDesc, 3, self.summary);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getSeq() {
            return this.seq;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTs() {
            return this.ts;
        }

        /* JADX INFO: renamed from: component3-jXBynNE, reason: not valid java name and from getter */
        public final String getAgentId() {
            return this.agentId;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getSummary() {
            return this.summary;
        }

        /* JADX INFO: renamed from: copy-7PjYkGM, reason: not valid java name */
        public final ForkJoined m759copy7PjYkGM(long seq, long ts, String agentId, String summary) {
            agentId.getClass();
            summary.getClass();
            return new ForkJoined(seq, ts, agentId, summary, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ForkJoined)) {
                return false;
            }
            ForkJoined forkJoined = (ForkJoined) other;
            return this.seq == forkJoined.seq && this.ts == forkJoined.ts && ForkId.m1024equalsimpl0(this.agentId, forkJoined.agentId) && x44.r(this.summary, forkJoined.summary);
        }

        /* JADX INFO: renamed from: getAgentId-jXBynNE, reason: not valid java name */
        public final String m760getAgentIdjXBynNE() {
            return this.agentId;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public long getSeq() {
            return this.seq;
        }

        public final String getSummary() {
            return this.summary;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public long getTs() {
            return this.ts;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public String getType() {
            return "fork_joined";
        }

        public int hashCode() {
            return this.summary.hashCode() + ((ForkId.m1025hashCodeimpl(this.agentId) + vb7.e(Long.hashCode(this.seq) * 31, 31, this.ts)) * 31);
        }

        public String toString() {
            long j = this.seq;
            long j2 = this.ts;
            String strM1027toStringimpl = ForkId.m1027toStringimpl(this.agentId);
            String str = this.summary;
            StringBuilder sbW = grc.w(j, "ForkJoined(seq=", ", ts=");
            qy1.m(j2, ", agentId=", strM1027toStringimpl, sbW);
            return kgh.q(sbW, ", summary=", str, ")");
        }

        public /* synthetic */ ForkJoined(long j, long j2, String str, String str2, mq5 mq5Var) {
            this(j, j2, str, str2);
        }

        public /* synthetic */ ForkJoined(int i, long j, long j2, String str, String str2, vnf vnfVar, mq5 mq5Var) {
            this(i, j, j2, str, str2, vnfVar);
        }

        private ForkJoined(long j, long j2, String str, String str2) {
            str.getClass();
            str2.getClass();
            this.seq = j;
            this.ts = j2;
            this.agentId = str;
            this.summary = str2;
        }

        public /* synthetic */ ForkJoined(long j, long j2, String str, String str2, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, str, (i & 8) != 0 ? "" : str2, null);
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJD\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\"\u0010\u001dJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001aR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001dR \u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b2\u00100\u001a\u0004\b1\u0010\u001dR\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010-\u0012\u0004\b4\u00100\u001a\u0004\b3\u0010\u001dR\u0014\u00106\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u001d¨\u0006:"}, d2 = {"Lcom/anthropic/claude/conway/protocol/StreamMessage$ClientPermissionRequest;", "Lcom/anthropic/claude/conway/protocol/StreamMessage;", "", "seq", "ts", "", "clientName", "displayName", "triggeringTool", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/StreamMessage$ClientPermissionRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "copy", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/conway/protocol/StreamMessage$ClientPermissionRequest;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getSeq", "getTs", "Ljava/lang/String;", "getClientName", "getClientName$annotations", "()V", "getDisplayName", "getDisplayName$annotations", "getTriggeringTool", "getTriggeringTool$annotations", "getType", "type", "Companion", "com/anthropic/claude/conway/protocol/q0", "com/anthropic/claude/conway/protocol/r0", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ClientPermissionRequest implements StreamMessage {
        public static final int $stable = 0;
        public static final r0 Companion = new r0();
        private final String clientName;
        private final String displayName;
        private final long seq;
        private final String triggeringTool;
        private final long ts;

        public /* synthetic */ ClientPermissionRequest(int i, long j, long j2, String str, String str2, String str3, vnf vnfVar) {
            if ((i & 1) == 0) {
                this.seq = 0L;
            } else {
                this.seq = j;
            }
            if ((i & 2) == 0) {
                this.ts = 0L;
            } else {
                this.ts = j2;
            }
            if ((i & 4) == 0) {
                this.clientName = "";
            } else {
                this.clientName = str;
            }
            if ((i & 8) == 0) {
                this.displayName = "";
            } else {
                this.displayName = str2;
            }
            if ((i & 16) == 0) {
                this.triggeringTool = null;
            } else {
                this.triggeringTool = str3;
            }
        }

        public static /* synthetic */ ClientPermissionRequest copy$default(ClientPermissionRequest clientPermissionRequest, long j, long j2, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                j = clientPermissionRequest.seq;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = clientPermissionRequest.ts;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                str = clientPermissionRequest.clientName;
            }
            String str4 = str;
            if ((i & 8) != 0) {
                str2 = clientPermissionRequest.displayName;
            }
            String str5 = str2;
            if ((i & 16) != 0) {
                str3 = clientPermissionRequest.triggeringTool;
            }
            return clientPermissionRequest.copy(j3, j4, str4, str5, str3);
        }

        public static /* synthetic */ void getClientName$annotations() {
        }

        public static /* synthetic */ void getDisplayName$annotations() {
        }

        public static /* synthetic */ void getTriggeringTool$annotations() {
        }

        public static final /* synthetic */ void write$Self$conway(ClientPermissionRequest self, vd4 output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || self.getSeq() != 0) {
                output.D(serialDesc, 0, self.getSeq());
            }
            if (output.E(serialDesc) || self.getTs() != 0) {
                output.D(serialDesc, 1, self.getTs());
            }
            if (output.E(serialDesc) || !x44.r(self.clientName, "")) {
                output.q(serialDesc, 2, self.clientName);
            }
            if (output.E(serialDesc) || !x44.r(self.displayName, "")) {
                output.q(serialDesc, 3, self.displayName);
            }
            if (!output.E(serialDesc) && self.triggeringTool == null) {
                return;
            }
            output.B(serialDesc, 4, srg.a, self.triggeringTool);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getSeq() {
            return this.seq;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTs() {
            return this.ts;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getClientName() {
            return this.clientName;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getDisplayName() {
            return this.displayName;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getTriggeringTool() {
            return this.triggeringTool;
        }

        public final ClientPermissionRequest copy(long seq, long ts, String clientName, String displayName, String triggeringTool) {
            clientName.getClass();
            displayName.getClass();
            return new ClientPermissionRequest(seq, ts, clientName, displayName, triggeringTool);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ClientPermissionRequest)) {
                return false;
            }
            ClientPermissionRequest clientPermissionRequest = (ClientPermissionRequest) other;
            return this.seq == clientPermissionRequest.seq && this.ts == clientPermissionRequest.ts && x44.r(this.clientName, clientPermissionRequest.clientName) && x44.r(this.displayName, clientPermissionRequest.displayName) && x44.r(this.triggeringTool, clientPermissionRequest.triggeringTool);
        }

        public final String getClientName() {
            return this.clientName;
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public long getSeq() {
            return this.seq;
        }

        public final String getTriggeringTool() {
            return this.triggeringTool;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public long getTs() {
            return this.ts;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public String getType() {
            return "client_permission_request";
        }

        public int hashCode() {
            int iL = kgh.l(kgh.l(vb7.e(Long.hashCode(this.seq) * 31, 31, this.ts), 31, this.clientName), 31, this.displayName);
            String str = this.triggeringTool;
            return iL + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            long j = this.seq;
            long j2 = this.ts;
            String str = this.clientName;
            String str2 = this.displayName;
            String str3 = this.triggeringTool;
            StringBuilder sbW = grc.w(j, "ClientPermissionRequest(seq=", ", ts=");
            qy1.m(j2, ", clientName=", str, sbW);
            kgh.u(sbW, ", displayName=", str2, ", triggeringTool=", str3);
            sbW.append(")");
            return sbW.toString();
        }

        public ClientPermissionRequest() {
            this(0L, 0L, (String) null, (String) null, (String) null, 31, (mq5) null);
        }

        public ClientPermissionRequest(long j, long j2, String str, String str2, String str3) {
            str.getClass();
            str2.getClass();
            this.seq = j;
            this.ts = j2;
            this.clientName = str;
            this.displayName = str2;
            this.triggeringTool = str3;
        }

        public /* synthetic */ ClientPermissionRequest(long j, long j2, String str, String str2, String str3, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : str3);
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJF\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\"\u0010\u001dJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001dR \u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b2\u00100\u001a\u0004\b1\u0010\u001dR\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010-\u0012\u0004\b4\u00100\u001a\u0004\b3\u0010\u001dR\u0014\u00106\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u001d¨\u0006:"}, d2 = {"Lcom/anthropic/claude/conway/protocol/StreamMessage$Connected;", "Lcom/anthropic/claude/conway/protocol/StreamMessage;", "", "seq", "ts", "", "sessionId", "clientId", "resumeToken", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/StreamMessage$Connected;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "copy", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/conway/protocol/StreamMessage$Connected;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getSeq", "getTs", "Ljava/lang/String;", "getSessionId", "getSessionId$annotations", "()V", "getClientId", "getClientId$annotations", "getResumeToken", "getResumeToken$annotations", "getType", "type", "Companion", "com/anthropic/claude/conway/protocol/w0", "com/anthropic/claude/conway/protocol/x0", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Connected implements StreamMessage {
        public static final int $stable = 0;
        public static final x0 Companion = new x0();
        private final String clientId;
        private final String resumeToken;
        private final long seq;
        private final String sessionId;
        private final long ts;

        public /* synthetic */ Connected(int i, long j, long j2, String str, String str2, String str3, vnf vnfVar) {
            if (8 != (i & 8)) {
                gvj.f(i, 8, w0.a.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.seq = 0L;
            } else {
                this.seq = j;
            }
            if ((i & 2) == 0) {
                this.ts = 0L;
            } else {
                this.ts = j2;
            }
            if ((i & 4) == 0) {
                this.sessionId = null;
            } else {
                this.sessionId = str;
            }
            this.clientId = str2;
            if ((i & 16) == 0) {
                this.resumeToken = null;
            } else {
                this.resumeToken = str3;
            }
        }

        public static /* synthetic */ Connected copy$default(Connected connected, long j, long j2, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                j = connected.seq;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = connected.ts;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                str = connected.sessionId;
            }
            String str4 = str;
            if ((i & 8) != 0) {
                str2 = connected.clientId;
            }
            String str5 = str2;
            if ((i & 16) != 0) {
                str3 = connected.resumeToken;
            }
            return connected.copy(j3, j4, str4, str5, str3);
        }

        public static /* synthetic */ void getClientId$annotations() {
        }

        public static /* synthetic */ void getResumeToken$annotations() {
        }

        public static /* synthetic */ void getSessionId$annotations() {
        }

        public static final /* synthetic */ void write$Self$conway(Connected self, vd4 output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || self.getSeq() != 0) {
                output.D(serialDesc, 0, self.getSeq());
            }
            if (output.E(serialDesc) || self.getTs() != 0) {
                output.D(serialDesc, 1, self.getTs());
            }
            if (output.E(serialDesc) || self.sessionId != null) {
                output.B(serialDesc, 2, srg.a, self.sessionId);
            }
            output.q(serialDesc, 3, self.clientId);
            if (!output.E(serialDesc) && self.resumeToken == null) {
                return;
            }
            output.B(serialDesc, 4, srg.a, self.resumeToken);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getSeq() {
            return this.seq;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTs() {
            return this.ts;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getClientId() {
            return this.clientId;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getResumeToken() {
            return this.resumeToken;
        }

        public final Connected copy(long seq, long ts, String sessionId, String clientId, String resumeToken) {
            clientId.getClass();
            return new Connected(seq, ts, sessionId, clientId, resumeToken);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Connected)) {
                return false;
            }
            Connected connected = (Connected) other;
            return this.seq == connected.seq && this.ts == connected.ts && x44.r(this.sessionId, connected.sessionId) && x44.r(this.clientId, connected.clientId) && x44.r(this.resumeToken, connected.resumeToken);
        }

        public final String getClientId() {
            return this.clientId;
        }

        public final String getResumeToken() {
            return this.resumeToken;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public long getSeq() {
            return this.seq;
        }

        public final String getSessionId() {
            return this.sessionId;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public long getTs() {
            return this.ts;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public String getType() {
            return "connected";
        }

        public int hashCode() {
            int iE = vb7.e(Long.hashCode(this.seq) * 31, 31, this.ts);
            String str = this.sessionId;
            int iL = kgh.l((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.clientId);
            String str2 = this.resumeToken;
            return iL + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            long j = this.seq;
            long j2 = this.ts;
            String str = this.sessionId;
            String str2 = this.clientId;
            String str3 = this.resumeToken;
            StringBuilder sbW = grc.w(j, "Connected(seq=", ", ts=");
            qy1.m(j2, ", sessionId=", str, sbW);
            kgh.u(sbW, ", clientId=", str2, ", resumeToken=", str3);
            sbW.append(")");
            return sbW.toString();
        }

        public Connected(long j, long j2, String str, String str2, String str3) {
            str2.getClass();
            this.seq = j;
            this.ts = j2;
            this.sessionId = str;
            this.clientId = str2;
            this.resumeToken = str3;
        }

        public /* synthetic */ Connected(long j, long j2, String str, String str2, String str3, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? null : str, str2, (i & 16) != 0 ? null : str3);
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:;B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!JB\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b$\u0010\u001eJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001bR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\u001eR \u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010/\u0012\u0004\b4\u00102\u001a\u0004\b3\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010!R\u0014\u00108\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u001e¨\u0006<"}, d2 = {"Lcom/anthropic/claude/conway/protocol/StreamMessage$ToolCall;", "Lcom/anthropic/claude/conway/protocol/StreamMessage;", "", "seq", "ts", "", "requestId", "toolName", "Lkotlinx/serialization/json/JsonObject;", "input", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IJJLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/StreamMessage$ToolCall;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "()Lkotlinx/serialization/json/JsonObject;", "copy", "(JJLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)Lcom/anthropic/claude/conway/protocol/StreamMessage$ToolCall;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getSeq", "getTs", "Ljava/lang/String;", "getRequestId", "getRequestId$annotations", "()V", "getToolName", "getToolName$annotations", "Lkotlinx/serialization/json/JsonObject;", "getInput", "getType", "type", "Companion", "com/anthropic/claude/conway/protocol/u1", "com/anthropic/claude/conway/protocol/v1", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ToolCall implements StreamMessage {
        public static final int $stable = 8;
        public static final v1 Companion = new v1();
        private final JsonObject input;
        private final String requestId;
        private final long seq;
        private final String toolName;
        private final long ts;

        public /* synthetic */ ToolCall(int i, long j, long j2, String str, String str2, JsonObject jsonObject, vnf vnfVar) {
            if (12 != (i & 12)) {
                gvj.f(i, 12, u1.a.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.seq = 0L;
            } else {
                this.seq = j;
            }
            if ((i & 2) == 0) {
                this.ts = 0L;
            } else {
                this.ts = j2;
            }
            this.requestId = str;
            this.toolName = str2;
            if ((i & 16) == 0) {
                this.input = new JsonObject(nm6.E);
            } else {
                this.input = jsonObject;
            }
        }

        public static /* synthetic */ ToolCall copy$default(ToolCall toolCall, long j, long j2, String str, String str2, JsonObject jsonObject, int i, Object obj) {
            if ((i & 1) != 0) {
                j = toolCall.seq;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = toolCall.ts;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                str = toolCall.requestId;
            }
            String str3 = str;
            if ((i & 8) != 0) {
                str2 = toolCall.toolName;
            }
            String str4 = str2;
            if ((i & 16) != 0) {
                jsonObject = toolCall.input;
            }
            return toolCall.copy(j3, j4, str3, str4, jsonObject);
        }

        public static /* synthetic */ void getRequestId$annotations() {
        }

        public static /* synthetic */ void getToolName$annotations() {
        }

        public static final /* synthetic */ void write$Self$conway(ToolCall self, vd4 output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || self.getSeq() != 0) {
                output.D(serialDesc, 0, self.getSeq());
            }
            if (output.E(serialDesc) || self.getTs() != 0) {
                output.D(serialDesc, 1, self.getTs());
            }
            output.q(serialDesc, 2, self.requestId);
            output.q(serialDesc, 3, self.toolName);
            if (!output.E(serialDesc) && x44.r(self.input, new JsonObject(nm6.E))) {
                return;
            }
            output.r(serialDesc, 4, uh9.a, self.input);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getSeq() {
            return this.seq;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTs() {
            return this.ts;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getRequestId() {
            return this.requestId;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getToolName() {
            return this.toolName;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final JsonObject getInput() {
            return this.input;
        }

        public final ToolCall copy(long seq, long ts, String requestId, String toolName, JsonObject input) {
            requestId.getClass();
            toolName.getClass();
            input.getClass();
            return new ToolCall(seq, ts, requestId, toolName, input);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ToolCall)) {
                return false;
            }
            ToolCall toolCall = (ToolCall) other;
            return this.seq == toolCall.seq && this.ts == toolCall.ts && x44.r(this.requestId, toolCall.requestId) && x44.r(this.toolName, toolCall.toolName) && x44.r(this.input, toolCall.input);
        }

        public final JsonObject getInput() {
            return this.input;
        }

        public final String getRequestId() {
            return this.requestId;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public long getSeq() {
            return this.seq;
        }

        public final String getToolName() {
            return this.toolName;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public long getTs() {
            return this.ts;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public String getType() {
            return "tool_call";
        }

        public int hashCode() {
            return this.input.hashCode() + kgh.l(kgh.l(vb7.e(Long.hashCode(this.seq) * 31, 31, this.ts), 31, this.requestId), 31, this.toolName);
        }

        public String toString() {
            long j = this.seq;
            long j2 = this.ts;
            String str = this.requestId;
            String str2 = this.toolName;
            JsonObject jsonObject = this.input;
            StringBuilder sbW = grc.w(j, "ToolCall(seq=", ", ts=");
            qy1.m(j2, ", requestId=", str, sbW);
            sbW.append(", toolName=");
            sbW.append(str2);
            sbW.append(", input=");
            sbW.append(jsonObject);
            sbW.append(")");
            return sbW.toString();
        }

        public ToolCall(long j, long j2, String str, String str2, JsonObject jsonObject) {
            str.getClass();
            str2.getClass();
            jsonObject.getClass();
            this.seq = j;
            this.ts = j2;
            this.requestId = str;
            this.toolName = str2;
            this.input = jsonObject;
        }

        public /* synthetic */ ToolCall(long j, long j2, String str, String str2, JsonObject jsonObject, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, str, str2, (i & 16) != 0 ? new JsonObject(nm6.E) : jsonObject);
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?@BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fBQ\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJP\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b'\u0010\u001fJ\u0010\u0010(\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001cR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00102\u0012\u0004\b4\u00105\u001a\u0004\b3\u0010\u001fR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00102\u0012\u0004\b7\u00105\u001a\u0004\b6\u0010\u001fR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010/\u0012\u0004\b9\u00105\u001a\u0004\b8\u0010\u001cR\"\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00102\u0012\u0004\b;\u00105\u001a\u0004\b:\u0010\u001fR\u0014\u0010=\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u001f¨\u0006A"}, d2 = {"Lcom/anthropic/claude/conway/protocol/StreamMessage$ForkCreated;", "Lcom/anthropic/claude/conway/protocol/StreamMessage;", "", "seq", "ts", "Lcom/anthropic/claude/types/strings/ForkId;", "agentId", "", "label", "createdAt", VerifyResponse.AuthenticationState.DISCRIMINATOR, "<init>", "(JJLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IJJLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/StreamMessage$ForkCreated;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "component3-jXBynNE", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "copy-bsXiiTs", "(JJLjava/lang/String;Ljava/lang/String;JLjava/lang/String;)Lcom/anthropic/claude/conway/protocol/StreamMessage$ForkCreated;", "copy", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getSeq", "getTs", "Ljava/lang/String;", "getAgentId-jXBynNE", "getAgentId-jXBynNE$annotations", "()V", "getLabel", "getLabel$annotations", "getCreatedAt", "getCreatedAt$annotations", "getKind", "getKind$annotations", "getType", "type", "Companion", "com/anthropic/claude/conway/protocol/c1", "com/anthropic/claude/conway/protocol/d1", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ForkCreated implements StreamMessage {
        public static final int $stable = 0;
        public static final d1 Companion = new d1();
        private final String agentId;
        private final long createdAt;
        private final String kind;
        private final String label;
        private final long seq;
        private final long ts;

        private /* synthetic */ ForkCreated(int i, long j, long j2, String str, String str2, long j3, String str3, vnf vnfVar) {
            if (4 != (i & 4)) {
                gvj.f(i, 4, c1.a.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.seq = 0L;
            } else {
                this.seq = j;
            }
            if ((i & 2) == 0) {
                this.ts = 0L;
            } else {
                this.ts = j2;
            }
            this.agentId = str;
            if ((i & 8) == 0) {
                this.label = null;
            } else {
                this.label = str2;
            }
            if ((i & 16) == 0) {
                this.createdAt = 0L;
            } else {
                this.createdAt = j3;
            }
            if ((i & 32) == 0) {
                this.kind = null;
            } else {
                this.kind = str3;
            }
        }

        /* JADX INFO: renamed from: copy-bsXiiTs$default, reason: not valid java name */
        public static /* synthetic */ ForkCreated m751copybsXiiTs$default(ForkCreated forkCreated, long j, long j2, String str, String str2, long j3, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                j = forkCreated.seq;
            }
            long j4 = j;
            if ((i & 2) != 0) {
                j2 = forkCreated.ts;
            }
            long j5 = j2;
            if ((i & 4) != 0) {
                str = forkCreated.agentId;
            }
            return forkCreated.m754copybsXiiTs(j4, j5, str, (i & 8) != 0 ? forkCreated.label : str2, (i & 16) != 0 ? forkCreated.createdAt : j3, (i & 32) != 0 ? forkCreated.kind : str3);
        }

        /* JADX INFO: renamed from: getAgentId-jXBynNE$annotations, reason: not valid java name */
        public static /* synthetic */ void m752getAgentIdjXBynNE$annotations() {
        }

        public static /* synthetic */ void getCreatedAt$annotations() {
        }

        public static /* synthetic */ void getKind$annotations() {
        }

        public static /* synthetic */ void getLabel$annotations() {
        }

        public static final /* synthetic */ void write$Self$conway(ForkCreated self, vd4 output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || self.getSeq() != 0) {
                output.D(serialDesc, 0, self.getSeq());
            }
            if (output.E(serialDesc) || self.getTs() != 0) {
                output.D(serialDesc, 1, self.getTs());
            }
            output.r(serialDesc, 2, aw7.a, ForkId.m1021boximpl(self.agentId));
            if (output.E(serialDesc) || self.label != null) {
                output.B(serialDesc, 3, srg.a, self.label);
            }
            if (output.E(serialDesc) || self.createdAt != 0) {
                output.D(serialDesc, 4, self.createdAt);
            }
            if (!output.E(serialDesc) && self.kind == null) {
                return;
            }
            output.B(serialDesc, 5, srg.a, self.kind);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getSeq() {
            return this.seq;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTs() {
            return this.ts;
        }

        /* JADX INFO: renamed from: component3-jXBynNE, reason: not valid java name and from getter */
        public final String getAgentId() {
            return this.agentId;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final long getCreatedAt() {
            return this.createdAt;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getKind() {
            return this.kind;
        }

        /* JADX INFO: renamed from: copy-bsXiiTs, reason: not valid java name */
        public final ForkCreated m754copybsXiiTs(long seq, long ts, String agentId, String label, long createdAt, String kind) {
            agentId.getClass();
            return new ForkCreated(seq, ts, agentId, label, createdAt, kind, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ForkCreated)) {
                return false;
            }
            ForkCreated forkCreated = (ForkCreated) other;
            return this.seq == forkCreated.seq && this.ts == forkCreated.ts && ForkId.m1024equalsimpl0(this.agentId, forkCreated.agentId) && x44.r(this.label, forkCreated.label) && this.createdAt == forkCreated.createdAt && x44.r(this.kind, forkCreated.kind);
        }

        /* JADX INFO: renamed from: getAgentId-jXBynNE, reason: not valid java name */
        public final String m755getAgentIdjXBynNE() {
            return this.agentId;
        }

        public final long getCreatedAt() {
            return this.createdAt;
        }

        public final String getKind() {
            return this.kind;
        }

        public final String getLabel() {
            return this.label;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public long getSeq() {
            return this.seq;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public long getTs() {
            return this.ts;
        }

        @Override // com.anthropic.claude.conway.protocol.StreamMessage
        public String getType() {
            return "fork_created";
        }

        public int hashCode() {
            int iM1025hashCodeimpl = (ForkId.m1025hashCodeimpl(this.agentId) + vb7.e(Long.hashCode(this.seq) * 31, 31, this.ts)) * 31;
            String str = this.label;
            int iE = vb7.e((iM1025hashCodeimpl + (str == null ? 0 : str.hashCode())) * 31, 31, this.createdAt);
            String str2 = this.kind;
            return iE + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            long j = this.seq;
            long j2 = this.ts;
            String strM1027toStringimpl = ForkId.m1027toStringimpl(this.agentId);
            String str = this.label;
            long j3 = this.createdAt;
            String str2 = this.kind;
            StringBuilder sbW = grc.w(j, "ForkCreated(seq=", ", ts=");
            qy1.m(j2, ", agentId=", strM1027toStringimpl, sbW);
            sbW.append(", label=");
            sbW.append(str);
            sbW.append(", createdAt=");
            qy1.m(j3, ", kind=", str2, sbW);
            sbW.append(")");
            return sbW.toString();
        }

        public /* synthetic */ ForkCreated(long j, long j2, String str, String str2, long j3, String str3, mq5 mq5Var) {
            this(j, j2, str, str2, j3, str3);
        }

        public /* synthetic */ ForkCreated(int i, long j, long j2, String str, String str2, long j3, String str3, vnf vnfVar, mq5 mq5Var) {
            this(i, j, j2, str, str2, j3, str3, vnfVar);
        }

        private ForkCreated(long j, long j2, String str, String str2, long j3, String str3) {
            str.getClass();
            this.seq = j;
            this.ts = j2;
            this.agentId = str;
            this.label = str2;
            this.createdAt = j3;
            this.kind = str3;
        }

        public /* synthetic */ ForkCreated(long j, long j2, String str, String str2, long j3, String str3, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? 0L : j3, (i & 32) != 0 ? null : str3, null);
        }
    }
}
