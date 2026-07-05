package com.anthropic.claude.app.onboarding;

import com.anthropic.claude.app.onboarding.OnboardingPage;
import com.anthropic.claude.configs.flags.OnboardingConfig;
import com.anthropic.claude.core.telemetry.SilentException;
import defpackage.bz7;
import defpackage.egc;
import defpackage.ozf;
import defpackage.tec;
import defpackage.w44;
import defpackage.xah;
import defpackage.y59;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements y59 {
    public final tec a;
    public final List b;

    public a(OnboardingConfig onboardingConfig, egc egcVar, tec tecVar) {
        onboardingConfig.getClass();
        egcVar.getClass();
        this.a = tecVar;
        List<String> pages = onboardingConfig.getPages();
        ArrayList arrayList = new ArrayList();
        for (String str : pages) {
            OnboardingPage.Companion.getClass();
            bz7 bz7Var = (bz7) b.b.get(str);
            OnboardingPage onboardingPage = bz7Var != null ? (OnboardingPage) bz7Var.invoke(onboardingConfig) : null;
            if (onboardingPage == null) {
                List list = xah.a;
                xah.e(6, "OnboardingCoordinator: dropped unknown page id", null, null);
            }
            if (onboardingPage != null) {
                arrayList.add(onboardingPage);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((OnboardingPage) obj).isEligible(egcVar)) {
                arrayList2.add(obj);
            }
        }
        List listP1 = w44.p1(w44.s1(arrayList2));
        if (egcVar.f) {
            OnboardingPage.Phone phone = OnboardingPage.Phone.INSTANCE;
            if (!listP1.contains(phone)) {
                SilentException.a(new SilentException("Onboarding config omitted required '" + phone.getId() + "'; client injected it. Config page count: " + onboardingConfig.getPages().size()), ozf.F, false, 2);
                listP1 = w44.b1(listP1, phone);
            }
        }
        this.b = listP1;
    }

    @Override // defpackage.y59
    public final /* bridge */ void onDestroy() {
    }
}
