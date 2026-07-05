package defpackage;

import com.anthropic.claude.api.result.ApiResult;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lmk7;", "", "Lcom/anthropic/claude/types/strings/OrganizationId;", "organization", "", "fileUuid", "Lcom/anthropic/claude/api/result/ApiResult;", "Lrqe;", "a", "(Ljava/lang/String;Ljava/lang/String;Ltp4;)Ljava/lang/Object;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public interface mk7 {
    @u08("{organization}/files/{fileUuid}/preview")
    Object a(@ouc("organization") String str, @ouc("fileUuid") String str2, tp4<? super ApiResult<? extends rqe>> tp4Var);
}
