package defpackage;

import com.anthropic.claude.api.account.BillingType;
import com.anthropic.claude.api.account.Membership;
import com.anthropic.claude.api.account.Organization;
import com.anthropic.claude.api.model.ModelOption;
import com.anthropic.claude.api.model.ModelSelectorConfig;
import com.anthropic.claude.api.model.ModelSelectorEntry;
import com.anthropic.claude.api.model.ModelSelectorState;
import com.anthropic.claude.api.model.ModelSelectorSurface;
import com.anthropic.claude.api.model.ThinkingModeOption;
import com.anthropic.claude.models.organization.configtypes.AvailableModelsConfig;
import com.anthropic.claude.models.organization.configtypes.ModelFallbacksConfig;
import com.anthropic.claude.models.organization.configtypes.RegionSupport;
import com.anthropic.claude.models.organization.configtypes.StickyConfig;
import com.anthropic.claude.models.organization.configtypes.StickySelectionConfig;
import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings.OrganizationId;
import com.anthropic.claude.types.strings._ServerLocalizedString;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class okc {
    public final String a;
    public final rc8 b;
    public final q7 c;
    public final lea d;
    public final gob e;
    public final vob f;
    public final mn5 g;
    public final wz5 h;
    public final wz5 i;
    public final wz5 j;
    public final wz5 k;
    public final wz5 l;
    public final wz5 m;
    public final wz5 n;
    public final wz5 o;
    public final wz5 p;
    public final wlg q;
    public final wlg r;
    public final wz5 s;
    public final wz5 t;
    public final wz5 u;
    public final wz5 v;
    public final wz5 w;
    public final wz5 x;
    public final wz5 y;

    public okc(String str, rc8 rc8Var, q7 q7Var, lea leaVar, gob gobVar, vob vobVar, mn5 mn5Var) {
        rc8Var.getClass();
        this.a = str;
        this.b = rc8Var;
        this.c = q7Var;
        this.d = leaVar;
        this.e = gobVar;
        this.f = vobVar;
        this.g = mn5Var;
        final int i = 0;
        this.h = mpk.w(new zy7(this) { // from class: lkc
            public final /* synthetic */ okc F;

            {
                this.F = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v0, types: [lm6] */
            /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v13 */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v22, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v12 */
            /* JADX WARN: Type inference failed for: r5v13 */
            /* JADX WARN: Type inference failed for: r5v14 */
            /* JADX WARN: Type inference failed for: r5v15 */
            /* JADX WARN: Type inference failed for: r5v16 */
            /* JADX WARN: Type inference failed for: r5v17 */
            @Override // defpackage.zy7
            public final Object a() {
                ArrayList arrayList;
                String english;
                String english2;
                String english3;
                List<ModelSelectorEntry> models;
                Map linkedHashMap;
                List<AvailableModelsConfig.AvailableModel> models2;
                int i2 = i;
                int i3 = 3;
                ?? arrayList2 = lm6.E;
                ?? r5 = 0;
                ?? r52 = 0;
                ?? r53 = 0;
                okc okcVar = this.F;
                switch (i2) {
                    case 0:
                        for (Membership membership : okcVar.c.a().getMemberships()) {
                            if (OrganizationId.m1068equalsimpl0(membership.getOrganization().m116getUuidXjkXN6I(), okcVar.a)) {
                                return membership.getOrganization();
                            }
                        }
                        pmf.h("Collection contains no element matching the predicate.");
                        return null;
                    case 1:
                        StickyConfig model_selector = ((StickySelectionConfig) okcVar.n.getValue()).getModel_selector();
                        return Boolean.valueOf(model_selector != null ? model_selector.getEnabled() : false);
                    case 2:
                        rc8 rc8Var2 = okcVar.b;
                        if (rc8Var2.b() && !((Boolean) rc8Var2.m("mobile_show_affirmative_consent_for_privacy_policy").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 3:
                        rc8 rc8Var3 = okcVar.b;
                        if (rc8Var3.b() && !((Boolean) rc8Var3.m("mobile_show_affirmative_consent").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 4:
                        rc8 rc8Var4 = okcVar.b;
                        if (rc8Var4.b() && !((Boolean) rc8Var4.m("mobile_use_birthday_for_age_verification").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 5:
                        rc8 rc8Var5 = okcVar.b;
                        return Boolean.valueOf(rc8Var5.b() && ((Boolean) rc8Var5.m("mobile_delay_age_verification").getValue()).booleanValue());
                    case 6:
                        return ajk.m((Map) okcVar.b.f("supported_regions", new f7a(srg.a, RegionSupport.Companion.serializer())).getValue());
                    case 7:
                        rc8 rc8Var6 = okcVar.b;
                        return Boolean.valueOf(rc8Var6.b() && ((Boolean) rc8Var6.m("claude_ai_ember").getValue()).booleanValue());
                    case 8:
                        ModelFallbacksConfig modelFallbacksConfig = (ModelFallbacksConfig) okcVar.b.g("holdup", ModelFallbacksConfig.Companion.serializer()).getValue();
                        return modelFallbacksConfig == null ? new ModelFallbacksConfig((Map) (r53 == true ? 1 : 0), (Map) (r52 == true ? 1 : 0), i3, (mq5) (r5 == true ? 1 : 0)) : modelFallbacksConfig;
                    case 9:
                        Organization organizationE = okcVar.e();
                        lea leaVar2 = okcVar.d;
                        List<ModelOption> claude_ai_bootstrap_models_config = organizationE.getClaude_ai_bootstrap_models_config();
                        if (claude_ai_bootstrap_models_config == null) {
                            ij0.y("Organization is missing claude_ai_bootstrap_models_config", null, false, 3);
                        } else {
                            List<ModelOption> list = claude_ai_bootstrap_models_config;
                            arrayList2 = new ArrayList(x44.y(list, 10));
                            for (ModelOption modelOption : list) {
                                _ServerLocalizedString description = modelOption.getDescription();
                                _ServerLocalizedString _serverlocalizedstring = (description == null || (english3 = description.getEnglish()) == null) ? null : new _ServerLocalizedString(english3, leaVar2.b(english3));
                                _ServerLocalizedString notice_text = modelOption.getNotice_text();
                                _ServerLocalizedString _serverlocalizedstring2 = (notice_text == null || (english2 = notice_text.getEnglish()) == null) ? null : new _ServerLocalizedString(english2, leaVar2.b(english2));
                                List<ThinkingModeOption> thinking_modes = modelOption.getThinking_modes();
                                if (thinking_modes != null) {
                                    List<ThinkingModeOption> list2 = thinking_modes;
                                    ArrayList arrayList3 = new ArrayList(x44.y(list2, 10));
                                    for (ThinkingModeOption thinkingModeOption : list2) {
                                        String english4 = thinkingModeOption.getTitle().getEnglish();
                                        _ServerLocalizedString _serverlocalizedstring3 = new _ServerLocalizedString(english4, leaVar2.b(english4));
                                        String english5 = thinkingModeOption.getDescription().getEnglish();
                                        _ServerLocalizedString _serverlocalizedstring4 = new _ServerLocalizedString(english5, leaVar2.b(english5));
                                        _ServerLocalizedString selection_title = thinkingModeOption.getSelection_title();
                                        arrayList3.add(ThinkingModeOption.m383copy3WgSuLE$default(thinkingModeOption, null, _serverlocalizedstring3, _serverlocalizedstring4, null, (selection_title == null || (english = selection_title.getEnglish()) == null) ? null : new _ServerLocalizedString(english, leaVar2.b(english)), null, 41, null));
                                    }
                                    arrayList = arrayList3;
                                } else {
                                    arrayList = null;
                                }
                                arrayList2.add(ModelOption.m353copyZEIUhPU$default(modelOption, null, null, _serverlocalizedstring, null, null, null, arrayList, null, _serverlocalizedstring2, null, null, null, 3771, null));
                            }
                        }
                        return arrayList2;
                    case 10:
                        List list3 = (List) okcVar.i.getValue();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj : list3) {
                            if (!x44.r(((ModelOption) obj).getInactive(), Boolean.TRUE)) {
                                arrayList4.add(obj);
                            }
                        }
                        return arrayList4;
                    case 11:
                        wz5 wz5Var = okcVar.j;
                        ModelSelectorSurface.Companion.getClass();
                        ModelSelectorConfig modelSelectorConfigF = okcVar.f(ModelSelectorSurface.CHAT);
                        if (modelSelectorConfigF != null && (models = modelSelectorConfigF.getModels()) != null) {
                            List<ModelSelectorEntry> list4 = models.isEmpty() ? null : models;
                            if (list4 != null) {
                                Set setF0 = bnf.f0(bnf.b0(bnf.V(new c54(0, list4), new kac(12)), be5.b0));
                                List list5 = (List) wz5Var.getValue();
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj2 : list5) {
                                    if (setF0.contains(ModelId.m1058boximpl(((ModelOption) obj2).m356getModeli4oh0I()))) {
                                        arrayList5.add(obj2);
                                    }
                                }
                                return arrayList5;
                            }
                        }
                        return (List) wz5Var.getValue();
                    case 12:
                        AvailableModelsConfig availableModelsConfig = (AvailableModelsConfig) okcVar.b.g("claude_ai_available_models", AvailableModelsConfig.Companion.serializer()).getValue();
                        if (availableModelsConfig == null || (models2 = availableModelsConfig.getModels()) == null) {
                            linkedHashMap = nm6.E;
                        } else {
                            List<AvailableModelsConfig.AvailableModel> list6 = models2;
                            int iD0 = tta.d0(x44.y(list6, 10));
                            if (iD0 < 16) {
                                iD0 = 16;
                            }
                            linkedHashMap = new LinkedHashMap(iD0);
                            for (Object obj3 : list6) {
                                linkedHashMap.put(ModelId.m1058boximpl(((AvailableModelsConfig.AvailableModel) obj3).m776getModel_idi4oh0I()), obj3);
                            }
                        }
                        List list7 = (List) okcVar.i.getValue();
                        int iD02 = tta.d0(x44.y(list7, 10));
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iD02 >= 16 ? iD02 : 16);
                        Iterator it = list7.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            pvg minimumTier = pvg.PRO;
                            if (!zHasNext) {
                                int iOrdinal = eve.C(okcVar.e()).ordinal();
                                pvg pvgVar = pvg.MAX;
                                if (iOrdinal == 0) {
                                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                                        if (((pvg) entry.getValue()) != pvg.FREE) {
                                            linkedHashMap3.put(entry.getKey(), entry.getValue());
                                        }
                                    }
                                    arrayList2 = new ArrayList();
                                    for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                                        ModelOption modelOption2 = (ModelOption) entry2.getKey();
                                        pvg pvgVar2 = (pvg) entry2.getValue();
                                        int i4 = pvgVar2 == null ? -1 : mkc.a[pvgVar2.ordinal()];
                                        cqb cqbVar = i4 != 1 ? i4 != 2 ? null : new cqb(modelOption2.m356getModeli4oh0I(), minimumTier) : new cqb(modelOption2.m356getModeli4oh0I(), pvgVar);
                                        if (cqbVar != null) {
                                            arrayList2.add(cqbVar);
                                        }
                                    }
                                } else if (iOrdinal == 1) {
                                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                                        if (((pvg) entry3.getValue()) == pvgVar) {
                                            linkedHashMap4.put(entry3.getKey(), entry3.getValue());
                                        }
                                    }
                                    arrayList2 = new ArrayList(linkedHashMap4.size());
                                    for (Map.Entry entry4 : linkedHashMap4.entrySet()) {
                                        ModelOption modelOption3 = (ModelOption) entry4.getKey();
                                        arrayList2.add(new cqb(modelOption3.m356getModeli4oh0I(), pvgVar));
                                    }
                                }
                                ArrayList arrayList6 = new ArrayList();
                                for (Object obj4 : (Iterable) arrayList2) {
                                    String strA = ((cqb) obj4).a();
                                    String strB = okcVar.b();
                                    if (!(strB == null ? false : ModelId.m1061equalsimpl0(strA, strB))) {
                                        arrayList6.add(obj4);
                                    }
                                }
                                return w44.t1(arrayList6);
                            }
                            Object next = it.next();
                            AvailableModelsConfig.AvailableModel availableModel = (AvailableModelsConfig.AvailableModel) linkedHashMap.get(ModelId.m1058boximpl(((ModelOption) next).m356getModeli4oh0I()));
                            if (availableModel != null) {
                                minimumTier = availableModel.getMinimumTier();
                            }
                            linkedHashMap2.put(next, minimumTier);
                        }
                        break;
                    default:
                        StickySelectionConfig stickySelectionConfig = (StickySelectionConfig) okcVar.b.g("mobile_sticky_selection_config", StickySelectionConfig.Companion.serializer()).getValue();
                        return stickySelectionConfig == null ? new StickySelectionConfig((StickyConfig) null, 1, (mq5) null) : stickySelectionConfig;
                }
            }
        });
        final int i2 = 9;
        this.i = mpk.w(new zy7(this) { // from class: lkc
            public final /* synthetic */ okc F;

            {
                this.F = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v0, types: [lm6] */
            /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v13 */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v22, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v12 */
            /* JADX WARN: Type inference failed for: r5v13 */
            /* JADX WARN: Type inference failed for: r5v14 */
            /* JADX WARN: Type inference failed for: r5v15 */
            /* JADX WARN: Type inference failed for: r5v16 */
            /* JADX WARN: Type inference failed for: r5v17 */
            @Override // defpackage.zy7
            public final Object a() {
                ArrayList arrayList;
                String english;
                String english2;
                String english3;
                List<ModelSelectorEntry> models;
                Map linkedHashMap;
                List<AvailableModelsConfig.AvailableModel> models2;
                int i22 = i2;
                int i3 = 3;
                ?? arrayList2 = lm6.E;
                ?? r5 = 0;
                ?? r52 = 0;
                ?? r53 = 0;
                okc okcVar = this.F;
                switch (i22) {
                    case 0:
                        for (Membership membership : okcVar.c.a().getMemberships()) {
                            if (OrganizationId.m1068equalsimpl0(membership.getOrganization().m116getUuidXjkXN6I(), okcVar.a)) {
                                return membership.getOrganization();
                            }
                        }
                        pmf.h("Collection contains no element matching the predicate.");
                        return null;
                    case 1:
                        StickyConfig model_selector = ((StickySelectionConfig) okcVar.n.getValue()).getModel_selector();
                        return Boolean.valueOf(model_selector != null ? model_selector.getEnabled() : false);
                    case 2:
                        rc8 rc8Var2 = okcVar.b;
                        if (rc8Var2.b() && !((Boolean) rc8Var2.m("mobile_show_affirmative_consent_for_privacy_policy").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 3:
                        rc8 rc8Var3 = okcVar.b;
                        if (rc8Var3.b() && !((Boolean) rc8Var3.m("mobile_show_affirmative_consent").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 4:
                        rc8 rc8Var4 = okcVar.b;
                        if (rc8Var4.b() && !((Boolean) rc8Var4.m("mobile_use_birthday_for_age_verification").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 5:
                        rc8 rc8Var5 = okcVar.b;
                        return Boolean.valueOf(rc8Var5.b() && ((Boolean) rc8Var5.m("mobile_delay_age_verification").getValue()).booleanValue());
                    case 6:
                        return ajk.m((Map) okcVar.b.f("supported_regions", new f7a(srg.a, RegionSupport.Companion.serializer())).getValue());
                    case 7:
                        rc8 rc8Var6 = okcVar.b;
                        return Boolean.valueOf(rc8Var6.b() && ((Boolean) rc8Var6.m("claude_ai_ember").getValue()).booleanValue());
                    case 8:
                        ModelFallbacksConfig modelFallbacksConfig = (ModelFallbacksConfig) okcVar.b.g("holdup", ModelFallbacksConfig.Companion.serializer()).getValue();
                        return modelFallbacksConfig == null ? new ModelFallbacksConfig((Map) (r53 == true ? 1 : 0), (Map) (r52 == true ? 1 : 0), i3, (mq5) (r5 == true ? 1 : 0)) : modelFallbacksConfig;
                    case 9:
                        Organization organizationE = okcVar.e();
                        lea leaVar2 = okcVar.d;
                        List<ModelOption> claude_ai_bootstrap_models_config = organizationE.getClaude_ai_bootstrap_models_config();
                        if (claude_ai_bootstrap_models_config == null) {
                            ij0.y("Organization is missing claude_ai_bootstrap_models_config", null, false, 3);
                        } else {
                            List<ModelOption> list = claude_ai_bootstrap_models_config;
                            arrayList2 = new ArrayList(x44.y(list, 10));
                            for (ModelOption modelOption : list) {
                                _ServerLocalizedString description = modelOption.getDescription();
                                _ServerLocalizedString _serverlocalizedstring = (description == null || (english3 = description.getEnglish()) == null) ? null : new _ServerLocalizedString(english3, leaVar2.b(english3));
                                _ServerLocalizedString notice_text = modelOption.getNotice_text();
                                _ServerLocalizedString _serverlocalizedstring2 = (notice_text == null || (english2 = notice_text.getEnglish()) == null) ? null : new _ServerLocalizedString(english2, leaVar2.b(english2));
                                List<ThinkingModeOption> thinking_modes = modelOption.getThinking_modes();
                                if (thinking_modes != null) {
                                    List<ThinkingModeOption> list2 = thinking_modes;
                                    ArrayList arrayList3 = new ArrayList(x44.y(list2, 10));
                                    for (ThinkingModeOption thinkingModeOption : list2) {
                                        String english4 = thinkingModeOption.getTitle().getEnglish();
                                        _ServerLocalizedString _serverlocalizedstring3 = new _ServerLocalizedString(english4, leaVar2.b(english4));
                                        String english5 = thinkingModeOption.getDescription().getEnglish();
                                        _ServerLocalizedString _serverlocalizedstring4 = new _ServerLocalizedString(english5, leaVar2.b(english5));
                                        _ServerLocalizedString selection_title = thinkingModeOption.getSelection_title();
                                        arrayList3.add(ThinkingModeOption.m383copy3WgSuLE$default(thinkingModeOption, null, _serverlocalizedstring3, _serverlocalizedstring4, null, (selection_title == null || (english = selection_title.getEnglish()) == null) ? null : new _ServerLocalizedString(english, leaVar2.b(english)), null, 41, null));
                                    }
                                    arrayList = arrayList3;
                                } else {
                                    arrayList = null;
                                }
                                arrayList2.add(ModelOption.m353copyZEIUhPU$default(modelOption, null, null, _serverlocalizedstring, null, null, null, arrayList, null, _serverlocalizedstring2, null, null, null, 3771, null));
                            }
                        }
                        return arrayList2;
                    case 10:
                        List list3 = (List) okcVar.i.getValue();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj : list3) {
                            if (!x44.r(((ModelOption) obj).getInactive(), Boolean.TRUE)) {
                                arrayList4.add(obj);
                            }
                        }
                        return arrayList4;
                    case 11:
                        wz5 wz5Var = okcVar.j;
                        ModelSelectorSurface.Companion.getClass();
                        ModelSelectorConfig modelSelectorConfigF = okcVar.f(ModelSelectorSurface.CHAT);
                        if (modelSelectorConfigF != null && (models = modelSelectorConfigF.getModels()) != null) {
                            List<ModelSelectorEntry> list4 = models.isEmpty() ? null : models;
                            if (list4 != null) {
                                Set setF0 = bnf.f0(bnf.b0(bnf.V(new c54(0, list4), new kac(12)), be5.b0));
                                List list5 = (List) wz5Var.getValue();
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj2 : list5) {
                                    if (setF0.contains(ModelId.m1058boximpl(((ModelOption) obj2).m356getModeli4oh0I()))) {
                                        arrayList5.add(obj2);
                                    }
                                }
                                return arrayList5;
                            }
                        }
                        return (List) wz5Var.getValue();
                    case 12:
                        AvailableModelsConfig availableModelsConfig = (AvailableModelsConfig) okcVar.b.g("claude_ai_available_models", AvailableModelsConfig.Companion.serializer()).getValue();
                        if (availableModelsConfig == null || (models2 = availableModelsConfig.getModels()) == null) {
                            linkedHashMap = nm6.E;
                        } else {
                            List<AvailableModelsConfig.AvailableModel> list6 = models2;
                            int iD0 = tta.d0(x44.y(list6, 10));
                            if (iD0 < 16) {
                                iD0 = 16;
                            }
                            linkedHashMap = new LinkedHashMap(iD0);
                            for (Object obj3 : list6) {
                                linkedHashMap.put(ModelId.m1058boximpl(((AvailableModelsConfig.AvailableModel) obj3).m776getModel_idi4oh0I()), obj3);
                            }
                        }
                        List list7 = (List) okcVar.i.getValue();
                        int iD02 = tta.d0(x44.y(list7, 10));
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iD02 >= 16 ? iD02 : 16);
                        Iterator it = list7.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            pvg minimumTier = pvg.PRO;
                            if (!zHasNext) {
                                int iOrdinal = eve.C(okcVar.e()).ordinal();
                                pvg pvgVar = pvg.MAX;
                                if (iOrdinal == 0) {
                                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                                        if (((pvg) entry.getValue()) != pvg.FREE) {
                                            linkedHashMap3.put(entry.getKey(), entry.getValue());
                                        }
                                    }
                                    arrayList2 = new ArrayList();
                                    for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                                        ModelOption modelOption2 = (ModelOption) entry2.getKey();
                                        pvg pvgVar2 = (pvg) entry2.getValue();
                                        int i4 = pvgVar2 == null ? -1 : mkc.a[pvgVar2.ordinal()];
                                        cqb cqbVar = i4 != 1 ? i4 != 2 ? null : new cqb(modelOption2.m356getModeli4oh0I(), minimumTier) : new cqb(modelOption2.m356getModeli4oh0I(), pvgVar);
                                        if (cqbVar != null) {
                                            arrayList2.add(cqbVar);
                                        }
                                    }
                                } else if (iOrdinal == 1) {
                                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                                        if (((pvg) entry3.getValue()) == pvgVar) {
                                            linkedHashMap4.put(entry3.getKey(), entry3.getValue());
                                        }
                                    }
                                    arrayList2 = new ArrayList(linkedHashMap4.size());
                                    for (Map.Entry entry4 : linkedHashMap4.entrySet()) {
                                        ModelOption modelOption3 = (ModelOption) entry4.getKey();
                                        arrayList2.add(new cqb(modelOption3.m356getModeli4oh0I(), pvgVar));
                                    }
                                }
                                ArrayList arrayList6 = new ArrayList();
                                for (Object obj4 : (Iterable) arrayList2) {
                                    String strA = ((cqb) obj4).a();
                                    String strB = okcVar.b();
                                    if (!(strB == null ? false : ModelId.m1061equalsimpl0(strA, strB))) {
                                        arrayList6.add(obj4);
                                    }
                                }
                                return w44.t1(arrayList6);
                            }
                            Object next = it.next();
                            AvailableModelsConfig.AvailableModel availableModel = (AvailableModelsConfig.AvailableModel) linkedHashMap.get(ModelId.m1058boximpl(((ModelOption) next).m356getModeli4oh0I()));
                            if (availableModel != null) {
                                minimumTier = availableModel.getMinimumTier();
                            }
                            linkedHashMap2.put(next, minimumTier);
                        }
                        break;
                    default:
                        StickySelectionConfig stickySelectionConfig = (StickySelectionConfig) okcVar.b.g("mobile_sticky_selection_config", StickySelectionConfig.Companion.serializer()).getValue();
                        return stickySelectionConfig == null ? new StickySelectionConfig((StickyConfig) null, 1, (mq5) null) : stickySelectionConfig;
                }
            }
        });
        final int i3 = 10;
        this.j = mpk.w(new zy7(this) { // from class: lkc
            public final /* synthetic */ okc F;

            {
                this.F = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v0, types: [lm6] */
            /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v13 */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v22, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v12 */
            /* JADX WARN: Type inference failed for: r5v13 */
            /* JADX WARN: Type inference failed for: r5v14 */
            /* JADX WARN: Type inference failed for: r5v15 */
            /* JADX WARN: Type inference failed for: r5v16 */
            /* JADX WARN: Type inference failed for: r5v17 */
            @Override // defpackage.zy7
            public final Object a() {
                ArrayList arrayList;
                String english;
                String english2;
                String english3;
                List<ModelSelectorEntry> models;
                Map linkedHashMap;
                List<AvailableModelsConfig.AvailableModel> models2;
                int i22 = i3;
                int i32 = 3;
                ?? arrayList2 = lm6.E;
                ?? r5 = 0;
                ?? r52 = 0;
                ?? r53 = 0;
                okc okcVar = this.F;
                switch (i22) {
                    case 0:
                        for (Membership membership : okcVar.c.a().getMemberships()) {
                            if (OrganizationId.m1068equalsimpl0(membership.getOrganization().m116getUuidXjkXN6I(), okcVar.a)) {
                                return membership.getOrganization();
                            }
                        }
                        pmf.h("Collection contains no element matching the predicate.");
                        return null;
                    case 1:
                        StickyConfig model_selector = ((StickySelectionConfig) okcVar.n.getValue()).getModel_selector();
                        return Boolean.valueOf(model_selector != null ? model_selector.getEnabled() : false);
                    case 2:
                        rc8 rc8Var2 = okcVar.b;
                        if (rc8Var2.b() && !((Boolean) rc8Var2.m("mobile_show_affirmative_consent_for_privacy_policy").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 3:
                        rc8 rc8Var3 = okcVar.b;
                        if (rc8Var3.b() && !((Boolean) rc8Var3.m("mobile_show_affirmative_consent").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 4:
                        rc8 rc8Var4 = okcVar.b;
                        if (rc8Var4.b() && !((Boolean) rc8Var4.m("mobile_use_birthday_for_age_verification").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 5:
                        rc8 rc8Var5 = okcVar.b;
                        return Boolean.valueOf(rc8Var5.b() && ((Boolean) rc8Var5.m("mobile_delay_age_verification").getValue()).booleanValue());
                    case 6:
                        return ajk.m((Map) okcVar.b.f("supported_regions", new f7a(srg.a, RegionSupport.Companion.serializer())).getValue());
                    case 7:
                        rc8 rc8Var6 = okcVar.b;
                        return Boolean.valueOf(rc8Var6.b() && ((Boolean) rc8Var6.m("claude_ai_ember").getValue()).booleanValue());
                    case 8:
                        ModelFallbacksConfig modelFallbacksConfig = (ModelFallbacksConfig) okcVar.b.g("holdup", ModelFallbacksConfig.Companion.serializer()).getValue();
                        return modelFallbacksConfig == null ? new ModelFallbacksConfig((Map) (r53 == true ? 1 : 0), (Map) (r52 == true ? 1 : 0), i32, (mq5) (r5 == true ? 1 : 0)) : modelFallbacksConfig;
                    case 9:
                        Organization organizationE = okcVar.e();
                        lea leaVar2 = okcVar.d;
                        List<ModelOption> claude_ai_bootstrap_models_config = organizationE.getClaude_ai_bootstrap_models_config();
                        if (claude_ai_bootstrap_models_config == null) {
                            ij0.y("Organization is missing claude_ai_bootstrap_models_config", null, false, 3);
                        } else {
                            List<ModelOption> list = claude_ai_bootstrap_models_config;
                            arrayList2 = new ArrayList(x44.y(list, 10));
                            for (ModelOption modelOption : list) {
                                _ServerLocalizedString description = modelOption.getDescription();
                                _ServerLocalizedString _serverlocalizedstring = (description == null || (english3 = description.getEnglish()) == null) ? null : new _ServerLocalizedString(english3, leaVar2.b(english3));
                                _ServerLocalizedString notice_text = modelOption.getNotice_text();
                                _ServerLocalizedString _serverlocalizedstring2 = (notice_text == null || (english2 = notice_text.getEnglish()) == null) ? null : new _ServerLocalizedString(english2, leaVar2.b(english2));
                                List<ThinkingModeOption> thinking_modes = modelOption.getThinking_modes();
                                if (thinking_modes != null) {
                                    List<ThinkingModeOption> list2 = thinking_modes;
                                    ArrayList arrayList3 = new ArrayList(x44.y(list2, 10));
                                    for (ThinkingModeOption thinkingModeOption : list2) {
                                        String english4 = thinkingModeOption.getTitle().getEnglish();
                                        _ServerLocalizedString _serverlocalizedstring3 = new _ServerLocalizedString(english4, leaVar2.b(english4));
                                        String english5 = thinkingModeOption.getDescription().getEnglish();
                                        _ServerLocalizedString _serverlocalizedstring4 = new _ServerLocalizedString(english5, leaVar2.b(english5));
                                        _ServerLocalizedString selection_title = thinkingModeOption.getSelection_title();
                                        arrayList3.add(ThinkingModeOption.m383copy3WgSuLE$default(thinkingModeOption, null, _serverlocalizedstring3, _serverlocalizedstring4, null, (selection_title == null || (english = selection_title.getEnglish()) == null) ? null : new _ServerLocalizedString(english, leaVar2.b(english)), null, 41, null));
                                    }
                                    arrayList = arrayList3;
                                } else {
                                    arrayList = null;
                                }
                                arrayList2.add(ModelOption.m353copyZEIUhPU$default(modelOption, null, null, _serverlocalizedstring, null, null, null, arrayList, null, _serverlocalizedstring2, null, null, null, 3771, null));
                            }
                        }
                        return arrayList2;
                    case 10:
                        List list3 = (List) okcVar.i.getValue();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj : list3) {
                            if (!x44.r(((ModelOption) obj).getInactive(), Boolean.TRUE)) {
                                arrayList4.add(obj);
                            }
                        }
                        return arrayList4;
                    case 11:
                        wz5 wz5Var = okcVar.j;
                        ModelSelectorSurface.Companion.getClass();
                        ModelSelectorConfig modelSelectorConfigF = okcVar.f(ModelSelectorSurface.CHAT);
                        if (modelSelectorConfigF != null && (models = modelSelectorConfigF.getModels()) != null) {
                            List<ModelSelectorEntry> list4 = models.isEmpty() ? null : models;
                            if (list4 != null) {
                                Set setF0 = bnf.f0(bnf.b0(bnf.V(new c54(0, list4), new kac(12)), be5.b0));
                                List list5 = (List) wz5Var.getValue();
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj2 : list5) {
                                    if (setF0.contains(ModelId.m1058boximpl(((ModelOption) obj2).m356getModeli4oh0I()))) {
                                        arrayList5.add(obj2);
                                    }
                                }
                                return arrayList5;
                            }
                        }
                        return (List) wz5Var.getValue();
                    case 12:
                        AvailableModelsConfig availableModelsConfig = (AvailableModelsConfig) okcVar.b.g("claude_ai_available_models", AvailableModelsConfig.Companion.serializer()).getValue();
                        if (availableModelsConfig == null || (models2 = availableModelsConfig.getModels()) == null) {
                            linkedHashMap = nm6.E;
                        } else {
                            List<AvailableModelsConfig.AvailableModel> list6 = models2;
                            int iD0 = tta.d0(x44.y(list6, 10));
                            if (iD0 < 16) {
                                iD0 = 16;
                            }
                            linkedHashMap = new LinkedHashMap(iD0);
                            for (Object obj3 : list6) {
                                linkedHashMap.put(ModelId.m1058boximpl(((AvailableModelsConfig.AvailableModel) obj3).m776getModel_idi4oh0I()), obj3);
                            }
                        }
                        List list7 = (List) okcVar.i.getValue();
                        int iD02 = tta.d0(x44.y(list7, 10));
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iD02 >= 16 ? iD02 : 16);
                        Iterator it = list7.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            pvg minimumTier = pvg.PRO;
                            if (!zHasNext) {
                                int iOrdinal = eve.C(okcVar.e()).ordinal();
                                pvg pvgVar = pvg.MAX;
                                if (iOrdinal == 0) {
                                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                                        if (((pvg) entry.getValue()) != pvg.FREE) {
                                            linkedHashMap3.put(entry.getKey(), entry.getValue());
                                        }
                                    }
                                    arrayList2 = new ArrayList();
                                    for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                                        ModelOption modelOption2 = (ModelOption) entry2.getKey();
                                        pvg pvgVar2 = (pvg) entry2.getValue();
                                        int i4 = pvgVar2 == null ? -1 : mkc.a[pvgVar2.ordinal()];
                                        cqb cqbVar = i4 != 1 ? i4 != 2 ? null : new cqb(modelOption2.m356getModeli4oh0I(), minimumTier) : new cqb(modelOption2.m356getModeli4oh0I(), pvgVar);
                                        if (cqbVar != null) {
                                            arrayList2.add(cqbVar);
                                        }
                                    }
                                } else if (iOrdinal == 1) {
                                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                                        if (((pvg) entry3.getValue()) == pvgVar) {
                                            linkedHashMap4.put(entry3.getKey(), entry3.getValue());
                                        }
                                    }
                                    arrayList2 = new ArrayList(linkedHashMap4.size());
                                    for (Map.Entry entry4 : linkedHashMap4.entrySet()) {
                                        ModelOption modelOption3 = (ModelOption) entry4.getKey();
                                        arrayList2.add(new cqb(modelOption3.m356getModeli4oh0I(), pvgVar));
                                    }
                                }
                                ArrayList arrayList6 = new ArrayList();
                                for (Object obj4 : (Iterable) arrayList2) {
                                    String strA = ((cqb) obj4).a();
                                    String strB = okcVar.b();
                                    if (!(strB == null ? false : ModelId.m1061equalsimpl0(strA, strB))) {
                                        arrayList6.add(obj4);
                                    }
                                }
                                return w44.t1(arrayList6);
                            }
                            Object next = it.next();
                            AvailableModelsConfig.AvailableModel availableModel = (AvailableModelsConfig.AvailableModel) linkedHashMap.get(ModelId.m1058boximpl(((ModelOption) next).m356getModeli4oh0I()));
                            if (availableModel != null) {
                                minimumTier = availableModel.getMinimumTier();
                            }
                            linkedHashMap2.put(next, minimumTier);
                        }
                        break;
                    default:
                        StickySelectionConfig stickySelectionConfig = (StickySelectionConfig) okcVar.b.g("mobile_sticky_selection_config", StickySelectionConfig.Companion.serializer()).getValue();
                        return stickySelectionConfig == null ? new StickySelectionConfig((StickyConfig) null, 1, (mq5) null) : stickySelectionConfig;
                }
            }
        });
        a5 a5Var = a5.N;
        final int i4 = 11;
        this.k = mpk.x(new zy7(this) { // from class: lkc
            public final /* synthetic */ okc F;

            {
                this.F = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v0, types: [lm6] */
            /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v13 */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v22, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v12 */
            /* JADX WARN: Type inference failed for: r5v13 */
            /* JADX WARN: Type inference failed for: r5v14 */
            /* JADX WARN: Type inference failed for: r5v15 */
            /* JADX WARN: Type inference failed for: r5v16 */
            /* JADX WARN: Type inference failed for: r5v17 */
            @Override // defpackage.zy7
            public final Object a() {
                ArrayList arrayList;
                String english;
                String english2;
                String english3;
                List<ModelSelectorEntry> models;
                Map linkedHashMap;
                List<AvailableModelsConfig.AvailableModel> models2;
                int i22 = i4;
                int i32 = 3;
                ?? arrayList2 = lm6.E;
                ?? r5 = 0;
                ?? r52 = 0;
                ?? r53 = 0;
                okc okcVar = this.F;
                switch (i22) {
                    case 0:
                        for (Membership membership : okcVar.c.a().getMemberships()) {
                            if (OrganizationId.m1068equalsimpl0(membership.getOrganization().m116getUuidXjkXN6I(), okcVar.a)) {
                                return membership.getOrganization();
                            }
                        }
                        pmf.h("Collection contains no element matching the predicate.");
                        return null;
                    case 1:
                        StickyConfig model_selector = ((StickySelectionConfig) okcVar.n.getValue()).getModel_selector();
                        return Boolean.valueOf(model_selector != null ? model_selector.getEnabled() : false);
                    case 2:
                        rc8 rc8Var2 = okcVar.b;
                        if (rc8Var2.b() && !((Boolean) rc8Var2.m("mobile_show_affirmative_consent_for_privacy_policy").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 3:
                        rc8 rc8Var3 = okcVar.b;
                        if (rc8Var3.b() && !((Boolean) rc8Var3.m("mobile_show_affirmative_consent").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 4:
                        rc8 rc8Var4 = okcVar.b;
                        if (rc8Var4.b() && !((Boolean) rc8Var4.m("mobile_use_birthday_for_age_verification").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 5:
                        rc8 rc8Var5 = okcVar.b;
                        return Boolean.valueOf(rc8Var5.b() && ((Boolean) rc8Var5.m("mobile_delay_age_verification").getValue()).booleanValue());
                    case 6:
                        return ajk.m((Map) okcVar.b.f("supported_regions", new f7a(srg.a, RegionSupport.Companion.serializer())).getValue());
                    case 7:
                        rc8 rc8Var6 = okcVar.b;
                        return Boolean.valueOf(rc8Var6.b() && ((Boolean) rc8Var6.m("claude_ai_ember").getValue()).booleanValue());
                    case 8:
                        ModelFallbacksConfig modelFallbacksConfig = (ModelFallbacksConfig) okcVar.b.g("holdup", ModelFallbacksConfig.Companion.serializer()).getValue();
                        return modelFallbacksConfig == null ? new ModelFallbacksConfig((Map) (r53 == true ? 1 : 0), (Map) (r52 == true ? 1 : 0), i32, (mq5) (r5 == true ? 1 : 0)) : modelFallbacksConfig;
                    case 9:
                        Organization organizationE = okcVar.e();
                        lea leaVar2 = okcVar.d;
                        List<ModelOption> claude_ai_bootstrap_models_config = organizationE.getClaude_ai_bootstrap_models_config();
                        if (claude_ai_bootstrap_models_config == null) {
                            ij0.y("Organization is missing claude_ai_bootstrap_models_config", null, false, 3);
                        } else {
                            List<ModelOption> list = claude_ai_bootstrap_models_config;
                            arrayList2 = new ArrayList(x44.y(list, 10));
                            for (ModelOption modelOption : list) {
                                _ServerLocalizedString description = modelOption.getDescription();
                                _ServerLocalizedString _serverlocalizedstring = (description == null || (english3 = description.getEnglish()) == null) ? null : new _ServerLocalizedString(english3, leaVar2.b(english3));
                                _ServerLocalizedString notice_text = modelOption.getNotice_text();
                                _ServerLocalizedString _serverlocalizedstring2 = (notice_text == null || (english2 = notice_text.getEnglish()) == null) ? null : new _ServerLocalizedString(english2, leaVar2.b(english2));
                                List<ThinkingModeOption> thinking_modes = modelOption.getThinking_modes();
                                if (thinking_modes != null) {
                                    List<ThinkingModeOption> list2 = thinking_modes;
                                    ArrayList arrayList3 = new ArrayList(x44.y(list2, 10));
                                    for (ThinkingModeOption thinkingModeOption : list2) {
                                        String english4 = thinkingModeOption.getTitle().getEnglish();
                                        _ServerLocalizedString _serverlocalizedstring3 = new _ServerLocalizedString(english4, leaVar2.b(english4));
                                        String english5 = thinkingModeOption.getDescription().getEnglish();
                                        _ServerLocalizedString _serverlocalizedstring4 = new _ServerLocalizedString(english5, leaVar2.b(english5));
                                        _ServerLocalizedString selection_title = thinkingModeOption.getSelection_title();
                                        arrayList3.add(ThinkingModeOption.m383copy3WgSuLE$default(thinkingModeOption, null, _serverlocalizedstring3, _serverlocalizedstring4, null, (selection_title == null || (english = selection_title.getEnglish()) == null) ? null : new _ServerLocalizedString(english, leaVar2.b(english)), null, 41, null));
                                    }
                                    arrayList = arrayList3;
                                } else {
                                    arrayList = null;
                                }
                                arrayList2.add(ModelOption.m353copyZEIUhPU$default(modelOption, null, null, _serverlocalizedstring, null, null, null, arrayList, null, _serverlocalizedstring2, null, null, null, 3771, null));
                            }
                        }
                        return arrayList2;
                    case 10:
                        List list3 = (List) okcVar.i.getValue();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj : list3) {
                            if (!x44.r(((ModelOption) obj).getInactive(), Boolean.TRUE)) {
                                arrayList4.add(obj);
                            }
                        }
                        return arrayList4;
                    case 11:
                        wz5 wz5Var = okcVar.j;
                        ModelSelectorSurface.Companion.getClass();
                        ModelSelectorConfig modelSelectorConfigF = okcVar.f(ModelSelectorSurface.CHAT);
                        if (modelSelectorConfigF != null && (models = modelSelectorConfigF.getModels()) != null) {
                            List<ModelSelectorEntry> list4 = models.isEmpty() ? null : models;
                            if (list4 != null) {
                                Set setF0 = bnf.f0(bnf.b0(bnf.V(new c54(0, list4), new kac(12)), be5.b0));
                                List list5 = (List) wz5Var.getValue();
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj2 : list5) {
                                    if (setF0.contains(ModelId.m1058boximpl(((ModelOption) obj2).m356getModeli4oh0I()))) {
                                        arrayList5.add(obj2);
                                    }
                                }
                                return arrayList5;
                            }
                        }
                        return (List) wz5Var.getValue();
                    case 12:
                        AvailableModelsConfig availableModelsConfig = (AvailableModelsConfig) okcVar.b.g("claude_ai_available_models", AvailableModelsConfig.Companion.serializer()).getValue();
                        if (availableModelsConfig == null || (models2 = availableModelsConfig.getModels()) == null) {
                            linkedHashMap = nm6.E;
                        } else {
                            List<AvailableModelsConfig.AvailableModel> list6 = models2;
                            int iD0 = tta.d0(x44.y(list6, 10));
                            if (iD0 < 16) {
                                iD0 = 16;
                            }
                            linkedHashMap = new LinkedHashMap(iD0);
                            for (Object obj3 : list6) {
                                linkedHashMap.put(ModelId.m1058boximpl(((AvailableModelsConfig.AvailableModel) obj3).m776getModel_idi4oh0I()), obj3);
                            }
                        }
                        List list7 = (List) okcVar.i.getValue();
                        int iD02 = tta.d0(x44.y(list7, 10));
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iD02 >= 16 ? iD02 : 16);
                        Iterator it = list7.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            pvg minimumTier = pvg.PRO;
                            if (!zHasNext) {
                                int iOrdinal = eve.C(okcVar.e()).ordinal();
                                pvg pvgVar = pvg.MAX;
                                if (iOrdinal == 0) {
                                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                                        if (((pvg) entry.getValue()) != pvg.FREE) {
                                            linkedHashMap3.put(entry.getKey(), entry.getValue());
                                        }
                                    }
                                    arrayList2 = new ArrayList();
                                    for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                                        ModelOption modelOption2 = (ModelOption) entry2.getKey();
                                        pvg pvgVar2 = (pvg) entry2.getValue();
                                        int i42 = pvgVar2 == null ? -1 : mkc.a[pvgVar2.ordinal()];
                                        cqb cqbVar = i42 != 1 ? i42 != 2 ? null : new cqb(modelOption2.m356getModeli4oh0I(), minimumTier) : new cqb(modelOption2.m356getModeli4oh0I(), pvgVar);
                                        if (cqbVar != null) {
                                            arrayList2.add(cqbVar);
                                        }
                                    }
                                } else if (iOrdinal == 1) {
                                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                                        if (((pvg) entry3.getValue()) == pvgVar) {
                                            linkedHashMap4.put(entry3.getKey(), entry3.getValue());
                                        }
                                    }
                                    arrayList2 = new ArrayList(linkedHashMap4.size());
                                    for (Map.Entry entry4 : linkedHashMap4.entrySet()) {
                                        ModelOption modelOption3 = (ModelOption) entry4.getKey();
                                        arrayList2.add(new cqb(modelOption3.m356getModeli4oh0I(), pvgVar));
                                    }
                                }
                                ArrayList arrayList6 = new ArrayList();
                                for (Object obj4 : (Iterable) arrayList2) {
                                    String strA = ((cqb) obj4).a();
                                    String strB = okcVar.b();
                                    if (!(strB == null ? false : ModelId.m1061equalsimpl0(strA, strB))) {
                                        arrayList6.add(obj4);
                                    }
                                }
                                return w44.t1(arrayList6);
                            }
                            Object next = it.next();
                            AvailableModelsConfig.AvailableModel availableModel = (AvailableModelsConfig.AvailableModel) linkedHashMap.get(ModelId.m1058boximpl(((ModelOption) next).m356getModeli4oh0I()));
                            if (availableModel != null) {
                                minimumTier = availableModel.getMinimumTier();
                            }
                            linkedHashMap2.put(next, minimumTier);
                        }
                        break;
                    default:
                        StickySelectionConfig stickySelectionConfig = (StickySelectionConfig) okcVar.b.g("mobile_sticky_selection_config", StickySelectionConfig.Companion.serializer()).getValue();
                        return stickySelectionConfig == null ? new StickySelectionConfig((StickyConfig) null, 1, (mq5) null) : stickySelectionConfig;
                }
            }
        }, a5Var);
        final int i5 = 12;
        this.l = mpk.w(new zy7(this) { // from class: lkc
            public final /* synthetic */ okc F;

            {
                this.F = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v0, types: [lm6] */
            /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v13 */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v22, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v12 */
            /* JADX WARN: Type inference failed for: r5v13 */
            /* JADX WARN: Type inference failed for: r5v14 */
            /* JADX WARN: Type inference failed for: r5v15 */
            /* JADX WARN: Type inference failed for: r5v16 */
            /* JADX WARN: Type inference failed for: r5v17 */
            @Override // defpackage.zy7
            public final Object a() {
                ArrayList arrayList;
                String english;
                String english2;
                String english3;
                List<ModelSelectorEntry> models;
                Map linkedHashMap;
                List<AvailableModelsConfig.AvailableModel> models2;
                int i22 = i5;
                int i32 = 3;
                ?? arrayList2 = lm6.E;
                ?? r5 = 0;
                ?? r52 = 0;
                ?? r53 = 0;
                okc okcVar = this.F;
                switch (i22) {
                    case 0:
                        for (Membership membership : okcVar.c.a().getMemberships()) {
                            if (OrganizationId.m1068equalsimpl0(membership.getOrganization().m116getUuidXjkXN6I(), okcVar.a)) {
                                return membership.getOrganization();
                            }
                        }
                        pmf.h("Collection contains no element matching the predicate.");
                        return null;
                    case 1:
                        StickyConfig model_selector = ((StickySelectionConfig) okcVar.n.getValue()).getModel_selector();
                        return Boolean.valueOf(model_selector != null ? model_selector.getEnabled() : false);
                    case 2:
                        rc8 rc8Var2 = okcVar.b;
                        if (rc8Var2.b() && !((Boolean) rc8Var2.m("mobile_show_affirmative_consent_for_privacy_policy").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 3:
                        rc8 rc8Var3 = okcVar.b;
                        if (rc8Var3.b() && !((Boolean) rc8Var3.m("mobile_show_affirmative_consent").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 4:
                        rc8 rc8Var4 = okcVar.b;
                        if (rc8Var4.b() && !((Boolean) rc8Var4.m("mobile_use_birthday_for_age_verification").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 5:
                        rc8 rc8Var5 = okcVar.b;
                        return Boolean.valueOf(rc8Var5.b() && ((Boolean) rc8Var5.m("mobile_delay_age_verification").getValue()).booleanValue());
                    case 6:
                        return ajk.m((Map) okcVar.b.f("supported_regions", new f7a(srg.a, RegionSupport.Companion.serializer())).getValue());
                    case 7:
                        rc8 rc8Var6 = okcVar.b;
                        return Boolean.valueOf(rc8Var6.b() && ((Boolean) rc8Var6.m("claude_ai_ember").getValue()).booleanValue());
                    case 8:
                        ModelFallbacksConfig modelFallbacksConfig = (ModelFallbacksConfig) okcVar.b.g("holdup", ModelFallbacksConfig.Companion.serializer()).getValue();
                        return modelFallbacksConfig == null ? new ModelFallbacksConfig((Map) (r53 == true ? 1 : 0), (Map) (r52 == true ? 1 : 0), i32, (mq5) (r5 == true ? 1 : 0)) : modelFallbacksConfig;
                    case 9:
                        Organization organizationE = okcVar.e();
                        lea leaVar2 = okcVar.d;
                        List<ModelOption> claude_ai_bootstrap_models_config = organizationE.getClaude_ai_bootstrap_models_config();
                        if (claude_ai_bootstrap_models_config == null) {
                            ij0.y("Organization is missing claude_ai_bootstrap_models_config", null, false, 3);
                        } else {
                            List<ModelOption> list = claude_ai_bootstrap_models_config;
                            arrayList2 = new ArrayList(x44.y(list, 10));
                            for (ModelOption modelOption : list) {
                                _ServerLocalizedString description = modelOption.getDescription();
                                _ServerLocalizedString _serverlocalizedstring = (description == null || (english3 = description.getEnglish()) == null) ? null : new _ServerLocalizedString(english3, leaVar2.b(english3));
                                _ServerLocalizedString notice_text = modelOption.getNotice_text();
                                _ServerLocalizedString _serverlocalizedstring2 = (notice_text == null || (english2 = notice_text.getEnglish()) == null) ? null : new _ServerLocalizedString(english2, leaVar2.b(english2));
                                List<ThinkingModeOption> thinking_modes = modelOption.getThinking_modes();
                                if (thinking_modes != null) {
                                    List<ThinkingModeOption> list2 = thinking_modes;
                                    ArrayList arrayList3 = new ArrayList(x44.y(list2, 10));
                                    for (ThinkingModeOption thinkingModeOption : list2) {
                                        String english4 = thinkingModeOption.getTitle().getEnglish();
                                        _ServerLocalizedString _serverlocalizedstring3 = new _ServerLocalizedString(english4, leaVar2.b(english4));
                                        String english5 = thinkingModeOption.getDescription().getEnglish();
                                        _ServerLocalizedString _serverlocalizedstring4 = new _ServerLocalizedString(english5, leaVar2.b(english5));
                                        _ServerLocalizedString selection_title = thinkingModeOption.getSelection_title();
                                        arrayList3.add(ThinkingModeOption.m383copy3WgSuLE$default(thinkingModeOption, null, _serverlocalizedstring3, _serverlocalizedstring4, null, (selection_title == null || (english = selection_title.getEnglish()) == null) ? null : new _ServerLocalizedString(english, leaVar2.b(english)), null, 41, null));
                                    }
                                    arrayList = arrayList3;
                                } else {
                                    arrayList = null;
                                }
                                arrayList2.add(ModelOption.m353copyZEIUhPU$default(modelOption, null, null, _serverlocalizedstring, null, null, null, arrayList, null, _serverlocalizedstring2, null, null, null, 3771, null));
                            }
                        }
                        return arrayList2;
                    case 10:
                        List list3 = (List) okcVar.i.getValue();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj : list3) {
                            if (!x44.r(((ModelOption) obj).getInactive(), Boolean.TRUE)) {
                                arrayList4.add(obj);
                            }
                        }
                        return arrayList4;
                    case 11:
                        wz5 wz5Var = okcVar.j;
                        ModelSelectorSurface.Companion.getClass();
                        ModelSelectorConfig modelSelectorConfigF = okcVar.f(ModelSelectorSurface.CHAT);
                        if (modelSelectorConfigF != null && (models = modelSelectorConfigF.getModels()) != null) {
                            List<ModelSelectorEntry> list4 = models.isEmpty() ? null : models;
                            if (list4 != null) {
                                Set setF0 = bnf.f0(bnf.b0(bnf.V(new c54(0, list4), new kac(12)), be5.b0));
                                List list5 = (List) wz5Var.getValue();
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj2 : list5) {
                                    if (setF0.contains(ModelId.m1058boximpl(((ModelOption) obj2).m356getModeli4oh0I()))) {
                                        arrayList5.add(obj2);
                                    }
                                }
                                return arrayList5;
                            }
                        }
                        return (List) wz5Var.getValue();
                    case 12:
                        AvailableModelsConfig availableModelsConfig = (AvailableModelsConfig) okcVar.b.g("claude_ai_available_models", AvailableModelsConfig.Companion.serializer()).getValue();
                        if (availableModelsConfig == null || (models2 = availableModelsConfig.getModels()) == null) {
                            linkedHashMap = nm6.E;
                        } else {
                            List<AvailableModelsConfig.AvailableModel> list6 = models2;
                            int iD0 = tta.d0(x44.y(list6, 10));
                            if (iD0 < 16) {
                                iD0 = 16;
                            }
                            linkedHashMap = new LinkedHashMap(iD0);
                            for (Object obj3 : list6) {
                                linkedHashMap.put(ModelId.m1058boximpl(((AvailableModelsConfig.AvailableModel) obj3).m776getModel_idi4oh0I()), obj3);
                            }
                        }
                        List list7 = (List) okcVar.i.getValue();
                        int iD02 = tta.d0(x44.y(list7, 10));
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iD02 >= 16 ? iD02 : 16);
                        Iterator it = list7.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            pvg minimumTier = pvg.PRO;
                            if (!zHasNext) {
                                int iOrdinal = eve.C(okcVar.e()).ordinal();
                                pvg pvgVar = pvg.MAX;
                                if (iOrdinal == 0) {
                                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                                        if (((pvg) entry.getValue()) != pvg.FREE) {
                                            linkedHashMap3.put(entry.getKey(), entry.getValue());
                                        }
                                    }
                                    arrayList2 = new ArrayList();
                                    for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                                        ModelOption modelOption2 = (ModelOption) entry2.getKey();
                                        pvg pvgVar2 = (pvg) entry2.getValue();
                                        int i42 = pvgVar2 == null ? -1 : mkc.a[pvgVar2.ordinal()];
                                        cqb cqbVar = i42 != 1 ? i42 != 2 ? null : new cqb(modelOption2.m356getModeli4oh0I(), minimumTier) : new cqb(modelOption2.m356getModeli4oh0I(), pvgVar);
                                        if (cqbVar != null) {
                                            arrayList2.add(cqbVar);
                                        }
                                    }
                                } else if (iOrdinal == 1) {
                                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                                        if (((pvg) entry3.getValue()) == pvgVar) {
                                            linkedHashMap4.put(entry3.getKey(), entry3.getValue());
                                        }
                                    }
                                    arrayList2 = new ArrayList(linkedHashMap4.size());
                                    for (Map.Entry entry4 : linkedHashMap4.entrySet()) {
                                        ModelOption modelOption3 = (ModelOption) entry4.getKey();
                                        arrayList2.add(new cqb(modelOption3.m356getModeli4oh0I(), pvgVar));
                                    }
                                }
                                ArrayList arrayList6 = new ArrayList();
                                for (Object obj4 : (Iterable) arrayList2) {
                                    String strA = ((cqb) obj4).a();
                                    String strB = okcVar.b();
                                    if (!(strB == null ? false : ModelId.m1061equalsimpl0(strA, strB))) {
                                        arrayList6.add(obj4);
                                    }
                                }
                                return w44.t1(arrayList6);
                            }
                            Object next = it.next();
                            AvailableModelsConfig.AvailableModel availableModel = (AvailableModelsConfig.AvailableModel) linkedHashMap.get(ModelId.m1058boximpl(((ModelOption) next).m356getModeli4oh0I()));
                            if (availableModel != null) {
                                minimumTier = availableModel.getMinimumTier();
                            }
                            linkedHashMap2.put(next, minimumTier);
                        }
                        break;
                    default:
                        StickySelectionConfig stickySelectionConfig = (StickySelectionConfig) okcVar.b.g("mobile_sticky_selection_config", StickySelectionConfig.Companion.serializer()).getValue();
                        return stickySelectionConfig == null ? new StickySelectionConfig((StickyConfig) null, 1, (mq5) null) : stickySelectionConfig;
                }
            }
        });
        this.m = mpk.w(new nkc(this, i));
        final int i6 = 13;
        this.n = mpk.w(new zy7(this) { // from class: lkc
            public final /* synthetic */ okc F;

            {
                this.F = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v0, types: [lm6] */
            /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v13 */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v22, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v12 */
            /* JADX WARN: Type inference failed for: r5v13 */
            /* JADX WARN: Type inference failed for: r5v14 */
            /* JADX WARN: Type inference failed for: r5v15 */
            /* JADX WARN: Type inference failed for: r5v16 */
            /* JADX WARN: Type inference failed for: r5v17 */
            @Override // defpackage.zy7
            public final Object a() {
                ArrayList arrayList;
                String english;
                String english2;
                String english3;
                List<ModelSelectorEntry> models;
                Map linkedHashMap;
                List<AvailableModelsConfig.AvailableModel> models2;
                int i22 = i6;
                int i32 = 3;
                ?? arrayList2 = lm6.E;
                ?? r5 = 0;
                ?? r52 = 0;
                ?? r53 = 0;
                okc okcVar = this.F;
                switch (i22) {
                    case 0:
                        for (Membership membership : okcVar.c.a().getMemberships()) {
                            if (OrganizationId.m1068equalsimpl0(membership.getOrganization().m116getUuidXjkXN6I(), okcVar.a)) {
                                return membership.getOrganization();
                            }
                        }
                        pmf.h("Collection contains no element matching the predicate.");
                        return null;
                    case 1:
                        StickyConfig model_selector = ((StickySelectionConfig) okcVar.n.getValue()).getModel_selector();
                        return Boolean.valueOf(model_selector != null ? model_selector.getEnabled() : false);
                    case 2:
                        rc8 rc8Var2 = okcVar.b;
                        if (rc8Var2.b() && !((Boolean) rc8Var2.m("mobile_show_affirmative_consent_for_privacy_policy").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 3:
                        rc8 rc8Var3 = okcVar.b;
                        if (rc8Var3.b() && !((Boolean) rc8Var3.m("mobile_show_affirmative_consent").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 4:
                        rc8 rc8Var4 = okcVar.b;
                        if (rc8Var4.b() && !((Boolean) rc8Var4.m("mobile_use_birthday_for_age_verification").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 5:
                        rc8 rc8Var5 = okcVar.b;
                        return Boolean.valueOf(rc8Var5.b() && ((Boolean) rc8Var5.m("mobile_delay_age_verification").getValue()).booleanValue());
                    case 6:
                        return ajk.m((Map) okcVar.b.f("supported_regions", new f7a(srg.a, RegionSupport.Companion.serializer())).getValue());
                    case 7:
                        rc8 rc8Var6 = okcVar.b;
                        return Boolean.valueOf(rc8Var6.b() && ((Boolean) rc8Var6.m("claude_ai_ember").getValue()).booleanValue());
                    case 8:
                        ModelFallbacksConfig modelFallbacksConfig = (ModelFallbacksConfig) okcVar.b.g("holdup", ModelFallbacksConfig.Companion.serializer()).getValue();
                        return modelFallbacksConfig == null ? new ModelFallbacksConfig((Map) (r53 == true ? 1 : 0), (Map) (r52 == true ? 1 : 0), i32, (mq5) (r5 == true ? 1 : 0)) : modelFallbacksConfig;
                    case 9:
                        Organization organizationE = okcVar.e();
                        lea leaVar2 = okcVar.d;
                        List<ModelOption> claude_ai_bootstrap_models_config = organizationE.getClaude_ai_bootstrap_models_config();
                        if (claude_ai_bootstrap_models_config == null) {
                            ij0.y("Organization is missing claude_ai_bootstrap_models_config", null, false, 3);
                        } else {
                            List<ModelOption> list = claude_ai_bootstrap_models_config;
                            arrayList2 = new ArrayList(x44.y(list, 10));
                            for (ModelOption modelOption : list) {
                                _ServerLocalizedString description = modelOption.getDescription();
                                _ServerLocalizedString _serverlocalizedstring = (description == null || (english3 = description.getEnglish()) == null) ? null : new _ServerLocalizedString(english3, leaVar2.b(english3));
                                _ServerLocalizedString notice_text = modelOption.getNotice_text();
                                _ServerLocalizedString _serverlocalizedstring2 = (notice_text == null || (english2 = notice_text.getEnglish()) == null) ? null : new _ServerLocalizedString(english2, leaVar2.b(english2));
                                List<ThinkingModeOption> thinking_modes = modelOption.getThinking_modes();
                                if (thinking_modes != null) {
                                    List<ThinkingModeOption> list2 = thinking_modes;
                                    ArrayList arrayList3 = new ArrayList(x44.y(list2, 10));
                                    for (ThinkingModeOption thinkingModeOption : list2) {
                                        String english4 = thinkingModeOption.getTitle().getEnglish();
                                        _ServerLocalizedString _serverlocalizedstring3 = new _ServerLocalizedString(english4, leaVar2.b(english4));
                                        String english5 = thinkingModeOption.getDescription().getEnglish();
                                        _ServerLocalizedString _serverlocalizedstring4 = new _ServerLocalizedString(english5, leaVar2.b(english5));
                                        _ServerLocalizedString selection_title = thinkingModeOption.getSelection_title();
                                        arrayList3.add(ThinkingModeOption.m383copy3WgSuLE$default(thinkingModeOption, null, _serverlocalizedstring3, _serverlocalizedstring4, null, (selection_title == null || (english = selection_title.getEnglish()) == null) ? null : new _ServerLocalizedString(english, leaVar2.b(english)), null, 41, null));
                                    }
                                    arrayList = arrayList3;
                                } else {
                                    arrayList = null;
                                }
                                arrayList2.add(ModelOption.m353copyZEIUhPU$default(modelOption, null, null, _serverlocalizedstring, null, null, null, arrayList, null, _serverlocalizedstring2, null, null, null, 3771, null));
                            }
                        }
                        return arrayList2;
                    case 10:
                        List list3 = (List) okcVar.i.getValue();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj : list3) {
                            if (!x44.r(((ModelOption) obj).getInactive(), Boolean.TRUE)) {
                                arrayList4.add(obj);
                            }
                        }
                        return arrayList4;
                    case 11:
                        wz5 wz5Var = okcVar.j;
                        ModelSelectorSurface.Companion.getClass();
                        ModelSelectorConfig modelSelectorConfigF = okcVar.f(ModelSelectorSurface.CHAT);
                        if (modelSelectorConfigF != null && (models = modelSelectorConfigF.getModels()) != null) {
                            List<ModelSelectorEntry> list4 = models.isEmpty() ? null : models;
                            if (list4 != null) {
                                Set setF0 = bnf.f0(bnf.b0(bnf.V(new c54(0, list4), new kac(12)), be5.b0));
                                List list5 = (List) wz5Var.getValue();
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj2 : list5) {
                                    if (setF0.contains(ModelId.m1058boximpl(((ModelOption) obj2).m356getModeli4oh0I()))) {
                                        arrayList5.add(obj2);
                                    }
                                }
                                return arrayList5;
                            }
                        }
                        return (List) wz5Var.getValue();
                    case 12:
                        AvailableModelsConfig availableModelsConfig = (AvailableModelsConfig) okcVar.b.g("claude_ai_available_models", AvailableModelsConfig.Companion.serializer()).getValue();
                        if (availableModelsConfig == null || (models2 = availableModelsConfig.getModels()) == null) {
                            linkedHashMap = nm6.E;
                        } else {
                            List<AvailableModelsConfig.AvailableModel> list6 = models2;
                            int iD0 = tta.d0(x44.y(list6, 10));
                            if (iD0 < 16) {
                                iD0 = 16;
                            }
                            linkedHashMap = new LinkedHashMap(iD0);
                            for (Object obj3 : list6) {
                                linkedHashMap.put(ModelId.m1058boximpl(((AvailableModelsConfig.AvailableModel) obj3).m776getModel_idi4oh0I()), obj3);
                            }
                        }
                        List list7 = (List) okcVar.i.getValue();
                        int iD02 = tta.d0(x44.y(list7, 10));
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iD02 >= 16 ? iD02 : 16);
                        Iterator it = list7.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            pvg minimumTier = pvg.PRO;
                            if (!zHasNext) {
                                int iOrdinal = eve.C(okcVar.e()).ordinal();
                                pvg pvgVar = pvg.MAX;
                                if (iOrdinal == 0) {
                                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                                        if (((pvg) entry.getValue()) != pvg.FREE) {
                                            linkedHashMap3.put(entry.getKey(), entry.getValue());
                                        }
                                    }
                                    arrayList2 = new ArrayList();
                                    for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                                        ModelOption modelOption2 = (ModelOption) entry2.getKey();
                                        pvg pvgVar2 = (pvg) entry2.getValue();
                                        int i42 = pvgVar2 == null ? -1 : mkc.a[pvgVar2.ordinal()];
                                        cqb cqbVar = i42 != 1 ? i42 != 2 ? null : new cqb(modelOption2.m356getModeli4oh0I(), minimumTier) : new cqb(modelOption2.m356getModeli4oh0I(), pvgVar);
                                        if (cqbVar != null) {
                                            arrayList2.add(cqbVar);
                                        }
                                    }
                                } else if (iOrdinal == 1) {
                                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                                        if (((pvg) entry3.getValue()) == pvgVar) {
                                            linkedHashMap4.put(entry3.getKey(), entry3.getValue());
                                        }
                                    }
                                    arrayList2 = new ArrayList(linkedHashMap4.size());
                                    for (Map.Entry entry4 : linkedHashMap4.entrySet()) {
                                        ModelOption modelOption3 = (ModelOption) entry4.getKey();
                                        arrayList2.add(new cqb(modelOption3.m356getModeli4oh0I(), pvgVar));
                                    }
                                }
                                ArrayList arrayList6 = new ArrayList();
                                for (Object obj4 : (Iterable) arrayList2) {
                                    String strA = ((cqb) obj4).a();
                                    String strB = okcVar.b();
                                    if (!(strB == null ? false : ModelId.m1061equalsimpl0(strA, strB))) {
                                        arrayList6.add(obj4);
                                    }
                                }
                                return w44.t1(arrayList6);
                            }
                            Object next = it.next();
                            AvailableModelsConfig.AvailableModel availableModel = (AvailableModelsConfig.AvailableModel) linkedHashMap.get(ModelId.m1058boximpl(((ModelOption) next).m356getModeli4oh0I()));
                            if (availableModel != null) {
                                minimumTier = availableModel.getMinimumTier();
                            }
                            linkedHashMap2.put(next, minimumTier);
                        }
                        break;
                    default:
                        StickySelectionConfig stickySelectionConfig = (StickySelectionConfig) okcVar.b.g("mobile_sticky_selection_config", StickySelectionConfig.Companion.serializer()).getValue();
                        return stickySelectionConfig == null ? new StickySelectionConfig((StickyConfig) null, 1, (mq5) null) : stickySelectionConfig;
                }
            }
        });
        final int i7 = 1;
        this.o = mpk.w(new zy7(this) { // from class: lkc
            public final /* synthetic */ okc F;

            {
                this.F = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v0, types: [lm6] */
            /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v13 */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v22, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v12 */
            /* JADX WARN: Type inference failed for: r5v13 */
            /* JADX WARN: Type inference failed for: r5v14 */
            /* JADX WARN: Type inference failed for: r5v15 */
            /* JADX WARN: Type inference failed for: r5v16 */
            /* JADX WARN: Type inference failed for: r5v17 */
            @Override // defpackage.zy7
            public final Object a() {
                ArrayList arrayList;
                String english;
                String english2;
                String english3;
                List<ModelSelectorEntry> models;
                Map linkedHashMap;
                List<AvailableModelsConfig.AvailableModel> models2;
                int i22 = i7;
                int i32 = 3;
                ?? arrayList2 = lm6.E;
                ?? r5 = 0;
                ?? r52 = 0;
                ?? r53 = 0;
                okc okcVar = this.F;
                switch (i22) {
                    case 0:
                        for (Membership membership : okcVar.c.a().getMemberships()) {
                            if (OrganizationId.m1068equalsimpl0(membership.getOrganization().m116getUuidXjkXN6I(), okcVar.a)) {
                                return membership.getOrganization();
                            }
                        }
                        pmf.h("Collection contains no element matching the predicate.");
                        return null;
                    case 1:
                        StickyConfig model_selector = ((StickySelectionConfig) okcVar.n.getValue()).getModel_selector();
                        return Boolean.valueOf(model_selector != null ? model_selector.getEnabled() : false);
                    case 2:
                        rc8 rc8Var2 = okcVar.b;
                        if (rc8Var2.b() && !((Boolean) rc8Var2.m("mobile_show_affirmative_consent_for_privacy_policy").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 3:
                        rc8 rc8Var3 = okcVar.b;
                        if (rc8Var3.b() && !((Boolean) rc8Var3.m("mobile_show_affirmative_consent").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 4:
                        rc8 rc8Var4 = okcVar.b;
                        if (rc8Var4.b() && !((Boolean) rc8Var4.m("mobile_use_birthday_for_age_verification").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 5:
                        rc8 rc8Var5 = okcVar.b;
                        return Boolean.valueOf(rc8Var5.b() && ((Boolean) rc8Var5.m("mobile_delay_age_verification").getValue()).booleanValue());
                    case 6:
                        return ajk.m((Map) okcVar.b.f("supported_regions", new f7a(srg.a, RegionSupport.Companion.serializer())).getValue());
                    case 7:
                        rc8 rc8Var6 = okcVar.b;
                        return Boolean.valueOf(rc8Var6.b() && ((Boolean) rc8Var6.m("claude_ai_ember").getValue()).booleanValue());
                    case 8:
                        ModelFallbacksConfig modelFallbacksConfig = (ModelFallbacksConfig) okcVar.b.g("holdup", ModelFallbacksConfig.Companion.serializer()).getValue();
                        return modelFallbacksConfig == null ? new ModelFallbacksConfig((Map) (r53 == true ? 1 : 0), (Map) (r52 == true ? 1 : 0), i32, (mq5) (r5 == true ? 1 : 0)) : modelFallbacksConfig;
                    case 9:
                        Organization organizationE = okcVar.e();
                        lea leaVar2 = okcVar.d;
                        List<ModelOption> claude_ai_bootstrap_models_config = organizationE.getClaude_ai_bootstrap_models_config();
                        if (claude_ai_bootstrap_models_config == null) {
                            ij0.y("Organization is missing claude_ai_bootstrap_models_config", null, false, 3);
                        } else {
                            List<ModelOption> list = claude_ai_bootstrap_models_config;
                            arrayList2 = new ArrayList(x44.y(list, 10));
                            for (ModelOption modelOption : list) {
                                _ServerLocalizedString description = modelOption.getDescription();
                                _ServerLocalizedString _serverlocalizedstring = (description == null || (english3 = description.getEnglish()) == null) ? null : new _ServerLocalizedString(english3, leaVar2.b(english3));
                                _ServerLocalizedString notice_text = modelOption.getNotice_text();
                                _ServerLocalizedString _serverlocalizedstring2 = (notice_text == null || (english2 = notice_text.getEnglish()) == null) ? null : new _ServerLocalizedString(english2, leaVar2.b(english2));
                                List<ThinkingModeOption> thinking_modes = modelOption.getThinking_modes();
                                if (thinking_modes != null) {
                                    List<ThinkingModeOption> list2 = thinking_modes;
                                    ArrayList arrayList3 = new ArrayList(x44.y(list2, 10));
                                    for (ThinkingModeOption thinkingModeOption : list2) {
                                        String english4 = thinkingModeOption.getTitle().getEnglish();
                                        _ServerLocalizedString _serverlocalizedstring3 = new _ServerLocalizedString(english4, leaVar2.b(english4));
                                        String english5 = thinkingModeOption.getDescription().getEnglish();
                                        _ServerLocalizedString _serverlocalizedstring4 = new _ServerLocalizedString(english5, leaVar2.b(english5));
                                        _ServerLocalizedString selection_title = thinkingModeOption.getSelection_title();
                                        arrayList3.add(ThinkingModeOption.m383copy3WgSuLE$default(thinkingModeOption, null, _serverlocalizedstring3, _serverlocalizedstring4, null, (selection_title == null || (english = selection_title.getEnglish()) == null) ? null : new _ServerLocalizedString(english, leaVar2.b(english)), null, 41, null));
                                    }
                                    arrayList = arrayList3;
                                } else {
                                    arrayList = null;
                                }
                                arrayList2.add(ModelOption.m353copyZEIUhPU$default(modelOption, null, null, _serverlocalizedstring, null, null, null, arrayList, null, _serverlocalizedstring2, null, null, null, 3771, null));
                            }
                        }
                        return arrayList2;
                    case 10:
                        List list3 = (List) okcVar.i.getValue();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj : list3) {
                            if (!x44.r(((ModelOption) obj).getInactive(), Boolean.TRUE)) {
                                arrayList4.add(obj);
                            }
                        }
                        return arrayList4;
                    case 11:
                        wz5 wz5Var = okcVar.j;
                        ModelSelectorSurface.Companion.getClass();
                        ModelSelectorConfig modelSelectorConfigF = okcVar.f(ModelSelectorSurface.CHAT);
                        if (modelSelectorConfigF != null && (models = modelSelectorConfigF.getModels()) != null) {
                            List<ModelSelectorEntry> list4 = models.isEmpty() ? null : models;
                            if (list4 != null) {
                                Set setF0 = bnf.f0(bnf.b0(bnf.V(new c54(0, list4), new kac(12)), be5.b0));
                                List list5 = (List) wz5Var.getValue();
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj2 : list5) {
                                    if (setF0.contains(ModelId.m1058boximpl(((ModelOption) obj2).m356getModeli4oh0I()))) {
                                        arrayList5.add(obj2);
                                    }
                                }
                                return arrayList5;
                            }
                        }
                        return (List) wz5Var.getValue();
                    case 12:
                        AvailableModelsConfig availableModelsConfig = (AvailableModelsConfig) okcVar.b.g("claude_ai_available_models", AvailableModelsConfig.Companion.serializer()).getValue();
                        if (availableModelsConfig == null || (models2 = availableModelsConfig.getModels()) == null) {
                            linkedHashMap = nm6.E;
                        } else {
                            List<AvailableModelsConfig.AvailableModel> list6 = models2;
                            int iD0 = tta.d0(x44.y(list6, 10));
                            if (iD0 < 16) {
                                iD0 = 16;
                            }
                            linkedHashMap = new LinkedHashMap(iD0);
                            for (Object obj3 : list6) {
                                linkedHashMap.put(ModelId.m1058boximpl(((AvailableModelsConfig.AvailableModel) obj3).m776getModel_idi4oh0I()), obj3);
                            }
                        }
                        List list7 = (List) okcVar.i.getValue();
                        int iD02 = tta.d0(x44.y(list7, 10));
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iD02 >= 16 ? iD02 : 16);
                        Iterator it = list7.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            pvg minimumTier = pvg.PRO;
                            if (!zHasNext) {
                                int iOrdinal = eve.C(okcVar.e()).ordinal();
                                pvg pvgVar = pvg.MAX;
                                if (iOrdinal == 0) {
                                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                                        if (((pvg) entry.getValue()) != pvg.FREE) {
                                            linkedHashMap3.put(entry.getKey(), entry.getValue());
                                        }
                                    }
                                    arrayList2 = new ArrayList();
                                    for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                                        ModelOption modelOption2 = (ModelOption) entry2.getKey();
                                        pvg pvgVar2 = (pvg) entry2.getValue();
                                        int i42 = pvgVar2 == null ? -1 : mkc.a[pvgVar2.ordinal()];
                                        cqb cqbVar = i42 != 1 ? i42 != 2 ? null : new cqb(modelOption2.m356getModeli4oh0I(), minimumTier) : new cqb(modelOption2.m356getModeli4oh0I(), pvgVar);
                                        if (cqbVar != null) {
                                            arrayList2.add(cqbVar);
                                        }
                                    }
                                } else if (iOrdinal == 1) {
                                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                                        if (((pvg) entry3.getValue()) == pvgVar) {
                                            linkedHashMap4.put(entry3.getKey(), entry3.getValue());
                                        }
                                    }
                                    arrayList2 = new ArrayList(linkedHashMap4.size());
                                    for (Map.Entry entry4 : linkedHashMap4.entrySet()) {
                                        ModelOption modelOption3 = (ModelOption) entry4.getKey();
                                        arrayList2.add(new cqb(modelOption3.m356getModeli4oh0I(), pvgVar));
                                    }
                                }
                                ArrayList arrayList6 = new ArrayList();
                                for (Object obj4 : (Iterable) arrayList2) {
                                    String strA = ((cqb) obj4).a();
                                    String strB = okcVar.b();
                                    if (!(strB == null ? false : ModelId.m1061equalsimpl0(strA, strB))) {
                                        arrayList6.add(obj4);
                                    }
                                }
                                return w44.t1(arrayList6);
                            }
                            Object next = it.next();
                            AvailableModelsConfig.AvailableModel availableModel = (AvailableModelsConfig.AvailableModel) linkedHashMap.get(ModelId.m1058boximpl(((ModelOption) next).m356getModeli4oh0I()));
                            if (availableModel != null) {
                                minimumTier = availableModel.getMinimumTier();
                            }
                            linkedHashMap2.put(next, minimumTier);
                        }
                        break;
                    default:
                        StickySelectionConfig stickySelectionConfig = (StickySelectionConfig) okcVar.b.g("mobile_sticky_selection_config", StickySelectionConfig.Companion.serializer()).getValue();
                        return stickySelectionConfig == null ? new StickySelectionConfig((StickyConfig) null, 1, (mq5) null) : stickySelectionConfig;
                }
            }
        });
        this.p = mpk.x(new nkc(this, i7), a5Var);
        this.q = rc8Var.m("model_selector_enabled");
        this.r = rc8Var.m("mobile_allow_segment_beta_app_feedback");
        final int i8 = 2;
        this.s = mpk.w(new zy7(this) { // from class: lkc
            public final /* synthetic */ okc F;

            {
                this.F = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v0, types: [lm6] */
            /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v13 */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v22, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v12 */
            /* JADX WARN: Type inference failed for: r5v13 */
            /* JADX WARN: Type inference failed for: r5v14 */
            /* JADX WARN: Type inference failed for: r5v15 */
            /* JADX WARN: Type inference failed for: r5v16 */
            /* JADX WARN: Type inference failed for: r5v17 */
            @Override // defpackage.zy7
            public final Object a() {
                ArrayList arrayList;
                String english;
                String english2;
                String english3;
                List<ModelSelectorEntry> models;
                Map linkedHashMap;
                List<AvailableModelsConfig.AvailableModel> models2;
                int i22 = i8;
                int i32 = 3;
                ?? arrayList2 = lm6.E;
                ?? r5 = 0;
                ?? r52 = 0;
                ?? r53 = 0;
                okc okcVar = this.F;
                switch (i22) {
                    case 0:
                        for (Membership membership : okcVar.c.a().getMemberships()) {
                            if (OrganizationId.m1068equalsimpl0(membership.getOrganization().m116getUuidXjkXN6I(), okcVar.a)) {
                                return membership.getOrganization();
                            }
                        }
                        pmf.h("Collection contains no element matching the predicate.");
                        return null;
                    case 1:
                        StickyConfig model_selector = ((StickySelectionConfig) okcVar.n.getValue()).getModel_selector();
                        return Boolean.valueOf(model_selector != null ? model_selector.getEnabled() : false);
                    case 2:
                        rc8 rc8Var2 = okcVar.b;
                        if (rc8Var2.b() && !((Boolean) rc8Var2.m("mobile_show_affirmative_consent_for_privacy_policy").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 3:
                        rc8 rc8Var3 = okcVar.b;
                        if (rc8Var3.b() && !((Boolean) rc8Var3.m("mobile_show_affirmative_consent").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 4:
                        rc8 rc8Var4 = okcVar.b;
                        if (rc8Var4.b() && !((Boolean) rc8Var4.m("mobile_use_birthday_for_age_verification").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 5:
                        rc8 rc8Var5 = okcVar.b;
                        return Boolean.valueOf(rc8Var5.b() && ((Boolean) rc8Var5.m("mobile_delay_age_verification").getValue()).booleanValue());
                    case 6:
                        return ajk.m((Map) okcVar.b.f("supported_regions", new f7a(srg.a, RegionSupport.Companion.serializer())).getValue());
                    case 7:
                        rc8 rc8Var6 = okcVar.b;
                        return Boolean.valueOf(rc8Var6.b() && ((Boolean) rc8Var6.m("claude_ai_ember").getValue()).booleanValue());
                    case 8:
                        ModelFallbacksConfig modelFallbacksConfig = (ModelFallbacksConfig) okcVar.b.g("holdup", ModelFallbacksConfig.Companion.serializer()).getValue();
                        return modelFallbacksConfig == null ? new ModelFallbacksConfig((Map) (r53 == true ? 1 : 0), (Map) (r52 == true ? 1 : 0), i32, (mq5) (r5 == true ? 1 : 0)) : modelFallbacksConfig;
                    case 9:
                        Organization organizationE = okcVar.e();
                        lea leaVar2 = okcVar.d;
                        List<ModelOption> claude_ai_bootstrap_models_config = organizationE.getClaude_ai_bootstrap_models_config();
                        if (claude_ai_bootstrap_models_config == null) {
                            ij0.y("Organization is missing claude_ai_bootstrap_models_config", null, false, 3);
                        } else {
                            List<ModelOption> list = claude_ai_bootstrap_models_config;
                            arrayList2 = new ArrayList(x44.y(list, 10));
                            for (ModelOption modelOption : list) {
                                _ServerLocalizedString description = modelOption.getDescription();
                                _ServerLocalizedString _serverlocalizedstring = (description == null || (english3 = description.getEnglish()) == null) ? null : new _ServerLocalizedString(english3, leaVar2.b(english3));
                                _ServerLocalizedString notice_text = modelOption.getNotice_text();
                                _ServerLocalizedString _serverlocalizedstring2 = (notice_text == null || (english2 = notice_text.getEnglish()) == null) ? null : new _ServerLocalizedString(english2, leaVar2.b(english2));
                                List<ThinkingModeOption> thinking_modes = modelOption.getThinking_modes();
                                if (thinking_modes != null) {
                                    List<ThinkingModeOption> list2 = thinking_modes;
                                    ArrayList arrayList3 = new ArrayList(x44.y(list2, 10));
                                    for (ThinkingModeOption thinkingModeOption : list2) {
                                        String english4 = thinkingModeOption.getTitle().getEnglish();
                                        _ServerLocalizedString _serverlocalizedstring3 = new _ServerLocalizedString(english4, leaVar2.b(english4));
                                        String english5 = thinkingModeOption.getDescription().getEnglish();
                                        _ServerLocalizedString _serverlocalizedstring4 = new _ServerLocalizedString(english5, leaVar2.b(english5));
                                        _ServerLocalizedString selection_title = thinkingModeOption.getSelection_title();
                                        arrayList3.add(ThinkingModeOption.m383copy3WgSuLE$default(thinkingModeOption, null, _serverlocalizedstring3, _serverlocalizedstring4, null, (selection_title == null || (english = selection_title.getEnglish()) == null) ? null : new _ServerLocalizedString(english, leaVar2.b(english)), null, 41, null));
                                    }
                                    arrayList = arrayList3;
                                } else {
                                    arrayList = null;
                                }
                                arrayList2.add(ModelOption.m353copyZEIUhPU$default(modelOption, null, null, _serverlocalizedstring, null, null, null, arrayList, null, _serverlocalizedstring2, null, null, null, 3771, null));
                            }
                        }
                        return arrayList2;
                    case 10:
                        List list3 = (List) okcVar.i.getValue();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj : list3) {
                            if (!x44.r(((ModelOption) obj).getInactive(), Boolean.TRUE)) {
                                arrayList4.add(obj);
                            }
                        }
                        return arrayList4;
                    case 11:
                        wz5 wz5Var = okcVar.j;
                        ModelSelectorSurface.Companion.getClass();
                        ModelSelectorConfig modelSelectorConfigF = okcVar.f(ModelSelectorSurface.CHAT);
                        if (modelSelectorConfigF != null && (models = modelSelectorConfigF.getModels()) != null) {
                            List<ModelSelectorEntry> list4 = models.isEmpty() ? null : models;
                            if (list4 != null) {
                                Set setF0 = bnf.f0(bnf.b0(bnf.V(new c54(0, list4), new kac(12)), be5.b0));
                                List list5 = (List) wz5Var.getValue();
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj2 : list5) {
                                    if (setF0.contains(ModelId.m1058boximpl(((ModelOption) obj2).m356getModeli4oh0I()))) {
                                        arrayList5.add(obj2);
                                    }
                                }
                                return arrayList5;
                            }
                        }
                        return (List) wz5Var.getValue();
                    case 12:
                        AvailableModelsConfig availableModelsConfig = (AvailableModelsConfig) okcVar.b.g("claude_ai_available_models", AvailableModelsConfig.Companion.serializer()).getValue();
                        if (availableModelsConfig == null || (models2 = availableModelsConfig.getModels()) == null) {
                            linkedHashMap = nm6.E;
                        } else {
                            List<AvailableModelsConfig.AvailableModel> list6 = models2;
                            int iD0 = tta.d0(x44.y(list6, 10));
                            if (iD0 < 16) {
                                iD0 = 16;
                            }
                            linkedHashMap = new LinkedHashMap(iD0);
                            for (Object obj3 : list6) {
                                linkedHashMap.put(ModelId.m1058boximpl(((AvailableModelsConfig.AvailableModel) obj3).m776getModel_idi4oh0I()), obj3);
                            }
                        }
                        List list7 = (List) okcVar.i.getValue();
                        int iD02 = tta.d0(x44.y(list7, 10));
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iD02 >= 16 ? iD02 : 16);
                        Iterator it = list7.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            pvg minimumTier = pvg.PRO;
                            if (!zHasNext) {
                                int iOrdinal = eve.C(okcVar.e()).ordinal();
                                pvg pvgVar = pvg.MAX;
                                if (iOrdinal == 0) {
                                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                                        if (((pvg) entry.getValue()) != pvg.FREE) {
                                            linkedHashMap3.put(entry.getKey(), entry.getValue());
                                        }
                                    }
                                    arrayList2 = new ArrayList();
                                    for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                                        ModelOption modelOption2 = (ModelOption) entry2.getKey();
                                        pvg pvgVar2 = (pvg) entry2.getValue();
                                        int i42 = pvgVar2 == null ? -1 : mkc.a[pvgVar2.ordinal()];
                                        cqb cqbVar = i42 != 1 ? i42 != 2 ? null : new cqb(modelOption2.m356getModeli4oh0I(), minimumTier) : new cqb(modelOption2.m356getModeli4oh0I(), pvgVar);
                                        if (cqbVar != null) {
                                            arrayList2.add(cqbVar);
                                        }
                                    }
                                } else if (iOrdinal == 1) {
                                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                                        if (((pvg) entry3.getValue()) == pvgVar) {
                                            linkedHashMap4.put(entry3.getKey(), entry3.getValue());
                                        }
                                    }
                                    arrayList2 = new ArrayList(linkedHashMap4.size());
                                    for (Map.Entry entry4 : linkedHashMap4.entrySet()) {
                                        ModelOption modelOption3 = (ModelOption) entry4.getKey();
                                        arrayList2.add(new cqb(modelOption3.m356getModeli4oh0I(), pvgVar));
                                    }
                                }
                                ArrayList arrayList6 = new ArrayList();
                                for (Object obj4 : (Iterable) arrayList2) {
                                    String strA = ((cqb) obj4).a();
                                    String strB = okcVar.b();
                                    if (!(strB == null ? false : ModelId.m1061equalsimpl0(strA, strB))) {
                                        arrayList6.add(obj4);
                                    }
                                }
                                return w44.t1(arrayList6);
                            }
                            Object next = it.next();
                            AvailableModelsConfig.AvailableModel availableModel = (AvailableModelsConfig.AvailableModel) linkedHashMap.get(ModelId.m1058boximpl(((ModelOption) next).m356getModeli4oh0I()));
                            if (availableModel != null) {
                                minimumTier = availableModel.getMinimumTier();
                            }
                            linkedHashMap2.put(next, minimumTier);
                        }
                        break;
                    default:
                        StickySelectionConfig stickySelectionConfig = (StickySelectionConfig) okcVar.b.g("mobile_sticky_selection_config", StickySelectionConfig.Companion.serializer()).getValue();
                        return stickySelectionConfig == null ? new StickySelectionConfig((StickyConfig) null, 1, (mq5) null) : stickySelectionConfig;
                }
            }
        });
        final int i9 = 3;
        this.t = mpk.w(new zy7(this) { // from class: lkc
            public final /* synthetic */ okc F;

            {
                this.F = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v0, types: [lm6] */
            /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v13 */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v22, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v12 */
            /* JADX WARN: Type inference failed for: r5v13 */
            /* JADX WARN: Type inference failed for: r5v14 */
            /* JADX WARN: Type inference failed for: r5v15 */
            /* JADX WARN: Type inference failed for: r5v16 */
            /* JADX WARN: Type inference failed for: r5v17 */
            @Override // defpackage.zy7
            public final Object a() {
                ArrayList arrayList;
                String english;
                String english2;
                String english3;
                List<ModelSelectorEntry> models;
                Map linkedHashMap;
                List<AvailableModelsConfig.AvailableModel> models2;
                int i22 = i9;
                int i32 = 3;
                ?? arrayList2 = lm6.E;
                ?? r5 = 0;
                ?? r52 = 0;
                ?? r53 = 0;
                okc okcVar = this.F;
                switch (i22) {
                    case 0:
                        for (Membership membership : okcVar.c.a().getMemberships()) {
                            if (OrganizationId.m1068equalsimpl0(membership.getOrganization().m116getUuidXjkXN6I(), okcVar.a)) {
                                return membership.getOrganization();
                            }
                        }
                        pmf.h("Collection contains no element matching the predicate.");
                        return null;
                    case 1:
                        StickyConfig model_selector = ((StickySelectionConfig) okcVar.n.getValue()).getModel_selector();
                        return Boolean.valueOf(model_selector != null ? model_selector.getEnabled() : false);
                    case 2:
                        rc8 rc8Var2 = okcVar.b;
                        if (rc8Var2.b() && !((Boolean) rc8Var2.m("mobile_show_affirmative_consent_for_privacy_policy").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 3:
                        rc8 rc8Var3 = okcVar.b;
                        if (rc8Var3.b() && !((Boolean) rc8Var3.m("mobile_show_affirmative_consent").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 4:
                        rc8 rc8Var4 = okcVar.b;
                        if (rc8Var4.b() && !((Boolean) rc8Var4.m("mobile_use_birthday_for_age_verification").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 5:
                        rc8 rc8Var5 = okcVar.b;
                        return Boolean.valueOf(rc8Var5.b() && ((Boolean) rc8Var5.m("mobile_delay_age_verification").getValue()).booleanValue());
                    case 6:
                        return ajk.m((Map) okcVar.b.f("supported_regions", new f7a(srg.a, RegionSupport.Companion.serializer())).getValue());
                    case 7:
                        rc8 rc8Var6 = okcVar.b;
                        return Boolean.valueOf(rc8Var6.b() && ((Boolean) rc8Var6.m("claude_ai_ember").getValue()).booleanValue());
                    case 8:
                        ModelFallbacksConfig modelFallbacksConfig = (ModelFallbacksConfig) okcVar.b.g("holdup", ModelFallbacksConfig.Companion.serializer()).getValue();
                        return modelFallbacksConfig == null ? new ModelFallbacksConfig((Map) (r53 == true ? 1 : 0), (Map) (r52 == true ? 1 : 0), i32, (mq5) (r5 == true ? 1 : 0)) : modelFallbacksConfig;
                    case 9:
                        Organization organizationE = okcVar.e();
                        lea leaVar2 = okcVar.d;
                        List<ModelOption> claude_ai_bootstrap_models_config = organizationE.getClaude_ai_bootstrap_models_config();
                        if (claude_ai_bootstrap_models_config == null) {
                            ij0.y("Organization is missing claude_ai_bootstrap_models_config", null, false, 3);
                        } else {
                            List<ModelOption> list = claude_ai_bootstrap_models_config;
                            arrayList2 = new ArrayList(x44.y(list, 10));
                            for (ModelOption modelOption : list) {
                                _ServerLocalizedString description = modelOption.getDescription();
                                _ServerLocalizedString _serverlocalizedstring = (description == null || (english3 = description.getEnglish()) == null) ? null : new _ServerLocalizedString(english3, leaVar2.b(english3));
                                _ServerLocalizedString notice_text = modelOption.getNotice_text();
                                _ServerLocalizedString _serverlocalizedstring2 = (notice_text == null || (english2 = notice_text.getEnglish()) == null) ? null : new _ServerLocalizedString(english2, leaVar2.b(english2));
                                List<ThinkingModeOption> thinking_modes = modelOption.getThinking_modes();
                                if (thinking_modes != null) {
                                    List<ThinkingModeOption> list2 = thinking_modes;
                                    ArrayList arrayList3 = new ArrayList(x44.y(list2, 10));
                                    for (ThinkingModeOption thinkingModeOption : list2) {
                                        String english4 = thinkingModeOption.getTitle().getEnglish();
                                        _ServerLocalizedString _serverlocalizedstring3 = new _ServerLocalizedString(english4, leaVar2.b(english4));
                                        String english5 = thinkingModeOption.getDescription().getEnglish();
                                        _ServerLocalizedString _serverlocalizedstring4 = new _ServerLocalizedString(english5, leaVar2.b(english5));
                                        _ServerLocalizedString selection_title = thinkingModeOption.getSelection_title();
                                        arrayList3.add(ThinkingModeOption.m383copy3WgSuLE$default(thinkingModeOption, null, _serverlocalizedstring3, _serverlocalizedstring4, null, (selection_title == null || (english = selection_title.getEnglish()) == null) ? null : new _ServerLocalizedString(english, leaVar2.b(english)), null, 41, null));
                                    }
                                    arrayList = arrayList3;
                                } else {
                                    arrayList = null;
                                }
                                arrayList2.add(ModelOption.m353copyZEIUhPU$default(modelOption, null, null, _serverlocalizedstring, null, null, null, arrayList, null, _serverlocalizedstring2, null, null, null, 3771, null));
                            }
                        }
                        return arrayList2;
                    case 10:
                        List list3 = (List) okcVar.i.getValue();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj : list3) {
                            if (!x44.r(((ModelOption) obj).getInactive(), Boolean.TRUE)) {
                                arrayList4.add(obj);
                            }
                        }
                        return arrayList4;
                    case 11:
                        wz5 wz5Var = okcVar.j;
                        ModelSelectorSurface.Companion.getClass();
                        ModelSelectorConfig modelSelectorConfigF = okcVar.f(ModelSelectorSurface.CHAT);
                        if (modelSelectorConfigF != null && (models = modelSelectorConfigF.getModels()) != null) {
                            List<ModelSelectorEntry> list4 = models.isEmpty() ? null : models;
                            if (list4 != null) {
                                Set setF0 = bnf.f0(bnf.b0(bnf.V(new c54(0, list4), new kac(12)), be5.b0));
                                List list5 = (List) wz5Var.getValue();
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj2 : list5) {
                                    if (setF0.contains(ModelId.m1058boximpl(((ModelOption) obj2).m356getModeli4oh0I()))) {
                                        arrayList5.add(obj2);
                                    }
                                }
                                return arrayList5;
                            }
                        }
                        return (List) wz5Var.getValue();
                    case 12:
                        AvailableModelsConfig availableModelsConfig = (AvailableModelsConfig) okcVar.b.g("claude_ai_available_models", AvailableModelsConfig.Companion.serializer()).getValue();
                        if (availableModelsConfig == null || (models2 = availableModelsConfig.getModels()) == null) {
                            linkedHashMap = nm6.E;
                        } else {
                            List<AvailableModelsConfig.AvailableModel> list6 = models2;
                            int iD0 = tta.d0(x44.y(list6, 10));
                            if (iD0 < 16) {
                                iD0 = 16;
                            }
                            linkedHashMap = new LinkedHashMap(iD0);
                            for (Object obj3 : list6) {
                                linkedHashMap.put(ModelId.m1058boximpl(((AvailableModelsConfig.AvailableModel) obj3).m776getModel_idi4oh0I()), obj3);
                            }
                        }
                        List list7 = (List) okcVar.i.getValue();
                        int iD02 = tta.d0(x44.y(list7, 10));
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iD02 >= 16 ? iD02 : 16);
                        Iterator it = list7.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            pvg minimumTier = pvg.PRO;
                            if (!zHasNext) {
                                int iOrdinal = eve.C(okcVar.e()).ordinal();
                                pvg pvgVar = pvg.MAX;
                                if (iOrdinal == 0) {
                                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                                        if (((pvg) entry.getValue()) != pvg.FREE) {
                                            linkedHashMap3.put(entry.getKey(), entry.getValue());
                                        }
                                    }
                                    arrayList2 = new ArrayList();
                                    for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                                        ModelOption modelOption2 = (ModelOption) entry2.getKey();
                                        pvg pvgVar2 = (pvg) entry2.getValue();
                                        int i42 = pvgVar2 == null ? -1 : mkc.a[pvgVar2.ordinal()];
                                        cqb cqbVar = i42 != 1 ? i42 != 2 ? null : new cqb(modelOption2.m356getModeli4oh0I(), minimumTier) : new cqb(modelOption2.m356getModeli4oh0I(), pvgVar);
                                        if (cqbVar != null) {
                                            arrayList2.add(cqbVar);
                                        }
                                    }
                                } else if (iOrdinal == 1) {
                                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                                        if (((pvg) entry3.getValue()) == pvgVar) {
                                            linkedHashMap4.put(entry3.getKey(), entry3.getValue());
                                        }
                                    }
                                    arrayList2 = new ArrayList(linkedHashMap4.size());
                                    for (Map.Entry entry4 : linkedHashMap4.entrySet()) {
                                        ModelOption modelOption3 = (ModelOption) entry4.getKey();
                                        arrayList2.add(new cqb(modelOption3.m356getModeli4oh0I(), pvgVar));
                                    }
                                }
                                ArrayList arrayList6 = new ArrayList();
                                for (Object obj4 : (Iterable) arrayList2) {
                                    String strA = ((cqb) obj4).a();
                                    String strB = okcVar.b();
                                    if (!(strB == null ? false : ModelId.m1061equalsimpl0(strA, strB))) {
                                        arrayList6.add(obj4);
                                    }
                                }
                                return w44.t1(arrayList6);
                            }
                            Object next = it.next();
                            AvailableModelsConfig.AvailableModel availableModel = (AvailableModelsConfig.AvailableModel) linkedHashMap.get(ModelId.m1058boximpl(((ModelOption) next).m356getModeli4oh0I()));
                            if (availableModel != null) {
                                minimumTier = availableModel.getMinimumTier();
                            }
                            linkedHashMap2.put(next, minimumTier);
                        }
                        break;
                    default:
                        StickySelectionConfig stickySelectionConfig = (StickySelectionConfig) okcVar.b.g("mobile_sticky_selection_config", StickySelectionConfig.Companion.serializer()).getValue();
                        return stickySelectionConfig == null ? new StickySelectionConfig((StickyConfig) null, 1, (mq5) null) : stickySelectionConfig;
                }
            }
        });
        final int i10 = 4;
        this.u = mpk.w(new zy7(this) { // from class: lkc
            public final /* synthetic */ okc F;

            {
                this.F = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v0, types: [lm6] */
            /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v13 */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v22, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v12 */
            /* JADX WARN: Type inference failed for: r5v13 */
            /* JADX WARN: Type inference failed for: r5v14 */
            /* JADX WARN: Type inference failed for: r5v15 */
            /* JADX WARN: Type inference failed for: r5v16 */
            /* JADX WARN: Type inference failed for: r5v17 */
            @Override // defpackage.zy7
            public final Object a() {
                ArrayList arrayList;
                String english;
                String english2;
                String english3;
                List<ModelSelectorEntry> models;
                Map linkedHashMap;
                List<AvailableModelsConfig.AvailableModel> models2;
                int i22 = i10;
                int i32 = 3;
                ?? arrayList2 = lm6.E;
                ?? r5 = 0;
                ?? r52 = 0;
                ?? r53 = 0;
                okc okcVar = this.F;
                switch (i22) {
                    case 0:
                        for (Membership membership : okcVar.c.a().getMemberships()) {
                            if (OrganizationId.m1068equalsimpl0(membership.getOrganization().m116getUuidXjkXN6I(), okcVar.a)) {
                                return membership.getOrganization();
                            }
                        }
                        pmf.h("Collection contains no element matching the predicate.");
                        return null;
                    case 1:
                        StickyConfig model_selector = ((StickySelectionConfig) okcVar.n.getValue()).getModel_selector();
                        return Boolean.valueOf(model_selector != null ? model_selector.getEnabled() : false);
                    case 2:
                        rc8 rc8Var2 = okcVar.b;
                        if (rc8Var2.b() && !((Boolean) rc8Var2.m("mobile_show_affirmative_consent_for_privacy_policy").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 3:
                        rc8 rc8Var3 = okcVar.b;
                        if (rc8Var3.b() && !((Boolean) rc8Var3.m("mobile_show_affirmative_consent").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 4:
                        rc8 rc8Var4 = okcVar.b;
                        if (rc8Var4.b() && !((Boolean) rc8Var4.m("mobile_use_birthday_for_age_verification").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 5:
                        rc8 rc8Var5 = okcVar.b;
                        return Boolean.valueOf(rc8Var5.b() && ((Boolean) rc8Var5.m("mobile_delay_age_verification").getValue()).booleanValue());
                    case 6:
                        return ajk.m((Map) okcVar.b.f("supported_regions", new f7a(srg.a, RegionSupport.Companion.serializer())).getValue());
                    case 7:
                        rc8 rc8Var6 = okcVar.b;
                        return Boolean.valueOf(rc8Var6.b() && ((Boolean) rc8Var6.m("claude_ai_ember").getValue()).booleanValue());
                    case 8:
                        ModelFallbacksConfig modelFallbacksConfig = (ModelFallbacksConfig) okcVar.b.g("holdup", ModelFallbacksConfig.Companion.serializer()).getValue();
                        return modelFallbacksConfig == null ? new ModelFallbacksConfig((Map) (r53 == true ? 1 : 0), (Map) (r52 == true ? 1 : 0), i32, (mq5) (r5 == true ? 1 : 0)) : modelFallbacksConfig;
                    case 9:
                        Organization organizationE = okcVar.e();
                        lea leaVar2 = okcVar.d;
                        List<ModelOption> claude_ai_bootstrap_models_config = organizationE.getClaude_ai_bootstrap_models_config();
                        if (claude_ai_bootstrap_models_config == null) {
                            ij0.y("Organization is missing claude_ai_bootstrap_models_config", null, false, 3);
                        } else {
                            List<ModelOption> list = claude_ai_bootstrap_models_config;
                            arrayList2 = new ArrayList(x44.y(list, 10));
                            for (ModelOption modelOption : list) {
                                _ServerLocalizedString description = modelOption.getDescription();
                                _ServerLocalizedString _serverlocalizedstring = (description == null || (english3 = description.getEnglish()) == null) ? null : new _ServerLocalizedString(english3, leaVar2.b(english3));
                                _ServerLocalizedString notice_text = modelOption.getNotice_text();
                                _ServerLocalizedString _serverlocalizedstring2 = (notice_text == null || (english2 = notice_text.getEnglish()) == null) ? null : new _ServerLocalizedString(english2, leaVar2.b(english2));
                                List<ThinkingModeOption> thinking_modes = modelOption.getThinking_modes();
                                if (thinking_modes != null) {
                                    List<ThinkingModeOption> list2 = thinking_modes;
                                    ArrayList arrayList3 = new ArrayList(x44.y(list2, 10));
                                    for (ThinkingModeOption thinkingModeOption : list2) {
                                        String english4 = thinkingModeOption.getTitle().getEnglish();
                                        _ServerLocalizedString _serverlocalizedstring3 = new _ServerLocalizedString(english4, leaVar2.b(english4));
                                        String english5 = thinkingModeOption.getDescription().getEnglish();
                                        _ServerLocalizedString _serverlocalizedstring4 = new _ServerLocalizedString(english5, leaVar2.b(english5));
                                        _ServerLocalizedString selection_title = thinkingModeOption.getSelection_title();
                                        arrayList3.add(ThinkingModeOption.m383copy3WgSuLE$default(thinkingModeOption, null, _serverlocalizedstring3, _serverlocalizedstring4, null, (selection_title == null || (english = selection_title.getEnglish()) == null) ? null : new _ServerLocalizedString(english, leaVar2.b(english)), null, 41, null));
                                    }
                                    arrayList = arrayList3;
                                } else {
                                    arrayList = null;
                                }
                                arrayList2.add(ModelOption.m353copyZEIUhPU$default(modelOption, null, null, _serverlocalizedstring, null, null, null, arrayList, null, _serverlocalizedstring2, null, null, null, 3771, null));
                            }
                        }
                        return arrayList2;
                    case 10:
                        List list3 = (List) okcVar.i.getValue();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj : list3) {
                            if (!x44.r(((ModelOption) obj).getInactive(), Boolean.TRUE)) {
                                arrayList4.add(obj);
                            }
                        }
                        return arrayList4;
                    case 11:
                        wz5 wz5Var = okcVar.j;
                        ModelSelectorSurface.Companion.getClass();
                        ModelSelectorConfig modelSelectorConfigF = okcVar.f(ModelSelectorSurface.CHAT);
                        if (modelSelectorConfigF != null && (models = modelSelectorConfigF.getModels()) != null) {
                            List<ModelSelectorEntry> list4 = models.isEmpty() ? null : models;
                            if (list4 != null) {
                                Set setF0 = bnf.f0(bnf.b0(bnf.V(new c54(0, list4), new kac(12)), be5.b0));
                                List list5 = (List) wz5Var.getValue();
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj2 : list5) {
                                    if (setF0.contains(ModelId.m1058boximpl(((ModelOption) obj2).m356getModeli4oh0I()))) {
                                        arrayList5.add(obj2);
                                    }
                                }
                                return arrayList5;
                            }
                        }
                        return (List) wz5Var.getValue();
                    case 12:
                        AvailableModelsConfig availableModelsConfig = (AvailableModelsConfig) okcVar.b.g("claude_ai_available_models", AvailableModelsConfig.Companion.serializer()).getValue();
                        if (availableModelsConfig == null || (models2 = availableModelsConfig.getModels()) == null) {
                            linkedHashMap = nm6.E;
                        } else {
                            List<AvailableModelsConfig.AvailableModel> list6 = models2;
                            int iD0 = tta.d0(x44.y(list6, 10));
                            if (iD0 < 16) {
                                iD0 = 16;
                            }
                            linkedHashMap = new LinkedHashMap(iD0);
                            for (Object obj3 : list6) {
                                linkedHashMap.put(ModelId.m1058boximpl(((AvailableModelsConfig.AvailableModel) obj3).m776getModel_idi4oh0I()), obj3);
                            }
                        }
                        List list7 = (List) okcVar.i.getValue();
                        int iD02 = tta.d0(x44.y(list7, 10));
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iD02 >= 16 ? iD02 : 16);
                        Iterator it = list7.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            pvg minimumTier = pvg.PRO;
                            if (!zHasNext) {
                                int iOrdinal = eve.C(okcVar.e()).ordinal();
                                pvg pvgVar = pvg.MAX;
                                if (iOrdinal == 0) {
                                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                                        if (((pvg) entry.getValue()) != pvg.FREE) {
                                            linkedHashMap3.put(entry.getKey(), entry.getValue());
                                        }
                                    }
                                    arrayList2 = new ArrayList();
                                    for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                                        ModelOption modelOption2 = (ModelOption) entry2.getKey();
                                        pvg pvgVar2 = (pvg) entry2.getValue();
                                        int i42 = pvgVar2 == null ? -1 : mkc.a[pvgVar2.ordinal()];
                                        cqb cqbVar = i42 != 1 ? i42 != 2 ? null : new cqb(modelOption2.m356getModeli4oh0I(), minimumTier) : new cqb(modelOption2.m356getModeli4oh0I(), pvgVar);
                                        if (cqbVar != null) {
                                            arrayList2.add(cqbVar);
                                        }
                                    }
                                } else if (iOrdinal == 1) {
                                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                                        if (((pvg) entry3.getValue()) == pvgVar) {
                                            linkedHashMap4.put(entry3.getKey(), entry3.getValue());
                                        }
                                    }
                                    arrayList2 = new ArrayList(linkedHashMap4.size());
                                    for (Map.Entry entry4 : linkedHashMap4.entrySet()) {
                                        ModelOption modelOption3 = (ModelOption) entry4.getKey();
                                        arrayList2.add(new cqb(modelOption3.m356getModeli4oh0I(), pvgVar));
                                    }
                                }
                                ArrayList arrayList6 = new ArrayList();
                                for (Object obj4 : (Iterable) arrayList2) {
                                    String strA = ((cqb) obj4).a();
                                    String strB = okcVar.b();
                                    if (!(strB == null ? false : ModelId.m1061equalsimpl0(strA, strB))) {
                                        arrayList6.add(obj4);
                                    }
                                }
                                return w44.t1(arrayList6);
                            }
                            Object next = it.next();
                            AvailableModelsConfig.AvailableModel availableModel = (AvailableModelsConfig.AvailableModel) linkedHashMap.get(ModelId.m1058boximpl(((ModelOption) next).m356getModeli4oh0I()));
                            if (availableModel != null) {
                                minimumTier = availableModel.getMinimumTier();
                            }
                            linkedHashMap2.put(next, minimumTier);
                        }
                        break;
                    default:
                        StickySelectionConfig stickySelectionConfig = (StickySelectionConfig) okcVar.b.g("mobile_sticky_selection_config", StickySelectionConfig.Companion.serializer()).getValue();
                        return stickySelectionConfig == null ? new StickySelectionConfig((StickyConfig) null, 1, (mq5) null) : stickySelectionConfig;
                }
            }
        });
        final int i11 = 5;
        this.v = mpk.w(new zy7(this) { // from class: lkc
            public final /* synthetic */ okc F;

            {
                this.F = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v0, types: [lm6] */
            /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v13 */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v22, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v12 */
            /* JADX WARN: Type inference failed for: r5v13 */
            /* JADX WARN: Type inference failed for: r5v14 */
            /* JADX WARN: Type inference failed for: r5v15 */
            /* JADX WARN: Type inference failed for: r5v16 */
            /* JADX WARN: Type inference failed for: r5v17 */
            @Override // defpackage.zy7
            public final Object a() {
                ArrayList arrayList;
                String english;
                String english2;
                String english3;
                List<ModelSelectorEntry> models;
                Map linkedHashMap;
                List<AvailableModelsConfig.AvailableModel> models2;
                int i22 = i11;
                int i32 = 3;
                ?? arrayList2 = lm6.E;
                ?? r5 = 0;
                ?? r52 = 0;
                ?? r53 = 0;
                okc okcVar = this.F;
                switch (i22) {
                    case 0:
                        for (Membership membership : okcVar.c.a().getMemberships()) {
                            if (OrganizationId.m1068equalsimpl0(membership.getOrganization().m116getUuidXjkXN6I(), okcVar.a)) {
                                return membership.getOrganization();
                            }
                        }
                        pmf.h("Collection contains no element matching the predicate.");
                        return null;
                    case 1:
                        StickyConfig model_selector = ((StickySelectionConfig) okcVar.n.getValue()).getModel_selector();
                        return Boolean.valueOf(model_selector != null ? model_selector.getEnabled() : false);
                    case 2:
                        rc8 rc8Var2 = okcVar.b;
                        if (rc8Var2.b() && !((Boolean) rc8Var2.m("mobile_show_affirmative_consent_for_privacy_policy").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 3:
                        rc8 rc8Var3 = okcVar.b;
                        if (rc8Var3.b() && !((Boolean) rc8Var3.m("mobile_show_affirmative_consent").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 4:
                        rc8 rc8Var4 = okcVar.b;
                        if (rc8Var4.b() && !((Boolean) rc8Var4.m("mobile_use_birthday_for_age_verification").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 5:
                        rc8 rc8Var5 = okcVar.b;
                        return Boolean.valueOf(rc8Var5.b() && ((Boolean) rc8Var5.m("mobile_delay_age_verification").getValue()).booleanValue());
                    case 6:
                        return ajk.m((Map) okcVar.b.f("supported_regions", new f7a(srg.a, RegionSupport.Companion.serializer())).getValue());
                    case 7:
                        rc8 rc8Var6 = okcVar.b;
                        return Boolean.valueOf(rc8Var6.b() && ((Boolean) rc8Var6.m("claude_ai_ember").getValue()).booleanValue());
                    case 8:
                        ModelFallbacksConfig modelFallbacksConfig = (ModelFallbacksConfig) okcVar.b.g("holdup", ModelFallbacksConfig.Companion.serializer()).getValue();
                        return modelFallbacksConfig == null ? new ModelFallbacksConfig((Map) (r53 == true ? 1 : 0), (Map) (r52 == true ? 1 : 0), i32, (mq5) (r5 == true ? 1 : 0)) : modelFallbacksConfig;
                    case 9:
                        Organization organizationE = okcVar.e();
                        lea leaVar2 = okcVar.d;
                        List<ModelOption> claude_ai_bootstrap_models_config = organizationE.getClaude_ai_bootstrap_models_config();
                        if (claude_ai_bootstrap_models_config == null) {
                            ij0.y("Organization is missing claude_ai_bootstrap_models_config", null, false, 3);
                        } else {
                            List<ModelOption> list = claude_ai_bootstrap_models_config;
                            arrayList2 = new ArrayList(x44.y(list, 10));
                            for (ModelOption modelOption : list) {
                                _ServerLocalizedString description = modelOption.getDescription();
                                _ServerLocalizedString _serverlocalizedstring = (description == null || (english3 = description.getEnglish()) == null) ? null : new _ServerLocalizedString(english3, leaVar2.b(english3));
                                _ServerLocalizedString notice_text = modelOption.getNotice_text();
                                _ServerLocalizedString _serverlocalizedstring2 = (notice_text == null || (english2 = notice_text.getEnglish()) == null) ? null : new _ServerLocalizedString(english2, leaVar2.b(english2));
                                List<ThinkingModeOption> thinking_modes = modelOption.getThinking_modes();
                                if (thinking_modes != null) {
                                    List<ThinkingModeOption> list2 = thinking_modes;
                                    ArrayList arrayList3 = new ArrayList(x44.y(list2, 10));
                                    for (ThinkingModeOption thinkingModeOption : list2) {
                                        String english4 = thinkingModeOption.getTitle().getEnglish();
                                        _ServerLocalizedString _serverlocalizedstring3 = new _ServerLocalizedString(english4, leaVar2.b(english4));
                                        String english5 = thinkingModeOption.getDescription().getEnglish();
                                        _ServerLocalizedString _serverlocalizedstring4 = new _ServerLocalizedString(english5, leaVar2.b(english5));
                                        _ServerLocalizedString selection_title = thinkingModeOption.getSelection_title();
                                        arrayList3.add(ThinkingModeOption.m383copy3WgSuLE$default(thinkingModeOption, null, _serverlocalizedstring3, _serverlocalizedstring4, null, (selection_title == null || (english = selection_title.getEnglish()) == null) ? null : new _ServerLocalizedString(english, leaVar2.b(english)), null, 41, null));
                                    }
                                    arrayList = arrayList3;
                                } else {
                                    arrayList = null;
                                }
                                arrayList2.add(ModelOption.m353copyZEIUhPU$default(modelOption, null, null, _serverlocalizedstring, null, null, null, arrayList, null, _serverlocalizedstring2, null, null, null, 3771, null));
                            }
                        }
                        return arrayList2;
                    case 10:
                        List list3 = (List) okcVar.i.getValue();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj : list3) {
                            if (!x44.r(((ModelOption) obj).getInactive(), Boolean.TRUE)) {
                                arrayList4.add(obj);
                            }
                        }
                        return arrayList4;
                    case 11:
                        wz5 wz5Var = okcVar.j;
                        ModelSelectorSurface.Companion.getClass();
                        ModelSelectorConfig modelSelectorConfigF = okcVar.f(ModelSelectorSurface.CHAT);
                        if (modelSelectorConfigF != null && (models = modelSelectorConfigF.getModels()) != null) {
                            List<ModelSelectorEntry> list4 = models.isEmpty() ? null : models;
                            if (list4 != null) {
                                Set setF0 = bnf.f0(bnf.b0(bnf.V(new c54(0, list4), new kac(12)), be5.b0));
                                List list5 = (List) wz5Var.getValue();
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj2 : list5) {
                                    if (setF0.contains(ModelId.m1058boximpl(((ModelOption) obj2).m356getModeli4oh0I()))) {
                                        arrayList5.add(obj2);
                                    }
                                }
                                return arrayList5;
                            }
                        }
                        return (List) wz5Var.getValue();
                    case 12:
                        AvailableModelsConfig availableModelsConfig = (AvailableModelsConfig) okcVar.b.g("claude_ai_available_models", AvailableModelsConfig.Companion.serializer()).getValue();
                        if (availableModelsConfig == null || (models2 = availableModelsConfig.getModels()) == null) {
                            linkedHashMap = nm6.E;
                        } else {
                            List<AvailableModelsConfig.AvailableModel> list6 = models2;
                            int iD0 = tta.d0(x44.y(list6, 10));
                            if (iD0 < 16) {
                                iD0 = 16;
                            }
                            linkedHashMap = new LinkedHashMap(iD0);
                            for (Object obj3 : list6) {
                                linkedHashMap.put(ModelId.m1058boximpl(((AvailableModelsConfig.AvailableModel) obj3).m776getModel_idi4oh0I()), obj3);
                            }
                        }
                        List list7 = (List) okcVar.i.getValue();
                        int iD02 = tta.d0(x44.y(list7, 10));
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iD02 >= 16 ? iD02 : 16);
                        Iterator it = list7.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            pvg minimumTier = pvg.PRO;
                            if (!zHasNext) {
                                int iOrdinal = eve.C(okcVar.e()).ordinal();
                                pvg pvgVar = pvg.MAX;
                                if (iOrdinal == 0) {
                                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                                        if (((pvg) entry.getValue()) != pvg.FREE) {
                                            linkedHashMap3.put(entry.getKey(), entry.getValue());
                                        }
                                    }
                                    arrayList2 = new ArrayList();
                                    for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                                        ModelOption modelOption2 = (ModelOption) entry2.getKey();
                                        pvg pvgVar2 = (pvg) entry2.getValue();
                                        int i42 = pvgVar2 == null ? -1 : mkc.a[pvgVar2.ordinal()];
                                        cqb cqbVar = i42 != 1 ? i42 != 2 ? null : new cqb(modelOption2.m356getModeli4oh0I(), minimumTier) : new cqb(modelOption2.m356getModeli4oh0I(), pvgVar);
                                        if (cqbVar != null) {
                                            arrayList2.add(cqbVar);
                                        }
                                    }
                                } else if (iOrdinal == 1) {
                                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                                        if (((pvg) entry3.getValue()) == pvgVar) {
                                            linkedHashMap4.put(entry3.getKey(), entry3.getValue());
                                        }
                                    }
                                    arrayList2 = new ArrayList(linkedHashMap4.size());
                                    for (Map.Entry entry4 : linkedHashMap4.entrySet()) {
                                        ModelOption modelOption3 = (ModelOption) entry4.getKey();
                                        arrayList2.add(new cqb(modelOption3.m356getModeli4oh0I(), pvgVar));
                                    }
                                }
                                ArrayList arrayList6 = new ArrayList();
                                for (Object obj4 : (Iterable) arrayList2) {
                                    String strA = ((cqb) obj4).a();
                                    String strB = okcVar.b();
                                    if (!(strB == null ? false : ModelId.m1061equalsimpl0(strA, strB))) {
                                        arrayList6.add(obj4);
                                    }
                                }
                                return w44.t1(arrayList6);
                            }
                            Object next = it.next();
                            AvailableModelsConfig.AvailableModel availableModel = (AvailableModelsConfig.AvailableModel) linkedHashMap.get(ModelId.m1058boximpl(((ModelOption) next).m356getModeli4oh0I()));
                            if (availableModel != null) {
                                minimumTier = availableModel.getMinimumTier();
                            }
                            linkedHashMap2.put(next, minimumTier);
                        }
                        break;
                    default:
                        StickySelectionConfig stickySelectionConfig = (StickySelectionConfig) okcVar.b.g("mobile_sticky_selection_config", StickySelectionConfig.Companion.serializer()).getValue();
                        return stickySelectionConfig == null ? new StickySelectionConfig((StickyConfig) null, 1, (mq5) null) : stickySelectionConfig;
                }
            }
        });
        final int i12 = 6;
        this.w = mpk.x(new zy7(this) { // from class: lkc
            public final /* synthetic */ okc F;

            {
                this.F = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v0, types: [lm6] */
            /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v13 */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v22, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v12 */
            /* JADX WARN: Type inference failed for: r5v13 */
            /* JADX WARN: Type inference failed for: r5v14 */
            /* JADX WARN: Type inference failed for: r5v15 */
            /* JADX WARN: Type inference failed for: r5v16 */
            /* JADX WARN: Type inference failed for: r5v17 */
            @Override // defpackage.zy7
            public final Object a() {
                ArrayList arrayList;
                String english;
                String english2;
                String english3;
                List<ModelSelectorEntry> models;
                Map linkedHashMap;
                List<AvailableModelsConfig.AvailableModel> models2;
                int i22 = i12;
                int i32 = 3;
                ?? arrayList2 = lm6.E;
                ?? r5 = 0;
                ?? r52 = 0;
                ?? r53 = 0;
                okc okcVar = this.F;
                switch (i22) {
                    case 0:
                        for (Membership membership : okcVar.c.a().getMemberships()) {
                            if (OrganizationId.m1068equalsimpl0(membership.getOrganization().m116getUuidXjkXN6I(), okcVar.a)) {
                                return membership.getOrganization();
                            }
                        }
                        pmf.h("Collection contains no element matching the predicate.");
                        return null;
                    case 1:
                        StickyConfig model_selector = ((StickySelectionConfig) okcVar.n.getValue()).getModel_selector();
                        return Boolean.valueOf(model_selector != null ? model_selector.getEnabled() : false);
                    case 2:
                        rc8 rc8Var2 = okcVar.b;
                        if (rc8Var2.b() && !((Boolean) rc8Var2.m("mobile_show_affirmative_consent_for_privacy_policy").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 3:
                        rc8 rc8Var3 = okcVar.b;
                        if (rc8Var3.b() && !((Boolean) rc8Var3.m("mobile_show_affirmative_consent").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 4:
                        rc8 rc8Var4 = okcVar.b;
                        if (rc8Var4.b() && !((Boolean) rc8Var4.m("mobile_use_birthday_for_age_verification").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 5:
                        rc8 rc8Var5 = okcVar.b;
                        return Boolean.valueOf(rc8Var5.b() && ((Boolean) rc8Var5.m("mobile_delay_age_verification").getValue()).booleanValue());
                    case 6:
                        return ajk.m((Map) okcVar.b.f("supported_regions", new f7a(srg.a, RegionSupport.Companion.serializer())).getValue());
                    case 7:
                        rc8 rc8Var6 = okcVar.b;
                        return Boolean.valueOf(rc8Var6.b() && ((Boolean) rc8Var6.m("claude_ai_ember").getValue()).booleanValue());
                    case 8:
                        ModelFallbacksConfig modelFallbacksConfig = (ModelFallbacksConfig) okcVar.b.g("holdup", ModelFallbacksConfig.Companion.serializer()).getValue();
                        return modelFallbacksConfig == null ? new ModelFallbacksConfig((Map) (r53 == true ? 1 : 0), (Map) (r52 == true ? 1 : 0), i32, (mq5) (r5 == true ? 1 : 0)) : modelFallbacksConfig;
                    case 9:
                        Organization organizationE = okcVar.e();
                        lea leaVar2 = okcVar.d;
                        List<ModelOption> claude_ai_bootstrap_models_config = organizationE.getClaude_ai_bootstrap_models_config();
                        if (claude_ai_bootstrap_models_config == null) {
                            ij0.y("Organization is missing claude_ai_bootstrap_models_config", null, false, 3);
                        } else {
                            List<ModelOption> list = claude_ai_bootstrap_models_config;
                            arrayList2 = new ArrayList(x44.y(list, 10));
                            for (ModelOption modelOption : list) {
                                _ServerLocalizedString description = modelOption.getDescription();
                                _ServerLocalizedString _serverlocalizedstring = (description == null || (english3 = description.getEnglish()) == null) ? null : new _ServerLocalizedString(english3, leaVar2.b(english3));
                                _ServerLocalizedString notice_text = modelOption.getNotice_text();
                                _ServerLocalizedString _serverlocalizedstring2 = (notice_text == null || (english2 = notice_text.getEnglish()) == null) ? null : new _ServerLocalizedString(english2, leaVar2.b(english2));
                                List<ThinkingModeOption> thinking_modes = modelOption.getThinking_modes();
                                if (thinking_modes != null) {
                                    List<ThinkingModeOption> list2 = thinking_modes;
                                    ArrayList arrayList3 = new ArrayList(x44.y(list2, 10));
                                    for (ThinkingModeOption thinkingModeOption : list2) {
                                        String english4 = thinkingModeOption.getTitle().getEnglish();
                                        _ServerLocalizedString _serverlocalizedstring3 = new _ServerLocalizedString(english4, leaVar2.b(english4));
                                        String english5 = thinkingModeOption.getDescription().getEnglish();
                                        _ServerLocalizedString _serverlocalizedstring4 = new _ServerLocalizedString(english5, leaVar2.b(english5));
                                        _ServerLocalizedString selection_title = thinkingModeOption.getSelection_title();
                                        arrayList3.add(ThinkingModeOption.m383copy3WgSuLE$default(thinkingModeOption, null, _serverlocalizedstring3, _serverlocalizedstring4, null, (selection_title == null || (english = selection_title.getEnglish()) == null) ? null : new _ServerLocalizedString(english, leaVar2.b(english)), null, 41, null));
                                    }
                                    arrayList = arrayList3;
                                } else {
                                    arrayList = null;
                                }
                                arrayList2.add(ModelOption.m353copyZEIUhPU$default(modelOption, null, null, _serverlocalizedstring, null, null, null, arrayList, null, _serverlocalizedstring2, null, null, null, 3771, null));
                            }
                        }
                        return arrayList2;
                    case 10:
                        List list3 = (List) okcVar.i.getValue();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj : list3) {
                            if (!x44.r(((ModelOption) obj).getInactive(), Boolean.TRUE)) {
                                arrayList4.add(obj);
                            }
                        }
                        return arrayList4;
                    case 11:
                        wz5 wz5Var = okcVar.j;
                        ModelSelectorSurface.Companion.getClass();
                        ModelSelectorConfig modelSelectorConfigF = okcVar.f(ModelSelectorSurface.CHAT);
                        if (modelSelectorConfigF != null && (models = modelSelectorConfigF.getModels()) != null) {
                            List<ModelSelectorEntry> list4 = models.isEmpty() ? null : models;
                            if (list4 != null) {
                                Set setF0 = bnf.f0(bnf.b0(bnf.V(new c54(0, list4), new kac(12)), be5.b0));
                                List list5 = (List) wz5Var.getValue();
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj2 : list5) {
                                    if (setF0.contains(ModelId.m1058boximpl(((ModelOption) obj2).m356getModeli4oh0I()))) {
                                        arrayList5.add(obj2);
                                    }
                                }
                                return arrayList5;
                            }
                        }
                        return (List) wz5Var.getValue();
                    case 12:
                        AvailableModelsConfig availableModelsConfig = (AvailableModelsConfig) okcVar.b.g("claude_ai_available_models", AvailableModelsConfig.Companion.serializer()).getValue();
                        if (availableModelsConfig == null || (models2 = availableModelsConfig.getModels()) == null) {
                            linkedHashMap = nm6.E;
                        } else {
                            List<AvailableModelsConfig.AvailableModel> list6 = models2;
                            int iD0 = tta.d0(x44.y(list6, 10));
                            if (iD0 < 16) {
                                iD0 = 16;
                            }
                            linkedHashMap = new LinkedHashMap(iD0);
                            for (Object obj3 : list6) {
                                linkedHashMap.put(ModelId.m1058boximpl(((AvailableModelsConfig.AvailableModel) obj3).m776getModel_idi4oh0I()), obj3);
                            }
                        }
                        List list7 = (List) okcVar.i.getValue();
                        int iD02 = tta.d0(x44.y(list7, 10));
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iD02 >= 16 ? iD02 : 16);
                        Iterator it = list7.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            pvg minimumTier = pvg.PRO;
                            if (!zHasNext) {
                                int iOrdinal = eve.C(okcVar.e()).ordinal();
                                pvg pvgVar = pvg.MAX;
                                if (iOrdinal == 0) {
                                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                                        if (((pvg) entry.getValue()) != pvg.FREE) {
                                            linkedHashMap3.put(entry.getKey(), entry.getValue());
                                        }
                                    }
                                    arrayList2 = new ArrayList();
                                    for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                                        ModelOption modelOption2 = (ModelOption) entry2.getKey();
                                        pvg pvgVar2 = (pvg) entry2.getValue();
                                        int i42 = pvgVar2 == null ? -1 : mkc.a[pvgVar2.ordinal()];
                                        cqb cqbVar = i42 != 1 ? i42 != 2 ? null : new cqb(modelOption2.m356getModeli4oh0I(), minimumTier) : new cqb(modelOption2.m356getModeli4oh0I(), pvgVar);
                                        if (cqbVar != null) {
                                            arrayList2.add(cqbVar);
                                        }
                                    }
                                } else if (iOrdinal == 1) {
                                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                                        if (((pvg) entry3.getValue()) == pvgVar) {
                                            linkedHashMap4.put(entry3.getKey(), entry3.getValue());
                                        }
                                    }
                                    arrayList2 = new ArrayList(linkedHashMap4.size());
                                    for (Map.Entry entry4 : linkedHashMap4.entrySet()) {
                                        ModelOption modelOption3 = (ModelOption) entry4.getKey();
                                        arrayList2.add(new cqb(modelOption3.m356getModeli4oh0I(), pvgVar));
                                    }
                                }
                                ArrayList arrayList6 = new ArrayList();
                                for (Object obj4 : (Iterable) arrayList2) {
                                    String strA = ((cqb) obj4).a();
                                    String strB = okcVar.b();
                                    if (!(strB == null ? false : ModelId.m1061equalsimpl0(strA, strB))) {
                                        arrayList6.add(obj4);
                                    }
                                }
                                return w44.t1(arrayList6);
                            }
                            Object next = it.next();
                            AvailableModelsConfig.AvailableModel availableModel = (AvailableModelsConfig.AvailableModel) linkedHashMap.get(ModelId.m1058boximpl(((ModelOption) next).m356getModeli4oh0I()));
                            if (availableModel != null) {
                                minimumTier = availableModel.getMinimumTier();
                            }
                            linkedHashMap2.put(next, minimumTier);
                        }
                        break;
                    default:
                        StickySelectionConfig stickySelectionConfig = (StickySelectionConfig) okcVar.b.g("mobile_sticky_selection_config", StickySelectionConfig.Companion.serializer()).getValue();
                        return stickySelectionConfig == null ? new StickySelectionConfig((StickyConfig) null, 1, (mq5) null) : stickySelectionConfig;
                }
            }
        }, a5Var);
        final int i13 = 7;
        this.x = mpk.w(new zy7(this) { // from class: lkc
            public final /* synthetic */ okc F;

            {
                this.F = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v0, types: [lm6] */
            /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v13 */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v22, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v12 */
            /* JADX WARN: Type inference failed for: r5v13 */
            /* JADX WARN: Type inference failed for: r5v14 */
            /* JADX WARN: Type inference failed for: r5v15 */
            /* JADX WARN: Type inference failed for: r5v16 */
            /* JADX WARN: Type inference failed for: r5v17 */
            @Override // defpackage.zy7
            public final Object a() {
                ArrayList arrayList;
                String english;
                String english2;
                String english3;
                List<ModelSelectorEntry> models;
                Map linkedHashMap;
                List<AvailableModelsConfig.AvailableModel> models2;
                int i22 = i13;
                int i32 = 3;
                ?? arrayList2 = lm6.E;
                ?? r5 = 0;
                ?? r52 = 0;
                ?? r53 = 0;
                okc okcVar = this.F;
                switch (i22) {
                    case 0:
                        for (Membership membership : okcVar.c.a().getMemberships()) {
                            if (OrganizationId.m1068equalsimpl0(membership.getOrganization().m116getUuidXjkXN6I(), okcVar.a)) {
                                return membership.getOrganization();
                            }
                        }
                        pmf.h("Collection contains no element matching the predicate.");
                        return null;
                    case 1:
                        StickyConfig model_selector = ((StickySelectionConfig) okcVar.n.getValue()).getModel_selector();
                        return Boolean.valueOf(model_selector != null ? model_selector.getEnabled() : false);
                    case 2:
                        rc8 rc8Var2 = okcVar.b;
                        if (rc8Var2.b() && !((Boolean) rc8Var2.m("mobile_show_affirmative_consent_for_privacy_policy").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 3:
                        rc8 rc8Var3 = okcVar.b;
                        if (rc8Var3.b() && !((Boolean) rc8Var3.m("mobile_show_affirmative_consent").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 4:
                        rc8 rc8Var4 = okcVar.b;
                        if (rc8Var4.b() && !((Boolean) rc8Var4.m("mobile_use_birthday_for_age_verification").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 5:
                        rc8 rc8Var5 = okcVar.b;
                        return Boolean.valueOf(rc8Var5.b() && ((Boolean) rc8Var5.m("mobile_delay_age_verification").getValue()).booleanValue());
                    case 6:
                        return ajk.m((Map) okcVar.b.f("supported_regions", new f7a(srg.a, RegionSupport.Companion.serializer())).getValue());
                    case 7:
                        rc8 rc8Var6 = okcVar.b;
                        return Boolean.valueOf(rc8Var6.b() && ((Boolean) rc8Var6.m("claude_ai_ember").getValue()).booleanValue());
                    case 8:
                        ModelFallbacksConfig modelFallbacksConfig = (ModelFallbacksConfig) okcVar.b.g("holdup", ModelFallbacksConfig.Companion.serializer()).getValue();
                        return modelFallbacksConfig == null ? new ModelFallbacksConfig((Map) (r53 == true ? 1 : 0), (Map) (r52 == true ? 1 : 0), i32, (mq5) (r5 == true ? 1 : 0)) : modelFallbacksConfig;
                    case 9:
                        Organization organizationE = okcVar.e();
                        lea leaVar2 = okcVar.d;
                        List<ModelOption> claude_ai_bootstrap_models_config = organizationE.getClaude_ai_bootstrap_models_config();
                        if (claude_ai_bootstrap_models_config == null) {
                            ij0.y("Organization is missing claude_ai_bootstrap_models_config", null, false, 3);
                        } else {
                            List<ModelOption> list = claude_ai_bootstrap_models_config;
                            arrayList2 = new ArrayList(x44.y(list, 10));
                            for (ModelOption modelOption : list) {
                                _ServerLocalizedString description = modelOption.getDescription();
                                _ServerLocalizedString _serverlocalizedstring = (description == null || (english3 = description.getEnglish()) == null) ? null : new _ServerLocalizedString(english3, leaVar2.b(english3));
                                _ServerLocalizedString notice_text = modelOption.getNotice_text();
                                _ServerLocalizedString _serverlocalizedstring2 = (notice_text == null || (english2 = notice_text.getEnglish()) == null) ? null : new _ServerLocalizedString(english2, leaVar2.b(english2));
                                List<ThinkingModeOption> thinking_modes = modelOption.getThinking_modes();
                                if (thinking_modes != null) {
                                    List<ThinkingModeOption> list2 = thinking_modes;
                                    ArrayList arrayList3 = new ArrayList(x44.y(list2, 10));
                                    for (ThinkingModeOption thinkingModeOption : list2) {
                                        String english4 = thinkingModeOption.getTitle().getEnglish();
                                        _ServerLocalizedString _serverlocalizedstring3 = new _ServerLocalizedString(english4, leaVar2.b(english4));
                                        String english5 = thinkingModeOption.getDescription().getEnglish();
                                        _ServerLocalizedString _serverlocalizedstring4 = new _ServerLocalizedString(english5, leaVar2.b(english5));
                                        _ServerLocalizedString selection_title = thinkingModeOption.getSelection_title();
                                        arrayList3.add(ThinkingModeOption.m383copy3WgSuLE$default(thinkingModeOption, null, _serverlocalizedstring3, _serverlocalizedstring4, null, (selection_title == null || (english = selection_title.getEnglish()) == null) ? null : new _ServerLocalizedString(english, leaVar2.b(english)), null, 41, null));
                                    }
                                    arrayList = arrayList3;
                                } else {
                                    arrayList = null;
                                }
                                arrayList2.add(ModelOption.m353copyZEIUhPU$default(modelOption, null, null, _serverlocalizedstring, null, null, null, arrayList, null, _serverlocalizedstring2, null, null, null, 3771, null));
                            }
                        }
                        return arrayList2;
                    case 10:
                        List list3 = (List) okcVar.i.getValue();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj : list3) {
                            if (!x44.r(((ModelOption) obj).getInactive(), Boolean.TRUE)) {
                                arrayList4.add(obj);
                            }
                        }
                        return arrayList4;
                    case 11:
                        wz5 wz5Var = okcVar.j;
                        ModelSelectorSurface.Companion.getClass();
                        ModelSelectorConfig modelSelectorConfigF = okcVar.f(ModelSelectorSurface.CHAT);
                        if (modelSelectorConfigF != null && (models = modelSelectorConfigF.getModels()) != null) {
                            List<ModelSelectorEntry> list4 = models.isEmpty() ? null : models;
                            if (list4 != null) {
                                Set setF0 = bnf.f0(bnf.b0(bnf.V(new c54(0, list4), new kac(12)), be5.b0));
                                List list5 = (List) wz5Var.getValue();
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj2 : list5) {
                                    if (setF0.contains(ModelId.m1058boximpl(((ModelOption) obj2).m356getModeli4oh0I()))) {
                                        arrayList5.add(obj2);
                                    }
                                }
                                return arrayList5;
                            }
                        }
                        return (List) wz5Var.getValue();
                    case 12:
                        AvailableModelsConfig availableModelsConfig = (AvailableModelsConfig) okcVar.b.g("claude_ai_available_models", AvailableModelsConfig.Companion.serializer()).getValue();
                        if (availableModelsConfig == null || (models2 = availableModelsConfig.getModels()) == null) {
                            linkedHashMap = nm6.E;
                        } else {
                            List<AvailableModelsConfig.AvailableModel> list6 = models2;
                            int iD0 = tta.d0(x44.y(list6, 10));
                            if (iD0 < 16) {
                                iD0 = 16;
                            }
                            linkedHashMap = new LinkedHashMap(iD0);
                            for (Object obj3 : list6) {
                                linkedHashMap.put(ModelId.m1058boximpl(((AvailableModelsConfig.AvailableModel) obj3).m776getModel_idi4oh0I()), obj3);
                            }
                        }
                        List list7 = (List) okcVar.i.getValue();
                        int iD02 = tta.d0(x44.y(list7, 10));
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iD02 >= 16 ? iD02 : 16);
                        Iterator it = list7.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            pvg minimumTier = pvg.PRO;
                            if (!zHasNext) {
                                int iOrdinal = eve.C(okcVar.e()).ordinal();
                                pvg pvgVar = pvg.MAX;
                                if (iOrdinal == 0) {
                                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                                        if (((pvg) entry.getValue()) != pvg.FREE) {
                                            linkedHashMap3.put(entry.getKey(), entry.getValue());
                                        }
                                    }
                                    arrayList2 = new ArrayList();
                                    for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                                        ModelOption modelOption2 = (ModelOption) entry2.getKey();
                                        pvg pvgVar2 = (pvg) entry2.getValue();
                                        int i42 = pvgVar2 == null ? -1 : mkc.a[pvgVar2.ordinal()];
                                        cqb cqbVar = i42 != 1 ? i42 != 2 ? null : new cqb(modelOption2.m356getModeli4oh0I(), minimumTier) : new cqb(modelOption2.m356getModeli4oh0I(), pvgVar);
                                        if (cqbVar != null) {
                                            arrayList2.add(cqbVar);
                                        }
                                    }
                                } else if (iOrdinal == 1) {
                                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                                        if (((pvg) entry3.getValue()) == pvgVar) {
                                            linkedHashMap4.put(entry3.getKey(), entry3.getValue());
                                        }
                                    }
                                    arrayList2 = new ArrayList(linkedHashMap4.size());
                                    for (Map.Entry entry4 : linkedHashMap4.entrySet()) {
                                        ModelOption modelOption3 = (ModelOption) entry4.getKey();
                                        arrayList2.add(new cqb(modelOption3.m356getModeli4oh0I(), pvgVar));
                                    }
                                }
                                ArrayList arrayList6 = new ArrayList();
                                for (Object obj4 : (Iterable) arrayList2) {
                                    String strA = ((cqb) obj4).a();
                                    String strB = okcVar.b();
                                    if (!(strB == null ? false : ModelId.m1061equalsimpl0(strA, strB))) {
                                        arrayList6.add(obj4);
                                    }
                                }
                                return w44.t1(arrayList6);
                            }
                            Object next = it.next();
                            AvailableModelsConfig.AvailableModel availableModel = (AvailableModelsConfig.AvailableModel) linkedHashMap.get(ModelId.m1058boximpl(((ModelOption) next).m356getModeli4oh0I()));
                            if (availableModel != null) {
                                minimumTier = availableModel.getMinimumTier();
                            }
                            linkedHashMap2.put(next, minimumTier);
                        }
                        break;
                    default:
                        StickySelectionConfig stickySelectionConfig = (StickySelectionConfig) okcVar.b.g("mobile_sticky_selection_config", StickySelectionConfig.Companion.serializer()).getValue();
                        return stickySelectionConfig == null ? new StickySelectionConfig((StickyConfig) null, 1, (mq5) null) : stickySelectionConfig;
                }
            }
        });
        final int i14 = 8;
        this.y = mpk.w(new zy7(this) { // from class: lkc
            public final /* synthetic */ okc F;

            {
                this.F = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v0, types: [lm6] */
            /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v13 */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v22, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v12 */
            /* JADX WARN: Type inference failed for: r5v13 */
            /* JADX WARN: Type inference failed for: r5v14 */
            /* JADX WARN: Type inference failed for: r5v15 */
            /* JADX WARN: Type inference failed for: r5v16 */
            /* JADX WARN: Type inference failed for: r5v17 */
            @Override // defpackage.zy7
            public final Object a() {
                ArrayList arrayList;
                String english;
                String english2;
                String english3;
                List<ModelSelectorEntry> models;
                Map linkedHashMap;
                List<AvailableModelsConfig.AvailableModel> models2;
                int i22 = i14;
                int i32 = 3;
                ?? arrayList2 = lm6.E;
                ?? r5 = 0;
                ?? r52 = 0;
                ?? r53 = 0;
                okc okcVar = this.F;
                switch (i22) {
                    case 0:
                        for (Membership membership : okcVar.c.a().getMemberships()) {
                            if (OrganizationId.m1068equalsimpl0(membership.getOrganization().m116getUuidXjkXN6I(), okcVar.a)) {
                                return membership.getOrganization();
                            }
                        }
                        pmf.h("Collection contains no element matching the predicate.");
                        return null;
                    case 1:
                        StickyConfig model_selector = ((StickySelectionConfig) okcVar.n.getValue()).getModel_selector();
                        return Boolean.valueOf(model_selector != null ? model_selector.getEnabled() : false);
                    case 2:
                        rc8 rc8Var2 = okcVar.b;
                        if (rc8Var2.b() && !((Boolean) rc8Var2.m("mobile_show_affirmative_consent_for_privacy_policy").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 3:
                        rc8 rc8Var3 = okcVar.b;
                        if (rc8Var3.b() && !((Boolean) rc8Var3.m("mobile_show_affirmative_consent").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 4:
                        rc8 rc8Var4 = okcVar.b;
                        if (rc8Var4.b() && !((Boolean) rc8Var4.m("mobile_use_birthday_for_age_verification").getValue()).booleanValue()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 5:
                        rc8 rc8Var5 = okcVar.b;
                        return Boolean.valueOf(rc8Var5.b() && ((Boolean) rc8Var5.m("mobile_delay_age_verification").getValue()).booleanValue());
                    case 6:
                        return ajk.m((Map) okcVar.b.f("supported_regions", new f7a(srg.a, RegionSupport.Companion.serializer())).getValue());
                    case 7:
                        rc8 rc8Var6 = okcVar.b;
                        return Boolean.valueOf(rc8Var6.b() && ((Boolean) rc8Var6.m("claude_ai_ember").getValue()).booleanValue());
                    case 8:
                        ModelFallbacksConfig modelFallbacksConfig = (ModelFallbacksConfig) okcVar.b.g("holdup", ModelFallbacksConfig.Companion.serializer()).getValue();
                        return modelFallbacksConfig == null ? new ModelFallbacksConfig((Map) (r53 == true ? 1 : 0), (Map) (r52 == true ? 1 : 0), i32, (mq5) (r5 == true ? 1 : 0)) : modelFallbacksConfig;
                    case 9:
                        Organization organizationE = okcVar.e();
                        lea leaVar2 = okcVar.d;
                        List<ModelOption> claude_ai_bootstrap_models_config = organizationE.getClaude_ai_bootstrap_models_config();
                        if (claude_ai_bootstrap_models_config == null) {
                            ij0.y("Organization is missing claude_ai_bootstrap_models_config", null, false, 3);
                        } else {
                            List<ModelOption> list = claude_ai_bootstrap_models_config;
                            arrayList2 = new ArrayList(x44.y(list, 10));
                            for (ModelOption modelOption : list) {
                                _ServerLocalizedString description = modelOption.getDescription();
                                _ServerLocalizedString _serverlocalizedstring = (description == null || (english3 = description.getEnglish()) == null) ? null : new _ServerLocalizedString(english3, leaVar2.b(english3));
                                _ServerLocalizedString notice_text = modelOption.getNotice_text();
                                _ServerLocalizedString _serverlocalizedstring2 = (notice_text == null || (english2 = notice_text.getEnglish()) == null) ? null : new _ServerLocalizedString(english2, leaVar2.b(english2));
                                List<ThinkingModeOption> thinking_modes = modelOption.getThinking_modes();
                                if (thinking_modes != null) {
                                    List<ThinkingModeOption> list2 = thinking_modes;
                                    ArrayList arrayList3 = new ArrayList(x44.y(list2, 10));
                                    for (ThinkingModeOption thinkingModeOption : list2) {
                                        String english4 = thinkingModeOption.getTitle().getEnglish();
                                        _ServerLocalizedString _serverlocalizedstring3 = new _ServerLocalizedString(english4, leaVar2.b(english4));
                                        String english5 = thinkingModeOption.getDescription().getEnglish();
                                        _ServerLocalizedString _serverlocalizedstring4 = new _ServerLocalizedString(english5, leaVar2.b(english5));
                                        _ServerLocalizedString selection_title = thinkingModeOption.getSelection_title();
                                        arrayList3.add(ThinkingModeOption.m383copy3WgSuLE$default(thinkingModeOption, null, _serverlocalizedstring3, _serverlocalizedstring4, null, (selection_title == null || (english = selection_title.getEnglish()) == null) ? null : new _ServerLocalizedString(english, leaVar2.b(english)), null, 41, null));
                                    }
                                    arrayList = arrayList3;
                                } else {
                                    arrayList = null;
                                }
                                arrayList2.add(ModelOption.m353copyZEIUhPU$default(modelOption, null, null, _serverlocalizedstring, null, null, null, arrayList, null, _serverlocalizedstring2, null, null, null, 3771, null));
                            }
                        }
                        return arrayList2;
                    case 10:
                        List list3 = (List) okcVar.i.getValue();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj : list3) {
                            if (!x44.r(((ModelOption) obj).getInactive(), Boolean.TRUE)) {
                                arrayList4.add(obj);
                            }
                        }
                        return arrayList4;
                    case 11:
                        wz5 wz5Var = okcVar.j;
                        ModelSelectorSurface.Companion.getClass();
                        ModelSelectorConfig modelSelectorConfigF = okcVar.f(ModelSelectorSurface.CHAT);
                        if (modelSelectorConfigF != null && (models = modelSelectorConfigF.getModels()) != null) {
                            List<ModelSelectorEntry> list4 = models.isEmpty() ? null : models;
                            if (list4 != null) {
                                Set setF0 = bnf.f0(bnf.b0(bnf.V(new c54(0, list4), new kac(12)), be5.b0));
                                List list5 = (List) wz5Var.getValue();
                                ArrayList arrayList5 = new ArrayList();
                                for (Object obj2 : list5) {
                                    if (setF0.contains(ModelId.m1058boximpl(((ModelOption) obj2).m356getModeli4oh0I()))) {
                                        arrayList5.add(obj2);
                                    }
                                }
                                return arrayList5;
                            }
                        }
                        return (List) wz5Var.getValue();
                    case 12:
                        AvailableModelsConfig availableModelsConfig = (AvailableModelsConfig) okcVar.b.g("claude_ai_available_models", AvailableModelsConfig.Companion.serializer()).getValue();
                        if (availableModelsConfig == null || (models2 = availableModelsConfig.getModels()) == null) {
                            linkedHashMap = nm6.E;
                        } else {
                            List<AvailableModelsConfig.AvailableModel> list6 = models2;
                            int iD0 = tta.d0(x44.y(list6, 10));
                            if (iD0 < 16) {
                                iD0 = 16;
                            }
                            linkedHashMap = new LinkedHashMap(iD0);
                            for (Object obj3 : list6) {
                                linkedHashMap.put(ModelId.m1058boximpl(((AvailableModelsConfig.AvailableModel) obj3).m776getModel_idi4oh0I()), obj3);
                            }
                        }
                        List list7 = (List) okcVar.i.getValue();
                        int iD02 = tta.d0(x44.y(list7, 10));
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iD02 >= 16 ? iD02 : 16);
                        Iterator it = list7.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            pvg minimumTier = pvg.PRO;
                            if (!zHasNext) {
                                int iOrdinal = eve.C(okcVar.e()).ordinal();
                                pvg pvgVar = pvg.MAX;
                                if (iOrdinal == 0) {
                                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                                        if (((pvg) entry.getValue()) != pvg.FREE) {
                                            linkedHashMap3.put(entry.getKey(), entry.getValue());
                                        }
                                    }
                                    arrayList2 = new ArrayList();
                                    for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                                        ModelOption modelOption2 = (ModelOption) entry2.getKey();
                                        pvg pvgVar2 = (pvg) entry2.getValue();
                                        int i42 = pvgVar2 == null ? -1 : mkc.a[pvgVar2.ordinal()];
                                        cqb cqbVar = i42 != 1 ? i42 != 2 ? null : new cqb(modelOption2.m356getModeli4oh0I(), minimumTier) : new cqb(modelOption2.m356getModeli4oh0I(), pvgVar);
                                        if (cqbVar != null) {
                                            arrayList2.add(cqbVar);
                                        }
                                    }
                                } else if (iOrdinal == 1) {
                                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                                        if (((pvg) entry3.getValue()) == pvgVar) {
                                            linkedHashMap4.put(entry3.getKey(), entry3.getValue());
                                        }
                                    }
                                    arrayList2 = new ArrayList(linkedHashMap4.size());
                                    for (Map.Entry entry4 : linkedHashMap4.entrySet()) {
                                        ModelOption modelOption3 = (ModelOption) entry4.getKey();
                                        arrayList2.add(new cqb(modelOption3.m356getModeli4oh0I(), pvgVar));
                                    }
                                }
                                ArrayList arrayList6 = new ArrayList();
                                for (Object obj4 : (Iterable) arrayList2) {
                                    String strA = ((cqb) obj4).a();
                                    String strB = okcVar.b();
                                    if (!(strB == null ? false : ModelId.m1061equalsimpl0(strA, strB))) {
                                        arrayList6.add(obj4);
                                    }
                                }
                                return w44.t1(arrayList6);
                            }
                            Object next = it.next();
                            AvailableModelsConfig.AvailableModel availableModel = (AvailableModelsConfig.AvailableModel) linkedHashMap.get(ModelId.m1058boximpl(((ModelOption) next).m356getModeli4oh0I()));
                            if (availableModel != null) {
                                minimumTier = availableModel.getMinimumTier();
                            }
                            linkedHashMap2.put(next, minimumTier);
                        }
                        break;
                    default:
                        StickySelectionConfig stickySelectionConfig = (StickySelectionConfig) okcVar.b.g("mobile_sticky_selection_config", StickySelectionConfig.Companion.serializer()).getValue();
                        return stickySelectionConfig == null ? new StickySelectionConfig((StickyConfig) null, 1, (mq5) null) : stickySelectionConfig;
                }
            }
        });
    }

    public static boolean a(koi koiVar) {
        koiVar.getClass();
        koiVar.e().getClass();
        return !x44.r(r1.getBilling_type(), BillingType.STRIPE_SELF_SERVE_SUBSCRIPTION.getValue());
    }

    public final String b() {
        ModelId modelId = (ModelId) this.m.getValue();
        if (modelId != null) {
            return modelId.m1064unboximpl();
        }
        return null;
    }

    public final List c() {
        List list = (List) this.f.b.get(OrganizationId.m1065boximpl(this.a));
        return list == null ? lm6.E : list;
    }

    public final List d() {
        List list = (List) this.f.c.get(OrganizationId.m1065boximpl(this.a));
        return list == null ? lm6.E : list;
    }

    public final Organization e() {
        return (Organization) this.h.getValue();
    }

    public final ModelSelectorConfig f(String str) {
        Object next;
        str.getClass();
        Iterator it = c().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (ModelSelectorSurface.m375equalsimpl0(((ModelSelectorConfig) next).m360getIdWIVdKfU(), str)) {
                break;
            }
        }
        return (ModelSelectorConfig) next;
    }

    public final ModelSelectorState g(String str) {
        Object next;
        str.getClass();
        Iterator it = d().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (ModelSelectorSurface.m375equalsimpl0(((ModelSelectorState) next).m370getIdWIVdKfU(), str)) {
                break;
            }
        }
        return (ModelSelectorState) next;
    }

    public final void h(ArrayList arrayList) {
        this.f.c.put(OrganizationId.m1065boximpl(this.a), arrayList);
    }
}
