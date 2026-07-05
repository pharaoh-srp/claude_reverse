package defpackage;

import com.anthropic.claude.api.purchase.PurchaseReceipt;
import com.anthropic.claude.api.purchase.VerifyPurchaseResponse;
import com.anthropic.claude.api.result.ApiResult;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lpxd;", "", "Lcom/anthropic/claude/api/purchase/PurchaseReceipt;", "purchase", "Lcom/anthropic/claude/api/result/ApiResult;", "Lcom/anthropic/claude/api/purchase/VerifyPurchaseResponse;", "a", "(Lcom/anthropic/claude/api/purchase/PurchaseReceipt;Ltp4;)Ljava/lang/Object;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public interface pxd {
    @smc("google-play-iap/purchase")
    Object a(@ft1 PurchaseReceipt purchaseReceipt, tp4<? super ApiResult<VerifyPurchaseResponse>> tp4Var);
}
