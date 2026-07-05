package com.anthropic.claude.analytics.events;

import defpackage.d3j;
import defpackage.e3j;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ8\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b.\u0010\u001dR\u0014\u00100\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u001a¨\u00064"}, d2 = {"com/anthropic/claude/analytics/events/VoiceEvents$TrainingConsentSessionShareViewed", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "voice_session_id", "conversation_uuid", "", "session_duration_ms", "num_turns", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJ)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;JJLvnf;)V", "Lcom/anthropic/claude/analytics/events/VoiceEvents$TrainingConsentSessionShareViewed;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/VoiceEvents$TrainingConsentSessionShareViewed;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()J", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;JJ)Lcom/anthropic/claude/analytics/events/VoiceEvents$TrainingConsentSessionShareViewed;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVoice_session_id", "getConversation_uuid", "J", "getSession_duration_ms", "getNum_turns", "getEventName", "eventName", "Companion", "d3j", "e3j", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class VoiceEvents$TrainingConsentSessionShareViewed implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final e3j Companion = new e3j();
    private final String conversation_uuid;
    private final long num_turns;
    private final long session_duration_ms;
    private final String voice_session_id;

    public /* synthetic */ VoiceEvents$TrainingConsentSessionShareViewed(int i, String str, String str2, long j, long j2, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, d3j.a.getDescriptor());
            throw null;
        }
        this.voice_session_id = str;
        this.conversation_uuid = str2;
        this.session_duration_ms = j;
        this.num_turns = j2;
    }

    public static /* synthetic */ VoiceEvents$TrainingConsentSessionShareViewed copy$default(VoiceEvents$TrainingConsentSessionShareViewed voiceEvents$TrainingConsentSessionShareViewed, String str, String str2, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceEvents$TrainingConsentSessionShareViewed.voice_session_id;
        }
        if ((i & 2) != 0) {
            str2 = voiceEvents$TrainingConsentSessionShareViewed.conversation_uuid;
        }
        if ((i & 4) != 0) {
            j = voiceEvents$TrainingConsentSessionShareViewed.session_duration_ms;
        }
        if ((i & 8) != 0) {
            j2 = voiceEvents$TrainingConsentSessionShareViewed.num_turns;
        }
        long j3 = j2;
        return voiceEvents$TrainingConsentSessionShareViewed.copy(str, str2, j, j3);
    }

    public static final /* synthetic */ void write$Self$analytics(VoiceEvents$TrainingConsentSessionShareViewed self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.voice_session_id);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.D(serialDesc, 2, self.session_duration_ms);
        output.D(serialDesc, 3, self.num_turns);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVoice_session_id() {
        return this.voice_session_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getSession_duration_ms() {
        return this.session_duration_ms;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getNum_turns() {
        return this.num_turns;
    }

    public final VoiceEvents$TrainingConsentSessionShareViewed copy(String voice_session_id, String conversation_uuid, long session_duration_ms, long num_turns) {
        voice_session_id.getClass();
        conversation_uuid.getClass();
        return new VoiceEvents$TrainingConsentSessionShareViewed(voice_session_id, conversation_uuid, session_duration_ms, num_turns);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceEvents$TrainingConsentSessionShareViewed)) {
            return false;
        }
        VoiceEvents$TrainingConsentSessionShareViewed voiceEvents$TrainingConsentSessionShareViewed = (VoiceEvents$TrainingConsentSessionShareViewed) other;
        return x44.r(this.voice_session_id, voiceEvents$TrainingConsentSessionShareViewed.voice_session_id) && x44.r(this.conversation_uuid, voiceEvents$TrainingConsentSessionShareViewed.conversation_uuid) && this.session_duration_ms == voiceEvents$TrainingConsentSessionShareViewed.session_duration_ms && this.num_turns == voiceEvents$TrainingConsentSessionShareViewed.num_turns;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.voice.training_consent.session_share.viewed";
    }

    public final long getNum_turns() {
        return this.num_turns;
    }

    public final long getSession_duration_ms() {
        return this.session_duration_ms;
    }

    public final String getVoice_session_id() {
        return this.voice_session_id;
    }

    public int hashCode() {
        return Long.hashCode(this.num_turns) + vb7.e(kgh.l(this.voice_session_id.hashCode() * 31, 31, this.conversation_uuid), 31, this.session_duration_ms);
    }

    public String toString() {
        String str = this.voice_session_id;
        String str2 = this.conversation_uuid;
        long j = this.session_duration_ms;
        long j2 = this.num_turns;
        StringBuilder sbR = kgh.r("TrainingConsentSessionShareViewed(voice_session_id=", str, ", conversation_uuid=", str2, ", session_duration_ms=");
        sbR.append(j);
        sbR.append(", num_turns=");
        sbR.append(j2);
        sbR.append(")");
        return sbR.toString();
    }

    public VoiceEvents$TrainingConsentSessionShareViewed(String str, String str2, long j, long j2) {
        str.getClass();
        str2.getClass();
        this.voice_session_id = str;
        this.conversation_uuid = str2;
        this.session_duration_ms = j;
        this.num_turns = j2;
    }
}
