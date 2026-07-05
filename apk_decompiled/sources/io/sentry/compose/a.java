package io.sentry.compose;

import defpackage.dkf;
import defpackage.iqb;
import defpackage.sjf;
import io.sentry.a1;
import io.sentry.hints.j;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final Field a;
    public final Field b;

    public a(a1 a1Var) {
        this.a = j.a(a1Var, "androidx.compose.ui.platform.TestTagElement");
        this.b = j.a(a1Var, "io.sentry.compose.SentryModifier$SentryTagModifierNodeElement");
    }

    public final String a(iqb iqbVar) {
        Field field;
        Field field2;
        iqbVar.getClass();
        String name = iqbVar.getClass().getName();
        if ("androidx.compose.ui.platform.TestTagElement".equals(name) && (field2 = this.a) != null) {
            return (String) field2.get(iqbVar);
        }
        if ("io.sentry.compose.SentryModifier$SentryTagModifierNodeElement".equals(name) && (field = this.b) != null) {
            return (String) field.get(iqbVar);
        }
        if (!(iqbVar instanceof sjf)) {
            return null;
        }
        for (Map.Entry entry : ((sjf) iqbVar).getSemanticsConfiguration()) {
            dkf dkfVar = (dkf) entry.getKey();
            Object value = entry.getValue();
            String str = dkfVar.a;
            if ("SentryTag".equals(str) || "TestTag".equals(str)) {
                if (value instanceof String) {
                    return (String) value;
                }
            }
        }
        return null;
    }
}
