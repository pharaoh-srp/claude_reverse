package kotlin.reflect.jvm.internal.impl.protobuf;

import defpackage.b3;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class InvalidProtocolBufferException extends IOException {
    public b3 E;

    public InvalidProtocolBufferException(String str) {
        super(str);
        this.E = null;
    }

    public static InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}
