package com.anthropic.claude.sessions.types;

import defpackage.e79;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zbf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0001\u0018\u0000 \"2\u00020\u0001:\u0006#$%&'(B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!¨\u0006)"}, d2 = {"Lcom/anthropic/claude/sessions/types/SdkStreamEvent;", "Lcom/anthropic/claude/sessions/types/SdkEvent;", "", "type", "uuid", "session_id", "parent_tool_use_id", "Lcom/anthropic/claude/sessions/types/SdkStreamEvent$Payload;", "event", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SdkStreamEvent$Payload;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SdkStreamEvent$Payload;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SdkStreamEvent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getUuid", "getSession_id", "getParent_tool_use_id", "Lcom/anthropic/claude/sessions/types/SdkStreamEvent$Payload;", "getEvent", "()Lcom/anthropic/claude/sessions/types/SdkStreamEvent$Payload;", "Companion", "Payload", "Delta", "ContentBlock", "MessageStart", "com/anthropic/claude/sessions/types/y0", "zbf", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class SdkStreamEvent implements SdkEvent {
    public static final zbf Companion = new zbf();
    private final Payload event;
    private final String parent_tool_use_id;
    private final String session_id;
    private final String type;
    private final String uuid;

    public /* synthetic */ SdkStreamEvent(int i, String str, String str2, String str3, String str4, Payload payload, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, y0.a.getDescriptor());
            throw null;
        }
        this.type = str;
        if ((i & 2) == 0) {
            this.uuid = null;
        } else {
            this.uuid = str2;
        }
        if ((i & 4) == 0) {
            this.session_id = null;
        } else {
            this.session_id = str3;
        }
        if ((i & 8) == 0) {
            this.parent_tool_use_id = null;
        } else {
            this.parent_tool_use_id = str4;
        }
        if ((i & 16) == 0) {
            this.event = null;
        } else {
            this.event = payload;
        }
    }

    public static final /* synthetic */ void write$Self$sessions(SdkStreamEvent self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.getType());
        if (output.E(serialDesc) || self.uuid != null) {
            output.B(serialDesc, 1, srg.a, self.uuid);
        }
        if (output.E(serialDesc) || self.session_id != null) {
            output.B(serialDesc, 2, srg.a, self.session_id);
        }
        if (output.E(serialDesc) || self.getParent_tool_use_id() != null) {
            output.B(serialDesc, 3, srg.a, self.getParent_tool_use_id());
        }
        if (!output.E(serialDesc) && self.event == null) {
            return;
        }
        output.B(serialDesc, 4, f1.a, self.event);
    }

    public final Payload getEvent() {
        return this.event;
    }

    @Override // com.anthropic.claude.sessions.types.SdkEvent
    public String getParent_tool_use_id() {
        return this.parent_tool_use_id;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    @Override // com.anthropic.claude.sessions.types.SdkEvent
    public String getType() {
        return this.type;
    }

    public final String getUuid() {
        return this.uuid;
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"#B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0015¨\u0006$"}, d2 = {"Lcom/anthropic/claude/sessions/types/SdkStreamEvent$MessageStart;", "", "", "id", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SdkStreamEvent$MessageStart;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/SdkStreamEvent$MessageStart;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Companion", "com/anthropic/claude/sessions/types/d1", "com/anthropic/claude/sessions/types/e1", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class MessageStart {
        public static final e1 Companion = new e1();
        private final String id;

        public /* synthetic */ MessageStart(int i, String str, vnf vnfVar) {
            if ((i & 1) == 0) {
                this.id = null;
            } else {
                this.id = str;
            }
        }

        public static /* synthetic */ MessageStart copy$default(MessageStart messageStart, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = messageStart.id;
            }
            return messageStart.copy(str);
        }

        public static final /* synthetic */ void write$Self$sessions(MessageStart self, vd4 output, SerialDescriptor serialDesc) {
            if (!output.E(serialDesc) && self.id == null) {
                return;
            }
            output.B(serialDesc, 0, srg.a, self.id);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final MessageStart copy(String id) {
            return new MessageStart(id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MessageStart) && x44.r(this.id, ((MessageStart) other).id);
        }

        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            String str = this.id;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return ij0.j("MessageStart(id=", this.id, ")");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public MessageStart() {
            this((String) null, 1, (mq5) (0 == true ? 1 : 0));
        }

        public MessageStart(String str) {
            this.id = str;
        }

        public /* synthetic */ MessageStart(String str, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? null : str);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0016¨\u0006'"}, d2 = {"Lcom/anthropic/claude/sessions/types/SdkStreamEvent$ContentBlock;", "", "", "type", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SdkStreamEvent$ContentBlock;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/SdkStreamEvent$ContentBlock;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getText", "Companion", "com/anthropic/claude/sessions/types/z0", "com/anthropic/claude/sessions/types/a1", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ContentBlock {
        public static final a1 Companion = new a1();
        private final String text;
        private final String type;

        public /* synthetic */ ContentBlock(int i, String str, String str2, vnf vnfVar) {
            if ((i & 1) == 0) {
                this.type = null;
            } else {
                this.type = str;
            }
            if ((i & 2) == 0) {
                this.text = null;
            } else {
                this.text = str2;
            }
        }

        public static /* synthetic */ ContentBlock copy$default(ContentBlock contentBlock, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = contentBlock.type;
            }
            if ((i & 2) != 0) {
                str2 = contentBlock.text;
            }
            return contentBlock.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$sessions(ContentBlock self, vd4 output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || self.type != null) {
                output.B(serialDesc, 0, srg.a, self.type);
            }
            if (!output.E(serialDesc) && self.text == null) {
                return;
            }
            output.B(serialDesc, 1, srg.a, self.text);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final ContentBlock copy(String type, String text) {
            return new ContentBlock(type, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContentBlock)) {
                return false;
            }
            ContentBlock contentBlock = (ContentBlock) other;
            return x44.r(this.type, contentBlock.type) && x44.r(this.text, contentBlock.text);
        }

        public final String getText() {
            return this.text;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            String str = this.type;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.text;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return ij0.l("ContentBlock(type=", this.type, ", text=", this.text, ")");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ContentBlock() {
            this((String) null, (String) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
        }

        public ContentBlock(String str, String str2) {
            this.type = str;
            this.text = str2;
        }

        public /* synthetic */ ContentBlock(String str, String str2, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0016¨\u0006'"}, d2 = {"Lcom/anthropic/claude/sessions/types/SdkStreamEvent$Delta;", "", "", "type", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SdkStreamEvent$Delta;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/SdkStreamEvent$Delta;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getText", "Companion", "com/anthropic/claude/sessions/types/b1", "com/anthropic/claude/sessions/types/c1", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Delta {
        public static final c1 Companion = new c1();
        private final String text;
        private final String type;

        public /* synthetic */ Delta(int i, String str, String str2, vnf vnfVar) {
            if ((i & 1) == 0) {
                this.type = null;
            } else {
                this.type = str;
            }
            if ((i & 2) == 0) {
                this.text = null;
            } else {
                this.text = str2;
            }
        }

        public static /* synthetic */ Delta copy$default(Delta delta, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = delta.type;
            }
            if ((i & 2) != 0) {
                str2 = delta.text;
            }
            return delta.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$sessions(Delta self, vd4 output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || self.type != null) {
                output.B(serialDesc, 0, srg.a, self.type);
            }
            if (!output.E(serialDesc) && self.text == null) {
                return;
            }
            output.B(serialDesc, 1, srg.a, self.text);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final Delta copy(String type, String text) {
            return new Delta(type, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Delta)) {
                return false;
            }
            Delta delta = (Delta) other;
            return x44.r(this.type, delta.type) && x44.r(this.text, delta.text);
        }

        public final String getText() {
            return this.text;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            String str = this.type;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.text;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return ij0.l("Delta(type=", this.type, ", text=", this.text, ")");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Delta() {
            this((String) null, (String) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
        }

        public Delta(String str, String str2) {
            this.type = str;
            this.text = str2;
        }

        public /* synthetic */ Delta(String str, String str2, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 82\u00020\u0001:\u00029:BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBM\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$JL\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001cJ\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010$¨\u0006;"}, d2 = {"Lcom/anthropic/claude/sessions/types/SdkStreamEvent$Payload;", "", "", "type", "", "index", "Lcom/anthropic/claude/sessions/types/SdkStreamEvent$Delta;", "delta", "Lcom/anthropic/claude/sessions/types/SdkStreamEvent$ContentBlock;", "content_block", "Lcom/anthropic/claude/sessions/types/SdkStreamEvent$MessageStart;", "message", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/anthropic/claude/sessions/types/SdkStreamEvent$Delta;Lcom/anthropic/claude/sessions/types/SdkStreamEvent$ContentBlock;Lcom/anthropic/claude/sessions/types/SdkStreamEvent$MessageStart;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Lcom/anthropic/claude/sessions/types/SdkStreamEvent$Delta;Lcom/anthropic/claude/sessions/types/SdkStreamEvent$ContentBlock;Lcom/anthropic/claude/sessions/types/SdkStreamEvent$MessageStart;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SdkStreamEvent$Payload;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "()Lcom/anthropic/claude/sessions/types/SdkStreamEvent$Delta;", "component4", "()Lcom/anthropic/claude/sessions/types/SdkStreamEvent$ContentBlock;", "component5", "()Lcom/anthropic/claude/sessions/types/SdkStreamEvent$MessageStart;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/anthropic/claude/sessions/types/SdkStreamEvent$Delta;Lcom/anthropic/claude/sessions/types/SdkStreamEvent$ContentBlock;Lcom/anthropic/claude/sessions/types/SdkStreamEvent$MessageStart;)Lcom/anthropic/claude/sessions/types/SdkStreamEvent$Payload;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "Ljava/lang/Integer;", "getIndex", "Lcom/anthropic/claude/sessions/types/SdkStreamEvent$Delta;", "getDelta", "Lcom/anthropic/claude/sessions/types/SdkStreamEvent$ContentBlock;", "getContent_block", "Lcom/anthropic/claude/sessions/types/SdkStreamEvent$MessageStart;", "getMessage", "Companion", "com/anthropic/claude/sessions/types/f1", "com/anthropic/claude/sessions/types/g1", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Payload {
        public static final g1 Companion = new g1();
        private final ContentBlock content_block;
        private final Delta delta;
        private final Integer index;
        private final MessageStart message;
        private final String type;

        public /* synthetic */ Payload(int i, String str, Integer num, Delta delta, ContentBlock contentBlock, MessageStart messageStart, vnf vnfVar) {
            if ((i & 1) == 0) {
                this.type = null;
            } else {
                this.type = str;
            }
            if ((i & 2) == 0) {
                this.index = null;
            } else {
                this.index = num;
            }
            if ((i & 4) == 0) {
                this.delta = null;
            } else {
                this.delta = delta;
            }
            if ((i & 8) == 0) {
                this.content_block = null;
            } else {
                this.content_block = contentBlock;
            }
            if ((i & 16) == 0) {
                this.message = null;
            } else {
                this.message = messageStart;
            }
        }

        public static /* synthetic */ Payload copy$default(Payload payload, String str, Integer num, Delta delta, ContentBlock contentBlock, MessageStart messageStart, int i, Object obj) {
            if ((i & 1) != 0) {
                str = payload.type;
            }
            if ((i & 2) != 0) {
                num = payload.index;
            }
            if ((i & 4) != 0) {
                delta = payload.delta;
            }
            if ((i & 8) != 0) {
                contentBlock = payload.content_block;
            }
            if ((i & 16) != 0) {
                messageStart = payload.message;
            }
            MessageStart messageStart2 = messageStart;
            Delta delta2 = delta;
            return payload.copy(str, num, delta2, contentBlock, messageStart2);
        }

        public static final /* synthetic */ void write$Self$sessions(Payload self, vd4 output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || self.type != null) {
                output.B(serialDesc, 0, srg.a, self.type);
            }
            if (output.E(serialDesc) || self.index != null) {
                output.B(serialDesc, 1, e79.a, self.index);
            }
            if (output.E(serialDesc) || self.delta != null) {
                output.B(serialDesc, 2, b1.a, self.delta);
            }
            if (output.E(serialDesc) || self.content_block != null) {
                output.B(serialDesc, 3, z0.a, self.content_block);
            }
            if (!output.E(serialDesc) && self.message == null) {
                return;
            }
            output.B(serialDesc, 4, d1.a, self.message);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getIndex() {
            return this.index;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Delta getDelta() {
            return this.delta;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final ContentBlock getContent_block() {
            return this.content_block;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final MessageStart getMessage() {
            return this.message;
        }

        public final Payload copy(String type, Integer index, Delta delta, ContentBlock content_block, MessageStart message) {
            return new Payload(type, index, delta, content_block, message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) other;
            return x44.r(this.type, payload.type) && x44.r(this.index, payload.index) && x44.r(this.delta, payload.delta) && x44.r(this.content_block, payload.content_block) && x44.r(this.message, payload.message);
        }

        public final ContentBlock getContent_block() {
            return this.content_block;
        }

        public final Delta getDelta() {
            return this.delta;
        }

        public final Integer getIndex() {
            return this.index;
        }

        public final MessageStart getMessage() {
            return this.message;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            String str = this.type;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.index;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Delta delta = this.delta;
            int iHashCode3 = (iHashCode2 + (delta == null ? 0 : delta.hashCode())) * 31;
            ContentBlock contentBlock = this.content_block;
            int iHashCode4 = (iHashCode3 + (contentBlock == null ? 0 : contentBlock.hashCode())) * 31;
            MessageStart messageStart = this.message;
            return iHashCode4 + (messageStart != null ? messageStart.hashCode() : 0);
        }

        public String toString() {
            return "Payload(type=" + this.type + ", index=" + this.index + ", delta=" + this.delta + ", content_block=" + this.content_block + ", message=" + this.message + ")";
        }

        public Payload() {
            this((String) null, (Integer) null, (Delta) null, (ContentBlock) null, (MessageStart) null, 31, (mq5) null);
        }

        public Payload(String str, Integer num, Delta delta, ContentBlock contentBlock, MessageStart messageStart) {
            this.type = str;
            this.index = num;
            this.delta = delta;
            this.content_block = contentBlock;
            this.message = messageStart;
        }

        public /* synthetic */ Payload(String str, Integer num, Delta delta, ContentBlock contentBlock, MessageStart messageStart, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : delta, (i & 8) != 0 ? null : contentBlock, (i & 16) != 0 ? null : messageStart);
        }
    }

    public SdkStreamEvent(String str, String str2, String str3, String str4, Payload payload) {
        str.getClass();
        this.type = str;
        this.uuid = str2;
        this.session_id = str3;
        this.parent_tool_use_id = str4;
        this.event = payload;
    }

    public /* synthetic */ SdkStreamEvent(String str, String str2, String str3, String str4, Payload payload, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : payload);
    }
}
