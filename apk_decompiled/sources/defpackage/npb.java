package defpackage;

import com.anthropic.claude.api.bootstrap.ModelSelectorStateBody;
import com.anthropic.claude.api.model.ModelSelectorState;
import com.anthropic.claude.api.result.ApiResult;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J4\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lnpb;", "", "Lcom/anthropic/claude/types/strings/OrganizationId;", "organizationUuid", "Lcom/anthropic/claude/api/model/ModelSelectorSurface;", "surface", "Lcom/anthropic/claude/api/bootstrap/ModelSelectorStateBody;", "body", "Lcom/anthropic/claude/api/result/ApiResult;", "Lcom/anthropic/claude/api/model/ModelSelectorState;", "a", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/bootstrap/ModelSelectorStateBody;Ltp4;)Ljava/lang/Object;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public interface npb {
    @rmc("organizations/{organizationUuid}/model_selector_state/{surface}")
    Object a(@ouc("organizationUuid") String str, @ouc("surface") String str2, @ft1 ModelSelectorStateBody modelSelectorStateBody, tp4<? super ApiResult<ModelSelectorState>> tp4Var);
}
