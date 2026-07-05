package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.atg;
import defpackage.btg;
import defpackage.gvj;
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
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?@B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eBq\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001eJp\u0010(\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b+\u0010!J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b5\u0010!R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b6\u0010!R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b7\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b8\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b9\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b:\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b;\u0010\u001eR\u0014\u0010=\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u001e¨\u0006A"}, d2 = {"com/anthropic/claude/analytics/events/SttEvents$CancelRecording", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "", "listening_duration_seconds", "transcription_length", "language", "transcriber", "surface", "session_id", "entry_mode", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/SttEvents$CancelRecording;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/SttEvents$CancelRecording;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/SttEvents$CancelRecording;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "I", "getListening_duration_seconds", "getTranscription_length", "getLanguage", "getTranscriber", "getSurface", "getSession_id", "getEntry_mode", "getEventName", "eventName", "Companion", "atg", "btg", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SttEvents$CancelRecording implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final btg Companion = new btg();
    private final String conversation_uuid;
    private final String entry_mode;
    private final String language;
    private final int listening_duration_seconds;
    private final String organization_uuid;
    private final String session_id;
    private final String surface;
    private final String transcriber;
    private final int transcription_length;

    public /* synthetic */ SttEvents$CancelRecording(int i, String str, String str2, int i2, int i3, String str3, String str4, String str5, String str6, String str7, vnf vnfVar) {
        if (63 != (i & 63)) {
            gvj.f(i, 63, atg.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.listening_duration_seconds = i2;
        this.transcription_length = i3;
        this.language = str3;
        this.transcriber = str4;
        if ((i & 64) == 0) {
            this.surface = null;
        } else {
            this.surface = str5;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.session_id = null;
        } else {
            this.session_id = str6;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.entry_mode = null;
        } else {
            this.entry_mode = str7;
        }
    }

    public static /* synthetic */ SttEvents$CancelRecording copy$default(SttEvents$CancelRecording sttEvents$CancelRecording, String str, String str2, int i, int i2, String str3, String str4, String str5, String str6, String str7, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = sttEvents$CancelRecording.organization_uuid;
        }
        if ((i3 & 2) != 0) {
            str2 = sttEvents$CancelRecording.conversation_uuid;
        }
        if ((i3 & 4) != 0) {
            i = sttEvents$CancelRecording.listening_duration_seconds;
        }
        if ((i3 & 8) != 0) {
            i2 = sttEvents$CancelRecording.transcription_length;
        }
        if ((i3 & 16) != 0) {
            str3 = sttEvents$CancelRecording.language;
        }
        if ((i3 & 32) != 0) {
            str4 = sttEvents$CancelRecording.transcriber;
        }
        if ((i3 & 64) != 0) {
            str5 = sttEvents$CancelRecording.surface;
        }
        if ((i3 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            str6 = sttEvents$CancelRecording.session_id;
        }
        if ((i3 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            str7 = sttEvents$CancelRecording.entry_mode;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        String str12 = str3;
        int i4 = i;
        return sttEvents$CancelRecording.copy(str, str2, i4, i2, str12, str10, str11, str8, str9);
    }

    public static final /* synthetic */ void write$Self$analytics(SttEvents$CancelRecording self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.l(2, self.listening_duration_seconds, serialDesc);
        output.l(3, self.transcription_length, serialDesc);
        output.q(serialDesc, 4, self.language);
        output.q(serialDesc, 5, self.transcriber);
        if (output.E(serialDesc) || self.surface != null) {
            output.B(serialDesc, 6, srg.a, self.surface);
        }
        if (output.E(serialDesc) || self.session_id != null) {
            output.B(serialDesc, 7, srg.a, self.session_id);
        }
        if (!output.E(serialDesc) && self.entry_mode == null) {
            return;
        }
        output.B(serialDesc, 8, srg.a, self.entry_mode);
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
    public final String getTranscriber() {
        return this.transcriber;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSurface() {
        return this.surface;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSession_id() {
        return this.session_id;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getEntry_mode() {
        return this.entry_mode;
    }

    public final SttEvents$CancelRecording copy(String organization_uuid, String conversation_uuid, int listening_duration_seconds, int transcription_length, String language, String transcriber, String surface, String session_id, String entry_mode) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        language.getClass();
        transcriber.getClass();
        return new SttEvents$CancelRecording(organization_uuid, conversation_uuid, listening_duration_seconds, transcription_length, language, transcriber, surface, session_id, entry_mode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SttEvents$CancelRecording)) {
            return false;
        }
        SttEvents$CancelRecording sttEvents$CancelRecording = (SttEvents$CancelRecording) other;
        return x44.r(this.organization_uuid, sttEvents$CancelRecording.organization_uuid) && x44.r(this.conversation_uuid, sttEvents$CancelRecording.conversation_uuid) && this.listening_duration_seconds == sttEvents$CancelRecording.listening_duration_seconds && this.transcription_length == sttEvents$CancelRecording.transcription_length && x44.r(this.language, sttEvents$CancelRecording.language) && x44.r(this.transcriber, sttEvents$CancelRecording.transcriber) && x44.r(this.surface, sttEvents$CancelRecording.surface) && x44.r(this.session_id, sttEvents$CancelRecording.session_id) && x44.r(this.entry_mode, sttEvents$CancelRecording.entry_mode);
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    public final String getEntry_mode() {
        return this.entry_mode;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_stt_cancel_recording";
    }

    public final String getLanguage() {
        return this.language;
    }

    public final int getListening_duration_seconds() {
        return this.listening_duration_seconds;
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
        int iL = kgh.l(kgh.l(vb7.c(this.transcription_length, vb7.c(this.listening_duration_seconds, kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid), 31), 31), 31, this.language), 31, this.transcriber);
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
        String str4 = this.transcriber;
        String str5 = this.surface;
        String str6 = this.session_id;
        String str7 = this.entry_mode;
        StringBuilder sbR = kgh.r("CancelRecording(organization_uuid=", str, ", conversation_uuid=", str2, ", listening_duration_seconds=");
        qy1.k(i, i2, ", transcription_length=", ", language=", sbR);
        kgh.u(sbR, str3, ", transcriber=", str4, ", surface=");
        kgh.u(sbR, str5, ", session_id=", str6, ", entry_mode=");
        return ij0.m(sbR, str7, ")");
    }

    public SttEvents$CancelRecording(String str, String str2, int i, int i2, String str3, String str4, String str5, String str6, String str7) {
        ij0.z(str, str2, str3, str4);
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.listening_duration_seconds = i;
        this.transcription_length = i2;
        this.language = str3;
        this.transcriber = str4;
        this.surface = str5;
        this.session_id = str6;
        this.entry_mode = str7;
    }

    public /* synthetic */ SttEvents$CancelRecording(String str, String str2, int i, int i2, String str3, String str4, String str5, String str6, String str7, int i3, mq5 mq5Var) {
        this(str, str2, i, i2, str3, str4, (i3 & 64) != 0 ? null : str5, (i3 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : str6, (i3 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : str7);
    }
}
