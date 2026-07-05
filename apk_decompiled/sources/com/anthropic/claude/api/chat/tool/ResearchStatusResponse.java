package com.anthropic.claude.api.chat.tool;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.afe;
import defpackage.ame;
import defpackage.bme;
import defpackage.gid;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.t2i;
import defpackage.uo0;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.yq;
import defpackage.zle;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002CDBq\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012B\u0085\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b#\u0010!J\u008a\u0001\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0018J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u001aJ\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+J'\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b2\u00103R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b9\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b:\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b=\u0010\u0018R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010!R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b@\u0010!R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010>\u001a\u0004\bA\u0010!¨\u0006E"}, d2 = {"Lcom/anthropic/claude/api/chat/tool/ResearchStatusResponse;", "", "", "started_at", "", "total_sources", "error", "research_headline", "Lcom/anthropic/claude/api/chat/tool/ResearchStatus;", "status", "finished_at", "", "top_icon_urls", "Lcom/anthropic/claude/api/chat/tool/TopSourceDomain;", "top_source_domains", "Lcom/anthropic/claude/api/chat/tool/AgentSummary;", "agent_summaries", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/tool/ResearchStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/tool/ResearchStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "()Lcom/anthropic/claude/api/chat/tool/ResearchStatus;", "component6", "component7", "()Ljava/util/List;", "component8", "component9", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/tool/ResearchStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/anthropic/claude/api/chat/tool/ResearchStatusResponse;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/tool/ResearchStatusResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getStarted_at", "I", "getTotal_sources", "getError", "getResearch_headline", "Lcom/anthropic/claude/api/chat/tool/ResearchStatus;", "getStatus", "getFinished_at", "Ljava/util/List;", "getTop_icon_urls", "getTop_source_domains", "getAgent_summaries", "Companion", "zle", "ame", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ResearchStatusResponse {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final ame Companion = new ame();
    private final List<AgentSummary> agent_summaries;
    private final String error;
    private final String finished_at;
    private final String research_headline;
    private final String started_at;
    private final ResearchStatus status;
    private final List<String> top_icon_urls;
    private final List<TopSourceDomain> top_source_domains;
    private final int total_sources;

    static {
        afe afeVar = new afe(6);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, null, null, null, yb5.w(w1aVar, afeVar), yb5.w(w1aVar, new afe(7)), yb5.w(w1aVar, new afe(8))};
    }

    public /* synthetic */ ResearchStatusResponse(int i, String str, int i2, String str2, String str3, ResearchStatus researchStatus, String str4, List list, List list2, List list3, vnf vnfVar) {
        if (507 != (i & 507)) {
            gvj.f(i, 507, zle.a.getDescriptor());
            throw null;
        }
        this.started_at = str;
        this.total_sources = i2;
        if ((i & 4) == 0) {
            this.error = null;
        } else {
            this.error = str2;
        }
        this.research_headline = str3;
        this.status = researchStatus;
        this.finished_at = str4;
        this.top_icon_urls = list;
        this.top_source_domains = list2;
        this.agent_summaries = list3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(t2i.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new uo0(yq.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResearchStatusResponse copy$default(ResearchStatusResponse researchStatusResponse, String str, int i, String str2, String str3, ResearchStatus researchStatus, String str4, List list, List list2, List list3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = researchStatusResponse.started_at;
        }
        if ((i2 & 2) != 0) {
            i = researchStatusResponse.total_sources;
        }
        if ((i2 & 4) != 0) {
            str2 = researchStatusResponse.error;
        }
        if ((i2 & 8) != 0) {
            str3 = researchStatusResponse.research_headline;
        }
        if ((i2 & 16) != 0) {
            researchStatus = researchStatusResponse.status;
        }
        if ((i2 & 32) != 0) {
            str4 = researchStatusResponse.finished_at;
        }
        if ((i2 & 64) != 0) {
            list = researchStatusResponse.top_icon_urls;
        }
        if ((i2 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            list2 = researchStatusResponse.top_source_domains;
        }
        if ((i2 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            list3 = researchStatusResponse.agent_summaries;
        }
        List list4 = list2;
        List list5 = list3;
        String str5 = str4;
        List list6 = list;
        ResearchStatus researchStatus2 = researchStatus;
        String str6 = str2;
        return researchStatusResponse.copy(str, i, str6, str3, researchStatus2, str5, list6, list4, list5);
    }

    public static final /* synthetic */ void write$Self$api(ResearchStatusResponse self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        srg srgVar = srg.a;
        output.B(serialDesc, 0, srgVar, self.started_at);
        output.l(1, self.total_sources, serialDesc);
        if (output.E(serialDesc) || self.error != null) {
            output.B(serialDesc, 2, srgVar, self.error);
        }
        output.B(serialDesc, 3, srgVar, self.research_headline);
        output.r(serialDesc, 4, bme.d, self.status);
        output.B(serialDesc, 5, srgVar, self.finished_at);
        output.B(serialDesc, 6, (znf) kw9VarArr[6].getValue(), self.top_icon_urls);
        output.B(serialDesc, 7, (znf) kw9VarArr[7].getValue(), self.top_source_domains);
        output.B(serialDesc, 8, (znf) kw9VarArr[8].getValue(), self.agent_summaries);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStarted_at() {
        return this.started_at;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTotal_sources() {
        return this.total_sources;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getResearch_headline() {
        return this.research_headline;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ResearchStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFinished_at() {
        return this.finished_at;
    }

    public final List<String> component7() {
        return this.top_icon_urls;
    }

    public final List<TopSourceDomain> component8() {
        return this.top_source_domains;
    }

    public final List<AgentSummary> component9() {
        return this.agent_summaries;
    }

    public final ResearchStatusResponse copy(String started_at, int total_sources, String error, String research_headline, ResearchStatus status, String finished_at, List<String> top_icon_urls, List<TopSourceDomain> top_source_domains, List<AgentSummary> agent_summaries) {
        status.getClass();
        return new ResearchStatusResponse(started_at, total_sources, error, research_headline, status, finished_at, top_icon_urls, top_source_domains, agent_summaries);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResearchStatusResponse)) {
            return false;
        }
        ResearchStatusResponse researchStatusResponse = (ResearchStatusResponse) other;
        return x44.r(this.started_at, researchStatusResponse.started_at) && this.total_sources == researchStatusResponse.total_sources && x44.r(this.error, researchStatusResponse.error) && x44.r(this.research_headline, researchStatusResponse.research_headline) && this.status == researchStatusResponse.status && x44.r(this.finished_at, researchStatusResponse.finished_at) && x44.r(this.top_icon_urls, researchStatusResponse.top_icon_urls) && x44.r(this.top_source_domains, researchStatusResponse.top_source_domains) && x44.r(this.agent_summaries, researchStatusResponse.agent_summaries);
    }

    public final List<AgentSummary> getAgent_summaries() {
        return this.agent_summaries;
    }

    public final String getError() {
        return this.error;
    }

    public final String getFinished_at() {
        return this.finished_at;
    }

    public final String getResearch_headline() {
        return this.research_headline;
    }

    public final String getStarted_at() {
        return this.started_at;
    }

    public final ResearchStatus getStatus() {
        return this.status;
    }

    public final List<String> getTop_icon_urls() {
        return this.top_icon_urls;
    }

    public final List<TopSourceDomain> getTop_source_domains() {
        return this.top_source_domains;
    }

    public final int getTotal_sources() {
        return this.total_sources;
    }

    public int hashCode() {
        String str = this.started_at;
        int iC = vb7.c(this.total_sources, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.error;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.research_headline;
        int iHashCode2 = (this.status.hashCode() + ((iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.finished_at;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.top_icon_urls;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<TopSourceDomain> list2 = this.top_source_domains;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<AgentSummary> list3 = this.agent_summaries;
        return iHashCode5 + (list3 != null ? list3.hashCode() : 0);
    }

    public String toString() {
        String str = this.started_at;
        int i = this.total_sources;
        String str2 = this.error;
        String str3 = this.research_headline;
        ResearchStatus researchStatus = this.status;
        String str4 = this.finished_at;
        List<String> list = this.top_icon_urls;
        List<TopSourceDomain> list2 = this.top_source_domains;
        List<AgentSummary> list3 = this.agent_summaries;
        StringBuilder sbP = ij0.p("ResearchStatusResponse(started_at=", str, i, ", total_sources=", ", error=");
        kgh.u(sbP, str2, ", research_headline=", str3, ", status=");
        sbP.append(researchStatus);
        sbP.append(", finished_at=");
        sbP.append(str4);
        sbP.append(", top_icon_urls=");
        sbP.append(list);
        sbP.append(", top_source_domains=");
        sbP.append(list2);
        sbP.append(", agent_summaries=");
        return gid.q(sbP, list3, ")");
    }

    public ResearchStatusResponse(String str, int i, String str2, String str3, ResearchStatus researchStatus, String str4, List<String> list, List<TopSourceDomain> list2, List<AgentSummary> list3) {
        researchStatus.getClass();
        this.started_at = str;
        this.total_sources = i;
        this.error = str2;
        this.research_headline = str3;
        this.status = researchStatus;
        this.finished_at = str4;
        this.top_icon_urls = list;
        this.top_source_domains = list2;
        this.agent_summaries = list3;
    }

    public /* synthetic */ ResearchStatusResponse(String str, int i, String str2, String str3, ResearchStatus researchStatus, String str4, List list, List list2, List list3, int i2, mq5 mq5Var) {
        this(str, i, (i2 & 4) != 0 ? null : str2, str3, researchStatus, str4, list, list2, list3);
    }
}
