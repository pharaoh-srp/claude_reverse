package com.anthropic.claude.api.chat.tool;

import defpackage.b5;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.ms6;
import defpackage.onf;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.yq;
import defpackage.znf;
import defpackage.zq;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBQ\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001aJL\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u001cJ\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b0\u0010\u001a¨\u00064"}, d2 = {"Lcom/anthropic/claude/api/chat/tool/AgentSummary;", "", "", "description", "", "total_sources", "", "top_icon_urls", "started_at", "completed_at", "<init>", "(Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/tool/AgentSummary;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Ljava/util/List;", "component4", "component5", "copy", "(Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/chat/tool/AgentSummary;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDescription", "I", "getTotal_sources", "Ljava/util/List;", "getTop_icon_urls", "getStarted_at", "getCompleted_at", "Companion", "yq", "zq", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class AgentSummary {
    public static final int $stable = 0;
    private final String completed_at;
    private final String description;
    private final String started_at;
    private final List<String> top_icon_urls;
    private final int total_sources;
    public static final zq Companion = new zq();
    private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new b5(13)), null, null};

    public /* synthetic */ AgentSummary(int i, String str, int i2, List list, String str2, String str3, vnf vnfVar) {
        if (31 != (i & 31)) {
            gvj.f(i, 31, yq.a.getDescriptor());
            throw null;
        }
        this.description = str;
        this.total_sources = i2;
        this.top_icon_urls = list;
        this.started_at = str2;
        this.completed_at = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AgentSummary copy$default(AgentSummary agentSummary, String str, int i, List list, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = agentSummary.description;
        }
        if ((i2 & 2) != 0) {
            i = agentSummary.total_sources;
        }
        if ((i2 & 4) != 0) {
            list = agentSummary.top_icon_urls;
        }
        if ((i2 & 8) != 0) {
            str2 = agentSummary.started_at;
        }
        if ((i2 & 16) != 0) {
            str3 = agentSummary.completed_at;
        }
        String str4 = str3;
        List list2 = list;
        return agentSummary.copy(str, i, list2, str2, str4);
    }

    public static final /* synthetic */ void write$Self$api(AgentSummary self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.description);
        output.l(1, self.total_sources, serialDesc);
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.top_icon_urls);
        srg srgVar = srg.a;
        output.B(serialDesc, 3, srgVar, self.started_at);
        output.B(serialDesc, 4, srgVar, self.completed_at);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTotal_sources() {
        return this.total_sources;
    }

    public final List<String> component3() {
        return this.top_icon_urls;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStarted_at() {
        return this.started_at;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCompleted_at() {
        return this.completed_at;
    }

    public final AgentSummary copy(String description, int total_sources, List<String> top_icon_urls, String started_at, String completed_at) {
        description.getClass();
        top_icon_urls.getClass();
        return new AgentSummary(description, total_sources, top_icon_urls, started_at, completed_at);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgentSummary)) {
            return false;
        }
        AgentSummary agentSummary = (AgentSummary) other;
        return x44.r(this.description, agentSummary.description) && this.total_sources == agentSummary.total_sources && x44.r(this.top_icon_urls, agentSummary.top_icon_urls) && x44.r(this.started_at, agentSummary.started_at) && x44.r(this.completed_at, agentSummary.completed_at);
    }

    public final String getCompleted_at() {
        return this.completed_at;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getStarted_at() {
        return this.started_at;
    }

    public final List<String> getTop_icon_urls() {
        return this.top_icon_urls;
    }

    public final int getTotal_sources() {
        return this.total_sources;
    }

    public int hashCode() {
        int iM = kgh.m(vb7.c(this.total_sources, this.description.hashCode() * 31, 31), 31, this.top_icon_urls);
        String str = this.started_at;
        int iHashCode = (iM + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.completed_at;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.description;
        int i = this.total_sources;
        List<String> list = this.top_icon_urls;
        String str2 = this.started_at;
        String str3 = this.completed_at;
        StringBuilder sbP = ij0.p("AgentSummary(description=", str, i, ", total_sources=", ", top_icon_urls=");
        ms6.x(", started_at=", str2, ", completed_at=", sbP, list);
        return ij0.m(sbP, str3, ")");
    }

    public AgentSummary(String str, int i, List<String> list, String str2, String str3) {
        str.getClass();
        list.getClass();
        this.description = str;
        this.total_sources = i;
        this.top_icon_urls = list;
        this.started_at = str2;
        this.completed_at = str3;
    }
}
