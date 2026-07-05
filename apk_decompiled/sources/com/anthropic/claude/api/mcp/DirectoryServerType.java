package com.anthropic.claude.api.mcp;

import defpackage.fq6;
import defpackage.h85;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.o56;
import defpackage.onf;
import defpackage.oq5;
import defpackage.p56;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/anthropic/claude/api/mcp/DirectoryServerType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "o56", "REMOTE", "LOCAL", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = p56.class)
public final class DirectoryServerType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ DirectoryServerType[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final o56 Companion;
    public static final DirectoryServerType REMOTE = new DirectoryServerType("REMOTE", 0);
    public static final DirectoryServerType LOCAL = new DirectoryServerType("LOCAL", 1);

    private static final /* synthetic */ DirectoryServerType[] $values() {
        return new DirectoryServerType[]{REMOTE, LOCAL};
    }

    static {
        DirectoryServerType[] directoryServerTypeArr$values = $values();
        $VALUES = directoryServerTypeArr$values;
        $ENTRIES = wd6.n0(directoryServerTypeArr$values);
        Companion = new o56();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new h85(23));
    }

    private DirectoryServerType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.mcp.DirectoryServerType", values(), new String[]{"remote", "local"}, new Annotation[][]{null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static DirectoryServerType valueOf(String str) {
        return (DirectoryServerType) Enum.valueOf(DirectoryServerType.class, str);
    }

    public static DirectoryServerType[] values() {
        return (DirectoryServerType[]) $VALUES.clone();
    }
}
