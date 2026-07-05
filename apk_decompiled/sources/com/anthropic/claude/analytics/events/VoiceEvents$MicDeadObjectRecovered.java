package com.anthropic.claude.analytics.events;

import defpackage.grc;
import defpackage.gvj;
import defpackage.j2j;
import defpackage.k2j;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ8\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b!\u0010\u001dJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001dR\u0014\u0010.\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0019¨\u00062"}, d2 = {"com/anthropic/claude/analytics/events/VoiceEvents$MicDeadObjectRecovered", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "voice_session_id", "", "attempt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILvnf;)V", "Lcom/anthropic/claude/analytics/events/VoiceEvents$MicDeadObjectRecovered;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/VoiceEvents$MicDeadObjectRecovered;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/anthropic/claude/analytics/events/VoiceEvents$MicDeadObjectRecovered;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "getVoice_session_id", "I", "getAttempt", "getEventName", "eventName", "Companion", "j2j", "k2j", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class VoiceEvents$MicDeadObjectRecovered implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final k2j Companion = new k2j();
    private final int attempt;
    private final String conversation_uuid;
    private final String organization_uuid;
    private final String voice_session_id;

    public /* synthetic */ VoiceEvents$MicDeadObjectRecovered(int i, String str, String str2, String str3, int i2, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, j2j.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.voice_session_id = str3;
        this.attempt = i2;
    }

    public static /* synthetic */ VoiceEvents$MicDeadObjectRecovered copy$default(VoiceEvents$MicDeadObjectRecovered voiceEvents$MicDeadObjectRecovered, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = voiceEvents$MicDeadObjectRecovered.organization_uuid;
        }
        if ((i2 & 2) != 0) {
            str2 = voiceEvents$MicDeadObjectRecovered.conversation_uuid;
        }
        if ((i2 & 4) != 0) {
            str3 = voiceEvents$MicDeadObjectRecovered.voice_session_id;
        }
        if ((i2 & 8) != 0) {
            i = voiceEvents$MicDeadObjectRecovered.attempt;
        }
        return voiceEvents$MicDeadObjectRecovered.copy(str, str2, str3, i);
    }

    public static final /* synthetic */ void write$Self$analytics(VoiceEvents$MicDeadObjectRecovered self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.q(serialDesc, 2, self.voice_session_id);
        output.l(3, self.attempt, serialDesc);
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
    public final String getVoice_session_id() {
        return this.voice_session_id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getAttempt() {
        return this.attempt;
    }

    public final VoiceEvents$MicDeadObjectRecovered copy(String organization_uuid, String conversation_uuid, String voice_session_id, int attempt) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        voice_session_id.getClass();
        return new VoiceEvents$MicDeadObjectRecovered(organization_uuid, conversation_uuid, voice_session_id, attempt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceEvents$MicDeadObjectRecovered)) {
            return false;
        }
        VoiceEvents$MicDeadObjectRecovered voiceEvents$MicDeadObjectRecovered = (VoiceEvents$MicDeadObjectRecovered) other;
        return x44.r(this.organization_uuid, voiceEvents$MicDeadObjectRecovered.organization_uuid) && x44.r(this.conversation_uuid, voiceEvents$MicDeadObjectRecovered.conversation_uuid) && x44.r(this.voice_session_id, voiceEvents$MicDeadObjectRecovered.voice_session_id) && this.attempt == voiceEvents$MicDeadObjectRecovered.attempt;
    }

    public final int getAttempt() {
        return this.attempt;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.voice.mic.dead_object_recovered";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getVoice_session_id() {
        return this.voice_session_id;
    }

    public int hashCode() {
        return Integer.hashCode(this.attempt) + kgh.l(kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid), 31, this.voice_session_id);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        String str3 = this.voice_session_id;
        int i = this.attempt;
        StringBuilder sbR = kgh.r("MicDeadObjectRecovered(organization_uuid=", str, ", conversation_uuid=", str2, ", voice_session_id=");
        sbR.append(str3);
        sbR.append(", attempt=");
        sbR.append(i);
        sbR.append(")");
        return sbR.toString();
    }

    public VoiceEvents$MicDeadObjectRecovered(String str, String str2, String str3, int i) {
        grc.B(str, str2, str3);
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.voice_session_id = str3;
        this.attempt = i;
    }
}
