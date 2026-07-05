package com.anthropic.claude.api.tasks;

import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.TaskId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.bc9;
import defpackage.crg;
import defpackage.ebh;
import defpackage.f9h;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.n7h;
import defpackage.o7h;
import defpackage.onf;
import defpackage.p7h;
import defpackage.s8h;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.vs2;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.z5h;
import defpackage.znf;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 U2\u00020\u0001:\u0002VWB´\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0019\u0010\u0011\u001a\u00150\fj\u0002`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010\u0012\u0019\u0010\u0012\u001a\u00150\fj\u0002`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010\u0012\u0019\u0010\u0013\u001a\u00150\fj\u0002`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0004\b\u0019\u0010\u001aB\u009f\u0001\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0015\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0019\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0010\u0010%\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b%\u0010!J\u0010\u0010&\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b(\u0010!J\u0012\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b)\u0010!J#\u0010*\u001a\u00150\fj\u0002`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010HÆ\u0003¢\u0006\u0004\b*\u0010+J#\u0010,\u001a\u00150\fj\u0002`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010HÆ\u0003¢\u0006\u0004\b,\u0010+J#\u0010-\u001a\u00150\fj\u0002`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010HÆ\u0003¢\u0006\u0004\b-\u0010+J\u0010\u0010.\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b.\u0010!J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015HÆ\u0003¢\u0006\u0004\b/\u00100J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020\u00170\u0015HÆ\u0003¢\u0006\u0004\b1\u00100JÏ\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u001b\b\u0002\u0010\u0011\u001a\u00150\fj\u0002`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00102\u001b\b\u0002\u0010\u0012\u001a\u00150\fj\u0002`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00102\u001b\b\u0002\u0010\u0013\u001a\u00150\fj\u0002`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00062\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00152\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0015HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00105\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b5\u0010!J\u0010\u00106\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b6\u00107J\u001a\u0010:\u001a\u0002092\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b:\u0010;J'\u0010D\u001a\u00020A2\u0006\u0010<\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0001¢\u0006\u0004\bB\u0010CR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010E\u001a\u0004\bF\u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010E\u001a\u0004\bG\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010E\u001a\u0004\bH\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010I\u001a\u0004\bJ\u0010'R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010E\u001a\u0004\bK\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010E\u001a\u0004\bL\u0010!R*\u0010\u0011\u001a\u00150\fj\u0002`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010M\u001a\u0004\bN\u0010+R*\u0010\u0012\u001a\u00150\fj\u0002`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010M\u001a\u0004\bO\u0010+R*\u0010\u0013\u001a\u00150\fj\u0002`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00108\u0006¢\u0006\f\n\u0004\b\u0013\u0010M\u001a\u0004\bP\u0010+R\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010E\u001a\u0004\bQ\u0010!R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010R\u001a\u0004\bS\u00100R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00158\u0006¢\u0006\f\n\u0004\b\u0018\u0010R\u001a\u0004\bT\u00100¨\u0006X"}, d2 = {"Lcom/anthropic/claude/api/tasks/TaskResponse;", "", "Lcom/anthropic/claude/types/strings/TaskId;", "uuid", "Lcom/anthropic/claude/types/strings/ChatId;", "conversation_uuid", "", "title", "Lcom/anthropic/claude/api/tasks/TaskStatus;", "status", "status_description", "session_id", "Ljava/util/Date;", "Lcom/anthropic/claude/api/Iso8601Date;", "Lonf;", "with", "Lbc9;", "created_at", "updated_at", "last_activity_at", "context", "", "context_attachments", "Lcom/anthropic/claude/api/tasks/TaskStepResponse;", "steps", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/tasks/TaskStatus;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/tasks/TaskStatus;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lvnf;Lmq5;)V", "component1-Fx-cw9s", "()Ljava/lang/String;", "component1", "component2-RjYBDck", "component2", "component3", "component4", "()Lcom/anthropic/claude/api/tasks/TaskStatus;", "component5", "component6", "component7", "()Ljava/util/Date;", "component8", "component9", "component10", "component11", "()Ljava/util/List;", "component12", "copy-LzDmVd0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/tasks/TaskStatus;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/anthropic/claude/api/tasks/TaskResponse;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/tasks/TaskResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getUuid-Fx-cw9s", "getConversation_uuid-RjYBDck", "getTitle", "Lcom/anthropic/claude/api/tasks/TaskStatus;", "getStatus", "getStatus_description", "getSession_id", "Ljava/util/Date;", "getCreated_at", "getUpdated_at", "getLast_activity_at", "getContext", "Ljava/util/List;", "getContext_attachments", "getSteps", "Companion", "o7h", "p7h", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class TaskResponse {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final p7h Companion = new p7h();
    private final String context;
    private final List<String> context_attachments;
    private final String conversation_uuid;
    private final Date created_at;
    private final Date last_activity_at;
    private final String session_id;
    private final TaskStatus status;
    private final String status_description;
    private final List<TaskStepResponse> steps;
    private final String title;
    private final Date updated_at;
    private final String uuid;

    static {
        crg crgVar = new crg(29);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, null, null, null, null, null, null, null, yb5.w(w1aVar, crgVar), yb5.w(w1aVar, new n7h(0))};
    }

    private /* synthetic */ TaskResponse(int i, String str, String str2, String str3, TaskStatus taskStatus, String str4, String str5, Date date, Date date2, Date date3, String str6, List list, List list2, vnf vnfVar) {
        if (991 != (i & 991)) {
            gvj.f(i, 991, o7h.a.getDescriptor());
            throw null;
        }
        this.uuid = str;
        this.conversation_uuid = str2;
        this.title = str3;
        this.status = taskStatus;
        this.status_description = str4;
        if ((i & 32) == 0) {
            this.session_id = null;
        } else {
            this.session_id = str5;
        }
        this.created_at = date;
        this.updated_at = date2;
        this.last_activity_at = date3;
        this.context = str6;
        int i2 = i & FreeTypeConstants.FT_LOAD_NO_RECURSE;
        lm6 lm6Var = lm6.E;
        if (i2 == 0) {
            this.context_attachments = lm6Var;
        } else {
            this.context_attachments = list;
        }
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 0) {
            this.steps = lm6Var;
        } else {
            this.steps = list2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(f9h.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-LzDmVd0$default, reason: not valid java name */
    public static /* synthetic */ TaskResponse m445copyLzDmVd0$default(TaskResponse taskResponse, String str, String str2, String str3, TaskStatus taskStatus, String str4, String str5, Date date, Date date2, Date date3, String str6, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taskResponse.uuid;
        }
        if ((i & 2) != 0) {
            str2 = taskResponse.conversation_uuid;
        }
        if ((i & 4) != 0) {
            str3 = taskResponse.title;
        }
        if ((i & 8) != 0) {
            taskStatus = taskResponse.status;
        }
        if ((i & 16) != 0) {
            str4 = taskResponse.status_description;
        }
        if ((i & 32) != 0) {
            str5 = taskResponse.session_id;
        }
        if ((i & 64) != 0) {
            date = taskResponse.created_at;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            date2 = taskResponse.updated_at;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            date3 = taskResponse.last_activity_at;
        }
        if ((i & 512) != 0) {
            str6 = taskResponse.context;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
            list = taskResponse.context_attachments;
        }
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0) {
            list2 = taskResponse.steps;
        }
        List list3 = list;
        List list4 = list2;
        Date date4 = date3;
        String str7 = str6;
        Date date5 = date;
        Date date6 = date2;
        String str8 = str4;
        String str9 = str5;
        return taskResponse.m448copyLzDmVd0(str, str2, str3, taskStatus, str8, str9, date5, date6, date4, str7, list3, list4);
    }

    public static final /* synthetic */ void write$Self$api(TaskResponse self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, z5h.a, TaskId.m1128boximpl(self.uuid));
        output.r(serialDesc, 1, vs2.a, ChatId.m978boximpl(self.conversation_uuid));
        output.q(serialDesc, 2, self.title);
        output.r(serialDesc, 3, s8h.d, self.status);
        output.q(serialDesc, 4, self.status_description);
        if (output.E(serialDesc) || self.session_id != null) {
            output.B(serialDesc, 5, srg.a, self.session_id);
        }
        bc9 bc9Var = bc9.a;
        output.r(serialDesc, 6, bc9Var, self.created_at);
        output.r(serialDesc, 7, bc9Var, self.updated_at);
        output.r(serialDesc, 8, bc9Var, self.last_activity_at);
        output.q(serialDesc, 9, self.context);
        boolean zE = output.E(serialDesc);
        lm6 lm6Var = lm6.E;
        if (zE || !x44.r(self.context_attachments, lm6Var)) {
            output.r(serialDesc, 10, (znf) kw9VarArr[10].getValue(), self.context_attachments);
        }
        if (!output.E(serialDesc) && x44.r(self.steps, lm6Var)) {
            return;
        }
        output.r(serialDesc, 11, (znf) kw9VarArr[11].getValue(), self.steps);
    }

    /* JADX INFO: renamed from: component1-Fx-cw9s, reason: not valid java name and from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    public final List<String> component11() {
        return this.context_attachments;
    }

    public final List<TaskStepResponse> component12() {
        return this.steps;
    }

    /* JADX INFO: renamed from: component2-RjYBDck, reason: not valid java name and from getter */
    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TaskStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStatus_description() {
        return this.status_description;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSession_id() {
        return this.session_id;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Date getUpdated_at() {
        return this.updated_at;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Date getLast_activity_at() {
        return this.last_activity_at;
    }

    /* JADX INFO: renamed from: copy-LzDmVd0, reason: not valid java name */
    public final TaskResponse m448copyLzDmVd0(String uuid, String conversation_uuid, String title, TaskStatus status, String status_description, String session_id, Date created_at, Date updated_at, Date last_activity_at, String context, List<String> context_attachments, List<TaskStepResponse> steps) {
        uuid.getClass();
        conversation_uuid.getClass();
        title.getClass();
        status.getClass();
        status_description.getClass();
        created_at.getClass();
        updated_at.getClass();
        last_activity_at.getClass();
        context.getClass();
        context_attachments.getClass();
        steps.getClass();
        return new TaskResponse(uuid, conversation_uuid, title, status, status_description, session_id, created_at, updated_at, last_activity_at, context, context_attachments, steps, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaskResponse)) {
            return false;
        }
        TaskResponse taskResponse = (TaskResponse) other;
        return TaskId.m1131equalsimpl0(this.uuid, taskResponse.uuid) && ChatId.m981equalsimpl0(this.conversation_uuid, taskResponse.conversation_uuid) && x44.r(this.title, taskResponse.title) && this.status == taskResponse.status && x44.r(this.status_description, taskResponse.status_description) && x44.r(this.session_id, taskResponse.session_id) && x44.r(this.created_at, taskResponse.created_at) && x44.r(this.updated_at, taskResponse.updated_at) && x44.r(this.last_activity_at, taskResponse.last_activity_at) && x44.r(this.context, taskResponse.context) && x44.r(this.context_attachments, taskResponse.context_attachments) && x44.r(this.steps, taskResponse.steps);
    }

    public final String getContext() {
        return this.context;
    }

    public final List<String> getContext_attachments() {
        return this.context_attachments;
    }

    /* JADX INFO: renamed from: getConversation_uuid-RjYBDck, reason: not valid java name */
    public final String m449getConversation_uuidRjYBDck() {
        return this.conversation_uuid;
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    public final Date getLast_activity_at() {
        return this.last_activity_at;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final TaskStatus getStatus() {
        return this.status;
    }

    public final String getStatus_description() {
        return this.status_description;
    }

    public final List<TaskStepResponse> getSteps() {
        return this.steps;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Date getUpdated_at() {
        return this.updated_at;
    }

    /* JADX INFO: renamed from: getUuid-Fx-cw9s, reason: not valid java name */
    public final String m450getUuidFxcw9s() {
        return this.uuid;
    }

    public int hashCode() {
        int iL = kgh.l((this.status.hashCode() + kgh.l((ChatId.m982hashCodeimpl(this.conversation_uuid) + (TaskId.m1132hashCodeimpl(this.uuid) * 31)) * 31, 31, this.title)) * 31, 31, this.status_description);
        String str = this.session_id;
        return this.steps.hashCode() + kgh.m(kgh.l(ebh.j(this.last_activity_at, ebh.j(this.updated_at, ebh.j(this.created_at, (iL + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31, this.context), 31, this.context_attachments);
    }

    public String toString() {
        String strM1133toStringimpl = TaskId.m1133toStringimpl(this.uuid);
        String strM983toStringimpl = ChatId.m983toStringimpl(this.conversation_uuid);
        String str = this.title;
        TaskStatus taskStatus = this.status;
        String str2 = this.status_description;
        String str3 = this.session_id;
        Date date = this.created_at;
        Date date2 = this.updated_at;
        Date date3 = this.last_activity_at;
        String str4 = this.context;
        List<String> list = this.context_attachments;
        List<TaskStepResponse> list2 = this.steps;
        StringBuilder sbR = kgh.r("TaskResponse(uuid=", strM1133toStringimpl, ", conversation_uuid=", strM983toStringimpl, ", title=");
        sbR.append(str);
        sbR.append(", status=");
        sbR.append(taskStatus);
        sbR.append(", status_description=");
        kgh.u(sbR, str2, ", session_id=", str3, ", created_at=");
        sbR.append(date);
        sbR.append(", updated_at=");
        sbR.append(date2);
        sbR.append(", last_activity_at=");
        sbR.append(date3);
        sbR.append(", context=");
        sbR.append(str4);
        sbR.append(", context_attachments=");
        sbR.append(list);
        sbR.append(", steps=");
        sbR.append(list2);
        sbR.append(")");
        return sbR.toString();
    }

    public /* synthetic */ TaskResponse(String str, String str2, String str3, TaskStatus taskStatus, String str4, String str5, Date date, Date date2, Date date3, String str6, List list, List list2, mq5 mq5Var) {
        this(str, str2, str3, taskStatus, str4, str5, date, date2, date3, str6, list, list2);
    }

    public /* synthetic */ TaskResponse(int i, String str, String str2, String str3, TaskStatus taskStatus, String str4, String str5, Date date, Date date2, Date date3, String str6, List list, List list2, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, str3, taskStatus, str4, str5, date, date2, date3, str6, list, list2, vnfVar);
    }

    private TaskResponse(String str, String str2, String str3, TaskStatus taskStatus, String str4, String str5, Date date, Date date2, Date date3, String str6, List<String> list, List<TaskStepResponse> list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        taskStatus.getClass();
        str4.getClass();
        date.getClass();
        date2.getClass();
        date3.getClass();
        str6.getClass();
        list.getClass();
        list2.getClass();
        this.uuid = str;
        this.conversation_uuid = str2;
        this.title = str3;
        this.status = taskStatus;
        this.status_description = str4;
        this.session_id = str5;
        this.created_at = date;
        this.updated_at = date2;
        this.last_activity_at = date3;
        this.context = str6;
        this.context_attachments = list;
        this.steps = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TaskResponse(String str, String str2, String str3, TaskStatus taskStatus, String str4, String str5, Date date, Date date2, Date date3, String str6, List list, List list2, int i, mq5 mq5Var) {
        String str7 = (i & 32) != 0 ? null : str5;
        int i2 = i & FreeTypeConstants.FT_LOAD_NO_RECURSE;
        lm6 lm6Var = lm6.E;
        this(str, str2, str3, taskStatus, str4, str7, date, date2, date3, str6, i2 != 0 ? lm6Var : list, (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? lm6Var : list2, null);
    }
}
