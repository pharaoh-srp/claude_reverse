package com.anthropic.claude.api.tasks;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.bc9;
import defpackage.e79;
import defpackage.ebh;
import defpackage.f9h;
import defpackage.g9h;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.j9h;
import defpackage.kgh;
import defpackage.ks1;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import java.util.Date;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 O2\u00020\u0001:\u0002PQB\u0099\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0019\u0010\u0014\u001a\u00150\u000fj\u0002`\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0013\u0012\u0019\u0010\u0015\u001a\u00150\u000fj\u0002`\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0013¢\u0006\u0004\b\u0016\u0010\u0017B\u0087\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0016\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0012\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b)\u0010(J#\u0010*\u001a\u00150\u000fj\u0002`\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0013HÆ\u0003¢\u0006\u0004\b*\u0010+J#\u0010,\u001a\u00150\u000fj\u0002`\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0013HÆ\u0003¢\u0006\u0004\b,\u0010+J®\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u001b\b\u0002\u0010\u0014\u001a\u00150\u000fj\u0002`\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u00132\u001b\b\u0002\u0010\u0015\u001a\u00150\u000fj\u0002`\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0013HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010\u001dJ\u0010\u00100\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b0\u0010\u001fJ\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104J'\u0010=\u001a\u00020:2\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0001¢\u0006\u0004\b;\u0010<R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010>\u001a\u0004\b?\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010@\u001a\u0004\bA\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010>\u001a\u0004\bB\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010>\u001a\u0004\bC\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010D\u001a\u0004\bE\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\bF\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010G\u001a\u0004\bH\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010I\u001a\u0004\bJ\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010I\u001a\u0004\bK\u0010(R*\u0010\u0014\u001a\u00150\u000fj\u0002`\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010L\u001a\u0004\bM\u0010+R*\u0010\u0015\u001a\u00150\u000fj\u0002`\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010L\u001a\u0004\bN\u0010+¨\u0006R"}, d2 = {"Lcom/anthropic/claude/api/tasks/TaskStepResponse;", "", "", "uuid", "", "position", "title", "notes", "Lcom/anthropic/claude/api/tasks/TaskStepStatus;", "status", "status_description", "Lcom/anthropic/claude/api/tasks/BlockingToolDetail;", "blocking_tool", "sub_items_completed", "sub_items_total", "Ljava/util/Date;", "Lcom/anthropic/claude/api/Iso8601Date;", "Lonf;", "with", "Lbc9;", "created_at", "updated_at", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/tasks/TaskStepStatus;Ljava/lang/String;Lcom/anthropic/claude/api/tasks/BlockingToolDetail;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/tasks/TaskStepStatus;Ljava/lang/String;Lcom/anthropic/claude/api/tasks/BlockingToolDetail;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "()Lcom/anthropic/claude/api/tasks/TaskStepStatus;", "component6", "component7", "()Lcom/anthropic/claude/api/tasks/BlockingToolDetail;", "component8", "()Ljava/lang/Integer;", "component9", "component10", "()Ljava/util/Date;", "component11", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/tasks/TaskStepStatus;Ljava/lang/String;Lcom/anthropic/claude/api/tasks/BlockingToolDetail;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;)Lcom/anthropic/claude/api/tasks/TaskStepResponse;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/tasks/TaskStepResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getUuid", "I", "getPosition", "getTitle", "getNotes", "Lcom/anthropic/claude/api/tasks/TaskStepStatus;", "getStatus", "getStatus_description", "Lcom/anthropic/claude/api/tasks/BlockingToolDetail;", "getBlocking_tool", "Ljava/lang/Integer;", "getSub_items_completed", "getSub_items_total", "Ljava/util/Date;", "getCreated_at", "getUpdated_at", "Companion", "f9h", "g9h", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class TaskStepResponse {
    public static final int $stable = 0;
    public static final g9h Companion = new g9h();
    private final BlockingToolDetail blocking_tool;
    private final Date created_at;
    private final String notes;
    private final int position;
    private final TaskStepStatus status;
    private final String status_description;
    private final Integer sub_items_completed;
    private final Integer sub_items_total;
    private final String title;
    private final Date updated_at;
    private final String uuid;

    public /* synthetic */ TaskStepResponse(int i, String str, int i2, String str2, String str3, TaskStepStatus taskStepStatus, String str4, BlockingToolDetail blockingToolDetail, Integer num, Integer num2, Date date, Date date2, vnf vnfVar) {
        if (1559 != (i & 1559)) {
            gvj.f(i, 1559, f9h.a.getDescriptor());
            throw null;
        }
        this.uuid = str;
        this.position = i2;
        this.title = str2;
        if ((i & 8) == 0) {
            this.notes = null;
        } else {
            this.notes = str3;
        }
        this.status = taskStepStatus;
        if ((i & 32) == 0) {
            this.status_description = null;
        } else {
            this.status_description = str4;
        }
        if ((i & 64) == 0) {
            this.blocking_tool = null;
        } else {
            this.blocking_tool = blockingToolDetail;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.sub_items_completed = null;
        } else {
            this.sub_items_completed = num;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.sub_items_total = null;
        } else {
            this.sub_items_total = num2;
        }
        this.created_at = date;
        this.updated_at = date2;
    }

    public static /* synthetic */ TaskStepResponse copy$default(TaskStepResponse taskStepResponse, String str, int i, String str2, String str3, TaskStepStatus taskStepStatus, String str4, BlockingToolDetail blockingToolDetail, Integer num, Integer num2, Date date, Date date2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = taskStepResponse.uuid;
        }
        if ((i2 & 2) != 0) {
            i = taskStepResponse.position;
        }
        if ((i2 & 4) != 0) {
            str2 = taskStepResponse.title;
        }
        if ((i2 & 8) != 0) {
            str3 = taskStepResponse.notes;
        }
        if ((i2 & 16) != 0) {
            taskStepStatus = taskStepResponse.status;
        }
        if ((i2 & 32) != 0) {
            str4 = taskStepResponse.status_description;
        }
        if ((i2 & 64) != 0) {
            blockingToolDetail = taskStepResponse.blocking_tool;
        }
        if ((i2 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            num = taskStepResponse.sub_items_completed;
        }
        if ((i2 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            num2 = taskStepResponse.sub_items_total;
        }
        if ((i2 & 512) != 0) {
            date = taskStepResponse.created_at;
        }
        if ((i2 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
            date2 = taskStepResponse.updated_at;
        }
        Date date3 = date;
        Date date4 = date2;
        Integer num3 = num;
        Integer num4 = num2;
        String str5 = str4;
        BlockingToolDetail blockingToolDetail2 = blockingToolDetail;
        TaskStepStatus taskStepStatus2 = taskStepStatus;
        String str6 = str2;
        return taskStepResponse.copy(str, i, str6, str3, taskStepStatus2, str5, blockingToolDetail2, num3, num4, date3, date4);
    }

    public static final /* synthetic */ void write$Self$api(TaskStepResponse self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.uuid);
        output.l(1, self.position, serialDesc);
        output.q(serialDesc, 2, self.title);
        if (output.E(serialDesc) || self.notes != null) {
            output.B(serialDesc, 3, srg.a, self.notes);
        }
        output.r(serialDesc, 4, j9h.d, self.status);
        if (output.E(serialDesc) || self.status_description != null) {
            output.B(serialDesc, 5, srg.a, self.status_description);
        }
        if (output.E(serialDesc) || self.blocking_tool != null) {
            output.B(serialDesc, 6, ks1.a, self.blocking_tool);
        }
        if (output.E(serialDesc) || self.sub_items_completed != null) {
            output.B(serialDesc, 7, e79.a, self.sub_items_completed);
        }
        if (output.E(serialDesc) || self.sub_items_total != null) {
            output.B(serialDesc, 8, e79.a, self.sub_items_total);
        }
        bc9 bc9Var = bc9.a;
        output.r(serialDesc, 9, bc9Var, self.created_at);
        output.r(serialDesc, 10, bc9Var, self.updated_at);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Date getUpdated_at() {
        return this.updated_at;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNotes() {
        return this.notes;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TaskStepStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStatus_description() {
        return this.status_description;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BlockingToolDetail getBlocking_tool() {
        return this.blocking_tool;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getSub_items_completed() {
        return this.sub_items_completed;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getSub_items_total() {
        return this.sub_items_total;
    }

    public final TaskStepResponse copy(String uuid, int position, String title, String notes, TaskStepStatus status, String status_description, BlockingToolDetail blocking_tool, Integer sub_items_completed, Integer sub_items_total, Date created_at, Date updated_at) {
        uuid.getClass();
        title.getClass();
        status.getClass();
        created_at.getClass();
        updated_at.getClass();
        return new TaskStepResponse(uuid, position, title, notes, status, status_description, blocking_tool, sub_items_completed, sub_items_total, created_at, updated_at);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaskStepResponse)) {
            return false;
        }
        TaskStepResponse taskStepResponse = (TaskStepResponse) other;
        return x44.r(this.uuid, taskStepResponse.uuid) && this.position == taskStepResponse.position && x44.r(this.title, taskStepResponse.title) && x44.r(this.notes, taskStepResponse.notes) && this.status == taskStepResponse.status && x44.r(this.status_description, taskStepResponse.status_description) && x44.r(this.blocking_tool, taskStepResponse.blocking_tool) && x44.r(this.sub_items_completed, taskStepResponse.sub_items_completed) && x44.r(this.sub_items_total, taskStepResponse.sub_items_total) && x44.r(this.created_at, taskStepResponse.created_at) && x44.r(this.updated_at, taskStepResponse.updated_at);
    }

    public final BlockingToolDetail getBlocking_tool() {
        return this.blocking_tool;
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final int getPosition() {
        return this.position;
    }

    public final TaskStepStatus getStatus() {
        return this.status;
    }

    public final String getStatus_description() {
        return this.status_description;
    }

    public final Integer getSub_items_completed() {
        return this.sub_items_completed;
    }

    public final Integer getSub_items_total() {
        return this.sub_items_total;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Date getUpdated_at() {
        return this.updated_at;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int iL = kgh.l(vb7.c(this.position, this.uuid.hashCode() * 31, 31), 31, this.title);
        String str = this.notes;
        int iHashCode = (this.status.hashCode() + ((iL + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.status_description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BlockingToolDetail blockingToolDetail = this.blocking_tool;
        int iHashCode3 = (iHashCode2 + (blockingToolDetail == null ? 0 : blockingToolDetail.hashCode())) * 31;
        Integer num = this.sub_items_completed;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.sub_items_total;
        return this.updated_at.hashCode() + ebh.j(this.created_at, (iHashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31, 31);
    }

    public String toString() {
        String str = this.uuid;
        int i = this.position;
        String str2 = this.title;
        String str3 = this.notes;
        TaskStepStatus taskStepStatus = this.status;
        String str4 = this.status_description;
        BlockingToolDetail blockingToolDetail = this.blocking_tool;
        Integer num = this.sub_items_completed;
        Integer num2 = this.sub_items_total;
        Date date = this.created_at;
        Date date2 = this.updated_at;
        StringBuilder sbP = ij0.p("TaskStepResponse(uuid=", str, i, ", position=", ", title=");
        kgh.u(sbP, str2, ", notes=", str3, ", status=");
        sbP.append(taskStepStatus);
        sbP.append(", status_description=");
        sbP.append(str4);
        sbP.append(", blocking_tool=");
        sbP.append(blockingToolDetail);
        sbP.append(", sub_items_completed=");
        sbP.append(num);
        sbP.append(", sub_items_total=");
        sbP.append(num2);
        sbP.append(", created_at=");
        sbP.append(date);
        sbP.append(", updated_at=");
        sbP.append(date2);
        sbP.append(")");
        return sbP.toString();
    }

    public TaskStepResponse(String str, int i, String str2, String str3, TaskStepStatus taskStepStatus, String str4, BlockingToolDetail blockingToolDetail, Integer num, Integer num2, Date date, Date date2) {
        str.getClass();
        str2.getClass();
        taskStepStatus.getClass();
        date.getClass();
        date2.getClass();
        this.uuid = str;
        this.position = i;
        this.title = str2;
        this.notes = str3;
        this.status = taskStepStatus;
        this.status_description = str4;
        this.blocking_tool = blockingToolDetail;
        this.sub_items_completed = num;
        this.sub_items_total = num2;
        this.created_at = date;
        this.updated_at = date2;
    }

    public /* synthetic */ TaskStepResponse(String str, int i, String str2, String str3, TaskStepStatus taskStepStatus, String str4, BlockingToolDetail blockingToolDetail, Integer num, Integer num2, Date date, Date date2, int i2, mq5 mq5Var) {
        this(str, i, str2, (i2 & 8) != 0 ? null : str3, taskStepStatus, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : blockingToolDetail, (i2 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : num, (i2 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : num2, date, date2);
    }
}
