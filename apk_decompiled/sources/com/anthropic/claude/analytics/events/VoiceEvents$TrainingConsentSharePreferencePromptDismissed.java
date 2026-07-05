package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.j3j;
import defpackage.k3j;
import defpackage.kw9;
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
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001aR\u0014\u0010*\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0018¨\u0006."}, d2 = {"com/anthropic/claude/analytics/events/VoiceEvents$TrainingConsentSharePreferencePromptDismissed", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "voice_session_id", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentDismissTrigger;", "dismiss_trigger", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentDismissTrigger;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentDismissTrigger;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/VoiceEvents$TrainingConsentSharePreferencePromptDismissed;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/VoiceEvents$TrainingConsentSharePreferencePromptDismissed;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentDismissTrigger;", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentDismissTrigger;)Lcom/anthropic/claude/analytics/events/VoiceEvents$TrainingConsentSharePreferencePromptDismissed;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVoice_session_id", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentDismissTrigger;", "getDismiss_trigger", "getEventName", "eventName", "Companion", "j3j", "k3j", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class VoiceEvents$TrainingConsentSharePreferencePromptDismissed implements AnalyticsEvent {
    public static final int $stable = 0;
    private final VoiceEvents$VoiceTrainingConsentDismissTrigger dismiss_trigger;
    private final String voice_session_id;
    public static final k3j Companion = new k3j();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new mti(27))};

    public /* synthetic */ VoiceEvents$TrainingConsentSharePreferencePromptDismissed(int i, String str, VoiceEvents$VoiceTrainingConsentDismissTrigger voiceEvents$VoiceTrainingConsentDismissTrigger, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, j3j.a.getDescriptor());
            throw null;
        }
        this.voice_session_id = str;
        this.dismiss_trigger = voiceEvents$VoiceTrainingConsentDismissTrigger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return VoiceEvents$VoiceTrainingConsentDismissTrigger.Companion.serializer();
    }

    public static /* synthetic */ VoiceEvents$TrainingConsentSharePreferencePromptDismissed copy$default(VoiceEvents$TrainingConsentSharePreferencePromptDismissed voiceEvents$TrainingConsentSharePreferencePromptDismissed, String str, VoiceEvents$VoiceTrainingConsentDismissTrigger voiceEvents$VoiceTrainingConsentDismissTrigger, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceEvents$TrainingConsentSharePreferencePromptDismissed.voice_session_id;
        }
        if ((i & 2) != 0) {
            voiceEvents$VoiceTrainingConsentDismissTrigger = voiceEvents$TrainingConsentSharePreferencePromptDismissed.dismiss_trigger;
        }
        return voiceEvents$TrainingConsentSharePreferencePromptDismissed.copy(str, voiceEvents$VoiceTrainingConsentDismissTrigger);
    }

    public static final /* synthetic */ void write$Self$analytics(VoiceEvents$TrainingConsentSharePreferencePromptDismissed self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.voice_session_id);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.dismiss_trigger);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVoice_session_id() {
        return this.voice_session_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final VoiceEvents$VoiceTrainingConsentDismissTrigger getDismiss_trigger() {
        return this.dismiss_trigger;
    }

    public final VoiceEvents$TrainingConsentSharePreferencePromptDismissed copy(String voice_session_id, VoiceEvents$VoiceTrainingConsentDismissTrigger dismiss_trigger) {
        voice_session_id.getClass();
        dismiss_trigger.getClass();
        return new VoiceEvents$TrainingConsentSharePreferencePromptDismissed(voice_session_id, dismiss_trigger);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceEvents$TrainingConsentSharePreferencePromptDismissed)) {
            return false;
        }
        VoiceEvents$TrainingConsentSharePreferencePromptDismissed voiceEvents$TrainingConsentSharePreferencePromptDismissed = (VoiceEvents$TrainingConsentSharePreferencePromptDismissed) other;
        return x44.r(this.voice_session_id, voiceEvents$TrainingConsentSharePreferencePromptDismissed.voice_session_id) && this.dismiss_trigger == voiceEvents$TrainingConsentSharePreferencePromptDismissed.dismiss_trigger;
    }

    public final VoiceEvents$VoiceTrainingConsentDismissTrigger getDismiss_trigger() {
        return this.dismiss_trigger;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.voice.training_consent.share_preference_prompt.dismissed";
    }

    public final String getVoice_session_id() {
        return this.voice_session_id;
    }

    public int hashCode() {
        return this.dismiss_trigger.hashCode() + (this.voice_session_id.hashCode() * 31);
    }

    public String toString() {
        return "TrainingConsentSharePreferencePromptDismissed(voice_session_id=" + this.voice_session_id + ", dismiss_trigger=" + this.dismiss_trigger + ")";
    }

    public VoiceEvents$TrainingConsentSharePreferencePromptDismissed(String str, VoiceEvents$VoiceTrainingConsentDismissTrigger voiceEvents$VoiceTrainingConsentDismissTrigger) {
        str.getClass();
        voiceEvents$VoiceTrainingConsentDismissTrigger.getClass();
        this.voice_session_id = str;
        this.dismiss_trigger = voiceEvents$VoiceTrainingConsentDismissTrigger;
    }
}
