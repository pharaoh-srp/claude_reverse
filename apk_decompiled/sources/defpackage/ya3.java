package defpackage;

import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.api.share.ChatSnapshot;
import com.anthropic.claude.api.share.ChatSnapshotReportRequest;
import com.anthropic.claude.api.share.ChatSnapshotSummary;
import com.anthropic.claude.api.share.ChatSnapshotSummaryWithChatId;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ>\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\u0014\u0010\tJ0\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00150\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0016\u0010\tJ&\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00150\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0018\u0010\u0019J4\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u001b\u001a\u00020\u001aH§@¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001eÀ\u0006\u0003"}, d2 = {"Lya3;", "", "Lcom/anthropic/claude/types/strings/OrganizationId;", "organizationId", "Lcom/anthropic/claude/types/strings/ChatId;", "chatId", "Lcom/anthropic/claude/api/result/ApiResult;", "Lcom/anthropic/claude/api/share/ChatSnapshotSummary;", "c", "(Ljava/lang/String;Ljava/lang/String;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/types/strings/ChatSnapshotId;", "snapshotId", "", "renderingMode", "", "renderAllMobileTools", "Lcom/anthropic/claude/api/share/ChatSnapshot;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLtp4;)Ljava/lang/Object;", "Liei;", "f", "", "a", "Lcom/anthropic/claude/api/share/ChatSnapshotSummaryWithChatId;", "d", "(Ljava/lang/String;Ltp4;)Ljava/lang/Object;", "Lcom/anthropic/claude/api/share/ChatSnapshotReportRequest;", "request", "e", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/share/ChatSnapshotReportRequest;Ltp4;)Ljava/lang/Object;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public interface ya3 {
    @u08("organizations/{organization}/chat_conversations/{chat}/shares")
    Object a(@ouc("organization") String str, @ouc("chat") String str2, tp4<? super ApiResult<? extends List<ChatSnapshotSummary>>> tp4Var);

    @u08("organizations/{organization}/chat_snapshots/{snapshot}")
    Object b(@ouc("organization") String str, @ouc("snapshot") String str2, @tzd("rendering_mode") String str3, @tzd("render_all_mobile_tools") boolean z, tp4<? super ApiResult<ChatSnapshot>> tp4Var);

    @smc("organizations/{organization}/chat_conversations/{chat}/share")
    Object c(@ouc("organization") String str, @ouc("chat") String str2, tp4<? super ApiResult<ChatSnapshotSummary>> tp4Var);

    @u08("organizations/{organization}/shares")
    Object d(@ouc("organization") String str, tp4<? super ApiResult<? extends List<ChatSnapshotSummaryWithChatId>>> tp4Var);

    @smc("organizations/{organization}/chat_snapshots/{snapshot}/report")
    Object e(@ouc("organization") String str, @ouc("snapshot") String str2, @ft1 ChatSnapshotReportRequest chatSnapshotReportRequest, tp4<? super ApiResult<iei>> tp4Var);

    @ff5("organizations/{organization}/share/{snapshot}")
    Object f(@ouc("organization") String str, @ouc("snapshot") String str2, tp4<? super ApiResult<iei>> tp4Var);
}
