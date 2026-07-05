package com.anthropic.claude.analytics.events;

import defpackage.b3j;
import defpackage.c3j;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.sq6;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ.\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001cR\u0014\u0010,\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0019¨\u00060"}, d2 = {"com/anthropic/claude/analytics/events/VoiceEvents$TrainingConsentSessionShareSubmitted", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "voice_session_id", "conversation_uuid", "", "shared", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLvnf;)V", "Lcom/anthropic/claude/analytics/events/VoiceEvents$TrainingConsentSessionShareSubmitted;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/VoiceEvents$TrainingConsentSessionShareSubmitted;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/anthropic/claude/analytics/events/VoiceEvents$TrainingConsentSessionShareSubmitted;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVoice_session_id", "getConversation_uuid", "Z", "getShared", "getEventName", "eventName", "Companion", "b3j", "c3j", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class VoiceEvents$TrainingConsentSessionShareSubmitted implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final c3j Companion = new c3j();
    private final String conversation_uuid;
    private final boolean shared;
    private final String voice_session_id;

    public /* synthetic */ VoiceEvents$TrainingConsentSessionShareSubmitted(int i, String str, String str2, boolean z, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, b3j.a.getDescriptor());
            throw null;
        }
        this.voice_session_id = str;
        this.conversation_uuid = str2;
        this.shared = z;
    }

    public static /* synthetic */ VoiceEvents$TrainingConsentSessionShareSubmitted copy$default(VoiceEvents$TrainingConsentSessionShareSubmitted voiceEvents$TrainingConsentSessionShareSubmitted, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceEvents$TrainingConsentSessionShareSubmitted.voice_session_id;
        }
        if ((i & 2) != 0) {
            str2 = voiceEvents$TrainingConsentSessionShareSubmitted.conversation_uuid;
        }
        if ((i & 4) != 0) {
            z = voiceEvents$TrainingConsentSessionShareSubmitted.shared;
        }
        return voiceEvents$TrainingConsentSessionShareSubmitted.copy(str, str2, z);
    }

    public static final /* synthetic */ void write$Self$analytics(VoiceEvents$TrainingConsentSessionShareSubmitted self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.voice_session_id);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.p(serialDesc, 2, self.shared);
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
    public final boolean getShared() {
        return this.shared;
    }

    public final VoiceEvents$TrainingConsentSessionShareSubmitted copy(String voice_session_id, String conversation_uuid, boolean shared) {
        voice_session_id.getClass();
        conversation_uuid.getClass();
        return new VoiceEvents$TrainingConsentSessionShareSubmitted(voice_session_id, conversation_uuid, shared);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceEvents$TrainingConsentSessionShareSubmitted)) {
            return false;
        }
        VoiceEvents$TrainingConsentSessionShareSubmitted voiceEvents$TrainingConsentSessionShareSubmitted = (VoiceEvents$TrainingConsentSessionShareSubmitted) other;
        return x44.r(this.voice_session_id, voiceEvents$TrainingConsentSessionShareSubmitted.voice_session_id) && x44.r(this.conversation_uuid, voiceEvents$TrainingConsentSessionShareSubmitted.conversation_uuid) && this.shared == voiceEvents$TrainingConsentSessionShareSubmitted.shared;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.voice.training_consent.session_share.submitted";
    }

    public final boolean getShared() {
        return this.shared;
    }

    public final String getVoice_session_id() {
        return this.voice_session_id;
    }

    public int hashCode() {
        return Boolean.hashCode(this.shared) + kgh.l(this.voice_session_id.hashCode() * 31, 31, this.conversation_uuid);
    }

    public String toString() {
        String str = this.voice_session_id;
        String str2 = this.conversation_uuid;
        return sq6.v(")", kgh.r("TrainingConsentSessionShareSubmitted(voice_session_id=", str, ", conversation_uuid=", str2, ", shared="), this.shared);
    }

    public VoiceEvents$TrainingConsentSessionShareSubmitted(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.voice_session_id = str;
        this.conversation_uuid = str2;
        this.shared = z;
    }
}
