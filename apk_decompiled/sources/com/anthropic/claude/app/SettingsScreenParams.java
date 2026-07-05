package com.anthropic.claude.app;

import com.anthropic.claude.settings.SettingsAppScreen;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nzf;
import defpackage.onf;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import defpackage.ztf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001a¨\u0006-"}, d2 = {"Lcom/anthropic/claude/app/SettingsScreenParams;", "", "", "Lcom/anthropic/claude/settings/SettingsAppScreen;", "initialScreens", "", "deepLinkNonce", "<init>", "(Ljava/util/List;J)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;JLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$app", "(Lcom/anthropic/claude/app/SettingsScreenParams;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()J", "copy", "(Ljava/util/List;J)Lcom/anthropic/claude/app/SettingsScreenParams;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getInitialScreens", "J", "getDeepLinkNonce", "Companion", "mzf", "nzf", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SettingsScreenParams {
    public static final int $stable = 0;
    private final long deepLinkNonce;
    private final List<SettingsAppScreen> initialScreens;
    public static final nzf Companion = new nzf();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new ztf(24)), null};

    public /* synthetic */ SettingsScreenParams(int i, List list, long j, vnf vnfVar) {
        if ((i & 1) == 0) {
            list = x44.W(new SettingsAppScreen.SettingsScreen(false, 1, (mq5) null));
        }
        this.initialScreens = list;
        if ((i & 2) == 0) {
            this.deepLinkNonce = 0L;
        } else {
            this.deepLinkNonce = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(SettingsAppScreen.Companion.serializer(), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SettingsScreenParams copy$default(SettingsScreenParams settingsScreenParams, List list, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            list = settingsScreenParams.initialScreens;
        }
        if ((i & 2) != 0) {
            j = settingsScreenParams.deepLinkNonce;
        }
        return settingsScreenParams.copy(list, j);
    }

    public static final /* synthetic */ void write$Self$app(SettingsScreenParams self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        int i = 1;
        boolean z = false;
        if (output.E(serialDesc) || !x44.r(self.initialScreens, x44.W(new SettingsAppScreen.SettingsScreen(z, i, (mq5) null)))) {
            output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.initialScreens);
        }
        if (!output.E(serialDesc) && self.deepLinkNonce == 0) {
            return;
        }
        output.D(serialDesc, 1, self.deepLinkNonce);
    }

    public final List<SettingsAppScreen> component1() {
        return this.initialScreens;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getDeepLinkNonce() {
        return this.deepLinkNonce;
    }

    public final SettingsScreenParams copy(List<? extends SettingsAppScreen> initialScreens, long deepLinkNonce) {
        initialScreens.getClass();
        return new SettingsScreenParams(initialScreens, deepLinkNonce);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SettingsScreenParams)) {
            return false;
        }
        SettingsScreenParams settingsScreenParams = (SettingsScreenParams) other;
        return x44.r(this.initialScreens, settingsScreenParams.initialScreens) && this.deepLinkNonce == settingsScreenParams.deepLinkNonce;
    }

    public final long getDeepLinkNonce() {
        return this.deepLinkNonce;
    }

    public final List<SettingsAppScreen> getInitialScreens() {
        return this.initialScreens;
    }

    public int hashCode() {
        return Long.hashCode(this.deepLinkNonce) + (this.initialScreens.hashCode() * 31);
    }

    public String toString() {
        return "SettingsScreenParams(initialScreens=" + this.initialScreens + ", deepLinkNonce=" + this.deepLinkNonce + ")";
    }

    public SettingsScreenParams() {
        this((List) null, 0L, 3, (mq5) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SettingsScreenParams(List<? extends SettingsAppScreen> list, long j) {
        list.getClass();
        this.initialScreens = list;
        this.deepLinkNonce = j;
    }

    public /* synthetic */ SettingsScreenParams(List list, long j, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? x44.W(new SettingsAppScreen.SettingsScreen(false, 1, (mq5) null)) : list, (i & 2) != 0 ? 0L : j);
    }
}
