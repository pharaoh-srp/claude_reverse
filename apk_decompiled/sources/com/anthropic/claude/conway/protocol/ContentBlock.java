package com.anthropic.claude.conway.protocol;

import defpackage.eh9;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.l84;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nm6;
import defpackage.onf;
import defpackage.sq6;
import defpackage.srg;
import defpackage.uh9;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.zm4;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/conway/protocol/ContentBlock;", "", "Companion", "Thinking", "Text", "ToolUse", "ToolResult", "Image", "ServerToolUse", "WebSearchToolResult", "Unknown", "zm4", "Lcom/anthropic/claude/conway/protocol/ContentBlock$Image;", "Lcom/anthropic/claude/conway/protocol/ContentBlock$ServerToolUse;", "Lcom/anthropic/claude/conway/protocol/ContentBlock$Text;", "Lcom/anthropic/claude/conway/protocol/ContentBlock$Thinking;", "Lcom/anthropic/claude/conway/protocol/ContentBlock$ToolResult;", "Lcom/anthropic/claude/conway/protocol/ContentBlock$ToolUse;", "Lcom/anthropic/claude/conway/protocol/ContentBlock$Unknown;", "Lcom/anthropic/claude/conway/protocol/ContentBlock$WebSearchToolResult;", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = u.class)
public interface ContentBlock {
    public static final zm4 Companion = zm4.a;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/conway/protocol/ContentBlock$Unknown;", "Lcom/anthropic/claude/conway/protocol/ContentBlock;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "conway", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Unknown implements ContentBlock {
        public static final int $stable = 0;
        public static final Unknown INSTANCE = new Unknown();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new l84(20));

