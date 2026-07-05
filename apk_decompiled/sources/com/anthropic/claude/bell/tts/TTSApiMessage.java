package com.anthropic.claude.bell.tts;

import defpackage.b2h;
import defpackage.crg;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.jce;
import defpackage.kce;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.odf;
import defpackage.onf;
import defpackage.pl9;
import defpackage.qg9;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0001\u0014¨\u0006\u0015"}, d2 = {"Lcom/anthropic/claude/bell/tts/TTSApiMessage;", "", "<init>", "()V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self", "(Lcom/anthropic/claude/bell/tts/TTSApiMessage;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "TextChunkInputMessage", "b2h", "Lcom/anthropic/claude/bell/tts/TTSApiMessage$TextChunkInputMessage;", "bell"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
@qg9(discriminator = "type")
public abstract class TTSApiMessage {
    public static final int $stable = 8;
    public static final b2h Companion = new b2h();
    private static final kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new crg(17));

    public /* synthetic */ TTSApiMessage(mq5 mq5Var) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _init_$_anonymous_() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.bell.tts.TTSApiMessage", kceVar.b(TTSApiMessage.class), new pl9[]{kceVar.b(TextChunkInputMessage.class)}, new KSerializer[]{b.a}, new Annotation[]{new a()});
    }

    public static final /* synthetic */ void write$Self(TTSApiMessage self, vd4 output, SerialDescriptor serialDesc) {
    }

    private TTSApiMessage() {
    }

    public /* synthetic */ TTSApiMessage(int i, vnf vnfVar) {
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lcom/anthropic/claude/bell/tts/TTSApiMessage$TextChunkInputMessage;", "Lcom/anthropic/claude/bell/tts/TTSApiMessage;", "", "text", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$bell", "(Lcom/anthropic/claude/bell/tts/TTSApiMessage$TextChunkInputMessage;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/bell/tts/TTSApiMessage$TextChunkInputMessage;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getType", "Companion", "com/anthropic/claude/bell/tts/b", "com/anthropic/claude/bell/tts/c", "bell"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class TextChunkInputMessage extends TTSApiMessage {
        public static final int $stable = 0;
        public static final c Companion = new c();
        private final String text;
        private final String type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ TextChunkInputMessage(int i, String str, String str2, vnf vnfVar) {
            super(i, vnfVar);
            if (1 != (i & 1)) {
                gvj.f(i, 1, b.a.getDescriptor());
                throw null;
            }
            this.text = str;
            if ((i & 2) == 0) {
                this.type = "TextChunkInputMessage";
            } else {
                this.type = str2;
            }
        }

        public static /* synthetic */ TextChunkInputMessage copy$default(TextChunkInputMessage textChunkInputMessage, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = textChunkInputMessage.text;
            }
            if ((i & 2) != 0) {
                str2 = textChunkInputMessage.type;
            }
            return textChunkInputMessage.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$bell(TextChunkInputMessage self, vd4 output, SerialDescriptor serialDesc) {
            TTSApiMessage.write$Self(self, output, serialDesc);
            output.q(serialDesc, 0, self.text);
            if (!output.E(serialDesc) && x44.r(self.type, "TextChunkInputMessage")) {
                return;
            }
            output.q(serialDesc, 1, self.type);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final TextChunkInputMessage copy(String text, String type) {
            text.getClass();
            type.getClass();
            return new TextChunkInputMessage(text, type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextChunkInputMessage)) {
                return false;
            }
            TextChunkInputMessage textChunkInputMessage = (TextChunkInputMessage) other;
            return x44.r(this.text, textChunkInputMessage.text) && x44.r(this.type, textChunkInputMessage.type);
        }

        public final String getText() {
            return this.text;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode() + (this.text.hashCode() * 31);
        }

        public String toString() {
            return ij0.l("TextChunkInputMessage(text=", this.text, ", type=", this.type, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextChunkInputMessage(String str, String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.text = str;
            this.type = str2;
        }

        public /* synthetic */ TextChunkInputMessage(String str, String str2, int i, mq5 mq5Var) {
            this(str, (i & 2) != 0 ? "TextChunkInputMessage" : str2);
        }
    }
}
