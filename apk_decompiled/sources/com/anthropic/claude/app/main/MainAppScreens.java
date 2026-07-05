package com.anthropic.claude.app.main;

import com.anthropic.claude.login.WelcomeNotice;
import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.OrganizationId;
import defpackage.bga;
import defpackage.cc;
import defpackage.fkc;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.jj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.rpa;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.yb5;
import defpackage.z7;
import defpackage.znf;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bs\u0018\u0000 \u00062\u00020\u0001:\b\u0007\b\t\n\u000b\f\r\u000eR\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0007\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/app/main/MainAppScreens;", "Lbga;", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "Companion", "LoggedOut", "LoggedIn", "AddAccount", "StepUpReauth", "UiDemoApp", "InternalSettings", "RequiredUpdate", "com/anthropic/claude/app/main/m", "Lcom/anthropic/claude/app/main/MainAppScreens$AddAccount;", "Lcom/anthropic/claude/app/main/MainAppScreens$InternalSettings;", "Lcom/anthropic/claude/app/main/MainAppScreens$LoggedIn;", "Lcom/anthropic/claude/app/main/MainAppScreens$LoggedOut;", "Lcom/anthropic/claude/app/main/MainAppScreens$RequiredUpdate;", "Lcom/anthropic/claude/app/main/MainAppScreens$StepUpReauth;", "Lcom/anthropic/claude/app/main/MainAppScreens$UiDemoApp;", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public interface MainAppScreens extends bga {
    public static final m Companion = m.a;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/app/main/MainAppScreens$AddAccount;", "Lcom/anthropic/claude/app/main/MainAppScreens;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "app", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class AddAccount implements MainAppScreens {
        public static final int $stable = 0;
        public static final AddAccount INSTANCE = new AddAccount();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new rpa(1));

        private AddAccount() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.app.main.MainAppScreens.AddAccount", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AddAccount);
        }

        @Override // com.anthropic.claude.app.main.MainAppScreens, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return -77970764;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "AddAccount";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/app/main/MainAppScreens$InternalSettings;", "Lcom/anthropic/claude/app/main/MainAppScreens;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "app", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class InternalSettings implements MainAppScreens {
        public static final int $stable = 0;
        public static final InternalSettings INSTANCE = new InternalSettings();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new rpa(2));

        private InternalSettings() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.app.main.MainAppScreens.InternalSettings", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof InternalSettings);
        }

        @Override // com.anthropic.claude.app.main.MainAppScreens, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return 1501973608;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "InternalSettings";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/app/main/MainAppScreens$RequiredUpdate;", "Lcom/anthropic/claude/app/main/MainAppScreens;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "app", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class RequiredUpdate implements MainAppScreens {
        public static final int $stable = 0;
        public static final RequiredUpdate INSTANCE = new RequiredUpdate();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new rpa(5));

        private RequiredUpdate() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.app.main.MainAppScreens.RequiredUpdate", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof RequiredUpdate);
        }

        @Override // com.anthropic.claude.app.main.MainAppScreens, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return -1476671056;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "RequiredUpdate";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/app/main/MainAppScreens$UiDemoApp;", "Lcom/anthropic/claude/app/main/MainAppScreens;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "app", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class UiDemoApp implements MainAppScreens {
        public static final int $stable = 0;
        public static final UiDemoApp INSTANCE = new UiDemoApp();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new rpa(6));

        private UiDemoApp() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.app.main.MainAppScreens.UiDemoApp", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof UiDemoApp);
        }

        @Override // com.anthropic.claude.app.main.MainAppScreens, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return -1456749918;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "UiDemoApp";
        }
    }

    @Override // defpackage.bga
    default cc getActiveSurface() {
        return cc.Other;
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/app/main/MainAppScreens$LoggedOut;", "Lcom/anthropic/claude/app/main/MainAppScreens;", "Lcom/anthropic/claude/login/WelcomeNotice;", "notice", "<init>", "(Lcom/anthropic/claude/login/WelcomeNotice;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/login/WelcomeNotice;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$app", "(Lcom/anthropic/claude/app/main/MainAppScreens$LoggedOut;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/login/WelcomeNotice;", "copy", "(Lcom/anthropic/claude/login/WelcomeNotice;)Lcom/anthropic/claude/app/main/MainAppScreens$LoggedOut;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/login/WelcomeNotice;", "getNotice", "Companion", "com/anthropic/claude/app/main/p", "com/anthropic/claude/app/main/q", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class LoggedOut implements MainAppScreens {
        public static final int $stable = 0;
        private final WelcomeNotice notice;
        public static final q Companion = new q();
        private static final kw9[] $childSerializers = {yb5.w(w1a.F, new rpa(4))};

        public /* synthetic */ LoggedOut(int i, WelcomeNotice welcomeNotice, vnf vnfVar) {
            if ((i & 1) == 0) {
                this.notice = null;
            } else {
                this.notice = welcomeNotice;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return WelcomeNotice.Companion.serializer();
        }

        public static /* synthetic */ LoggedOut copy$default(LoggedOut loggedOut, WelcomeNotice welcomeNotice, int i, Object obj) {
            if ((i & 1) != 0) {
                welcomeNotice = loggedOut.notice;
            }
            return loggedOut.copy(welcomeNotice);
        }

        public static final /* synthetic */ void write$Self$app(LoggedOut self, vd4 output, SerialDescriptor serialDesc) {
            kw9[] kw9VarArr = $childSerializers;
            if (!output.E(serialDesc) && self.notice == null) {
                return;
            }
            output.B(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.notice);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final WelcomeNotice getNotice() {
            return this.notice;
        }

        public final LoggedOut copy(WelcomeNotice notice) {
            return new LoggedOut(notice);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LoggedOut) && this.notice == ((LoggedOut) other).notice;
        }

        @Override // com.anthropic.claude.app.main.MainAppScreens, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public final WelcomeNotice getNotice() {
            return this.notice;
        }

        public int hashCode() {
            WelcomeNotice welcomeNotice = this.notice;
            if (welcomeNotice == null) {
                return 0;
            }
            return welcomeNotice.hashCode();
        }

        public String toString() {
            return "LoggedOut(notice=" + this.notice + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LoggedOut() {
            this((WelcomeNotice) null, 1, (mq5) (0 == true ? 1 : 0));
        }

        public LoggedOut(WelcomeNotice welcomeNotice) {
            this.notice = welcomeNotice;
        }

        public /* synthetic */ LoggedOut(WelcomeNotice welcomeNotice, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? null : welcomeNotice);
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0015¨\u0006("}, d2 = {"Lcom/anthropic/claude/app/main/MainAppScreens$StepUpReauth;", "Lcom/anthropic/claude/app/main/MainAppScreens;", "Lcom/anthropic/claude/types/strings/AccountId;", "currentAccountId", "<init>", "(Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$app", "(Lcom/anthropic/claude/app/main/MainAppScreens$StepUpReauth;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-islZJdo", "()Ljava/lang/String;", "component1", "copy-bKj1GtA", "(Ljava/lang/String;)Lcom/anthropic/claude/app/main/MainAppScreens$StepUpReauth;", "copy", "", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCurrentAccountId-islZJdo", "Companion", "com/anthropic/claude/app/main/r", "com/anthropic/claude/app/main/s", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class StepUpReauth implements MainAppScreens {
        public static final int $stable = 0;
        public static final s Companion = new s();
        private final String currentAccountId;

        private /* synthetic */ StepUpReauth(int i, String str, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.currentAccountId = str;
            } else {
                gvj.f(i, 1, r.a.getDescriptor());
                throw null;
            }
        }

        /* JADX INFO: renamed from: copy-bKj1GtA$default, reason: not valid java name */
        public static /* synthetic */ StepUpReauth m503copybKj1GtA$default(StepUpReauth stepUpReauth, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stepUpReauth.currentAccountId;
            }
            return stepUpReauth.m505copybKj1GtA(str);
        }

        /* JADX INFO: renamed from: component1-islZJdo, reason: not valid java name and from getter */
        public final String getCurrentAccountId() {
            return this.currentAccountId;
        }

        /* JADX INFO: renamed from: copy-bKj1GtA, reason: not valid java name */
        public final StepUpReauth m505copybKj1GtA(String currentAccountId) {
            currentAccountId.getClass();
            return new StepUpReauth(currentAccountId, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StepUpReauth) && AccountId.m946equalsimpl0(this.currentAccountId, ((StepUpReauth) other).currentAccountId);
        }

        @Override // com.anthropic.claude.app.main.MainAppScreens, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        /* JADX INFO: renamed from: getCurrentAccountId-islZJdo, reason: not valid java name */
        public final String m506getCurrentAccountIdislZJdo() {
            return this.currentAccountId;
        }

        public int hashCode() {
            return AccountId.m947hashCodeimpl(this.currentAccountId);
        }

        public String toString() {
            return ij0.j("StepUpReauth(currentAccountId=", AccountId.m948toStringimpl(this.currentAccountId), ")");
        }

        public /* synthetic */ StepUpReauth(String str, mq5 mq5Var) {
            this(str);
        }

        public /* synthetic */ StepUpReauth(int i, String str, vnf vnfVar, mq5 mq5Var) {
            this(i, str, vnfVar);
        }

        private StepUpReauth(String str) {
            str.getClass();
            this.currentAccountId = str;
        }
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ0\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010\u0019J\u0010\u0010$\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b-\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001e¨\u00063"}, d2 = {"Lcom/anthropic/claude/app/main/MainAppScreens$LoggedIn;", "Lcom/anthropic/claude/app/main/MainAppScreens;", "Lcom/anthropic/claude/types/strings/AccountId;", "accountId", "Lcom/anthropic/claude/types/strings/OrganizationId;", "initialOrganizationId", "Ljj;", "ageSignalsResult", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljj;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljj;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$app", "(Lcom/anthropic/claude/app/main/MainAppScreens$LoggedIn;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-islZJdo", "()Ljava/lang/String;", "component1", "component2-QUMPZR0", "component2", "component3", "()Ljj;", "copy-vFdMBMs", "(Ljava/lang/String;Ljava/lang/String;Ljj;)Lcom/anthropic/claude/app/main/MainAppScreens$LoggedIn;", "copy", "", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccountId-islZJdo", "getInitialOrganizationId-QUMPZR0", "Ljj;", "getAgeSignalsResult", "Companion", "com/anthropic/claude/app/main/n", "com/anthropic/claude/app/main/o", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class LoggedIn implements MainAppScreens {
        public static final int $stable = 0;
        private final String accountId;
        private final jj ageSignalsResult;
        private final String initialOrganizationId;
        public static final o Companion = new o();
        private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new rpa(3))};

        private /* synthetic */ LoggedIn(int i, String str, String str2, jj jjVar, vnf vnfVar) {
            if (7 != (i & 7)) {
                gvj.f(i, 7, n.a.getDescriptor());
                throw null;
            }
            this.accountId = str;
            this.initialOrganizationId = str2;
            this.ageSignalsResult = jjVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer _childSerializers$_anonymous_() {
            jj[] jjVarArrValues = jj.values();
            jjVarArrValues.getClass();
            return new lq6("com.anthropic.claude.agesignals.AgeSignalsResult", (Enum[]) jjVarArrValues);
        }

        /* JADX INFO: renamed from: copy-vFdMBMs$default, reason: not valid java name */
        public static /* synthetic */ LoggedIn m497copyvFdMBMs$default(LoggedIn loggedIn, String str, String str2, jj jjVar, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loggedIn.accountId;
            }
            if ((i & 2) != 0) {
                str2 = loggedIn.initialOrganizationId;
            }
            if ((i & 4) != 0) {
                jjVar = loggedIn.ageSignalsResult;
            }
            return loggedIn.m500copyvFdMBMs(str, str2, jjVar);
        }

        public static final /* synthetic */ void write$Self$app(LoggedIn self, vd4 output, SerialDescriptor serialDesc) {
            kw9[] kw9VarArr = $childSerializers;
            output.r(serialDesc, 0, z7.a, AccountId.m943boximpl(self.accountId));
            fkc fkcVar = fkc.a;
            String str = self.initialOrganizationId;
            output.B(serialDesc, 1, fkcVar, str != null ? OrganizationId.m1065boximpl(str) : null);
            output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.ageSignalsResult);
        }

        /* JADX INFO: renamed from: component1-islZJdo, reason: not valid java name and from getter */
        public final String getAccountId() {
            return this.accountId;
        }

        /* JADX INFO: renamed from: component2-QUMPZR0, reason: not valid java name and from getter */
        public final String getInitialOrganizationId() {
            return this.initialOrganizationId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final jj getAgeSignalsResult() {
            return this.ageSignalsResult;
        }

        /* JADX INFO: renamed from: copy-vFdMBMs, reason: not valid java name */
        public final LoggedIn m500copyvFdMBMs(String accountId, String initialOrganizationId, jj ageSignalsResult) {
            accountId.getClass();
            ageSignalsResult.getClass();
            return new LoggedIn(accountId, initialOrganizationId, ageSignalsResult, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.anthropic.claude.app.main.MainAppScreens.LoggedIn
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.anthropic.claude.app.main.MainAppScreens$LoggedIn r5 = (com.anthropic.claude.app.main.MainAppScreens.LoggedIn) r5
                java.lang.String r1 = r4.accountId
                java.lang.String r3 = r5.accountId
                boolean r1 = com.anthropic.claude.types.strings.AccountId.m946equalsimpl0(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.String r1 = r4.initialOrganizationId
                java.lang.String r3 = r5.initialOrganizationId
                if (r1 != 0) goto L23
                if (r3 != 0) goto L21
                r1 = r0
                goto L2a
            L21:
                r1 = r2
                goto L2a
            L23:
                if (r3 != 0) goto L26
                goto L21
            L26:
                boolean r1 = com.anthropic.claude.types.strings.OrganizationId.m1068equalsimpl0(r1, r3)
            L2a:
                if (r1 != 0) goto L2d
                return r2
            L2d:
                jj r4 = r4.ageSignalsResult
                jj r5 = r5.ageSignalsResult
                if (r4 == r5) goto L34
                return r2
            L34:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.app.main.MainAppScreens.LoggedIn.equals(java.lang.Object):boolean");
        }

        /* JADX INFO: renamed from: getAccountId-islZJdo, reason: not valid java name */
        public final String m501getAccountIdislZJdo() {
            return this.accountId;
        }

        @Override // com.anthropic.claude.app.main.MainAppScreens, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public final jj getAgeSignalsResult() {
            return this.ageSignalsResult;
        }

        /* JADX INFO: renamed from: getInitialOrganizationId-QUMPZR0, reason: not valid java name */
        public final String m502getInitialOrganizationIdQUMPZR0() {
            return this.initialOrganizationId;
        }

        public int hashCode() {
            int iM947hashCodeimpl = AccountId.m947hashCodeimpl(this.accountId) * 31;
            String str = this.initialOrganizationId;
            return this.ageSignalsResult.hashCode() + ((iM947hashCodeimpl + (str == null ? 0 : OrganizationId.m1069hashCodeimpl(str))) * 31);
        }

        public String toString() {
            String strM948toStringimpl = AccountId.m948toStringimpl(this.accountId);
            String str = this.initialOrganizationId;
            String strM1070toStringimpl = str == null ? "null" : OrganizationId.m1070toStringimpl(str);
            jj jjVar = this.ageSignalsResult;
            StringBuilder sbR = kgh.r("LoggedIn(accountId=", strM948toStringimpl, ", initialOrganizationId=", strM1070toStringimpl, ", ageSignalsResult=");
            sbR.append(jjVar);
            sbR.append(")");
            return sbR.toString();
        }

        public /* synthetic */ LoggedIn(String str, String str2, jj jjVar, mq5 mq5Var) {
            this(str, str2, jjVar);
        }

        public /* synthetic */ LoggedIn(int i, String str, String str2, jj jjVar, vnf vnfVar, mq5 mq5Var) {
            this(i, str, str2, jjVar, vnfVar);
        }

        private LoggedIn(String str, String str2, jj jjVar) {
            str.getClass();
            jjVar.getClass();
            this.accountId = str;
            this.initialOrganizationId = str2;
            this.ageSignalsResult = jjVar;
        }
    }
}
