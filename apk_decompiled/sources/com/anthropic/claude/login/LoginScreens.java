package com.anthropic.claude.login;

import defpackage.bga;
import defpackage.cc;
import defpackage.gvj;
import defpackage.jce;
import defpackage.kce;
import defpackage.kw9;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.mia;
import defpackage.moa;
import defpackage.mq5;
import defpackage.nja;
import defpackage.odf;
import defpackage.onf;
import defpackage.pl9;
import defpackage.q59;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00152\u00020\u0001:\u0004\u0016\u0017\u0018\u0019B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0003\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lcom/anthropic/claude/login/LoginScreens;", "Lbga;", "<init>", "()V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self", "(Lcom/anthropic/claude/login/LoginScreens;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "Companion", "Welcome", "MagicLinkSent", "MinorBlocked", "nja", "Lcom/anthropic/claude/login/LoginScreens$MagicLinkSent;", "Lcom/anthropic/claude/login/LoginScreens$MinorBlocked;", "Lcom/anthropic/claude/login/LoginScreens$Welcome;", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public abstract class LoginScreens implements bga {
    public static final int $stable = 8;
    public static final nja Companion = new nja();
    private static final kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new q59(26));

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/login/LoginScreens$MinorBlocked;", "Lcom/anthropic/claude/login/LoginScreens;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "app", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class MinorBlocked extends LoginScreens {
        public static final int $stable = 0;
        public static final MinorBlocked INSTANCE = new MinorBlocked();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new mia(4));

        private MinorBlocked() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.login.LoginScreens.MinorBlocked", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof MinorBlocked);
        }

        public int hashCode() {
            return -1786335359;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "MinorBlocked";
        }
    }

    public /* synthetic */ LoginScreens(mq5 mq5Var) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _init_$_anonymous_() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.login.LoginScreens", kceVar.b(LoginScreens.class), new pl9[]{kceVar.b(MagicLinkSent.class), kceVar.b(MinorBlocked.class), kceVar.b(Welcome.class)}, new KSerializer[]{c.a, new lq6("com.anthropic.claude.login.LoginScreens.MinorBlocked", MinorBlocked.INSTANCE, new Annotation[0]), e.a}, new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(LoginScreens self, vd4 output, SerialDescriptor serialDesc) {
    }

    @Override // defpackage.bga
    public cc getActiveSurface() {
        return cc.Other;
    }

    private LoginScreens() {
    }

    public /* synthetic */ LoginScreens(int i, vnf vnfVar) {
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/login/LoginScreens$Welcome;", "Lcom/anthropic/claude/login/LoginScreens;", "Lcom/anthropic/claude/login/WelcomeNotice;", "notice", "<init>", "(Lcom/anthropic/claude/login/WelcomeNotice;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/login/WelcomeNotice;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$app", "(Lcom/anthropic/claude/login/LoginScreens$Welcome;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/login/WelcomeNotice;", "copy", "(Lcom/anthropic/claude/login/WelcomeNotice;)Lcom/anthropic/claude/login/LoginScreens$Welcome;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/login/WelcomeNotice;", "getNotice", "Companion", "com/anthropic/claude/login/e", "com/anthropic/claude/login/f", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Welcome extends LoginScreens {
        public static final int $stable = 0;
        private final WelcomeNotice notice;
        public static final f Companion = new f();
        private static final kw9[] $childSerializers = {yb5.w(w1a.F, new q59(27))};

        public /* synthetic */ Welcome(int i, WelcomeNotice welcomeNotice, vnf vnfVar) {
            super(i, vnfVar);
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

        public static /* synthetic */ Welcome copy$default(Welcome welcome, WelcomeNotice welcomeNotice, int i, Object obj) {
            if ((i & 1) != 0) {
                welcomeNotice = welcome.notice;
            }
            return welcome.copy(welcomeNotice);
        }

        public static final /* synthetic */ void write$Self$app(Welcome self, vd4 output, SerialDescriptor serialDesc) {
            LoginScreens.write$Self(self, output, serialDesc);
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

        public final Welcome copy(WelcomeNotice notice) {
            return new Welcome(notice);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Welcome) && this.notice == ((Welcome) other).notice;
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
            return "Welcome(notice=" + this.notice + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Welcome() {
            this((WelcomeNotice) null, 1, (mq5) (0 == true ? 1 : 0));
        }

        public Welcome(WelcomeNotice welcomeNotice) {
            super(null);
            this.notice = welcomeNotice;
        }

        public /* synthetic */ Welcome(WelcomeNotice welcomeNotice, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? null : welcomeNotice);
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/login/LoginScreens$MagicLinkSent;", "Lcom/anthropic/claude/login/LoginScreens;", "Lcom/anthropic/claude/login/MagicLinkSentConfig;", "sentConfig", "<init>", "(Lcom/anthropic/claude/login/MagicLinkSentConfig;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/login/MagicLinkSentConfig;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$app", "(Lcom/anthropic/claude/login/LoginScreens$MagicLinkSent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/login/MagicLinkSentConfig;", "copy", "(Lcom/anthropic/claude/login/MagicLinkSentConfig;)Lcom/anthropic/claude/login/LoginScreens$MagicLinkSent;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/login/MagicLinkSentConfig;", "getSentConfig", "Companion", "com/anthropic/claude/login/c", "com/anthropic/claude/login/d", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class MagicLinkSent extends LoginScreens {
        public static final int $stable = 0;
        public static final d Companion = new d();
        private final MagicLinkSentConfig sentConfig;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ MagicLinkSent(int i, MagicLinkSentConfig magicLinkSentConfig, vnf vnfVar) {
            super(i, vnfVar);
            if (1 != (i & 1)) {
                gvj.f(i, 1, c.a.getDescriptor());
                throw null;
            }
            this.sentConfig = magicLinkSentConfig;
        }

        public static /* synthetic */ MagicLinkSent copy$default(MagicLinkSent magicLinkSent, MagicLinkSentConfig magicLinkSentConfig, int i, Object obj) {
            if ((i & 1) != 0) {
                magicLinkSentConfig = magicLinkSent.sentConfig;
            }
            return magicLinkSent.copy(magicLinkSentConfig);
        }

        public static final /* synthetic */ void write$Self$app(MagicLinkSent self, vd4 output, SerialDescriptor serialDesc) {
            LoginScreens.write$Self(self, output, serialDesc);
            output.r(serialDesc, 0, moa.a, self.sentConfig);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final MagicLinkSentConfig getSentConfig() {
            return this.sentConfig;
        }

        public final MagicLinkSent copy(MagicLinkSentConfig sentConfig) {
            sentConfig.getClass();
            return new MagicLinkSent(sentConfig);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MagicLinkSent) && x44.r(this.sentConfig, ((MagicLinkSent) other).sentConfig);
        }

        public final MagicLinkSentConfig getSentConfig() {
            return this.sentConfig;
        }

        public int hashCode() {
            return this.sentConfig.hashCode();
        }

        public String toString() {
            return "MagicLinkSent(sentConfig=" + this.sentConfig + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MagicLinkSent(MagicLinkSentConfig magicLinkSentConfig) {
            super(null);
            magicLinkSentConfig.getClass();
            this.sentConfig = magicLinkSentConfig;
        }
    }
}
