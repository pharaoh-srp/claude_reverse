package defpackage;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public interface j4f extends i7j {
    default void Z(t4f t4fVar, LinkedHashSet linkedHashSet) {
        if (q7j.a("WEB_MESSAGE_LISTENER")) {
            j7j.a(t4fVar, getName(), linkedHashSet, this);
        }
    }

    String getName();
}
