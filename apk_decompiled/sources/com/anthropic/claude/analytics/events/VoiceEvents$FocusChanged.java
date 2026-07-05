package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.fsh;
import defpackage.gid;
import defpackage.gvj;
import defpackage.h2j;
import defpackage.i2j;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mti;
import defpackage.onf;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0002IJB[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011B{\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\rHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\rHÆ\u0003¢\u0006\u0004\b$\u0010#Jv\u0010&\u001a\u00020%2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\rHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0018J\u0010\u0010)\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.J'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020%2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b:\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b;\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b=\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\b?\u0010\u001eR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\b@\u0010\u001eR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bB\u0010!R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010C\u001a\u0004\bD\u0010#R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\bE\u0010#R\u0014\u0010G\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u0018¨\u0006K"}, d2 = {"com/anthropic/claude/analytics/events/VoiceEvents$FocusChanged", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "voice_session_id", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceFocusResult;", "result", "", "duration_since_session_start_ms", "num_completed_turns", "", "had_focus_before", "", "active_playback_usages", "active_recording_sources", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceFocusResult;JJZLjava/util/List;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceFocusResult;JJZLjava/util/List;Ljava/util/List;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceFocusResult;", "component5", "()J", "component6", "component7", "()Z", "component8", "()Ljava/util/List;", "component9", "Lcom/anthropic/claude/analytics/events/VoiceEvents$FocusChanged;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceFocusResult;JJZLjava/util/List;Ljava/util/List;)Lcom/anthropic/claude/analytics/events/VoiceEvents$FocusChanged;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/VoiceEvents$FocusChanged;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "getVoice_session_id", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceFocusResult;", "getResult", "J", "getDuration_since_session_start_ms", "getNum_completed_turns", "Z", "getHad_focus_before", "Ljava/util/List;", "getActive_playback_usages", "getActive_recording_sources", "getEventName", "eventName", "Companion", "h2j", "i2j", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class VoiceEvents$FocusChanged implements AnalyticsEvent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final i2j Companion = new i2j();
    private final List<String> active_playback_usages;
    private final List<String> active_recording_sources;
    private final String conversation_uuid;
    private final long duration_since_session_start_ms;
    private final boolean had_focus_before;
    private final long num_completed_turns;
    private final String organization_uuid;
    private final VoiceEvents$VoiceFocusResult result;
    private final String voice_session_id;

    static {
        mti mtiVar = new mti(6);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, yb5.w(w1aVar, mtiVar), null, null, null, yb5.w(w1aVar, new mti(7)), yb5.w(w1aVar, new mti(8))};
    }

    public VoiceEvents$FocusChanged(String str, String str2, String str3, VoiceEvents$VoiceFocusResult voiceEvents$VoiceFocusResult, long j, long j2, boolean z, List<String> list, List<String> list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        voiceEvents$VoiceFocusResult.getClass();
        list.getClass();
        list2.getClass();
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.voice_session_id = str3;
        this.result = voiceEvents$VoiceFocusResult;
        this.duration_since_session_start_ms = j;
        this.num_completed_turns = j2;
        this.had_focus_before = z;
        this.active_playback_usages = list;
        this.active_recording_sources = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return VoiceEvents$VoiceFocusResult.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(srg.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new uo0(srg.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VoiceEvents$FocusChanged copy$default(VoiceEvents$FocusChanged voiceEvents$FocusChanged, String str, String str2, String str3, VoiceEvents$VoiceFocusResult voiceEvents$VoiceFocusResult, long j, long j2, boolean z, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceEvents$FocusChanged.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = voiceEvents$FocusChanged.conversation_uuid;
        }
        if ((i & 4) != 0) {
            str3 = voiceEvents$FocusChanged.voice_session_id;
        }
        if ((i & 8) != 0) {
            voiceEvents$VoiceFocusResult = voiceEvents$FocusChanged.result;
        }
        if ((i & 16) != 0) {
            j = voiceEvents$FocusChanged.duration_since_session_start_ms;
        }
        if ((i & 32) != 0) {
            j2 = voiceEvents$FocusChanged.num_completed_turns;
        }
        if ((i & 64) != 0) {
            z = voiceEvents$FocusChanged.had_focus_before;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            list = voiceEvents$FocusChanged.active_playback_usages;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            list2 = voiceEvents$FocusChanged.active_recording_sources;
        }
        List list3 = list2;
        boolean z2 = z;
        long j3 = j2;
        long j4 = j;
        String str4 = str3;
        VoiceEvents$VoiceFocusResult voiceEvents$VoiceFocusResult2 = voiceEvents$VoiceFocusResult;
        return voiceEvents$FocusChanged.copy(str, str2, str4, voiceEvents$VoiceFocusResult2, j4, j3, z2, list, list3);
    }

    public static final /* synthetic */ void write$Self$analytics(VoiceEvents$FocusChanged self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.q(serialDesc, 2, self.voice_session_id);
        output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.result);
        output.D(serialDesc, 4, self.duration_since_session_start_ms);
        output.D(serialDesc, 5, self.num_completed_turns);
        output.p(serialDesc, 6, self.had_focus_before);
        output.r(serialDesc, 7, (znf) kw9VarArr[7].getValue(), self.active_playback_usages);
        output.r(serialDesc, 8, (znf) kw9VarArr[8].getValue(), self.active_recording_sources);
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
    public final VoiceEvents$VoiceFocusResult getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getDuration_since_session_start_ms() {
        return this.duration_since_session_start_ms;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getNum_completed_turns() {
        return this.num_completed_turns;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getHad_focus_before() {
        return this.had_focus_before;
    }

    public final List<String> component8() {
        return this.active_playback_usages;
    }

    public final List<String> component9() {
        return this.active_recording_sources;
    }

    public final VoiceEvents$FocusChanged copy(String organization_uuid, String conversation_uuid, String voice_session_id, VoiceEvents$VoiceFocusResult result, long duration_since_session_start_ms, long num_completed_turns, boolean had_focus_before, List<String> active_playback_usages, List<String> active_recording_sources) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        voice_session_id.getClass();
        result.getClass();
        active_playback_usages.getClass();
        active_recording_sources.getClass();
        return new VoiceEvents$FocusChanged(organization_uuid, conversation_uuid, voice_session_id, result, duration_since_session_start_ms, num_completed_turns, had_focus_before, active_playback_usages, active_recording_sources);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceEvents$FocusChanged)) {
            return false;
        }
        VoiceEvents$FocusChanged voiceEvents$FocusChanged = (VoiceEvents$FocusChanged) other;
        return x44.r(this.organization_uuid, voiceEvents$FocusChanged.organization_uuid) && x44.r(this.conversation_uuid, voiceEvents$FocusChanged.conversation_uuid) && x44.r(this.voice_session_id, voiceEvents$FocusChanged.voice_session_id) && this.result == voiceEvents$FocusChanged.result && this.duration_since_session_start_ms == voiceEvents$FocusChanged.duration_since_session_start_ms && this.num_completed_turns == voiceEvents$FocusChanged.num_completed_turns && this.had_focus_before == voiceEvents$FocusChanged.had_focus_before && x44.r(this.active_playback_usages, voiceEvents$FocusChanged.active_playback_usages) && x44.r(this.active_recording_sources, voiceEvents$FocusChanged.active_recording_sources);
    }

    public final List<String> getActive_playback_usages() {
        return this.active_playback_usages;
    }

    public final List<String> getActive_recording_sources() {
        return this.active_recording_sources;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    public final long getDuration_since_session_start_ms() {
        return this.duration_since_session_start_ms;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "voice_focus_changed";
    }

    public final boolean getHad_focus_before() {
        return this.had_focus_before;
    }

    public final long getNum_completed_turns() {
        return this.num_completed_turns;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final VoiceEvents$VoiceFocusResult getResult() {
        return this.result;
    }

    public final String getVoice_session_id() {
        return this.voice_session_id;
    }

    public int hashCode() {
        return this.active_recording_sources.hashCode() + kgh.m(fsh.p(vb7.e(vb7.e((this.result.hashCode() + kgh.l(kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid), 31, this.voice_session_id)) * 31, 31, this.duration_since_session_start_ms), 31, this.num_completed_turns), 31, this.had_focus_before), 31, this.active_playback_usages);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        String str3 = this.voice_session_id;
        VoiceEvents$VoiceFocusResult voiceEvents$VoiceFocusResult = this.result;
        long j = this.duration_since_session_start_ms;
        long j2 = this.num_completed_turns;
        boolean z = this.had_focus_before;
        List<String> list = this.active_playback_usages;
        List<String> list2 = this.active_recording_sources;
        StringBuilder sbR = kgh.r("FocusChanged(organization_uuid=", str, ", conversation_uuid=", str2, ", voice_session_id=");
        sbR.append(str3);
        sbR.append(", result=");
        sbR.append(voiceEvents$VoiceFocusResult);
        sbR.append(", duration_since_session_start_ms=");
        sbR.append(j);
        ij0.u(j2, ", num_completed_turns=", ", had_focus_before=", sbR);
        sbR.append(z);
        sbR.append(", active_playback_usages=");
        sbR.append(list);
        sbR.append(", active_recording_sources=");
        return gid.q(sbR, list2, ")");
    }

    public /* synthetic */ VoiceEvents$FocusChanged(int i, String str, String str2, String str3, VoiceEvents$VoiceFocusResult voiceEvents$VoiceFocusResult, long j, long j2, boolean z, List list, List list2, vnf vnfVar) {
        if (511 != (i & 511)) {
            gvj.f(i, 511, h2j.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.voice_session_id = str3;
        this.result = voiceEvents$VoiceFocusResult;
        this.duration_since_session_start_ms = j;
        this.num_completed_turns = j2;
        this.had_focus_before = z;
        this.active_playback_usages = list;
        this.active_recording_sources = list2;
    }
}
