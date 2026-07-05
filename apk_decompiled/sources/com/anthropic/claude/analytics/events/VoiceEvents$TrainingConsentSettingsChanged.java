package com.anthropic.claude.analytics.events;

import defpackage.f3j;
import defpackage.g3j;
import defpackage.gvj;
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
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J:\u0010!\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b/\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010 R\u0014\u00103\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010 ¨\u00067"}, d2 = {"com/anthropic/claude/analytics/events/VoiceEvents$TrainingConsentSettingsChanged", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentSurface;", "surface", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentState;", "from_state", "to_state", "", "voice_session_id", "<init>", "(Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentSurface;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentState;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentState;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentSurface;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentState;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentState;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/VoiceEvents$TrainingConsentSettingsChanged;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/VoiceEvents$TrainingConsentSettingsChanged;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentSurface;", "component2", "()Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentState;", "component3", "component4", "()Ljava/lang/String;", "copy", "(Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentSurface;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentState;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentState;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/VoiceEvents$TrainingConsentSettingsChanged;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentSurface;", "getSurface", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceTrainingConsentState;", "getFrom_state", "getTo_state", "Ljava/lang/String;", "getVoice_session_id", "getEventName", "eventName", "Companion", "f3j", "g3j", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class VoiceEvents$TrainingConsentSettingsChanged implements AnalyticsEvent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final g3j Companion = new g3j();
    private final VoiceEvents$VoiceTrainingConsentState from_state;
    private final VoiceEvents$VoiceTrainingConsentSurface surface;
    private final VoiceEvents$VoiceTrainingConsentState to_state;
    private final String voice_session_id;

    static {
        mti mtiVar = new mti(22);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{yb5.w(w1aVar, mtiVar), yb5.w(w1aVar, new mti(23)), yb5.w(w1aVar, new mti(24)), null};
    }

    public /* synthetic */ VoiceEvents$TrainingConsentSettingsChanged(int i, VoiceEvents$VoiceTrainingConsentSurface voiceEvents$VoiceTrainingConsentSurface, VoiceEvents$VoiceTrainingConsentState voiceEvents$VoiceTrainingConsentState, VoiceEvents$VoiceTrainingConsentState voiceEvents$VoiceTrainingConsentState2, String str, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, f3j.a.getDescriptor());
            throw null;
        }
        this.surface = voiceEvents$VoiceTrainingConsentSurface;
        this.from_state = voiceEvents$VoiceTrainingConsentState;
        this.to_state = voiceEvents$VoiceTrainingConsentState2;
        if ((i & 8) == 0) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return VoiceEvents$VoiceTrainingConsentState.Companion.serializer();
    }

    public static /* synthetic */ VoiceEvents$TrainingConsentSettingsChanged copy$default(VoiceEvents$TrainingConsentSettingsChanged voiceEvents$TrainingConsentSettingsChanged, VoiceEvents$VoiceTrainingConsentSurface voiceEvents$VoiceTrainingConsentSurface, VoiceEvents$VoiceTrainingConsentState voiceEvents$VoiceTrainingConsentState, VoiceEvents$VoiceTrainingConsentState voiceEvents$VoiceTrainingConsentState2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            voiceEvents$VoiceTrainingConsentSurface = voiceEvents$TrainingConsentSettingsChanged.surface;
        }
        if ((i & 2) != 0) {
            voiceEvents$VoiceTrainingConsentState = voiceEvents$TrainingConsentSettingsChanged.from_state;
        }
        if ((i & 4) != 0) {
            voiceEvents$VoiceTrainingConsentState2 = voiceEvents$TrainingConsentSettingsChanged.to_state;
        }
        if ((i & 8) != 0) {
            str = voiceEvents$TrainingConsentSettingsChanged.voice_session_id;
        }
        return voiceEvents$TrainingConsentSettingsChanged.copy(voiceEvents$VoiceTrainingConsentSurface, voiceEvents$VoiceTrainingConsentState, voiceEvents$VoiceTrainingConsentState2, str);
    }

    public static final /* synthetic */ void write$Self$analytics(VoiceEvents$TrainingConsentSettingsChanged self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.surface);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.from_state);
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.to_state);
        if (!output.E(serialDesc) && self.voice_session_id == null) {
            return;
        }
        output.B(serialDesc, 3, srg.a, self.voice_session_id);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final VoiceEvents$VoiceTrainingConsentSurface getSurface() {
        return this.surface;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final VoiceEvents$VoiceTrainingConsentState getFrom_state() {
        return this.from_state;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final VoiceEvents$VoiceTrainingConsentState getTo_state() {
        return this.to_state;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVoice_session_id() {
        return this.voice_session_id;
    }

    public final VoiceEvents$TrainingConsentSettingsChanged copy(VoiceEvents$VoiceTrainingConsentSurface surface, VoiceEvents$VoiceTrainingConsentState from_state, VoiceEvents$VoiceTrainingConsentState to_state, String voice_session_id) {
        surface.getClass();
        from_state.getClass();
        to_state.getClass();
        return new VoiceEvents$TrainingConsentSettingsChanged(surface, from_state, to_state, voice_session_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceEvents$TrainingConsentSettingsChanged)) {
            return false;
        }
        VoiceEvents$TrainingConsentSettingsChanged voiceEvents$TrainingConsentSettingsChanged = (VoiceEvents$TrainingConsentSettingsChanged) other;
        return this.surface == voiceEvents$TrainingConsentSettingsChanged.surface && this.from_state == voiceEvents$TrainingConsentSettingsChanged.from_state && this.to_state == voiceEvents$TrainingConsentSettingsChanged.to_state && x44.r(this.voice_session_id, voiceEvents$TrainingConsentSettingsChanged.voice_session_id);
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.voice.training_consent.settings.changed";
    }

    public final VoiceEvents$VoiceTrainingConsentState getFrom_state() {
        return this.from_state;
    }

    public final VoiceEvents$VoiceTrainingConsentSurface getSurface() {
        return this.surface;
    }

    public final VoiceEvents$VoiceTrainingConsentState getTo_state() {
        return this.to_state;
    }

    public final String getVoice_session_id() {
        return this.voice_session_id;
    }

    public int hashCode() {
        int iHashCode = (this.to_state.hashCode() + ((this.from_state.hashCode() + (this.surface.hashCode() * 31)) * 31)) * 31;
        String str = this.voice_session_id;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "TrainingConsentSettingsChanged(surface=" + this.surface + ", from_state=" + this.from_state + ", to_state=" + this.to_state + ", voice_session_id=" + this.voice_session_id + ")";
    }

    public VoiceEvents$TrainingConsentSettingsChanged(VoiceEvents$VoiceTrainingConsentSurface voiceEvents$VoiceTrainingConsentSurface, VoiceEvents$VoiceTrainingConsentState voiceEvents$VoiceTrainingConsentState, VoiceEvents$VoiceTrainingConsentState voiceEvents$VoiceTrainingConsentState2, String str) {
        voiceEvents$VoiceTrainingConsentSurface.getClass();
        voiceEvents$VoiceTrainingConsentState.getClass();
        voiceEvents$VoiceTrainingConsentState2.getClass();
        this.surface = voiceEvents$VoiceTrainingConsentSurface;
        this.from_state = voiceEvents$VoiceTrainingConsentState;
        this.to_state = voiceEvents$VoiceTrainingConsentState2;
        this.voice_session_id = str;
    }

    public /* synthetic */ VoiceEvents$TrainingConsentSettingsChanged(VoiceEvents$VoiceTrainingConsentSurface voiceEvents$VoiceTrainingConsentSurface, VoiceEvents$VoiceTrainingConsentState voiceEvents$VoiceTrainingConsentState, VoiceEvents$VoiceTrainingConsentState voiceEvents$VoiceTrainingConsentState2, String str, int i, mq5 mq5Var) {
        this(voiceEvents$VoiceTrainingConsentSurface, voiceEvents$VoiceTrainingConsentState, voiceEvents$VoiceTrainingConsentState2, (i & 8) != 0 ? null : str);
    }
}
