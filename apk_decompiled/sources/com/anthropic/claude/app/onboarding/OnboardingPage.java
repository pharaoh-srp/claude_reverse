package com.anthropic.claude.app.onboarding;

import com.anthropic.claude.analytics.events.AnalyticsEvent;
import com.anthropic.claude.analytics.events.OnboardingEvents$DesktopUpsellEmailLinkTapped;
import com.anthropic.claude.analytics.events.OnboardingEvents$DesktopUpsellSkipped;
import com.anthropic.claude.api.account.SendProductEmailLinkRequest;
import com.anthropic.claude.app.onboarding.OnboardingPage;
import com.anthropic.claude.models.organization.configtypes.GroveConfigStrings;
import defpackage.bga;
import defpackage.bz7;
import defpackage.cc;
import defpackage.e18;
import defpackage.e2c;
import defpackage.egc;
import defpackage.fd9;
import defpackage.gb9;
import defpackage.ggc;
import defpackage.hya;
import defpackage.iei;
import defpackage.iqb;
import defpackage.jd4;
import defpackage.jm9;
import defpackage.jpi;
import defpackage.jwk;
import defpackage.ktk;
import defpackage.kw9;
import defpackage.kza;
import defpackage.ld4;
import defpackage.lq6;
import defpackage.lsc;
import defpackage.lz1;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nb9;
import defpackage.ne5;
import defpackage.nuj;
import defpackage.onf;
import defpackage.pz7;
import defpackage.qy1;
import defpackage.sqk;
import defpackage.tec;
import defpackage.tik;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.xnk;
import defpackage.yb5;
import defpackage.zy7;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u0000 \u00162\u00020\u0001:\t\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0001\b !\"#$%&'¨\u0006(À\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/app/onboarding/OnboardingPage;", "Lbga;", "Legc;", "gates", "", "isEligible", "(Legc;)Z", "Lggc;", "host", "Liqb;", "modifier", "Liei;", "Content", "(Lggc;Liqb;Lld4;I)V", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "", "getId", "()Ljava/lang/String;", "id", "Companion", "Intro", "Name", "Age", "Phone", "Permission", "Grove", "Subscription", "Desktop", "com/anthropic/claude/app/onboarding/b", "Lcom/anthropic/claude/app/onboarding/OnboardingPage$Age;", "Lcom/anthropic/claude/app/onboarding/OnboardingPage$Desktop;", "Lcom/anthropic/claude/app/onboarding/OnboardingPage$Grove;", "Lcom/anthropic/claude/app/onboarding/OnboardingPage$Intro;", "Lcom/anthropic/claude/app/onboarding/OnboardingPage$Name;", "Lcom/anthropic/claude/app/onboarding/OnboardingPage$Permission;", "Lcom/anthropic/claude/app/onboarding/OnboardingPage$Phone;", "Lcom/anthropic/claude/app/onboarding/OnboardingPage$Subscription;", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public interface OnboardingPage extends bga {
    public static final b Companion = b.a;

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0015¨\u0006 "}, d2 = {"Lcom/anthropic/claude/app/onboarding/OnboardingPage$Age;", "Lcom/anthropic/claude/app/onboarding/OnboardingPage;", "<init>", "()V", "Legc;", "gates", "", "isEligible", "(Legc;)Z", "Lggc;", "host", "Liqb;", "modifier", "Liei;", "Content", "(Lggc;Liqb;Lld4;I)V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "id", "Ljava/lang/String;", "getId", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Age implements OnboardingPage {
        public static final int $stable = 0;
        public static final Age INSTANCE = new Age();
        private static final String id = "age";
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new e2c(22));

        private Age() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.app.onboarding.OnboardingPage.Age", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        @Override // com.anthropic.claude.app.onboarding.OnboardingPage
        public void Content(ggc ggcVar, iqb iqbVar, ld4 ld4Var, int i) {
            ggcVar.getClass();
            iqbVar.getClass();
            e18 e18Var = (e18) ld4Var;
            e18Var.a0(376914104);
            xnk.a(ggcVar, iqbVar, null, e18Var, i & 126);
            e18Var.p(false);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Age);
        }

        @Override // com.anthropic.claude.app.onboarding.OnboardingPage, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        @Override // com.anthropic.claude.app.onboarding.OnboardingPage
        public String getId() {
            return id;
        }

        public int hashCode() {
            return -1309087872;
        }

        @Override // com.anthropic.claude.app.onboarding.OnboardingPage
        public boolean isEligible(egc gates) {
            gates.getClass();
            return gates.d && !gates.c;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Age";
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/anthropic/claude/app/onboarding/OnboardingPage$Desktop;", "Lcom/anthropic/claude/app/onboarding/OnboardingPage;", "<init>", "()V", "Lggc;", "host", "Liqb;", "modifier", "Liei;", "Content", "(Lggc;Liqb;Lld4;I)V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "id", "Ljava/lang/String;", "getId", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Desktop implements OnboardingPage {
        public static final int $stable = 0;
        public static final Desktop INSTANCE = new Desktop();
        private static final String id = SendProductEmailLinkRequest.PRODUCT_DESKTOP;
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new e2c(23));

        private Desktop() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final iei Content$lambda$0$0(ggc ggcVar) {
            tec tecVar = ggcVar.a;
            hya hyaVar = ggcVar.b;
            tecVar.getClass();
            lsc lscVar = tecVar.u;
            if (!((Boolean) lscVar.getValue()).booleanValue() && !((Boolean) tecVar.v.getValue()).booleanValue() && !((Boolean) tecVar.w.getValue()).booleanValue()) {
                tecVar.d.e(new OnboardingEvents$DesktopUpsellEmailLinkTapped("claude-android", 2), AnalyticsEvent.Companion.serializer());
                lscVar.setValue(Boolean.TRUE);
                gb9.D(tecVar.a, null, null, new kza(tecVar, hyaVar, null, 11), 3);
            }
            return iei.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final iei Content$lambda$1$0(ggc ggcVar) {
            tec tecVar = ggcVar.a;
            if (!((Boolean) tecVar.v.getValue()).booleanValue()) {
                tecVar.d.e(new OnboardingEvents$DesktopUpsellSkipped("claude-android", 2), AnalyticsEvent.Companion.serializer());
            }
            ggcVar.b.a();
            return iei.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.app.onboarding.OnboardingPage.Desktop", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        @Override // com.anthropic.claude.app.onboarding.OnboardingPage
        public void Content(final ggc ggcVar, iqb iqbVar, ld4 ld4Var, int i) {
            ggcVar.getClass();
            iqbVar.getClass();
            e18 e18Var = (e18) ld4Var;
            e18Var.a0(1673370837);
            tec tecVar = ggcVar.a;
            boolean zBooleanValue = ((Boolean) tecVar.u.getValue()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) tecVar.v.getValue()).booleanValue();
            boolean zBooleanValue3 = ((Boolean) tecVar.w.getValue()).booleanValue();
            int i2 = (i & 14) ^ 6;
            final int i3 = 1;
            final int i4 = 0;
            boolean z = (i2 > 4 && e18Var.f(ggcVar)) || (i & 6) == 4;
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (z || objN == lz1Var) {
                objN = new zy7() { // from class: fgc
                    @Override // defpackage.zy7
                    public final Object a() {
                        int i5 = i4;
                        ggc ggcVar2 = ggcVar;
                        switch (i5) {
                            case 0:
                                return OnboardingPage.Desktop.Content$lambda$0$0(ggcVar2);
                            default:
                                return OnboardingPage.Desktop.Content$lambda$1$0(ggcVar2);
                        }
                    }
                };
                e18Var.k0(objN);
            }
            zy7 zy7Var = (zy7) objN;
            boolean z2 = (i2 > 4 && e18Var.f(ggcVar)) || (i & 6) == 4;
            Object objN2 = e18Var.N();
            if (z2 || objN2 == lz1Var) {
                objN2 = new zy7() { // from class: fgc
                    @Override // defpackage.zy7
                    public final Object a() {
                        int i5 = i3;
                        ggc ggcVar2 = ggcVar;
                        switch (i5) {
                            case 0:
                                return OnboardingPage.Desktop.Content$lambda$0$0(ggcVar2);
                            default:
                                return OnboardingPage.Desktop.Content$lambda$1$0(ggcVar2);
                        }
                    }
                };
                e18Var.k0(objN2);
            }
            ne5.a(zBooleanValue, zBooleanValue2, zBooleanValue3, zy7Var, (zy7) objN2, iqbVar, e18Var, (i << 12) & 458752, 0);
            e18Var.p(false);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Desktop);
        }

        @Override // com.anthropic.claude.app.onboarding.OnboardingPage, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        @Override // com.anthropic.claude.app.onboarding.OnboardingPage
        public String getId() {
            return id;
        }

        public int hashCode() {
            return 1350161949;
        }

        @Override // com.anthropic.claude.app.onboarding.OnboardingPage
        public /* bridge */ boolean isEligible(egc egcVar) {
            return super.isEligible(egcVar);
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Desktop";
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0015¨\u0006 "}, d2 = {"Lcom/anthropic/claude/app/onboarding/OnboardingPage$Grove;", "Lcom/anthropic/claude/app/onboarding/OnboardingPage;", "<init>", "()V", "Legc;", "gates", "", "isEligible", "(Legc;)Z", "Lggc;", "host", "Liqb;", "modifier", "Liei;", "Content", "(Lggc;Liqb;Lld4;I)V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "id", "Ljava/lang/String;", "getId", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Grove implements OnboardingPage {
        public static final int $stable = 0;
        public static final Grove INSTANCE = new Grove();
        private static final String id = "grove";
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new e2c(24));

        private Grove() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.app.onboarding.OnboardingPage.Grove", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        @Override // com.anthropic.claude.app.onboarding.OnboardingPage
        public void Content(ggc ggcVar, iqb iqbVar, ld4 ld4Var, int i) {
            ggcVar.getClass();
            tec tecVar = ggcVar.a;
            iqbVar.getClass();
            e18 e18Var = (e18) ld4Var;
            e18Var.a0(1625133836);
            boolean z = (((i & 14) ^ 6) > 4 && e18Var.f(ggcVar)) || (i & 6) == 4;
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (z || objN == lz1Var) {
                objN = new c(ggcVar, null);
                e18Var.k0(objN);
            }
            fd9.i(e18Var, (pz7) objN, iei.a);
            boolean z2 = tecVar.n;
            Boolean bool = (Boolean) tecVar.p.getValue();
            boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
            tec tecVar2 = ggcVar.a;
            boolean zH = e18Var.h(tecVar2);
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                d dVar = new d(1, 0, tec.class, tecVar2, "onGroveToggled", "onGroveToggled(Z)V");
                e18Var.k0(dVar);
                objN2 = dVar;
            }
            sqk.b(z2, zBooleanValue, (bz7) ((jm9) objN2), (GroveConfigStrings) tecVar.o.getValue(), ggcVar.b, iqbVar, e18Var, (i << 12) & 458752);
            e18Var.p(false);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Grove);
        }

        @Override // com.anthropic.claude.app.onboarding.OnboardingPage, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        @Override // com.anthropic.claude.app.onboarding.OnboardingPage
        public String getId() {
            return id;
        }

        public int hashCode() {
            return 397854932;
        }

        @Override // com.anthropic.claude.app.onboarding.OnboardingPage
        public boolean isEligible(egc gates) {
            gates.getClass();
            return gates.g && !gates.h;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Grove";
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/anthropic/claude/app/onboarding/OnboardingPage$Intro;", "Lcom/anthropic/claude/app/onboarding/OnboardingPage;", "<init>", "()V", "Lggc;", "host", "Liqb;", "modifier", "Liei;", "Content", "(Lggc;Liqb;Lld4;I)V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "id", "Ljava/lang/String;", "getId", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Intro implements OnboardingPage {
        public static final int $stable = 0;
        public static final Intro INSTANCE = new Intro();
        private static final String id = "intro";
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new e2c(25));

        private Intro() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.app.onboarding.OnboardingPage.Intro", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        @Override // com.anthropic.claude.app.onboarding.OnboardingPage
        public void Content(ggc ggcVar, iqb iqbVar, ld4 ld4Var, int i) {
            ggcVar.getClass();
            iqbVar.getClass();
            e18 e18Var = (e18) ld4Var;
            e18Var.a0(-354724763);
            jwk.i(ggcVar, iqbVar, e18Var, i & 126);
            e18Var.p(false);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Intro);
        }

        @Override // com.anthropic.claude.app.onboarding.OnboardingPage, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        @Override // com.anthropic.claude.app.onboarding.OnboardingPage
        public String getId() {
            return id;
        }

        public int hashCode() {
            return 399587501;
        }

        @Override // com.anthropic.claude.app.onboarding.OnboardingPage
        public /* bridge */ boolean isEligible(egc egcVar) {
            return super.isEligible(egcVar);
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Intro";
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/anthropic/claude/app/onboarding/OnboardingPage$Name;", "Lcom/anthropic/claude/app/onboarding/OnboardingPage;", "<init>", "()V", "Lggc;", "host", "Liqb;", "modifier", "Liei;", "Content", "(Lggc;Liqb;Lld4;I)V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "id", "Ljava/lang/String;", "getId", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Name implements OnboardingPage {
        public static final int $stable = 0;
        public static final Name INSTANCE = new Name();
        private static final String id = "name";
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new e2c(26));

        private Name() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final iei Content$lambda$0$0(ggc ggcVar, String str) {
            str.getClass();
            tec tecVar = ggcVar.a;
            tecVar.getClass();
            tecVar.s.setValue(str);
            ggcVar.b.a();
            return iei.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.app.onboarding.OnboardingPage.Name", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        @Override // com.anthropic.claude.app.onboarding.OnboardingPage
        public void Content(ggc ggcVar, iqb iqbVar, ld4 ld4Var, int i) {
            ggcVar.getClass();
            iqbVar.getClass();
            e18 e18Var = (e18) ld4Var;
            e18Var.a0(1078043770);
            String str = (String) ggcVar.a.s.getValue();
            boolean z = (((i & 14) ^ 6) > 4 && e18Var.f(ggcVar)) || (i & 6) == 4;
            Object objN = e18Var.N();
            if (z || objN == jd4.a) {
                objN = new nb9(ggcVar, 2);
                e18Var.k0(objN);
            }
            ktk.j((bz7) objN, iqbVar, str, e18Var, i & 112, 0);
            e18Var.p(false);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Name);
        }

        @Override // com.anthropic.claude.app.onboarding.OnboardingPage, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        @Override // com.anthropic.claude.app.onboarding.OnboardingPage
        public String getId() {
            return id;
        }

        public int hashCode() {
            return -1926636502;
        }

        @Override // com.anthropic.claude.app.onboarding.OnboardingPage
        public /* bridge */ boolean isEligible(egc egcVar) {
            return super.isEligible(egcVar);
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Name";
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/anthropic/claude/app/onboarding/OnboardingPage$Permission;", "Lcom/anthropic/claude/app/onboarding/OnboardingPage;", "<init>", "()V", "Lggc;", "host", "Liqb;", "modifier", "Liei;", "Content", "(Lggc;Liqb;Lld4;I)V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "id", "Ljava/lang/String;", "getId", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Permission implements OnboardingPage {
        public static final int $stable = 0;
        public static final Permission INSTANCE = new Permission();
        private static final String id = "permission";
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new e2c(27));

        private Permission() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.app.onboarding.OnboardingPage.Permission", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        @Override // com.anthropic.claude.app.onboarding.OnboardingPage
        public void Content(ggc ggcVar, iqb iqbVar, ld4 ld4Var, int i) {
            ggcVar.getClass();
            iqbVar.getClass();
            e18 e18Var = (e18) ld4Var;
            e18Var.a0(1396574590);
            jpi.b(ggcVar, iqbVar, e18Var, i & 126);
            e18Var.p(false);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Permission);
        }

        @Override // com.anthropic.claude.app.onboarding.OnboardingPage, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        @Override // com.anthropic.claude.app.onboarding.OnboardingPage
        public String getId() {
            return id;
        }

        public int hashCode() {
            return 1963865134;
        }

        @Override // com.anthropic.claude.app.onboarding.OnboardingPage
        public /* bridge */ boolean isEligible(egc egcVar) {
            return super.isEligible(egcVar);
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Permission";
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0015¨\u0006 "}, d2 = {"Lcom/anthropic/claude/app/onboarding/OnboardingPage$Phone;", "Lcom/anthropic/claude/app/onboarding/OnboardingPage;", "<init>", "()V", "Legc;", "gates", "", "isEligible", "(Legc;)Z", "Lggc;", "host", "Liqb;", "modifier", "Liei;", "Content", "(Lggc;Liqb;Lld4;I)V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "id", "Ljava/lang/String;", "getId", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Phone implements OnboardingPage {
        public static final int $stable = 0;
        public static final Phone INSTANCE = new Phone();
        private static final String id = "phone";
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new e2c(28));

        private Phone() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.app.onboarding.OnboardingPage.Phone", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        @Override // com.anthropic.claude.app.onboarding.OnboardingPage
        public void Content(ggc ggcVar, iqb iqbVar, ld4 ld4Var, int i) {
            ggcVar.getClass();
            iqbVar.getClass();
            e18 e18Var = (e18) ld4Var;
            e18Var.a0(-1920301465);
            nuj.e(ggcVar, iqbVar, null, e18Var, i & 126);
            e18Var.p(false);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Phone);
        }

        @Override // com.anthropic.claude.app.onboarding.OnboardingPage, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        @Override // com.anthropic.claude.app.onboarding.OnboardingPage
        public String getId() {
            return id;
        }

        public int hashCode() {
            return 405868463;
        }

        @Override // com.anthropic.claude.app.onboarding.OnboardingPage
        public boolean isEligible(egc gates) {
            gates.getClass();
            return gates.f;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Phone";
        }
    }

    void Content(ggc ggcVar, iqb iqbVar, ld4 ld4Var, int i);

    @Override // defpackage.bga
    default cc getActiveSurface() {
        return cc.Other;
    }

    String getId();

    default boolean isEligible(egc gates) {
        gates.getClass();
        return true;
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001fR\u0014\u0010.\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010$¨\u00062"}, d2 = {"Lcom/anthropic/claude/app/onboarding/OnboardingPage$Subscription;", "Lcom/anthropic/claude/app/onboarding/OnboardingPage;", "", "showAnnualPricePerMonth", "<init>", "(Z)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IZLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$app", "(Lcom/anthropic/claude/app/onboarding/OnboardingPage$Subscription;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Legc;", "gates", "isEligible", "(Legc;)Z", "Lggc;", "host", "Liqb;", "modifier", "Content", "(Lggc;Liqb;Lld4;I)V", "component1", "()Z", "copy", "(Z)Lcom/anthropic/claude/app/onboarding/OnboardingPage$Subscription;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowAnnualPricePerMonth", "getId", "id", "Companion", "com/anthropic/claude/app/onboarding/e", "com/anthropic/claude/app/onboarding/f", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Subscription implements OnboardingPage {
        public static final int $stable = 0;
        public static final f Companion = new f();
        private final boolean showAnnualPricePerMonth;

        public /* synthetic */ Subscription(int i, boolean z, vnf vnfVar) {
            if ((i & 1) == 0) {
                this.showAnnualPricePerMonth = false;
            } else {
                this.showAnnualPricePerMonth = z;
            }
        }

        public static /* synthetic */ Subscription copy$default(Subscription subscription, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = subscription.showAnnualPricePerMonth;
            }
            return subscription.copy(z);
        }

        public static final /* synthetic */ void write$Self$app(Subscription self, vd4 output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || self.showAnnualPricePerMonth) {
                output.p(serialDesc, 0, self.showAnnualPricePerMonth);
            }
        }

        @Override // com.anthropic.claude.app.onboarding.OnboardingPage
        public void Content(ggc ggcVar, iqb iqbVar, ld4 ld4Var, int i) {
            ggcVar.getClass();
            iqbVar.getClass();
            e18 e18Var = (e18) ld4Var;
            e18Var.a0(-748201204);
            hya hyaVar = ggcVar.b;
            boolean z = this.showAnnualPricePerMonth;
            boolean z2 = (((i & 14) ^ 6) > 4 && e18Var.f(ggcVar)) || (i & 6) == 4;
            Object objN = e18Var.N();
            if (z2 || objN == jd4.a) {
                objN = new g(ggcVar, null);
                e18Var.k0(objN);
            }
            tik.f(hyaVar, iqbVar, (pz7) objN, z, null, null, e18Var, i & 112, 48);
            e18Var.p(false);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getShowAnnualPricePerMonth() {
            return this.showAnnualPricePerMonth;
        }

        public final Subscription copy(boolean showAnnualPricePerMonth) {
            return new Subscription(showAnnualPricePerMonth);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Subscription) && this.showAnnualPricePerMonth == ((Subscription) other).showAnnualPricePerMonth;
        }

        @Override // com.anthropic.claude.app.onboarding.OnboardingPage, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        @Override // com.anthropic.claude.app.onboarding.OnboardingPage
        public String getId() {
            return "subscription";
        }

        public final boolean getShowAnnualPricePerMonth() {
            return this.showAnnualPricePerMonth;
        }

        public int hashCode() {
            return Boolean.hashCode(this.showAnnualPricePerMonth);
        }

        @Override // com.anthropic.claude.app.onboarding.OnboardingPage
        public boolean isEligible(egc gates) {
            gates.getClass();
            return gates.i && gates.j;
        }

        public String toString() {
            return qy1.g("Subscription(showAnnualPricePerMonth=", ")", this.showAnnualPricePerMonth);
        }

        public Subscription() {
            this(false, 1, (mq5) null);
        }

        public Subscription(boolean z) {
            this.showAnnualPricePerMonth = z;
        }

        public /* synthetic */ Subscription(boolean z, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? false : z);
        }
    }
}
