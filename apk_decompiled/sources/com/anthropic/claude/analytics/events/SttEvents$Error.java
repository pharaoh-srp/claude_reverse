package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.gtg;
import defpackage.gvj;
import defpackage.htg;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qy1;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.y6a;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EFBk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010B\u0085\u0001\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0016J\u0084\u0001\u0010#\u001a\u00020\"2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0016J\u0010\u0010&\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b&\u0010\u0019J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+J'\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020\"2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b7\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b9\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b:\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b;\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b<\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b=\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b>\u0010\u0016R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b?\u0010\u0016R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b@\u0010\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\bA\u0010\u0016R\u0014\u0010C\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u0016¨\u0006G"}, d2 = {"com/anthropic/claude/analytics/events/SttEvents$Error", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "", "listening_duration_seconds", "transcription_length", "language", "message", "transcriber", "error_kind", "surface", "session_id", "entry_mode", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "Lcom/anthropic/claude/analytics/events/SttEvents$Error;", "copy", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/SttEvents$Error;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/SttEvents$Error;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "I", "getListening_duration_seconds", "getTranscription_length", "getLanguage", "getMessage", "getTranscriber", "getError_kind", "getSurface", "getSession_id", "getEntry_mode", "getEventName", "eventName", "Companion", "gtg", "htg", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SttEvents$Error implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final htg Companion = new htg();
    private final String conversation_uuid;
    private final String entry_mode;
    private final String error_kind;
    private final String language;
    private final int listening_duration_seconds;
    private final String message;
    private final String organization_uuid;
    private final String session_id;
    private final String surface;
    private final String transcriber;
    private final int transcription_length;

    public /* synthetic */ SttEvents$Error(int i, String str, String str2, int i2, int i3, String str3, String str4, String str5, String str6, String str7, String str8, String str9, vnf vnfVar) {
        if (255 != (i & 255)) {
            gvj.f(i, 255, gtg.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.listening_duration_seconds = i2;
        this.transcription_length = i3;
        this.language = str3;
        this.message = str4;
        this.transcriber = str5;
        this.error_kind = str6;
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.surface = null;
        } else {
            this.surface = str7;
        }
        if ((i & 512) == 0) {
            this.session_id = null;
        } else {
            this.session_id = str8;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
            this.entry_mode = null;
        } else {
            this.entry_mode = str9;
        }
    }

    public static /* synthetic */ SttEvents$Error copy$default(SttEvents$Error sttEvents$Error, String str, String str2, int i, int i2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = sttEvents$Error.organization_uuid;
        }
        if ((i3 & 2) != 0) {
            str2 = sttEvents$Error.conversation_uuid;
        }
        if ((i3 & 4) != 0) {
            i = sttEvents$Error.listening_duration_seconds;
        }
        if ((i3 & 8) != 0) {
            i2 = sttEvents$Error.transcription_length;
        }
        if ((i3 & 16) != 0) {
            str3 = sttEvents$Error.language;
        }
        if ((i3 & 32) != 0) {
            str4 = sttEvents$Error.message;
        }
        if ((i3 & 64) != 0) {
            str5 = sttEvents$Error.transcriber;
        }
        if ((i3 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            str6 = sttEvents$Error.error_kind;
        }
        if ((i3 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            str7 = sttEvents$Error.surface;
        }
        if ((i3 & 512) != 0) {
            str8 = sttEvents$Error.session_id;
        }
        if ((i3 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
            str9 = sttEvents$Error.entry_mode;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str4;
        String str15 = str5;
        String str16 = str3;
        int i4 = i;
        return sttEvents$Error.copy(str, str2, i4, i2, str16, str14, str15, str12, str13, str10, str11);
    }

    public static final /* synthetic */ void write$Self$analytics(SttEvents$Error self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.l(2, self.listening_duration_seconds, serialDesc);
        output.l(3, self.transcription_length, serialDesc);
        output.q(serialDesc, 4, self.language);
        output.q(serialDesc, 5, self.message);
        output.q(serialDesc, 6, self.transcriber);
        output.q(serialDesc, 7, self.error_kind);
        if (output.E(serialDesc) || self.surface != null) {
            output.B(serialDesc, 8, srg.a, self.surface);
        }
        if (output.E(serialDesc) || self.session_id != null) {
            output.B(serialDesc, 9, srg.a, self.session_id);
        }
        if (!output.E(serialDesc) && self.entry_mode == null) {
            return;
        }
        output.B(serialDesc, 10, srg.a, self.entry_mode);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSession_id() {
        return this.session_id;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getEntry_mode() {
        return this.entry_mode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getListening_duration_seconds() {
        return this.listening_duration_seconds;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTranscription_length() {
        return this.transcription_length;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTranscriber() {
        return this.transcriber;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getError_kind() {
        return this.error_kind;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSurface() {
        return this.surface;
    }

    public final SttEvents$Error copy(String organization_uuid, String conversation_uuid, int listening_duration_seconds, int transcription_length, String language, String message, String transcriber, String error_kind, String surface, String session_id, String entry_mode) {
        y6a.s(organization_uuid, conversation_uuid, language, message, transcriber);
        error_kind.getClass();
        return new SttEvents$Error(organization_uuid, conversation_uuid, listening_duration_seconds, transcription_length, language, message, transcriber, error_kind, surface, session_id, entry_mode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SttEvents$Error)) {
            return false;
        }
        SttEvents$Error sttEvents$Error = (SttEvents$Error) other;
        return x44.r(this.organization_uuid, sttEvents$Error.organization_uuid) && x44.r(this.conversation_uuid, sttEvents$Error.conversation_uuid) && this.listening_duration_seconds == sttEvents$Error.listening_duration_seconds && this.transcription_length == sttEvents$Error.transcription_length && x44.r(this.language, sttEvents$Error.language) && x44.r(this.message, sttEvents$Error.message) && x44.r(this.transcriber, sttEvents$Error.transcriber) && x44.r(this.error_kind, sttEvents$Error.error_kind) && x44.r(this.surface, sttEvents$Error.surface) && x44.r(this.session_id, sttEvents$Error.session_id) && x44.r(this.entry_mode, sttEvents$Error.entry_mode);
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    public final String getEntry_mode() {
        return this.entry_mode;
    }

    public final String getError_kind() {
        return this.error_kind;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_stt_error";
    }

    public final String getLanguage() {
        return this.language;
    }

    public final int getListening_duration_seconds() {
        return this.listening_duration_seconds;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final String getSurface() {
        return this.surface;
    }

    public final String getTranscriber() {
        return this.transcriber;
    }

    public final int getTranscription_length() {
        return this.transcription_length;
    }

    public int hashCode() {
        int iL = kgh.l(kgh.l(kgh.l(kgh.l(vb7.c(this.transcription_length, vb7.c(this.listening_duration_seconds, kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid), 31), 31), 31, this.language), 31, this.message), 31, this.transcriber), 31, this.error_kind);
        String str = this.surface;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.session_id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.entry_mode;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        int i = this.listening_duration_seconds;
        int i2 = this.transcription_length;
        String str3 = this.language;
        String str4 = this.message;
        String str5 = this.transcriber;
        String str6 = this.error_kind;
        String str7 = this.surface;
        String str8 = this.session_id;
        String str9 = this.entry_mode;
        StringBuilder sbR = kgh.r("Error(organization_uuid=", str, ", conversation_uuid=", str2, ", listening_duration_seconds=");
        qy1.k(i, i2, ", transcription_length=", ", language=", sbR);
        kgh.u(sbR, str3, ", message=", str4, ", transcriber=");
        kgh.u(sbR, str5, ", error_kind=", str6, ", surface=");
        kgh.u(sbR, str7, ", session_id=", str8, ", entry_mode=");
        return ij0.m(sbR, str9, ")");
    }

    public SttEvents$Error(String str, String str2, int i, int i2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        y6a.s(str, str2, str3, str4, str5);
        str6.getClass();
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.listening_duration_seconds = i;
        this.transcription_length = i2;
        this.language = str3;
        this.message = str4;
        this.transcriber = str5;
        this.error_kind = str6;
        this.surface = str7;
        this.session_id = str8;
        this.entry_mode = str9;
    }

    public /* synthetic */ SttEvents$Error(String str, String str2, int i, int i2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i3, mq5 mq5Var) {
        this(str, str2, i, i2, str3, str4, str5, str6, (i3 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : str7, (i3 & 512) != 0 ? null : str8, (i3 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? null : str9);
    }
}
