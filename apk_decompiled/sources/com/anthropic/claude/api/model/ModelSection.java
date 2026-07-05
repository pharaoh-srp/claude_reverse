package com.anthropic.claude.api.model;

import defpackage.fq6;
import defpackage.job;
import defpackage.kob;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.rpa;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/anthropic/claude/api/model/ModelSection;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "job", "MAIN", "OVERFLOW", "DEPRECATED", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = kob.class)
public final class ModelSection {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ModelSection[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final job Companion;
    public static final ModelSection MAIN = new ModelSection("MAIN", 0);
    public static final ModelSection OVERFLOW = new ModelSection("OVERFLOW", 1);
    public static final ModelSection DEPRECATED = new ModelSection("DEPRECATED", 2);

    private static final /* synthetic */ ModelSection[] $values() {
        return new ModelSection[]{MAIN, OVERFLOW, DEPRECATED};
    }

    static {
        ModelSection[] modelSectionArr$values = $values();
        $VALUES = modelSectionArr$values;
        $ENTRIES = wd6.n0(modelSectionArr$values);
        Companion = new job();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new rpa(25));
    }

    private ModelSection(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.model.ModelSection", values(), new String[]{"main", "overflow", "deprecated"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ModelSection valueOf(String str) {
        return (ModelSection) Enum.valueOf(ModelSection.class, str);
    }

    public static ModelSection[] values() {
        return (ModelSection[]) $VALUES.clone();
    }
}
