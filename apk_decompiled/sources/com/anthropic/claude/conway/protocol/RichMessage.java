package com.anthropic.claude.conway.protocol;

import defpackage.afe;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.uo0;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.yse;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \n2\u00020\u0001:\u0005\u000b\f\r\u000e\u000fR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0004\u0010\u0011\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/conway/protocol/RichMessage;", "", "", "getId", "()Ljava/lang/String;", "id", "", "getTimestamp", "()J", "timestamp", "Companion", "User", "Assistant", "Status", "Unknown", "yse", "Lcom/anthropic/claude/conway/protocol/RichMessage$Assistant;", "Lcom/anthropic/claude/conway/protocol/RichMessage$Status;", "Lcom/anthropic/claude/conway/protocol/RichMessage$Unknown;", "Lcom/anthropic/claude/conway/protocol/RichMessage$User;", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = n0.class)
public interface RichMessage {
    public static final yse Companion = yse.a;

    String getId();

    long getTimestamp();

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019¨\u0006+"}, d2 = {"Lcom/anthropic/claude/conway/protocol/RichMessage$Unknown;", "Lcom/anthropic/claude/conway/protocol/RichMessage;", "", "id", "", "timestamp", "<init>", "(Ljava/lang/String;J)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;JLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/RichMessage$Unknown;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()J", "copy", "(Ljava/lang/String;J)Lcom/anthropic/claude/conway/protocol/RichMessage$Unknown;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "J", "getTimestamp", "Companion", "com/anthropic/claude/conway/protocol/j0", "com/anthropic/claude/conway/protocol/k0", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Unknown implements RichMessage {
        public static final int $stable = 0;
        public static final k0 Companion = new k0();
        private final String id;
        private final long timestamp;

        public /* synthetic */ Unknown(int i, String str, long j, vnf vnfVar) {
            this.id = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.timestamp = 0L;
            } else {
                this.timestamp = j;
            }
        }

