package defpackage;

import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.sessions.types.CoworkSafetyFlagsResponse;
import com.anthropic.claude.sessions.types.CreateCoworkRemotePrimerSessionRequest;
import com.anthropic.claude.sessions.types.CreateCoworkRemoteSessionRequest;
import com.anthropic.claude.sessions.types.CreateCoworkRemoteSessionResponse;
import com.anthropic.claude.sessions.types.CreatePullRequestRequest;
import com.anthropic.claude.sessions.types.CreatePullRequestResponse;
import com.anthropic.claude.sessions.types.CreateSessionV2Params;
import com.anthropic.claude.sessions.types.CreateShareRequest;
import com.anthropic.claude.sessions.types.CreateShareResponse;
import com.anthropic.claude.sessions.types.EnvironmentCreateRequest;
import com.anthropic.claude.sessions.types.EnvironmentListResponse;
import com.anthropic.claude.sessions.types.EnvironmentResource;
import com.anthropic.claude.sessions.types.EventListResponse;
import com.anthropic.claude.sessions.types.GenerateTitleAndBranchParams;
import com.anthropic.claude.sessions.types.GenerateTitleAndBranchResponse;
import com.anthropic.claude.sessions.types.GetBatchBranchStatusRequest;
import com.anthropic.claude.sessions.types.GetBatchBranchStatusResponse;
import com.anthropic.claude.sessions.types.GetOrCreateDispatchSessionRequest;
import com.anthropic.claude.sessions.types.GetOrCreateDispatchSessionResponse;
import com.anthropic.claude.sessions.types.GetSessionV2Response;
import com.anthropic.claude.sessions.types.GetShareStatusResponse;
import com.anthropic.claude.sessions.types.GitHubBranchListResponse;
import com.anthropic.claude.sessions.types.GitProxyCompareRequest;
import com.anthropic.claude.sessions.types.GitProxyCompareResponse;
import com.anthropic.claude.sessions.types.GitProxyFileRequest;
import com.anthropic.claude.sessions.types.GitProxyFileResponse;
import com.anthropic.claude.sessions.types.ListAgentOwnedSessionsResponse;
import com.anthropic.claude.sessions.types.ListAgentsResponse;
import com.anthropic.claude.sessions.types.ListSelfHostedRunnerPoolsResponse;
import com.anthropic.claude.sessions.types.ListSessionsResponse;
import com.anthropic.claude.sessions.types.MarkSessionReadRequest;
import com.anthropic.claude.sessions.types.PrSubscriptionRequest;
import com.anthropic.claude.sessions.types.RepoListResponse;
import com.anthropic.claude.sessions.types.RepoResyncParams;
import com.anthropic.claude.sessions.types.RepoStatus;
import com.anthropic.claude.sessions.types.ReportClientPresenceRequest;
import com.anthropic.claude.sessions.types.ReportClientPresenceResponse;
import com.anthropic.claude.sessions.types.ScanSecretsRequest;
import com.anthropic.claude.sessions.types.ScanSecretsResponse;
import com.anthropic.claude.sessions.types.SendEventsRequest;
import com.anthropic.claude.sessions.types.SendEventsV2Request;
import com.anthropic.claude.sessions.types.SessionResource;
import com.anthropic.claude.sessions.types.SessionV2Envelope;
import com.anthropic.claude.sessions.types.SetPrAutoMergeRequest;
import com.anthropic.claude.sessions.types.SetSessionMcpServersRequest;
import com.anthropic.claude.sessions.types.SharedSessionData;
import com.anthropic.claude.sessions.types.UpdateSessionParams;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JX\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\nH'¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\f2\b\b\u0001\u0010\u0014\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\f2\b\b\u0001\u0010\u0014\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0019\u0010\u0017J*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\f2\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010\u001b\u001a\u00020\u001aH§@¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\f2\b\b\u0001\u0010 \u001a\u00020\u001fH§@¢\u0006\u0004\b\"\u0010#J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\fH§@¢\u0006\u0004\b%\u0010&J^\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\f2\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010(\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0003\u0010)\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0003\u0010+\u001a\u0004\u0018\u00010*H§@¢\u0006\u0004\b-\u0010.J*\u00103\u001a\b\u0012\u0004\u0012\u0002020\f2\b\b\u0001\u0010/\u001a\u00020\b2\b\b\u0001\u00101\u001a\u000200H§@¢\u0006\u0004\b3\u00104J*\u00107\u001a\b\u0012\u0004\u0012\u0002060\f2\b\b\u0001\u0010/\u001a\u00020\b2\b\b\u0001\u00101\u001a\u000205H§@¢\u0006\u0004\b7\u00108J*\u0010:\u001a\b\u0012\u0004\u0012\u0002060\f2\b\b\u0001\u0010/\u001a\u00020\b2\b\b\u0001\u00101\u001a\u000209H§@¢\u0006\u0004\b:\u0010;J*\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\f2\b\b\u0001\u0010/\u001a\u00020\b2\b\b\u0001\u0010<\u001a\u00020\bH§@¢\u0006\u0004\b>\u0010?J*\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u00101\u001a\u00020@H§@¢\u0006\u0004\bA\u0010BJ*\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u00101\u001a\u00020CH§@¢\u0006\u0004\bD\u0010EJP\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\f2\b\b\u0001\u0010\u0014\u001a\u00020\u00022\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010F\u001a\u0004\u0018\u00010\nH§@¢\u0006\u0004\bH\u0010IJ \u0010K\u001a\b\u0012\u0004\u0012\u00020J0\f2\b\b\u0001\u0010/\u001a\u00020\bH§@¢\u0006\u0004\bK\u0010\u0017J*\u0010N\u001a\b\u0012\u0004\u0012\u00020M0\f2\b\b\u0001\u0010/\u001a\u00020\b2\b\b\u0001\u0010 \u001a\u00020LH§@¢\u0006\u0004\bN\u0010OJV\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0\f2\b\b\u0001\u0010/\u001a\u00020\b2\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010P\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H§@¢\u0006\u0004\bR\u0010SJ*\u0010V\u001a\b\u0012\u0004\u0012\u00020U0\f2\b\b\u0001\u0010/\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\bH§@¢\u0006\u0004\bV\u0010?J*\u0010X\u001a\b\u0012\u0004\u0012\u00020U0\f2\b\b\u0001\u0010/\u001a\u00020\b2\b\b\u0001\u0010\u001b\u001a\u00020WH§@¢\u0006\u0004\bX\u0010YJ*\u0010Z\u001a\b\u0012\u0004\u0012\u00020U0\f2\b\b\u0001\u0010/\u001a\u00020\b2\b\b\u0001\u0010T\u001a\u00020\bH§@¢\u0006\u0004\bZ\u0010?J\u0016\u0010\\\u001a\b\u0012\u0004\u0012\u00020[0\fH§@¢\u0006\u0004\b\\\u0010&J*\u0010_\u001a\b\u0012\u0004\u0012\u00020^0\f2\b\b\u0001\u0010/\u001a\u00020\b2\b\b\u0001\u0010 \u001a\u00020]H§@¢\u0006\u0004\b_\u0010`J*\u0010b\u001a\b\u0012\u0004\u0012\u00020!0\f2\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010 \u001a\u00020aH§@¢\u0006\u0004\bb\u0010cJ*\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u00101\u001a\u00020dH§@¢\u0006\u0004\be\u0010fJ \u0010g\u001a\b\u0012\u0004\u0012\u00020!0\f2\b\b\u0001\u0010\u0014\u001a\u00020\u0002H§@¢\u0006\u0004\bg\u0010\u0017J \u0010h\u001a\b\u0012\u0004\u0012\u00020!0\f2\b\b\u0001\u0010\u0014\u001a\u00020\u0002H§@¢\u0006\u0004\bh\u0010\u0017J \u0010i\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\b\b\u0001\u0010\u0014\u001a\u00020\u0002H§@¢\u0006\u0004\bi\u0010\u0017J*\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010\u001b\u001a\u00020jH§@¢\u0006\u0004\bk\u0010lJ*\u0010o\u001a\b\u0012\u0004\u0012\u00020n0\f2\b\b\u0001\u0010/\u001a\u00020\b2\b\b\u0001\u0010\u001b\u001a\u00020mH§@¢\u0006\u0004\bo\u0010pJ \u0010s\u001a\b\u0012\u0004\u0012\u00020r0\f2\b\b\u0001\u0010\u001b\u001a\u00020qH§@¢\u0006\u0004\bs\u0010tJ \u0010v\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\b\b\u0001\u0010\u001b\u001a\u00020uH§@¢\u0006\u0004\bv\u0010wJ \u0010x\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\b\b\u0001\u0010\u001b\u001a\u00020uH§@¢\u0006\u0004\bx\u0010wJ \u0010z\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\b\b\u0001\u0010\u001b\u001a\u00020yH§@¢\u0006\u0004\bz\u0010{J \u0010}\u001a\b\u0012\u0004\u0012\u00020|0\f2\b\b\u0001\u0010\u0014\u001a\u00020\u0002H§@¢\u0006\u0004\b}\u0010\u0017J#\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u007f0\f2\b\b\u0001\u0010\u001b\u001a\u00020~H§@¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J#\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\t\b\u0001\u0010\u0082\u0001\u001a\u00020\bH§@¢\u0006\u0005\b\u0083\u0001\u0010\u0017JI\u0010\u0085\u0001\u001a\t\u0012\u0005\u0012\u00030\u0084\u00010\f2\t\b\u0001\u0010\u0082\u0001\u001a\u00020\b2\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J/\u0010\u0089\u0001\u001a\t\u0012\u0005\u0012\u00030\u0088\u00010\f2\b\b\u0001\u0010/\u001a\u00020\b2\t\b\u0001\u0010\u001b\u001a\u00030\u0087\u0001H§@¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J`\u0010\u0090\u0001\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010\f2\b\b\u0001\u0010/\u001a\u00020\b2\t\b\u0001\u0010\u008b\u0001\u001a\u00020\b2\t\b\u0001\u0010\u008c\u0001\u001a\u00020\b2\u000b\b\u0003\u0010\u008d\u0001\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\b2\u000b\b\u0003\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J1\u0010\u0094\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0093\u00010\f2\b\b\u0001\u0010\u0014\u001a\u00020\u00022\t\b\u0001\u0010\u001b\u001a\u00030\u0092\u0001H§@¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J/\u0010\u0098\u0001\u001a\t\u0012\u0005\u0012\u00030\u0097\u00010\f2\b\b\u0001\u0010\u0014\u001a\u00020\u00022\t\b\u0001\u0010\u001b\u001a\u00030\u0096\u0001H§@¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001¨\u0006\u009a\u0001À\u0006\u0003"}, d2 = {"Lnwf;", "", "Lcom/anthropic/claude/types/strings/SessionId;", "beforeId", "afterId", "", "limit", "", "", "tags", "", "includeTriggerSessions", "Lcom/anthropic/claude/api/result/ApiResult;", "Lcom/anthropic/claude/sessions/types/ListSessionsResponse;", "i", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;Ltp4;)Ljava/lang/Object;", "Lu82;", "Liei;", "P", "(Ljava/util/List;Ljava/lang/Boolean;)Lu82;", "sessionId", "Lcom/anthropic/claude/sessions/types/SessionResource;", "v", "(Ljava/lang/String;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/sessions/types/GetSessionV2Response;", "a", "Lcom/anthropic/claude/sessions/types/ReportClientPresenceRequest;", "request", "Lcom/anthropic/claude/sessions/types/ReportClientPresenceResponse;", "l", "(Ljava/lang/String;Lcom/anthropic/claude/sessions/types/ReportClientPresenceRequest;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/sessions/types/CreateSessionV2Params;", "params", "Lcom/anthropic/claude/sessions/types/SessionV2Envelope;", "D", "(Lcom/anthropic/claude/sessions/types/CreateSessionV2Params;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/sessions/types/ListAgentsResponse;", "f", "(Ltp4;)Ljava/lang/Object;", "cursor", "origins", "relations", "Lcom/anthropic/claude/types/strings/SessionGroupingId;", "sessionGroupingId", "Lcom/anthropic/claude/sessions/types/ListAgentOwnedSessionsResponse;", "K", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ltp4;)Ljava/lang/Object;", "organizationId", "Lcom/anthropic/claude/sessions/types/GetOrCreateDispatchSessionRequest;", "body", "Lcom/anthropic/claude/sessions/types/GetOrCreateDispatchSessionResponse;", "r", "(Ljava/lang/String;Lcom/anthropic/claude/sessions/types/GetOrCreateDispatchSessionRequest;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/sessions/types/CreateCoworkRemoteSessionRequest;", "Lcom/anthropic/claude/sessions/types/CreateCoworkRemoteSessionResponse;", "I", "(Ljava/lang/String;Lcom/anthropic/claude/sessions/types/CreateCoworkRemoteSessionRequest;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/sessions/types/CreateCoworkRemotePrimerSessionRequest;", "y", "(Ljava/lang/String;Lcom/anthropic/claude/sessions/types/CreateCoworkRemotePrimerSessionRequest;Ltp4;)Ljava/lang/Object;", "messageId", "Lcom/anthropic/claude/sessions/types/CoworkSafetyFlagsResponse;", "E", "(Ljava/lang/String;Ljava/lang/String;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/sessions/types/SendEventsRequest;", "g", "(Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SendEventsRequest;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/sessions/types/SendEventsV2Request;", "b", "(Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SendEventsV2Request;Ltp4;)Ljava/lang/Object;", "anchorToLatest", "Lcom/anthropic/claude/sessions/types/EventListResponse;", "k", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/sessions/types/RepoListResponse;", "e", "Lcom/anthropic/claude/sessions/types/RepoResyncParams;", "Lcom/anthropic/claude/sessions/types/RepoStatus;", "B", "(Ljava/lang/String;Lcom/anthropic/claude/sessions/types/RepoResyncParams;Ltp4;)Ljava/lang/Object;", "includedWorkerTypes", "Lcom/anthropic/claude/sessions/types/EnvironmentListResponse;", "M", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ltp4;)Ljava/lang/Object;", "environmentId", "Lcom/anthropic/claude/sessions/types/EnvironmentResource;", "u", "Lcom/anthropic/claude/sessions/types/EnvironmentCreateRequest;", "Q", "(Ljava/lang/String;Lcom/anthropic/claude/sessions/types/EnvironmentCreateRequest;Ltp4;)Ljava/lang/Object;", "j", "Lcom/anthropic/claude/sessions/types/ListSelfHostedRunnerPoolsResponse;", "N", "Lcom/anthropic/claude/sessions/types/GenerateTitleAndBranchParams;", "Lcom/anthropic/claude/sessions/types/GenerateTitleAndBranchResponse;", "s", "(Ljava/lang/String;Lcom/anthropic/claude/sessions/types/GenerateTitleAndBranchParams;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/sessions/types/UpdateSessionParams;", "F", "(Ljava/lang/String;Lcom/anthropic/claude/sessions/types/UpdateSessionParams;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/sessions/types/SetSessionMcpServersRequest;", "w", "(Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SetSessionMcpServersRequest;Ltp4;)Ljava/lang/Object;", "o", "H", "z", "Lcom/anthropic/claude/sessions/types/MarkSessionReadRequest;", "x", "(Ljava/lang/String;Lcom/anthropic/claude/sessions/types/MarkSessionReadRequest;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/sessions/types/CreatePullRequestRequest;", "Lcom/anthropic/claude/sessions/types/CreatePullRequestResponse;", "m", "(Ljava/lang/String;Lcom/anthropic/claude/sessions/types/CreatePullRequestRequest;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/sessions/types/GetBatchBranchStatusRequest;", "Lcom/anthropic/claude/sessions/types/GetBatchBranchStatusResponse;", "J", "(Lcom/anthropic/claude/sessions/types/GetBatchBranchStatusRequest;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/sessions/types/PrSubscriptionRequest;", "t", "(Lcom/anthropic/claude/sessions/types/PrSubscriptionRequest;Ltp4;)Ljava/lang/Object;", "h", "Lcom/anthropic/claude/sessions/types/SetPrAutoMergeRequest;", "C", "(Lcom/anthropic/claude/sessions/types/SetPrAutoMergeRequest;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/sessions/types/GetShareStatusResponse;", "d", "Lcom/anthropic/claude/sessions/types/CreateShareRequest;", "Lcom/anthropic/claude/sessions/types/CreateShareResponse;", "q", "(Lcom/anthropic/claude/sessions/types/CreateShareRequest;Ltp4;)Ljava/lang/Object;", "shareId", "G", "Lcom/anthropic/claude/sessions/types/SharedSessionData;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/sessions/types/ScanSecretsRequest;", "Lcom/anthropic/claude/sessions/types/ScanSecretsResponse;", "L", "(Ljava/lang/String;Lcom/anthropic/claude/sessions/types/ScanSecretsRequest;Ltp4;)Ljava/lang/Object;", "owner", "repo", "query", "gheConfigurationId", "Lcom/anthropic/claude/sessions/types/GitHubBranchListResponse;", "n", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/sessions/types/GitProxyCompareRequest;", "Lcom/anthropic/claude/sessions/types/GitProxyCompareResponse;", "p", "(Ljava/lang/String;Lcom/anthropic/claude/sessions/types/GitProxyCompareRequest;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/sessions/types/GitProxyFileRequest;", "Lcom/anthropic/claude/sessions/types/GitProxyFileResponse;", "O", "(Ljava/lang/String;Lcom/anthropic/claude/sessions/types/GitProxyFileRequest;Ltp4;)Ljava/lang/Object;", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public interface nwf {
    static /* synthetic */ Object A(nwf nwfVar, String str, String str2, Integer num, ewf ewfVar, int i) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        return nwfVar.c(str, null, str2, num, ewfVar);
    }

    @smc("api/organizations/{organizationId}/code/repos/resync")
    Object B(@ouc("organizationId") String str, @ft1 RepoResyncParams repoResyncParams, tp4<? super ApiResult<RepoStatus>> tp4Var);

    @smc("v1/code/github/set-pr-auto-merge")
    Object C(@ft1 SetPrAutoMergeRequest setPrAutoMergeRequest, tp4<? super ApiResult<iei>> tp4Var);

    @smc("v1/code/sessions")
    Object D(@ft1 CreateSessionV2Params createSessionV2Params, tp4<? super ApiResult<SessionV2Envelope>> tp4Var);

    @u08("api/organizations/{organizationId}/cowork/messages/{messageId}/safety_flags")
    Object E(@ouc("organizationId") String str, @ouc("messageId") String str2, tp4<? super ApiResult<CoworkSafetyFlagsResponse>> tp4Var);

    @vmc("v1/code/sessions/{sessionId}")
    Object F(@ouc("sessionId") String str, @ft1 UpdateSessionParams updateSessionParams, tp4<? super ApiResult<SessionV2Envelope>> tp4Var);

    @ff5("v1/sessions-share/{shareId}")
    Object G(@ouc("shareId") String str, tp4<? super ApiResult<iei>> tp4Var);

    @smc("v1/code/sessions/{sessionId}/unarchive")
    Object H(@ouc("sessionId") String str, tp4<? super ApiResult<SessionV2Envelope>> tp4Var);

    @smc("api/organizations/{organizationId}/cowork/sessions")
    Object I(@ouc("organizationId") String str, @ft1 CreateCoworkRemoteSessionRequest createCoworkRemoteSessionRequest, tp4<? super ApiResult<CreateCoworkRemoteSessionResponse>> tp4Var);

    @smc("v1/code/github/batch-branch-status")
    Object J(@ft1 GetBatchBranchStatusRequest getBatchBranchStatusRequest, tp4<? super ApiResult<GetBatchBranchStatusResponse>> tp4Var);

    @u08("v1/code/sessions/agent_owned")
    Object K(@tzd("cursor") String str, @tzd("limit") Integer num, @tzd("origins") List<String> list, @tzd("relations") List<String> list2, @tzd("session_grouping_id") String str2, tp4<? super ApiResult<ListAgentOwnedSessionsResponse>> tp4Var);

    @smc("api/organizations/{organizationId}/code/shares/scan_secrets")
    Object L(@ouc("organizationId") String str, @ft1 ScanSecretsRequest scanSecretsRequest, tp4<? super ApiResult<ScanSecretsResponse>> tp4Var);

    @u08("v1/environment_providers/private/organizations/{organizationId}/environments")
    Object M(@ouc("organizationId") String str, @tzd("before_id") String str2, @tzd("after_id") String str3, @tzd("limit") Integer num, @tzd("included_worker_types") List<String> list, tp4<? super ApiResult<EnvironmentListResponse>> tp4Var);

    @u08("v1/code/runners/self-hosted/pools")
    Object N(tp4<? super ApiResult<ListSelfHostedRunnerPoolsResponse>> tp4Var);

    @smc("v1/session_ingress/session/{sessionId}/git_proxy/file")
    Object O(@ouc("sessionId") String str, @ft1 GitProxyFileRequest gitProxyFileRequest, tp4<? super ApiResult<GitProxyFileResponse>> tp4Var);

    @lqg
    @u08("v1/sessions/watch")
    @vg8({"Accept: text/event-stream"})
    u82<iei> P(@tzd("tags") List<String> tags, @tzd("include_trigger_sessions") Boolean includeTriggerSessions);

    @smc("v1/environment_providers/private/organizations/{organizationId}/cloud/create")
    Object Q(@ouc("organizationId") String str, @ft1 EnvironmentCreateRequest environmentCreateRequest, tp4<? super ApiResult<EnvironmentResource>> tp4Var);

    @u08("v1/code/sessions/{sessionId}")
    Object a(@ouc("sessionId") String str, tp4<? super ApiResult<GetSessionV2Response>> tp4Var);

    @smc("v1/code/sessions/{sessionId}/events")
    Object b(@ouc("sessionId") String str, @ft1 SendEventsV2Request sendEventsV2Request, tp4<? super ApiResult<iei>> tp4Var);

    @u08("v1/sessions-share/{shareId}")
    Object c(@ouc("shareId") String str, @tzd("before_id") String str2, @tzd("after_id") String str3, @tzd("limit") Integer num, tp4<? super ApiResult<SharedSessionData>> tp4Var);

    @u08("v1/sessions/{sessionId}/share-status")
    Object d(@ouc("sessionId") String str, tp4<? super ApiResult<GetShareStatusResponse>> tp4Var);

    @u08("api/organizations/{organizationId}/code/repos/all")
    Object e(@ouc("organizationId") String str, tp4<? super ApiResult<RepoListResponse>> tp4Var);

    @u08("v1/code/agents")
    Object f(tp4<? super ApiResult<ListAgentsResponse>> tp4Var);

    @smc("v1/sessions/{sessionId}/events")
    Object g(@ouc("sessionId") String str, @ft1 SendEventsRequest sendEventsRequest, tp4<? super ApiResult<iei>> tp4Var);

    @smc("v1/code/github/unsubscribe-pr")
    Object h(@ft1 PrSubscriptionRequest prSubscriptionRequest, tp4<? super ApiResult<iei>> tp4Var);

    @u08("v1/sessions")
    Object i(@tzd("before_id") String str, @tzd("after_id") String str2, @tzd("limit") Integer num, @tzd("tags") List<String> list, @tzd("include_trigger_sessions") Boolean bool, tp4<? super ApiResult<ListSessionsResponse>> tp4Var);

    @smc("v1/environment_providers/private/organizations/{organizationId}/environments/{environmentId}/archive")
    Object j(@ouc("organizationId") String str, @ouc("environmentId") String str2, tp4<? super ApiResult<EnvironmentResource>> tp4Var);

    @u08("v1/sessions/{sessionId}/events")
    Object k(@ouc("sessionId") String str, @tzd("before_id") String str2, @tzd("after_id") String str3, @tzd("limit") Integer num, @tzd("anchor_to_latest") Boolean bool, tp4<? super ApiResult<EventListResponse>> tp4Var);

    @smc("v1/code/sessions/{sessionId}/client/presence")
    Object l(@ouc("sessionId") String str, @ft1 ReportClientPresenceRequest reportClientPresenceRequest, tp4<? super ApiResult<ReportClientPresenceResponse>> tp4Var);

    @smc("api/github/organizations/{organizationId}/github_create_pr")
    Object m(@ouc("organizationId") String str, @ft1 CreatePullRequestRequest createPullRequestRequest, tp4<? super ApiResult<CreatePullRequestResponse>> tp4Var);

    @u08("api/github/organizations/{organizationId}/github/{owner}/{repo}/branches")
    Object n(@ouc("organizationId") String str, @ouc("owner") String str2, @ouc("repo") String str3, @tzd("query") String str4, @tzd("after") String str5, @tzd("ghe_configuration_id") Integer num, tp4<? super ApiResult<GitHubBranchListResponse>> tp4Var);

    @smc("v1/code/sessions/{sessionId}/archive")
    Object o(@ouc("sessionId") String str, tp4<? super ApiResult<SessionV2Envelope>> tp4Var);

    @smc("v1/session_ingress/session/{sessionId}/git_proxy/compare")
    Object p(@ouc("sessionId") String str, @ft1 GitProxyCompareRequest gitProxyCompareRequest, tp4<? super ApiResult<GitProxyCompareResponse>> tp4Var);

    @smc("v1/sessions-share")
    Object q(@ft1 CreateShareRequest createShareRequest, tp4<? super ApiResult<CreateShareResponse>> tp4Var);

    @smc("api/organizations/{organizationId}/cowork/dispatch/sessions")
    Object r(@ouc("organizationId") String str, @ft1 GetOrCreateDispatchSessionRequest getOrCreateDispatchSessionRequest, tp4<? super ApiResult<GetOrCreateDispatchSessionResponse>> tp4Var);

    @smc("api/organizations/{organizationId}/dust/generate_title_and_branch")
    Object s(@ouc("organizationId") String str, @ft1 GenerateTitleAndBranchParams generateTitleAndBranchParams, tp4<? super ApiResult<GenerateTitleAndBranchResponse>> tp4Var);

    @smc("v1/code/github/subscribe-pr")
    Object t(@ft1 PrSubscriptionRequest prSubscriptionRequest, tp4<? super ApiResult<iei>> tp4Var);

    @u08("v1/environment_providers/private/organizations/{organizationId}/environments/{environmentId}")
    Object u(@ouc("organizationId") String str, @ouc("environmentId") String str2, tp4<? super ApiResult<EnvironmentResource>> tp4Var);

    @u08("v1/sessions/{sessionId}")
    Object v(@ouc("sessionId") String str, tp4<? super ApiResult<SessionResource>> tp4Var);

    @vmc("v1/code/sessions/{sessionId}/mcp-servers")
    Object w(@ouc("sessionId") String str, @ft1 SetSessionMcpServersRequest setSessionMcpServersRequest, tp4<? super ApiResult<iei>> tp4Var);

    @smc("v1/code/sessions/{sessionId}/mark_read")
    Object x(@ouc("sessionId") String str, @ft1 MarkSessionReadRequest markSessionReadRequest, tp4<? super ApiResult<iei>> tp4Var);

    @smc("api/organizations/{organizationId}/cowork/sessions")
    Object y(@ouc("organizationId") String str, @ft1 CreateCoworkRemotePrimerSessionRequest createCoworkRemotePrimerSessionRequest, tp4<? super ApiResult<CreateCoworkRemoteSessionResponse>> tp4Var);

    @ff5("v1/sessions/{sessionId}")
    Object z(@ouc("sessionId") String str, tp4<? super ApiResult<iei>> tp4Var);
}
