package com.anthropic.claude.api.chat.messages;

import com.anthropic.claude.api.chat.RefusalStopDetails;
import defpackage.ede;
import defpackage.kgh;
import defpackage.kog;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.tfb;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0003\u0017\u0018\u0019B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/anthropic/claude/api/chat/messages/MessageDelta;", "", "Lkog;", "stop", "<init>", "(Lkog;)V", "component1", "()Lkog;", "copy", "(Lkog;)Lcom/anthropic/claude/api/chat/messages/MessageDelta;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkog;", "getStop", "Companion", "Wire", "com/anthropic/claude/api/chat/messages/d", "tfb", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = d.class)
public final /* data */ class MessageDelta {
    public static final int $stable = 0;
    public static final tfb Companion = new tfb();
    private final kog stop;

    public MessageDelta(kog kogVar) {
        this.stop = kogVar;
    }

    public static /* synthetic */ MessageDelta copy$default(MessageDelta messageDelta, kog kogVar, int i, Object obj) {
        if ((i & 1) != 0) {
            kogVar = messageDelta.stop;
        }
        return messageDelta.copy(kogVar);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final kog getStop() {
        return this.stop;
    }

    public final MessageDelta copy(kog stop) {
        return new MessageDelta(stop);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MessageDelta) && x44.r(this.stop, ((MessageDelta) other).stop);
    }

    public final kog getStop() {
        return this.stop;
    }

    public int hashCode() {
        kog kogVar = this.stop;
        if (kogVar == null) {
            return 0;
        }
        return kogVar.hashCode();
    }

    public String toString() {
        return "MessageDelta(stop=" + this.stop + ")";
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0083\b\u0018\u0000 *2\u00020\u0001:\u0002+,B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ4\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001b¨\u0006-"}, d2 = {"Lcom/anthropic/claude/api/chat/messages/MessageDelta$Wire;", "", "", "stop_reason", "stop_sequence", "Lcom/anthropic/claude/api/chat/RefusalStopDetails;", "stop_details", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/RefusalStopDetails;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/RefusalStopDetails;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/messages/MessageDelta$Wire;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/anthropic/claude/api/chat/RefusalStopDetails;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/RefusalStopDetails;)Lcom/anthropic/claude/api/chat/messages/MessageDelta$Wire;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStop_reason", "getStop_sequence", "Lcom/anthropic/claude/api/chat/RefusalStopDetails;", "getStop_details", "Companion", "com/anthropic/claude/api/chat/messages/e", "com/anthropic/claude/api/chat/messages/f", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Wire {
        public static final f Companion = new f();
        private final RefusalStopDetails stop_details;
        private final String stop_reason;
        private final String stop_sequence;

        public /* synthetic */ Wire(int i, String str, String str2, RefusalStopDetails refusalStopDetails, vnf vnfVar) {
            if ((i & 1) == 0) {
                this.stop_reason = null;
            } else {
                this.stop_reason = str;
            }
            if ((i & 2) == 0) {
                this.stop_sequence = null;
            } else {
                this.stop_sequence = str2;
            }
            if ((i & 4) == 0) {
                this.stop_details = null;
            } else {
                this.stop_details = refusalStopDetails;
            }
        }

        public static /* synthetic */ Wire copy$default(Wire wire, String str, String str2, RefusalStopDetails refusalStopDetails, int i, Object obj) {
            if ((i & 1) != 0) {
                str = wire.stop_reason;
            }
            if ((i & 2) != 0) {
                str2 = wire.stop_sequence;
            }
            if ((i & 4) != 0) {
                refusalStopDetails = wire.stop_details;
            }
            return wire.copy(str, str2, refusalStopDetails);
        }

        public static final /* synthetic */ void write$Self$api(Wire self, vd4 output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || self.stop_reason != null) {
                output.B(serialDesc, 0, srg.a, self.stop_reason);
            }
            if (output.E(serialDesc) || self.stop_sequence != null) {
                output.B(serialDesc, 1, srg.a, self.stop_sequence);
            }
            if (!output.E(serialDesc) && self.stop_details == null) {
                return;
            }
            output.B(serialDesc, 2, ede.a, self.stop_details);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getStop_reason() {
            return this.stop_reason;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getStop_sequence() {
            return this.stop_sequence;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final RefusalStopDetails getStop_details() {
            return this.stop_details;
        }

        public final Wire copy(String stop_reason, String stop_sequence, RefusalStopDetails stop_details) {
            return new Wire(stop_reason, stop_sequence, stop_details);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Wire)) {
                return false;
            }
            Wire wire = (Wire) other;
            return x44.r(this.stop_reason, wire.stop_reason) && x44.r(this.stop_sequence, wire.stop_sequence) && x44.r(this.stop_details, wire.stop_details);
        }

        public final RefusalStopDetails getStop_details() {
            return this.stop_details;
        }

        public final String getStop_reason() {
            return this.stop_reason;
        }

        public final String getStop_sequence() {
            return this.stop_sequence;
        }

        public int hashCode() {
            String str = this.stop_reason;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.stop_sequence;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            RefusalStopDetails refusalStopDetails = this.stop_details;
            return iHashCode2 + (refusalStopDetails != null ? refusalStopDetails.hashCode() : 0);
        }

        public String toString() {
            String str = this.stop_reason;
            String str2 = this.stop_sequence;
            RefusalStopDetails refusalStopDetails = this.stop_details;
            StringBuilder sbR = kgh.r("Wire(stop_reason=", str, ", stop_sequence=", str2, ", stop_details=");
            sbR.append(refusalStopDetails);
            sbR.append(")");
            return sbR.toString();
        }

        public Wire() {
            this((String) null, (String) null, (RefusalStopDetails) null, 7, (mq5) null);
        }

        public Wire(String str, String str2, RefusalStopDetails refusalStopDetails) {
            this.stop_reason = str;
            this.stop_sequence = str2;
            this.stop_details = refusalStopDetails;
        }

        public /* synthetic */ Wire(String str, String str2, RefusalStopDetails refusalStopDetails, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : refusalStopDetails);
        }
    }
}
