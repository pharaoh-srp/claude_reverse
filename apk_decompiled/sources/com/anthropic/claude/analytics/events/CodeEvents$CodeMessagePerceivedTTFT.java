package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.fs3;
import defpackage.fsh;
import defpackage.gs3;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.xka;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002ABB[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eBg\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010%J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001fJj\u0010*\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u00020\u00062\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b\u0007\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b9\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b:\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b;\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b<\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b=\u0010\u001fR\u0014\u0010?\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u001f¨\u0006C"}, d2 = {"com/anthropic/claude/analytics/events/CodeEvents$CodeMessagePerceivedTTFT", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "session_id", "", "ttft_ms", "", "is_new_session", "time_to_request_ms", "surface", "session_type", "time_in_background_ms", "user_message_uuid", "<init>", "(Ljava/lang/String;JZLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;JZLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/CodeEvents$CodeMessagePerceivedTTFT;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/CodeEvents$CodeMessagePerceivedTTFT;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "()Z", "component4", "()Ljava/lang/Long;", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;JZLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/CodeEvents$CodeMessagePerceivedTTFT;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSession_id", "J", "getTtft_ms", "Z", "Ljava/lang/Long;", "getTime_to_request_ms", "getSurface", "getSession_type", "getTime_in_background_ms", "getUser_message_uuid", "getEventName", "eventName", "Companion", "fs3", "gs3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CodeEvents$CodeMessagePerceivedTTFT implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final gs3 Companion = new gs3();
    private final boolean is_new_session;
    private final String session_id;
    private final String session_type;
    private final String surface;
    private final Long time_in_background_ms;
    private final Long time_to_request_ms;
    private final long ttft_ms;
    private final String user_message_uuid;

    public /* synthetic */ CodeEvents$CodeMessagePerceivedTTFT(int i, String str, long j, boolean z, Long l, String str2, String str3, Long l2, String str4, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, fs3.a.getDescriptor());
            throw null;
        }
        this.session_id = str;
        this.ttft_ms = j;
        this.is_new_session = z;
        if ((i & 8) == 0) {
            this.time_to_request_ms = null;
        } else {
            this.time_to_request_ms = l;
        }
        if ((i & 16) == 0) {
            this.surface = null;
        } else {
            this.surface = str2;
        }
        if ((i & 32) == 0) {
            this.session_type = null;
        } else {
            this.session_type = str3;
        }
        if ((i & 64) == 0) {
            this.time_in_background_ms = null;
        } else {
            this.time_in_background_ms = l2;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.user_message_uuid = null;
        } else {
            this.user_message_uuid = str4;
        }
    }

    public static /* synthetic */ CodeEvents$CodeMessagePerceivedTTFT copy$default(CodeEvents$CodeMessagePerceivedTTFT codeEvents$CodeMessagePerceivedTTFT, String str, long j, boolean z, Long l, String str2, String str3, Long l2, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = codeEvents$CodeMessagePerceivedTTFT.session_id;
        }
        if ((i & 2) != 0) {
            j = codeEvents$CodeMessagePerceivedTTFT.ttft_ms;
        }
        if ((i & 4) != 0) {
            z = codeEvents$CodeMessagePerceivedTTFT.is_new_session;
        }
        if ((i & 8) != 0) {
            l = codeEvents$CodeMessagePerceivedTTFT.time_to_request_ms;
        }
        if ((i & 16) != 0) {
            str2 = codeEvents$CodeMessagePerceivedTTFT.surface;
        }
        if ((i & 32) != 0) {
            str3 = codeEvents$CodeMessagePerceivedTTFT.session_type;
        }
        if ((i & 64) != 0) {
            l2 = codeEvents$CodeMessagePerceivedTTFT.time_in_background_ms;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            str4 = codeEvents$CodeMessagePerceivedTTFT.user_message_uuid;
        }
        Long l3 = l2;
        String str5 = str4;
        return codeEvents$CodeMessagePerceivedTTFT.copy(str, j, z, l, str2, str3, l3, str5);
    }

    public static final /* synthetic */ void write$Self$analytics(CodeEvents$CodeMessagePerceivedTTFT self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.session_id);
        output.D(serialDesc, 1, self.ttft_ms);
        output.p(serialDesc, 2, self.is_new_session);
        if (output.E(serialDesc) || self.time_to_request_ms != null) {
            output.B(serialDesc, 3, xka.a, self.time_to_request_ms);
        }
        if (output.E(serialDesc) || self.surface != null) {
            output.B(serialDesc, 4, srg.a, self.surface);
        }
        if (output.E(serialDesc) || self.session_type != null) {
            output.B(serialDesc, 5, srg.a, self.session_type);
        }
        if (output.E(serialDesc) || self.time_in_background_ms != null) {
            output.B(serialDesc, 6, xka.a, self.time_in_background_ms);
        }
        if (!output.E(serialDesc) && self.user_message_uuid == null) {
            return;
        }
        output.B(serialDesc, 7, srg.a, self.user_message_uuid);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSession_id() {
        return this.session_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTtft_ms() {
        return this.ttft_ms;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIs_new_session() {
        return this.is_new_session;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getTime_to_request_ms() {
        return this.time_to_request_ms;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSurface() {
        return this.surface;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSession_type() {
        return this.session_type;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getTime_in_background_ms() {
        return this.time_in_background_ms;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUser_message_uuid() {
        return this.user_message_uuid;
    }

    public final CodeEvents$CodeMessagePerceivedTTFT copy(String session_id, long ttft_ms, boolean is_new_session, Long time_to_request_ms, String surface, String session_type, Long time_in_background_ms, String user_message_uuid) {
        session_id.getClass();
        return new CodeEvents$CodeMessagePerceivedTTFT(session_id, ttft_ms, is_new_session, time_to_request_ms, surface, session_type, time_in_background_ms, user_message_uuid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeEvents$CodeMessagePerceivedTTFT)) {
            return false;
        }
        CodeEvents$CodeMessagePerceivedTTFT codeEvents$CodeMessagePerceivedTTFT = (CodeEvents$CodeMessagePerceivedTTFT) other;
        return x44.r(this.session_id, codeEvents$CodeMessagePerceivedTTFT.session_id) && this.ttft_ms == codeEvents$CodeMessagePerceivedTTFT.ttft_ms && this.is_new_session == codeEvents$CodeMessagePerceivedTTFT.is_new_session && x44.r(this.time_to_request_ms, codeEvents$CodeMessagePerceivedTTFT.time_to_request_ms) && x44.r(this.surface, codeEvents$CodeMessagePerceivedTTFT.surface) && x44.r(this.session_type, codeEvents$CodeMessagePerceivedTTFT.session_type) && x44.r(this.time_in_background_ms, codeEvents$CodeMessagePerceivedTTFT.time_in_background_ms) && x44.r(this.user_message_uuid, codeEvents$CodeMessagePerceivedTTFT.user_message_uuid);
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.code.session.ttft";
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final String getSession_type() {
        return this.session_type;
    }

    public final String getSurface() {
        return this.surface;
    }

    public final Long getTime_in_background_ms() {
        return this.time_in_background_ms;
    }

    public final Long getTime_to_request_ms() {
        return this.time_to_request_ms;
    }

    public final long getTtft_ms() {
        return this.ttft_ms;
    }

    public final String getUser_message_uuid() {
        return this.user_message_uuid;
    }

    public int hashCode() {
        int iP = fsh.p(vb7.e(this.session_id.hashCode() * 31, 31, this.ttft_ms), 31, this.is_new_session);
        Long l = this.time_to_request_ms;
        int iHashCode = (iP + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.surface;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.session_type;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.time_in_background_ms;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.user_message_uuid;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean is_new_session() {
        return this.is_new_session;
    }

    public String toString() {
        String str = this.session_id;
        long j = this.ttft_ms;
        boolean z = this.is_new_session;
        Long l = this.time_to_request_ms;
        String str2 = this.surface;
        String str3 = this.session_type;
        Long l2 = this.time_in_background_ms;
        String str4 = this.user_message_uuid;
        StringBuilder sbW = vb7.w("CodeMessagePerceivedTTFT(session_id=", str, ", ttft_ms=", j);
        sbW.append(", is_new_session=");
        sbW.append(z);
        sbW.append(", time_to_request_ms=");
        sbW.append(l);
        kgh.u(sbW, ", surface=", str2, ", session_type=", str3);
        sbW.append(", time_in_background_ms=");
        sbW.append(l2);
        sbW.append(", user_message_uuid=");
        sbW.append(str4);
        sbW.append(")");
        return sbW.toString();
    }

    public CodeEvents$CodeMessagePerceivedTTFT(String str, long j, boolean z, Long l, String str2, String str3, Long l2, String str4) {
        str.getClass();
        this.session_id = str;
        this.ttft_ms = j;
        this.is_new_session = z;
        this.time_to_request_ms = l;
        this.surface = str2;
        this.session_type = str3;
        this.time_in_background_ms = l2;
        this.user_message_uuid = str4;
    }

    public /* synthetic */ CodeEvents$CodeMessagePerceivedTTFT(String str, long j, boolean z, Long l, String str2, String str3, Long l2, String str4, int i, mq5 mq5Var) {
        this(str, j, z, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : l2, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : str4);
    }
}
