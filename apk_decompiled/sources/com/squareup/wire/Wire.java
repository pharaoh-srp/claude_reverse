package com.squareup.wire;

import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0006\u001a#\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\b\u0010\u0002\u001a\u0004\u0018\u0001H\u00012\u0006\u0010\u0003\u001a\u0002H\u0001¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"get", "T", ExperienceToggle.DEFAULT_PARAM_KEY, "defaultValue", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "wire-runtime"}, k = 2, mv = {2, 0, 0}, xi = mdj.f)
public final class Wire {
    public static final <T> T get(T t, T t2) {
        return t == null ? t2 : t;
    }
}
