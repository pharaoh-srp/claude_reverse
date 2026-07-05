package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qy1;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.vq2;
import defpackage.wq2;
import defpackage.x44;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002CDBk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010By\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ~\u0010#\u001a\u00020\"2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0016J\u0010\u0010&\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b&\u0010\u0019J\u001a\u0010)\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*J'\u00103\u001a\u0002002\u0006\u0010+\u001a\u00020\"2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0001¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b8\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b9\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b:\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b;\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b<\u0010\u0016R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\b\f\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b>\u0010\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\b?\u0010\u001fR\u0014\u0010A\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\u0016¨\u0006E"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$SendMessage", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "", "document_attachment_count", "image_attachment_count", "mm_document_count", "model", "edit_message_id", "", "is_temporary_chat", "project_id", "was_restored_draft", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "component6", "component7", "component8", "()Ljava/lang/Boolean;", "component9", "component10", "Lcom/anthropic/claude/analytics/events/ChatEvents$SendMessage;", "copy", "(Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/anthropic/claude/analytics/events/ChatEvents$SendMessage;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatEvents$SendMessage;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "I", "getDocument_attachment_count", "getImage_attachment_count", "getMm_document_count", "getModel", "getEdit_message_id", "Ljava/lang/Boolean;", "getProject_id", "getWas_restored_draft", "getEventName", "eventName", "Companion", "vq2", "wq2", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatEvents$SendMessage implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final wq2 Companion = new wq2();
    private final String conversation_uuid;
    private final int document_attachment_count;
    private final String edit_message_id;
    private final int image_attachment_count;
    private final Boolean is_temporary_chat;
    private final int mm_document_count;
    private final String model;
    private final String organization_uuid;
    private final String project_id;
    private final Boolean was_restored_draft;

    public /* synthetic */ ChatEvents$SendMessage(int i, String str, String str2, int i2, int i3, int i4, String str3, String str4, Boolean bool, String str5, Boolean bool2, vnf vnfVar) {
        if (31 != (i & 31)) {
            gvj.f(i, 31, vq2.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.document_attachment_count = i2;
        this.image_attachment_count = i3;
        this.mm_document_count = i4;
        if ((i & 32) == 0) {
            this.model = null;
        } else {
            this.model = str3;
        }
        if ((i & 64) == 0) {
            this.edit_message_id = null;
        } else {
            this.edit_message_id = str4;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.is_temporary_chat = null;
        } else {
            this.is_temporary_chat = bool;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.project_id = null;
        } else {
            this.project_id = str5;
        }
        if ((i & 512) == 0) {
            this.was_restored_draft = null;
        } else {
            this.was_restored_draft = bool2;
        }
    }

    public static /* synthetic */ ChatEvents$SendMessage copy$default(ChatEvents$SendMessage chatEvents$SendMessage, String str, String str2, int i, int i2, int i3, String str3, String str4, Boolean bool, String str5, Boolean bool2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = chatEvents$SendMessage.organization_uuid;
        }
        if ((i4 & 2) != 0) {
            str2 = chatEvents$SendMessage.conversation_uuid;
        }
        if ((i4 & 4) != 0) {
            i = chatEvents$SendMessage.document_attachment_count;
        }
        if ((i4 & 8) != 0) {
            i2 = chatEvents$SendMessage.image_attachment_count;
        }
        if ((i4 & 16) != 0) {
            i3 = chatEvents$SendMessage.mm_document_count;
        }
        if ((i4 & 32) != 0) {
            str3 = chatEvents$SendMessage.model;
        }
        if ((i4 & 64) != 0) {
            str4 = chatEvents$SendMessage.edit_message_id;
        }
        if ((i4 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            bool = chatEvents$SendMessage.is_temporary_chat;
        }
        if ((i4 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            str5 = chatEvents$SendMessage.project_id;
        }
        if ((i4 & 512) != 0) {
            bool2 = chatEvents$SendMessage.was_restored_draft;
        }
        String str6 = str5;
        Boolean bool3 = bool2;
        String str7 = str4;
        Boolean bool4 = bool;
        int i5 = i3;
        String str8 = str3;
        return chatEvents$SendMessage.copy(str, str2, i, i2, i5, str8, str7, bool4, str6, bool3);
    }

    public static final /* synthetic */ void write$Self$analytics(ChatEvents$SendMessage self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.l(2, self.document_attachment_count, serialDesc);
        output.l(3, self.image_attachment_count, serialDesc);
        output.l(4, self.mm_document_count, serialDesc);
        if (output.E(serialDesc) || self.model != null) {
            output.B(serialDesc, 5, srg.a, self.model);
        }
        if (output.E(serialDesc) || self.edit_message_id != null) {
            output.B(serialDesc, 6, srg.a, self.edit_message_id);
        }
        if (output.E(serialDesc) || self.is_temporary_chat != null) {
            output.B(serialDesc, 7, zt1.a, self.is_temporary_chat);
        }
        if (output.E(serialDesc) || self.project_id != null) {
            output.B(serialDesc, 8, srg.a, self.project_id);
        }
        if (!output.E(serialDesc) && self.was_restored_draft == null) {
            return;
        }
        output.B(serialDesc, 9, zt1.a, self.was_restored_draft);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getWas_restored_draft() {
        return this.was_restored_draft;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDocument_attachment_count() {
        return this.document_attachment_count;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getImage_attachment_count() {
        return this.image_attachment_count;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMm_document_count() {
        return this.mm_document_count;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getEdit_message_id() {
        return this.edit_message_id;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getIs_temporary_chat() {
        return this.is_temporary_chat;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getProject_id() {
        return this.project_id;
    }

    public final ChatEvents$SendMessage copy(String organization_uuid, String conversation_uuid, int document_attachment_count, int image_attachment_count, int mm_document_count, String model, String edit_message_id, Boolean is_temporary_chat, String project_id, Boolean was_restored_draft) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        return new ChatEvents$SendMessage(organization_uuid, conversation_uuid, document_attachment_count, image_attachment_count, mm_document_count, model, edit_message_id, is_temporary_chat, project_id, was_restored_draft);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatEvents$SendMessage)) {
            return false;
        }
        ChatEvents$SendMessage chatEvents$SendMessage = (ChatEvents$SendMessage) other;
        return x44.r(this.organization_uuid, chatEvents$SendMessage.organization_uuid) && x44.r(this.conversation_uuid, chatEvents$SendMessage.conversation_uuid) && this.document_attachment_count == chatEvents$SendMessage.document_attachment_count && this.image_attachment_count == chatEvents$SendMessage.image_attachment_count && this.mm_document_count == chatEvents$SendMessage.mm_document_count && x44.r(this.model, chatEvents$SendMessage.model) && x44.r(this.edit_message_id, chatEvents$SendMessage.edit_message_id) && x44.r(this.is_temporary_chat, chatEvents$SendMessage.is_temporary_chat) && x44.r(this.project_id, chatEvents$SendMessage.project_id) && x44.r(this.was_restored_draft, chatEvents$SendMessage.was_restored_draft);
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    public final int getDocument_attachment_count() {
        return this.document_attachment_count;
    }

    public final String getEdit_message_id() {
        return this.edit_message_id;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_conversation_send_message";
    }

    public final int getImage_attachment_count() {
        return this.image_attachment_count;
    }

    public final int getMm_document_count() {
        return this.mm_document_count;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getProject_id() {
        return this.project_id;
    }

    public final Boolean getWas_restored_draft() {
        return this.was_restored_draft;
    }

    public int hashCode() {
        int iC = vb7.c(this.mm_document_count, vb7.c(this.image_attachment_count, vb7.c(this.document_attachment_count, kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid), 31), 31), 31);
        String str = this.model;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.edit_message_id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.is_temporary_chat;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.project_id;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.was_restored_draft;
        return iHashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final Boolean is_temporary_chat() {
        return this.is_temporary_chat;
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        int i = this.document_attachment_count;
        int i2 = this.image_attachment_count;
        int i3 = this.mm_document_count;
        String str3 = this.model;
        String str4 = this.edit_message_id;
        Boolean bool = this.is_temporary_chat;
        String str5 = this.project_id;
        Boolean bool2 = this.was_restored_draft;
        StringBuilder sbR = kgh.r("SendMessage(organization_uuid=", str, ", conversation_uuid=", str2, ", document_attachment_count=");
        qy1.k(i, i2, ", image_attachment_count=", ", mm_document_count=", sbR);
        sbR.append(i3);
        sbR.append(", model=");
        sbR.append(str3);
        sbR.append(", edit_message_id=");
        sbR.append(str4);
        sbR.append(", is_temporary_chat=");
        sbR.append(bool);
        sbR.append(", project_id=");
        sbR.append(str5);
        sbR.append(", was_restored_draft=");
        sbR.append(bool2);
        sbR.append(")");
        return sbR.toString();
    }

    public ChatEvents$SendMessage(String str, String str2, int i, int i2, int i3, String str3, String str4, Boolean bool, String str5, Boolean bool2) {
        str.getClass();
        str2.getClass();
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.document_attachment_count = i;
        this.image_attachment_count = i2;
        this.mm_document_count = i3;
        this.model = str3;
        this.edit_message_id = str4;
        this.is_temporary_chat = bool;
        this.project_id = str5;
        this.was_restored_draft = bool2;
    }

    public /* synthetic */ ChatEvents$SendMessage(String str, String str2, int i, int i2, int i3, String str3, String str4, Boolean bool, String str5, Boolean bool2, int i4, mq5 mq5Var) {
        this(str, str2, i, i2, i3, (i4 & 32) != 0 ? null : str3, (i4 & 64) != 0 ? null : str4, (i4 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : bool, (i4 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : str5, (i4 & 512) != 0 ? null : bool2);
    }
}
