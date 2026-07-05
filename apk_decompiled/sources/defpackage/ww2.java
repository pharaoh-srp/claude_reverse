package defpackage;

import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public interface ww2 {
    boolean a();

    UUID j();

    default String k() {
        String string = j().toString();
        string.getClass();
        return string;
    }
}
