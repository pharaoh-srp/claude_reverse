package com.anthropic.claude.models.organization.configtypes;

import defpackage.apd;
import defpackage.bpd;
import defpackage.grc;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vnf;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006&"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/ProjectUploadLimits;", "", "", "project_file_size_limit_mb", "<init>", "(J)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IJLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/ProjectUploadLimits;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "copy", "(J)Lcom/anthropic/claude/models/organization/configtypes/ProjectUploadLimits;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getProject_file_size_limit_mb", "Companion", "apd", "bpd", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ProjectUploadLimits {
    public static final int $stable = 0;
    public static final bpd Companion = new bpd();
    private final long project_file_size_limit_mb;

    public /* synthetic */ ProjectUploadLimits(int i, long j, vnf vnfVar) {
        if (1 == (i & 1)) {
            this.project_file_size_limit_mb = j;
        } else {
            gvj.f(i, 1, apd.a.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ ProjectUploadLimits copy$default(ProjectUploadLimits projectUploadLimits, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = projectUploadLimits.project_file_size_limit_mb;
        }
        return projectUploadLimits.copy(j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getProject_file_size_limit_mb() {
        return this.project_file_size_limit_mb;
    }

    public final ProjectUploadLimits copy(long project_file_size_limit_mb) {
        return new ProjectUploadLimits(project_file_size_limit_mb);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ProjectUploadLimits) && this.project_file_size_limit_mb == ((ProjectUploadLimits) other).project_file_size_limit_mb;
    }

    public final long getProject_file_size_limit_mb() {
        return this.project_file_size_limit_mb;
    }

    public int hashCode() {
        return Long.hashCode(this.project_file_size_limit_mb);
    }

    public String toString() {
        return grc.q(this.project_file_size_limit_mb, "ProjectUploadLimits(project_file_size_limit_mb=", ")");
    }

    public ProjectUploadLimits(long j) {
        this.project_file_size_limit_mb = j;
    }
}
