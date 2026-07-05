package com.anthropic.claude.bell;

import com.anthropic.claude.analytics.events.VoiceEvents$VoiceActivationMode;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.OrganizationId;
import com.anthropic.claude.types.strings.VoiceSessionId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.c5j;
import defpackage.fkc;
import defpackage.gvj;
import defpackage.i5j;
import defpackage.ij0;
import defpackage.j5j;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.poi;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.vs2;
import defpackage.w1a;
import defpackage.x44;
import defpackage.xka;
import defpackage.y6a;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 K2\u00020\u0001:\u0002LMB_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0012\u0010\u0013B{\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b$\u0010\u001aJ\u0010\u0010%\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b)\u0010(Jx\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b-\u0010\u001aJ\u0010\u0010.\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103J'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001¢\u0006\u0004\b:\u0010;R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b?\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b@\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010A\u001a\u0004\bB\u0010!R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010A\u001a\u0004\bC\u0010!R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\bD\u0010\u001aR\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\bE\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010F\u001a\u0004\bG\u0010&R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010H\u001a\u0004\bI\u0010(R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010H\u001a\u0004\bJ\u0010(¨\u0006N"}, d2 = {"Lcom/anthropic/claude/bell/VoiceSessionSummary;", "", "Lcom/anthropic/claude/types/strings/OrganizationId;", "organizationId", "Lcom/anthropic/claude/types/strings/ChatId;", "conversationId", "Lcom/anthropic/claude/types/strings/VoiceSessionId;", "voiceSessionId", "", "sessionDurationMs", "numTurns", "", "inputType", "outputType", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;", "activationMode", "numFocusLosses", "focusTransientLossTotalMs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;Ljava/lang/Long;Ljava/lang/Long;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;Ljava/lang/Long;Ljava/lang/Long;Lvnf;Lmq5;)V", "component1-XjkXN6I", "()Ljava/lang/String;", "component1", "component2-RjYBDck", "component2", "component3-5I1JifQ", "component3", "component4", "()J", "component5", "component6", "component7", "component8", "()Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;", "component9", "()Ljava/lang/Long;", "component10", "copy-f_qYRN4", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;Ljava/lang/Long;Ljava/lang/Long;)Lcom/anthropic/claude/bell/VoiceSessionSummary;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$bell", "(Lcom/anthropic/claude/bell/VoiceSessionSummary;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getOrganizationId-XjkXN6I", "getConversationId-RjYBDck", "getVoiceSessionId-5I1JifQ", "J", "getSessionDurationMs", "getNumTurns", "getInputType", "getOutputType", "Lcom/anthropic/claude/analytics/events/VoiceEvents$VoiceActivationMode;", "getActivationMode", "Ljava/lang/Long;", "getNumFocusLosses", "getFocusTransientLossTotalMs", "Companion", "i5j", "j5j", "bell"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class VoiceSessionSummary {
    public static final int $stable = 0;
    private final VoiceEvents$VoiceActivationMode activationMode;
    private final String conversationId;
    private final Long focusTransientLossTotalMs;
    private final String inputType;
    private final Long numFocusLosses;
    private final long numTurns;
    private final String organizationId;
    private final String outputType;
    private final long sessionDurationMs;
    private final String voiceSessionId;
    public static final j5j Companion = new j5j();
    private static final kw9[] $childSerializers = {null, null, null, null, null, null, null, yb5.w(w1a.F, new poi(3)), null, null};

    private /* synthetic */ VoiceSessionSummary(int i, String str, String str2, String str3, long j, long j2, String str4, String str5, VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode, Long l, Long l2, vnf vnfVar) {
        if (255 != (i & 255)) {
            gvj.f(i, 255, i5j.a.getDescriptor());
            throw null;
        }
        this.organizationId = str;
        this.conversationId = str2;
        this.voiceSessionId = str3;
        this.sessionDurationMs = j;
        this.numTurns = j2;
        this.inputType = str4;
        this.outputType = str5;
        this.activationMode = voiceEvents$VoiceActivationMode;
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.numFocusLosses = null;
        } else {
            this.numFocusLosses = l;
        }
        if ((i & 512) == 0) {
            this.focusTransientLossTotalMs = null;
        } else {
            this.focusTransientLossTotalMs = l2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return VoiceEvents$VoiceActivationMode.Companion.serializer();
    }

    /* JADX INFO: renamed from: copy-f_qYRN4$default, reason: not valid java name */
    public static /* synthetic */ VoiceSessionSummary m557copyf_qYRN4$default(VoiceSessionSummary voiceSessionSummary, String str, String str2, String str3, long j, long j2, String str4, String str5, VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceSessionSummary.organizationId;
        }
        if ((i & 2) != 0) {
            str2 = voiceSessionSummary.conversationId;
        }
        if ((i & 4) != 0) {
            str3 = voiceSessionSummary.voiceSessionId;
        }
        if ((i & 8) != 0) {
            j = voiceSessionSummary.sessionDurationMs;
        }
        if ((i & 16) != 0) {
            j2 = voiceSessionSummary.numTurns;
        }
        if ((i & 32) != 0) {
            str4 = voiceSessionSummary.inputType;
        }
        if ((i & 64) != 0) {
            str5 = voiceSessionSummary.outputType;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            voiceEvents$VoiceActivationMode = voiceSessionSummary.activationMode;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            l = voiceSessionSummary.numFocusLosses;
        }
        if ((i & 512) != 0) {
            l2 = voiceSessionSummary.focusTransientLossTotalMs;
        }
        Long l3 = l2;
        VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode2 = voiceEvents$VoiceActivationMode;
        String str6 = str4;
        long j3 = j2;
        long j4 = j;
        String str7 = str3;
        return voiceSessionSummary.m561copyf_qYRN4(str, str2, str7, j4, j3, str6, str5, voiceEvents$VoiceActivationMode2, l, l3);
    }

    public static final /* synthetic */ void write$Self$bell(VoiceSessionSummary self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, fkc.a, OrganizationId.m1065boximpl(self.organizationId));
        output.r(serialDesc, 1, vs2.a, ChatId.m978boximpl(self.conversationId));
        output.r(serialDesc, 2, c5j.a, VoiceSessionId.m1164boximpl(self.voiceSessionId));
        output.D(serialDesc, 3, self.sessionDurationMs);
        output.D(serialDesc, 4, self.numTurns);
        output.q(serialDesc, 5, self.inputType);
        output.q(serialDesc, 6, self.outputType);
        output.r(serialDesc, 7, (znf) kw9VarArr[7].getValue(), self.activationMode);
        if (output.E(serialDesc) || self.numFocusLosses != null) {
            output.B(serialDesc, 8, xka.a, self.numFocusLosses);
        }
        if (!output.E(serialDesc) && self.focusTransientLossTotalMs == null) {
            return;
        }
        output.B(serialDesc, 9, xka.a, self.focusTransientLossTotalMs);
    }

    /* JADX INFO: renamed from: component1-XjkXN6I, reason: not valid java name and from getter */
    public final String getOrganizationId() {
        return this.organizationId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getFocusTransientLossTotalMs() {
        return this.focusTransientLossTotalMs;
    }

    /* JADX INFO: renamed from: component2-RjYBDck, reason: not valid java name and from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    /* JADX INFO: renamed from: component3-5I1JifQ, reason: not valid java name and from getter */
    public final String getVoiceSessionId() {
        return this.voiceSessionId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getSessionDurationMs() {
        return this.sessionDurationMs;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getNumTurns() {
        return this.numTurns;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getInputType() {
        return this.inputType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOutputType() {
        return this.outputType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final VoiceEvents$VoiceActivationMode getActivationMode() {
        return this.activationMode;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getNumFocusLosses() {
        return this.numFocusLosses;
    }

    /* JADX INFO: renamed from: copy-f_qYRN4, reason: not valid java name */
    public final VoiceSessionSummary m561copyf_qYRN4(String organizationId, String conversationId, String voiceSessionId, long sessionDurationMs, long numTurns, String inputType, String outputType, VoiceEvents$VoiceActivationMode activationMode, Long numFocusLosses, Long focusTransientLossTotalMs) {
        y6a.s(organizationId, conversationId, voiceSessionId, inputType, outputType);
        activationMode.getClass();
        return new VoiceSessionSummary(organizationId, conversationId, voiceSessionId, sessionDurationMs, numTurns, inputType, outputType, activationMode, numFocusLosses, focusTransientLossTotalMs, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceSessionSummary)) {
            return false;
        }
        VoiceSessionSummary voiceSessionSummary = (VoiceSessionSummary) other;
        return OrganizationId.m1068equalsimpl0(this.organizationId, voiceSessionSummary.organizationId) && ChatId.m981equalsimpl0(this.conversationId, voiceSessionSummary.conversationId) && VoiceSessionId.m1167equalsimpl0(this.voiceSessionId, voiceSessionSummary.voiceSessionId) && this.sessionDurationMs == voiceSessionSummary.sessionDurationMs && this.numTurns == voiceSessionSummary.numTurns && x44.r(this.inputType, voiceSessionSummary.inputType) && x44.r(this.outputType, voiceSessionSummary.outputType) && this.activationMode == voiceSessionSummary.activationMode && x44.r(this.numFocusLosses, voiceSessionSummary.numFocusLosses) && x44.r(this.focusTransientLossTotalMs, voiceSessionSummary.focusTransientLossTotalMs);
    }

    public final VoiceEvents$VoiceActivationMode getActivationMode() {
        return this.activationMode;
    }

    /* JADX INFO: renamed from: getConversationId-RjYBDck, reason: not valid java name */
    public final String m562getConversationIdRjYBDck() {
        return this.conversationId;
    }

    public final Long getFocusTransientLossTotalMs() {
        return this.focusTransientLossTotalMs;
    }

    public final String getInputType() {
        return this.inputType;
    }

    public final Long getNumFocusLosses() {
        return this.numFocusLosses;
    }

    public final long getNumTurns() {
        return this.numTurns;
    }

    /* JADX INFO: renamed from: getOrganizationId-XjkXN6I, reason: not valid java name */
    public final String m563getOrganizationIdXjkXN6I() {
        return this.organizationId;
    }

    public final String getOutputType() {
        return this.outputType;
    }

    public final long getSessionDurationMs() {
        return this.sessionDurationMs;
    }

    /* JADX INFO: renamed from: getVoiceSessionId-5I1JifQ, reason: not valid java name */
    public final String m564getVoiceSessionId5I1JifQ() {
        return this.voiceSessionId;
    }

    public int hashCode() {
        int iHashCode = (this.activationMode.hashCode() + kgh.l(kgh.l(vb7.e(vb7.e((VoiceSessionId.m1168hashCodeimpl(this.voiceSessionId) + ((ChatId.m982hashCodeimpl(this.conversationId) + (OrganizationId.m1069hashCodeimpl(this.organizationId) * 31)) * 31)) * 31, 31, this.sessionDurationMs), 31, this.numTurns), 31, this.inputType), 31, this.outputType)) * 31;
        Long l = this.numFocusLosses;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.focusTransientLossTotalMs;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        String strM1070toStringimpl = OrganizationId.m1070toStringimpl(this.organizationId);
        String strM983toStringimpl = ChatId.m983toStringimpl(this.conversationId);
        String strM1169toStringimpl = VoiceSessionId.m1169toStringimpl(this.voiceSessionId);
        long j = this.sessionDurationMs;
        long j2 = this.numTurns;
        String str = this.inputType;
        String str2 = this.outputType;
        VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode = this.activationMode;
        Long l = this.numFocusLosses;
        Long l2 = this.focusTransientLossTotalMs;
        StringBuilder sbR = kgh.r("VoiceSessionSummary(organizationId=", strM1070toStringimpl, ", conversationId=", strM983toStringimpl, ", voiceSessionId=");
        sbR.append(strM1169toStringimpl);
        sbR.append(", sessionDurationMs=");
        sbR.append(j);
        ij0.u(j2, ", numTurns=", ", inputType=", sbR);
        kgh.u(sbR, str, ", outputType=", str2, ", activationMode=");
        sbR.append(voiceEvents$VoiceActivationMode);
        sbR.append(", numFocusLosses=");
        sbR.append(l);
        sbR.append(", focusTransientLossTotalMs=");
        sbR.append(l2);
        sbR.append(")");
        return sbR.toString();
    }

    private VoiceSessionSummary(String str, String str2, String str3, long j, long j2, String str4, String str5, VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode, Long l, Long l2) {
        y6a.s(str, str2, str3, str4, str5);
        voiceEvents$VoiceActivationMode.getClass();
        this.organizationId = str;
        this.conversationId = str2;
        this.voiceSessionId = str3;
        this.sessionDurationMs = j;
        this.numTurns = j2;
        this.inputType = str4;
        this.outputType = str5;
        this.activationMode = voiceEvents$VoiceActivationMode;
        this.numFocusLosses = l;
        this.focusTransientLossTotalMs = l2;
    }

    public /* synthetic */ VoiceSessionSummary(String str, String str2, String str3, long j, long j2, String str4, String str5, VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode, Long l, Long l2, mq5 mq5Var) {
        this(str, str2, str3, j, j2, str4, str5, voiceEvents$VoiceActivationMode, l, l2);
    }

    public /* synthetic */ VoiceSessionSummary(int i, String str, String str2, String str3, long j, long j2, String str4, String str5, VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode, Long l, Long l2, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, str3, j, j2, str4, str5, voiceEvents$VoiceActivationMode, l, l2, vnfVar);
    }

    public /* synthetic */ VoiceSessionSummary(String str, String str2, String str3, long j, long j2, String str4, String str5, VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode, Long l, Long l2, int i, mq5 mq5Var) {
        this(str, str2, str3, j, j2, str4, str5, voiceEvents$VoiceActivationMode, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : l, (i & 512) != 0 ? null : l2, null);
    }
}