        public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unknown.id;
            }
            if ((i & 2) != 0) {
                j = unknown.timestamp;
            }
            return unknown.copy(str, j);
        }

        public static final /* synthetic */ void write$Self$conway(Unknown self, vd4 output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || !x44.r(self.getId(), "")) {
                output.q(serialDesc, 0, self.getId());
            }
            if (!output.E(serialDesc) && self.getTimestamp() == 0) {
                return;
            }
            output.D(serialDesc, 1, self.getTimestamp());
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        public final Unknown copy(String id, long timestamp) {
            id.getClass();
            return new Unknown(id, timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Unknown)) {
                return false;
            }
            Unknown unknown = (Unknown) other;
            return x44.r(this.id, unknown.id) && this.timestamp == unknown.timestamp;
        }

        @Override // com.anthropic.claude.conway.protocol.RichMessage
        public String getId() {
            return this.id;
        }

        @Override // com.anthropic.claude.conway.protocol.RichMessage
        public long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return Long.hashCode(this.timestamp) + (this.id.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sbW = vb7.w("Unknown(id=", this.id, ", timestamp=", this.timestamp);
            sbW.append(")");
            return sbW.toString();
        }

        public Unknown() {
            this((String) null, 0L, 3, (mq5) null);
        }

        public Unknown(String str, long j) {
            str.getClass();
            this.id = str;
            this.timestamp = j;
        }

        public /* synthetic */ Unknown(String str, long j, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j);
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bBG\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J>\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u001bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010 ¨\u00065"}, d2 = {"Lcom/anthropic/claude/conway/protocol/RichMessage$Status;", "Lcom/anthropic/claude/conway/protocol/RichMessage;", "", "id", "", "timestamp", "subtype", "", "Lcom/anthropic/claude/conway/protocol/ContentBlock;", "content", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;JLjava/lang/String;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/RichMessage$Status;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;JLjava/lang/String;Ljava/util/List;)Lcom/anthropic/claude/conway/protocol/RichMessage$Status;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "J", "getTimestamp", "getSubtype", "Ljava/util/List;", "getContent", "Companion", "com/anthropic/claude/conway/protocol/h0", "com/anthropic/claude/conway/protocol/i0", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Status implements RichMessage {
        public static final int $stable = 8;
        private final List<ContentBlock> content;
        private final String id;
        private final String subtype;
        private final long timestamp;
        public static final i0 Companion = new i0();
        private static final kw9[] $childSerializers = {null, null, null, yb5.w(w1a.F, new afe(15))};

        public /* synthetic */ Status(int i, String str, long j, String str2, List list, vnf vnfVar) {
            if (7 != (i & 7)) {
                gvj.f(i, 7, h0.a.getDescriptor());
                throw null;
            }
            this.id = str;
            this.timestamp = j;
            this.subtype = str2;
            if ((i & 8) == 0) {
                this.content = lm6.E;
            } else {
                this.content = list;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new uo0(u.c, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Status copy$default(Status status, String str, long j, String str2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = status.id;
            }
            if ((i & 2) != 0) {
                j = status.timestamp;
            }
            if ((i & 4) != 0) {
                str2 = status.subtype;
            }
            if ((i & 8) != 0) {
                list = status.content;
            }
            return status.copy(str, j, str2, list);
        }

        public static final /* synthetic */ void write$Self$conway(Status self, vd4 output, SerialDescriptor serialDesc) {
            kw9[] kw9VarArr = $childSerializers;
            output.q(serialDesc, 0, self.getId());
            output.D(serialDesc, 1, self.getTimestamp());
            output.q(serialDesc, 2, self.subtype);
            if (!output.E(serialDesc) && x44.r(self.content, lm6.E)) {
                return;
            }
            output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.content);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getSubtype() {
            return this.subtype;
        }

        public final List<ContentBlock> component4() {
            return this.content;
        }

        public final Status copy(String id, long timestamp, String subtype, List<? extends ContentBlock> content) {
            id.getClass();
            subtype.getClass();
            content.getClass();
            return new Status(id, timestamp, subtype, content);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Status)) {
                return false;
            }
            Status status = (Status) other;
            return x44.r(this.id, status.id) && this.timestamp == status.timestamp && x44.r(this.subtype, status.subtype) && x44.r(this.content, status.content);
        }

        public final List<ContentBlock> getContent() {
            return this.content;
        }

        @Override // com.anthropic.claude.conway.protocol.RichMessage
        public String getId() {
            return this.id;
        }

        public final String getSubtype() {
            return this.subtype;
        }

        @Override // com.anthropic.claude.conway.protocol.RichMessage
        public long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return this.content.hashCode() + kgh.l(vb7.e(this.id.hashCode() * 31, 31, this.timestamp), 31, this.subtype);
        }

        public String toString() {
            String str = this.id;
            long j = this.timestamp;
            String str2 = this.subtype;
            List<ContentBlock> list = this.content;
            StringBuilder sbW = vb7.w("Status(id=", str, ", timestamp=", j);
            sbW.append(", subtype=");
            sbW.append(str2);
            sbW.append(", content=");
            sbW.append(list);
            sbW.append(")");
            return sbW.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Status(String str, long j, String str2, List<? extends ContentBlock> list) {
            str.getClass();
            str2.getClass();
            list.getClass();
            this.id = str;
            this.timestamp = j;
            this.subtype = str2;
            this.content = list;
        }

        public /* synthetic */ Status(String str, long j, String str2, List list, int i, mq5 mq5Var) {
            this(str, j, str2, (i & 8) != 0 ? lm6.E : list);
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBE\b\u0010\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÆ\u0003¢\u0006\u0004\b \u0010!J>\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b%\u0010!J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010!¨\u00066"}, d2 = {"Lcom/anthropic/claude/conway/protocol/RichMessage$Assistant;", "Lcom/anthropic/claude/conway/protocol/RichMessage;", "", "id", "", "timestamp", "", "Lcom/anthropic/claude/conway/protocol/ContentBlock;", "content", "", "tokenCount", "<init>", "(Ljava/lang/String;JLjava/util/List;I)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;JLjava/util/List;ILvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/RichMessage$Assistant;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "()Ljava/util/List;", "component4", "()I", "copy", "(Ljava/lang/String;JLjava/util/List;I)Lcom/anthropic/claude/conway/protocol/RichMessage$Assistant;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "J", "getTimestamp", "Ljava/util/List;", "getContent", "I", "getTokenCount", "Companion", "com/anthropic/claude/conway/protocol/f0", "com/anthropic/claude/conway/protocol/g0", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Assistant implements RichMessage {
        public static final int $stable = 8;
        private final List<ContentBlock> content;
        private final String id;
        private final long timestamp;
        private final int tokenCount;
        public static final g0 Companion = new g0();
        private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new afe(14)), null};

        public /* synthetic */ Assistant(int i, String str, long j, List list, int i2, vnf vnfVar) {
            if (3 != (i & 3)) {
                gvj.f(i, 3, f0.a.getDescriptor());
                throw null;
            }
            this.id = str;
            this.timestamp = j;
            if ((i & 4) == 0) {
                this.content = lm6.E;
            } else {
                this.content = list;
            }
            if ((i & 8) == 0) {
                this.tokenCount = 0;
            } else {
                this.tokenCount = i2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new uo0(u.c, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Assistant copy$default(Assistant assistant, String str, long j, List list, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = assistant.id;
            }
            if ((i2 & 2) != 0) {
                j = assistant.timestamp;
            }
            if ((i2 & 4) != 0) {
                list = assistant.content;
            }
            if ((i2 & 8) != 0) {
                i = assistant.tokenCount;
            }
            return assistant.copy(str, j, list, i);
        }

        public static final /* synthetic */ void write$Self$conway(Assistant self, vd4 output, SerialDescriptor serialDesc) {
            kw9[] kw9VarArr = $childSerializers;
            output.q(serialDesc, 0, self.getId());
            output.D(serialDesc, 1, self.getTimestamp());
            if (output.E(serialDesc) || !x44.r(self.content, lm6.E)) {
                output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.content);
            }
            if (!output.E(serialDesc) && self.tokenCount == 0) {
                return;
            }
            output.l(3, self.tokenCount, serialDesc);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        public final List<ContentBlock> component3() {
            return this.content;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getTokenCount() {
            return this.tokenCount;
        }

        public final Assistant copy(String id, long timestamp, List<? extends ContentBlock> content, int tokenCount) {
            id.getClass();
            content.getClass();
            return new Assistant(id, timestamp, content, tokenCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Assistant)) {
                return false;
            }
            Assistant assistant = (Assistant) other;
            return x44.r(this.id, assistant.id) && this.timestamp == assistant.timestamp && x44.r(this.content, assistant.content) && this.tokenCount == assistant.tokenCount;
        }

        public final List<ContentBlock> getContent() {
            return this.content;
        }

        @Override // com.anthropic.claude.conway.protocol.RichMessage
        public String getId() {
            return this.id;
        }

        @Override // com.anthropic.claude.conway.protocol.RichMessage
        public long getTimestamp() {
            return this.timestamp;
        }

        public final int getTokenCount() {
            return this.tokenCount;
        }

        public int hashCode() {
            return Integer.hashCode(this.tokenCount) + kgh.m(vb7.e(this.id.hashCode() * 31, 31, this.timestamp), 31, this.content);
        }

        public String toString() {
            String str = this.id;
            long j = this.timestamp;
            List<ContentBlock> list = this.content;
            int i = this.tokenCount;
            StringBuilder sbW = vb7.w("Assistant(id=", str, ", timestamp=", j);
            sbW.append(", content=");
            sbW.append(list);
            sbW.append(", tokenCount=");
            sbW.append(i);
            sbW.append(")");
            return sbW.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Assistant(String str, long j, List<? extends ContentBlock> list, int i) {
            str.getClass();
            list.getClass();
            this.id = str;
            this.timestamp = j;
            this.content = list;
            this.tokenCount = i;
        }

        public /* synthetic */ Assistant(String str, long j, List list, int i, int i2, mq5 mq5Var) {
            this(str, j, (i2 & 4) != 0 ? lm6.E : list, (i2 & 8) != 0 ? 0 : i);
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBE\b\u0010\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÆ\u0003¢\u0006\u0004\b \u0010!J>\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b%\u0010!J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010!¨\u00066"}, d2 = {"Lcom/anthropic/claude/conway/protocol/RichMessage$User;", "Lcom/anthropic/claude/conway/protocol/RichMessage;", "", "id", "", "timestamp", "", "Lcom/anthropic/claude/conway/protocol/UserPart;", "parts", "", "tokenCount", "<init>", "(Ljava/lang/String;JLjava/util/List;I)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;JLjava/util/List;ILvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/RichMessage$User;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "()Ljava/util/List;", "component4", "()I", "copy", "(Ljava/lang/String;JLjava/util/List;I)Lcom/anthropic/claude/conway/protocol/RichMessage$User;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "J", "getTimestamp", "Ljava/util/List;", "getParts", "I", "getTokenCount", "Companion", "com/anthropic/claude/conway/protocol/l0", "com/anthropic/claude/conway/protocol/m0", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class User implements RichMessage {
        public static final int $stable = 8;
        private final String id;
        private final List<UserPart> parts;
        private final long timestamp;
        private final int tokenCount;
        public static final m0 Companion = new m0();
        private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new afe(16)), null};

        public /* synthetic */ User(int i, String str, long j, List list, int i2, vnf vnfVar) {
            if (3 != (i & 3)) {
                gvj.f(i, 3, l0.a.getDescriptor());
                throw null;
            }
            this.id = str;
            this.timestamp = j;
            if ((i & 4) == 0) {
                this.parts = lm6.E;
            } else {
                this.parts = list;
            }
            if ((i & 8) == 0) {
                this.tokenCount = 0;
            } else {
                this.tokenCount = i2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new uo0(h2.c, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ User copy$default(User user, String str, long j, List list, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = user.id;
            }
            if ((i2 & 2) != 0) {
                j = user.timestamp;
            }
            if ((i2 & 4) != 0) {
                list = user.parts;
            }
            if ((i2 & 8) != 0) {
                i = user.tokenCount;
            }
            return user.copy(str, j, list, i);
        }

        public static final /* synthetic */ void write$Self$conway(User self, vd4 output, SerialDescriptor serialDesc) {
            kw9[] kw9VarArr = $childSerializers;
            output.q(serialDesc, 0, self.getId());
            output.D(serialDesc, 1, self.getTimestamp());
            if (output.E(serialDesc) || !x44.r(self.parts, lm6.E)) {
                output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.parts);
            }
            if (!output.E(serialDesc) && self.tokenCount == 0) {
                return;
            }
            output.l(3, self.tokenCount, serialDesc);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        public final List<UserPart> component3() {
            return this.parts;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getTokenCount() {
            return this.tokenCount;
        }

        public final User copy(String id, long timestamp, List<? extends UserPart> parts, int tokenCount) {
            id.getClass();
            parts.getClass();
            return new User(id, timestamp, parts, tokenCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof User)) {
                return false;
            }
            User user = (User) other;
            return x44.r(this.id, user.id) && this.timestamp == user.timestamp && x44.r(this.parts, user.parts) && this.tokenCount == user.tokenCount;
        }

        @Override // com.anthropic.claude.conway.protocol.RichMessage
        public String getId() {
            return this.id;
        }

        public final List<UserPart> getParts() {
            return this.parts;
        }

        @Override // com.anthropic.claude.conway.protocol.RichMessage
        public long getTimestamp() {
            return this.timestamp;
        }

        public final int getTokenCount() {
            return this.tokenCount;
        }

        public int hashCode() {
            return Integer.hashCode(this.tokenCount) + kgh.m(vb7.e(this.id.hashCode() * 31, 31, this.timestamp), 31, this.parts);
        }

        public String toString() {
            String str = this.id;
            long j = this.timestamp;
            List<UserPart> list = this.parts;
            int i = this.tokenCount;
            StringBuilder sbW = vb7.w("User(id=", str, ", timestamp=", j);
            sbW.append(", parts=");
            sbW.append(list);
            sbW.append(", tokenCount=");
            sbW.append(i);
            sbW.append(")");
            return sbW.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public User(String str, long j, List<? extends UserPart> list, int i) {
            str.getClass();
            list.getClass();
            this.id = str;
            this.timestamp = j;
            this.parts = list;
            this.tokenCount = i;
        }

        public /* synthetic */ User(String str, long j, List list, int i, int i2, mq5 mq5Var) {
            this(str, j, (i2 & 4) != 0 ? lm6.E : list, (i2 & 8) != 0 ? 0 : i);
        }
    }
}
