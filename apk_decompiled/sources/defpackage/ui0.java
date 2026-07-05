package defpackage;

import com.anthropic.claude.api.feedback.AppFeedbackResponse;
import com.anthropic.claude.api.result.ApiResult;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J0\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lui0;", "", "Lcom/anthropic/claude/types/strings/OrganizationId;", "organization", "", "Lgub;", "parts", "Lcom/anthropic/claude/api/result/ApiResult;", "Lcom/anthropic/claude/api/feedback/AppFeedbackResponse;", "a", "(Ljava/lang/String;Ljava/util/List;Ltp4;)Ljava/lang/Object;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public interface ui0 {
    @smc("organizations/{organization}/app_feedback")
    @eub
    Object a(@ouc("organization") String str, @buc List<gub> list, tp4<? super ApiResult<AppFeedbackResponse>> tp4Var);
}
