package com.anthropic.claude.api.account;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.poi;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import defpackage.yyi;
import defpackage.zyi;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/anthropic/claude/api/account/VillageWeaverConsentState;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "yyi", "DECLINED", "PER_SESSION", "ACCEPTED", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = zyi.class)
public final class VillageWeaverConsentState {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ VillageWeaverConsentState[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final yyi Companion;
    public static final VillageWeaverConsentState DECLINED = new VillageWeaverConsentState("DECLINED", 0);
    public static final VillageWeaverConsentState PER_SESSION = new VillageWeaverConsentState("PER_SESSION", 1);
    public static final VillageWeaverConsentState ACCEPTED = new VillageWeaverConsentState("ACCEPTED", 2);
    public static final VillageWeaverConsentState UNKNOWN = new VillageWeaverConsentState("UNKNOWN", 3);

    private static final /* synthetic */ VillageWeaverConsentState[] $values() {
        return new VillageWeaverConsentState[]{DECLINED, PER_SESSION, ACCEPTED, UNKNOWN};
    }

    static {
        VillageWeaverConsentState[] villageWeaverConsentStateArr$values = $values();
        $VALUES = villageWeaverConsentStateArr$values;
        $ENTRIES = wd6.n0(villageWeaverConsentStateArr$values);
        Companion = new yyi();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new poi(1));
    }

    private VillageWeaverConsentState(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.account.VillageWeaverConsentState", values(), new String[]{"declined", "per_session", "accepted", "unknown"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static VillageWeaverConsentState valueOf(String str) {
        return (VillageWeaverConsentState) Enum.valueOf(VillageWeaverConsentState.class, str);
    }

    public static VillageWeaverConsentState[] values() {
        return (VillageWeaverConsentState[]) $VALUES.clone();
    }
}
