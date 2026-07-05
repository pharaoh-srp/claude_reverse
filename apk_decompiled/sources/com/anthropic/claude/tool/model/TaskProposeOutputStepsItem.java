package com.anthropic.claude.tool.model;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.e79;
import defpackage.e7h;
import defpackage.f7h;
import defpackage.gvj;
import defpackage.h7h;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=>BW\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eBi\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001dJ\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001dJh\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001dJ\u0010\u0010+\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b+\u0010\u001fJ\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b6\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b9\u0010$R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b:\u0010\u001dR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b;\u0010\u001d¨\u0006?"}, d2 = {"Lcom/anthropic/claude/tool/model/TaskProposeOutputStepsItem;", "", "", "notes", "", "position", "Lcom/anthropic/claude/tool/model/TaskProposeOutputStepsItemStatus;", "status", "status_description", "sub_items_completed", "sub_items_total", "title", "uuid", "<init>", "(Ljava/lang/String;ILcom/anthropic/claude/tool/model/TaskProposeOutputStepsItemStatus;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;ILcom/anthropic/claude/tool/model/TaskProposeOutputStepsItemStatus;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/TaskProposeOutputStepsItem;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Lcom/anthropic/claude/tool/model/TaskProposeOutputStepsItemStatus;", "component4", "component5", "()Ljava/lang/Integer;", "component6", "component7", "component8", "copy", "(Ljava/lang/String;ILcom/anthropic/claude/tool/model/TaskProposeOutputStepsItemStatus;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/tool/model/TaskProposeOutputStepsItem;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNotes", "I", "getPosition", "Lcom/anthropic/claude/tool/model/TaskProposeOutputStepsItemStatus;", "getStatus", "getStatus_description", "Ljava/lang/Integer;", "getSub_items_completed", "getSub_items_total", "getTitle", "getUuid", "Companion", "e7h", "f7h", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class TaskProposeOutputStepsItem {
    public static final f7h Companion = new f7h();
    private final String notes;
    private final int position;
    private final TaskProposeOutputStepsItemStatus status;
    private final String status_description;
    private final Integer sub_items_completed;
    private final Integer sub_items_total;
    private final String title;
    private final String uuid;

    public /* synthetic */ TaskProposeOutputStepsItem(int i, String str, int i2, TaskProposeOutputStepsItemStatus taskProposeOutputStepsItemStatus, String str2, Integer num, Integer num2, String str3, String str4, vnf vnfVar) {
        if (198 != (i & 198)) {
            gvj.f(i, 198, e7h.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.notes = null;
        } else {
            this.notes = str;
        }
        this.position = i2;
        this.status = taskProposeOutputStepsItemStatus;
        if ((i & 8) == 0) {
            this.status_description = null;
        } else {
            this.status_description = str2;
        }
        if ((i & 16) == 0) {
            this.sub_items_completed = null;
        } else {
            this.sub_items_completed = num;
        }
        if ((i & 32) == 0) {
            this.sub_items_total = null;
        } else {
            this.sub_items_total = num2;
        }
        this.title = str3;
        this.uuid = str4;
    }

    public static /* synthetic */ TaskProposeOutputStepsItem copy$default(TaskProposeOutputStepsItem taskProposeOutputStepsItem, String str, int i, TaskProposeOutputStepsItemStatus taskProposeOutputStepsItemStatus, String str2, Integer num, Integer num2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = taskProposeOutputStepsItem.notes;
        }
        if ((i2 & 2) != 0) {
            i = taskProposeOutputStepsItem.position;
        }
        if ((i2 & 4) != 0) {
            taskProposeOutputStepsItemStatus = taskProposeOutputStepsItem.status;
        }
        if ((i2 & 8) != 0) {
            str2 = taskProposeOutputStepsItem.status_description;
        }
        if ((i2 & 16) != 0) {
            num = taskProposeOutputStepsItem.sub_items_completed;
        }
        if ((i2 & 32) != 0) {
            num2 = taskProposeOutputStepsItem.sub_items_total;
        }
        if ((i2 & 64) != 0) {
            str3 = taskProposeOutputStepsItem.title;
        }
        if ((i2 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            str4 = taskProposeOutputStepsItem.uuid;
        }
        String str5 = str3;
        String str6 = str4;
        Integer num3 = num;
        Integer num4 = num2;
        return taskProposeOutputStepsItem.copy(str, i, taskProposeOutputStepsItemStatus, str2, num3, num4, str5, str6);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(TaskProposeOutputStepsItem self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.notes != null) {
            output.B(serialDesc, 0, srg.a, self.notes);
        }
        output.l(1, self.position, serialDesc);
        output.r(serialDesc, 2, h7h.d, self.status);
        if (output.E(serialDesc) || self.status_description != null) {
            output.B(serialDesc, 3, srg.a, self.status_description);
        }
        if (output.E(serialDesc) || self.sub_items_completed != null) {
            output.B(serialDesc, 4, e79.a, self.sub_items_completed);
        }
        if (output.E(serialDesc) || self.sub_items_total != null) {
            output.B(serialDesc, 5, e79.a, self.sub_items_total);
        }
        output.q(serialDesc, 6, self.title);
        output.q(serialDesc, 7, self.uuid);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNotes() {
        return this.notes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TaskProposeOutputStepsItemStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatus_description() {
        return this.status_description;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getSub_items_completed() {
        return this.sub_items_completed;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getSub_items_total() {
        return this.sub_items_total;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    public final TaskProposeOutputStepsItem copy(String notes, int position, TaskProposeOutputStepsItemStatus status, String status_description, Integer sub_items_completed, Integer sub_items_total, String title, String uuid) {
        status.getClass();
        title.getClass();
        uuid.getClass();
        return new TaskProposeOutputStepsItem(notes, position, status, status_description, sub_items_completed, sub_items_total, title, uuid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaskProposeOutputStepsItem)) {
            return false;
        }
        TaskProposeOutputStepsItem taskProposeOutputStepsItem = (TaskProposeOutputStepsItem) other;
        return x44.r(this.notes, taskProposeOutputStepsItem.notes) && this.position == taskProposeOutputStepsItem.position && this.status == taskProposeOutputStepsItem.status && x44.r(this.status_description, taskProposeOutputStepsItem.status_description) && x44.r(this.sub_items_completed, taskProposeOutputStepsItem.sub_items_completed) && x44.r(this.sub_items_total, taskProposeOutputStepsItem.sub_items_total) && x44.r(this.title, taskProposeOutputStepsItem.title) && x44.r(this.uuid, taskProposeOutputStepsItem.uuid);
    }

    public final String getNotes() {
        return this.notes;
    }

    public final int getPosition() {
        return this.position;
    }

    public final TaskProposeOutputStepsItemStatus getStatus() {
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

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        String str = this.notes;
        int iHashCode = (this.status.hashCode() + vb7.c(this.position, (str == null ? 0 : str.hashCode()) * 31, 31)) * 31;
        String str2 = this.status_description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.sub_items_completed;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.sub_items_total;
        return this.uuid.hashCode() + kgh.l((iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.title);
    }

    public String toString() {
        String str = this.notes;
        int i = this.position;
        TaskProposeOutputStepsItemStatus taskProposeOutputStepsItemStatus = this.status;
        String str2 = this.status_description;
        Integer num = this.sub_items_completed;
        Integer num2 = this.sub_items_total;
        String str3 = this.title;
        String str4 = this.uuid;
        StringBuilder sbP = ij0.p("TaskProposeOutputStepsItem(notes=", str, i, ", position=", ", status=");
        sbP.append(taskProposeOutputStepsItemStatus);
        sbP.append(", status_description=");
        sbP.append(str2);
        sbP.append(", sub_items_completed=");
        sbP.append(num);
        sbP.append(", sub_items_total=");
        sbP.append(num2);
        sbP.append(", title=");
        return vb7.t(sbP, str3, ", uuid=", str4, ")");
    }

    public TaskProposeOutputStepsItem(String str, int i, TaskProposeOutputStepsItemStatus taskProposeOutputStepsItemStatus, String str2, Integer num, Integer num2, String str3, String str4) {
        taskProposeOutputStepsItemStatus.getClass();
        str3.getClass();
        str4.getClass();
        this.notes = str;
        this.position = i;
        this.status = taskProposeOutputStepsItemStatus;
        this.status_description = str2;
        this.sub_items_completed = num;
        this.sub_items_total = num2;
        this.title = str3;
        this.uuid = str4;
    }

    public /* synthetic */ TaskProposeOutputStepsItem(String str, int i, TaskProposeOutputStepsItemStatus taskProposeOutputStepsItemStatus, String str2, Integer num, Integer num2, String str3, String str4, int i2, mq5 mq5Var) {
        this((i2 & 1) != 0 ? null : str, i, taskProposeOutputStepsItemStatus, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : num2, str3, str4);
    }
}
