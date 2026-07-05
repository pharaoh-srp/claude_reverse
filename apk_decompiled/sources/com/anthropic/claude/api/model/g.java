package com.anthropic.claude.api.model;

import com.anthropic.claude.api.model.ThinkingState;
import defpackage.jce;
import defpackage.kce;
import defpackage.lq6;
import defpackage.nnf;
import defpackage.odf;
import defpackage.pl9;
import defpackage.w3c;
import defpackage.yeg;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final /* synthetic */ g a = new g();
    public static final nnf b;

    static {
        kotlinx.serialization.modules.a aVar = new kotlinx.serialization.modules.a();
        kce kceVar = jce.a;
        w3c w3cVar = new w3c(kceVar.b(ThinkingState.class));
        w3cVar.e(kceVar.b(ThinkingState.EffortAndMode.class), ThinkingState.EffortAndMode.Companion.serializer());
        w3cVar.e(kceVar.b(ThinkingState.Effort.class), ThinkingState.Effort.Companion.serializer());
        w3cVar.e(kceVar.b(ThinkingState.Mode.class), ThinkingState.Mode.Companion.serializer());
        w3cVar.e(kceVar.b(ThinkingState.Unknown.class), ThinkingState.Unknown.INSTANCE.serializer());
        w3cVar.b(new yeg(18));
        w3cVar.a(aVar);
        b = aVar.b();
    }

    public static ThinkingState a(String str, String str2) {
        if (str != null && str2 != null) {
            return new ThinkingState.EffortAndMode(str, str2, null);
        }
        if (str != null) {
            return new ThinkingState.Effort(str, null);
        }
        if (str2 != null) {
            return new ThinkingState.Mode(str2, null);
        }
        return null;
    }

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.api.model.ThinkingState", kceVar.b(ThinkingState.class), new pl9[]{kceVar.b(ThinkingState.Effort.class), kceVar.b(ThinkingState.EffortAndMode.class), kceVar.b(ThinkingState.Mode.class), kceVar.b(ThinkingState.Unknown.class)}, new KSerializer[]{h.a, k.a, m.a, new lq6("unknown", ThinkingState.Unknown.INSTANCE, new Annotation[]{new j()})}, new Annotation[]{new j()});
    }
}
