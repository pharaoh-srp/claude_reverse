package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.h3j;
import defpackage.i3j;
import defpackage.ij0;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.mti;
import defpackage.onf;
import defpackage.srg;
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
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ0\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001eR\u0014\u00100\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u001e¨\u00064"}, d2 = {"com/anthropic/claude/analytics/events/VoiceEvents$TrainingConsentSettingsViewed", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentSurface;", "surface", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentState;", "consent_state", "", "voice_session_id", "<init>", "(Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentSurface;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentState;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentSurface;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentState;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/VoiceEvents$TrainingConsentSettingsViewed;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/VoiceEvents$TrainingConsentSettingsViewed;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentSurface;", "component2", "()Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentState;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentSurface;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentState;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/VoiceEvents$TrainingConsentSettingsViewed;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentSurface;", "getSurface", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentState;", "getConsent_state", "Ljava/lang/String;", "getVoice_session_id", "getEventName", "eventName", "Companion", "h3j", "i3j", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class VoiceEvents$TrainingConsentSettingsViewed implements AnalyticsEvent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final i3j Companion = new i3j();
    private final VoiceEvents$VoiceTrainingConsentState consent_state;
    private final VoiceEvents$VoiceTrainingConsentSurface surface;
    private final String voice_session_id;

    static {
        mti mtiVar = new mti(25);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{yb5.w(w1aVar, mtiVar), yb5.w(w1aVar, new mti(26)), null};
    }

    public /* synthetic */ VoiceEvents$TrainingConsentSettingsViewed(int i, VoiceEvents$VoiceTrainingConsentSurface voiceEvents$VoiceTrainingConsentSurface, VoiceEvents$VoiceTrainingConsentState voiceEvents$VoiceTrainingConsentState, String str, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, h3j.a.getDescriptor());
            throw null;
        }
        this.surface = voiceEvents$VoiceTrainingConsentSurface;
        this.consent_state = voiceEvents$VoiceTrainingConsentState;
        if ((i & 4) == 0) {
            this.voice_session_id = null;
        } else {
            this.voice_session_id = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return VoiceEvents$VoiceTrainingConsentSurface.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return VoiceEvents$VoiceTrainingConsentState.Companion.serializer();
    }

    public static /* synthetic */ VoiceEvents$TrainingConsentSettingsViewed copy$default(VoiceEvents$TrainingConsentSettingsViewed voiceEvents$TrainingConsentSettingsViewed, VoiceEvents$VoiceTrainingConsentSurface voiceEvents$VoiceTrainingConsentSurface, VoiceEvents$VoiceTrainingConsentState voiceEvents$VoiceTrainingConsentState, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            voiceEvents$VoiceTrainingConsentSurface = voiceEvents$TrainingConsentSettingsViewed.surface;
        }
        if ((i & 2) != 0) {
            voiceEvents$VoiceTrainingConsentState = voiceEvents$TrainingConsentSettingsViewed.consent_state;
        }
        if ((i & 4) != 0) {
            str = voiceEvents$TrainingConsentSettingsViewed.voice_session_id;
        }
        return voiceEvents$TrainingConsentSettingsViewed.copy(voiceEvents$VoiceTrainingConsentSurface, voiceEvents$VoiceTrainingConsentState, str);
    }

    public static final /* synthetic */ void write$Self$analytics(VoiceEvents$TrainingConsentSettingsViewed self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.surface);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.consent_state);
        if (!output.E(serialDesc) && self.voice_session_id == null) {
            return;
        }
        output.B(serialDesc, 2, srg.a, self.voice_session_id);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final VoiceEvents$VoiceTrainingConsentSurface getSurface() {
        return this.surface;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final VoiceEvents$VoiceTrainingConsentState getConsent_state() {
        return this.consent_state;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVoice_session_id() {
        return this.voice_session_id;
    }

    public final VoiceEvents$TrainingConsentSettingsViewed copy(VoiceEvents$VoiceTrainingConsentSurface surface, VoiceEvents$VoiceTrainingConsentState consent_state, String voice_session_id) {
        surface.getClass();
        consent_state.getClass();
        return new VoiceEvents$TrainingConsentSettingsViewed(surface, consent_state, voice_session_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceEvents$TrainingConsentSettingsViewed)) {
            return false;
        }
        VoiceEvents$TrainingConsentSettingsViewed voiceEvents$TrainingConsentSettingsViewed = (VoiceEvents$TrainingConsentSettingsViewed) other;
        return this.surface == voiceEvents$TrainingConsentSettingsViewed.surface && this.consent_state == voiceEvents$TrainingConsentSettingsViewed.consent_state && x44.r(this.voice_session_id, voiceEvents$TrainingConsentSettingsViewed.voice_session_id);
    }

    public final VoiceEvents$VoiceTrainingConsentState getConsent_state() {
        return this.consent_state;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.voice.training_consent.settings.viewed";
    }

    public final VoiceEvents$VoiceTrainingConsentSurface getSurface() {
        return this.surface;
    }

    public final String getVoice_session_id() {
        return this.voice_session_id;
    }

    public int hashCode() {
        int iHashCode = (this.consent_state.hashCode() + (this.surface.hashCode() * 31)) * 31;
        String str = this.voice_session_id;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        VoiceEvents$VoiceTrainingConsentSurface voiceEvents$VoiceTrainingConsentSurface = this.surface;
        VoiceEvents$VoiceTrainingConsentState voiceEvents$VoiceTrainingConsentState = this.consent_state;
        String str = this.voice_session_id;
        StringBuilder sb = new StringBuilder("TrainingConsentSettingsViewed(surface=");
        sb.append(voiceEvents$VoiceTrainingConsentSurface);
        sb.append(", consent_state=");
        sb.append(voiceEvents$VoiceTrainingConsentState);
        sb.append(", voice_session_id=");
        return ij0.m(sb, str, ")");
    }

    public VoiceEvents$TrainingConsentSettingsViewed(VoiceEvents$VoiceTrainingConsentSurface voiceEvents$VoiceTrainingConsentSurface, VoiceEvents$VoiceTrainingConsentState voiceEvents$VoiceTrainingConsentState, String str) {
        voiceEvents$VoiceTrainingConsentSurface.getClass();
        voiceEvents$VoiceTrainingConsentState.getClass();
        this.surface = voiceEvents$VoiceTrainingConsentSurface;
        this.consent_state = voiceEvents$VoiceTrainingConsentState;
        this.voice_session_id = str;
    }

    public /* synthetic */ VoiceEvents$TrainingConsentSettingsViewed(VoiceEvents$VoiceTrainingConsentSurface voiceEvents$VoiceTrainingConsentSurface, VoiceEvents$VoiceTrainingConsentState voiceEvents$VoiceTrainingConsentState, String str, int i, mq5 mq5Var) {
        this(voiceEvents$VoiceTrainingConsentSurface, voiceEvents$VoiceTrainingConsentState, (i & 4) != 0 ? null : str);
    }
}
