package com.anthropic.claude.sessions.types;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.na6;
import defpackage.onf;
import defpackage.srg;
import defpackage.ubf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.xka;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u0000 \"2\u00020\u0001:\u0003#$%B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b \u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b!\u0010\u001b¨\u0006&"}, d2 = {"Lcom/anthropic/claude/sessions/types/SdkRateLimitEvent;", "Lcom/anthropic/claude/sessions/types/SdkEvent;", "", "type", "uuid", "Lcom/anthropic/claude/sessions/types/SdkRateLimitEvent$RateLimitInfo;", "rate_limit_info", "session_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SdkRateLimitEvent$RateLimitInfo;Ljava/lang/String;)V", "", "seen0", "parent_tool_use_id", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SdkRateLimitEvent$RateLimitInfo;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SdkRateLimitEvent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getUuid", "Lcom/anthropic/claude/sessions/types/SdkRateLimitEvent$RateLimitInfo;", "getRate_limit_info", "()Lcom/anthropic/claude/sessions/types/SdkRateLimitEvent$RateLimitInfo;", "getSession_id", "getParent_tool_use_id", "Companion", "RateLimitInfo", "com/anthropic/claude/sessions/types/v0", "ubf", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class SdkRateLimitEvent implements SdkEvent {
    public static final ubf Companion = new ubf();
    private final String parent_tool_use_id;
    private final RateLimitInfo rate_limit_info;
    private final String session_id;
    private final String type;
    private final String uuid;

    public /* synthetic */ SdkRateLimitEvent(int i, String str, String str2, RateLimitInfo rateLimitInfo, String str3, String str4, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, v0.a.getDescriptor());
            throw null;
        }
        this.type = str;
        this.uuid = str2;
        this.rate_limit_info = rateLimitInfo;
        if ((i & 8) == 0) {
            this.session_id = null;
        } else {
            this.session_id = str3;
        }
        if ((i & 16) == 0) {
            this.parent_tool_use_id = null;
        } else {
            this.parent_tool_use_id = str4;
        }
    }

    public static final /* synthetic */ void write$Self$sessions(SdkRateLimitEvent self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.getType());
        output.q(serialDesc, 1, self.uuid);
        output.r(serialDesc, 2, w0.a, self.rate_limit_info);
        if (output.E(serialDesc) || self.session_id != null) {
            output.B(serialDesc, 3, srg.a, self.session_id);
        }
        if (!output.E(serialDesc) && self.getParent_tool_use_id() == null) {
            return;
        }
        output.B(serialDesc, 4, srg.a, self.getParent_tool_use_id());
    }

    @Override // com.anthropic.claude.sessions.types.SdkEvent
    public String getParent_tool_use_id() {
        return this.parent_tool_use_id;
    }

    public final RateLimitInfo getRate_limit_info() {
        return this.rate_limit_info;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    @Override // com.anthropic.claude.sessions.types.SdkEvent
    public String getType() {
        return this.type;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public SdkRateLimitEvent(String str, String str2, RateLimitInfo rateLimitInfo, String str3) {
        str.getClass();
        str2.getClass();
        rateLimitInfo.getClass();
        this.type = str;
        this.uuid = str2;
        this.rate_limit_info = rateLimitInfo;
        this.session_id = str3;
    }

    public /* synthetic */ SdkRateLimitEvent(String str, String str2, RateLimitInfo rateLimitInfo, String str3, int i, mq5 mq5Var) {
        this(str, str2, rateLimitInfo, (i & 8) != 0 ? null : str3);
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002ABBq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000f\u0010\u0010Bu\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010 J\u0012\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010 J\u0012\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b+\u0010#Jz\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010 J\u0010\u0010/\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u00020\u00072\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010 R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b8\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b\b\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b:\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b=\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b>\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\b?\u0010#¨\u0006C"}, d2 = {"Lcom/anthropic/claude/sessions/types/SdkRateLimitEvent$RateLimitInfo;", "", "", "status", "rateLimitType", "", "resetsAt", "", "isUsingOverage", "overageDisabledReason", "", "utilization", "surpassedThreshold", "overageStatus", "overageResetsAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SdkRateLimitEvent$RateLimitInfo;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Long;", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "()Ljava/lang/Double;", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;)Lcom/anthropic/claude/sessions/types/SdkRateLimitEvent$RateLimitInfo;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStatus", "getRateLimitType", "Ljava/lang/Long;", "getResetsAt", "Ljava/lang/Boolean;", "getOverageDisabledReason", "Ljava/lang/Double;", "getUtilization", "getSurpassedThreshold", "getOverageStatus", "getOverageResetsAt", "Companion", "com/anthropic/claude/sessions/types/w0", "com/anthropic/claude/sessions/types/x0", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class RateLimitInfo {
        public static final x0 Companion = new x0();
        private final Boolean isUsingOverage;
        private final String overageDisabledReason;
        private final Long overageResetsAt;
        private final String overageStatus;
        private final String rateLimitType;
        private final Long resetsAt;
        private final String status;
        private final Double surpassedThreshold;
        private final Double utilization;

        public /* synthetic */ RateLimitInfo(int i, String str, String str2, Long l, Boolean bool, String str3, Double d, Double d2, String str4, Long l2, vnf vnfVar) {
            this.status = (i & 1) == 0 ? "allowed" : str;
            if ((i & 2) == 0) {
                this.rateLimitType = null;
            } else {
                this.rateLimitType = str2;
            }
            if ((i & 4) == 0) {
                this.resetsAt = null;
            } else {
                this.resetsAt = l;
            }
            if ((i & 8) == 0) {
                this.isUsingOverage = null;
            } else {
                this.isUsingOverage = bool;
            }
            if ((i & 16) == 0) {
                this.overageDisabledReason = null;
            } else {
                this.overageDisabledReason = str3;
            }
            if ((i & 32) == 0) {
                this.utilization = null;
            } else {
                this.utilization = d;
            }
            if ((i & 64) == 0) {
                this.surpassedThreshold = null;
            } else {
                this.surpassedThreshold = d2;
            }
            if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
                this.overageStatus = null;
            } else {
                this.overageStatus = str4;
            }
            if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
                this.overageResetsAt = null;
            } else {
                this.overageResetsAt = l2;
            }
        }

        public static /* synthetic */ RateLimitInfo copy$default(RateLimitInfo rateLimitInfo, String str, String str2, Long l, Boolean bool, String str3, Double d, Double d2, String str4, Long l2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = rateLimitInfo.status;
            }
            if ((i & 2) != 0) {
                str2 = rateLimitInfo.rateLimitType;
            }
            if ((i & 4) != 0) {
                l = rateLimitInfo.resetsAt;
            }
            if ((i & 8) != 0) {
                bool = rateLimitInfo.isUsingOverage;
            }
            if ((i & 16) != 0) {
                str3 = rateLimitInfo.overageDisabledReason;
            }
            if ((i & 32) != 0) {
                d = rateLimitInfo.utilization;
            }
            if ((i & 64) != 0) {
                d2 = rateLimitInfo.surpassedThreshold;
            }
            if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
                str4 = rateLimitInfo.overageStatus;
            }
            if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
                l2 = rateLimitInfo.overageResetsAt;
            }
            String str5 = str4;
            Long l3 = l2;
            Double d3 = d;
            Double d4 = d2;
            String str6 = str3;
            Long l4 = l;
            return rateLimitInfo.copy(str, str2, l4, bool, str6, d3, d4, str5, l3);
        }

        public static final /* synthetic */ void write$Self$sessions(RateLimitInfo self, vd4 output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || !x44.r(self.status, "allowed")) {
                output.q(serialDesc, 0, self.status);
            }
            if (output.E(serialDesc) || self.rateLimitType != null) {
                output.B(serialDesc, 1, srg.a, self.rateLimitType);
            }
            if (output.E(serialDesc) || self.resetsAt != null) {
                output.B(serialDesc, 2, xka.a, self.resetsAt);
            }
            if (output.E(serialDesc) || self.isUsingOverage != null) {
                output.B(serialDesc, 3, zt1.a, self.isUsingOverage);
            }
            if (output.E(serialDesc) || self.overageDisabledReason != null) {
                output.B(serialDesc, 4, srg.a, self.overageDisabledReason);
            }
            if (output.E(serialDesc) || self.utilization != null) {
                output.B(serialDesc, 5, na6.a, self.utilization);
            }
            if (output.E(serialDesc) || self.surpassedThreshold != null) {
                output.B(serialDesc, 6, na6.a, self.surpassedThreshold);
            }
            if (output.E(serialDesc) || self.overageStatus != null) {
                output.B(serialDesc, 7, srg.a, self.overageStatus);
            }
            if (!output.E(serialDesc) && self.overageResetsAt == null) {
                return;
            }
            output.B(serialDesc, 8, xka.a, self.overageResetsAt);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getRateLimitType() {
            return this.rateLimitType;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Long getResetsAt() {
            return this.resetsAt;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Boolean getIsUsingOverage() {
            return this.isUsingOverage;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getOverageDisabledReason() {
            return this.overageDisabledReason;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Double getUtilization() {
            return this.utilization;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Double getSurpassedThreshold() {
            return this.surpassedThreshold;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getOverageStatus() {
            return this.overageStatus;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Long getOverageResetsAt() {
            return this.overageResetsAt;
        }

        public final RateLimitInfo copy(String status, String rateLimitType, Long resetsAt, Boolean isUsingOverage, String overageDisabledReason, Double utilization, Double surpassedThreshold, String overageStatus, Long overageResetsAt) {
            status.getClass();
            return new RateLimitInfo(status, rateLimitType, resetsAt, isUsingOverage, overageDisabledReason, utilization, surpassedThreshold, overageStatus, overageResetsAt);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RateLimitInfo)) {
                return false;
            }
            RateLimitInfo rateLimitInfo = (RateLimitInfo) other;
            return x44.r(this.status, rateLimitInfo.status) && x44.r(this.rateLimitType, rateLimitInfo.rateLimitType) && x44.r(this.resetsAt, rateLimitInfo.resetsAt) && x44.r(this.isUsingOverage, rateLimitInfo.isUsingOverage) && x44.r(this.overageDisabledReason, rateLimitInfo.overageDisabledReason) && x44.r(this.utilization, rateLimitInfo.utilization) && x44.r(this.surpassedThreshold, rateLimitInfo.surpassedThreshold) && x44.r(this.overageStatus, rateLimitInfo.overageStatus) && x44.r(this.overageResetsAt, rateLimitInfo.overageResetsAt);
        }

        public final String getOverageDisabledReason() {
            return this.overageDisabledReason;
        }

        public final Long getOverageResetsAt() {
            return this.overageResetsAt;
        }

        public final String getOverageStatus() {
            return this.overageStatus;
        }

        public final String getRateLimitType() {
            return this.rateLimitType;
        }

        public final Long getResetsAt() {
            return this.resetsAt;
        }

        public final String getStatus() {
            return this.status;
        }

        public final Double getSurpassedThreshold() {
            return this.surpassedThreshold;
        }

        public final Double getUtilization() {
            return this.utilization;
        }

        public int hashCode() {
            int iHashCode = this.status.hashCode() * 31;
            String str = this.rateLimitType;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Long l = this.resetsAt;
            int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
            Boolean bool = this.isUsingOverage;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.overageDisabledReason;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Double d = this.utilization;
            int iHashCode6 = (iHashCode5 + (d == null ? 0 : d.hashCode())) * 31;
            Double d2 = this.surpassedThreshold;
            int iHashCode7 = (iHashCode6 + (d2 == null ? 0 : d2.hashCode())) * 31;
            String str3 = this.overageStatus;
            int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Long l2 = this.overageResetsAt;
            return iHashCode8 + (l2 != null ? l2.hashCode() : 0);
        }

        public final Boolean isUsingOverage() {
            return this.isUsingOverage;
        }

        public String toString() {
            String str = this.status;
            String str2 = this.rateLimitType;
            Long l = this.resetsAt;
            Boolean bool = this.isUsingOverage;
            String str3 = this.overageDisabledReason;
            Double d = this.utilization;
            Double d2 = this.surpassedThreshold;
            String str4 = this.overageStatus;
            Long l2 = this.overageResetsAt;
            StringBuilder sbR = kgh.r("RateLimitInfo(status=", str, ", rateLimitType=", str2, ", resetsAt=");
            sbR.append(l);
            sbR.append(", isUsingOverage=");
            sbR.append(bool);
            sbR.append(", overageDisabledReason=");
            sbR.append(str3);
            sbR.append(", utilization=");
            sbR.append(d);
            sbR.append(", surpassedThreshold=");
            sbR.append(d2);
            sbR.append(", overageStatus=");
            sbR.append(str4);
            sbR.append(", overageResetsAt=");
            sbR.append(l2);
            sbR.append(")");
            return sbR.toString();
        }

        public RateLimitInfo() {
            this((String) null, (String) null, (Long) null, (Boolean) null, (String) null, (Double) null, (Double) null, (String) null, (Long) null, 511, (mq5) null);
        }

        public RateLimitInfo(String str, String str2, Long l, Boolean bool, String str3, Double d, Double d2, String str4, Long l2) {
            str.getClass();
            this.status = str;
            this.rateLimitType = str2;
            this.resetsAt = l;
            this.isUsingOverage = bool;
            this.overageDisabledReason = str3;
            this.utilization = d;
            this.surpassedThreshold = d2;
            this.overageStatus = str4;
            this.overageResetsAt = l2;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ RateLimitInfo(java.lang.String r2, java.lang.String r3, java.lang.Long r4, java.lang.Boolean r5, java.lang.String r6, java.lang.Double r7, java.lang.Double r8, java.lang.String r9, java.lang.Long r10, int r11, defpackage.mq5 r12) {
            /*
                r1 = this;
                r12 = r11 & 1
                if (r12 == 0) goto L6
                java.lang.String r2 = "allowed"
            L6:
                r12 = r11 & 2
                r0 = 0
                if (r12 == 0) goto Lc
                r3 = r0
            Lc:
                r12 = r11 & 4
                if (r12 == 0) goto L11
                r4 = r0
            L11:
                r12 = r11 & 8
                if (r12 == 0) goto L16
                r5 = r0
            L16:
                r12 = r11 & 16
                if (r12 == 0) goto L1b
                r6 = r0
            L1b:
                r12 = r11 & 32
                if (r12 == 0) goto L20
                r7 = r0
            L20:
                r12 = r11 & 64
                if (r12 == 0) goto L25
                r8 = r0
            L25:
                r12 = r11 & 128(0x80, float:1.8E-43)
                if (r12 == 0) goto L2a
                r9 = r0
            L2a:
                r11 = r11 & 256(0x100, float:3.59E-43)
                if (r11 == 0) goto L39
                r12 = r0
                r10 = r8
                r11 = r9
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L43
            L39:
                r12 = r10
                r11 = r9
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L43:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.sessions.types.SdkRateLimitEvent.RateLimitInfo.<init>(java.lang.String, java.lang.String, java.lang.Long, java.lang.Boolean, java.lang.String, java.lang.Double, java.lang.Double, java.lang.String, java.lang.Long, int, mq5):void");
        }
    }
}
