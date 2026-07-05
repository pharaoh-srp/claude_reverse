package com.anthropic.claude.api.chat;

import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings.ProjectId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.an2;
import defpackage.bc9;
import defpackage.bn2;
import defpackage.ebh;
import defpackage.ehb;
import defpackage.emd;
import defpackage.fsh;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.pk2;
import defpackage.qy1;
import defpackage.ty2;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnb;
import defpackage.vnf;
import defpackage.vs2;
import defpackage.w1a;
import defpackage.yb5;
import defpackage.ym2;
import defpackage.znf;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 [2\u00020\u0001:\u0002\\]B§\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0019\u0010\t\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0019\u0010\n\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dB\u0095\u0001\b\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0012\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001c\u0010\"J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J#\u0010&\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b&\u0010'J#\u0010(\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b)\u0010$J\u0010\u0010*\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b*\u0010$J\u0012\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b+\u0010$J\u0010\u0010-\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00102\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b1\u0010$J\u0018\u00103\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b5\u00100J\u0012\u00107\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b6\u0010$J¼\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001b\b\u0002\u0010\t\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\u001b\b\u0002\u0010\n\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00122\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010;\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b;\u0010$J\u0010\u0010<\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b<\u0010=J\u001a\u0010?\u001a\u00020\u00122\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b?\u0010@J'\u0010I\u001a\u00020F2\u0006\u0010A\u001a\u00020\u00002\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020DH\u0001¢\u0006\u0004\bG\u0010HR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010J\u001a\u0004\bK\u0010$R*\u0010\t\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006¢\u0006\f\n\u0004\b\t\u0010L\u001a\u0004\bM\u0010'R*\u0010\n\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010L\u001a\u0004\bN\u0010'R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010J\u001a\u0004\bO\u0010$R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010J\u001a\u0004\bP\u0010$R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010J\u001a\u0004\bQ\u0010$\"\u0004\bR\u0010SR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010T\u001a\u0004\bU\u0010.R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010V\u001a\u0004\b\u0013\u00100R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010J\u001a\u0004\bW\u0010$R\u001f\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010X\u001a\u0004\bY\u00104R\u0017\u0010\u0019\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0019\u0010V\u001a\u0004\b\u0019\u00100R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010J\u001a\u0004\bZ\u0010$¨\u0006^"}, d2 = {"Lcom/anthropic/claude/api/chat/ChatConversationWithNestedMessage;", "", "Lcom/anthropic/claude/types/strings/ChatId;", "uuid", "Ljava/util/Date;", "Lcom/anthropic/claude/api/Iso8601Date;", "Lonf;", "with", "Lbc9;", "created_at", "updated_at", "", "name", "summary", "Lcom/anthropic/claude/types/strings/ModelId;", "model", "Lcom/anthropic/claude/api/chat/ChatConversationSettings;", "settings", "", "is_starred", "Lcom/anthropic/claude/types/strings/ProjectId;", "project_uuid", "", "Lcom/anthropic/claude/api/chat/ChatMessage;", "chat_messages", "is_temporary", "Lcom/anthropic/claude/types/strings/MessageId;", "current_leaf_message_uuid", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/ChatConversationSettings;ZLjava/lang/String;Ljava/util/List;ZLjava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/ChatConversationSettings;ZLjava/lang/String;Ljava/util/List;ZLjava/lang/String;Lvnf;Lmq5;)V", "component1-RjYBDck", "()Ljava/lang/String;", "component1", "component2", "()Ljava/util/Date;", "component3", "component4", "component5", "component6-a6HIKFk", "component6", "component7", "()Lcom/anthropic/claude/api/chat/ChatConversationSettings;", "component8", "()Z", "component9-v-f-JkQ", "component9", "component10", "()Ljava/util/List;", "component11", "component12-saiyK68", "component12", "copy-u2nbJzk", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/ChatConversationSettings;ZLjava/lang/String;Ljava/util/List;ZLjava/lang/String;)Lcom/anthropic/claude/api/chat/ChatConversationWithNestedMessage;", "copy", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/ChatConversationWithNestedMessage;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getUuid-RjYBDck", "Ljava/util/Date;", "getCreated_at", "getUpdated_at", "getName", "getSummary", "getModel-a6HIKFk", "setModel-gqG_w4A", "(Ljava/lang/String;)V", "Lcom/anthropic/claude/api/chat/ChatConversationSettings;", "getSettings", "Z", "getProject_uuid-v-f-JkQ", "Ljava/util/List;", "getChat_messages", "getCurrent_leaf_message_uuid-saiyK68", "Companion", "an2", "bn2", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatConversationWithNestedMessage {
    public static final int $stable = 0;
    private final List<ChatMessage> chat_messages;
    private final Date created_at;
    private final String current_leaf_message_uuid;
    private final boolean is_starred;
    private final boolean is_temporary;
    private String model;
    private final String name;
    private final String project_uuid;
    private final ChatConversationSettings settings;
    private final String summary;
    private final Date updated_at;
    private final String uuid;
    public static final bn2 Companion = new bn2();
    private static final kw9[] $childSerializers = {null, null, null, null, null, null, null, null, null, yb5.w(w1a.F, new pk2(6)), null, null};

    private /* synthetic */ ChatConversationWithNestedMessage(int i, String str, Date date, Date date2, String str2, String str3, String str4, ChatConversationSettings chatConversationSettings, boolean z, String str5, List list, boolean z2, String str6, vnf vnfVar) {
        if (95 != (i & 95)) {
            gvj.f(i, 95, an2.a.getDescriptor());
            throw null;
        }
        this.uuid = str;
        this.created_at = date;
        this.updated_at = date2;
        this.name = str2;
        this.summary = str3;
        if ((i & 32) == 0) {
            this.model = null;
        } else {
            this.model = str4;
        }
        this.settings = chatConversationSettings;
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.is_starred = false;
        } else {
            this.is_starred = z;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.project_uuid = null;
        } else {
            this.project_uuid = str5;
        }
        if ((i & 512) == 0) {
            this.chat_messages = null;
        } else {
            this.chat_messages = list;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
            this.is_temporary = false;
        } else {
            this.is_temporary = z2;
        }
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 0) {
            this.current_leaf_message_uuid = null;
        } else {
            this.current_leaf_message_uuid = str6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(ty2.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-u2nbJzk$default, reason: not valid java name */
    public static /* synthetic */ ChatConversationWithNestedMessage m189copyu2nbJzk$default(ChatConversationWithNestedMessage chatConversationWithNestedMessage, String str, Date date, Date date2, String str2, String str3, String str4, ChatConversationSettings chatConversationSettings, boolean z, String str5, List list, boolean z2, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatConversationWithNestedMessage.uuid;
        }
        if ((i & 2) != 0) {
            date = chatConversationWithNestedMessage.created_at;
        }
        if ((i & 4) != 0) {
            date2 = chatConversationWithNestedMessage.updated_at;
        }
        if ((i & 8) != 0) {
            str2 = chatConversationWithNestedMessage.name;
        }
        if ((i & 16) != 0) {
            str3 = chatConversationWithNestedMessage.summary;
        }
        if ((i & 32) != 0) {
            str4 = chatConversationWithNestedMessage.model;
        }
        if ((i & 64) != 0) {
            chatConversationSettings = chatConversationWithNestedMessage.settings;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            z = chatConversationWithNestedMessage.is_starred;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            str5 = chatConversationWithNestedMessage.project_uuid;
        }
        if ((i & 512) != 0) {
            list = chatConversationWithNestedMessage.chat_messages;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
            z2 = chatConversationWithNestedMessage.is_temporary;
        }
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0) {
            str6 = chatConversationWithNestedMessage.current_leaf_message_uuid;
        }
        boolean z3 = z2;
        String str7 = str6;
        String str8 = str5;
        List list2 = list;
        ChatConversationSettings chatConversationSettings2 = chatConversationSettings;
        boolean z4 = z;
        String str9 = str3;
        String str10 = str4;
        return chatConversationWithNestedMessage.m194copyu2nbJzk(str, date, date2, str2, str9, str10, chatConversationSettings2, z4, str8, list2, z3, str7);
    }

    public static final /* synthetic */ void write$Self$api(ChatConversationWithNestedMessage self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, vs2.a, ChatId.m978boximpl(self.uuid));
        bc9 bc9Var = bc9.a;
        output.r(serialDesc, 1, bc9Var, self.created_at);
        output.r(serialDesc, 2, bc9Var, self.updated_at);
        output.q(serialDesc, 3, self.name);
        output.q(serialDesc, 4, self.summary);
        if (output.E(serialDesc) || self.model != null) {
            vnb vnbVar = vnb.a;
            String str = self.model;
            output.B(serialDesc, 5, vnbVar, str != null ? ModelId.m1058boximpl(str) : null);
        }
        output.r(serialDesc, 6, ym2.a, self.settings);
        if (output.E(serialDesc) || self.is_starred) {
            output.p(serialDesc, 7, self.is_starred);
        }
        if (output.E(serialDesc) || self.project_uuid != null) {
            emd emdVar = emd.a;
            String str2 = self.project_uuid;
            output.B(serialDesc, 8, emdVar, str2 != null ? ProjectId.m1079boximpl(str2) : null);
        }
        if (output.E(serialDesc) || self.chat_messages != null) {
            output.B(serialDesc, 9, (znf) kw9VarArr[9].getValue(), self.chat_messages);
        }
        if (output.E(serialDesc) || self.is_temporary) {
            output.p(serialDesc, 10, self.is_temporary);
        }
        if (!output.E(serialDesc) && self.current_leaf_message_uuid == null) {
            return;
        }
        ehb ehbVar = ehb.a;
        String str3 = self.current_leaf_message_uuid;
        output.B(serialDesc, 11, ehbVar, str3 != null ? MessageId.m1051boximpl(str3) : null);
    }

    /* JADX INFO: renamed from: component1-RjYBDck, reason: not valid java name and from getter */
    public final String getUuid() {
        return this.uuid;
    }

    public final List<ChatMessage> component10() {
        return this.chat_messages;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getIs_temporary() {
        return this.is_temporary;
    }

    /* JADX INFO: renamed from: component12-saiyK68, reason: not valid java name and from getter */
    public final String getCurrent_leaf_message_uuid() {
        return this.current_leaf_message_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getUpdated_at() {
        return this.updated_at;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    /* JADX INFO: renamed from: component6-a6HIKFk, reason: not valid java name and from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ChatConversationSettings getSettings() {
        return this.settings;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIs_starred() {
        return this.is_starred;
    }

    /* JADX INFO: renamed from: component9-v-f-JkQ, reason: not valid java name and from getter */
    public final String getProject_uuid() {
        return this.project_uuid;
    }

    /* JADX INFO: renamed from: copy-u2nbJzk, reason: not valid java name */
    public final ChatConversationWithNestedMessage m194copyu2nbJzk(String uuid, Date created_at, Date updated_at, String name, String summary, String model, ChatConversationSettings settings, boolean is_starred, String project_uuid, List<ChatMessage> chat_messages, boolean is_temporary, String current_leaf_message_uuid) {
        uuid.getClass();
        created_at.getClass();
        updated_at.getClass();
        name.getClass();
        summary.getClass();
        settings.getClass();
        return new ChatConversationWithNestedMessage(uuid, created_at, updated_at, name, summary, model, settings, is_starred, project_uuid, chat_messages, is_temporary, current_leaf_message_uuid, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
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
            boolean r1 = r5 instanceof com.anthropic.claude.api.chat.ChatConversationWithNestedMessage
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.anthropic.claude.api.chat.ChatConversationWithNestedMessage r5 = (com.anthropic.claude.api.chat.ChatConversationWithNestedMessage) r5
            java.lang.String r1 = r4.uuid
            java.lang.String r3 = r5.uuid
            boolean r1 = com.anthropic.claude.types.strings.ChatId.m981equalsimpl0(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.util.Date r1 = r4.created_at
            java.util.Date r3 = r5.created_at
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.util.Date r1 = r4.updated_at
            java.util.Date r3 = r5.updated_at
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.name
            java.lang.String r3 = r5.name
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.summary
            java.lang.String r3 = r5.summary
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            java.lang.String r1 = r4.model
            java.lang.String r3 = r5.model
            if (r1 != 0) goto L4f
            if (r3 != 0) goto L4d
            r1 = r0
            goto L56
        L4d:
            r1 = r2
            goto L56
        L4f:
            if (r3 != 0) goto L52
            goto L4d
        L52:
            boolean r1 = com.anthropic.claude.types.strings.ModelId.m1061equalsimpl0(r1, r3)
        L56:
            if (r1 != 0) goto L59
            return r2
        L59:
            com.anthropic.claude.api.chat.ChatConversationSettings r1 = r4.settings
            com.anthropic.claude.api.chat.ChatConversationSettings r3 = r5.settings
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L64
            return r2
        L64:
            boolean r1 = r4.is_starred
            boolean r3 = r5.is_starred
            if (r1 == r3) goto L6b
            return r2
        L6b:
            java.lang.String r1 = r4.project_uuid
            java.lang.String r3 = r5.project_uuid
            if (r1 != 0) goto L77
            if (r3 != 0) goto L75
            r1 = r0
            goto L7e
        L75:
            r1 = r2
            goto L7e
        L77:
            if (r3 != 0) goto L7a
            goto L75
        L7a:
            boolean r1 = com.anthropic.claude.types.strings.ProjectId.m1082equalsimpl0(r1, r3)
        L7e:
            if (r1 != 0) goto L81
            return r2
        L81:
            java.util.List<com.anthropic.claude.api.chat.ChatMessage> r1 = r4.chat_messages
            java.util.List<com.anthropic.claude.api.chat.ChatMessage> r3 = r5.chat_messages
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L8c
            return r2
        L8c:
            boolean r1 = r4.is_temporary
            boolean r3 = r5.is_temporary
            if (r1 == r3) goto L93
            return r2
        L93:
            java.lang.String r4 = r4.current_leaf_message_uuid
            java.lang.String r5 = r5.current_leaf_message_uuid
            if (r4 != 0) goto L9f
            if (r5 != 0) goto L9d
            r4 = r0
            goto La6
        L9d:
            r4 = r2
            goto La6
        L9f:
            if (r5 != 0) goto La2
            goto L9d
        La2:
            boolean r4 = com.anthropic.claude.types.strings.MessageId.m1054equalsimpl0(r4, r5)
        La6:
            if (r4 != 0) goto La9
            return r2
        La9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.api.chat.ChatConversationWithNestedMessage.equals(java.lang.Object):boolean");
    }

    public final List<ChatMessage> getChat_messages() {
        return this.chat_messages;
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: getCurrent_leaf_message_uuid-saiyK68, reason: not valid java name */
    public final String m195getCurrent_leaf_message_uuidsaiyK68() {
        return this.current_leaf_message_uuid;
    }

    /* JADX INFO: renamed from: getModel-a6HIKFk, reason: not valid java name */
    public final String m196getModela6HIKFk() {
        return this.model;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: getProject_uuid-v-f-JkQ, reason: not valid java name */
    public final String m197getProject_uuidvfJkQ() {
        return this.project_uuid;
    }

    public final ChatConversationSettings getSettings() {
        return this.settings;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final Date getUpdated_at() {
        return this.updated_at;
    }

    /* JADX INFO: renamed from: getUuid-RjYBDck, reason: not valid java name */
    public final String m198getUuidRjYBDck() {
        return this.uuid;
    }

    public int hashCode() {
        int iL = kgh.l(kgh.l(ebh.j(this.updated_at, ebh.j(this.created_at, ChatId.m982hashCodeimpl(this.uuid) * 31, 31), 31), 31, this.name), 31, this.summary);
        String str = this.model;
        int iP = fsh.p((this.settings.hashCode() + ((iL + (str == null ? 0 : ModelId.m1062hashCodeimpl(str))) * 31)) * 31, 31, this.is_starred);
        String str2 = this.project_uuid;
        int iM1083hashCodeimpl = (iP + (str2 == null ? 0 : ProjectId.m1083hashCodeimpl(str2))) * 31;
        List<ChatMessage> list = this.chat_messages;
        int iP2 = fsh.p((iM1083hashCodeimpl + (list == null ? 0 : list.hashCode())) * 31, 31, this.is_temporary);
        String str3 = this.current_leaf_message_uuid;
        return iP2 + (str3 != null ? MessageId.m1055hashCodeimpl(str3) : 0);
    }

    public final boolean is_starred() {
        return this.is_starred;
    }

    public final boolean is_temporary() {
        return this.is_temporary;
    }

    /* JADX INFO: renamed from: setModel-gqG_w4A, reason: not valid java name */
    public final void m199setModelgqG_w4A(String str) {
        this.model = str;
    }

    public String toString() {
        String strM983toStringimpl = ChatId.m983toStringimpl(this.uuid);
        Date date = this.created_at;
        Date date2 = this.updated_at;
        String str = this.name;
        String str2 = this.summary;
        String str3 = this.model;
        String strM1063toStringimpl = str3 == null ? "null" : ModelId.m1063toStringimpl(str3);
        ChatConversationSettings chatConversationSettings = this.settings;
        boolean z = this.is_starred;
        String str4 = this.project_uuid;
        String strM1084toStringimpl = str4 == null ? "null" : ProjectId.m1084toStringimpl(str4);
        List<ChatMessage> list = this.chat_messages;
        boolean z2 = this.is_temporary;
        String str5 = this.current_leaf_message_uuid;
        String strM1056toStringimpl = str5 != null ? MessageId.m1056toStringimpl(str5) : "null";
        StringBuilder sb = new StringBuilder("ChatConversationWithNestedMessage(uuid=");
        sb.append(strM983toStringimpl);
        sb.append(", created_at=");
        sb.append(date);
        sb.append(", updated_at=");
        sb.append(date2);
        sb.append(", name=");
        sb.append(str);
        sb.append(", summary=");
        kgh.u(sb, str2, ", model=", strM1063toStringimpl, ", settings=");
        sb.append(chatConversationSettings);
        sb.append(", is_starred=");
        sb.append(z);
        sb.append(", project_uuid=");
        qy1.p(strM1084toStringimpl, ", chat_messages=", ", is_temporary=", sb, list);
        sb.append(z2);
        sb.append(", current_leaf_message_uuid=");
        sb.append(strM1056toStringimpl);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ ChatConversationWithNestedMessage(String str, Date date, Date date2, String str2, String str3, String str4, ChatConversationSettings chatConversationSettings, boolean z, String str5, List list, boolean z2, String str6, mq5 mq5Var) {
        this(str, date, date2, str2, str3, str4, chatConversationSettings, z, str5, list, z2, str6);
    }

    public /* synthetic */ ChatConversationWithNestedMessage(int i, String str, Date date, Date date2, String str2, String str3, String str4, ChatConversationSettings chatConversationSettings, boolean z, String str5, List list, boolean z2, String str6, vnf vnfVar, mq5 mq5Var) {
        this(i, str, date, date2, str2, str3, str4, chatConversationSettings, z, str5, list, z2, str6, vnfVar);
    }

    private ChatConversationWithNestedMessage(String str, Date date, Date date2, String str2, String str3, String str4, ChatConversationSettings chatConversationSettings, boolean z, String str5, List<ChatMessage> list, boolean z2, String str6) {
        str.getClass();
        date.getClass();
        date2.getClass();
        str2.getClass();
        str3.getClass();
        chatConversationSettings.getClass();
        this.uuid = str;
        this.created_at = date;
        this.updated_at = date2;
        this.name = str2;
        this.summary = str3;
        this.model = str4;
        this.settings = chatConversationSettings;
        this.is_starred = z;
        this.project_uuid = str5;
        this.chat_messages = list;
        this.is_temporary = z2;
        this.current_leaf_message_uuid = str6;
    }

    public /* synthetic */ ChatConversationWithNestedMessage(String str, Date date, Date date2, String str2, String str3, String str4, ChatConversationSettings chatConversationSettings, boolean z, String str5, List list, boolean z2, String str6, int i, mq5 mq5Var) {
        this(str, date, date2, str2, str3, (i & 32) != 0 ? null : str4, chatConversationSettings, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? false : z, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : str5, (i & 512) != 0 ? null : list, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? false : z2, (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? null : str6, null);
    }
}
