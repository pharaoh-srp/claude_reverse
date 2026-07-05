package com.anthropic.claude.api.common;

import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.e79;
import defpackage.eej;
import defpackage.f7a;
import defpackage.fl5;
import defpackage.kw9;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qy1;
import defpackage.rod;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.zcd;
import defpackage.znf;
import defpackage.zt1;
import java.lang.annotation.Annotation;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/api/common/RateLimit;", "", "Companion", "WithinLimit", "ApproachingLimit", "ExceedsLimit", "com/anthropic/claude/api/common/f", "Lcom/anthropic/claude/api/common/RateLimit$ApproachingLimit;", "Lcom/anthropic/claude/api/common/RateLimit$ExceedsLimit;", "Lcom/anthropic/claude/api/common/RateLimit$WithinLimit;", "Claude.api:result"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public interface RateLimit {
    public static final f Companion = f.a;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/api/common/RateLimit$WithinLimit;", "Lcom/anthropic/claude/api/common/RateLimit;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "Claude.api:result", "Lkotlinx/serialization/Serializable;", "Lkotlinx/serialization/SerialName;", ExperienceToggle.DEFAULT_PARAM_KEY, "within_limit"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class WithinLimit implements RateLimit {
        public static final WithinLimit INSTANCE = new WithinLimit();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new zcd(4));

        private WithinLimit() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("within_limit", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof WithinLimit);
        }

        public int hashCode() {
            return -1091425457;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "WithinLimit";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000278BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fBO\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u001e\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"JL\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b%\u0010 J\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\u00042\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010 R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010\"¨\u00069"}, d2 = {"Lcom/anthropic/claude/api/common/RateLimit$ExceedsLimit;", "Lcom/anthropic/claude/api/common/RateLimit;", "Ljava/util/Date;", "resetsAt", "", "perModelLimit", "", "message", "", "Lcom/anthropic/claude/api/common/WindowStatus;", "windows", "<init>", "(Ljava/util/Date;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/Date;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_api_result", "(Lcom/anthropic/claude/api/common/RateLimit$ExceedsLimit;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/Date;", "component2", "()Ljava/lang/Boolean;", "component3", "()Ljava/lang/String;", "component4", "()Ljava/util/Map;", "copy", "(Ljava/util/Date;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;)Lcom/anthropic/claude/api/common/RateLimit$ExceedsLimit;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Date;", "getResetsAt", "getResetsAt$annotations", "()V", "Ljava/lang/Boolean;", "getPerModelLimit", "Ljava/lang/String;", "getMessage", "Ljava/util/Map;", "getWindows", "Companion", "com/anthropic/claude/api/common/g", "com/anthropic/claude/api/common/h", "Claude.api:result"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ExceedsLimit implements RateLimit {
        private final String message;
        private final Boolean perModelLimit;
        private final Date resetsAt;
        private final Map<String, WindowStatus> windows;
        public static final h Companion = new h();
        private static final kw9[] $childSerializers = {null, null, null, yb5.w(w1a.F, new rod(16))};

        public /* synthetic */ ExceedsLimit(int i, Date date, Boolean bool, String str, Map map, vnf vnfVar) {
            if ((i & 1) == 0) {
                this.resetsAt = null;
            } else {
                this.resetsAt = date;
            }
            if ((i & 2) == 0) {
                this.perModelLimit = null;
            } else {
                this.perModelLimit = bool;
            }
            if ((i & 4) == 0) {
                this.message = null;
            } else {
                this.message = str;
            }
            if ((i & 8) == 0) {
                this.windows = null;
            } else {
                this.windows = map;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new f7a(srg.a, eej.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ExceedsLimit copy$default(ExceedsLimit exceedsLimit, Date date, Boolean bool, String str, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                date = exceedsLimit.resetsAt;
            }
            if ((i & 2) != 0) {
                bool = exceedsLimit.perModelLimit;
            }
            if ((i & 4) != 0) {
                str = exceedsLimit.message;
            }
            if ((i & 8) != 0) {
                map = exceedsLimit.windows;
            }
            return exceedsLimit.copy(date, bool, str, map);
        }

        @onf(with = fl5.class)
        public static /* synthetic */ void getResetsAt$annotations() {
        }

        public static final /* synthetic */ void write$Self$Claude_api_result(ExceedsLimit self, vd4 output, SerialDescriptor serialDesc) {
            kw9[] kw9VarArr = $childSerializers;
            if (output.E(serialDesc) || self.resetsAt != null) {
                output.B(serialDesc, 0, fl5.a, self.resetsAt);
            }
            if (output.E(serialDesc) || self.perModelLimit != null) {
                output.B(serialDesc, 1, zt1.a, self.perModelLimit);
            }
            if (output.E(serialDesc) || self.message != null) {
                output.B(serialDesc, 2, srg.a, self.message);
            }
            if (!output.E(serialDesc) && self.windows == null) {
                return;
            }
            output.B(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.windows);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Date getResetsAt() {
            return this.resetsAt;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getPerModelLimit() {
            return this.perModelLimit;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final Map<String, WindowStatus> component4() {
            return this.windows;
        }

        public final ExceedsLimit copy(Date resetsAt, Boolean perModelLimit, String message, Map<String, WindowStatus> windows) {
            return new ExceedsLimit(resetsAt, perModelLimit, message, windows);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExceedsLimit)) {
                return false;
            }
            ExceedsLimit exceedsLimit = (ExceedsLimit) other;
            return x44.r(this.resetsAt, exceedsLimit.resetsAt) && x44.r(this.perModelLimit, exceedsLimit.perModelLimit) && x44.r(this.message, exceedsLimit.message) && x44.r(this.windows, exceedsLimit.windows);
        }

        public final String getMessage() {
            return this.message;
        }

        public final Boolean getPerModelLimit() {
            return this.perModelLimit;
        }

        public final Date getResetsAt() {
            return this.resetsAt;
        }

        public final Map<String, WindowStatus> getWindows() {
            return this.windows;
        }

        public int hashCode() {
            Date date = this.resetsAt;
            int iHashCode = (date == null ? 0 : date.hashCode()) * 31;
            Boolean bool = this.perModelLimit;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.message;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Map<String, WindowStatus> map = this.windows;
            return iHashCode3 + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            return "ExceedsLimit(resetsAt=" + this.resetsAt + ", perModelLimit=" + this.perModelLimit + ", message=" + this.message + ", windows=" + this.windows + ")";
        }

        public ExceedsLimit() {
            this((Date) null, (Boolean) null, (String) null, (Map) null, 15, (mq5) null);
        }

        public ExceedsLimit(Date date, Boolean bool, String str, Map<String, WindowStatus> map) {
            this.resetsAt = date;
            this.perModelLimit = bool;
            this.message = str;
            this.windows = map;
        }

        public /* synthetic */ ExceedsLimit(Date date, Boolean bool, String str, Map map, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? null : date, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : map);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<=BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eBY\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u001e\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%JX\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b(\u0010#J\u0010\u0010)\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u0010#R%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b:\u0010%¨\u0006>"}, d2 = {"Lcom/anthropic/claude/api/common/RateLimit$ApproachingLimit;", "Lcom/anthropic/claude/api/common/RateLimit;", "Ljava/util/Date;", "resetsAt", "", "remaining", "", "perModelLimit", "", "message", "", "Lcom/anthropic/claude/api/common/WindowStatus;", "windows", "<init>", "(Ljava/util/Date;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/Date;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_api_result", "(Lcom/anthropic/claude/api/common/RateLimit$ApproachingLimit;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/Date;", "component2", "()Ljava/lang/Integer;", "component3", "()Ljava/lang/Boolean;", "component4", "()Ljava/lang/String;", "component5", "()Ljava/util/Map;", "copy", "(Ljava/util/Date;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Map;)Lcom/anthropic/claude/api/common/RateLimit$ApproachingLimit;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Date;", "getResetsAt", "getResetsAt$annotations", "()V", "Ljava/lang/Integer;", "getRemaining", "Ljava/lang/Boolean;", "getPerModelLimit", "Ljava/lang/String;", "getMessage", "Ljava/util/Map;", "getWindows", "Companion", "com/anthropic/claude/api/common/d", "com/anthropic/claude/api/common/e", "Claude.api:result"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ApproachingLimit implements RateLimit {
        private final String message;
        private final Boolean perModelLimit;
        private final Integer remaining;
        private final Date resetsAt;
        private final Map<String, WindowStatus> windows;
        public static final e Companion = new e();
        private static final kw9[] $childSerializers = {null, null, null, null, yb5.w(w1a.F, new rod(15))};

        public /* synthetic */ ApproachingLimit(int i, Date date, Integer num, Boolean bool, String str, Map map, vnf vnfVar) {
            if ((i & 1) == 0) {
                this.resetsAt = null;
            } else {
                this.resetsAt = date;
            }
            if ((i & 2) == 0) {
                this.remaining = null;
            } else {
                this.remaining = num;
            }
            if ((i & 4) == 0) {
                this.perModelLimit = null;
            } else {
                this.perModelLimit = bool;
            }
            if ((i & 8) == 0) {
                this.message = null;
            } else {
                this.message = str;
            }
            if ((i & 16) == 0) {
                this.windows = null;
            } else {
                this.windows = map;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new f7a(srg.a, eej.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ApproachingLimit copy$default(ApproachingLimit approachingLimit, Date date, Integer num, Boolean bool, String str, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                date = approachingLimit.resetsAt;
            }
            if ((i & 2) != 0) {
                num = approachingLimit.remaining;
            }
            if ((i & 4) != 0) {
                bool = approachingLimit.perModelLimit;
            }
            if ((i & 8) != 0) {
                str = approachingLimit.message;
            }
            if ((i & 16) != 0) {
                map = approachingLimit.windows;
            }
            Map map2 = map;
            Boolean bool2 = bool;
            return approachingLimit.copy(date, num, bool2, str, map2);
        }

        @onf(with = fl5.class)
        public static /* synthetic */ void getResetsAt$annotations() {
        }

        public static final /* synthetic */ void write$Self$Claude_api_result(ApproachingLimit self, vd4 output, SerialDescriptor serialDesc) {
            kw9[] kw9VarArr = $childSerializers;
            if (output.E(serialDesc) || self.resetsAt != null) {
                output.B(serialDesc, 0, fl5.a, self.resetsAt);
            }
            if (output.E(serialDesc) || self.remaining != null) {
                output.B(serialDesc, 1, e79.a, self.remaining);
            }
            if (output.E(serialDesc) || self.perModelLimit != null) {
                output.B(serialDesc, 2, zt1.a, self.perModelLimit);
            }
            if (output.E(serialDesc) || self.message != null) {
                output.B(serialDesc, 3, srg.a, self.message);
            }
            if (!output.E(serialDesc) && self.windows == null) {
                return;
            }
            output.B(serialDesc, 4, (znf) kw9VarArr[4].getValue(), self.windows);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Date getResetsAt() {
            return this.resetsAt;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getRemaining() {
            return this.remaining;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Boolean getPerModelLimit() {
            return this.perModelLimit;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final Map<String, WindowStatus> component5() {
            return this.windows;
        }

        public final ApproachingLimit copy(Date resetsAt, Integer remaining, Boolean perModelLimit, String message, Map<String, WindowStatus> windows) {
            return new ApproachingLimit(resetsAt, remaining, perModelLimit, message, windows);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ApproachingLimit)) {
                return false;
            }
            ApproachingLimit approachingLimit = (ApproachingLimit) other;
            return x44.r(this.resetsAt, approachingLimit.resetsAt) && x44.r(this.remaining, approachingLimit.remaining) && x44.r(this.perModelLimit, approachingLimit.perModelLimit) && x44.r(this.message, approachingLimit.message) && x44.r(this.windows, approachingLimit.windows);
        }

        public final String getMessage() {
            return this.message;
        }

        public final Boolean getPerModelLimit() {
            return this.perModelLimit;
        }

        public final Integer getRemaining() {
            return this.remaining;
        }

        public final Date getResetsAt() {
            return this.resetsAt;
        }

        public final Map<String, WindowStatus> getWindows() {
            return this.windows;
        }

        public int hashCode() {
            Date date = this.resetsAt;
            int iHashCode = (date == null ? 0 : date.hashCode()) * 31;
            Integer num = this.remaining;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool = this.perModelLimit;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.message;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            Map<String, WindowStatus> map = this.windows;
            return iHashCode4 + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            Date date = this.resetsAt;
            Integer num = this.remaining;
            Boolean bool = this.perModelLimit;
            String str = this.message;
            Map<String, WindowStatus> map = this.windows;
            StringBuilder sb = new StringBuilder("ApproachingLimit(resetsAt=");
            sb.append(date);
            sb.append(", remaining=");
            sb.append(num);
            sb.append(", perModelLimit=");
            sb.append(bool);
            sb.append(", message=");
            sb.append(str);
            sb.append(", windows=");
            return qy1.i(sb, map, ")");
        }

        public ApproachingLimit() {
            this((Date) null, (Integer) null, (Boolean) null, (String) null, (Map) null, 31, (mq5) null);
        }

        public ApproachingLimit(Date date, Integer num, Boolean bool, String str, Map<String, WindowStatus> map) {
            this.resetsAt = date;
            this.remaining = num;
            this.perModelLimit = bool;
            this.message = str;
            this.windows = map;
        }

        public /* synthetic */ ApproachingLimit(Date date, Integer num, Boolean bool, String str, Map map, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? null : date, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : map);
        }
    }
}
