package com.anthropic.claude.sessions.types;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.l84;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.qh4;
import defpackage.rh4;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/anthropic/claude/sessions/types/ConnectionStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "qh4", "UNKNOWN", "CONNECTED", "DISCONNECTED", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = rh4.class)
public final class ConnectionStatus {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ConnectionStatus[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final qh4 Companion;
    public static final ConnectionStatus UNKNOWN = new ConnectionStatus("UNKNOWN", 0);
    public static final ConnectionStatus CONNECTED = new ConnectionStatus("CONNECTED", 1);
    public static final ConnectionStatus DISCONNECTED = new ConnectionStatus("DISCONNECTED", 2);

    private static final /* synthetic */ ConnectionStatus[] $values() {
        return new ConnectionStatus[]{UNKNOWN, CONNECTED, DISCONNECTED};
    }

    static {
        ConnectionStatus[] connectionStatusArr$values = $values();
        $VALUES = connectionStatusArr$values;
        $ENTRIES = wd6.n0(connectionStatusArr$values);
        Companion = new qh4();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new l84(11));
    }

    private ConnectionStatus(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.sessions.types.ConnectionStatus", values(), new String[]{"unknown", "connected", "disconnected"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ConnectionStatus valueOf(String str) {
        return (ConnectionStatus) Enum.valueOf(ConnectionStatus.class, str);
    }

    public static ConnectionStatus[] values() {
        return (ConnectionStatus[]) $VALUES.clone();
    }
}
