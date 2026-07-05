package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.ktg;
import defpackage.ltg;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBa\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\\\u0010#\u001a\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b1\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b2\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b3\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b4\u0010\u001cR\u0014\u00106\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u001c¨\u0006:"}, d2 = {"com/anthropic/claude/analytics/events/SttEvents$StartRecording", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "language", "transcriber", "surface", "session_id", "entry_mode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/SttEvents$StartRecording;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/SttEvents$StartRecording;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/SttEvents$StartRecording;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "getLanguage", "getTranscriber", "getSurface", "getSession_id", "getEntry_mode", "getEventName", "eventName", "Companion", "ktg", "ltg", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SttEvents$StartRecording implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final ltg Companion = new ltg();
    private final String conversation_uuid;
    private final String entry_mode;
    private final String language;
    private final String organization_uuid;
    private final String session_id;
    private final String surface;
    private final String transcriber;

    public /* synthetic */ SttEvents$StartRecording(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, ktg.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.language = str3;
        this.transcriber = str4;
        if ((i & 16) == 0) {
            this.surface = null;
        } else {
            this.surface = str5;
        }
        if ((i & 32) == 0) {
            this.session_id = null;
        } else {
            this.session_id = str6;
        }
        if ((i & 64) == 0) {
            this.entry_mode = null;
        } else {
            this.entry_mode = str7;
        }
    }

    public static /* synthetic */ SttEvents$StartRecording copy$default(SttEvents$StartRecording sttEvents$StartRecording, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sttEvents$StartRecording.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = sttEvents$StartRecording.conversation_uuid;
        }
        if ((i & 4) != 0) {
            str3 = sttEvents$StartRecording.language;
        }
        if ((i & 8) != 0) {
            str4 = sttEvents$StartRecording.transcriber;
        }
        if ((i & 16) != 0) {
            str5 = sttEvents$StartRecording.surface;
        }
        if ((i & 32) != 0) {
            str6 = sttEvents$StartRecording.session_id;
        }
        if ((i & 64) != 0) {
            str7 = sttEvents$StartRecording.entry_mode;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return sttEvents$StartRecording.copy(str, str2, str11, str4, str10, str8, str9);
    }

    public static final /* synthetic */ void write$Self$analytics(SttEvents$StartRecording self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.q(serialDesc, 2, self.language);
        output.q(serialDesc, 3, self.transcriber);
        if (output.E(serialDesc) || self.surface != null) {
            output.B(serialDesc, 4, srg.a, self.surface);
        }
        if (output.E(serialDesc) || self.session_id != null) {
            output.B(serialDesc, 5, srg.a, self.session_id);
        }
        if (!output.E(serialDesc) && self.entry_mode == null) {
            return;
        }
        output.B(serialDesc, 6, srg.a, self.entry_mode);
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
    public final String getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTranscriber() {
        return this.transcriber;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSurface() {
        return this.surface;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSession_id() {
        return this.session_id;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getEntry_mode() {
        return this.entry_mode;
    }

    public final SttEvents$StartRecording copy(String organization_uuid, String conversation_uuid, String language, String transcriber, String surface, String session_id, String entry_mode) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        language.getClass();
        transcriber.getClass();
        return new SttEvents$StartRecording(organization_uuid, conversation_uuid, language, transcriber, surface, session_id, entry_mode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SttEvents$StartRecording)) {
            return false;
        }
        SttEvents$StartRecording sttEvents$StartRecording = (SttEvents$StartRecording) other;
        return x44.r(this.organization_uuid, sttEvents$StartRecording.organization_uuid) && x44.r(this.conversation_uuid, sttEvents$StartRecording.conversation_uuid) && x44.r(this.language, sttEvents$StartRecording.language) && x44.r(this.transcriber, sttEvents$StartRecording.transcriber) && x44.r(this.surface, sttEvents$StartRecording.surface) && x44.r(this.session_id, sttEvents$StartRecording.session_id) && x44.r(this.entry_mode, sttEvents$StartRecording.entry_mode);
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    public final String getEntry_mode() {
        return this.entry_mode;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_stt_start_recording";
    }

    public final String getLanguage() {
        return this.language;
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

    public int hashCode() {
        int iL = kgh.l(kgh.l(kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid), 31, this.language), 31, this.transcriber);
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
        String str3 = this.language;
        String str4 = this.transcriber;
        String str5 = this.surface;
        String str6 = this.session_id;
        String str7 = this.entry_mode;
        StringBuilder sbR = kgh.r("StartRecording(organization_uuid=", str, ", conversation_uuid=", str2, ", language=");
        kgh.u(sbR, str3, ", transcriber=", str4, ", surface=");
        kgh.u(sbR, str5, ", session_id=", str6, ", entry_mode=");
        return ij0.m(sbR, str7, ")");
    }

    public SttEvents$StartRecording(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        ij0.z(str, str2, str3, str4);
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.language = str3;
        this.transcriber = str4;
        this.surface = str5;
        this.session_id = str6;
        this.entry_mode = str7;
    }

    public /* synthetic */ SttEvents$StartRecording(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, mq5 mq5Var) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }
}
