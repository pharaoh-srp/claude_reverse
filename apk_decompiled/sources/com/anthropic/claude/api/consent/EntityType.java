package com.anthropic.claude.api.consent;

import defpackage.bq6;
import defpackage.fc6;
import defpackage.fq6;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/anthropic/claude/api/consent/EntityType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "bq6", "MCP_REMOTE_SERVER", "DESKTOP_EXTENSION", "DXT_VERSION", "LOCAL_TOOL", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class EntityType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ EntityType[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final bq6 Companion;
    public static final EntityType MCP_REMOTE_SERVER = new EntityType("MCP_REMOTE_SERVER", 0);
    public static final EntityType DESKTOP_EXTENSION = new EntityType("DESKTOP_EXTENSION", 1);
    public static final EntityType DXT_VERSION = new EntityType("DXT_VERSION", 2);
    public static final EntityType LOCAL_TOOL = new EntityType("LOCAL_TOOL", 3);

    private static final /* synthetic */ EntityType[] $values() {
        return new EntityType[]{MCP_REMOTE_SERVER, DESKTOP_EXTENSION, DXT_VERSION, LOCAL_TOOL};
    }

    static {
        EntityType[] entityTypeArr$values = $values();
        $VALUES = entityTypeArr$values;
        $ENTRIES = wd6.n0(entityTypeArr$values);
        Companion = new bq6();
        $cachedSerializer$delegate = yb5.w(w1a.F, new fc6(17));
    }

    private EntityType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.consent.EntityType", values(), new String[]{"mcp_remote_server", "desktop_extension", "dxt_version", "local_tool"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static EntityType valueOf(String str) {
        return (EntityType) Enum.valueOf(EntityType.class, str);
    }

    public static EntityType[] values() {
        return (EntityType[]) $VALUES.clone();
    }
}
