package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.mti;
import defpackage.onf;
import defpackage.p2j;
import defpackage.q2j;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 Q2\u00020\u0001:\u0002RSBo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014B\u0091\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001bJ\u0010\u0010&\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001bJ\u008c\u0001\u0010,\u001a\u00020+2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u001bJ\u0010\u0010/\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u00020\u00102\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b3\u00104J'\u0010=\u001a\u00020:2\u0006\u00105\u001a\u00020+2\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0001¢\u0006\u0004\b;\u0010<R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010>\u001a\u0004\b?\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010>\u001a\u0004\b@\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\bA\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010B\u001a\u0004\bC\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010D\u001a\u0004\bE\u0010!R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\bF\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\bG\u0010\u001bR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\bH\u0010\u001bR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\bI\u0010\u001bR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010J\u001a\u0004\bK\u0010'R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010L\u001a\u0004\bM\u0010)R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010>\u001a\u0004\bN\u0010\u001bR\u0014\u0010P\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010\u001b¨\u0006T"}, d2 = {"com/anthropic/claude/analytics/events/VoiceEvents$SessionStarted", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "voice_session_id", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;", "activation_mode", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceEntrySource;", "entry_source", "selected_voice", "playback_speed", "input_type", "output_type", "", "connect_duration_ms", "", "had_audio_focus", "session_impl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceEntrySource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Boolean;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceEntrySource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Boolean;Ljava/lang/String;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;", "component5", "()Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceEntrySource;", "component6", "component7", "component8", "component9", "component10", "()J", "component11", "()Ljava/lang/Boolean;", "component12", "Lcom/anthropic/claude/analytics/events/VoiceEvents$SessionStarted;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceEntrySource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Boolean;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/VoiceEvents$SessionStarted;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/VoiceEvents$SessionStarted;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "getVoice_session_id", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;", "getActivation_mode", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceEntrySource;", "getEntry_source", "getSelected_voice", "getPlayback_speed", "getInput_type", "getOutput_type", "J", "getConnect_duration_ms", "Ljava/lang/Boolean;", "getHad_audio_focus", "getSession_impl", "getEventName", "eventName", "Companion", "p2j", "q2j", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class VoiceEvents$SessionStarted implements AnalyticsEvent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final q2j Companion = new q2j();
    private final VoiceEvents$VoiceActivationMode activation_mode;
    private final long connect_duration_ms;
    private final String conversation_uuid;
    private final VoiceEvents$VoiceEntrySource entry_source;
    private final Boolean had_audio_focus;
    private final String input_type;
    private final String organization_uuid;
    private final String output_type;
    private final String playback_speed;
    private final String selected_voice;
    private final String session_impl;
    private final String voice_session_id;

    static {
        mti mtiVar = new mti(13);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, yb5.w(w1aVar, mtiVar), yb5.w(w1aVar, new mti(14)), null, null, null, null, null, null, null};
    }

    public /* synthetic */ VoiceEvents$SessionStarted(int i, String str, String str2, String str3, VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode, VoiceEvents$VoiceEntrySource voiceEvents$VoiceEntrySource, String str4, String str5, String str6, String str7, long j, Boolean bool, String str8, vnf vnfVar) {
        if (1023 != (i & 1023)) {
            gvj.f(i, 1023, p2j.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.voice_session_id = str3;
        this.activation_mode = voiceEvents$VoiceActivationMode;
        this.entry_source = voiceEvents$VoiceEntrySource;
        this.selected_voice = str4;
        this.playback_speed = str5;
        this.input_type = str6;
        this.output_type = str7;
        this.connect_duration_ms = j;
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
            this.had_audio_focus = null;
        } else {
            this.had_audio_focus = bool;
        }
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 0) {
            this.session_impl = null;
        } else {
            this.session_impl = str8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return VoiceEvents$VoiceActivationMode.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return VoiceEvents$VoiceEntrySource.Companion.serializer();
    }

    public static /* synthetic */ VoiceEvents$SessionStarted copy$default(VoiceEvents$SessionStarted voiceEvents$SessionStarted, String str, String str2, String str3, VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode, VoiceEvents$VoiceEntrySource voiceEvents$VoiceEntrySource, String str4, String str5, String str6, String str7, long j, Boolean bool, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceEvents$SessionStarted.organization_uuid;
        }
        return voiceEvents$SessionStarted.copy(str, (i & 2) != 0 ? voiceEvents$SessionStarted.conversation_uuid : str2, (i & 4) != 0 ? voiceEvents$SessionStarted.voice_session_id : str3, (i & 8) != 0 ? voiceEvents$SessionStarted.activation_mode : voiceEvents$VoiceActivationMode, (i & 16) != 0 ? voiceEvents$SessionStarted.entry_source : voiceEvents$VoiceEntrySource, (i & 32) != 0 ? voiceEvents$SessionStarted.selected_voice : str4, (i & 64) != 0 ? voiceEvents$SessionStarted.playback_speed : str5, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? voiceEvents$SessionStarted.input_type : str6, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? voiceEvents$SessionStarted.output_type : str7, (i & 512) != 0 ? voiceEvents$SessionStarted.connect_duration_ms : j, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? voiceEvents$SessionStarted.had_audio_focus : bool, (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? voiceEvents$SessionStarted.session_impl : str8);
    }

    public static final /* synthetic */ void write$Self$analytics(VoiceEvents$SessionStarted self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.q(serialDesc, 2, self.voice_session_id);
        output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.activation_mode);
        output.r(serialDesc, 4, (znf) kw9VarArr[4].getValue(), self.entry_source);
        output.q(serialDesc, 5, self.selected_voice);
        output.q(serialDesc, 6, self.playback_speed);
        output.q(serialDesc, 7, self.input_type);
        output.q(serialDesc, 8, self.output_type);
        output.D(serialDesc, 9, self.connect_duration_ms);
        if (output.E(serialDesc) || self.had_audio_focus != null) {
            output.B(serialDesc, 10, zt1.a, self.had_audio_focus);
        }
        if (!output.E(serialDesc) && self.session_impl == null) {
            return;
        }
        output.B(serialDesc, 11, srg.a, self.session_impl);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getConnect_duration_ms() {
        return this.connect_duration_ms;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getHad_audio_focus() {
        return this.had_audio_focus;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSession_impl() {
        return this.session_impl;
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
    public final VoiceEvents$VoiceActivationMode getActivation_mode() {
        return this.activation_mode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final VoiceEvents$VoiceEntrySource getEntry_source() {
        return this.entry_source;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSelected_voice() {
        return this.selected_voice;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPlayback_speed() {
        return this.playback_speed;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getInput_type() {
        return this.input_type;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getOutput_type() {
        return this.output_type;
    }

    public final VoiceEvents$SessionStarted copy(String organization_uuid, String conversation_uuid, String voice_session_id, VoiceEvents$VoiceActivationMode activation_mode, VoiceEvents$VoiceEntrySource entry_source, String selected_voice, String playback_speed, String input_type, String output_type, long connect_duration_ms, Boolean had_audio_focus, String session_impl) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        voice_session_id.getClass();
        activation_mode.getClass();
        entry_source.getClass();
        selected_voice.getClass();
        playback_speed.getClass();
        input_type.getClass();
        output_type.getClass();
        return new VoiceEvents$SessionStarted(organization_uuid, conversation_uuid, voice_session_id, activation_mode, entry_source, selected_voice, playback_speed, input_type, output_type, connect_duration_ms, had_audio_focus, session_impl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceEvents$SessionStarted)) {
            return false;
        }
        VoiceEvents$SessionStarted voiceEvents$SessionStarted = (VoiceEvents$SessionStarted) other;
        return x44.r(this.organization_uuid, voiceEvents$SessionStarted.organization_uuid) && x44.r(this.conversation_uuid, voiceEvents$SessionStarted.conversation_uuid) && x44.r(this.voice_session_id, voiceEvents$SessionStarted.voice_session_id) && this.activation_mode == voiceEvents$SessionStarted.activation_mode && this.entry_source == voiceEvents$SessionStarted.entry_source && x44.r(this.selected_voice, voiceEvents$SessionStarted.selected_voice) && x44.r(this.playback_speed, voiceEvents$SessionStarted.playback_speed) && x44.r(this.input_type, voiceEvents$SessionStarted.input_type) && x44.r(this.output_type, voiceEvents$SessionStarted.output_type) && this.connect_duration_ms == voiceEvents$SessionStarted.connect_duration_ms && x44.r(this.had_audio_focus, voiceEvents$SessionStarted.had_audio_focus) && x44.r(this.session_impl, voiceEvents$SessionStarted.session_impl);
    }

    public final VoiceEvents$VoiceActivationMode getActivation_mode() {
        return this.activation_mode;
    }

    public final long getConnect_duration_ms() {
        return this.connect_duration_ms;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    public final VoiceEvents$VoiceEntrySource getEntry_source() {
        return this.entry_source;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "voice_session_started";
    }

    public final Boolean getHad_audio_focus() {
        return this.had_audio_focus;
    }

    public final String getInput_type() {
        return this.input_type;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getOutput_type() {
        return this.output_type;
    }

    public final String getPlayback_speed() {
        return this.playback_speed;
    }

    public final String getSelected_voice() {
        return this.selected_voice;
    }

    public final String getSession_impl() {
        return this.session_impl;
    }

    public final String getVoice_session_id() {
        return this.voice_session_id;
    }

    public int hashCode() {
        int iE = vb7.e(kgh.l(kgh.l(kgh.l(kgh.l((this.entry_source.hashCode() + ((this.activation_mode.hashCode() + kgh.l(kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid), 31, this.voice_session_id)) * 31)) * 31, 31, this.selected_voice), 31, this.playback_speed), 31, this.input_type), 31, this.output_type), 31, this.connect_duration_ms);
        Boolean bool = this.had_audio_focus;
        int iHashCode = (iE + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.session_impl;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        String str3 = this.voice_session_id;
        VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode = this.activation_mode;
        VoiceEvents$VoiceEntrySource voiceEvents$VoiceEntrySource = this.entry_source;
        String str4 = this.selected_voice;
        String str5 = this.playback_speed;
        String str6 = this.input_type;
        String str7 = this.output_type;
        long j = this.connect_duration_ms;
        Boolean bool = this.had_audio_focus;
        String str8 = this.session_impl;
        StringBuilder sbR = kgh.r("SessionStarted(organization_uuid=", str, ", conversation_uuid=", str2, ", voice_session_id=");
        sbR.append(str3);
        sbR.append(", activation_mode=");
        sbR.append(voiceEvents$VoiceActivationMode);
        sbR.append(", entry_source=");
        sbR.append(voiceEvents$VoiceEntrySource);
        sbR.append(", selected_voice=");
        sbR.append(str4);
        sbR.append(", playback_speed=");
        kgh.u(sbR, str5, ", input_type=", str6, ", output_type=");
        sbR.append(str7);
        sbR.append(", connect_duration_ms=");
        sbR.append(j);
        sbR.append(", had_audio_focus=");
        sbR.append(bool);
        sbR.append(", session_impl=");
        sbR.append(str8);
        sbR.append(")");
        return sbR.toString();
    }

    public VoiceEvents$SessionStarted(String str, String str2, String str3, VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode, VoiceEvents$VoiceEntrySource voiceEvents$VoiceEntrySource, String str4, String str5, String str6, String str7, long j, Boolean bool, String str8) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        voiceEvents$VoiceActivationMode.getClass();
        voiceEvents$VoiceEntrySource.getClass();
        ij0.z(str4, str5, str6, str7);
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.voice_session_id = str3;
        this.activation_mode = voiceEvents$VoiceActivationMode;
        this.entry_source = voiceEvents$VoiceEntrySource;
        this.selected_voice = str4;
        this.playback_speed = str5;
        this.input_type = str6;
        this.output_type = str7;
        this.connect_duration_ms = j;
        this.had_audio_focus = bool;
        this.session_impl = str8;
    }

    public /* synthetic */ VoiceEvents$SessionStarted(String str, String str2, String str3, VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode, VoiceEvents$VoiceEntrySource voiceEvents$VoiceEntrySource, String str4, String str5, String str6, String str7, long j, Boolean bool, String str8, int i, mq5 mq5Var) {
        this(str, str2, str3, voiceEvents$VoiceActivationMode, voiceEvents$VoiceEntrySource, str4, str5, str6, str7, j, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? null : bool, (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? null : str8);
    }
}
