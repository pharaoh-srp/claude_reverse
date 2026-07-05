package com.anthropic.claude.analytics.events;

import defpackage.fsh;
import defpackage.gid;
import defpackage.grc;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.sq6;
import defpackage.v1j;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1j;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:;B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fBY\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0010\u0010$\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b$\u0010!JV\u0010%\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010!R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b4\u0010!R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b5\u0010!R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b6\u0010!R\u0014\u00108\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u001d¨\u0006<"}, d2 = {"com/anthropic/claude/analytics/events/VoiceEvents$AudioEffectsCapability", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "conversation_uuid", "voice_session_id", "", "aec_available", "aec_enabled", "ns_available", "ns_enabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZ)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZLvnf;)V", "Lcom/anthropic/claude/analytics/events/VoiceEvents$AudioEffectsCapability;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/VoiceEvents$AudioEffectsCapability;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZ)Lcom/anthropic/claude/analytics/events/VoiceEvents$AudioEffectsCapability;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getConversation_uuid", "getVoice_session_id", "Z", "getAec_available", "getAec_enabled", "getNs_available", "getNs_enabled", "getEventName", "eventName", "Companion", "v1j", "w1j", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class VoiceEvents$AudioEffectsCapability implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final w1j Companion = new w1j();
    private final boolean aec_available;
    private final boolean aec_enabled;
    private final String conversation_uuid;
    private final boolean ns_available;
    private final boolean ns_enabled;
    private final String organization_uuid;
    private final String voice_session_id;

    public /* synthetic */ VoiceEvents$AudioEffectsCapability(int i, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, vnf vnfVar) {
        if (127 != (i & 127)) {
            gvj.f(i, 127, v1j.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.voice_session_id = str3;
        this.aec_available = z;
        this.aec_enabled = z2;
        this.ns_available = z3;
        this.ns_enabled = z4;
    }

    public static /* synthetic */ VoiceEvents$AudioEffectsCapability copy$default(VoiceEvents$AudioEffectsCapability voiceEvents$AudioEffectsCapability, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceEvents$AudioEffectsCapability.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = voiceEvents$AudioEffectsCapability.conversation_uuid;
        }
        if ((i & 4) != 0) {
            str3 = voiceEvents$AudioEffectsCapability.voice_session_id;
        }
        if ((i & 8) != 0) {
            z = voiceEvents$AudioEffectsCapability.aec_available;
        }
        if ((i & 16) != 0) {
            z2 = voiceEvents$AudioEffectsCapability.aec_enabled;
        }
        if ((i & 32) != 0) {
            z3 = voiceEvents$AudioEffectsCapability.ns_available;
        }
        if ((i & 64) != 0) {
            z4 = voiceEvents$AudioEffectsCapability.ns_enabled;
        }
        boolean z5 = z3;
        boolean z6 = z4;
        boolean z7 = z2;
        String str4 = str3;
        return voiceEvents$AudioEffectsCapability.copy(str, str2, str4, z, z7, z5, z6);
    }

    public static final /* synthetic */ void write$Self$analytics(VoiceEvents$AudioEffectsCapability self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.conversation_uuid);
        output.q(serialDesc, 2, self.voice_session_id);
        output.p(serialDesc, 3, self.aec_available);
        output.p(serialDesc, 4, self.aec_enabled);
        output.p(serialDesc, 5, self.ns_available);
        output.p(serialDesc, 6, self.ns_enabled);
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
    public final boolean getAec_available() {
        return this.aec_available;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getAec_enabled() {
        return this.aec_enabled;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getNs_available() {
        return this.ns_available;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getNs_enabled() {
        return this.ns_enabled;
    }

    public final VoiceEvents$AudioEffectsCapability copy(String organization_uuid, String conversation_uuid, String voice_session_id, boolean aec_available, boolean aec_enabled, boolean ns_available, boolean ns_enabled) {
        organization_uuid.getClass();
        conversation_uuid.getClass();
        voice_session_id.getClass();
        return new VoiceEvents$AudioEffectsCapability(organization_uuid, conversation_uuid, voice_session_id, aec_available, aec_enabled, ns_available, ns_enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceEvents$AudioEffectsCapability)) {
            return false;
        }
        VoiceEvents$AudioEffectsCapability voiceEvents$AudioEffectsCapability = (VoiceEvents$AudioEffectsCapability) other;
        return x44.r(this.organization_uuid, voiceEvents$AudioEffectsCapability.organization_uuid) && x44.r(this.conversation_uuid, voiceEvents$AudioEffectsCapability.conversation_uuid) && x44.r(this.voice_session_id, voiceEvents$AudioEffectsCapability.voice_session_id) && this.aec_available == voiceEvents$AudioEffectsCapability.aec_available && this.aec_enabled == voiceEvents$AudioEffectsCapability.aec_enabled && this.ns_available == voiceEvents$AudioEffectsCapability.ns_available && this.ns_enabled == voiceEvents$AudioEffectsCapability.ns_enabled;
    }

    public final boolean getAec_available() {
        return this.aec_available;
    }

    public final boolean getAec_enabled() {
        return this.aec_enabled;
    }

    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "voice_audio_effects_capability";
    }

    public final boolean getNs_available() {
        return this.ns_available;
    }

    public final boolean getNs_enabled() {
        return this.ns_enabled;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getVoice_session_id() {
        return this.voice_session_id;
    }

    public int hashCode() {
        return Boolean.hashCode(this.ns_enabled) + fsh.p(fsh.p(fsh.p(kgh.l(kgh.l(this.organization_uuid.hashCode() * 31, 31, this.conversation_uuid), 31, this.voice_session_id), 31, this.aec_available), 31, this.aec_enabled), 31, this.ns_available);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.conversation_uuid;
        String str3 = this.voice_session_id;
        boolean z = this.aec_available;
        boolean z2 = this.aec_enabled;
        boolean z3 = this.ns_available;
        boolean z4 = this.ns_enabled;
        StringBuilder sbR = kgh.r("AudioEffectsCapability(organization_uuid=", str, ", conversation_uuid=", str2, ", voice_session_id=");
        gid.t(sbR, str3, ", aec_available=", z, ", aec_enabled=");
        ij0.A(sbR, z2, ", ns_available=", z3, ", ns_enabled=");
        return sq6.v(")", sbR, z4);
    }

    public VoiceEvents$AudioEffectsCapability(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        grc.B(str, str2, str3);
        this.organization_uuid = str;
        this.conversation_uuid = str2;
        this.voice_session_id = str3;
        this.aec_available = z;
        this.aec_enabled = z2;
        this.ns_available = z3;
        this.ns_enabled = z4;
    }
}
