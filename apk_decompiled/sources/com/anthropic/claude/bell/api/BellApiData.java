package com.anthropic.claude.bell.api;

import defpackage.ew0;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import java.util.Arrays;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiData;", "", "Companion", "AudioData", "MessageData", "com/anthropic/claude/bell/api/y", "Lcom/anthropic/claude/bell/api/BellApiData$AudioData;", "Lcom/anthropic/claude/bell/api/BellApiData$MessageData;", "bell"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public interface BellApiData {
    public static final y Companion = y.a;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiData$AudioData;", "Lcom/anthropic/claude/bell/api/BellApiData;", "", "bytes", "<init>", "([B)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(I[BLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$bell", "(Lcom/anthropic/claude/bell/api/BellApiData$AudioData;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()[B", "copy", "([B)Lcom/anthropic/claude/bell/api/BellApiData$AudioData;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "[B", "getBytes", "Companion", "com/anthropic/claude/bell/api/w", "com/anthropic/claude/bell/api/x", "bell"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class AudioData implements BellApiData {
        public static final int $stable = 8;
        public static final x Companion = new x();
        private final byte[] bytes;

        public /* synthetic */ AudioData(int i, byte[] bArr, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.bytes = bArr;
            } else {
                gvj.f(i, 1, w.a.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ AudioData copy$default(AudioData audioData, byte[] bArr, int i, Object obj) {
            if ((i & 1) != 0) {
                bArr = audioData.bytes;
            }
            return audioData.copy(bArr);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final byte[] getBytes() {
            return this.bytes;
        }

        public final AudioData copy(byte[] bytes) {
            bytes.getClass();
            return new AudioData(bytes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AudioData) && x44.r(this.bytes, ((AudioData) other).bytes);
        }

        public final byte[] getBytes() {
            return this.bytes;
        }

        public int hashCode() {
            return Arrays.hashCode(this.bytes);
        }

        public String toString() {
            return ij0.j("AudioData(bytes=", Arrays.toString(this.bytes), ")");
        }

        public AudioData(byte[] bArr) {
            bArr.getClass();
            this.bytes = bArr;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/bell/api/BellApiData$MessageData;", "Lcom/anthropic/claude/bell/api/BellApiData;", "Lcom/anthropic/claude/bell/api/BellApiServerMessage;", "message", "<init>", "(Lcom/anthropic/claude/bell/api/BellApiServerMessage;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/bell/api/BellApiServerMessage;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$bell", "(Lcom/anthropic/claude/bell/api/BellApiData$MessageData;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/bell/api/BellApiServerMessage;", "copy", "(Lcom/anthropic/claude/bell/api/BellApiServerMessage;)Lcom/anthropic/claude/bell/api/BellApiData$MessageData;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/bell/api/BellApiServerMessage;", "getMessage", "Companion", "com/anthropic/claude/bell/api/z", "com/anthropic/claude/bell/api/a0", "bell"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class MessageData implements BellApiData {
        public static final int $stable = 8;
        private final BellApiServerMessage message;
        public static final a0 Companion = new a0();
        private static final kw9[] $childSerializers = {yb5.w(w1a.F, new ew0(18))};

        public /* synthetic */ MessageData(int i, BellApiServerMessage bellApiServerMessage, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.message = bellApiServerMessage;
            } else {
                gvj.f(i, 1, z.a.getDescriptor());
                throw null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return BellApiServerMessage.Companion.serializer();
        }

        public static /* synthetic */ MessageData copy$default(MessageData messageData, BellApiServerMessage bellApiServerMessage, int i, Object obj) {
            if ((i & 1) != 0) {
                bellApiServerMessage = messageData.message;
            }
            return messageData.copy(bellApiServerMessage);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final BellApiServerMessage getMessage() {
            return this.message;
        }

        public final MessageData copy(BellApiServerMessage message) {
            message.getClass();
            return new MessageData(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MessageData) && x44.r(this.message, ((MessageData) other).message);
        }

        public final BellApiServerMessage getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "MessageData(message=" + this.message + ")";
        }

        public MessageData(BellApiServerMessage bellApiServerMessage) {
            bellApiServerMessage.getClass();
            this.message = bellApiServerMessage;
        }
    }
}
