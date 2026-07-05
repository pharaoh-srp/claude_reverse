package com.anthropic.claude.app.onboarding;

import com.anthropic.claude.api.account.SendProductEmailLinkRequest;
import com.anthropic.claude.app.onboarding.OnboardingPage;
import defpackage.cpc;
import defpackage.jce;
import defpackage.kac;
import defpackage.kce;
import defpackage.lq6;
import defpackage.odf;
import defpackage.pl9;
import defpackage.sta;
import java.lang.annotation.Annotation;
import java.util.Map;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static final /* synthetic */ b a = new b();
    public static final Map b = sta.h0(new cpc("intro", new kac(4)), new cpc("name", new kac(5)), new cpc("age", new kac(6)), new cpc("phone", new kac(7)), new cpc("permission", new kac(8)), new cpc("grove", new kac(9)), new cpc("subscription", new kac(10)), new cpc(SendProductEmailLinkRequest.PRODUCT_DESKTOP, new kac(11)));

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.app.onboarding.OnboardingPage", kceVar.b(OnboardingPage.class), new pl9[]{kceVar.b(OnboardingPage.Age.class), kceVar.b(OnboardingPage.Desktop.class), kceVar.b(OnboardingPage.Grove.class), kceVar.b(OnboardingPage.Intro.class), kceVar.b(OnboardingPage.Name.class), kceVar.b(OnboardingPage.Permission.class), kceVar.b(OnboardingPage.Phone.class), kceVar.b(OnboardingPage.Subscription.class)}, new KSerializer[]{new lq6("com.anthropic.claude.app.onboarding.OnboardingPage.Age", OnboardingPage.Age.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.app.onboarding.OnboardingPage.Desktop", OnboardingPage.Desktop.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.app.onboarding.OnboardingPage.Grove", OnboardingPage.Grove.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.app.onboarding.OnboardingPage.Intro", OnboardingPage.Intro.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.app.onboarding.OnboardingPage.Name", OnboardingPage.Name.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.app.onboarding.OnboardingPage.Permission", OnboardingPage.Permission.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.app.onboarding.OnboardingPage.Phone", OnboardingPage.Phone.INSTANCE, new Annotation[0]), e.a}, new Annotation[0]);
    }
}
