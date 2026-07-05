package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.kw9;
import defpackage.l3j;
import defpackage.m3j;
import defpackage.mdj;
import defpackage.mti;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001aR\u0014\u0010*\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0018¨\u0006."}, d2 = {"com/anthropic/claude/analytics/events/VoiceEvents$TrainingConsentSharePreferencePromptSubmitted", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "voice_session_id", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentState;", "consent_state", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentState;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentState;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/VoiceEvents$TrainingConsentSharePreferencePromptSubmitted;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/VoiceEvents$TrainingConsentSharePreferencePromptSubmitted;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentState;", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentState;)Lcom/anthropic/claude/analytics/events/VoiceEvents$TrainingConsentSharePreferencePromptSubmitted;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVoice_session_id", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentState;", "getConsent_state", "getEventName", "eventName", "Companion", "l3j", "m3j", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class VoiceEvents$TrainingConsentSharePreferencePromptSubmitted implements AnalyticsEvent {
    public static final int $stable = 0;
    private final VoiceEvents$VoiceTrainingConsentState consent_state;
    private final String voice_session_id;
    public static final m3j Companion = new m3j();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new mti(28))};

    public /* synthetic */ VoiceEvents$TrainingConsentSharePreferencePromptSubmitted(int i, String str, VoiceEvents$VoiceTrainingConsentState voiceEvents$VoiceTrainingConsentState, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, l3j.a.getDescriptor());
            throw null;
        }
        this.voice_session_id = str;
        this.consent_state = voiceEvents$VoiceTrainingConsentState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return VoiceEvents$VoiceTrainingConsentState.Companion.serializer();
    }

    public static /* synthetic */ VoiceEvents$TrainingConsentSharePreferencePromptSubmitted copy$default(VoiceEvents$TrainingConsentSharePreferencePromptSubmitted voiceEvents$TrainingConsentSharePreferencePromptSubmitted, String str, VoiceEvents$VoiceTrainingConsentState voiceEvents$VoiceTrainingConsentState, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceEvents$TrainingConsentSharePreferencePromptSubmitted.voice_session_id;
        }
        if ((i & 2) != 0) {
            voiceEvents$VoiceTrainingConsentState = voiceEvents$TrainingConsentSharePreferencePromptSubmitted.consent_state;
        }
        return voiceEvents$TrainingConsentSharePreferencePromptSubmitted.copy(str, voiceEvents$VoiceTrainingConsentState);
    }

    public static final /* synthetic */ void write$Self$analytics(VoiceEvents$TrainingConsentSharePreferencePromptSubmitted self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.voice_session_id);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.consent_state);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVoice_session_id() {
        return this.voice_session_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final VoiceEvents$VoiceTrainingConsentState getConsent_state() {
        return this.consent_state;
    }

    public final VoiceEvents$TrainingConsentSharePreferencePromptSubmitted copy(String voice_session_id, VoiceEvents$VoiceTrainingConsentState consent_state) {
        voice_session_id.getClass();
        consent_state.getClass();
        return new VoiceEvents$TrainingConsentSharePreferencePromptSubmitted(voice_session_id, consent_state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceEvents$TrainingConsentSharePreferencePromptSubmitted)) {
            return false;
        }
        VoiceEvents$TrainingConsentSharePreferencePromptSubmitted voiceEvents$TrainingConsentSharePreferencePromptSubmitted = (VoiceEvents$TrainingConsentSharePreferencePromptSubmitted) other;
        return x44.r(this.voice_session_id, voiceEvents$TrainingConsentSharePreferencePromptSubmitted.voice_session_id) && this.consent_state == voiceEvents$TrainingConsentSharePreferencePromptSubmitted.consent_state;
    }

    public final VoiceEvents$VoiceTrainingConsentState getConsent_state() {
        return this.consent_state;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.voice.training_consent.share_preference_prompt.submitted";
    }

    public final String getVoice_session_id() {
        return this.voice_session_id;
    }

    public int hashCode() {
        return this.consent_state.hashCode() + (this.voice_session_id.hashCode() * 31);
    }

    public String toString() {
        return "TrainingConsentSharePreferencePromptSubmitted(voice_session_id=" + this.voice_session_id + ", consent_state=" + this.consent_state + ")";
    }

    public VoiceEvents$TrainingConsentSharePreferencePromptSubmitted(String str, VoiceEvents$VoiceTrainingConsentState voiceEvents$VoiceTrainingConsentState) {
        str.getClass();
        voiceEvents$VoiceTrainingConsentState.getClass();
        this.voice_session_id = str;
        this.consent_state = voiceEvents$VoiceTrainingConsentState;
    }
}
