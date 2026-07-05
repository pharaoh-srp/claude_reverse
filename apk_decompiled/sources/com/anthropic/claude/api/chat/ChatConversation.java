package com.anthropic.claude.api.chat;

import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings.ProjectId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.bc9;
import defpackage.ebh;
import defpackage.ehb;
import defpackage.emd;
import defpackage.fsh;
import defpackage.gid;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnb;
import defpackage.vnf;
import defpackage.vs2;
import defpackage.wm2;
import defpackage.xm2;
import defpackage.ym2;
import java.util.Date;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 R2\u00020\u0001:\u0002STB\u0095\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0019\u0010\t\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0019\u0010\n\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aB\u0085\u0001\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0012\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0019\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J#\u0010#\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b#\u0010$J#\u0010%\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b&\u0010!J\u0010\u0010'\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b'\u0010!J\u0012\u0010)\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b(\u0010!J\u0010\u0010*\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010/\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b.\u0010!J\u0010\u00100\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b0\u0010-J\u0012\u00102\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b1\u0010!Jª\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001b\b\u0002\u0010\t\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\u001b\b\u0002\u0010\n\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00122\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00106\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b6\u0010!J\u0010\u00107\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b7\u00108J\u001a\u0010:\u001a\u00020\u00122\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b:\u0010;J'\u0010D\u001a\u00020A2\u0006\u0010<\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0001¢\u0006\u0004\bB\u0010CR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010E\u001a\u0004\bF\u0010!R*\u0010\t\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006¢\u0006\f\n\u0004\b\t\u0010G\u001a\u0004\bH\u0010$R*\u0010\n\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010G\u001a\u0004\bI\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010E\u001a\u0004\bJ\u0010!R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010E\u001a\u0004\bK\u0010!R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010E\u001a\u0004\bL\u0010!R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010M\u001a\u0004\bN\u0010+R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010O\u001a\u0004\b\u0013\u0010-R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010E\u001a\u0004\bP\u0010!R\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0016\u0010O\u001a\u0004\b\u0016\u0010-R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010E\u001a\u0004\bQ\u0010!¨\u0006U"}, d2 = {"Lcom/anthropic/claude/api/chat/ChatConversation;", "", "Lcom/anthropic/claude/types/strings/ChatId;", "uuid", "Ljava/util/Date;", "Lcom/anthropic/claude/api/Iso8601Date;", "Lonf;", "with", "Lbc9;", "created_at", "updated_at", "", "name", "summary", "Lcom/anthropic/claude/types/strings/ModelId;", "model", "Lcom/anthropic/claude/api/chat/ChatConversationSettings;", "settings", "", "is_starred", "Lcom/anthropic/claude/types/strings/ProjectId;", "project_uuid", "is_temporary", "Lcom/anthropic/claude/types/strings/MessageId;", "current_leaf_message_uuid", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/ChatConversationSettings;ZLjava/lang/String;ZLjava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/ChatConversationSettings;ZLjava/lang/String;ZLjava/lang/String;Lvnf;Lmq5;)V", "component1-RjYBDck", "()Ljava/lang/String;", "component1", "component2", "()Ljava/util/Date;", "component3", "component4", "component5", "component6-a6HIKFk", "component6", "component7", "()Lcom/anthropic/claude/api/chat/ChatConversationSettings;", "component8", "()Z", "component9-v-f-JkQ", "component9", "component10", "component11-saiyK68", "component11", "copy-tBaNr2I", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/ChatConversationSettings;ZLjava/lang/String;ZLjava/lang/String;)Lcom/anthropic/claude/api/chat/ChatConversation;", "copy", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/ChatConversation;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getUuid-RjYBDck", "Ljava/util/Date;", "getCreated_at", "getUpdated_at", "getName", "getSummary", "getModel-a6HIKFk", "Lcom/anthropic/claude/api/chat/ChatConversationSettings;", "getSettings", "Z", "getProject_uuid-v-f-JkQ", "getCurrent_leaf_message_uuid-saiyK68", "Companion", "wm2", "xm2", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatConversation {
    public static final int $stable = 0;
    public static final xm2 Companion = new xm2();
    private final Date created_at;
    private final String current_leaf_message_uuid;
    private final boolean is_starred;
    private final boolean is_temporary;
    private final String model;
    private final String name;
    private final String project_uuid;
    private final ChatConversationSettings settings;
    private final String summary;
    private final Date updated_at;
    private final String uuid;

    private /* synthetic */ ChatConversation(int i, String str, Date date, Date date2, String str2, String str3, String str4, ChatConversationSettings chatConversationSettings, boolean z, String str5, boolean z2, String str6, vnf vnfVar) {
        if (95 != (i & 95)) {
            gvj.f(i, 95, wm2.a.getDescriptor());
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
            this.is_temporary = false;
        } else {
            this.is_temporary = z2;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
            this.current_leaf_message_uuid = null;
        } else {
            this.current_leaf_message_uuid = str6;
        }
    }

    /* JADX INFO: renamed from: copy-tBaNr2I$default, reason: not valid java name */
    public static /* synthetic */ ChatConversation m167copytBaNr2I$default(ChatConversation chatConversation, String str, Date date, Date date2, String str2, String str3, String str4, ChatConversationSettings chatConversationSettings, boolean z, String str5, boolean z2, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatConversation.uuid;
        }
        if ((i & 2) != 0) {
            date = chatConversation.created_at;
        }
        if ((i & 4) != 0) {
            date2 = chatConversation.updated_at;
        }
        if ((i & 8) != 0) {
            str2 = chatConversation.name;
        }
        if ((i & 16) != 0) {
            str3 = chatConversation.summary;
        }
        if ((i & 32) != 0) {
            str4 = chatConversation.model;
        }
        if ((i & 64) != 0) {
            chatConversationSettings = chatConversation.settings;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            z = chatConversation.is_starred;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            str5 = chatConversation.project_uuid;
        }
        if ((i & 512) != 0) {
            z2 = chatConversation.is_temporary;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
            str6 = chatConversation.current_leaf_message_uuid;
        }
        boolean z3 = z2;
        String str7 = str6;
        boolean z4 = z;
        String str8 = str5;
        String str9 = str4;
        ChatConversationSettings chatConversationSettings2 = chatConversationSettings;
        String str10 = str3;
        Date date3 = date2;
        return chatConversation.m172copytBaNr2I(str, date, date3, str2, str10, str9, chatConversationSettings2, z4, str8, z3, str7);
    }

    public static final /* synthetic */ void write$Self$api(ChatConversation self, vd4 output, SerialDescriptor serialDesc) {
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
        if (output.E(serialDesc) || self.is_temporary) {
            output.p(serialDesc, 9, self.is_temporary);
        }
        if (!output.E(serialDesc) && self.current_leaf_message_uuid == null) {
            return;
        }
        ehb ehbVar = ehb.a;
        String str3 = self.current_leaf_message_uuid;
        output.B(serialDesc, 10, ehbVar, str3 != null ? MessageId.m1051boximpl(str3) : null);
    }

    /* JADX INFO: renamed from: component1-RjYBDck, reason: not valid java name and from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIs_temporary() {
        return this.is_temporary;
    }

    /* JADX INFO: renamed from: component11-saiyK68, reason: not valid java name and from getter */
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

    /* JADX INFO: renamed from: copy-tBaNr2I, reason: not valid java name */
    public final ChatConversation m172copytBaNr2I(String uuid, Date created_at, Date updated_at, String name, String summary, String model, ChatConversationSettings settings, boolean is_starred, String project_uuid, boolean is_temporary, String current_leaf_message_uuid) {
        uuid.getClass();
        created_at.getClass();
        updated_at.getClass();
        name.getClass();
        summary.getClass();
        settings.getClass();
        return new ChatConversation(uuid, created_at, updated_at, name, summary, model, settings, is_starred, project_uuid, is_temporary, current_leaf_message_uuid, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
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
            boolean r1 = r5 instanceof com.anthropic.claude.api.chat.ChatConversation
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.anthropic.claude.api.chat.ChatConversation r5 = (com.anthropic.claude.api.chat.ChatConversation) r5
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
            boolean r1 = r4.is_temporary
            boolean r3 = r5.is_temporary
            if (r1 == r3) goto L88
            return r2
        L88:
            java.lang.String r4 = r4.current_leaf_message_uuid
            java.lang.String r5 = r5.current_leaf_message_uuid
            if (r4 != 0) goto L94
            if (r5 != 0) goto L92
            r4 = r0
            goto L9b
        L92:
            r4 = r2
            goto L9b
        L94:
            if (r5 != 0) goto L97
            goto L92
        L97:
            boolean r4 = com.anthropic.claude.types.strings.MessageId.m1054equalsimpl0(r4, r5)
        L9b:
            if (r4 != 0) goto L9e
            return r2
        L9e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.api.chat.ChatConversation.equals(java.lang.Object):boolean");
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: getCurrent_leaf_message_uuid-saiyK68, reason: not valid java name */
    public final String m173getCurrent_leaf_message_uuidsaiyK68() {
        return this.current_leaf_message_uuid;
    }

    /* JADX INFO: renamed from: getModel-a6HIKFk, reason: not valid java name */
    public final String m174getModela6HIKFk() {
        return this.model;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: getProject_uuid-v-f-JkQ, reason: not valid java name */
    public final String m175getProject_uuidvfJkQ() {
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
    public final String m176getUuidRjYBDck() {
        return this.uuid;
    }

    public int hashCode() {
        int iL = kgh.l(kgh.l(ebh.j(this.updated_at, ebh.j(this.created_at, ChatId.m982hashCodeimpl(this.uuid) * 31, 31), 31), 31, this.name), 31, this.summary);
        String str = this.model;
        int iP = fsh.p((this.settings.hashCode() + ((iL + (str == null ? 0 : ModelId.m1062hashCodeimpl(str))) * 31)) * 31, 31, this.is_starred);
        String str2 = this.project_uuid;
        int iP2 = fsh.p((iP + (str2 == null ? 0 : ProjectId.m1083hashCodeimpl(str2))) * 31, 31, this.is_temporary);
        String str3 = this.current_leaf_message_uuid;
        return iP2 + (str3 != null ? MessageId.m1055hashCodeimpl(str3) : 0);
    }

    public final boolean is_starred() {
        return this.is_starred;
    }

    public final boolean is_temporary() {
        return this.is_temporary;
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
        boolean z2 = this.is_temporary;
        String str5 = this.current_leaf_message_uuid;
        String strM1056toStringimpl = str5 != null ? MessageId.m1056toStringimpl(str5) : "null";
        StringBuilder sb = new StringBuilder("ChatConversation(uuid=");
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
        gid.t(sb, strM1084toStringimpl, ", is_temporary=", z2, ", current_leaf_message_uuid=");
        return ij0.m(sb, strM1056toStringimpl, ")");
    }

    public /* synthetic */ ChatConversation(String str, Date date, Date date2, String str2, String str3, String str4, ChatConversationSettings chatConversationSettings, boolean z, String str5, boolean z2, String str6, mq5 mq5Var) {
        this(str, date, date2, str2, str3, str4, chatConversationSettings, z, str5, z2, str6);
    }

    public /* synthetic */ ChatConversation(int i, String str, Date date, Date date2, String str2, String str3, String str4, ChatConversationSettings chatConversationSettings, boolean z, String str5, boolean z2, String str6, vnf vnfVar, mq5 mq5Var) {
        this(i, str, date, date2, str2, str3, str4, chatConversationSettings, z, str5, z2, str6, vnfVar);
    }

    private ChatConversation(String str, Date date, Date date2, String str2, String str3, String str4, ChatConversationSettings chatConversationSettings, boolean z, String str5, boolean z2, String str6) {
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
        this.is_temporary = z2;
        this.current_leaf_message_uuid = str6;
    }

    public /* synthetic */ ChatConversation(String str, Date date, Date date2, String str2, String str3, String str4, ChatConversationSettings chatConversationSettings, boolean z, String str5, boolean z2, String str6, int i, mq5 mq5Var) {
        this(str, date, date2, str2, str3, (i & 32) != 0 ? null : str4, chatConversationSettings, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? false : z, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : str5, (i & 512) != 0 ? false : z2, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? null : str6, null);
    }
}
