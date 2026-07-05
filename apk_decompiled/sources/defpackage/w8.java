package defpackage;

import com.anthropic.claude.api.account.AccountSettings;
import com.anthropic.claude.api.account.VillageWeaverConsentState;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w8 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ VillageWeaverConsentState F;

    public /* synthetic */ w8(VillageWeaverConsentState villageWeaverConsentState, int i) {
        this.E = i;
        this.F = villageWeaverConsentState;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        switch (this.E) {
            case 0:
                AccountSettings accountSettings = (AccountSettings) obj;
                accountSettings.getClass();
                return AccountSettings.m107copyNcesMF4$default(accountSettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.F, null, null, null, null, 260046847, null);
            default:
                AccountSettings accountSettings2 = (AccountSettings) obj;
                accountSettings2.getClass();
                return AccountSettings.m107copyNcesMF4$default(accountSettings2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.F, null, null, null, null, 260046847, null);
        }
    }
}
