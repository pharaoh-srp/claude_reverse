package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qy1;
import defpackage.srg;
import defpackage.uo2;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.vo2;
import defpackage.x44;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=>BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBe\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'Jf\u0010(\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b+\u0010!J\u001a\u0010.\u001a\u00020\u000b2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010!R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b5\u0010!R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b6\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b7\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b8\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b\f\u0010'R\u0014\u0010;\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u001e¨\u0006?"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$Create", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "", "document_attachment_count", "image_attachment_count", "mm_document_count", "model", "paprika_mode", "", "is_temporary_chat", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ChatEvents$Create;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatEvents$Create;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "component6", "component7", "component8", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/anthropic/claude/analytics/events/ChatEvents$Create;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "I", "getDocument_attachment_count", "getImage_attachment_count", "getMm_document_count", "getModel", "getPaprika_mode", "Ljava/lang/Boolean;", "getEventName", "eventName", "Companion", "uo2", "vo2", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatEvents$Create implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final vo2 Companion = new vo2();
    private final String conversation_uuid;
    private final int document_attachment_count;
    private final int image_attachment_count;
    private final Boolean is_temporary_chat;
    private final int mm_document_count;
    private final String model;
    private final String organization_uuid;
    private final String paprika_mode;

    public /* synthetic */ ChatEvents$Create(int i, String str, String str2, int i2, int i3, int i4, String str3, String str4, Boolean bool, vnf vnfVar) {
        if (31 != (i & 31)) {
            gvj.f(i, 31, uo2.a.getDescriptor());
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
            this.paprika_mode = null;
        } else {
            this.paprika_mode = str4;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.is_temporary_chat = null;
        } else {
            this.is_temporary_chat = bool;
        }
    }

    public static /* synthetic */ ChatEvents$Create copy$default(ChatEvents$Create chatEvents$Create, String str, String str2, int i, int i2, int i3, String str3, String str4, Boolean bool, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = chatEvents$Create.organization_uuid;
        }
        if ((i4 & 2) != 0) {
            str2 = chatEvents$Create.conversation_uuid;
        }
        if ((i4 & 4) != 0) {
            i = chatEvents$Create.document_attachment_count;
        }
        if ((i4 & 8) != 0) {
            i2 = chatEvents$Create.image_attachment_count;
        }
        if ((i4 & 16) != 0) {
            i3 = chatEvents$Create.mm_document_count;
        }
        if ((i4 & 32) != 0) {
            str3 = chatEvents$Create.model;
        }
        if ((i4 & 64) != 0) {
            str4 = chatEvents$Create.paprika_mode;
        }
        if ((i4 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            bool = chatEvents$Create.is_temporary_chat;
        }
        String str5 = str4;
        Boolean bool2 = bool;
        int i5 = i3;
        String str6 = str3;
        return chatEvents$Create.copy(str, str2, i, i2, i5, str6, str5, bool2);
    }

    public static final /* synthetic */ void write$Self$analytics(ChatEvents$Create self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.l(2, self.document_attachment_count, serialDesc);
        output.l(3, self.image_attachment_count, serialDesc);
        output.l(4, self.mm_document_count, serialDesc);
        if (output.E(serialDesc) || self.model != null) {
            output.B(serialDesc, 5, srg.a, self.model);
        }
        if (output.E(serialDesc) || self.paprika_mode != null) {
            output.B(serialDesc, 6, srg.a, self.paprika_mode);
        }
        if (!output.E(serialDesc) && self.is_temporary_chat == null) {
            return;
        }
        output.B(serialDesc, 7, zt1.a, self.is_temporary_chat);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
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
    public final String getPaprika_mode() {
        return this.paprika_mode;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getIs_temporary_chat() {
        return this.is_temporary_chat;
    }

    public final ChatEvents$Create copy(String organization_uuid, String conversation_uuid, int document_attachment_count, int image_attachment_count, int mm_document_count, String model, String paprika_mode, Boolean is_temporary_chat) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        return new ChatEvents$Create(organization_uuid, conversation_uuid, document_attachment_count, image_attachment_count, mm_document_count, model, paprika_mode, is_temporary_chat);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatEvents$Create)) {
            return false;
        }
        ChatEvents$Create chatEvents$Create = (ChatEvents$Create) other;
        return x44.r(this.organization_uuid, chatEvents$Create.organization_uuid) && x44.r(this.conversation_uuid, chatEvents$Create.conversation_uuid) && this.document_attachment_count == chatEvents$Create.document_attachment_count && this.image_attachment_count == chatEvents$Create.image_attachment_count && this.mm_document_count == chatEvents$Create.mm_document_count && x44.r(this.model, chatEvents$Create.model) && x44.r(this.paprika_mode, chatEvents$Create.paprika_mode) && x44.r(this.is_temporary_chat, chatEvents$Create.is_temporary_chat);
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    public final int getDocument_attachment_count() {
        return this.document_attachment_count;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_conversation_create";
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

    public final String getPaprika_mode() {
        return this.paprika_mode;
    }

    public int hashCode() {
        int iC = vb7.c(this.mm_document_count, vb7.c(this.image_attachment_count, vb7.c(this.document_attachment_count, kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid), 31), 31), 31);
        String str = this.model;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.paprika_mode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.is_temporary_chat;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
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
        String str4 = this.paprika_mode;
        Boolean bool = this.is_temporary_chat;
        StringBuilder sbR = kgh.r("Create(organization_uuid=", str, ", conversation_uuid=", str2, ", document_attachment_count=");
        qy1.k(i, i2, ", image_attachment_count=", ", mm_document_count=", sbR);
        sbR.append(i3);
        sbR.append(", model=");
        sbR.append(str3);
        sbR.append(", paprika_mode=");
        sbR.append(str4);
        sbR.append(", is_temporary_chat=");
        sbR.append(bool);
        sbR.append(")");
        return sbR.toString();
    }

    public ChatEvents$Create(String str, String str2, int i, int i2, int i3, String str3, String str4, Boolean bool) {
        str.getClass();
        str2.getClass();
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.document_attachment_count = i;
        this.image_attachment_count = i2;
        this.mm_document_count = i3;
        this.model = str3;
        this.paprika_mode = str4;
        this.is_temporary_chat = bool;
    }

    public /* synthetic */ ChatEvents$Create(String str, String str2, int i, int i2, int i3, String str3, String str4, Boolean bool, int i4, mq5 mq5Var) {
        this(str, str2, i, i2, i3, (i4 & 32) != 0 ? null : str3, (i4 & 64) != 0 ? null : str4, (i4 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : bool);
    }
}
