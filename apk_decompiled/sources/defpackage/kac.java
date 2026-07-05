package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.R;
import com.anthropic.claude.api.model.ModelSelectorEntry;
import com.anthropic.claude.app.onboarding.OnboardingPage;
import com.anthropic.claude.configs.flags.OnboardingConfig;
import com.anthropic.claude.tool.model.KnowledgeSource;
import com.anthropic.claude.wear.PhoneWearableListenerService;
import com.anthropic.router.panes.Panes;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kac implements bz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ kac(int i) {
        this.E = i;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                yn6 yn6Var = (yn6) obj;
                yn6Var.getClass();
                return new cpc(Double.valueOf(yn6Var.b()), "kcal");
            case 1:
                fva fvaVar = (fva) obj;
                fvaVar.getClass();
                return new cpc(Double.valueOf(fvaVar.b()), "g");
            case 2:
                ((Uri) obj).getClass();
                return Boolean.FALSE;
            case 3:
                gj7 gj7Var = (gj7) obj;
                gj7Var.getClass();
                gj7Var.destroy();
                return ieiVar;
            case 4:
                ((OnboardingConfig) obj).getClass();
                return OnboardingPage.Intro.INSTANCE;
            case 5:
                ((OnboardingConfig) obj).getClass();
                return OnboardingPage.Name.INSTANCE;
            case 6:
                ((OnboardingConfig) obj).getClass();
                return OnboardingPage.Age.INSTANCE;
            case 7:
                ((OnboardingConfig) obj).getClass();
                return OnboardingPage.Phone.INSTANCE;
            case 8:
                ((OnboardingConfig) obj).getClass();
                return OnboardingPage.Permission.INSTANCE;
            case 9:
                ((OnboardingConfig) obj).getClass();
                return OnboardingPage.Grove.INSTANCE;
            case 10:
                OnboardingConfig onboardingConfig = (OnboardingConfig) obj;
                onboardingConfig.getClass();
                return new OnboardingPage.Subscription(onboardingConfig.getShowAnnualPricePerMonth());
            case 11:
                ((OnboardingConfig) obj).getClass();
                return OnboardingPage.Desktop.INSTANCE;
            case 12:
                ModelSelectorEntry modelSelectorEntry = (ModelSelectorEntry) obj;
                modelSelectorEntry.getClass();
                return Boolean.valueOf(modelSelectorEntry.isSelectable());
            case 13:
                ((ekf) obj).getClass();
                return ieiVar;
            case 14:
                ((ekf) obj).getClass();
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((ekf) obj).getClass();
                return ieiVar;
            case 16:
                xe4 xe4Var = aqc.a;
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((qa2) obj).b = true;
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                Panes panes = (Panes) obj;
                panes.getClass();
                return Panes.copy$default(panes, null, lm6.E, null, null, 13, null);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                Panes panes2 = (Panes) obj;
                panes2.getClass();
                return !panes2.getExtra().isEmpty() ? Panes.copy$default(panes2, null, null, w44.J0(1, panes2.getExtra()), null, 11, null) : !panes2.getDetails().isEmpty() ? Panes.copy$default(panes2, null, w44.J0(1, panes2.getDetails()), null, null, 13, null) : panes2.getMain().size() > 1 ? Panes.copy$default(panes2, w44.J0(1, panes2.getMain()), null, null, null, 14, null) : panes2;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                Panes panes3 = (Panes) obj;
                panes3.getClass();
                if (panes3.getMain().size() > 1) {
                    return Panes.copy$default(panes3, w44.J0(1, panes3.getMain()), null, null, null, 14, null);
                }
                sz6.j("Cannot pop the last item from the Main stack");
                return null;
            case 21:
                Panes panes4 = (Panes) obj;
                panes4.getClass();
                return Panes.copy$default(panes4, null, w44.J0(1, panes4.getDetails()), null, null, 13, null);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                Panes panes5 = (Panes) obj;
                panes5.getClass();
                return Panes.copy$default(panes5, null, null, w44.J0(1, panes5.getExtra()), null, 11, null);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                KnowledgeSource knowledgeSource = (KnowledgeSource) obj;
                knowledgeSource.getClass();
                String title = knowledgeSource.getTitle();
                if (title == null) {
                    Context context = x44.d;
                    if (context == null) {
                        sz6.j("Context not initialized");
                        return null;
                    }
                    title = context.getString(R.string.generic_unknown);
                    title.getClass();
                }
                return knowledgeSource.getUrl() != null ? ij0.l("- [", title, "](", knowledgeSource.getUrl(), ")") : "- ".concat(title);
            case 24:
                usc uscVar = (usc) obj;
                uscVar.getClass();
                StringBuilder sb = new StringBuilder("position ");
                sb.append(uscVar.a);
                sb.append(": '");
                return vb7.s(sb, (String) uscVar.b.a(), '\'');
            case BuildConfig.VERSION_CODE /* 25 */:
                gj7 gj7Var2 = (gj7) obj;
                gj7Var2.getClass();
                gj7Var2.destroy();
                return ieiVar;
            case 26:
                Double d = (Double) obj;
                d.doubleValue();
                return new cpc(d, "rpm");
            case 27:
                og9 og9Var = (og9) obj;
                og9Var.getClass();
                og9Var.c = true;
                return ieiVar;
            case 28:
                og9 og9Var2 = (og9) obj;
                int i2 = PhoneWearableListenerService.R;
                og9Var2.getClass();
                og9Var2.c = true;
                return ieiVar;
            default:
                String str = (String) obj;
                str.getClass();
                if (str.length() <= 0) {
                    return str;
                }
                return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
    }
}
