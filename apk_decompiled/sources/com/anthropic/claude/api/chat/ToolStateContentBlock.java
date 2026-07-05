package com.anthropic.claude.api.chat;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.jce;
import defpackage.kce;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.n7h;
import defpackage.odf;
import defpackage.onf;
import defpackage.pl9;
import defpackage.qg9;
import defpackage.u0i;
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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0003\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/anthropic/claude/api/chat/ToolStateContentBlock;", "", "<init>", "()V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self", "(Lcom/anthropic/claude/api/chat/ToolStateContentBlock;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "Text", "Image", "u0i", "Lcom/anthropic/claude/api/chat/ToolStateContentBlock$Image;", "Lcom/anthropic/claude/api/chat/ToolStateContentBlock$Text;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
@qg9(discriminator = "type")
public abstract class ToolStateContentBlock {
    public static final int $stable = 8;
    public static final u0i Companion = new u0i();
    private static final kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new n7h(23));

    public /* synthetic */ ToolStateContentBlock(mq5 mq5Var) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _init_$_anonymous_() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.api.chat.ToolStateContentBlock", kceVar.b(ToolStateContentBlock.class), new pl9[]{kceVar.b(Image.class), kceVar.b(Text.class)}, new KSerializer[]{a.a, d.a}, new Annotation[]{new c()});
    }

    public static final /* synthetic */ void write$Self(ToolStateContentBlock self, vd4 output, SerialDescriptor serialDesc) {
    }

    private ToolStateContentBlock() {
    }

    public /* synthetic */ ToolStateContentBlock(int i, vnf vnfVar) {
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/anthropic/claude/api/chat/ToolStateContentBlock$Text;", "Lcom/anthropic/claude/api/chat/ToolStateContentBlock;", "", "text", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/ToolStateContentBlock$Text;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/anthropic/claude/api/chat/ToolStateContentBlock$Text;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Companion", "com/anthropic/claude/api/chat/d", "com/anthropic/claude/api/chat/e", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Text extends ToolStateContentBlock {
        public static final int $stable = 0;
        public static final e Companion = new e();
        private final String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Text(int i, String str, vnf vnfVar) {
            super(i, vnfVar);
            if (1 != (i & 1)) {
                gvj.f(i, 1, d.a.getDescriptor());
                throw null;
            }
            this.text = str;
        }

        public static /* synthetic */ Text copy$default(Text text, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = text.text;
            }
            return text.copy(str);
        }

        public static final /* synthetic */ void write$Self$api(Text self, vd4 output, SerialDescriptor serialDesc) {
            ToolStateContentBlock.write$Self(self, output, serialDesc);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Text(String str) {
            super(null);
            str.getClass();
            this.text = str;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lcom/anthropic/claude/api/chat/ToolStateContentBlock$Image;", "Lcom/anthropic/claude/api/chat/ToolStateContentBlock;", "", "data", "media_type", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/ToolStateContentBlock$Image;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/chat/ToolStateContentBlock$Image;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getData", "getMedia_type", "Companion", "com/anthropic/claude/api/chat/a", "com/anthropic/claude/api/chat/b", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Image extends ToolStateContentBlock {
        public static final int $stable = 0;
        public static final b Companion = new b();
        private final String data;
        private final String media_type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Image(int i, String str, String str2, vnf vnfVar) {
            super(i, vnfVar);
            if (3 != (i & 3)) {
                gvj.f(i, 3, a.a.getDescriptor());
                throw null;
            }
            this.data = str;
            this.media_type = str2;
        }

        public static /* synthetic */ Image copy$default(Image image, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = image.data;
            }
            if ((i & 2) != 0) {
                str2 = image.media_type;
            }
            return image.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$api(Image self, vd4 output, SerialDescriptor serialDesc) {
            ToolStateContentBlock.write$Self(self, output, serialDesc);
            output.q(serialDesc, 0, self.data);
            output.q(serialDesc, 1, self.media_type);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMedia_type() {
            return this.media_type;
        }

        public final Image copy(String data, String media_type) {
            data.getClass();
            media_type.getClass();
            return new Image(data, media_type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return x44.r(this.data, image.data) && x44.r(this.media_type, image.media_type);
        }

        public final String getData() {
            return this.data;
        }

        public final String getMedia_type() {
            return this.media_type;
        }

        public int hashCode() {
            return this.media_type.hashCode() + (this.data.hashCode() * 31);
        }

        public String toString() {
            return ij0.l("Image(data=", this.data, ", media_type=", this.media_type, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Image(String str, String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.data = str;
            this.media_type = str2;
        }
    }
}