        private Unknown() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.conway.protocol.ContentBlock.Unknown", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Unknown);
        }

        public int hashCode() {
            return 718038438;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Unknown";
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/anthropic/claude/conway/protocol/ContentBlock$Text;", "Lcom/anthropic/claude/conway/protocol/ContentBlock;", "", "text", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/ContentBlock$Text;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/anthropic/claude/conway/protocol/ContentBlock$Text;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Companion", "com/anthropic/claude/conway/protocol/k", "com/anthropic/claude/conway/protocol/l", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Text implements ContentBlock {
        public static final int $stable = 0;
        public static final l Companion = new l();
        private final String text;

        public /* synthetic */ Text(int i, String str, vnf vnfVar) {
            if ((i & 1) == 0) {
                this.text = "";
            } else {
                this.text = str;
            }
        }

        public static /* synthetic */ Text copy$default(Text text, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = text.text;
            }
            return text.copy(str);
        }

        public static final /* synthetic */ void write$Self$conway(Text self, vd4 output, SerialDescriptor serialDesc) {
            if (!output.E(serialDesc) && x44.r(self.text, "")) {
                return;
            }
            output.q(serialDesc, 0, self.text);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final Text copy(String text) {
            text.getClass();
            return new Text(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Text) && x44.r(this.text, ((Text) other).text);
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return ij0.j("Text(text=", this.text, ")");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Text() {
            this((String) null, 1, (mq5) (0 == true ? 1 : 0));
        }

        public Text(String str) {
            str.getClass();
            this.text = str;
        }

        public /* synthetic */ Text(String str, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/conway/protocol/ContentBlock$Image;", "Lcom/anthropic/claude/conway/protocol/ContentBlock;", "Lkotlinx/serialization/json/JsonElement;", "source", "<init>", "(Lkotlinx/serialization/json/JsonElement;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILkotlinx/serialization/json/JsonElement;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/ContentBlock$Image;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lkotlinx/serialization/json/JsonElement;", "copy", "(Lkotlinx/serialization/json/JsonElement;)Lcom/anthropic/claude/conway/protocol/ContentBlock$Image;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/serialization/json/JsonElement;", "getSource", "Companion", "com/anthropic/claude/conway/protocol/g", "com/anthropic/claude/conway/protocol/h", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Image implements ContentBlock {
        public static final int $stable = 8;
        public static final h Companion = new h();
        private final JsonElement source;

        public /* synthetic */ Image(int i, JsonElement jsonElement, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.source = jsonElement;
            } else {
                gvj.f(i, 1, g.a.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ Image copy$default(Image image, JsonElement jsonElement, int i, Object obj) {
            if ((i & 1) != 0) {
                jsonElement = image.source;
            }
            return image.copy(jsonElement);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final JsonElement getSource() {
            return this.source;
        }

        public final Image copy(JsonElement source) {
            source.getClass();
            return new Image(source);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Image) && x44.r(this.source, ((Image) other).source);
        }

        public final JsonElement getSource() {
            return this.source;
        }

        public int hashCode() {
            return this.source.hashCode();
        }

        public String toString() {
            return "Image(source=" + this.source + ")";
        }

        public Image(JsonElement jsonElement) {
            jsonElement.getClass();
            this.source = jsonElement;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J&\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lcom/anthropic/claude/conway/protocol/ContentBlock$Thinking;", "Lcom/anthropic/claude/conway/protocol/ContentBlock;", "", "thinking", "signature", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/ContentBlock$Thinking;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/conway/protocol/ContentBlock$Thinking;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getThinking", "getSignature", "Companion", "com/anthropic/claude/conway/protocol/m", "com/anthropic/claude/conway/protocol/n", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Thinking implements ContentBlock {
        public static final int $stable = 0;
        public static final n Companion = new n();
        private final String signature;
        private final String thinking;

        public /* synthetic */ Thinking(int i, String str, String str2, vnf vnfVar) {
            this.thinking = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.signature = null;
            } else {
                this.signature = str2;
            }
        }

        public static /* synthetic */ Thinking copy$default(Thinking thinking, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = thinking.thinking;
            }
            if ((i & 2) != 0) {
                str2 = thinking.signature;
            }
            return thinking.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$conway(Thinking self, vd4 output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || !x44.r(self.thinking, "")) {
                output.q(serialDesc, 0, self.thinking);
            }
            if (!output.E(serialDesc) && self.signature == null) {
                return;
            }
            output.B(serialDesc, 1, srg.a, self.signature);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getThinking() {
            return this.thinking;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSignature() {
            return this.signature;
        }

        public final Thinking copy(String thinking, String signature) {
            thinking.getClass();
            return new Thinking(thinking, signature);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Thinking)) {
                return false;
            }
            Thinking thinking = (Thinking) other;
            return x44.r(this.thinking, thinking.thinking) && x44.r(this.signature, thinking.signature);
        }

        public final String getSignature() {
            return this.signature;
        }

        public final String getThinking() {
            return this.thinking;
        }

        public int hashCode() {
            int iHashCode = this.thinking.hashCode() * 31;
            String str = this.signature;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return ij0.l("Thinking(thinking=", this.thinking, ", signature=", this.signature, ")");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Thinking() {
            this((String) null, (String) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
        }

        public Thinking(String str, String str2) {
            str.getClass();
            this.thinking = str;
            this.signature = str2;
        }

        public /* synthetic */ Thinking(String str, String str2, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2);
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0019¨\u0006-"}, d2 = {"Lcom/anthropic/claude/conway/protocol/ContentBlock$WebSearchToolResult;", "Lcom/anthropic/claude/conway/protocol/ContentBlock;", "", "toolUseId", "Lkotlinx/serialization/json/JsonElement;", "content", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/json/JsonElement;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/ContentBlock$WebSearchToolResult;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lkotlinx/serialization/json/JsonElement;", "copy", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lcom/anthropic/claude/conway/protocol/ContentBlock$WebSearchToolResult;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getToolUseId", "getToolUseId$annotations", "()V", "Lkotlinx/serialization/json/JsonElement;", "getContent", "Companion", "com/anthropic/claude/conway/protocol/s", "com/anthropic/claude/conway/protocol/t", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class WebSearchToolResult implements ContentBlock {
        public static final int $stable = 8;
        public static final t Companion = new t();
        private final JsonElement content;
        private final String toolUseId;

        public /* synthetic */ WebSearchToolResult(int i, String str, JsonElement jsonElement, vnf vnfVar) {
            if (3 != (i & 3)) {
                gvj.f(i, 3, s.a.getDescriptor());
                throw null;
            }
            this.toolUseId = str;
            this.content = jsonElement;
        }

        public static /* synthetic */ WebSearchToolResult copy$default(WebSearchToolResult webSearchToolResult, String str, JsonElement jsonElement, int i, Object obj) {
            if ((i & 1) != 0) {
                str = webSearchToolResult.toolUseId;
            }
            if ((i & 2) != 0) {
                jsonElement = webSearchToolResult.content;
            }
            return webSearchToolResult.copy(str, jsonElement);
        }

        public static /* synthetic */ void getToolUseId$annotations() {
        }

        public static final /* synthetic */ void write$Self$conway(WebSearchToolResult self, vd4 output, SerialDescriptor serialDesc) {
            output.q(serialDesc, 0, self.toolUseId);
            output.r(serialDesc, 1, eh9.a, self.content);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getToolUseId() {
            return this.toolUseId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final JsonElement getContent() {
            return this.content;
        }

        public final WebSearchToolResult copy(String toolUseId, JsonElement content) {
            toolUseId.getClass();
            content.getClass();
            return new WebSearchToolResult(toolUseId, content);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WebSearchToolResult)) {
                return false;
            }
            WebSearchToolResult webSearchToolResult = (WebSearchToolResult) other;
            return x44.r(this.toolUseId, webSearchToolResult.toolUseId) && x44.r(this.content, webSearchToolResult.content);
        }

        public final JsonElement getContent() {
            return this.content;
        }

        public final String getToolUseId() {
            return this.toolUseId;
        }

        public int hashCode() {
            return this.content.hashCode() + (this.toolUseId.hashCode() * 31);
        }

        public String toString() {
            return "WebSearchToolResult(toolUseId=" + this.toolUseId + ", content=" + this.content + ")";
        }

        public WebSearchToolResult(String str, JsonElement jsonElement) {
            str.getClass();
            jsonElement.getClass();
            this.toolUseId = str;
            this.content = jsonElement;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001b¨\u0006."}, d2 = {"Lcom/anthropic/claude/conway/protocol/ContentBlock$ServerToolUse;", "Lcom/anthropic/claude/conway/protocol/ContentBlock;", "", "id", "name", "Lkotlinx/serialization/json/JsonObject;", "input", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/ContentBlock$ServerToolUse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lkotlinx/serialization/json/JsonObject;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)Lcom/anthropic/claude/conway/protocol/ContentBlock$ServerToolUse;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "Lkotlinx/serialization/json/JsonObject;", "getInput", "Companion", "com/anthropic/claude/conway/protocol/i", "com/anthropic/claude/conway/protocol/j", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ServerToolUse implements ContentBlock {
        public static final int $stable = 8;
        public static final j Companion = new j();
        private final String id;
        private final JsonObject input;
        private final String name;

        public /* synthetic */ ServerToolUse(int i, String str, String str2, JsonObject jsonObject, vnf vnfVar) {
            if (3 != (i & 3)) {
                gvj.f(i, 3, i.a.getDescriptor());
                throw null;
            }
            this.id = str;
            this.name = str2;
            if ((i & 4) == 0) {
                this.input = new JsonObject(nm6.E);
            } else {
                this.input = jsonObject;
            }
        }

        public static /* synthetic */ ServerToolUse copy$default(ServerToolUse serverToolUse, String str, String str2, JsonObject jsonObject, int i, Object obj) {
            if ((i & 1) != 0) {
                str = serverToolUse.id;
            }
            if ((i & 2) != 0) {
                str2 = serverToolUse.name;
            }
            if ((i & 4) != 0) {
                jsonObject = serverToolUse.input;
            }
            return serverToolUse.copy(str, str2, jsonObject);
        }

        public static final /* synthetic */ void write$Self$conway(ServerToolUse self, vd4 output, SerialDescriptor serialDesc) {
            output.q(serialDesc, 0, self.id);
            output.q(serialDesc, 1, self.name);
            if (!output.E(serialDesc) && x44.r(self.input, new JsonObject(nm6.E))) {
                return;
            }
            output.r(serialDesc, 2, uh9.a, self.input);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final JsonObject getInput() {
            return this.input;
        }

        public final ServerToolUse copy(String id, String name, JsonObject input) {
            id.getClass();
            name.getClass();
            input.getClass();
            return new ServerToolUse(id, name, input);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ServerToolUse)) {
                return false;
            }
            ServerToolUse serverToolUse = (ServerToolUse) other;
            return x44.r(this.id, serverToolUse.id) && x44.r(this.name, serverToolUse.name) && x44.r(this.input, serverToolUse.input);
        }

        public final String getId() {
            return this.id;
        }

        public final JsonObject getInput() {
            return this.input;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.input.hashCode() + kgh.l(this.id.hashCode() * 31, 31, this.name);
        }

        public String toString() {
            String str = this.id;
            String str2 = this.name;
            JsonObject jsonObject = this.input;
            StringBuilder sbR = kgh.r("ServerToolUse(id=", str, ", name=", str2, ", input=");
            sbR.append(jsonObject);
            sbR.append(")");
            return sbR.toString();
        }

        public ServerToolUse(String str, String str2, JsonObject jsonObject) {
            str.getClass();
            str2.getClass();
            jsonObject.getClass();
            this.id = str;
            this.name = str2;
            this.input = jsonObject;
        }

        public /* synthetic */ ServerToolUse(String str, String str2, JsonObject jsonObject, int i, mq5 mq5Var) {
            this(str, str2, (i & 4) != 0 ? new JsonObject(nm6.E) : jsonObject);
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001b¨\u0006."}, d2 = {"Lcom/anthropic/claude/conway/protocol/ContentBlock$ToolUse;", "Lcom/anthropic/claude/conway/protocol/ContentBlock;", "", "id", "name", "Lkotlinx/serialization/json/JsonObject;", "input", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/ContentBlock$ToolUse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lkotlinx/serialization/json/JsonObject;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)Lcom/anthropic/claude/conway/protocol/ContentBlock$ToolUse;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "Lkotlinx/serialization/json/JsonObject;", "getInput", "Companion", "com/anthropic/claude/conway/protocol/q", "com/anthropic/claude/conway/protocol/r", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ToolUse implements ContentBlock {
        public static final int $stable = 8;
        public static final r Companion = new r();
        private final String id;
        private final JsonObject input;
        private final String name;

        public /* synthetic */ ToolUse(int i, String str, String str2, JsonObject jsonObject, vnf vnfVar) {
            if (3 != (i & 3)) {
                gvj.f(i, 3, q.a.getDescriptor());
                throw null;
            }
            this.id = str;
            this.name = str2;
            if ((i & 4) == 0) {
                this.input = new JsonObject(nm6.E);
            } else {
                this.input = jsonObject;
            }
        }

        public static /* synthetic */ ToolUse copy$default(ToolUse toolUse, String str, String str2, JsonObject jsonObject, int i, Object obj) {
            if ((i & 1) != 0) {
                str = toolUse.id;
            }
            if ((i & 2) != 0) {
                str2 = toolUse.name;
            }
            if ((i & 4) != 0) {
                jsonObject = toolUse.input;
            }
            return toolUse.copy(str, str2, jsonObject);
        }

        public static final /* synthetic */ void write$Self$conway(ToolUse self, vd4 output, SerialDescriptor serialDesc) {
            output.q(serialDesc, 0, self.id);
            output.q(serialDesc, 1, self.name);
            if (!output.E(serialDesc) && x44.r(self.input, new JsonObject(nm6.E))) {
                return;
            }
            output.r(serialDesc, 2, uh9.a, self.input);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final JsonObject getInput() {
            return this.input;
        }

        public final ToolUse copy(String id, String name, JsonObject input) {
            id.getClass();
            name.getClass();
            input.getClass();
            return new ToolUse(id, name, input);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ToolUse)) {
                return false;
            }
            ToolUse toolUse = (ToolUse) other;
            return x44.r(this.id, toolUse.id) && x44.r(this.name, toolUse.name) && x44.r(this.input, toolUse.input);
        }

        public final String getId() {
            return this.id;
        }

        public final JsonObject getInput() {
            return this.input;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.input.hashCode() + kgh.l(this.id.hashCode() * 31, 31, this.name);
        }

        public String toString() {
            String str = this.id;
            String str2 = this.name;
            JsonObject jsonObject = this.input;
            StringBuilder sbR = kgh.r("ToolUse(id=", str, ", name=", str2, ", input=");
            sbR.append(jsonObject);
            sbR.append(")");
            return sbR.toString();
        }

        public ToolUse(String str, String str2, JsonObject jsonObject) {
            str.getClass();
            str2.getClass();
            jsonObject.getClass();
            this.id = str;
            this.name = str2;
            this.input = jsonObject;
        }

        public /* synthetic */ ToolUse(String str, String str2, JsonObject jsonObject, int i, mq5 mq5Var) {
            this(str, str2, (i & 4) != 0 ? new JsonObject(nm6.E) : jsonObject);
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ0\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001bR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b.\u0010*\u001a\u0004\b\u0007\u0010\u001d¨\u00062"}, d2 = {"Lcom/anthropic/claude/conway/protocol/ContentBlock$ToolResult;", "Lcom/anthropic/claude/conway/protocol/ContentBlock;", "", "toolUseId", "Lkotlinx/serialization/json/JsonElement;", "content", "", "isError", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Z)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/json/JsonElement;ZLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/ContentBlock$ToolResult;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lkotlinx/serialization/json/JsonElement;", "component3", "()Z", "copy", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Z)Lcom/anthropic/claude/conway/protocol/ContentBlock$ToolResult;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getToolUseId", "getToolUseId$annotations", "()V", "Lkotlinx/serialization/json/JsonElement;", "getContent", "Z", "isError$annotations", "Companion", "com/anthropic/claude/conway/protocol/o", "com/anthropic/claude/conway/protocol/p", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ToolResult implements ContentBlock {
        public static final int $stable = 8;
        public static final p Companion = new p();
        private final JsonElement content;
        private final boolean isError;
        private final String toolUseId;

        public /* synthetic */ ToolResult(int i, String str, JsonElement jsonElement, boolean z, vnf vnfVar) {
            if (1 != (i & 1)) {
                gvj.f(i, 1, o.a.getDescriptor());
                throw null;
            }
            this.toolUseId = str;
            if ((i & 2) == 0) {
                this.content = null;
            } else {
                this.content = jsonElement;
            }
            if ((i & 4) == 0) {
                this.isError = false;
            } else {
                this.isError = z;
            }
        }

        public static /* synthetic */ ToolResult copy$default(ToolResult toolResult, String str, JsonElement jsonElement, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = toolResult.toolUseId;
            }
            if ((i & 2) != 0) {
                jsonElement = toolResult.content;
            }
            if ((i & 4) != 0) {
                z = toolResult.isError;
            }
            return toolResult.copy(str, jsonElement, z);
        }

        public static /* synthetic */ void getToolUseId$annotations() {
        }

        public static /* synthetic */ void isError$annotations() {
        }

        public static final /* synthetic */ void write$Self$conway(ToolResult self, vd4 output, SerialDescriptor serialDesc) {
            output.q(serialDesc, 0, self.toolUseId);
            if (output.E(serialDesc) || self.content != null) {
                output.B(serialDesc, 1, eh9.a, self.content);
            }
            if (output.E(serialDesc) || self.isError) {
                output.p(serialDesc, 2, self.isError);
            }
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getToolUseId() {
            return this.toolUseId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final JsonElement getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsError() {
            return this.isError;
        }

        public final ToolResult copy(String toolUseId, JsonElement content, boolean isError) {
            toolUseId.getClass();
            return new ToolResult(toolUseId, content, isError);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ToolResult)) {
                return false;
            }
            ToolResult toolResult = (ToolResult) other;
            return x44.r(this.toolUseId, toolResult.toolUseId) && x44.r(this.content, toolResult.content) && this.isError == toolResult.isError;
        }

        public final JsonElement getContent() {
            return this.content;
        }

        public final String getToolUseId() {
            return this.toolUseId;
        }

        public int hashCode() {
            int iHashCode = this.toolUseId.hashCode() * 31;
            JsonElement jsonElement = this.content;
            return Boolean.hashCode(this.isError) + ((iHashCode + (jsonElement == null ? 0 : jsonElement.hashCode())) * 31);
        }

        public final boolean isError() {
            return this.isError;
        }

        public String toString() {
            String str = this.toolUseId;
            JsonElement jsonElement = this.content;
            boolean z = this.isError;
            StringBuilder sb = new StringBuilder("ToolResult(toolUseId=");
            sb.append(str);
            sb.append(", content=");
            sb.append(jsonElement);
            sb.append(", isError=");
            return sq6.v(")", sb, z);
        }

        public ToolResult(String str, JsonElement jsonElement, boolean z) {
            str.getClass();
            this.toolUseId = str;
            this.content = jsonElement;
            this.isError = z;
        }

        public /* synthetic */ ToolResult(String str, JsonElement jsonElement, boolean z, int i, mq5 mq5Var) {
            this(str, (i & 2) != 0 ? null : jsonElement, (i & 4) != 0 ? false : z);
        }
    }
}
