package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.MemoryEvents$ConversationPreferencesUpdate;
import com.anthropic.claude.api.account.Account;
import com.anthropic.claude.api.account.AccountProfile;
import com.anthropic.claude.api.account.AccountSettings;
import com.anthropic.claude.api.account.UpdateAccountProfileRequest;
import com.anthropic.claude.api.account.UpdateAccountRequest;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.ui.components.snackbar.a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tid extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ vid G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tid(vid vidVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = vidVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        vid vidVar = this.G;
        switch (i) {
            case 0:
                return new tid(vidVar, tp4Var, 0);
            case 1:
                return new tid(vidVar, tp4Var, 1);
            default:
                return new tid(vidVar, tp4Var, 2);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((tid) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        Object objC;
        Object objB;
        int i = this.E;
        st6 st6Var = st6.F;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        vid vidVar = this.G;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    if (vid.O(vidVar, this) == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 1:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    vidVar.o.setValue(Boolean.TRUE);
                    o7 o7Var = vidVar.c;
                    UpdateAccountRequest updateAccountRequest = new UpdateAccountRequest(((cjh) vidVar.h.getValue()).a.F, ((cjh) vidVar.i.getValue()).a.F, (List) null, (AccountSettings) null, (Boolean) null, 16, (mq5) null);
                    this.F = 1;
                    objC = o7Var.c(updateAccountRequest, this);
                    if (objC == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                    objC = obj;
                }
                ApiResult apiResult = (ApiResult) objC;
                if (apiResult instanceof of0) {
                    vidVar.b.c((Account) ((of0) apiResult).b);
                    vidVar.f.r(new pt6(R.string.profile_snackbar_account_info_updated, st6Var));
                } else if (!(apiResult instanceof nf0)) {
                    wg6.i();
                }
                a.a(apiResult, vidVar.f);
                vidVar.o.setValue(Boolean.FALSE);
                break;
            default:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    vidVar.p.setValue(Boolean.TRUE);
                    i8 i8Var = vidVar.d;
                    UpdateAccountProfileRequest updateAccountProfileRequest = new UpdateAccountProfileRequest(((cjh) vidVar.j.getValue()).a.F);
                    this.F = 1;
                    objB = i8Var.b(updateAccountProfileRequest, this);
                    if (objB == m45Var) {
                    }
                } else if (i4 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                    objB = obj;
                }
                ApiResult apiResult2 = (ApiResult) objB;
                if (apiResult2 instanceof of0) {
                    AccountProfile accountProfile = (AccountProfile) ((of0) apiResult2).b;
                    q7 q7Var = vidVar.b;
                    lsc lscVar = vidVar.j;
                    q7Var.getClass();
                    accountProfile.getClass();
                    q7Var.b.setValue(accountProfile);
                    cjh cjhVar = (cjh) lscVar.getValue();
                    String conversation_preferences = accountProfile.getConversation_preferences();
                    if (conversation_preferences == null) {
                        conversation_preferences = "";
                    }
                    lscVar.setValue(cjh.b(cjhVar, conversation_preferences, 0L, 6));
                    String conversation_preferences2 = accountProfile.getConversation_preferences();
                    vidVar.l.setValue(conversation_preferences2 != null ? conversation_preferences2 : "");
                    vidVar.f.r(new pt6(R.string.profile_snackbar_preferences_updated, st6Var));
                    vidVar.e.e(new MemoryEvents$ConversationPreferencesUpdate(((cjh) lscVar.getValue()).a.F.length() > 0), MemoryEvents$ConversationPreferencesUpdate.Companion.serializer());
                } else if (!(apiResult2 instanceof nf0)) {
                    wg6.i();
                }
                a.a(apiResult2, vidVar.f);
                vidVar.p.setValue(Boolean.FALSE);
                break;
        }
        return null;
    }
}
