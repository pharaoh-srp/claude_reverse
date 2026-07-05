package com.anthropic.claude.api.chat;

import com.anthropic.claude.api.chat.messages.ContentBlock;
import com.anthropic.claude.types.strings.MessageId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.bc9;
import defpackage.ebh;
import defpackage.ehb;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.meb;
import defpackage.mq5;
import defpackage.o49;
import defpackage.onf;
import defpackage.qy1;
import defpackage.srg;
import defpackage.ty2;
import defpackage.uo0;
import defpackage.uy2;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wr2;
import defpackage.xq2;
import defpackage.yb5;
import defpackage.znf;
import defpackage.zt1;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 g2\u00020\u0001:\u0002hiBò\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0019\u0010\f\u001a\u00150\u0007j\u0002`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\u001f\b\u0002\u0010\r\u001a\u0019\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\u001f\b\u0002\u0010\u000e\u001a\u0019\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0011\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b!\u0010\"BÁ\u0001\b\u0010\u0012\u0006\u0010#\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0011\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0011\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010 \u001a\u0004\u0018\u00010\u000f\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b!\u0010&J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010(J\u0010\u0010,\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b,\u0010-J#\u0010.\u001a\u00150\u0007j\u0002`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\b.\u0010/J'\u00100\u001a\u0019\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\b0\u0010/J'\u00101\u001a\u0019\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\b1\u0010/J\u0010\u00102\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b2\u0010(J\u0018\u00103\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b5\u00106J\u0016\u00107\u001a\b\u0012\u0004\u0012\u00020\u00160\u0011HÆ\u0003¢\u0006\u0004\b7\u00104J\u0018\u00108\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b8\u00104J\u0012\u00109\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b?\u0010(J\u0087\u0002\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u001b\b\u0002\u0010\f\u001a\u00150\u0007j\u0002`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b2\u001f\b\u0002\u0010\r\u001a\u0019\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b2\u001f\b\u0002\u0010\u000e\u001a\u0019\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00112\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00112\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b@\u0010AJ\u0010\u0010C\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\bC\u0010(J\u0010\u0010D\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\bD\u0010-J\u001a\u0010F\u001a\u00020\u001c2\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bF\u0010GJ'\u0010P\u001a\u00020M2\u0006\u0010H\u001a\u00020\u00002\u0006\u0010J\u001a\u00020I2\u0006\u0010L\u001a\u00020KH\u0001¢\u0006\u0004\bN\u0010OR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010Q\u001a\u0004\bR\u0010(R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010Q\u001a\u0004\bS\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010T\u001a\u0004\bU\u0010-R*\u0010\f\u001a\u00150\u0007j\u0002`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010V\u001a\u0004\bW\u0010/R.\u0010\r\u001a\u0019\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010V\u001a\u0004\bX\u0010/R.\u0010\u000e\u001a\u0019\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010V\u001a\u0004\bY\u0010/R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010Q\u001a\u0004\bZ\u0010(R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010[\u001a\u0004\b\\\u00104R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010]\u001a\u0004\b^\u00106R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010[\u001a\u0004\b_\u00104R\u001f\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0019\u0010[\u001a\u0004\b`\u00104R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010a\u001a\u0004\bb\u0010:R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010c\u001a\u0004\b\u001d\u0010<R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010d\u001a\u0004\be\u0010>R\u0019\u0010 \u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b \u0010Q\u001a\u0004\bf\u0010(¨\u0006j"}, d2 = {"Lcom/anthropic/claude/api/chat/ChatMessage;", "", "Lcom/anthropic/claude/types/strings/MessageId;", "uuid", "parent_message_uuid", "", "index", "Ljava/util/Date;", "Lcom/anthropic/claude/api/Iso8601Date;", "Lonf;", "with", "Lbc9;", "created_at", "updated_at", "edited_at", "", "text", "", "Lcom/anthropic/claude/api/chat/messages/ContentBlock;", "content", "Lcom/anthropic/claude/api/chat/MessageSender;", "sender", "Lcom/anthropic/claude/api/chat/MessageAttachment;", "attachments", "Lcom/anthropic/claude/api/chat/MessageFile;", "files", "Lcom/anthropic/claude/api/chat/InputMode;", "input_mode", "", "is_edited", "Lcom/anthropic/claude/api/chat/ChatFeedback;", "chat_feedback", "stop_reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lcom/anthropic/claude/api/chat/MessageSender;Ljava/util/List;Ljava/util/List;Lcom/anthropic/claude/api/chat/InputMode;Ljava/lang/Boolean;Lcom/anthropic/claude/api/chat/ChatFeedback;Ljava/lang/String;Lmq5;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lcom/anthropic/claude/api/chat/MessageSender;Ljava/util/List;Ljava/util/List;Lcom/anthropic/claude/api/chat/InputMode;Ljava/lang/Boolean;Lcom/anthropic/claude/api/chat/ChatFeedback;Ljava/lang/String;Lvnf;Lmq5;)V", "component1-PStrttk", "()Ljava/lang/String;", "component1", "component2-saiyK68", "component2", "component3", "()I", "component4", "()Ljava/util/Date;", "component5", "component6", "component7", "component8", "()Ljava/util/List;", "component9", "()Lcom/anthropic/claude/api/chat/MessageSender;", "component10", "component11", "component12", "()Lcom/anthropic/claude/api/chat/InputMode;", "component13", "()Ljava/lang/Boolean;", "component14", "()Lcom/anthropic/claude/api/chat/ChatFeedback;", "component15", "copy-oezoz_Y", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lcom/anthropic/claude/api/chat/MessageSender;Ljava/util/List;Ljava/util/List;Lcom/anthropic/claude/api/chat/InputMode;Ljava/lang/Boolean;Lcom/anthropic/claude/api/chat/ChatFeedback;Ljava/lang/String;)Lcom/anthropic/claude/api/chat/ChatMessage;", "copy", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/ChatMessage;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getUuid-PStrttk", "getParent_message_uuid-saiyK68", "I", "getIndex", "Ljava/util/Date;", "getCreated_at", "getUpdated_at", "getEdited_at", "getText", "Ljava/util/List;", "getContent", "Lcom/anthropic/claude/api/chat/MessageSender;", "getSender", "getAttachments", "getFiles", "Lcom/anthropic/claude/api/chat/InputMode;", "getInput_mode", "Ljava/lang/Boolean;", "Lcom/anthropic/claude/api/chat/ChatFeedback;", "getChat_feedback", "getStop_reason", "Companion", "ty2", "uy2", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatMessage {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final uy2 Companion = new uy2();
    private final List<MessageAttachment> attachments;
    private final ChatFeedback chat_feedback;
    private final List<ContentBlock> content;
    private final Date created_at;
    private final Date edited_at;
    private final List<MessageFile> files;
    private final int index;
    private final InputMode input_mode;
    private final Boolean is_edited;
    private final String parent_message_uuid;
    private final MessageSender sender;
    private final String stop_reason;
    private final String text;
    private final Date updated_at;
    private final String uuid;

    static {
        xq2 xq2Var = new xq2(25);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, null, null, null, null, yb5.w(w1aVar, xq2Var), yb5.w(w1aVar, new xq2(26)), yb5.w(w1aVar, new xq2(27)), yb5.w(w1aVar, new xq2(28)), null, null, null, null};
    }

    private /* synthetic */ ChatMessage(int i, String str, String str2, int i2, Date date, Date date2, Date date3, String str3, List list, MessageSender messageSender, List list2, List list3, InputMode inputMode, Boolean bool, ChatFeedback chatFeedback, String str4, vnf vnfVar) {
        if (845 != (i & 845)) {
            gvj.f(i, 845, ty2.a.getDescriptor());
            throw null;
        }
        this.uuid = str;
        if ((i & 2) == 0) {
            this.parent_message_uuid = null;
        } else {
            this.parent_message_uuid = str2;
        }
        this.index = i2;
        this.created_at = date;
        if ((i & 16) == 0) {
            this.updated_at = null;
        } else {
            this.updated_at = date2;
        }
        if ((i & 32) == 0) {
            this.edited_at = null;
        } else {
            this.edited_at = date3;
        }
        this.text = str3;
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.content = null;
        } else {
            this.content = list;
        }
        this.sender = messageSender;
        this.attachments = list2;
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
            this.files = null;
        } else {
            this.files = list3;
        }
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 0) {
            this.input_mode = null;
        } else {
            this.input_mode = inputMode;
        }
        if ((i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0) {
            this.is_edited = null;
        } else {
            this.is_edited = bool;
        }
        if ((i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) == 0) {
            this.chat_feedback = null;
        } else {
            this.chat_feedback = chatFeedback;
        }
        if ((i & 16384) == 0) {
            this.stop_reason = null;
        } else {
            this.stop_reason = str4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(ContentBlock.Companion.serializer(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return MessageSender.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new uo0(meb.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new uo0(MessageFile.Companion.serializer(), 0);
    }

    public static final /* synthetic */ void write$Self$api(ChatMessage self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        ehb ehbVar = ehb.a;
        output.r(serialDesc, 0, ehbVar, MessageId.m1051boximpl(self.uuid));
        if (output.E(serialDesc) || self.parent_message_uuid != null) {
            String str = self.parent_message_uuid;
            output.B(serialDesc, 1, ehbVar, str != null ? MessageId.m1051boximpl(str) : null);
        }
        output.l(2, self.index, serialDesc);
        bc9 bc9Var = bc9.a;
        output.r(serialDesc, 3, bc9Var, self.created_at);
        if (output.E(serialDesc) || self.updated_at != null) {
            output.B(serialDesc, 4, bc9Var, self.updated_at);
        }
        if (output.E(serialDesc) || self.edited_at != null) {
            output.B(serialDesc, 5, bc9Var, self.edited_at);
        }
        output.q(serialDesc, 6, self.text);
        if (output.E(serialDesc) || self.content != null) {
            output.B(serialDesc, 7, (znf) kw9VarArr[7].getValue(), self.content);
        }
        output.r(serialDesc, 8, (znf) kw9VarArr[8].getValue(), self.sender);
        output.r(serialDesc, 9, (znf) kw9VarArr[9].getValue(), self.attachments);
        if (output.E(serialDesc) || self.files != null) {
            output.B(serialDesc, 10, (znf) kw9VarArr[10].getValue(), self.files);
        }
        if (output.E(serialDesc) || self.input_mode != null) {
            output.B(serialDesc, 11, o49.d, self.input_mode);
        }
        if (output.E(serialDesc) || self.is_edited != null) {
            output.B(serialDesc, 12, zt1.a, self.is_edited);
        }
        if (output.E(serialDesc) || self.chat_feedback != null) {
            output.B(serialDesc, 13, wr2.a, self.chat_feedback);
        }
        if (!output.E(serialDesc) && self.stop_reason == null) {
            return;
        }
        output.B(serialDesc, 14, srg.a, self.stop_reason);
    }

    /* JADX INFO: renamed from: component1-PStrttk, reason: not valid java name and from getter */
    public final String getUuid() {
        return this.uuid;
    }

    public final List<MessageAttachment> component10() {
        return this.attachments;
    }

    public final List<MessageFile> component11() {
        return this.files;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final InputMode getInput_mode() {
        return this.input_mode;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getIs_edited() {
        return this.is_edited;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final ChatFeedback getChat_feedback() {
        return this.chat_feedback;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getStop_reason() {
        return this.stop_reason;
    }

    /* JADX INFO: renamed from: component2-saiyK68, reason: not valid java name and from getter */
    public final String getParent_message_uuid() {
        return this.parent_message_uuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getUpdated_at() {
        return this.updated_at;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Date getEdited_at() {
        return this.edited_at;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final List<ContentBlock> component8() {
        return this.content;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final MessageSender getSender() {
        return this.sender;
    }

    /* JADX INFO: renamed from: copy-oezoz_Y, reason: not valid java name */
    public final ChatMessage m214copyoezoz_Y(String uuid, String parent_message_uuid, int index, Date created_at, Date updated_at, Date edited_at, String text, List<? extends ContentBlock> content, MessageSender sender, List<MessageAttachment> attachments, List<? extends MessageFile> files, InputMode input_mode, Boolean is_edited, ChatFeedback chat_feedback, String stop_reason) {
        uuid.getClass();
        created_at.getClass();
        text.getClass();
        sender.getClass();
        attachments.getClass();
        return new ChatMessage(uuid, parent_message_uuid, index, created_at, updated_at, edited_at, text, content, sender, attachments, files, input_mode, is_edited, chat_feedback, stop_reason, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.anthropic.claude.api.chat.ChatMessage
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.anthropic.claude.api.chat.ChatMessage r5 = (com.anthropic.claude.api.chat.ChatMessage) r5
            java.lang.String r1 = r4.uuid
            java.lang.String r3 = r5.uuid
            boolean r1 = com.anthropic.claude.types.strings.MessageId.m1054equalsimpl0(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.parent_message_uuid
            java.lang.String r3 = r5.parent_message_uuid
            if (r1 != 0) goto L23
            if (r3 != 0) goto L21
            r1 = r0
            goto L2a
        L21:
            r1 = r2
            goto L2a
        L23:
            if (r3 != 0) goto L26
            goto L21
        L26:
            boolean r1 = com.anthropic.claude.types.strings.MessageId.m1054equalsimpl0(r1, r3)
        L2a:
            if (r1 != 0) goto L2d
            return r2
        L2d:
            int r1 = r4.index
            int r3 = r5.index
            if (r1 == r3) goto L34
            return r2
        L34:
            java.util.Date r1 = r4.created_at
            java.util.Date r3 = r5.created_at
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L3f
            return r2
        L3f:
            java.util.Date r1 = r4.updated_at
            java.util.Date r3 = r5.updated_at
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L4a
            return r2
        L4a:
            java.util.Date r1 = r4.edited_at
            java.util.Date r3 = r5.edited_at
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L55
            return r2
        L55:
            java.lang.String r1 = r4.text
            java.lang.String r3 = r5.text
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L60
            return r2
        L60:
            java.util.List<com.anthropic.claude.api.chat.messages.ContentBlock> r1 = r4.content
            java.util.List<com.anthropic.claude.api.chat.messages.ContentBlock> r3 = r5.content
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L6b
            return r2
        L6b:
            com.anthropic.claude.api.chat.MessageSender r1 = r4.sender
            com.anthropic.claude.api.chat.MessageSender r3 = r5.sender
            if (r1 == r3) goto L72
            return r2
        L72:
            java.util.List<com.anthropic.claude.api.chat.MessageAttachment> r1 = r4.attachments
            java.util.List<com.anthropic.claude.api.chat.MessageAttachment> r3 = r5.attachments
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L7d
            return r2
        L7d:
            java.util.List<com.anthropic.claude.api.chat.MessageFile> r1 = r4.files
            java.util.List<com.anthropic.claude.api.chat.MessageFile> r3 = r5.files
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L88
            return r2
        L88:
            com.anthropic.claude.api.chat.InputMode r1 = r4.input_mode
            com.anthropic.claude.api.chat.InputMode r3 = r5.input_mode
            if (r1 == r3) goto L8f
            return r2
        L8f:
            java.lang.Boolean r1 = r4.is_edited
            java.lang.Boolean r3 = r5.is_edited
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L9a
            return r2
        L9a:
            com.anthropic.claude.api.chat.ChatFeedback r1 = r4.chat_feedback
            com.anthropic.claude.api.chat.ChatFeedback r3 = r5.chat_feedback
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto La5
            return r2
        La5:
            java.lang.String r4 = r4.stop_reason
            java.lang.String r5 = r5.stop_reason
            boolean r4 = defpackage.x44.r(r4, r5)
            if (r4 != 0) goto Lb0
            return r2
        Lb0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.api.chat.ChatMessage.equals(java.lang.Object):boolean");
    }

    public final List<MessageAttachment> getAttachments() {
        return this.attachments;
    }

    public final ChatFeedback getChat_feedback() {
        return this.chat_feedback;
    }

    public final List<ContentBlock> getContent() {
        return this.content;
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    public final Date getEdited_at() {
        return this.edited_at;
    }

    public final List<MessageFile> getFiles() {
        return this.files;
    }

    public final int getIndex() {
        return this.index;
    }

    public final InputMode getInput_mode() {
        return this.input_mode;
    }

    /* JADX INFO: renamed from: getParent_message_uuid-saiyK68, reason: not valid java name */
    public final String m215getParent_message_uuidsaiyK68() {
        return this.parent_message_uuid;
    }

    public final MessageSender getSender() {
        return this.sender;
    }

    public final String getStop_reason() {
        return this.stop_reason;
    }

    public final String getText() {
        return this.text;
    }

    public final Date getUpdated_at() {
        return this.updated_at;
    }

    /* JADX INFO: renamed from: getUuid-PStrttk, reason: not valid java name */
    public final String m216getUuidPStrttk() {
        return this.uuid;
    }

    public int hashCode() {
        int iM1055hashCodeimpl = MessageId.m1055hashCodeimpl(this.uuid) * 31;
        String str = this.parent_message_uuid;
        int iJ = ebh.j(this.created_at, vb7.c(this.index, (iM1055hashCodeimpl + (str == null ? 0 : MessageId.m1055hashCodeimpl(str))) * 31, 31), 31);
        Date date = this.updated_at;
        int iHashCode = (iJ + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.edited_at;
        int iL = kgh.l((iHashCode + (date2 == null ? 0 : date2.hashCode())) * 31, 31, this.text);
        List<ContentBlock> list = this.content;
        int iM = kgh.m((this.sender.hashCode() + ((iL + (list == null ? 0 : list.hashCode())) * 31)) * 31, 31, this.attachments);
        List<MessageFile> list2 = this.files;
        int iHashCode2 = (iM + (list2 == null ? 0 : list2.hashCode())) * 31;
        InputMode inputMode = this.input_mode;
        int iHashCode3 = (iHashCode2 + (inputMode == null ? 0 : inputMode.hashCode())) * 31;
        Boolean bool = this.is_edited;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        ChatFeedback chatFeedback = this.chat_feedback;
        int iHashCode5 = (iHashCode4 + (chatFeedback == null ? 0 : chatFeedback.hashCode())) * 31;
        String str2 = this.stop_reason;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final Boolean is_edited() {
        return this.is_edited;
    }

    public String toString() {
        String strM1056toStringimpl = MessageId.m1056toStringimpl(this.uuid);
        String str = this.parent_message_uuid;
        String strM1056toStringimpl2 = str == null ? "null" : MessageId.m1056toStringimpl(str);
        int i = this.index;
        Date date = this.created_at;
        Date date2 = this.updated_at;
        Date date3 = this.edited_at;
        String str2 = this.text;
        List<ContentBlock> list = this.content;
        MessageSender messageSender = this.sender;
        List<MessageAttachment> list2 = this.attachments;
        List<MessageFile> list3 = this.files;
        InputMode inputMode = this.input_mode;
        Boolean bool = this.is_edited;
        ChatFeedback chatFeedback = this.chat_feedback;
        String str3 = this.stop_reason;
        StringBuilder sbR = kgh.r("ChatMessage(uuid=", strM1056toStringimpl, ", parent_message_uuid=", strM1056toStringimpl2, ", index=");
        sbR.append(i);
        sbR.append(", created_at=");
        sbR.append(date);
        sbR.append(", updated_at=");
        sbR.append(date2);
        sbR.append(", edited_at=");
        sbR.append(date3);
        sbR.append(", text=");
        qy1.p(str2, ", content=", ", sender=", sbR, list);
        sbR.append(messageSender);
        sbR.append(", attachments=");
        sbR.append(list2);
        sbR.append(", files=");
        sbR.append(list3);
        sbR.append(", input_mode=");
        sbR.append(inputMode);
        sbR.append(", is_edited=");
        sbR.append(bool);
        sbR.append(", chat_feedback=");
        sbR.append(chatFeedback);
        sbR.append(", stop_reason=");
        return ij0.m(sbR, str3, ")");
    }

    public /* synthetic */ ChatMessage(String str, String str2, int i, Date date, Date date2, Date date3, String str3, List list, MessageSender messageSender, List list2, List list3, InputMode inputMode, Boolean bool, ChatFeedback chatFeedback, String str4, mq5 mq5Var) {
        this(str, str2, i, date, date2, date3, str3, list, messageSender, list2, list3, inputMode, bool, chatFeedback, str4);
    }

    public /* synthetic */ ChatMessage(int i, String str, String str2, int i2, Date date, Date date2, Date date3, String str3, List list, MessageSender messageSender, List list2, List list3, InputMode inputMode, Boolean bool, ChatFeedback chatFeedback, String str4, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, i2, date, date2, date3, str3, list, messageSender, list2, list3, inputMode, bool, chatFeedback, str4, vnfVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ChatMessage(String str, String str2, int i, Date date, Date date2, Date date3, String str3, List<? extends ContentBlock> list, MessageSender messageSender, List<MessageAttachment> list2, List<? extends MessageFile> list3, InputMode inputMode, Boolean bool, ChatFeedback chatFeedback, String str4) {
        str.getClass();
        date.getClass();
        str3.getClass();
        messageSender.getClass();
        list2.getClass();
        this.uuid = str;
        this.parent_message_uuid = str2;
        this.index = i;
        this.created_at = date;
        this.updated_at = date2;
        this.edited_at = date3;
        this.text = str3;
        this.content = list;
        this.sender = messageSender;
        this.attachments = list2;
        this.files = list3;
        this.input_mode = inputMode;
        this.is_edited = bool;
        this.chat_feedback = chatFeedback;
        this.stop_reason = str4;
    }

    public /* synthetic */ ChatMessage(String str, String str2, int i, Date date, Date date2, Date date3, String str3, List list, MessageSender messageSender, List list2, List list3, InputMode inputMode, Boolean bool, ChatFeedback chatFeedback, String str4, int i2, mq5 mq5Var) {
        this(str, (i2 & 2) != 0 ? null : str2, i, date, (i2 & 16) != 0 ? null : date2, (i2 & 32) != 0 ? null : date3, str3, (i2 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : list, messageSender, list2, (i2 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? null : list3, (i2 & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? null : inputMode, (i2 & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? null : bool, (i2 & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? null : chatFeedback, (i2 & 16384) != 0 ? null : str4, null);
    }
}
