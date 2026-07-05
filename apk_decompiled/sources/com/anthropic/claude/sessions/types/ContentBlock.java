package com.anthropic.claude.sessions.types;

import defpackage.an4;
import defpackage.gvj;
import defpackage.hy8;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u0000 \u00062\u00020\u0001:\u0004\u0007\b\t\nR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/sessions/types/ContentBlock;", "", "", "getType", "()Ljava/lang/String;", "type", "Companion", "Text", "Image", "Unknown", "an4", "Lcom/anthropic/claude/sessions/types/ContentBlock$Image;", "Lcom/anthropic/claude/sessions/types/ContentBlock$Text;", "Lcom/anthropic/claude/sessions/types/ContentBlock$Unknown;", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = l.class)
public interface ContentBlock {
    public static final an4 Companion = an4.a;

    String getType();

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/anthropic/claude/sessions/types/ContentBlock$Unknown;", "Lcom/anthropic/claude/sessions/types/ContentBlock;", "", "type", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/ContentBlock$Unknown;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/ContentBlock$Unknown;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "Companion", "com/anthropic/claude/sessions/types/j", "com/anthropic/claude/sessions/types/k", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Unknown implements ContentBlock {
        public static final k Companion = new k();
        private final String type;

        public /* synthetic */ Unknown(int i, String str, vnf vnfVar) {
            if ((i & 1) == 0) {
                this.type = "unknown";
            } else {
                this.type = str;
            }
        }

        public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unknown.type;
            }
            return unknown.copy(str);
        }

        public static final /* synthetic */ void write$Self$sessions(Unknown self, vd4 output, SerialDescriptor serialDesc) {
            if (!output.E(serialDesc) && x44.r(self.getType(), "unknown")) {
                return;
            }
            output.q(serialDesc, 0, self.getType());
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final Unknown copy(String type) {
            type.getClass();
            return new Unknown(type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Unknown) && x44.r(this.type, ((Unknown) other).type);
        }

        @Override // com.anthropic.claude.sessions.types.ContentBlock
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        public String toString() {
            return ij0.j("Unknown(type=", this.type, ")");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Unknown() {
            this((String) null, 1, (mq5) (0 == true ? 1 : 0));
        }

        public Unknown(String str) {
            str.getClass();
            this.type = str;
        }

        public /* synthetic */ Unknown(String str, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? "unknown" : str);
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019¨\u0006+"}, d2 = {"Lcom/anthropic/claude/sessions/types/ContentBlock$Image;", "Lcom/anthropic/claude/sessions/types/ContentBlock;", "", "type", "Lcom/anthropic/claude/sessions/types/ImageSource;", "source", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/sessions/types/ImageSource;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/sessions/types/ImageSource;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/ContentBlock$Image;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/sessions/types/ImageSource;", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/sessions/types/ImageSource;)Lcom/anthropic/claude/sessions/types/ContentBlock$Image;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "Lcom/anthropic/claude/sessions/types/ImageSource;", "getSource", "Companion", "com/anthropic/claude/sessions/types/f", "com/anthropic/claude/sessions/types/g", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Image implements ContentBlock {
        public static final g Companion = new g();
        private final ImageSource source;
        private final String type;

        public /* synthetic */ Image(int i, String str, ImageSource imageSource, vnf vnfVar) {
            if (2 != (i & 2)) {
                gvj.f(i, 2, f.a.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.type = "image";
            } else {
                this.type = str;
            }
            this.source = imageSource;
        }

        public static /* synthetic */ Image copy$default(Image image, String str, ImageSource imageSource, int i, Object obj) {
            if ((i & 1) != 0) {
                str = image.type;
            }
            if ((i & 2) != 0) {
                imageSource = image.source;
            }
            return image.copy(str, imageSource);
        }

        public static final /* synthetic */ void write$Self$sessions(Image self, vd4 output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || !x44.r(self.getType(), "image")) {
                output.q(serialDesc, 0, self.getType());
            }
            output.r(serialDesc, 1, hy8.a, self.source);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ImageSource getSource() {
            return this.source;
        }

        public final Image copy(String type, ImageSource source) {
            type.getClass();
            source.getClass();
            return new Image(type, source);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return x44.r(this.type, image.type) && x44.r(this.source, image.source);
        }

        public final ImageSource getSource() {
            return this.source;
        }

        @Override // com.anthropic.claude.sessions.types.ContentBlock
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.source.hashCode() + (this.type.hashCode() * 31);
        }

        public String toString() {
            return "Image(type=" + this.type + ", source=" + this.source + ")";
        }

        public Image(String str, ImageSource imageSource) {
            str.getClass();
            imageSource.getClass();
            this.type = str;
            this.source = imageSource;
        }

        public /* synthetic */ Image(String str, ImageSource imageSource, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? "image" : str, imageSource);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lcom/anthropic/claude/sessions/types/ContentBlock$Text;", "Lcom/anthropic/claude/sessions/types/ContentBlock;", "", "type", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/ContentBlock$Text;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/ContentBlock$Text;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getText", "Companion", "com/anthropic/claude/sessions/types/h", "com/anthropic/claude/sessions/types/i", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Text implements ContentBlock {
        public static final i Companion = new i();
        private final String text;
        private final String type;

        public /* synthetic */ Text(int i, String str, String str2, vnf vnfVar) {
            if (2 != (i & 2)) {
                gvj.f(i, 2, h.a.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.type = "text";
            } else {
                this.type = str;
            }
            this.text = str2;
        }

        public static /* synthetic */ Text copy$default(Text text, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = text.type;
            }
            if ((i & 2) != 0) {
                str2 = text.text;
            }
            return text.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$sessions(Text self, vd4 output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || !x44.r(self.getType(), "text")) {
                output.q(serialDesc, 0, self.getType());
            }
            output.q(serialDesc, 1, self.text);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final Text copy(String type, String text) {
            type.getClass();
            text.getClass();
            return new Text(type, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Text)) {
                return false;
            }
            Text text = (Text) other;
            return x44.r(this.type, text.type) && x44.r(this.text, text.text);
        }

        public final String getText() {
            return this.text;
        }

        @Override // com.anthropic.claude.sessions.types.ContentBlock
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.text.hashCode() + (this.type.hashCode() * 31);
        }

        public String toString() {
            return ij0.l("Text(type=", this.type, ", text=", this.text, ")");
        }

        public Text(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.type = str;
            this.text = str2;
        }

        public /* synthetic */ Text(String str, String str2, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? "text" : str, str2);
        }
    }
}
