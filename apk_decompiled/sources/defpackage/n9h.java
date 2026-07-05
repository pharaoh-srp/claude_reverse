package defpackage;

import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.api.tasks.ApproveTaskRequest;
import com.anthropic.claude.api.tasks.PaginatedTasksResponse;
import com.anthropic.claude.api.tasks.SendTaskMessageRequest;
import com.anthropic.claude.api.tasks.SendTaskMessageResponse;
import com.anthropic.claude.api.tasks.TaskEventsResponse;
import com.anthropic.claude.api.tasks.TaskResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001JP\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\tH§@¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0012\u0010\u0013J4\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0003\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0018\u0010\u0013J4\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0015\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001b\u0010\u001cJ*\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u001e\u0010\u0013JN\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\tH§@¢\u0006\u0004\b\"\u0010#JA\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001d0&2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\tH'¢\u0006\u0004\b'\u0010(J)\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001d0&2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b)\u0010*¨\u0006+À\u0006\u0003"}, d2 = {"Ln9h;", "", "Lcom/anthropic/claude/types/strings/OrganizationId;", "organizationId", "", "limit", "offset", "Lcom/anthropic/claude/types/strings/ChatId;", "conversationId", "", "statuses", "Lcom/anthropic/claude/api/result/ApiResult;", "Lcom/anthropic/claude/api/tasks/PaginatedTasksResponse;", "h", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/types/strings/TaskId;", "taskId", "Lcom/anthropic/claude/api/tasks/TaskResponse;", "i", "(Ljava/lang/String;Ljava/lang/String;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/api/tasks/ApproveTaskRequest;", "request", "j", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/tasks/ApproveTaskRequest;Ltp4;)Ljava/lang/Object;", "e", "Lcom/anthropic/claude/api/tasks/SendTaskMessageRequest;", "Lcom/anthropic/claude/api/tasks/SendTaskMessageResponse;", "d", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/tasks/SendTaskMessageRequest;Ltp4;)Ljava/lang/Object;", "Liei;", "c", "page", "order", "Lcom/anthropic/claude/api/tasks/TaskEventsResponse;", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ltp4;)Ljava/lang/Object;", "stepId", "after", "Lu82;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lu82;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lu82;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public interface n9h {
    static /* synthetic */ Object g(n9h n9hVar, String str, Integer num, Integer num2, String str2, String str3, vp4 vp4Var, int i) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        return n9hVar.h(str, num, num2, str2, str3, vp4Var);
    }

    @lqg
    @u08("organizations/{organization_uuid}/tasks/{task_uuid}/stream")
    @vg8({"Accept: text/event-stream"})
    u82<iei> a(@ouc("organization_uuid") String organizationId, @ouc("task_uuid") String taskId);

    @lqg
    @u08("organizations/{organization_uuid}/tasks/{task_uuid}/events/stream")
    @vg8({"Accept: text/event-stream"})
    u82<iei> b(@ouc("organization_uuid") String organizationId, @ouc("task_uuid") String taskId, @tzd("step_id") String stepId, @tzd("after") String after);

    @ff5("organizations/{organization_uuid}/tasks/{task_uuid}")
    Object c(@ouc("organization_uuid") String str, @ouc("task_uuid") String str2, tp4<? super ApiResult<iei>> tp4Var);

    @smc("organizations/{organization_uuid}/tasks/{task_uuid}/message")
    Object d(@ouc("organization_uuid") String str, @ouc("task_uuid") String str2, @ft1 SendTaskMessageRequest sendTaskMessageRequest, tp4<? super ApiResult<SendTaskMessageResponse>> tp4Var);

    @smc("organizations/{organization_uuid}/tasks/{task_uuid}/reject")
    Object e(@ouc("organization_uuid") String str, @ouc("task_uuid") String str2, tp4<? super ApiResult<TaskResponse>> tp4Var);

    @u08("organizations/{organization_uuid}/tasks/{task_uuid}/events")
    Object f(@ouc("organization_uuid") String str, @ouc("task_uuid") String str2, @tzd("limit") Integer num, @tzd("page") String str3, @tzd("order") String str4, tp4<? super ApiResult<TaskEventsResponse>> tp4Var);

    @u08("organizations/{organization_uuid}/tasks")
    Object h(@ouc("organization_uuid") String str, @tzd("limit") Integer num, @tzd("offset") Integer num2, @tzd("conversation_uuid") String str2, @tzd("statuses") String str3, tp4<? super ApiResult<PaginatedTasksResponse>> tp4Var);

    @u08("organizations/{organization_uuid}/tasks/{task_uuid}")
    Object i(@ouc("organization_uuid") String str, @ouc("task_uuid") String str2, tp4<? super ApiResult<TaskResponse>> tp4Var);

    @smc("organizations/{organization_uuid}/tasks/{task_uuid}/approve")
    Object j(@ouc("organization_uuid") String str, @ouc("task_uuid") String str2, @ft1 ApproveTaskRequest approveTaskRequest, tp4<? super ApiResult<TaskResponse>> tp4Var);
}
