package com.anthropic.claude.api.account;

import com.anthropic.claude.api.model.ModelOption;
import com.anthropic.claude.types.strings.Capability;
import com.anthropic.claude.types.strings.OrganizationId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.akc;
import defpackage.bc9;
import defpackage.cc2;
import defpackage.ckc;
import defpackage.cob;
import defpackage.fkc;
import defpackage.gid;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.oob;
import defpackage.skc;
import defpackage.srg;
import defpackage.t1e;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.w1e;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 ]2\u00020\u0001:\u0002^_BÉ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u001f\b\u0002\u0010\u0018\u001a\u0019\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u0017\u0012\u001f\b\u0002\u0010\u0019\u001a\u0019\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u0017\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\b¢\u0006\u0004\b\u001c\u0010\u001dB©\u0001\b\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0013\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\b\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001c\u0010\"J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010$J\u0010\u0010'\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b-\u0010$J\u0012\u0010.\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b.\u0010$J\u0012\u0010/\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b1\u0010$J\u0012\u00102\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b2\u0010$J'\u00103\u001a\u0019\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u0017HÆ\u0003¢\u0006\u0004\b3\u00104J'\u00105\u001a\u0019\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u0017HÆ\u0003¢\u0006\u0004\b5\u00104J\u0018\u00106\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b6\u0010*JÚ\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u001f\b\u0002\u0010\u0018\u001a\u0019\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u00172\u001f\b\u0002\u0010\u0019\u001a\u0019\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u00172\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b7\u00108J\u0010\u0010:\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b:\u0010$J\u0010\u0010;\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b;\u0010<J\u001a\u0010?\u001a\u00020>2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b?\u0010@J'\u0010I\u001a\u00020F2\u0006\u0010A\u001a\u00020\u00002\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020DH\u0001¢\u0006\u0004\bG\u0010HR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010J\u001a\u0004\bK\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010J\u001a\u0004\bL\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010M\u001a\u0004\bN\u0010(R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010O\u001a\u0004\bP\u0010*R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010Q\u001a\u0004\bR\u0010,R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010J\u001a\u0004\bS\u0010$R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010J\u001a\u0004\bT\u0010$R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010U\u001a\u0004\bV\u00100R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010J\u001a\u0004\bW\u0010$R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010J\u001a\u0004\bX\u0010$R.\u0010\u0018\u001a\u0019\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010Y\u001a\u0004\bZ\u00104R.\u0010\u0019\u001a\u0019\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010Y\u001a\u0004\b[\u00104R\u001f\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010O\u001a\u0004\b\\\u0010*¨\u0006`"}, d2 = {"Lcom/anthropic/claude/api/account/Organization;", "", "Lcom/anthropic/claude/types/strings/OrganizationId;", "uuid", "", "name", "Lcom/anthropic/claude/api/account/OrganizationSettings;", "settings", "", "Lcom/anthropic/claude/types/strings/Capability;", "capabilities", "Lcom/anthropic/claude/api/account/RavenType;", "raven_type", "rate_limit_tier", "billing_type", "Lcom/anthropic/claude/api/account/RateLimitUpsell;", "rate_limit_upsell", "free_credits_status", "api_disabled_reason", "Ljava/util/Date;", "Lcom/anthropic/claude/api/Iso8601Date;", "Lonf;", "with", "Lbc9;", "api_disabled_until", "billable_usage_paused_until", "Lcom/anthropic/claude/api/model/ModelOption;", "claude_ai_bootstrap_models_config", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/account/OrganizationSettings;Ljava/util/List;Lcom/anthropic/claude/api/account/RavenType;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/account/RateLimitUpsell;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/account/OrganizationSettings;Ljava/util/List;Lcom/anthropic/claude/api/account/RavenType;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/account/RateLimitUpsell;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Lvnf;Lmq5;)V", "component1-XjkXN6I", "()Ljava/lang/String;", "component1", "component2", "component3", "()Lcom/anthropic/claude/api/account/OrganizationSettings;", "component4", "()Ljava/util/List;", "component5", "()Lcom/anthropic/claude/api/account/RavenType;", "component6", "component7", "component8", "()Lcom/anthropic/claude/api/account/RateLimitUpsell;", "component9", "component10", "component11", "()Ljava/util/Date;", "component12", "component13", "copy-eYDDfOk", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/account/OrganizationSettings;Ljava/util/List;Lcom/anthropic/claude/api/account/RavenType;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/account/RateLimitUpsell;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;)Lcom/anthropic/claude/api/account/Organization;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/account/Organization;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getUuid-XjkXN6I", "getName", "Lcom/anthropic/claude/api/account/OrganizationSettings;", "getSettings", "Ljava/util/List;", "getCapabilities", "Lcom/anthropic/claude/api/account/RavenType;", "getRaven_type", "getRate_limit_tier", "getBilling_type", "Lcom/anthropic/claude/api/account/RateLimitUpsell;", "getRate_limit_upsell", "getFree_credits_status", "getApi_disabled_reason", "Ljava/util/Date;", "getApi_disabled_until", "getBillable_usage_paused_until", "getClaude_ai_bootstrap_models_config", "Companion", "akc", "ckc", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class Organization {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final ckc Companion = new ckc();
    private final String api_disabled_reason;
    private final Date api_disabled_until;
    private final Date billable_usage_paused_until;
    private final String billing_type;
    private final List<Capability> capabilities;
    private final List<ModelOption> claude_ai_bootstrap_models_config;
    private final String free_credits_status;
    private final String name;
    private final String rate_limit_tier;
    private final RateLimitUpsell rate_limit_upsell;
    private final RavenType raven_type;
    private final OrganizationSettings settings;
    private final String uuid;

    static {
        oob oobVar = new oob(15);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, yb5.w(w1aVar, oobVar), null, null, null, null, null, null, null, null, yb5.w(w1aVar, new oob(16))};
    }

    private /* synthetic */ Organization(int i, String str, String str2, OrganizationSettings organizationSettings, List list, RavenType ravenType, String str3, String str4, RateLimitUpsell rateLimitUpsell, String str5, String str6, Date date, Date date2, List list2, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, akc.a.getDescriptor());
            throw null;
        }
        this.uuid = str;
        this.name = str2;
        this.settings = organizationSettings;
        this.capabilities = list;
        if ((i & 16) == 0) {
            this.raven_type = null;
        } else {
            this.raven_type = ravenType;
        }
        if ((i & 32) == 0) {
            this.rate_limit_tier = null;
        } else {
            this.rate_limit_tier = str3;
        }
        if ((i & 64) == 0) {
            this.billing_type = null;
        } else {
            this.billing_type = str4;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.rate_limit_upsell = null;
        } else {
            this.rate_limit_upsell = rateLimitUpsell;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.free_credits_status = null;
        } else {
            this.free_credits_status = str5;
        }
        if ((i & 512) == 0) {
            this.api_disabled_reason = null;
        } else {
            this.api_disabled_reason = str6;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
            this.api_disabled_until = null;
        } else {
            this.api_disabled_until = date;
        }
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 0) {
            this.billable_usage_paused_until = null;
        } else {
            this.billable_usage_paused_until = date2;
        }
        if ((i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0) {
            this.claude_ai_bootstrap_models_config = null;
        } else {
            this.claude_ai_bootstrap_models_config = list2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(cc2.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(cob.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-eYDDfOk$default, reason: not valid java name */
    public static /* synthetic */ Organization m113copyeYDDfOk$default(Organization organization, String str, String str2, OrganizationSettings organizationSettings, List list, RavenType ravenType, String str3, String str4, RateLimitUpsell rateLimitUpsell, String str5, String str6, Date date, Date date2, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = organization.uuid;
        }
        return organization.m115copyeYDDfOk(str, (i & 2) != 0 ? organization.name : str2, (i & 4) != 0 ? organization.settings : organizationSettings, (i & 8) != 0 ? organization.capabilities : list, (i & 16) != 0 ? organization.raven_type : ravenType, (i & 32) != 0 ? organization.rate_limit_tier : str3, (i & 64) != 0 ? organization.billing_type : str4, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? organization.rate_limit_upsell : rateLimitUpsell, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? organization.free_credits_status : str5, (i & 512) != 0 ? organization.api_disabled_reason : str6, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? organization.api_disabled_until : date, (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? organization.billable_usage_paused_until : date2, (i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? organization.claude_ai_bootstrap_models_config : list2);
    }

    public static final /* synthetic */ void write$Self$api(Organization self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, fkc.a, OrganizationId.m1065boximpl(self.uuid));
        output.q(serialDesc, 1, self.name);
        output.r(serialDesc, 2, skc.a, self.settings);
        output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.capabilities);
        if (output.E(serialDesc) || self.raven_type != null) {
            output.B(serialDesc, 4, w1e.d, self.raven_type);
        }
        if (output.E(serialDesc) || self.rate_limit_tier != null) {
            output.B(serialDesc, 5, srg.a, self.rate_limit_tier);
        }
        if (output.E(serialDesc) || self.billing_type != null) {
            output.B(serialDesc, 6, srg.a, self.billing_type);
        }
        if (output.E(serialDesc) || self.rate_limit_upsell != null) {
            output.B(serialDesc, 7, t1e.d, self.rate_limit_upsell);
        }
        if (output.E(serialDesc) || self.free_credits_status != null) {
            output.B(serialDesc, 8, srg.a, self.free_credits_status);
        }
        if (output.E(serialDesc) || self.api_disabled_reason != null) {
            output.B(serialDesc, 9, srg.a, self.api_disabled_reason);
        }
        if (output.E(serialDesc) || self.api_disabled_until != null) {
            output.B(serialDesc, 10, bc9.a, self.api_disabled_until);
        }
        if (output.E(serialDesc) || self.billable_usage_paused_until != null) {
            output.B(serialDesc, 11, bc9.a, self.billable_usage_paused_until);
        }
        if (!output.E(serialDesc) && self.claude_ai_bootstrap_models_config == null) {
            return;
        }
        output.B(serialDesc, 12, (znf) kw9VarArr[12].getValue(), self.claude_ai_bootstrap_models_config);
    }

    /* JADX INFO: renamed from: component1-XjkXN6I, reason: not valid java name and from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getApi_disabled_reason() {
        return this.api_disabled_reason;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Date getApi_disabled_until() {
        return this.api_disabled_until;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Date getBillable_usage_paused_until() {
        return this.billable_usage_paused_until;
    }

    public final List<ModelOption> component13() {
        return this.claude_ai_bootstrap_models_config;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OrganizationSettings getSettings() {
        return this.settings;
    }

    public final List<Capability> component4() {
        return this.capabilities;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final RavenType getRaven_type() {
        return this.raven_type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRate_limit_tier() {
        return this.rate_limit_tier;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBilling_type() {
        return this.billing_type;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final RateLimitUpsell getRate_limit_upsell() {
        return this.rate_limit_upsell;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getFree_credits_status() {
        return this.free_credits_status;
    }

    /* JADX INFO: renamed from: copy-eYDDfOk, reason: not valid java name */
    public final Organization m115copyeYDDfOk(String uuid, String name, OrganizationSettings settings, List<Capability> capabilities, RavenType raven_type, String rate_limit_tier, String billing_type, RateLimitUpsell rate_limit_upsell, String free_credits_status, String api_disabled_reason, Date api_disabled_until, Date billable_usage_paused_until, List<ModelOption> claude_ai_bootstrap_models_config) {
        uuid.getClass();
        name.getClass();
        settings.getClass();
        capabilities.getClass();
        return new Organization(uuid, name, settings, capabilities, raven_type, rate_limit_tier, billing_type, rate_limit_upsell, free_credits_status, api_disabled_reason, api_disabled_until, billable_usage_paused_until, claude_ai_bootstrap_models_config, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Organization)) {
            return false;
        }
        Organization organization = (Organization) other;
        return OrganizationId.m1068equalsimpl0(this.uuid, organization.uuid) && x44.r(this.name, organization.name) && x44.r(this.settings, organization.settings) && x44.r(this.capabilities, organization.capabilities) && this.raven_type == organization.raven_type && x44.r(this.rate_limit_tier, organization.rate_limit_tier) && x44.r(this.billing_type, organization.billing_type) && this.rate_limit_upsell == organization.rate_limit_upsell && x44.r(this.free_credits_status, organization.free_credits_status) && x44.r(this.api_disabled_reason, organization.api_disabled_reason) && x44.r(this.api_disabled_until, organization.api_disabled_until) && x44.r(this.billable_usage_paused_until, organization.billable_usage_paused_until) && x44.r(this.claude_ai_bootstrap_models_config, organization.claude_ai_bootstrap_models_config);
    }

    public final String getApi_disabled_reason() {
        return this.api_disabled_reason;
    }

    public final Date getApi_disabled_until() {
        return this.api_disabled_until;
    }

    public final Date getBillable_usage_paused_until() {
        return this.billable_usage_paused_until;
    }

    public final String getBilling_type() {
        return this.billing_type;
    }

    public final List<Capability> getCapabilities() {
        return this.capabilities;
    }

    public final List<ModelOption> getClaude_ai_bootstrap_models_config() {
        return this.claude_ai_bootstrap_models_config;
    }

    public final String getFree_credits_status() {
        return this.free_credits_status;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRate_limit_tier() {
        return this.rate_limit_tier;
    }

    public final RateLimitUpsell getRate_limit_upsell() {
        return this.rate_limit_upsell;
    }

    public final RavenType getRaven_type() {
        return this.raven_type;
    }

    public final OrganizationSettings getSettings() {
        return this.settings;
    }

    /* JADX INFO: renamed from: getUuid-XjkXN6I, reason: not valid java name */
    public final String m116getUuidXjkXN6I() {
        return this.uuid;
    }

    public int hashCode() {
        int iM = kgh.m((this.settings.hashCode() + kgh.l(OrganizationId.m1069hashCodeimpl(this.uuid) * 31, 31, this.name)) * 31, 31, this.capabilities);
        RavenType ravenType = this.raven_type;
        int iHashCode = (iM + (ravenType == null ? 0 : ravenType.hashCode())) * 31;
        String str = this.rate_limit_tier;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.billing_type;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        RateLimitUpsell rateLimitUpsell = this.rate_limit_upsell;
        int iHashCode4 = (iHashCode3 + (rateLimitUpsell == null ? 0 : rateLimitUpsell.hashCode())) * 31;
        String str3 = this.free_credits_status;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.api_disabled_reason;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Date date = this.api_disabled_until;
        int iHashCode7 = (iHashCode6 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.billable_usage_paused_until;
        int iHashCode8 = (iHashCode7 + (date2 == null ? 0 : date2.hashCode())) * 31;
        List<ModelOption> list = this.claude_ai_bootstrap_models_config;
        return iHashCode8 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String strM1070toStringimpl = OrganizationId.m1070toStringimpl(this.uuid);
        String str = this.name;
        OrganizationSettings organizationSettings = this.settings;
        List<Capability> list = this.capabilities;
        RavenType ravenType = this.raven_type;
        String str2 = this.rate_limit_tier;
        String str3 = this.billing_type;
        RateLimitUpsell rateLimitUpsell = this.rate_limit_upsell;
        String str4 = this.free_credits_status;
        String str5 = this.api_disabled_reason;
        Date date = this.api_disabled_until;
        Date date2 = this.billable_usage_paused_until;
        List<ModelOption> list2 = this.claude_ai_bootstrap_models_config;
        StringBuilder sbR = kgh.r("Organization(uuid=", strM1070toStringimpl, ", name=", str, ", settings=");
        sbR.append(organizationSettings);
        sbR.append(", capabilities=");
        sbR.append(list);
        sbR.append(", raven_type=");
        sbR.append(ravenType);
        sbR.append(", rate_limit_tier=");
        sbR.append(str2);
        sbR.append(", billing_type=");
        sbR.append(str3);
        sbR.append(", rate_limit_upsell=");
        sbR.append(rateLimitUpsell);
        sbR.append(", free_credits_status=");
        kgh.u(sbR, str4, ", api_disabled_reason=", str5, ", api_disabled_until=");
        sbR.append(date);
        sbR.append(", billable_usage_paused_until=");
        sbR.append(date2);
        sbR.append(", claude_ai_bootstrap_models_config=");
        return gid.q(sbR, list2, ")");
    }

    public /* synthetic */ Organization(String str, String str2, OrganizationSettings organizationSettings, List list, RavenType ravenType, String str3, String str4, RateLimitUpsell rateLimitUpsell, String str5, String str6, Date date, Date date2, List list2, mq5 mq5Var) {
        this(str, str2, organizationSettings, list, ravenType, str3, str4, rateLimitUpsell, str5, str6, date, date2, list2);
    }

    public /* synthetic */ Organization(int i, String str, String str2, OrganizationSettings organizationSettings, List list, RavenType ravenType, String str3, String str4, RateLimitUpsell rateLimitUpsell, String str5, String str6, Date date, Date date2, List list2, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, organizationSettings, list, ravenType, str3, str4, rateLimitUpsell, str5, str6, date, date2, list2, vnfVar);
    }

    private Organization(String str, String str2, OrganizationSettings organizationSettings, List<Capability> list, RavenType ravenType, String str3, String str4, RateLimitUpsell rateLimitUpsell, String str5, String str6, Date date, Date date2, List<ModelOption> list2) {
        str.getClass();
        str2.getClass();
        organizationSettings.getClass();
        list.getClass();
        this.uuid = str;
        this.name = str2;
        this.settings = organizationSettings;
        this.capabilities = list;
        this.raven_type = ravenType;
        this.rate_limit_tier = str3;
        this.billing_type = str4;
        this.rate_limit_upsell = rateLimitUpsell;
        this.free_credits_status = str5;
        this.api_disabled_reason = str6;
        this.api_disabled_until = date;
        this.billable_usage_paused_until = date2;
        this.claude_ai_bootstrap_models_config = list2;
    }

    public /* synthetic */ Organization(String str, String str2, OrganizationSettings organizationSettings, List list, RavenType ravenType, String str3, String str4, RateLimitUpsell rateLimitUpsell, String str5, String str6, Date date, Date date2, List list2, int i, mq5 mq5Var) {
        this(str, str2, organizationSettings, list, (i & 16) != 0 ? null : ravenType, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : rateLimitUpsell, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? null : date, (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? null : date2, (i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? null : list2, null);
    }
}
