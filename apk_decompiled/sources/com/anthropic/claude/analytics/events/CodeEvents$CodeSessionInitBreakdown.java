package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.fsh;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.ws3;
import defpackage.x44;
import defpackage.xka;
import defpackage.xs3;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0002KLB\u008f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0011\u0010\u0012B\u0091\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010 J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010 J\u0012\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b&\u0010 J\u009c\u0001\u0010(\u001a\u00020'2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0019J\u0010\u0010+\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020\u00072\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100J'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020'2\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b7\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b<\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b=\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b>\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010?\u001a\u0004\b\b\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010@\u001a\u0004\bA\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bB\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010@\u001a\u0004\bC\u0010 R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\bD\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bE\u0010 R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010@\u001a\u0004\bF\u0010 R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010@\u001a\u0004\bG\u0010 R\u0014\u0010I\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\u0019¨\u0006M"}, d2 = {"com/anthropic/claude/analytics/events/CodeEvents$CodeSessionInitBreakdown", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "session_id", "surface", "session_type", "session_mode", "", "is_new_session", "", "ttft_ms", "provision_ms", "clone_ms", "setup_script_ms", "start_cc_ms", "cc_init_ms", "time_in_background_ms", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Z", "component6", "()Ljava/lang/Long;", "component7", "component8", "component9", "component10", "component11", "component12", "Lcom/anthropic/claude/analytics/events/CodeEvents$CodeSessionInitBreakdown;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lcom/anthropic/claude/analytics/events/CodeEvents$CodeSessionInitBreakdown;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/CodeEvents$CodeSessionInitBreakdown;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getSession_id", "getSurface", "getSession_type", "getSession_mode", "Z", "Ljava/lang/Long;", "getTtft_ms", "getProvision_ms", "getClone_ms", "getSetup_script_ms", "getStart_cc_ms", "getCc_init_ms", "getTime_in_background_ms", "getEventName", "eventName", "Companion", "ws3", "xs3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CodeEvents$CodeSessionInitBreakdown implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final xs3 Companion = new xs3();
    private final Long cc_init_ms;
    private final Long clone_ms;
    private final boolean is_new_session;
    private final Long provision_ms;
    private final String session_id;
    private final String session_mode;
    private final String session_type;
    private final Long setup_script_ms;
    private final Long start_cc_ms;
    private final String surface;
    private final Long time_in_background_ms;
    private final Long ttft_ms;

    public /* synthetic */ CodeEvents$CodeSessionInitBreakdown(int i, String str, String str2, String str3, String str4, boolean z, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, vnf vnfVar) {
        if (17 != (i & 17)) {
            gvj.f(i, 17, ws3.a.getDescriptor());
            throw null;
        }
        this.session_id = str;
        if ((i & 2) == 0) {
            this.surface = null;
        } else {
            this.surface = str2;
        }
        if ((i & 4) == 0) {
            this.session_type = null;
        } else {
            this.session_type = str3;
        }
        if ((i & 8) == 0) {
            this.session_mode = null;
        } else {
            this.session_mode = str4;
        }
        this.is_new_session = z;
        if ((i & 32) == 0) {
            this.ttft_ms = null;
        } else {
            this.ttft_ms = l;
        }
        if ((i & 64) == 0) {
            this.provision_ms = null;
        } else {
            this.provision_ms = l2;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.clone_ms = null;
        } else {
            this.clone_ms = l3;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.setup_script_ms = null;
        } else {
            this.setup_script_ms = l4;
        }
        if ((i & 512) == 0) {
            this.start_cc_ms = null;
        } else {
            this.start_cc_ms = l5;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
            this.cc_init_ms = null;
        } else {
            this.cc_init_ms = l6;
        }
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 0) {
            this.time_in_background_ms = null;
        } else {
            this.time_in_background_ms = l7;
        }
    }

    public static /* synthetic */ CodeEvents$CodeSessionInitBreakdown copy$default(CodeEvents$CodeSessionInitBreakdown codeEvents$CodeSessionInitBreakdown, String str, String str2, String str3, String str4, boolean z, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = codeEvents$CodeSessionInitBreakdown.session_id;
        }
        if ((i & 2) != 0) {
            str2 = codeEvents$CodeSessionInitBreakdown.surface;
        }
        if ((i & 4) != 0) {
            str3 = codeEvents$CodeSessionInitBreakdown.session_type;
        }
        if ((i & 8) != 0) {
            str4 = codeEvents$CodeSessionInitBreakdown.session_mode;
        }
        if ((i & 16) != 0) {
            z = codeEvents$CodeSessionInitBreakdown.is_new_session;
        }
        if ((i & 32) != 0) {
            l = codeEvents$CodeSessionInitBreakdown.ttft_ms;
        }
        if ((i & 64) != 0) {
            l2 = codeEvents$CodeSessionInitBreakdown.provision_ms;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            l3 = codeEvents$CodeSessionInitBreakdown.clone_ms;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            l4 = codeEvents$CodeSessionInitBreakdown.setup_script_ms;
        }
        if ((i & 512) != 0) {
            l5 = codeEvents$CodeSessionInitBreakdown.start_cc_ms;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
            l6 = codeEvents$CodeSessionInitBreakdown.cc_init_ms;
        }
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0) {
            l7 = codeEvents$CodeSessionInitBreakdown.time_in_background_ms;
        }
        Long l8 = l6;
        Long l9 = l7;
        Long l10 = l4;
        Long l11 = l5;
        Long l12 = l2;
        Long l13 = l3;
        boolean z2 = z;
        Long l14 = l;
        return codeEvents$CodeSessionInitBreakdown.copy(str, str2, str3, str4, z2, l14, l12, l13, l10, l11, l8, l9);
    }

    public static final /* synthetic */ void write$Self$analytics(CodeEvents$CodeSessionInitBreakdown self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.session_id);
        if (output.E(serialDesc) || self.surface != null) {
            output.B(serialDesc, 1, srg.a, self.surface);
        }
        if (output.E(serialDesc) || self.session_type != null) {
            output.B(serialDesc, 2, srg.a, self.session_type);
        }
        if (output.E(serialDesc) || self.session_mode != null) {
            output.B(serialDesc, 3, srg.a, self.session_mode);
        }
        output.p(serialDesc, 4, self.is_new_session);
        if (output.E(serialDesc) || self.ttft_ms != null) {
            output.B(serialDesc, 5, xka.a, self.ttft_ms);
        }
        if (output.E(serialDesc) || self.provision_ms != null) {
            output.B(serialDesc, 6, xka.a, self.provision_ms);
        }
        if (output.E(serialDesc) || self.clone_ms != null) {
            output.B(serialDesc, 7, xka.a, self.clone_ms);
        }
        if (output.E(serialDesc) || self.setup_script_ms != null) {
            output.B(serialDesc, 8, xka.a, self.setup_script_ms);
        }
        if (output.E(serialDesc) || self.start_cc_ms != null) {
            output.B(serialDesc, 9, xka.a, self.start_cc_ms);
        }
        if (output.E(serialDesc) || self.cc_init_ms != null) {
            output.B(serialDesc, 10, xka.a, self.cc_init_ms);
        }
        if (!output.E(serialDesc) && self.time_in_background_ms == null) {
            return;
        }
        output.B(serialDesc, 11, xka.a, self.time_in_background_ms);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSession_id() {
        return this.session_id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getStart_cc_ms() {
        return this.start_cc_ms;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Long getCc_init_ms() {
        return this.cc_init_ms;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Long getTime_in_background_ms() {
        return this.time_in_background_ms;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSurface() {
        return this.surface;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSession_type() {
        return this.session_type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSession_mode() {
        return this.session_mode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIs_new_session() {
        return this.is_new_session;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getTtft_ms() {
        return this.ttft_ms;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getProvision_ms() {
        return this.provision_ms;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getClone_ms() {
        return this.clone_ms;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getSetup_script_ms() {
        return this.setup_script_ms;
    }

    public final CodeEvents$CodeSessionInitBreakdown copy(String session_id, String surface, String session_type, String session_mode, boolean is_new_session, Long ttft_ms, Long provision_ms, Long clone_ms, Long setup_script_ms, Long start_cc_ms, Long cc_init_ms, Long time_in_background_ms) {
        session_id.getClass();
        return new CodeEvents$CodeSessionInitBreakdown(session_id, surface, session_type, session_mode, is_new_session, ttft_ms, provision_ms, clone_ms, setup_script_ms, start_cc_ms, cc_init_ms, time_in_background_ms);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeEvents$CodeSessionInitBreakdown)) {
            return false;
        }
        CodeEvents$CodeSessionInitBreakdown codeEvents$CodeSessionInitBreakdown = (CodeEvents$CodeSessionInitBreakdown) other;
        return x44.r(this.session_id, codeEvents$CodeSessionInitBreakdown.session_id) && x44.r(this.surface, codeEvents$CodeSessionInitBreakdown.surface) && x44.r(this.session_type, codeEvents$CodeSessionInitBreakdown.session_type) && x44.r(this.session_mode, codeEvents$CodeSessionInitBreakdown.session_mode) && this.is_new_session == codeEvents$CodeSessionInitBreakdown.is_new_session && x44.r(this.ttft_ms, codeEvents$CodeSessionInitBreakdown.ttft_ms) && x44.r(this.provision_ms, codeEvents$CodeSessionInitBreakdown.provision_ms) && x44.r(this.clone_ms, codeEvents$CodeSessionInitBreakdown.clone_ms) && x44.r(this.setup_script_ms, codeEvents$CodeSessionInitBreakdown.setup_script_ms) && x44.r(this.start_cc_ms, codeEvents$CodeSessionInitBreakdown.start_cc_ms) && x44.r(this.cc_init_ms, codeEvents$CodeSessionInitBreakdown.cc_init_ms) && x44.r(this.time_in_background_ms, codeEvents$CodeSessionInitBreakdown.time_in_background_ms);
    }

    public final Long getCc_init_ms() {
        return this.cc_init_ms;
    }

    public final Long getClone_ms() {
        return this.clone_ms;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.code.session.init_breakdown";
    }

    public final Long getProvision_ms() {
        return this.provision_ms;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final String getSession_mode() {
        return this.session_mode;
    }

    public final String getSession_type() {
        return this.session_type;
    }

    public final Long getSetup_script_ms() {
        return this.setup_script_ms;
    }

    public final Long getStart_cc_ms() {
        return this.start_cc_ms;
    }

    public final String getSurface() {
        return this.surface;
    }

    public final Long getTime_in_background_ms() {
        return this.time_in_background_ms;
    }

    public final Long getTtft_ms() {
        return this.ttft_ms;
    }

    public int hashCode() {
        int iHashCode = this.session_id.hashCode() * 31;
        String str = this.surface;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.session_type;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.session_mode;
        int iP = fsh.p((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.is_new_session);
        Long l = this.ttft_ms;
        int iHashCode4 = (iP + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.provision_ms;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.clone_ms;
        int iHashCode6 = (iHashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.setup_script_ms;
        int iHashCode7 = (iHashCode6 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.start_cc_ms;
        int iHashCode8 = (iHashCode7 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.cc_init_ms;
        int iHashCode9 = (iHashCode8 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l7 = this.time_in_background_ms;
        return iHashCode9 + (l7 != null ? l7.hashCode() : 0);
    }

    public final boolean is_new_session() {
        return this.is_new_session;
    }

    public String toString() {
        String str = this.session_id;
        String str2 = this.surface;
        String str3 = this.session_type;
        String str4 = this.session_mode;
        boolean z = this.is_new_session;
        Long l = this.ttft_ms;
        Long l2 = this.provision_ms;
        Long l3 = this.clone_ms;
        Long l4 = this.setup_script_ms;
        Long l5 = this.start_cc_ms;
        Long l6 = this.cc_init_ms;
        Long l7 = this.time_in_background_ms;
        StringBuilder sbR = kgh.r("CodeSessionInitBreakdown(session_id=", str, ", surface=", str2, ", session_type=");
        kgh.u(sbR, str3, ", session_mode=", str4, ", is_new_session=");
        sbR.append(z);
        sbR.append(", ttft_ms=");
        sbR.append(l);
        sbR.append(", provision_ms=");
        sbR.append(l2);
        sbR.append(", clone_ms=");
        sbR.append(l3);
        sbR.append(", setup_script_ms=");
        sbR.append(l4);
        sbR.append(", start_cc_ms=");
        sbR.append(l5);
        sbR.append(", cc_init_ms=");
        sbR.append(l6);
        sbR.append(", time_in_background_ms=");
        sbR.append(l7);
        sbR.append(")");
        return sbR.toString();
    }

    public CodeEvents$CodeSessionInitBreakdown(String str, String str2, String str3, String str4, boolean z, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7) {
        str.getClass();
        this.session_id = str;
        this.surface = str2;
        this.session_type = str3;
        this.session_mode = str4;
        this.is_new_session = z;
        this.ttft_ms = l;
        this.provision_ms = l2;
        this.clone_ms = l3;
        this.setup_script_ms = l4;
        this.start_cc_ms = l5;
        this.cc_init_ms = l6;
        this.time_in_background_ms = l7;
    }

    public /* synthetic */ CodeEvents$CodeSessionInitBreakdown(String str, String str2, String str3, String str4, boolean z, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, z, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : l2, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : l3, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : l4, (i & 512) != 0 ? null : l5, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? null : l6, (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? null : l7);
    }
}
