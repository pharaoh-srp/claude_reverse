package defpackage;

import com.anthropic.claude.api.chat.ChatCompletionRequest;
import com.anthropic.claude.api.chat.ChatConversationWithNestedMessage;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.api.chat.ChatFeedbackRequest;
import com.anthropic.claude.api.chat.ConversationSearchResponse;
import com.anthropic.claude.api.chat.DeleteChatsRequest;
import com.anthropic.claude.api.chat.DeleteChatsResponse;
import com.anthropic.claude.api.chat.DeleteMessageFlagRequest;
import com.anthropic.claude.api.chat.DeleteMessageFlagResponse;
import com.anthropic.claude.api.chat.FillSensitiveTextRequest;
import com.anthropic.claude.api.chat.FillSensitiveTextResponse;
import com.anthropic.claude.api.chat.GenerateChatTitleRequest;
import com.anthropic.claude.api.chat.GenerateChatTitleResponse;
import com.anthropic.claude.api.chat.MessageAttachment;
import com.anthropic.claude.api.chat.MessageFile;
import com.anthropic.claude.api.chat.MoveChatsRequest;
import com.anthropic.claude.api.chat.MoveChatsResponse;
import com.anthropic.claude.api.chat.RecordToolApprovalRequest;
import com.anthropic.claude.api.chat.RecordToolResultRequest;
import com.anthropic.claude.api.chat.RenderingMode;
import com.anthropic.claude.api.chat.UpdateChatModelFallbackResponse;
import com.anthropic.claude.api.chat.UpdateChatRequest;
import com.anthropic.claude.api.chat.tool.ResearchStatusResponse;
import com.anthropic.claude.api.common.ConsistencyLevel;
import com.anthropic.claude.api.result.ApiResult;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001Jf\u0010\u0011\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000f0\u000ej\u0002`\u00100\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0004\b\u0011\u0010\u0012J@\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\b2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0004\b\u0016\u0010\u0017J`\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00182\b\b\u0003\u0010\u001b\u001a\u00020\u001a2\b\b\u0003\u0010\u001c\u001a\u00020\u000b2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\b\b\u0003\u0010\u001f\u001a\u00020\u000bH§@¢\u0006\u0004\b!\u0010\"J3\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010$\u001a\u00020#H'¢\u0006\u0004\b'\u0010(J4\u0010)\u001a\b\u0012\u0004\u0012\u00020&0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010$\u001a\u00020#H§@¢\u0006\u0004\b)\u0010*J3\u0010+\u001a\b\u0012\u0004\u0012\u00020&0%2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010$\u001a\u00020#H'¢\u0006\u0004\b+\u0010(J3\u0010,\u001a\b\u0012\u0004\u0012\u00020&0%2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010$\u001a\u00020#H'¢\u0006\u0004\b,\u0010(J4\u0010-\u001a\b\u0012\u0004\u0012\u00020&0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010$\u001a\u00020#H§@¢\u0006\u0004\b-\u0010*J3\u0010.\u001a\b\u0012\u0004\u0012\u00020&0%2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010$\u001a\u00020#H'¢\u0006\u0004\b.\u0010(J*\u00101\u001a\b\u0012\u0004\u0012\u00020\u000f0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u00100\u001a\u00020/H§@¢\u0006\u0004\b1\u00102J*\u00103\u001a\b\u0012\u0004\u0012\u00020&0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u0018H§@¢\u0006\u0004\b3\u00102J4\u00105\u001a\b\u0012\u0004\u0012\u00020&0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010$\u001a\u000204H§@¢\u0006\u0004\b5\u00106J*\u00108\u001a\b\u0012\u0004\u0012\u0002070\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u0018H§@¢\u0006\u0004\b8\u00102J*\u00109\u001a\b\u0012\u0004\u0012\u00020&0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u0018H§@¢\u0006\u0004\b9\u00102J*\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010$\u001a\u00020:H§@¢\u0006\u0004\b<\u0010=J*\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010$\u001a\u00020>H§@¢\u0006\u0004\b@\u0010AJ4\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010$\u001a\u00020BH§@¢\u0006\u0004\bD\u0010EJ>\u0010I\u001a\b\u0012\u0004\u0012\u00020&0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010G\u001a\u00020F2\b\b\u0001\u0010$\u001a\u00020HH§@¢\u0006\u0004\bI\u0010JJ>\u0010K\u001a\b\u0012\u0004\u0012\u00020&0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010G\u001a\u00020F2\b\b\u0001\u0010$\u001a\u00020HH§@¢\u0006\u0004\bK\u0010JJ.\u0010P\u001a\f\u0012\b\u0012\u00060Nj\u0002`O0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010M\u001a\u00020LH§@¢\u0006\u0004\bP\u0010QJ.\u0010T\u001a\f\u0012\b\u0012\u00060Rj\u0002`S0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010M\u001a\u00020LH§@¢\u0006\u0004\bT\u0010QJ4\u0010V\u001a\b\u0012\u0004\u0012\u00020&0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010$\u001a\u00020UH§@¢\u0006\u0004\bV\u0010WJ4\u0010Y\u001a\b\u0012\u0004\u0012\u00020&0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010$\u001a\u00020XH§@¢\u0006\u0004\bY\u0010ZJ4\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010[\u001a\u00020\u00182\b\b\u0001\u0010$\u001a\u00020\\H§@¢\u0006\u0004\b^\u0010_J4\u0010a\u001a\b\u0012\u0004\u0012\u00020]0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010`\u001a\u00020\u00062\b\b\u0001\u0010$\u001a\u00020\\H§@¢\u0006\u0004\ba\u0010_J4\u0010f\u001a\b\u0012\u0004\u0012\u00020e0\r2\b\b\u0001\u0010b\u001a\u00020\u00022\b\b\u0001\u0010[\u001a\u00020\u00182\b\b\u0001\u0010d\u001a\u00020cH§@¢\u0006\u0004\bf\u0010gJ4\u0010h\u001a\b\u0012\u0004\u0012\u00020&0\r2\b\b\u0001\u0010b\u001a\u00020\u00022\b\b\u0001\u0010[\u001a\u00020\u00182\b\b\u0001\u0010d\u001a\u00020cH§@¢\u0006\u0004\bh\u0010gJ>\u0010k\u001a\b\u0012\u0004\u0012\u00020j0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010G\u001a\u00020F2\b\b\u0001\u0010$\u001a\u00020iH§@¢\u0006\u0004\bk\u0010l¨\u0006mÀ\u0006\u0003"}, d2 = {"Ldl2;", "", "Lcom/anthropic/claude/types/strings/OrganizationId;", "organization", "Lcom/anthropic/claude/api/common/ConsistencyLevel;", "consistency", "", "searchQuery", "", "limit", "offset", "", "starred", "Lcom/anthropic/claude/api/result/ApiResult;", "", "Lcom/anthropic/claude/api/chat/ChatConversationWithProjectReference;", "Lcom/anthropic/claude/api/chat/ChatConversationsResponse;", "u", "(Ljava/lang/String;Lcom/anthropic/claude/api/common/ConsistencyLevel;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ltp4;)Ljava/lang/Object;", "query", "pageToken", "Lcom/anthropic/claude/api/chat/ConversationSearchResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/types/strings/ChatId;", "chat", "Lcom/anthropic/claude/api/chat/RenderingMode;", "rendering_mode", "render_all_mobile_tools", "tools", "returnDanglingHumanMessage", "includeExtractedContent", "Lcom/anthropic/claude/api/chat/ChatConversationWithNestedMessage;", "q", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/RenderingMode;ZLjava/lang/String;Ljava/lang/Boolean;ZLtp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/api/chat/ChatCompletionRequest;", "request", "Lu82;", "Liei;", "D", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/ChatCompletionRequest;)Lu82;", "e", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/ChatCompletionRequest;Ltp4;)Ljava/lang/Object;", "x", "w", "h", "m", "Lcom/anthropic/claude/types/strings/PublishedArtifactId;", "publishedArtifactId", "i", "(Ljava/lang/String;Ljava/lang/String;Ltp4;)Ljava/lang/Object;", "p", "Lcom/anthropic/claude/api/chat/UpdateChatRequest;", "k", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/UpdateChatRequest;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/api/chat/UpdateChatModelFallbackResponse;", "C", "d", "Lcom/anthropic/claude/api/chat/DeleteChatsRequest;", "Lcom/anthropic/claude/api/chat/DeleteChatsResponse;", "r", "(Ljava/lang/String;Lcom/anthropic/claude/api/chat/DeleteChatsRequest;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/api/chat/MoveChatsRequest;", "Lcom/anthropic/claude/api/chat/MoveChatsResponse;", "f", "(Ljava/lang/String;Lcom/anthropic/claude/api/chat/MoveChatsRequest;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/api/chat/GenerateChatTitleRequest;", "Lcom/anthropic/claude/api/chat/GenerateChatTitleResponse;", "z", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/GenerateChatTitleRequest;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/types/strings/MessageId;", "message", "Lcom/anthropic/claude/api/chat/ChatFeedbackRequest;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/ChatFeedbackRequest;Ltp4;)Ljava/lang/Object;", "t", "Lgub;", "file", "Lcom/anthropic/claude/api/chat/MessageFile;", "Lcom/anthropic/claude/api/chat/UploadFileResponse;", "A", "(Ljava/lang/String;Lgub;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/api/chat/MessageAttachment;", "Lcom/anthropic/claude/api/chat/ConvertDocumentResponse;", "n", "Lcom/anthropic/claude/api/chat/RecordToolApprovalRequest;", "B", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/RecordToolApprovalRequest;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/api/chat/RecordToolResultRequest;", "s", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/RecordToolResultRequest;Ltp4;)Ljava/lang/Object;", "chatId", "Lcom/anthropic/claude/api/chat/FillSensitiveTextRequest;", "Lcom/anthropic/claude/api/chat/FillSensitiveTextResponse;", "v", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/FillSensitiveTextRequest;Ltp4;)Ljava/lang/Object;", "sessionId", "y", "organizationId", "Lcom/anthropic/claude/types/strings/ResearchTaskId;", "taskId", "Lcom/anthropic/claude/api/chat/tool/ResearchStatusResponse;", "l", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltp4;)Ljava/lang/Object;", "g", "Lcom/anthropic/claude/api/chat/DeleteMessageFlagRequest;", "Lcom/anthropic/claude/api/chat/DeleteMessageFlagResponse;", "o", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/chat/DeleteMessageFlagRequest;Ltp4;)Ljava/lang/Object;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public interface dl2 {
    @smc("{organization}/upload")
    @eub
    Object A(@ouc("organization") String str, @buc gub gubVar, tp4<? super ApiResult<? extends MessageFile>> tp4Var);

    @smc("organizations/{organization}/chat_conversations/{chat}/tool_approval")
    Object B(@ouc("organization") String str, @ouc("chat") String str2, @ft1 RecordToolApprovalRequest recordToolApprovalRequest, tp4<? super ApiResult<iei>> tp4Var);

    @vmc("organizations/{organization}/chat_conversations/{chat}/model_fallback")
    Object C(@ouc("organization") String str, @ouc("chat") String str2, tp4<? super ApiResult<UpdateChatModelFallbackResponse>> tp4Var);

    @lqg
    @smc("organizations/{organization}/chat_conversations/{chat}/completion")
    @vg8({"Accept: text/event-stream"})
    u82<iei> D(@ouc("organization") String organization, @ouc("chat") String chat, @ft1 ChatCompletionRequest request);

    @u08("organizations/{organization_uuid}/conversation/search/v2")
    Object a(@ouc("organization_uuid") String str, @tzd("query") String str2, @tzd("n") int i, @tzd("page_token") String str3, tp4<? super ApiResult<ConversationSearchResponse>> tp4Var);

    @smc("organizations/{organization}/chat_conversations/{chat}/chat_messages/{message}/chat_feedback")
    Object c(@ouc("organization") String str, @ouc("chat") String str2, @ouc("message") String str3, @ft1 ChatFeedbackRequest chatFeedbackRequest, tp4<? super ApiResult<iei>> tp4Var);

    @ff5("organizations/{organization}/chat_conversations/{chat}")
    Object d(@ouc("organization") String str, @ouc("chat") String str2, tp4<? super ApiResult<iei>> tp4Var);

    @lqg
    @smc("organizations/{organization}/chat_conversations/{chat}/completion")
    @vg8({"Accept: text/event-stream"})
    Object e(@ouc("organization") String str, @ouc("chat") String str2, @ft1 ChatCompletionRequest chatCompletionRequest, tp4<? super ApiResult<iei>> tp4Var);

    @smc("organizations/{organization}/chat_conversations/move_many")
    Object f(@ouc("organization") String str, @ft1 MoveChatsRequest moveChatsRequest, tp4<? super ApiResult<MoveChatsResponse>> tp4Var);

    @smc("organizations/{organization_uuid}/chat_conversations/{chat_conversation_uuid}/task/{task_id}/stop")
    Object g(@ouc("organization_uuid") String str, @ouc("chat_conversation_uuid") String str2, @ouc("task_id") String str3, tp4<? super ApiResult<iei>> tp4Var);

    @lqg
    @smc("organizations/{organization}/chat_conversations/{chat}/completion2")
    @vg8({"Accept: text/event-stream"})
    Object h(@ouc("organization") String str, @ouc("chat") String str2, @ft1 ChatCompletionRequest chatCompletionRequest, tp4<? super ApiResult<iei>> tp4Var);

    @smc("organizations/{organization}/published_artifacts/{publishedArtifactId}/remixv2")
    Object i(@ouc("organization") String str, @ouc("publishedArtifactId") String str2, tp4<? super ApiResult<ChatConversationWithProjectReference>> tp4Var);

    @vmc("organizations/{organization}/chat_conversations/{chat}")
    Object k(@ouc("organization") String str, @ouc("chat") String str2, @ft1 UpdateChatRequest updateChatRequest, tp4<? super ApiResult<iei>> tp4Var);

    @u08("organizations/{organization_uuid}/chat_conversations/{chat_conversation_uuid}/task/{task_id}/mobile_status")
    Object l(@ouc("organization_uuid") String str, @ouc("chat_conversation_uuid") String str2, @ouc("task_id") String str3, tp4<? super ApiResult<ResearchStatusResponse>> tp4Var);

    @lqg
    @smc("organizations/{organization}/chat_conversations/{chat}/retry_completion2")
    @vg8({"Accept: text/event-stream"})
    u82<iei> m(@ouc("organization") String organization, @ouc("chat") String chat, @ft1 ChatCompletionRequest request);

    @smc("organizations/{organization}/convert_document")
    @eub
    Object n(@ouc("organization") String str, @buc gub gubVar, tp4<? super ApiResult<MessageAttachment>> tp4Var);

    @qe8(hasBody = true, method = "DELETE", path = "organizations/{organization_uuid}/chat_conversations/{chat_conversation_uuid}/chat_messages/{message}/flags")
    Object o(@ouc("organization_uuid") String str, @ouc("chat_conversation_uuid") String str2, @ouc("message") String str3, @ft1 DeleteMessageFlagRequest deleteMessageFlagRequest, tp4<? super ApiResult<DeleteMessageFlagResponse>> tp4Var);

    @smc("organizations/{organization}/chat_conversations/{chat}/stop_response")
    Object p(@ouc("organization") String str, @ouc("chat") String str2, tp4<? super ApiResult<iei>> tp4Var);

    @u08("organizations/{organization}/chat_conversations/{chat}")
    Object q(@ouc("organization") String str, @ouc("chat") String str2, @tzd("rendering_mode") RenderingMode renderingMode, @tzd("render_all_mobile_tools") boolean z, @tzd("tools") String str3, @tzd("return_dangling_human_message") Boolean bool, @tzd("include_extracted_content") boolean z2, tp4<? super ApiResult<ChatConversationWithNestedMessage>> tp4Var);

    @smc("organizations/{organization}/chat_conversations/delete_many")
    Object r(@ouc("organization") String str, @ft1 DeleteChatsRequest deleteChatsRequest, tp4<? super ApiResult<DeleteChatsResponse>> tp4Var);

    @smc("organizations/{organization}/chat_conversations/{chat}/tool_result")
    Object s(@ouc("organization") String str, @ouc("chat") String str2, @ft1 RecordToolResultRequest recordToolResultRequest, tp4<? super ApiResult<iei>> tp4Var);

    @vmc("organizations/{organization}/chat_conversations/{chat}/chat_messages/{message}/chat_feedback")
    Object t(@ouc("organization") String str, @ouc("chat") String str2, @ouc("message") String str3, @ft1 ChatFeedbackRequest chatFeedbackRequest, tp4<? super ApiResult<iei>> tp4Var);

    @u08("organizations/{organization}/chat_conversations")
    Object u(@ouc("organization") String str, @tzd("consistency") ConsistencyLevel consistencyLevel, @tzd("searchQuery") String str2, @tzd("limit") Integer num, @tzd("offset") Integer num2, @tzd("starred") Boolean bool, tp4<? super ApiResult<? extends List<ChatConversationWithProjectReference>>> tp4Var);

    @smc("organizations/{organization_uuid}/chat_conversations/{chat_conversation_uuid}/browser_sessions/current/fill_sensitive_text")
    Object v(@ouc("organization_uuid") String str, @ouc("chat_conversation_uuid") String str2, @ft1 FillSensitiveTextRequest fillSensitiveTextRequest, tp4<? super ApiResult<FillSensitiveTextResponse>> tp4Var);

    @lqg
    @smc("organizations/{organization}/chat_conversations/{chat}/completion2")
    @vg8({"Accept: text/event-stream"})
    u82<iei> w(@ouc("organization") String organization, @ouc("chat") String chat, @ft1 ChatCompletionRequest request);

    @lqg
    @smc("organizations/{organization}/chat_conversations/{chat}/retry_completion")
    @vg8({"Accept: text/event-stream"})
    u82<iei> x(@ouc("organization") String organization, @ouc("chat") String chat, @ft1 ChatCompletionRequest request);

    @smc("organizations/{organization_uuid}/sessions/{session_id}/browser_sessions/current/fill_sensitive_text")
    Object y(@ouc("organization_uuid") String str, @ouc("session_id") String str2, @ft1 FillSensitiveTextRequest fillSensitiveTextRequest, tp4<? super ApiResult<FillSensitiveTextResponse>> tp4Var);

    @smc("organizations/{organization}/chat_conversations/{chat}/title")
    Object z(@ouc("organization") String str, @ouc("chat") String str2, @ft1 GenerateChatTitleRequest generateChatTitleRequest, tp4<? super ApiResult<GenerateChatTitleResponse>> tp4Var);
}
