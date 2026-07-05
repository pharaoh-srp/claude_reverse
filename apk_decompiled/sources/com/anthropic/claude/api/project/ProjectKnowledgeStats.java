package com.anthropic.claude.api.project;

import defpackage.bnd;
import defpackage.cnd;
import defpackage.grc;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.xka;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB=\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ:\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001e¨\u00063"}, d2 = {"Lcom/anthropic/claude/api/project/ProjectKnowledgeStats;", "", "", "knowledge_size", "max_knowledge_size", "project_knowledge_search_threshold", "", "use_project_knowledge_search", "<init>", "(JJLjava/lang/Long;Z)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IJJLjava/lang/Long;ZLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/project/ProjectKnowledgeStats;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "component3", "()Ljava/lang/Long;", "component4", "()Z", "copy", "(JJLjava/lang/Long;Z)Lcom/anthropic/claude/api/project/ProjectKnowledgeStats;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getKnowledge_size", "getMax_knowledge_size", "Ljava/lang/Long;", "getProject_knowledge_search_threshold", "Z", "getUse_project_knowledge_search", "Companion", "bnd", "cnd", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ProjectKnowledgeStats {
    public static final int $stable = 0;
    public static final cnd Companion = new cnd();
    private final long knowledge_size;
    private final long max_knowledge_size;
    private final Long project_knowledge_search_threshold;
    private final boolean use_project_knowledge_search;

    public /* synthetic */ ProjectKnowledgeStats(int i, long j, long j2, Long l, boolean z, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, bnd.a.getDescriptor());
            throw null;
        }
        this.knowledge_size = j;
        this.max_knowledge_size = j2;
        this.project_knowledge_search_threshold = l;
        this.use_project_knowledge_search = z;
    }

    public static /* synthetic */ ProjectKnowledgeStats copy$default(ProjectKnowledgeStats projectKnowledgeStats, long j, long j2, Long l, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = projectKnowledgeStats.knowledge_size;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = projectKnowledgeStats.max_knowledge_size;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            l = projectKnowledgeStats.project_knowledge_search_threshold;
        }
        Long l2 = l;
        if ((i & 8) != 0) {
            z = projectKnowledgeStats.use_project_knowledge_search;
        }
        return projectKnowledgeStats.copy(j3, j4, l2, z);
    }

    public static final /* synthetic */ void write$Self$api(ProjectKnowledgeStats self, vd4 output, SerialDescriptor serialDesc) {
        output.D(serialDesc, 0, self.knowledge_size);
        output.D(serialDesc, 1, self.max_knowledge_size);
        output.B(serialDesc, 2, xka.a, self.project_knowledge_search_threshold);
        output.p(serialDesc, 3, self.use_project_knowledge_search);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getKnowledge_size() {
        return this.knowledge_size;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getMax_knowledge_size() {
        return this.max_knowledge_size;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getProject_knowledge_search_threshold() {
        return this.project_knowledge_search_threshold;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getUse_project_knowledge_search() {
        return this.use_project_knowledge_search;
    }

    public final ProjectKnowledgeStats copy(long knowledge_size, long max_knowledge_size, Long project_knowledge_search_threshold, boolean use_project_knowledge_search) {
        return new ProjectKnowledgeStats(knowledge_size, max_knowledge_size, project_knowledge_search_threshold, use_project_knowledge_search);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProjectKnowledgeStats)) {
            return false;
        }
        ProjectKnowledgeStats projectKnowledgeStats = (ProjectKnowledgeStats) other;
        return this.knowledge_size == projectKnowledgeStats.knowledge_size && this.max_knowledge_size == projectKnowledgeStats.max_knowledge_size && x44.r(this.project_knowledge_search_threshold, projectKnowledgeStats.project_knowledge_search_threshold) && this.use_project_knowledge_search == projectKnowledgeStats.use_project_knowledge_search;
    }

    public final long getKnowledge_size() {
        return this.knowledge_size;
    }

    public final long getMax_knowledge_size() {
        return this.max_knowledge_size;
    }

    public final Long getProject_knowledge_search_threshold() {
        return this.project_knowledge_search_threshold;
    }

    public final boolean getUse_project_knowledge_search() {
        return this.use_project_knowledge_search;
    }

    public int hashCode() {
        int iE = vb7.e(Long.hashCode(this.knowledge_size) * 31, 31, this.max_knowledge_size);
        Long l = this.project_knowledge_search_threshold;
        return Boolean.hashCode(this.use_project_knowledge_search) + ((iE + (l == null ? 0 : l.hashCode())) * 31);
    }

    public String toString() {
        long j = this.knowledge_size;
        long j2 = this.max_knowledge_size;
        Long l = this.project_knowledge_search_threshold;
        boolean z = this.use_project_knowledge_search;
        StringBuilder sbW = grc.w(j, "ProjectKnowledgeStats(knowledge_size=", ", max_knowledge_size=");
        sbW.append(j2);
        sbW.append(", project_knowledge_search_threshold=");
        sbW.append(l);
        sbW.append(", use_project_knowledge_search=");
        sbW.append(z);
        sbW.append(")");
        return sbW.toString();
    }

    public ProjectKnowledgeStats(long j, long j2, Long l, boolean z) {
        this.knowledge_size = j;
        this.max_knowledge_size = j2;
        this.project_knowledge_search_threshold = l;
        this.use_project_knowledge_search = z;
    }
}
