package com.anthropic.claude.analytics.events;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.e79;
import defpackage.fsh;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.uv3;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.vv3;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002CDBg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fBq\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010&J\u0012\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010&J\u0012\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b)\u0010&J\u0012\u0010*\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b*\u0010&Jv\u0010+\u001a\u00020\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u001fJ\u0010\u0010.\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b.\u0010!J\u001a\u00101\u001a\u00020\u00062\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b9\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b<\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b=\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b>\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b?\u0010&R\u0014\u0010A\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\u001f¨\u0006E"}, d2 = {"com/anthropic/claude/analytics/events/CodeEvents$SessionListLoaded", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "", "session_count", "", "has_bridge_sessions", "error_description", "need_input_count", "review_ready_count", "working_count", "completed_count", "archived_count", "<init>", "(Ljava/lang/String;IZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;IZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/CodeEvents$SessionListLoaded;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/CodeEvents$SessionListLoaded;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Z", "component4", "component5", "()Ljava/lang/Integer;", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;IZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/anthropic/claude/analytics/events/CodeEvents$SessionListLoaded;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "I", "getSession_count", "Z", "getHas_bridge_sessions", "getError_description", "Ljava/lang/Integer;", "getNeed_input_count", "getReview_ready_count", "getWorking_count", "getCompleted_count", "getArchived_count", "getEventName", "eventName", "Companion", "uv3", "vv3", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CodeEvents$SessionListLoaded implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final vv3 Companion = new vv3();
    private final Integer archived_count;
    private final Integer completed_count;
    private final String error_description;
    private final boolean has_bridge_sessions;
    private final Integer need_input_count;
    private final String organization_uuid;
    private final Integer review_ready_count;
    private final int session_count;
    private final Integer working_count;

    public /* synthetic */ CodeEvents$SessionListLoaded(int i, String str, int i2, boolean z, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, uv3.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.session_count = i2;
        this.has_bridge_sessions = z;
        if ((i & 8) == 0) {
            this.error_description = null;
        } else {
            this.error_description = str2;
        }
        if ((i & 16) == 0) {
            this.need_input_count = null;
        } else {
            this.need_input_count = num;
        }
        if ((i & 32) == 0) {
            this.review_ready_count = null;
        } else {
            this.review_ready_count = num2;
        }
        if ((i & 64) == 0) {
            this.working_count = null;
        } else {
            this.working_count = num3;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.completed_count = null;
        } else {
            this.completed_count = num4;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.archived_count = null;
        } else {
            this.archived_count = num5;
        }
    }

    public static /* synthetic */ CodeEvents$SessionListLoaded copy$default(CodeEvents$SessionListLoaded codeEvents$SessionListLoaded, String str, int i, boolean z, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = codeEvents$SessionListLoaded.organization_uuid;
        }
        if ((i2 & 2) != 0) {
            i = codeEvents$SessionListLoaded.session_count;
        }
        if ((i2 & 4) != 0) {
            z = codeEvents$SessionListLoaded.has_bridge_sessions;
        }
        if ((i2 & 8) != 0) {
            str2 = codeEvents$SessionListLoaded.error_description;
        }
        if ((i2 & 16) != 0) {
            num = codeEvents$SessionListLoaded.need_input_count;
        }
        if ((i2 & 32) != 0) {
            num2 = codeEvents$SessionListLoaded.review_ready_count;
        }
        if ((i2 & 64) != 0) {
            num3 = codeEvents$SessionListLoaded.working_count;
        }
        if ((i2 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            num4 = codeEvents$SessionListLoaded.completed_count;
        }
        if ((i2 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            num5 = codeEvents$SessionListLoaded.archived_count;
        }
        Integer num6 = num4;
        Integer num7 = num5;
        Integer num8 = num2;
        Integer num9 = num3;
        Integer num10 = num;
        boolean z2 = z;
        return codeEvents$SessionListLoaded.copy(str, i, z2, str2, num10, num8, num9, num6, num7);
    }

    public static final /* synthetic */ void write$Self$analytics(CodeEvents$SessionListLoaded self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        output.l(1, self.session_count, serialDesc);
        output.p(serialDesc, 2, self.has_bridge_sessions);
        if (output.E(serialDesc) || self.error_description != null) {
            output.B(serialDesc, 3, srg.a, self.error_description);
        }
        if (output.E(serialDesc) || self.need_input_count != null) {
            output.B(serialDesc, 4, e79.a, self.need_input_count);
        }
        if (output.E(serialDesc) || self.review_ready_count != null) {
            output.B(serialDesc, 5, e79.a, self.review_ready_count);
        }
        if (output.E(serialDesc) || self.working_count != null) {
            output.B(serialDesc, 6, e79.a, self.working_count);
        }
        if (output.E(serialDesc) || self.completed_count != null) {
            output.B(serialDesc, 7, e79.a, self.completed_count);
        }
        if (!output.E(serialDesc) && self.archived_count == null) {
            return;
        }
        output.B(serialDesc, 8, e79.a, self.archived_count);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSession_count() {
        return this.session_count;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getHas_bridge_sessions() {
        return this.has_bridge_sessions;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getError_description() {
        return this.error_description;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getNeed_input_count() {
        return this.need_input_count;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getReview_ready_count() {
        return this.review_ready_count;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getWorking_count() {
        return this.working_count;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getCompleted_count() {
        return this.completed_count;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getArchived_count() {
        return this.archived_count;
    }

    public final CodeEvents$SessionListLoaded copy(String organization_uuid, int session_count, boolean has_bridge_sessions, String error_description, Integer need_input_count, Integer review_ready_count, Integer working_count, Integer completed_count, Integer archived_count) {
        organization_uuid.getClass();
        return new CodeEvents$SessionListLoaded(organization_uuid, session_count, has_bridge_sessions, error_description, need_input_count, review_ready_count, working_count, completed_count, archived_count);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeEvents$SessionListLoaded)) {
            return false;
        }
        CodeEvents$SessionListLoaded codeEvents$SessionListLoaded = (CodeEvents$SessionListLoaded) other;
        return x44.r(this.organization_uuid, codeEvents$SessionListLoaded.organization_uuid) && this.session_count == codeEvents$SessionListLoaded.session_count && this.has_bridge_sessions == codeEvents$SessionListLoaded.has_bridge_sessions && x44.r(this.error_description, codeEvents$SessionListLoaded.error_description) && x44.r(this.need_input_count, codeEvents$SessionListLoaded.need_input_count) && x44.r(this.review_ready_count, codeEvents$SessionListLoaded.review_ready_count) && x44.r(this.working_count, codeEvents$SessionListLoaded.working_count) && x44.r(this.completed_count, codeEvents$SessionListLoaded.completed_count) && x44.r(this.archived_count, codeEvents$SessionListLoaded.archived_count);
    }

    public final Integer getArchived_count() {
        return this.archived_count;
    }

    public final Integer getCompleted_count() {
        return this.completed_count;
    }

    public final String getError_description() {
        return this.error_description;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_code_session_list_loaded";
    }

    public final boolean getHas_bridge_sessions() {
        return this.has_bridge_sessions;
    }

    public final Integer getNeed_input_count() {
        return this.need_input_count;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final Integer getReview_ready_count() {
        return this.review_ready_count;
    }

    public final int getSession_count() {
        return this.session_count;
    }

    public final Integer getWorking_count() {
        return this.working_count;
    }

    public int hashCode() {
        int iP = fsh.p(vb7.c(this.session_count, this.organization_uuid.hashCode() * 31, 31), 31, this.has_bridge_sessions);
        String str = this.error_description;
        int iHashCode = (iP + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.need_input_count;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.review_ready_count;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.working_count;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.completed_count;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.archived_count;
        return iHashCode5 + (num5 != null ? num5.hashCode() : 0);
    }

    public String toString() {
        String str = this.organization_uuid;
        int i = this.session_count;
        boolean z = this.has_bridge_sessions;
        String str2 = this.error_description;
        Integer num = this.need_input_count;
        Integer num2 = this.review_ready_count;
        Integer num3 = this.working_count;
        Integer num4 = this.completed_count;
        Integer num5 = this.archived_count;
        StringBuilder sbP = ij0.p("SessionListLoaded(organization_uuid=", str, i, ", session_count=", ", has_bridge_sessions=");
        sbP.append(z);
        sbP.append(", error_description=");
        sbP.append(str2);
        sbP.append(", need_input_count=");
        sbP.append(num);
        sbP.append(", review_ready_count=");
        sbP.append(num2);
        sbP.append(", working_count=");
        sbP.append(num3);
        sbP.append(", completed_count=");
        sbP.append(num4);
        sbP.append(", archived_count=");
        sbP.append(num5);
        sbP.append(")");
        return sbP.toString();
    }

    public CodeEvents$SessionListLoaded(String str, int i, boolean z, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        str.getClass();
        this.organization_uuid = str;
        this.session_count = i;
        this.has_bridge_sessions = z;
        this.error_description = str2;
        this.need_input_count = num;
        this.review_ready_count = num2;
        this.working_count = num3;
        this.completed_count = num4;
        this.archived_count = num5;
    }

    public /* synthetic */ CodeEvents$SessionListLoaded(String str, int i, boolean z, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i2, mq5 mq5Var) {
        this(str, i, z, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : num2, (i2 & 64) != 0 ? null : num3, (i2 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : num4, (i2 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : num5);
    }
}
