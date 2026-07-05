package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.lpd;
import defpackage.mdj;
import defpackage.mpd;
import defpackage.mq5;
import defpackage.onf;
import defpackage.rod;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>?B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBU\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b%\u0010&JN\u0010'\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001eJ\u0010\u0010*\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b4\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b:\u0010&R\u0014\u0010<\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u001e¨\u0006@"}, d2 = {"com/anthropic/claude/analytics/events/ProjectsEvents$ProjectFileAdded", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "project_uuid", "file_uuid", "", "file_length", "Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectFileSource;", "source", "Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectUploadSource;", "upload_source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectFileSource;Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectUploadSource;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectFileSource;Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectUploadSource;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectFileAdded;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectFileAdded;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()J", "component5", "()Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectFileSource;", "component6", "()Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectUploadSource;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectFileSource;Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectUploadSource;)Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectFileAdded;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getProject_uuid", "getFile_uuid", "J", "getFile_length", "Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectFileSource;", "getSource", "Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectUploadSource;", "getUpload_source", "getEventName", "eventName", "Companion", "lpd", "mpd", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ProjectsEvents$ProjectFileAdded implements AnalyticsEvent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final mpd Companion = new mpd();
    private final long file_length;
    private final String file_uuid;
    private final String organization_uuid;
    private final String project_uuid;
    private final ProjectsEvents$ProjectFileSource source;
    private final ProjectsEvents$ProjectUploadSource upload_source;

    static {
        rod rodVar = new rod(6);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, null, yb5.w(w1aVar, rodVar), yb5.w(w1aVar, new rod(7))};
    }

    public /* synthetic */ ProjectsEvents$ProjectFileAdded(int i, String str, String str2, String str3, long j, ProjectsEvents$ProjectFileSource projectsEvents$ProjectFileSource, ProjectsEvents$ProjectUploadSource projectsEvents$ProjectUploadSource, vnf vnfVar) {
        if (31 != (i & 31)) {
            gvj.f(i, 31, lpd.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.project_uuid = str2;
        this.file_uuid = str3;
        this.file_length = j;
        this.source = projectsEvents$ProjectFileSource;
        if ((i & 32) == 0) {
            this.upload_source = null;
        } else {
            this.upload_source = projectsEvents$ProjectUploadSource;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ProjectsEvents$ProjectFileSource.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return ProjectsEvents$ProjectUploadSource.Companion.serializer();
    }

    public static /* synthetic */ ProjectsEvents$ProjectFileAdded copy$default(ProjectsEvents$ProjectFileAdded projectsEvents$ProjectFileAdded, String str, String str2, String str3, long j, ProjectsEvents$ProjectFileSource projectsEvents$ProjectFileSource, ProjectsEvents$ProjectUploadSource projectsEvents$ProjectUploadSource, int i, Object obj) {
        if ((i & 1) != 0) {
            str = projectsEvents$ProjectFileAdded.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = projectsEvents$ProjectFileAdded.project_uuid;
        }
        if ((i & 4) != 0) {
            str3 = projectsEvents$ProjectFileAdded.file_uuid;
        }
        if ((i & 8) != 0) {
            j = projectsEvents$ProjectFileAdded.file_length;
        }
        if ((i & 16) != 0) {
            projectsEvents$ProjectFileSource = projectsEvents$ProjectFileAdded.source;
        }
        if ((i & 32) != 0) {
            projectsEvents$ProjectUploadSource = projectsEvents$ProjectFileAdded.upload_source;
        }
        long j2 = j;
        String str4 = str3;
        return projectsEvents$ProjectFileAdded.copy(str, str2, str4, j2, projectsEvents$ProjectFileSource, projectsEvents$ProjectUploadSource);
    }

    public static final /* synthetic */ void write$Self$analytics(ProjectsEvents$ProjectFileAdded self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.project_uuid);
        output.q(serialDesc, 2, self.file_uuid);
        output.D(serialDesc, 3, self.file_length);
        output.r(serialDesc, 4, (znf) kw9VarArr[4].getValue(), self.source);
        if (!output.E(serialDesc) && self.upload_source == null) {
            return;
        }
        output.B(serialDesc, 5, (znf) kw9VarArr[5].getValue(), self.upload_source);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProject_uuid() {
        return this.project_uuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFile_uuid() {
        return this.file_uuid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getFile_length() {
        return this.file_length;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ProjectsEvents$ProjectFileSource getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ProjectsEvents$ProjectUploadSource getUpload_source() {
        return this.upload_source;
    }

    public final ProjectsEvents$ProjectFileAdded copy(String organization_uuid, String project_uuid, String file_uuid, long file_length, ProjectsEvents$ProjectFileSource source, ProjectsEvents$ProjectUploadSource upload_source) {
        organization_uuid.getClass();
        project_uuid.getClass();
        file_uuid.getClass();
        source.getClass();
        return new ProjectsEvents$ProjectFileAdded(organization_uuid, project_uuid, file_uuid, file_length, source, upload_source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProjectsEvents$ProjectFileAdded)) {
            return false;
        }
        ProjectsEvents$ProjectFileAdded projectsEvents$ProjectFileAdded = (ProjectsEvents$ProjectFileAdded) other;
        return x44.r(this.organization_uuid, projectsEvents$ProjectFileAdded.organization_uuid) && x44.r(this.project_uuid, projectsEvents$ProjectFileAdded.project_uuid) && x44.r(this.file_uuid, projectsEvents$ProjectFileAdded.file_uuid) && this.file_length == projectsEvents$ProjectFileAdded.file_length && this.source == projectsEvents$ProjectFileAdded.source && this.upload_source == projectsEvents$ProjectFileAdded.upload_source;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_project_file_added";
    }

    public final long getFile_length() {
        return this.file_length;
    }

    public final String getFile_uuid() {
        return this.file_uuid;
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getProject_uuid() {
        return this.project_uuid;
    }

    public final ProjectsEvents$ProjectFileSource getSource() {
        return this.source;
    }

    public final ProjectsEvents$ProjectUploadSource getUpload_source() {
        return this.upload_source;
    }

    public int hashCode() {
        int iHashCode = (this.source.hashCode() + vb7.e(kgh.l(kgh.l(this.organization_uuid.hashCode() * 31, 31, this.project_uuid), 31, this.file_uuid), 31, this.file_length)) * 31;
        ProjectsEvents$ProjectUploadSource projectsEvents$ProjectUploadSource = this.upload_source;
        return iHashCode + (projectsEvents$ProjectUploadSource == null ? 0 : projectsEvents$ProjectUploadSource.hashCode());
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.project_uuid;
        String str3 = this.file_uuid;
        long j = this.file_length;
        ProjectsEvents$ProjectFileSource projectsEvents$ProjectFileSource = this.source;
        ProjectsEvents$ProjectUploadSource projectsEvents$ProjectUploadSource = this.upload_source;
        StringBuilder sbR = kgh.r("ProjectFileAdded(organization_uuid=", str, ", project_uuid=", str2, ", file_uuid=");
        sbR.append(str3);
        sbR.append(", file_length=");
        sbR.append(j);
        sbR.append(", source=");
        sbR.append(projectsEvents$ProjectFileSource);
        sbR.append(", upload_source=");
        sbR.append(projectsEvents$ProjectUploadSource);
        sbR.append(")");
        return sbR.toString();
    }

    public ProjectsEvents$ProjectFileAdded(String str, String str2, String str3, long j, ProjectsEvents$ProjectFileSource projectsEvents$ProjectFileSource, ProjectsEvents$ProjectUploadSource projectsEvents$ProjectUploadSource) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        projectsEvents$ProjectFileSource.getClass();
        this.organization_uuid = str;
        this.project_uuid = str2;
        this.file_uuid = str3;
        this.file_length = j;
        this.source = projectsEvents$ProjectFileSource;
        this.upload_source = projectsEvents$ProjectUploadSource;
    }

    public /* synthetic */ ProjectsEvents$ProjectFileAdded(String str, String str2, String str3, long j, ProjectsEvents$ProjectFileSource projectsEvents$ProjectFileSource, ProjectsEvents$ProjectUploadSource projectsEvents$ProjectUploadSource, int i, mq5 mq5Var) {
        this(str, str2, str3, j, projectsEvents$ProjectFileSource, (i & 32) != 0 ? null : projectsEvents$ProjectUploadSource);
    }
}
