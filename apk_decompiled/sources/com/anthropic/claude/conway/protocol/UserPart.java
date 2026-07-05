package com.anthropic.claude.conway.protocol;

import defpackage.eh9;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kdi;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.sq6;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.yni;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/conway/protocol/UserPart;", "", "Companion", "UserText", "Hint", "Attachment", "ToolResult", "Unknown", "yni", "Lcom/anthropic/claude/conway/protocol/UserPart$Attachment;", "Lcom/anthropic/claude/conway/protocol/UserPart$Hint;", "Lcom/anthropic/claude/conway/protocol/UserPart$ToolResult;", "Lcom/anthropic/claude/conway/protocol/UserPart$Unknown;", "Lcom/anthropic/claude/conway/protocol/UserPart$UserText;", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = h2.class)
public interface UserPart {
    public static final yni Companion = yni.a;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/conway/protocol/UserPart$Unknown;", "Lcom/anthropic/claude/conway/protocol/UserPart;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "conway", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Unknown implements UserPart {
        public static final int $stable = 0;
        public static final Unknown INSTANCE = new Unknown();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new kdi(19));

        private Unknown() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.conway.protocol.UserPart.Unknown", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Unknown);
        }

        public int hashCode() {
            return -10241680;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Unknown";
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/anthropic/claude/conway/protocol/UserPart$Hint;", "Lcom/anthropic/claude/conway/protocol/UserPart;", "", "text", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/UserPart$Hint;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/anthropic/claude/conway/protocol/UserPart$Hint;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Companion", "com/anthropic/claude/conway/protocol/b2", "com/anthropic/claude/conway/protocol/c2", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Hint implements UserPart {
        public static final int $stable = 0;
        public static final c2 Companion = new c2();
        private final String text;

        public /* synthetic */ Hint(int i, String str, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.text = str;
            } else {
                gvj.f(i, 1, b2.a.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ Hint copy$default(Hint hint, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = hint.text;
            }
            return hint.copy(str);
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

        public Hint(String str) {
            str.getClass();
            this.text = str;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/anthropic/claude/conway/protocol/UserPart$UserText;", "Lcom/anthropic/claude/conway/protocol/UserPart;", "", "text", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/UserPart$UserText;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/anthropic/claude/conway/protocol/UserPart$UserText;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Companion", "com/anthropic/claude/conway/protocol/f2", "com/anthropic/claude/conway/protocol/g2", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class UserText implements UserPart {
        public static final int $stable = 0;
        public static final g2 Companion = new g2();
        private final String text;

        public /* synthetic */ UserText(int i, String str, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.text = str;
            } else {
                gvj.f(i, 1, f2.a.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ UserText copy$default(UserText userText, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = userText.text;
            }
            return userText.copy(str);
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

        public UserText(String str) {
            str.getClass();
            this.text = str;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J0\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\u0017¨\u0006+"}, d2 = {"Lcom/anthropic/claude/conway/protocol/UserPart$Attachment;", "Lcom/anthropic/claude/conway/protocol/UserPart;", "", "label", "content", "path", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/UserPart$Attachment;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/conway/protocol/UserPart$Attachment;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLabel", "getContent", "getPath", "Companion", "com/anthropic/claude/conway/protocol/z1", "com/anthropic/claude/conway/protocol/a2", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Attachment implements UserPart {
        public static final int $stable = 0;
        public static final a2 Companion = new a2();
        private final String content;
        private final String label;
        private final String path;

        public /* synthetic */ Attachment(int i, String str, String str2, String str3, vnf vnfVar) {
            if (3 != (i & 3)) {
                gvj.f(i, 3, z1.a.getDescriptor());
                throw null;
            }
            this.label = str;
            this.content = str2;
            if ((i & 4) == 0) {
                this.path = null;
            } else {
                this.path = str3;
            }
        }

        public static /* synthetic */ Attachment copy$default(Attachment attachment, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = attachment.label;
            }
            if ((i & 2) != 0) {
                str2 = attachment.content;
            }
            if ((i & 4) != 0) {
                str3 = attachment.path;
            }
            return attachment.copy(str, str2, str3);
        }

        public static final /* synthetic */ void write$Self$conway(Attachment self, vd4 output, SerialDescriptor serialDesc) {
            output.q(serialDesc, 0, self.label);
            output.q(serialDesc, 1, self.content);
            if (!output.E(serialDesc) && self.path == null) {
                return;
            }
            output.B(serialDesc, 2, srg.a, self.path);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        public final Attachment copy(String label, String content, String path) {
            label.getClass();
            content.getClass();
            return new Attachment(label, content, path);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Attachment)) {
                return false;
            }
            Attachment attachment = (Attachment) other;
            return x44.r(this.label, attachment.label) && x44.r(this.content, attachment.content) && x44.r(this.path, attachment.path);
        }

        public final String getContent() {
            return this.content;
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getPath() {
            return this.path;
        }

        public int hashCode() {
            int iL = kgh.l(this.label.hashCode() * 31, 31, this.content);
            String str = this.path;
            return iL + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.label;
            String str2 = this.content;
            return ij0.m(kgh.r("Attachment(label=", str, ", content=", str2, ", path="), this.path, ")");
        }

        public Attachment(String str, String str2, String str3) {
            str.getClass();
            str2.getClass();
            this.label = str;
            this.content = str2;
            this.path = str3;
        }

        public /* synthetic */ Attachment(String str, String str2, String str3, int i, mq5 mq5Var) {
            this(str, str2, (i & 4) != 0 ? null : str3);
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ0\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001bR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b.\u0010*\u001a\u0004\b\u0007\u0010\u001d¨\u00062"}, d2 = {"Lcom/anthropic/claude/conway/protocol/UserPart$ToolResult;", "Lcom/anthropic/claude/conway/protocol/UserPart;", "", "toolUseId", "Lkotlinx/serialization/json/JsonElement;", "content", "", "isError", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Z)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/json/JsonElement;ZLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/UserPart$ToolResult;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lkotlinx/serialization/json/JsonElement;", "component3", "()Z", "copy", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Z)Lcom/anthropic/claude/conway/protocol/UserPart$ToolResult;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getToolUseId", "getToolUseId$annotations", "()V", "Lkotlinx/serialization/json/JsonElement;", "getContent", "Z", "isError$annotations", "Companion", "com/anthropic/claude/conway/protocol/d2", "com/anthropic/claude/conway/protocol/e2", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ToolResult implements UserPart {
        public static final int $stable = 8;
        public static final e2 Companion = new e2();
        private final JsonElement content;
        private final boolean isError;
        private final String toolUseId;

        public /* synthetic */ ToolResult(int i, String str, JsonElement jsonElement, boolean z, vnf vnfVar) {
            if (1 != (i & 1)) {
                gvj.f(i, 1, d2.a.getDescriptor());
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
