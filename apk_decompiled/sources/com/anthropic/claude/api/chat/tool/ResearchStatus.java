package com.anthropic.claude.api.chat.tool;

import defpackage.afe;
import defpackage.bme;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.tle;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/anthropic/claude/api/chat/tool/ResearchStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "tle", "UNKNOWN", "STARTING", "PLANNING", "SEARCHING", "INITIATING_AGENTS", "CREATING_ARTIFACT", "COMPLETED", "CANCELLED", "TIMED_OUT", "FAILED", "CLIENT_TIMEOUT", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = bme.class)
public final class ResearchStatus {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ResearchStatus[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final tle Companion;
    public static final ResearchStatus UNKNOWN = new ResearchStatus("UNKNOWN", 0);
    public static final ResearchStatus STARTING = new ResearchStatus("STARTING", 1);
    public static final ResearchStatus PLANNING = new ResearchStatus("PLANNING", 2);
    public static final ResearchStatus SEARCHING = new ResearchStatus("SEARCHING", 3);
    public static final ResearchStatus INITIATING_AGENTS = new ResearchStatus("INITIATING_AGENTS", 4);
    public static final ResearchStatus CREATING_ARTIFACT = new ResearchStatus("CREATING_ARTIFACT", 5);
    public static final ResearchStatus COMPLETED = new ResearchStatus("COMPLETED", 6);
    public static final ResearchStatus CANCELLED = new ResearchStatus("CANCELLED", 7);
    public static final ResearchStatus TIMED_OUT = new ResearchStatus("TIMED_OUT", 8);
    public static final ResearchStatus FAILED = new ResearchStatus("FAILED", 9);
    public static final ResearchStatus CLIENT_TIMEOUT = new ResearchStatus("CLIENT_TIMEOUT", 10);

    private static final /* synthetic */ ResearchStatus[] $values() {
        return new ResearchStatus[]{UNKNOWN, STARTING, PLANNING, SEARCHING, INITIATING_AGENTS, CREATING_ARTIFACT, COMPLETED, CANCELLED, TIMED_OUT, FAILED, CLIENT_TIMEOUT};
    }

    static {
        ResearchStatus[] researchStatusArr$values = $values();
        $VALUES = researchStatusArr$values;
        $ENTRIES = wd6.n0(researchStatusArr$values);
        Companion = new tle();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new afe(5));
    }

    private ResearchStatus(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.chat.tool.ResearchStatus", values(), new String[]{"unknown", "starting", "planning", "searching", "initiating_agents", "creating_artifact", "completed", "cancelled", "timed_out", "failed", "client_timeout"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ResearchStatus valueOf(String str) {
        return (ResearchStatus) Enum.valueOf(ResearchStatus.class, str);
    }

    public static ResearchStatus[] values() {
        return (ResearchStatus[]) $VALUES.clone();
    }
}
