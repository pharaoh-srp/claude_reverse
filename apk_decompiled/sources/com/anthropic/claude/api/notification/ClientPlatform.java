package com.anthropic.claude.api.notification;

import defpackage.ep3;
import defpackage.fq6;
import defpackage.gi3;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/anthropic/claude/api/notification/ClientPlatform;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "ep3", "ANDROID", "IOS", "WEB", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ClientPlatform {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ClientPlatform[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final ep3 Companion;
    public static final ClientPlatform ANDROID = new ClientPlatform("ANDROID", 0);
    public static final ClientPlatform IOS = new ClientPlatform("IOS", 1);
    public static final ClientPlatform WEB = new ClientPlatform("WEB", 2);

    private static final /* synthetic */ ClientPlatform[] $values() {
        return new ClientPlatform[]{ANDROID, IOS, WEB};
    }

    static {
        ClientPlatform[] clientPlatformArr$values = $values();
        $VALUES = clientPlatformArr$values;
        $ENTRIES = wd6.n0(clientPlatformArr$values);
        Companion = new ep3();
        $cachedSerializer$delegate = yb5.w(w1a.F, new gi3(8));
    }

    private ClientPlatform(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.notification.ClientPlatform", values(), new String[]{"android", "ios", "web"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ClientPlatform valueOf(String str) {
        return (ClientPlatform) Enum.valueOf(ClientPlatform.class, str);
    }

    public static ClientPlatform[] values() {
        return (ClientPlatform[]) $VALUES.clone();
    }
}
