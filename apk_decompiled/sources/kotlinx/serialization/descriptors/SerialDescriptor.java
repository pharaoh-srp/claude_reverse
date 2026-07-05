package kotlinx.serialization.descriptors;

import defpackage.lm6;
import defpackage.u00;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface SerialDescriptor {
    String a();

    default boolean c() {
        return false;
    }

    int d(String str);

    int e();

    String f(int i);

    List g(int i);

    default List getAnnotations() {
        return lm6.E;
    }

    u00 getKind();

    SerialDescriptor h(int i);

    boolean i(int i);

    default boolean isInline() {
        return false;
    }
}
