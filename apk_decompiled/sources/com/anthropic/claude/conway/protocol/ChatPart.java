package com.anthropic.claude.conway.protocol;

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
import defpackage.r03;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wy2;
import defpackage.x44;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0004\u0012\u0013\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0003\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/anthropic/claude/conway/protocol/ChatPart;", "", "<init>", "()V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self", "(Lcom/anthropic/claude/conway/protocol/ChatPart;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "Hint", "UserText", "Attachment", "r03", "Lcom/anthropic/claude/conway/protocol/ChatPart$Attachment;", "Lcom/anthropic/claude/conway/protocol/ChatPart$Hint;", "Lcom/anthropic/claude/conway/protocol/ChatPart$UserText;", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public abstract class ChatPart {
    public static final int $stable = 8;
    public static final r03 Companion = new r03();
    private static final kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new wy2(3));

    public /* synthetic */ ChatPart(mq5 mq5Var) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _init_$_anonymous_() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.conway.protocol.ChatPart", kceVar.b(ChatPart.class), new pl9[]{kceVar.b(Attachment.class), kceVar.b(Hint.class), kceVar.b(UserText.class)}, new KSerializer[]{a.a, c.a, e.a}, new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(ChatPart self, vd4 output, SerialDescriptor serialDesc) {
    }

    private ChatPart() {
    }

    public /* synthetic */ ChatPart(int i, vnf vnfVar) {
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/anthropic/claude/conway/protocol/ChatPart$Hint;", "Lcom/anthropic/claude/conway/protocol/ChatPart;", "", "text", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/ChatPart$Hint;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/anthropic/claude/conway/protocol/ChatPart$Hint;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Companion", "com/anthropic/claude/conway/protocol/c", "com/anthropic/claude/conway/protocol/d", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Hint extends ChatPart {
        public static final int $stable = 0;
        public static final d Companion = new d();
        private final String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Hint(int i, String str, vnf vnfVar) {
            super(i, vnfVar);
            if (1 != (i & 1)) {
                gvj.f(i, 1, c.a.getDescriptor());
                throw null;
            }
            this.text = str;
        }

        public static /* synthetic */ Hint copy$default(Hint hint, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = hint.text;
            }
            return hint.copy(str);
        }

        public static final /* synthetic */ void write$Self$conway(Hint self, vd4 output, SerialDescriptor serialDesc) {
            ChatPart.write$Self(self, output, serialDesc);
            output.q(serialDesc, 0, self.text);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final Hint copy(String text) {
            text.getClass();
            return new Hint(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Hint) && x44.r(this.text, ((Hint) other).text);
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return ij0.j("Hint(text=", this.text, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Hint(String str) {
            super(null);
            str.getClass();
            this.text = str;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/anthropic/claude/conway/protocol/ChatPart$UserText;", "Lcom/anthropic/claude/conway/protocol/ChatPart;", "", "text", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/ChatPart$UserText;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/anthropic/claude/conway/protocol/ChatPart$UserText;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Companion", "com/anthropic/claude/conway/protocol/e", "com/anthropic/claude/conway/protocol/f", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class UserText extends ChatPart {
        public static final int $stable = 0;
        public static final f Companion = new f();
        private final String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ UserText(int i, String str, vnf vnfVar) {
            super(i, vnfVar);
            if (1 != (i & 1)) {
                gvj.f(i, 1, e.a.getDescriptor());
                throw null;
            }
            this.text = str;
        }

        public static /* synthetic */ UserText copy$default(UserText userText, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = userText.text;
            }
            return userText.copy(str);
        }

        public static final /* synthetic */ void write$Self$conway(UserText self, vd4 output, SerialDescriptor serialDesc) {
            ChatPart.write$Self(self, output, serialDesc);
            output.q(serialDesc, 0, self.text);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final UserText copy(String text) {
            text.getClass();
            return new UserText(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UserText) && x44.r(this.text, ((UserText) other).text);
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return ij0.j("UserText(text=", this.text, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserText(String str) {
            super(null);
            str.getClass();
            this.text = str;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lcom/anthropic/claude/conway/protocol/ChatPart$Attachment;", "Lcom/anthropic/claude/conway/protocol/ChatPart;", "", "label", "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/ChatPart$Attachment;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/conway/protocol/ChatPart$Attachment;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLabel", "getContent", "Companion", "com/anthropic/claude/conway/protocol/a", "com/anthropic/claude/conway/protocol/b", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Attachment extends ChatPart {
        public static final int $stable = 0;
        public static final b Companion = new b();
        private final String content;
        private final String label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Attachment(int i, String str, String str2, vnf vnfVar) {
            super(i, vnfVar);
            if (3 != (i & 3)) {
                gvj.f(i, 3, a.a.getDescriptor());
                throw null;
            }
            this.label = str;
            this.content = str2;
        }

        public static /* synthetic */ Attachment copy$default(Attachment attachment, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = attachment.label;
            }
            if ((i & 2) != 0) {
                str2 = attachment.content;
            }
            return attachment.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$conway(Attachment self, vd4 output, SerialDescriptor serialDesc) {
            ChatPart.write$Self(self, output, serialDesc);
            output.q(serialDesc, 0, self.label);
            output.q(serialDesc, 1, self.content);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        public final Attachment copy(String label, String content) {
            label.getClass();
            content.getClass();
            return new Attachment(label, content);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Attachment)) {
                return false;
            }
            Attachment attachment = (Attachment) other;
            return x44.r(this.label, attachment.label) && x44.r(this.content, attachment.content);
        }

        public final String getContent() {
            return this.content;
        }

        public final String getLabel() {
            return this.label;
        }

        public int hashCode() {
            return this.content.hashCode() + (this.label.hashCode() * 31);
        }

        public String toString() {
            return ij0.l("Attachment(label=", this.label, ", content=", this.content, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Attachment(String str, String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.label = str;
            this.content = str2;
        }
    }
}
