package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.e79;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.pk2;
import defpackage.qn2;
import defpackage.rn2;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 K2\u00020\u0001:\u0002LMBg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0012\u0010\u0013B\u007f\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b&\u0010!J\u0012\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b'\u0010#J|\u0010)\u001a\u00020(2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u0019J\u0010\u0010,\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\n2\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101J'\u0010:\u001a\u0002072\u0006\u00102\u001a\u00020(2\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0001¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010;\u001a\u0004\b=\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b>\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010?\u001a\u0004\b@\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010A\u001a\u0004\bB\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\b\u000b\u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010D\u001a\u0004\bE\u0010#R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010F\u001a\u0004\bG\u0010%R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010C\u001a\u0004\b\u0010\u0010!R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010D\u001a\u0004\bH\u0010#R\u0014\u0010J\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010\u0019¨\u0006N"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$AddImageSuccess", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "uti", "Lcom/anthropic/claude/analytics/events/ChatEvents$AttachmentSource;", "source", "Lcom/anthropic/claude/analytics/events/ScreenSource;", "screen_source", "", "is_wiggle_upload", "", "retry_count", "Lcom/anthropic/claude/analytics/events/ChatEvents$UploadSource;", "upload_source", "is_app_backgrounded", "wm_run_attempt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$AttachmentSource;Lcom/anthropic/claude/analytics/events/ScreenSource;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/anthropic/claude/analytics/events/ChatEvents$UploadSource;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$AttachmentSource;Lcom/anthropic/claude/analytics/events/ScreenSource;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/anthropic/claude/analytics/events/ChatEvents$UploadSource;Ljava/lang/Boolean;Ljava/lang/Integer;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/anthropic/claude/analytics/events/ChatEvents$AttachmentSource;", "component5", "()Lcom/anthropic/claude/analytics/events/ScreenSource;", "component6", "()Ljava/lang/Boolean;", "component7", "()Ljava/lang/Integer;", "component8", "()Lcom/anthropic/claude/analytics/events/ChatEvents$UploadSource;", "component9", "component10", "Lcom/anthropic/claude/analytics/events/ChatEvents$AddImageSuccess;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ChatEvents$AttachmentSource;Lcom/anthropic/claude/analytics/events/ScreenSource;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/anthropic/claude/analytics/events/ChatEvents$UploadSource;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/anthropic/claude/analytics/events/ChatEvents$AddImageSuccess;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatEvents$AddImageSuccess;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "getUti", "Lcom/anthropic/claude/analytics/events/ChatEvents$AttachmentSource;", "getSource", "Lcom/anthropic/claude/analytics/events/ScreenSource;", "getScreen_source", "Ljava/lang/Boolean;", "Ljava/lang/Integer;", "getRetry_count", "Lcom/anthropic/claude/analytics/events/ChatEvents$UploadSource;", "getUpload_source", "getWm_run_attempt", "getEventName", "eventName", "Companion", "qn2", "rn2", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatEvents$AddImageSuccess implements AnalyticsEvent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final rn2 Companion = new rn2();
    private final String conversation_uuid;
    private final Boolean is_app_backgrounded;
    private final Boolean is_wiggle_upload;
    private final String organization_uuid;
    private final Integer retry_count;
    private final ScreenSource screen_source;
    private final ChatEvents$AttachmentSource source;
    private final ChatEvents$UploadSource upload_source;
    private final String uti;
    private final Integer wm_run_attempt;

    static {
        pk2 pk2Var = new pk2(22);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, yb5.w(w1aVar, pk2Var), yb5.w(w1aVar, new pk2(23)), null, null, yb5.w(w1aVar, new pk2(24)), null, null};
    }

    public /* synthetic */ ChatEvents$AddImageSuccess(int i, String str, String str2, String str3, ChatEvents$AttachmentSource chatEvents$AttachmentSource, ScreenSource screenSource, Boolean bool, Integer num, ChatEvents$UploadSource chatEvents$UploadSource, Boolean bool2, Integer num2, vnf vnfVar) {
        if (159 != (i & 159)) {
            gvj.f(i, 159, qn2.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.uti = str3;
        this.source = chatEvents$AttachmentSource;
        this.screen_source = screenSource;
        if ((i & 32) == 0) {
            this.is_wiggle_upload = null;
        } else {
            this.is_wiggle_upload = bool;
        }
        if ((i & 64) == 0) {
            this.retry_count = null;
        } else {
            this.retry_count = num;
        }
        this.upload_source = chatEvents$UploadSource;
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.is_app_backgrounded = null;
        } else {
            this.is_app_backgrounded = bool2;
        }
        if ((i & 512) == 0) {
            this.wm_run_attempt = null;
        } else {
            this.wm_run_attempt = num2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ChatEvents$AttachmentSource.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return ScreenSource.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return ChatEvents$UploadSource.Companion.serializer();
    }

    public static /* synthetic */ ChatEvents$AddImageSuccess copy$default(ChatEvents$AddImageSuccess chatEvents$AddImageSuccess, String str, String str2, String str3, ChatEvents$AttachmentSource chatEvents$AttachmentSource, ScreenSource screenSource, Boolean bool, Integer num, ChatEvents$UploadSource chatEvents$UploadSource, Boolean bool2, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatEvents$AddImageSuccess.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = chatEvents$AddImageSuccess.conversation_uuid;
        }
        if ((i & 4) != 0) {
            str3 = chatEvents$AddImageSuccess.uti;
        }
        if ((i & 8) != 0) {
            chatEvents$AttachmentSource = chatEvents$AddImageSuccess.source;
        }
        if ((i & 16) != 0) {
            screenSource = chatEvents$AddImageSuccess.screen_source;
        }
        if ((i & 32) != 0) {
            bool = chatEvents$AddImageSuccess.is_wiggle_upload;
        }
        if ((i & 64) != 0) {
            num = chatEvents$AddImageSuccess.retry_count;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            chatEvents$UploadSource = chatEvents$AddImageSuccess.upload_source;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            bool2 = chatEvents$AddImageSuccess.is_app_backgrounded;
        }
        if ((i & 512) != 0) {
            num2 = chatEvents$AddImageSuccess.wm_run_attempt;
        }
        Boolean bool3 = bool2;
        Integer num3 = num2;
        Integer num4 = num;
        ChatEvents$UploadSource chatEvents$UploadSource2 = chatEvents$UploadSource;
        ScreenSource screenSource2 = screenSource;
        Boolean bool4 = bool;
        return chatEvents$AddImageSuccess.copy(str, str2, str3, chatEvents$AttachmentSource, screenSource2, bool4, num4, chatEvents$UploadSource2, bool3, num3);
    }

    public static final /* synthetic */ void write$Self$analytics(ChatEvents$AddImageSuccess self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.q(serialDesc, 2, self.uti);
        output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.source);
        output.r(serialDesc, 4, (znf) kw9VarArr[4].getValue(), self.screen_source);
        if (output.E(serialDesc) || self.is_wiggle_upload != null) {
            output.B(serialDesc, 5, zt1.a, self.is_wiggle_upload);
        }
        if (output.E(serialDesc) || self.retry_count != null) {
            output.B(serialDesc, 6, e79.a, self.retry_count);
        }
        output.r(serialDesc, 7, (znf) kw9VarArr[7].getValue(), self.upload_source);
        if (output.E(serialDesc) || self.is_app_backgrounded != null) {
            output.B(serialDesc, 8, zt1.a, self.is_app_backgrounded);
        }
        if (!output.E(serialDesc) && self.wm_run_attempt == null) {
            return;
        }
        output.B(serialDesc, 9, e79.a, self.wm_run_attempt);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getWm_run_attempt() {
        return this.wm_run_attempt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUti() {
        return this.uti;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ChatEvents$AttachmentSource getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ScreenSource getScreen_source() {
        return this.screen_source;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIs_wiggle_upload() {
        return this.is_wiggle_upload;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getRetry_count() {
        return this.retry_count;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ChatEvents$UploadSource getUpload_source() {
        return this.upload_source;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getIs_app_backgrounded() {
        return this.is_app_backgrounded;
    }

    public final ChatEvents$AddImageSuccess copy(String organization_uuid, String conversation_uuid, String uti, ChatEvents$AttachmentSource source, ScreenSource screen_source, Boolean is_wiggle_upload, Integer retry_count, ChatEvents$UploadSource upload_source, Boolean is_app_backgrounded, Integer wm_run_attempt) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        uti.getClass();
        source.getClass();
        screen_source.getClass();
        upload_source.getClass();
        return new ChatEvents$AddImageSuccess(organization_uuid, conversation_uuid, uti, source, screen_source, is_wiggle_upload, retry_count, upload_source, is_app_backgrounded, wm_run_attempt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatEvents$AddImageSuccess)) {
            return false;
        }
        ChatEvents$AddImageSuccess chatEvents$AddImageSuccess = (ChatEvents$AddImageSuccess) other;
        return x44.r(this.organization_uuid, chatEvents$AddImageSuccess.organization_uuid) && x44.r(this.conversation_uuid, chatEvents$AddImageSuccess.conversation_uuid) && x44.r(this.uti, chatEvents$AddImageSuccess.uti) && this.source == chatEvents$AddImageSuccess.source && this.screen_source == chatEvents$AddImageSuccess.screen_source && x44.r(this.is_wiggle_upload, chatEvents$AddImageSuccess.is_wiggle_upload) && x44.r(this.retry_count, chatEvents$AddImageSuccess.retry_count) && this.upload_source == chatEvents$AddImageSuccess.upload_source && x44.r(this.is_app_backgrounded, chatEvents$AddImageSuccess.is_app_backgrounded) && x44.r(this.wm_run_attempt, chatEvents$AddImageSuccess.wm_run_attempt);
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_add_attachment_to_conversation_image_success";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final Integer getRetry_count() {
        return this.retry_count;
    }

    public final ScreenSource getScreen_source() {
        return this.screen_source;
    }

    public final ChatEvents$AttachmentSource getSource() {
        return this.source;
    }

    public final ChatEvents$UploadSource getUpload_source() {
        return this.upload_source;
    }

    public final String getUti() {
        return this.uti;
    }

    public final Integer getWm_run_attempt() {
        return this.wm_run_attempt;
    }

    public int hashCode() {
        int iHashCode = (this.screen_source.hashCode() + ((this.source.hashCode() + kgh.l(kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid), 31, this.uti)) * 31)) * 31;
        Boolean bool = this.is_wiggle_upload;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.retry_count;
        int iHashCode3 = (this.upload_source.hashCode() + ((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        Boolean bool2 = this.is_app_backgrounded;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num2 = this.wm_run_attempt;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final Boolean is_app_backgrounded() {
        return this.is_app_backgrounded;
    }

    public final Boolean is_wiggle_upload() {
        return this.is_wiggle_upload;
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        String str3 = this.uti;
        ChatEvents$AttachmentSource chatEvents$AttachmentSource = this.source;
        ScreenSource screenSource = this.screen_source;
        Boolean bool = this.is_wiggle_upload;
        Integer num = this.retry_count;
        ChatEvents$UploadSource chatEvents$UploadSource = this.upload_source;
        Boolean bool2 = this.is_app_backgrounded;
        Integer num2 = this.wm_run_attempt;
        StringBuilder sbR = kgh.r("AddImageSuccess(organization_uuid=", str, ", conversation_uuid=", str2, ", uti=");
        sbR.append(str3);
        sbR.append(", source=");
        sbR.append(chatEvents$AttachmentSource);
        sbR.append(", screen_source=");
        sbR.append(screenSource);
        sbR.append(", is_wiggle_upload=");
        sbR.append(bool);
        sbR.append(", retry_count=");
        sbR.append(num);
        sbR.append(", upload_source=");
        sbR.append(chatEvents$UploadSource);
        sbR.append(", is_app_backgrounded=");
        sbR.append(bool2);
        sbR.append(", wm_run_attempt=");
        sbR.append(num2);
        sbR.append(")");
        return sbR.toString();
    }

    public ChatEvents$AddImageSuccess(String str, String str2, String str3, ChatEvents$AttachmentSource chatEvents$AttachmentSource, ScreenSource screenSource, Boolean bool, Integer num, ChatEvents$UploadSource chatEvents$UploadSource, Boolean bool2, Integer num2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        chatEvents$AttachmentSource.getClass();
        screenSource.getClass();
        chatEvents$UploadSource.getClass();
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.uti = str3;
        this.source = chatEvents$AttachmentSource;
        this.screen_source = screenSource;
        this.is_wiggle_upload = bool;
        this.retry_count = num;
        this.upload_source = chatEvents$UploadSource;
        this.is_app_backgrounded = bool2;
        this.wm_run_attempt = num2;
    }

    public /* synthetic */ ChatEvents$AddImageSuccess(String str, String str2, String str3, ChatEvents$AttachmentSource chatEvents$AttachmentSource, ScreenSource screenSource, Boolean bool, Integer num, ChatEvents$UploadSource chatEvents$UploadSource, Boolean bool2, Integer num2, int i, mq5 mq5Var) {
        this(str, str2, str3, chatEvents$AttachmentSource, screenSource, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : num, chatEvents$UploadSource, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : bool2, (i & 512) != 0 ? null : num2);
    }
}
