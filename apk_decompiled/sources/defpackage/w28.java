package defpackage;

import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public interface w28 extends KSerializer {
    KSerializer[] childSerializers();

    default KSerializer[] typeParametersSerializers() {
        return eve.g;
    }
}
