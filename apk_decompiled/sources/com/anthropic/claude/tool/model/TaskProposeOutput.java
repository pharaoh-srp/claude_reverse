package com.anthropic.claude.tool.model;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.a7h;
import defpackage.ay6;
import defpackage.b7h;
import defpackage.d7h;
import defpackage.e7h;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.ms6;
import defpackage.onf;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wof;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.time.OffsetDateTime;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0002KLB\u009e\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0019\u0010\t\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0019\u0010\n\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0019\u0010\u0013\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016B\u0085\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001e\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010 \u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001dJ#\u0010(\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001dJ·\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001b\b\u0002\u0010\t\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\u001b\b\u0002\u0010\n\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00022\u001b\b\u0002\u0010\u0013\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\u0014\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001dJ\u0010\u0010-\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102J'\u0010;\u001a\u0002082\u0006\u00103\u001a\u00020\u00002\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0001¢\u0006\u0004\b9\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010\u001dR*\u0010\t\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\b?\u0010\u001fR*\u0010\n\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\b@\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\bA\u0010\u001dR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bC\u0010#R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\bD\u0010\u001dR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010E\u001a\u0004\bF\u0010&R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010<\u001a\u0004\bG\u0010\u001dR*\u0010\u0013\u001a\u00150\u0004j\u0002`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010>\u001a\u0004\bH\u0010\u001fR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010<\u001a\u0004\bI\u0010\u001d¨\u0006M"}, d2 = {"Lcom/anthropic/claude/tool/model/TaskProposeOutput;", "", "", "context", "Ljava/time/OffsetDateTime;", "Lcom/anthropic/claude/tool/model/EventDateTime;", "Lonf;", "with", "Lay6;", "created_at", "last_activity_at", "session_id", "Lcom/anthropic/claude/tool/model/TaskProposeOutputStatus;", "status", "status_description", "", "Lcom/anthropic/claude/tool/model/TaskProposeOutputStepsItem;", "steps", "title", "updated_at", "uuid", "<init>", "(Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ljava/lang/String;Lcom/anthropic/claude/tool/model/TaskProposeOutputStatus;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ljava/lang/String;Lcom/anthropic/claude/tool/model/TaskProposeOutputStatus;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/String;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/time/OffsetDateTime;", "component3", "component4", "component5", "()Lcom/anthropic/claude/tool/model/TaskProposeOutputStatus;", "component6", "component7", "()Ljava/util/List;", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ljava/lang/String;Lcom/anthropic/claude/tool/model/TaskProposeOutputStatus;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/String;)Lcom/anthropic/claude/tool/model/TaskProposeOutput;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/TaskProposeOutput;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getContext", "Ljava/time/OffsetDateTime;", "getCreated_at", "getLast_activity_at", "getSession_id", "Lcom/anthropic/claude/tool/model/TaskProposeOutputStatus;", "getStatus", "getStatus_description", "Ljava/util/List;", "getSteps", "getTitle", "getUpdated_at", "getUuid", "Companion", "a7h", "b7h", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class TaskProposeOutput {
    private final String context;
    private final OffsetDateTime created_at;
    private final OffsetDateTime last_activity_at;
    private final String session_id;
    private final TaskProposeOutputStatus status;
    private final String status_description;
    private final List<TaskProposeOutputStepsItem> steps;
    private final String title;
    private final OffsetDateTime updated_at;
    private final String uuid;
    public static final b7h Companion = new b7h();
    private static final kw9[] $childSerializers = {null, null, null, null, null, null, yb5.w(w1a.F, new wof(17)), null, null, null};

    public /* synthetic */ TaskProposeOutput(int i, String str, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, String str2, TaskProposeOutputStatus taskProposeOutputStatus, String str3, List list, String str4, OffsetDateTime offsetDateTime3, String str5, vnf vnfVar) {
        if (983 != (i & 983)) {
            gvj.f(i, 983, a7h.a.getDescriptor());
            throw null;
        }
        this.context = str;
        this.created_at = offsetDateTime;
        this.last_activity_at = offsetDateTime2;
        if ((i & 8) == 0) {
            this.session_id = null;
        } else {
            this.session_id = str2;
        }
        this.status = taskProposeOutputStatus;
        if ((i & 32) == 0) {
            this.status_description = null;
        } else {
            this.status_description = str3;
        }
        this.steps = list;
        this.title = str4;
        this.updated_at = offsetDateTime3;
        this.uuid = str5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(e7h.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TaskProposeOutput copy$default(TaskProposeOutput taskProposeOutput, String str, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, String str2, TaskProposeOutputStatus taskProposeOutputStatus, String str3, List list, String str4, OffsetDateTime offsetDateTime3, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taskProposeOutput.context;
        }
        if ((i & 2) != 0) {
            offsetDateTime = taskProposeOutput.created_at;
        }
        if ((i & 4) != 0) {
            offsetDateTime2 = taskProposeOutput.last_activity_at;
        }
        if ((i & 8) != 0) {
            str2 = taskProposeOutput.session_id;
        }
        if ((i & 16) != 0) {
            taskProposeOutputStatus = taskProposeOutput.status;
        }
        if ((i & 32) != 0) {
            str3 = taskProposeOutput.status_description;
        }
        if ((i & 64) != 0) {
            list = taskProposeOutput.steps;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            str4 = taskProposeOutput.title;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            offsetDateTime3 = taskProposeOutput.updated_at;
        }
        if ((i & 512) != 0) {
            str5 = taskProposeOutput.uuid;
        }
        OffsetDateTime offsetDateTime4 = offsetDateTime3;
        String str6 = str5;
        List list2 = list;
        String str7 = str4;
        TaskProposeOutputStatus taskProposeOutputStatus2 = taskProposeOutputStatus;
        String str8 = str3;
        return taskProposeOutput.copy(str, offsetDateTime, offsetDateTime2, str2, taskProposeOutputStatus2, str8, list2, str7, offsetDateTime4, str6);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(TaskProposeOutput self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.context);
        ay6 ay6Var = ay6.a;
        output.r(serialDesc, 1, ay6Var, self.created_at);
        output.r(serialDesc, 2, ay6Var, self.last_activity_at);
        if (output.E(serialDesc) || self.session_id != null) {
            output.B(serialDesc, 3, srg.a, self.session_id);
        }
        output.r(serialDesc, 4, d7h.d, self.status);
        if (output.E(serialDesc) || self.status_description != null) {
            output.B(serialDesc, 5, srg.a, self.status_description);
        }
        output.r(serialDesc, 6, (znf) kw9VarArr[6].getValue(), self.steps);
        output.q(serialDesc, 7, self.title);
        output.r(serialDesc, 8, ay6Var, self.updated_at);
        output.q(serialDesc, 9, self.uuid);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OffsetDateTime getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OffsetDateTime getLast_activity_at() {
        return this.last_activity_at;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSession_id() {
        return this.session_id;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TaskProposeOutputStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStatus_description() {
        return this.status_description;
    }

    public final List<TaskProposeOutputStepsItem> component7() {
        return this.steps;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final OffsetDateTime getUpdated_at() {
        return this.updated_at;
    }

    public final TaskProposeOutput copy(String context, OffsetDateTime created_at, OffsetDateTime last_activity_at, String session_id, TaskProposeOutputStatus status, String status_description, List<TaskProposeOutputStepsItem> steps, String title, OffsetDateTime updated_at, String uuid) {
        context.getClass();
        created_at.getClass();
        last_activity_at.getClass();
        status.getClass();
        steps.getClass();
        title.getClass();
        updated_at.getClass();
        uuid.getClass();
        return new TaskProposeOutput(context, created_at, last_activity_at, session_id, status, status_description, steps, title, updated_at, uuid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaskProposeOutput)) {
            return false;
        }
        TaskProposeOutput taskProposeOutput = (TaskProposeOutput) other;
        return x44.r(this.context, taskProposeOutput.context) && x44.r(this.created_at, taskProposeOutput.created_at) && x44.r(this.last_activity_at, taskProposeOutput.last_activity_at) && x44.r(this.session_id, taskProposeOutput.session_id) && this.status == taskProposeOutput.status && x44.r(this.status_description, taskProposeOutput.status_description) && x44.r(this.steps, taskProposeOutput.steps) && x44.r(this.title, taskProposeOutput.title) && x44.r(this.updated_at, taskProposeOutput.updated_at) && x44.r(this.uuid, taskProposeOutput.uuid);
    }

    public final String getContext() {
        return this.context;
    }

    public final OffsetDateTime getCreated_at() {
        return this.created_at;
    }

    public final OffsetDateTime getLast_activity_at() {
        return this.last_activity_at;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final TaskProposeOutputStatus getStatus() {
        return this.status;
    }

    public final String getStatus_description() {
        return this.status_description;
    }

    public final List<TaskProposeOutputStepsItem> getSteps() {
        return this.steps;
    }

    public final String getTitle() {
        return this.title;
    }

    public final OffsetDateTime getUpdated_at() {
        return this.updated_at;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int iHashCode = (this.last_activity_at.hashCode() + ((this.created_at.hashCode() + (this.context.hashCode() * 31)) * 31)) * 31;
        String str = this.session_id;
        int iHashCode2 = (this.status.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.status_description;
        return this.uuid.hashCode() + ((this.updated_at.hashCode() + kgh.l(kgh.m((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.steps), 31, this.title)) * 31);
    }

    public String toString() {
        String str = this.context;
        OffsetDateTime offsetDateTime = this.created_at;
        OffsetDateTime offsetDateTime2 = this.last_activity_at;
        String str2 = this.session_id;
        TaskProposeOutputStatus taskProposeOutputStatus = this.status;
        String str3 = this.status_description;
        List<TaskProposeOutputStepsItem> list = this.steps;
        String str4 = this.title;
        OffsetDateTime offsetDateTime3 = this.updated_at;
        String str5 = this.uuid;
        StringBuilder sb = new StringBuilder("TaskProposeOutput(context=");
        sb.append(str);
        sb.append(", created_at=");
        sb.append(offsetDateTime);
        sb.append(", last_activity_at=");
        sb.append(offsetDateTime2);
        sb.append(", session_id=");
        sb.append(str2);
        sb.append(", status=");
        sb.append(taskProposeOutputStatus);
        sb.append(", status_description=");
        sb.append(str3);
        sb.append(", steps=");
        ms6.x(", title=", str4, ", updated_at=", sb, list);
        sb.append(offsetDateTime3);
        sb.append(", uuid=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    public TaskProposeOutput(String str, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, String str2, TaskProposeOutputStatus taskProposeOutputStatus, String str3, List<TaskProposeOutputStepsItem> list, String str4, OffsetDateTime offsetDateTime3, String str5) {
        str.getClass();
        offsetDateTime.getClass();
        offsetDateTime2.getClass();
        taskProposeOutputStatus.getClass();
        list.getClass();
        str4.getClass();
        offsetDateTime3.getClass();
        str5.getClass();
        this.context = str;
        this.created_at = offsetDateTime;
        this.last_activity_at = offsetDateTime2;
        this.session_id = str2;
        this.status = taskProposeOutputStatus;
        this.status_description = str3;
        this.steps = list;
        this.title = str4;
        this.updated_at = offsetDateTime3;
        this.uuid = str5;
    }

    public /* synthetic */ TaskProposeOutput(String str, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, String str2, TaskProposeOutputStatus taskProposeOutputStatus, String str3, List list, String str4, OffsetDateTime offsetDateTime3, String str5, int i, mq5 mq5Var) {
        this(str, offsetDateTime, offsetDateTime2, (i & 8) != 0 ? null : str2, taskProposeOutputStatus, (i & 32) != 0 ? null : str3, list, str4, offsetDateTime3, str5);
    }
}
