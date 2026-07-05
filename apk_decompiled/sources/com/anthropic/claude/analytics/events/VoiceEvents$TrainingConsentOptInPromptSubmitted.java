package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mti;
import defpackage.onf;
import defpackage.v2j;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.w2j;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ.\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001eR\u0014\u00100\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u001a¨\u00064"}, d2 = {"com/anthropic/claude/analytics/events/VoiceEvents$TrainingConsentOptInPromptSubmitted", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "voice_session_id", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceEntrySource;", "entry_source", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentState;", "consent_state", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceEntrySource;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentState;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceEntrySource;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentState;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/VoiceEvents$TrainingConsentOptInPromptSubmitted;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/VoiceEvents$TrainingConsentOptInPromptSubmitted;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceEntrySource;", "component3", "()Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentState;", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceEntrySource;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentState;)Lcom/anthropic/claude/analytics/events/VoiceEvents$TrainingConsentOptInPromptSubmitted;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVoice_session_id", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceEntrySource;", "getEntry_source", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentState;", "getConsent_state", "getEventName", "eventName", "Companion", "v2j", "w2j", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class VoiceEvents$TrainingConsentOptInPromptSubmitted implements AnalyticsEvent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final w2j Companion = new w2j();
    private final VoiceEvents$VoiceTrainingConsentState consent_state;
    private final VoiceEvents$VoiceEntrySource entry_source;
    private final String voice_session_id;

    static {
        mti mtiVar = new mti(19);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, yb5.w(w1aVar, mtiVar), yb5.w(w1aVar, new mti(20))};
    }

    public /* synthetic */ VoiceEvents$TrainingConsentOptInPromptSubmitted(int i, String str, VoiceEvents$VoiceEntrySource voiceEvents$VoiceEntrySource, VoiceEvents$VoiceTrainingConsentState voiceEvents$VoiceTrainingConsentState, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, v2j.a.getDescriptor());
            throw null;
        }
        this.voice_session_id = str;
        this.entry_source = voiceEvents$VoiceEntrySource;
        this.consent_state = voiceEvents$VoiceTrainingConsentState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return VoiceEvents$VoiceEntrySource.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return VoiceEvents$VoiceTrainingConsentState.Companion.serializer();
    }

    public static /* synthetic */ VoiceEvents$TrainingConsentOptInPromptSubmitted copy$default(VoiceEvents$TrainingConsentOptInPromptSubmitted voiceEvents$TrainingConsentOptInPromptSubmitted, String str, VoiceEvents$VoiceEntrySource voiceEvents$VoiceEntrySource, VoiceEvents$VoiceTrainingConsentState voiceEvents$VoiceTrainingConsentState, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceEvents$TrainingConsentOptInPromptSubmitted.voice_session_id;
        }
        if ((i & 2) != 0) {
            voiceEvents$VoiceEntrySource = voiceEvents$TrainingConsentOptInPromptSubmitted.entry_source;
        }
        if ((i & 4) != 0) {
            voiceEvents$VoiceTrainingConsentState = voiceEvents$TrainingConsentOptInPromptSubmitted.consent_state;
        }
        return voiceEvents$TrainingConsentOptInPromptSubmitted.copy(str, voiceEvents$VoiceEntrySource, voiceEvents$VoiceTrainingConsentState);
    }

    public static final /* synthetic */ void write$Self$analytics(VoiceEvents$TrainingConsentOptInPromptSubmitted self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.voice_session_id);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.entry_source);
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.consent_state);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVoice_session_id() {
        return this.voice_session_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final VoiceEvents$VoiceEntrySource getEntry_source() {
        return this.entry_source;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final VoiceEvents$VoiceTrainingConsentState getConsent_state() {
        return this.consent_state;
    }

    public final VoiceEvents$TrainingConsentOptInPromptSubmitted copy(String voice_session_id, VoiceEvents$VoiceEntrySource entry_source, VoiceEvents$VoiceTrainingConsentState consent_state) {
        voice_session_id.getClass();
        entry_source.getClass();
        consent_state.getClass();
        return new VoiceEvents$TrainingConsentOptInPromptSubmitted(voice_session_id, entry_source, consent_state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceEvents$TrainingConsentOptInPromptSubmitted)) {
            return false;
        }
        VoiceEvents$TrainingConsentOptInPromptSubmitted voiceEvents$TrainingConsentOptInPromptSubmitted = (VoiceEvents$TrainingConsentOptInPromptSubmitted) other;
        return x44.r(this.voice_session_id, voiceEvents$TrainingConsentOptInPromptSubmitted.voice_session_id) && this.entry_source == voiceEvents$TrainingConsentOptInPromptSubmitted.entry_source && this.consent_state == voiceEvents$TrainingConsentOptInPromptSubmitted.consent_state;
    }

    public final VoiceEvents$VoiceTrainingConsentState getConsent_state() {
        return this.consent_state;
    }

    public final VoiceEvents$VoiceEntrySource getEntry_source() {
        return this.entry_source;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.voice.training_consent.opt_in_prompt.submitted";
    }

    public final String getVoice_session_id() {
        return this.voice_session_id;
    }

    public int hashCode() {
        return this.consent_state.hashCode() + ((this.entry_source.hashCode() + (this.voice_session_id.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "TrainingConsentOptInPromptSubmitted(voice_session_id=" + this.voice_session_id + ", entry_source=" + this.entry_source + ", consent_state=" + this.consent_state + ")";
    }

    public VoiceEvents$TrainingConsentOptInPromptSubmitted(String str, VoiceEvents$VoiceEntrySource voiceEvents$VoiceEntrySource, VoiceEvents$VoiceTrainingConsentState voiceEvents$VoiceTrainingConsentState) {
        str.getClass();
        voiceEvents$VoiceEntrySource.getClass();
        voiceEvents$VoiceTrainingConsentState.getClass();
        this.voice_session_id = str;
        this.entry_source = voiceEvents$VoiceEntrySource;
        this.consent_state = voiceEvents$VoiceTrainingConsentState;
    }
}
