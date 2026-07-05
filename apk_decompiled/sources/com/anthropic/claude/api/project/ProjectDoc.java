package com.anthropic.claude.api.project;

import com.anthropic.claude.types.strings.ProjectDocId;
import com.anthropic.claude.types.strings.ProjectId;
import defpackage.bc9;
import defpackage.ebh;
import defpackage.emd;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.old;
import defpackage.onf;
import defpackage.pld;
import defpackage.qld;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import java.util.Date;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:;BF\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0019\u0010\u000b\u001a\u00150\u0006j\u0002`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010BM\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010 J#\u0010#\u001a\u00150\u0006j\u0002`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b%\u0010 J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010 JW\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001b\b\u0002\u0010\u000b\u001a\u00150\u0006j\u0002`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b+\u0010 J\u0010\u0010,\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b4\u0010 R*\u0010\u000b\u001a\u00150\u0006j\u0002`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010$R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b7\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b8\u0010 ¨\u0006<"}, d2 = {"Lcom/anthropic/claude/api/project/ProjectDoc;", "", "Lcom/anthropic/claude/types/strings/ProjectDocId;", "uuid", "", "file_name", "Ljava/util/Date;", "Lcom/anthropic/claude/api/Iso8601Date;", "Lonf;", "with", "Lbc9;", "created_at", "Lcom/anthropic/claude/types/strings/ProjectId;", "project_uuid", "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/project/ProjectDoc;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-H8pzoGc", "()Ljava/lang/String;", "component1", "component2", "component3", "()Ljava/util/Date;", "component4-5pmjb-U", "component4", "component5", "copy-YWEWlc8", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/project/ProjectDoc;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid-H8pzoGc", "getFile_name", "Ljava/util/Date;", "getCreated_at", "getProject_uuid-5pmjb-U", "getContent", "Companion", "old", "pld", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ProjectDoc {
    public static final int $stable = 0;
    public static final pld Companion = new pld();
    private final String content;
    private final Date created_at;
    private final String file_name;
    private final String project_uuid;
    private final String uuid;

    private /* synthetic */ ProjectDoc(int i, String str, String str2, Date date, String str3, String str4, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, old.a.getDescriptor());
            throw null;
        }
        this.uuid = str;
        this.file_name = str2;
        this.created_at = date;
        this.project_uuid = str3;
        if ((i & 16) == 0) {
            this.content = null;
        } else {
            this.content = str4;
        }
    }

    /* JADX INFO: renamed from: copy-YWEWlc8$default, reason: not valid java name */
    public static /* synthetic */ ProjectDoc m409copyYWEWlc8$default(ProjectDoc projectDoc, String str, String str2, Date date, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = projectDoc.uuid;
        }
        if ((i & 2) != 0) {
            str2 = projectDoc.file_name;
        }
        if ((i & 4) != 0) {
            date = projectDoc.created_at;
        }
        if ((i & 8) != 0) {
            str3 = projectDoc.project_uuid;
        }
        if ((i & 16) != 0) {
            str4 = projectDoc.content;
        }
        String str5 = str4;
        Date date2 = date;
        return projectDoc.m412copyYWEWlc8(str, str2, date2, str3, str5);
    }

    public static final /* synthetic */ void write$Self$api(ProjectDoc self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, qld.a, ProjectDocId.m1072boximpl(self.uuid));
        output.q(serialDesc, 1, self.file_name);
        output.r(serialDesc, 2, bc9.a, self.created_at);
        output.r(serialDesc, 3, emd.a, ProjectId.m1079boximpl(self.project_uuid));
        if (!output.E(serialDesc) && self.content == null) {
            return;
        }
        output.B(serialDesc, 4, srg.a, self.content);
    }

    /* JADX INFO: renamed from: component1-H8pzoGc, reason: not valid java name and from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFile_name() {
        return this.file_name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component4-5pmjb-U, reason: not valid java name and from getter */
    public final String getProject_uuid() {
        return this.project_uuid;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: copy-YWEWlc8, reason: not valid java name */
    public final ProjectDoc m412copyYWEWlc8(String uuid, String file_name, Date created_at, String project_uuid, String content) {
        uuid.getClass();
        file_name.getClass();
        created_at.getClass();
        project_uuid.getClass();
        return new ProjectDoc(uuid, file_name, created_at, project_uuid, content, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProjectDoc)) {
            return false;
        }
        ProjectDoc projectDoc = (ProjectDoc) other;
        return ProjectDocId.m1075equalsimpl0(this.uuid, projectDoc.uuid) && x44.r(this.file_name, projectDoc.file_name) && x44.r(this.created_at, projectDoc.created_at) && ProjectId.m1082equalsimpl0(this.project_uuid, projectDoc.project_uuid) && x44.r(this.content, projectDoc.content);
    }

    public final String getContent() {
        return this.content;
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    public final String getFile_name() {
        return this.file_name;
    }

    /* JADX INFO: renamed from: getProject_uuid-5pmjb-U, reason: not valid java name */
    public final String m413getProject_uuid5pmjbU() {
        return this.project_uuid;
    }

    /* JADX INFO: renamed from: getUuid-H8pzoGc, reason: not valid java name */
    public final String m414getUuidH8pzoGc() {
        return this.uuid;
    }

    public int hashCode() {
        int iM1083hashCodeimpl = (ProjectId.m1083hashCodeimpl(this.project_uuid) + ebh.j(this.created_at, kgh.l(ProjectDocId.m1076hashCodeimpl(this.uuid) * 31, 31, this.file_name), 31)) * 31;
        String str = this.content;
        return iM1083hashCodeimpl + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String strM1077toStringimpl = ProjectDocId.m1077toStringimpl(this.uuid);
        String str = this.file_name;
        Date date = this.created_at;
        String strM1084toStringimpl = ProjectId.m1084toStringimpl(this.project_uuid);
        String str2 = this.content;
        StringBuilder sbR = kgh.r("ProjectDoc(uuid=", strM1077toStringimpl, ", file_name=", str, ", created_at=");
        sbR.append(date);
        sbR.append(", project_uuid=");
        sbR.append(strM1084toStringimpl);
        sbR.append(", content=");
        return ij0.m(sbR, str2, ")");
    }

    public /* synthetic */ ProjectDoc(String str, String str2, Date date, String str3, String str4, mq5 mq5Var) {
        this(str, str2, date, str3, str4);
    }

    public /* synthetic */ ProjectDoc(int i, String str, String str2, Date date, String str3, String str4, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, date, str3, str4, vnfVar);
    }

    private ProjectDoc(String str, String str2, Date date, String str3, String str4) {
        str.getClass();
        str2.getClass();
        date.getClass();
        str3.getClass();
        this.uuid = str;
        this.file_name = str2;
        this.created_at = date;
        this.project_uuid = str3;
        this.content = str4;
    }

    public /* synthetic */ ProjectDoc(String str, String str2, Date date, String str3, String str4, int i, mq5 mq5Var) {
        this(str, str2, date, str3, (i & 16) != 0 ? null : str4, null);
    }
}
